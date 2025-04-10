package Pages;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.regex.Pattern;

public class BaseUtil {
    protected SHAFT.GUI.WebDriver driver;
    public BaseUtil(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    By tableRows;
    List<WebElement> rows;
    By byTableData = By.tagName("td");
    String tableID;
    By nextBtn;
    List<WebElement> pagesLink;
    public static boolean identicalData;
     public String actualResult;
    public String ExpectedSearch;
    By pagination = By.cssSelector(".page-link");
     By tableOfResults = By.tagName("table");
     By lastPage = By.xpath("//a[normalize-space()='Last']");
    By BranchName = By.id("branchListValue");
    int numberOfPages;
    public void checkTimeInTable(int colNumber, String data) {
        WebDriverWait wait = new WebDriverWait(driver.getDriver(), Duration.ofSeconds(10));
        getTableId();
        identicalData = false;
        getPages();
        int pagesIndex = 1;
        getNumberOfPages();
        while (pagesIndex < numberOfPages || !identicalData) {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(tableRows));
            rows = driver.getDriver().findElements(tableRows);
            int index = 1;
            while (!rows.isEmpty() && index < rows.size() && !identicalData) {
                WebElement row = rows.get(index);
                List<WebElement> cols = row.findElements(byTableData);
                String timeInTable = cols.get(colNumber).getText();
                String[] timeParts = timeInTable.split(":");
                String firstTwoEntries = timeParts[0] + ":" + timeParts[1];
                if (firstTwoEntries.equals(data)) {
                    identicalData = true;
                } else {
                    identicalData = false;
                }
                index++;
            }
            driver.element().click(nextBtn);
//            if(driver.browser().getCurrentURL().contains("odeysysadmin/Admin/searchAgentLoginData")){
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(tableRows));
//            }
            pagesIndex++;
        }
    }

    private void getPages() {
        pagesLink = driver.getDriver().findElements(pagination);
        //statement report
        if(pagesLink.size() ==0){
            if(driver.getDriver().findElements(By.cssSelector(".paginate_button")).size()!=0 && driver.browser().getCurrentURL().contains("/odeysysportal/dashboard")){
                pagesLink = driver.getDriver().findElements(By.cssSelector(".paginate_button"));
                pagesLink.remove(0);
                pagesLink.remove(pagesLink.size() - 1);
                nextBtn = By.id(tableID+"_next");
            }
            //quotation report
            else if(driver.getDriver().findElements(By.cssSelector(".pagination>li")).size()!=0){
                pagesLink = driver.getDriver().findElements(By.cssSelector(".pagination>li"));

                pagesLink.remove(0);
                pagesLink.remove(pagesLink.size() - 1);
                nextBtn = By.xpath("//a[contains(text(),'Next')]");

            }
        }
        else {
            pagesLink.remove(0);
            pagesLink.remove(0);
            pagesLink.remove(pagesLink.size() - 1);
            pagesLink.remove(pagesLink.size() - 1);
            pagesLink.remove(pagesLink.size() - 1);
            nextBtn = By.xpath("//a[@aria-label='Next']");
        }
    }
    private void getNumberOfPages(){
        String onclickValue = driver.element().getAttribute(lastPage,"onclick");
        if(onclickValue != null){
            numberOfPages = Integer.parseInt(onclickValue.split("\\(")[1].split("\\)")[0]);
        }
}
    private void getTableId() {
        if(driver.browser().getCurrentURL().contains("odeysysadmin/Admin/searchAgentLoginData")){
            WebDriverWait wait = new WebDriverWait(driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(tableOfResults));
        }
        List<WebElement> tables = driver.getDriver().findElements(tableOfResults);
        int index = 0;
        while (index < tables.size()){
            if(!tables.get(index).getAttribute("id").equals("")){
                tableID = tables.get(index).getAttribute("id");
            }
            index++;
        }
        tableRows = By.cssSelector("#" + tableID + "> * > tr");
    }
    public void checkDataInTable(int colNumber, String data) {
        WebDriverWait wait = new WebDriverWait(driver.getDriver(), Duration.ofSeconds(20));
        getTableId();
        identicalData = true;
        getPages();
        int pagesIndex = pagesLink.size();
        while (pagesIndex > 0 && identicalData) {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(tableRows));
            rows = driver.getDriver().findElements(tableRows);
            int index = 1;
            while (!rows.isEmpty() && index < rows.size() && identicalData) {
                WebElement row = rows.get(index);
                List<WebElement> cols = row.findElements(byTableData);
                if (cols.get(colNumber).getText().toLowerCase().equals(data.toLowerCase())) {
                    identicalData = true;
                } else {
                    identicalData = false;
                }
                index++;
            }

            if (driver.browser().getCurrentURL().contains("odeysysadmin/MyBooking/myBookingSearchResult")) {
                wait.until(ExpectedConditions.textMatches(BranchName, Pattern.compile("^Selected")));
            }
            driver.element().click(nextBtn);
            pagesIndex--;


        }

//        public String TableColumnDataExtractor( int ColumnSearch,String ExpectedSearch){
//            WebElement table = driver.getDriver().findElement(By.xpath("//div[@class=\"Air_table\"]")); // Adjust the XPath to match your table
//
//            // Locate all the rows in the table
//            List<WebElement> rows = table.findElements(By.tagName("tr"));
//
//            String actualResult = ExpectedSearch;
//            // Loop through each row and get the text from the specific column (e.g., second column)
//            for (WebElement row : rows) {
//                // Locate the cells in the current row
//                List<WebElement> cells = row.findElements(By.tagName("td"));
//
//                // Check if the row has enough cells (to avoid IndexOutOfBoundsException)
//                if (cells.size() > ColumnSearch) {
//                    // Get text from the second column (index 1)
//
//                    String columnText = cells.get(ColumnSearch).getText();
//
//
//                    if (!columnText.equals(actualResult)) {
//                        actualResult = null;
//                        break;
//                    }
//                }
//                // i will add  assertEquals(ExpectedSearch, columnText);
//
//            }
//            return actualResult;
//








    }
}
