package MileStoneTwo.BookingMidOffice;

import Pages.Fareconfirm;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;


public class SearchBookingBranch {
    public SearchBookingBranch(SHAFT.GUI.WebDriver driver) {
        super();
        this.driver = driver;
    }

    SHAFT.GUI.WebDriver driver;
    By BookingMidOffice = By.xpath("//a[@class='mid-office-1'and contains(text(),'Booking-Mid Office')]");
    By Booking = By.xpath("//li[@id='Booking']");
    By BranchList = By.xpath("//select[@id='branchListId']");

    By StartingFrom = By.xpath("//input[@id='startingFrom_1']");
    By GoingTo = By.xpath("//input[@id='goingTo_1']");

    By StartingroundFrom = By.xpath("//input[@id='startingFrom_2']");
    By GoingroundTo = By.xpath("//input[@id='goingTo_2']");


    By StartingmultiFrom = By.xpath("//input[@id='startingFrom_4']");
    By GoingmultiTo = By.xpath("//input[@id='goingTo_4']");
    By GoingmultiToo = By.xpath("//input[@id='goingTo_5']");
    By DataPicker = By.id("datePicker_1");
    By roundDataPicker = By.id("dateofjourney_1");
    By multiiDataPicker = By.id("dateOfJourney_3");
    By multiDataPicker = By.id("dateOfJourney_4");

    By noOfAdults = By.id("noOfAdults");

    By noOfAdultsround = By.id("noOfAdultsr");


    By noOfAdultsmulti = By.id("noOfAdultsm");


    By SearchButton = By.xpath("(//input[@value='SEARCH'])[1]");
    By SearchroundButton = By.xpath("//input[@data-ng-disabled='!rbdRoundValid']");
    By SearchmultiButton = By.xpath("//input[@data-ng-disabled='!rbdMultiValid']");

    By Totalfare= By.xpath("//*[@id=\"one-way\"]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div/strong");
    By WhiteMarkup = By.xpath("//a[@class='markup_btn']");
    By DiscountLabel = By.xpath("(//p[contains(text(),'Save EGP ')])[1]");
    By ServiceChargeLabel = By.xpath("(//p[contains(text(),'EGP ')])[2]");
    By CancelChargeLabel = By.xpath("(//p[contains(text(),'EGP ')])[2]");
    By ServiceChargeOnFareDetails = By.xpath("(//strong[text()='Service Charge']/following-sibling::span[@data-currency='EGP'])[1]");
    By FareDetails = By.xpath("//li[@id='fare_0_0']");
    By book=By.xpath("//*[@id=\"one-way\"]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/a");
    By roundbook=By.xpath("//*[@id=\"round-trip\"]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/a");
    By multibook=By.xpath("//*[@id=\"round-trip\"]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div/div/a");

    public SearchBookingBranch ClickOnBookingMidOffice() {
        driver.element().click(BookingMidOffice);
        return new SearchBookingBranch(driver);
    }

    public SearchBookingBranch ClickOnBooking() {
        driver.element().click(Booking);
        return new SearchBookingBranch(driver);
    }

    public SearchBookingBranch SelectBranch(String Branch) {
        driver.element().select(BranchList, Branch);
        return new SearchBookingBranch(driver);
    }

    public SearchBookingBranch Selectroundjourneytype(){
        driver.element().click(By.xpath("//*[@id=\"flight-landing-wrap\"]/div/div/div/div[2]/div/div[1]/ul/li[2]"));
        return new SearchBookingBranch(driver);
    }
    public SearchBookingBranch Selectmultijourneytype(){
        driver.element().click(By.xpath("//*[@id=\"flight-landing-wrap\"]/div/div/div/div[2]/div/div[1]/ul/li[3]"));
        return new SearchBookingBranch(driver);
    }
    public SearchBookingBranch AddStartingFrom(String Place) {
//        driver.element().click(StartingFrom);
//        driver.element().type(StartingFrom, Place).select(StartingFrom, Place);
        driver.element().click(StartingFrom);
        By source = By.xpath("//div[contains(@title,'"+Place+" -')]");
        driver.element().type(StartingFrom, Place).waitUntilPresenceOfAllElementsLocatedBy(source).keyPress(StartingFrom, Keys.ENTER);
        return new SearchBookingBranch(driver);
    }
    public SearchBookingBranch AddroundStartingFrom(String Place) {
//        driver.element().click(StartingFrom);
//        driver.element().type(StartingFrom, Place).select(StartingFrom, Place);
        driver.element().click(StartingroundFrom);
        By source = By.xpath("//div[contains(@title,'"+Place+" -')]");
        driver.element().type(StartingroundFrom, Place).waitUntilPresenceOfAllElementsLocatedBy(source).keyPress(StartingroundFrom, Keys.ENTER);
        return new SearchBookingBranch(driver);
    }

    public SearchBookingBranch AddGoingTo(String Place) throws InterruptedException {
        driver.element().click(GoingTo);
        driver.element().type(GoingTo, Place);
      Thread.sleep(300);
        driver.element().keyPress(GoingTo,Keys.ENTER);
        return new SearchBookingBranch(driver);
    }
    public SearchBookingBranch AddroundGoingTo(String Place) throws InterruptedException {
        driver.element().click(GoingroundTo);
        driver.element().type(GoingroundTo, Place);
        Thread.sleep(300);
        driver.element().keyPress(GoingroundTo,Keys.ENTER);
        return new SearchBookingBranch(driver);
    }

    public SearchBookingBranch SelectDateOfJourney(String Months, String Year, int Day) {
        driver.element().click(DataPicker);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-year']"), Year);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-month']"), Months);
        driver.element().click(By.xpath("//a[contains(@class, 'ui-state-default') and text()='" + Day + "']"));

        return new SearchBookingBranch(driver);
    }
    public SearchBookingBranch SelectroundDateOfJourney(String Months, String Year, int Day) {
        driver.element().click(roundDataPicker);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-year']"), Year);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-month']"), Months);
        driver.element().click(By.xpath("//a[contains(@class, 'ui-state-default') and text()='" + Day + "']"));

        return new SearchBookingBranch(driver);
    }

    public SearchBookingBranch AddmultiStartingFrom(String Place) {
//        driver.element().click(StartingFrom);
//        driver.element().type(StartingFrom, Place).select(StartingFrom, Place);
        driver.element().click(StartingmultiFrom);
        By source = By.xpath("//div[contains(@title,'"+Place+" -')]");
        driver.element().type(StartingmultiFrom, Place).waitUntilPresenceOfAllElementsLocatedBy(source).keyPress(StartingmultiFrom, Keys.ENTER);
        return new SearchBookingBranch(driver);
    }

    public SearchBookingBranch AddmultiGoingTo(String Place) throws InterruptedException {
        driver.element().click(GoingmultiTo);
        driver.element().type(GoingmultiTo, Place);
        Thread.sleep(300);
        driver.element().keyPress(GoingmultiTo,Keys.ENTER);
        return new SearchBookingBranch(driver);

    }
    public SearchBookingBranch AddmultiGoingToo(String Place) throws InterruptedException {
        driver.element().click(GoingmultiToo);
        driver.element().type(GoingmultiToo, Place);
        Thread.sleep(300);
        driver.element().keyPress(GoingmultiToo,Keys.ENTER);
        return new SearchBookingBranch(driver);

    }


    public SearchBookingBranch SelectmultiDateOfJourney(String Months, String Year, int Day) {
        driver.element().click(multiDataPicker);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-year']"), Year);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-month']"), Months);
        driver.element().click(By.xpath("//a[contains(@class, 'ui-state-default') and text()='" + Day + "']"));
        driver.element().click(multiiDataPicker);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-year']"), Year);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-month']"), Months);
        driver.element().click(By.xpath("//a[contains(@class, 'ui-state-default') and text()='" + Day + "']"));

        return new SearchBookingBranch(driver);
    }

    public SearchBookingBranch SelectNumberOfAdult(int Number) {
        driver.element().select(noOfAdults, String.valueOf(Number));
        return new SearchBookingBranch(driver);
    }





    public SearchBookingBranch SelectNumberOfAdultround(int Number) {
        driver.element().select(noOfAdultsround, String.valueOf(Number));
        return new SearchBookingBranch(driver);
    }




    public SearchBookingBranch SelectNumberOfAdultmulti(int Number) {
        driver.element().select(noOfAdultsmulti, String.valueOf(Number));
        return new SearchBookingBranch(driver);
    }



    public SearchBookingBranch clickOnSearchButton() {
        driver.element().click(SearchButton);
        return new SearchBookingBranch(driver);
    }
    public SearchBookingBranch clickOnSearchroundButton() {
        driver.element().click(SearchroundButton);
        return new SearchBookingBranch(driver);
    }
    public SearchBookingBranch clickOnSearchmultiButton() {
        driver.element().click(SearchmultiButton);
        return new SearchBookingBranch(driver);
    }
    public Fareconfirm clickonBookbutton(){
        driver.element().click(book);
        return new Fareconfirm(driver);
    }
    public Fareconfirm clickonroundBookbutton(){
        driver.element().click(roundbook);
        return new Fareconfirm(driver);
    }
    public Fareconfirm clickonmultiBookbutton(){
        driver.element().click(multibook);
        return new Fareconfirm(driver);
    }


    public SearchBookingBranch clickOnWhiteMarkupButton() {
        driver.element().click(WhiteMarkup);
        return new SearchBookingBranch(driver);
    }

    public SearchBookingBranch ValidateTheDiscountIsApplied(int DiscountAdded) {
        String Discount = driver.getDriver().findElement(DiscountLabel).getText();
        String processedText = Discount.replace("Save EGP ", "").replace(".00", "");

        Assert.assertEquals(processedText, String.valueOf(DiscountAdded));
        return new SearchBookingBranch(driver);
    }
    public SearchBookingBranch ValidateTheServiceChargeIsApplied(int ServiceCharge) {
        String Service = driver.getDriver().findElement(ServiceChargeLabel).getText();
        String processedText = Service.replace("EGP ", "").replace(".00", "");
        Assert.assertEquals(processedText, String.valueOf(ServiceCharge));
        driver.element().click(FareDetails);
        String ServiceOnFareDetails = driver.getDriver().findElement(ServiceChargeOnFareDetails).getText();
        String ServiceOnFareDetailsProcessedText = ServiceOnFareDetails.replace(".00", "");
        Assert.assertEquals(ServiceOnFareDetailsProcessedText, String.valueOf(ServiceCharge));



        return new SearchBookingBranch(driver);
    }
    public SearchBookingBranch ValidateTheCancellationChargeIsApplied(int CancelCharge) {
        String Discount = driver.getDriver().findElement(CancelChargeLabel).getText();
        String processedText = Discount.replace("EGP", "").replace(".0", "");
        Assert.assertEquals(processedText, String.valueOf(CancelCharge));

        return new SearchBookingBranch(driver);
    }




    public void waitForTime(int seconds) {
        // Create a FluentWait object with a timeout and polling interval
        FluentWait<SHAFT.GUI.WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(seconds)) // Maximum wait time
                .pollingEvery(Duration.ofMillis(500))    // Polling interval
                .ignoring(Exception.class);             // Ignore exceptions

        // Use a dummy condition (always true)
        wait.until(driver -> {
            return true; // This condition always resolves to true
        });


    }

}
