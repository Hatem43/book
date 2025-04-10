package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DashBoardModulePage extends BasePage {
    public DashBoardModulePage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    By Country = By.id("countryList");
//    By branch = By.id("branchList");
//    By Bookingfrom = By.id("dp1550047732422");

    //    By BookingDateto = By.id("dp1550047732423");
    By countryMalaysia = By.xpath("//*[@id=\"countryIDk0\"]");
    By countrySaudia = By.id("countryIDk1");
    By allbranch = By.xpath("//*[@id=\"branchIDChk\"]");
    By allanwarbranch = By.id("branchIDChk0");
    By alexBranch = By.id("branchIDChk1");
    //    By Search = By.xpath("//*[@id=\"content_wrap\"]/div/div[1]/div[4]/div/input");
    public By FLIGHTS = By.xpath("//*[@id=\"productView\"]/div/div[1]/div/div[1]/div[1]/div/div[1]");
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate dobf = LocalDate.now().minusMonths(3);
    LocalDate dobt = LocalDate.now().minusDays(3);


    public void DashBoard() throws InterruptedException {
        driver.element().click(Country)
                .click(countryMalaysia)
                .click(countrySaudia)
                .click(Branch)
                .click(allbranch)
                .click(allanwarbranch)
                .click(alexBranch)
                .click(BookingFromDate)
                .type(BookingFromDate, dobf.format(myFormatObj))
                .click(bookingToDate)
                .type(bookingToDate, dobt.format(myFormatObj))
                .click(SearchButton);
        Thread.sleep(3000);
        driver.element().click(FLIGHTS);
    }

    // safy adds //
    By egypt = By.id("countryIDk11");
    By Branch = By.id("branchList");
//    By alexBranch = By.xpath("//*[@id=\"branchIDChk1\"]");

    By BookingFromDate = By.id("dp1550047732422");
    By bookingToDate = By.id("dp1550047732423");
    By SearchButton = By.xpath("//*[@id=\"content_wrap\"]/div/div[1]/div[4]/div/input");
    By prevButton = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/a[1]");
    By TicketedDocument = By.xpath("//*[@id=\"activ_0_2\"]/a/p");
    LocalDate today = LocalDate.now();

    public void searchOnDashBoardPage() throws InterruptedException {
        driver.element().click(Country);
        Thread.sleep(1000);
        driver.element().click(egypt);
        Thread.sleep(1000);
        driver.element().click(Branch);
        Thread.sleep(1000);
        driver.element().click(alexBranch);
        Thread.sleep(1000);
        driver.element().type(BookingFromDate, today.minusDays(15).format(myFormatObj))
                .type(bookingToDate, today.format(myFormatObj));
        Thread.sleep(1000);
        driver.element().click(SearchButton);
    }

}
