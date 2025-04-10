package MileStoneTwo.Portal;

import Pages.Fareconfirm;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;


public class SearchBookingAgency {
    public SearchBookingAgency(SHAFT.GUI.WebDriver driver) {
        super();
        this.driver = driver;
    }

    SHAFT.GUI.WebDriver driver;
    By StartingFrom = By.xpath("//input[@id='startingFrom_1']");
    By GoingTo = By.xpath("//input[@id='goingTo_1']");
    By DataPicker = By.id("datePicker_1");
    By noOfAdults = By.id("noOfAdults");
    By SearchButton = By.xpath("(//input[@value='SEARCH'])[1]");
    By WhiteMarkup = By.xpath("//a[@class='markup_btn']");
    By DiscountLabel = By.xpath("(//p[contains(text(),'Save')])[1]");
    By ServiceChargeLabel = By.xpath("(//p[contains(text(),'EGP ')])[2]");
    By CancelChargeLabel = By.xpath("(//p[contains(text(),'EGP ')])[2]");
    By ServiceChargeOnFareDetails = By.xpath("(//strong[text()='Service Charge']/following-sibling::span[@data-currency='EGP'])[1]");
    By FareDetails = By.xpath("//li[@id='fare_0_0']");
    By FlightIcon =By.xpath("//li[@id='flight']");
    By book=By.xpath("//*[@id=\"one-way\"]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div/a");



    By StartingroundFrom = By.xpath("//input[@id='startingFrom_2']");
    By GoingroundTo = By.xpath("//input[@id='goingTo_2']");


    By StartingmultiFrom = By.xpath("//input[@id='startingFrom_4']");
    By GoingmultiTo = By.xpath("//input[@id='goingTo_4']");
    By GoingmultiToo = By.xpath("//input[@id='goingTo_5']");
    By roundDataPicker = By.id("dateofjourney_1");
    By multiiDataPicker = By.id("dateOfJourney_3");
    By multiDataPicker = By.id("dateOfJourney_4");


    By noOfAdultsround = By.id("noOfAdultsr");
    By noOfChildrenround = By.id("noOfChildsr");
    By noOfInfantsround = By.id("noOfInfantsr");

    By noOfAdultsmulti = By.id("noOfAdultsm");
    By noOfChildrenmulti = By.id("noOfChildsm");
    By noOfInfantsmulti = By.id("noOfInfantsm");

    By SearchroundButton = By.xpath("//*[@id=\"flightWidgetFormRoundTrip\"]/div[14]/input");
    By SearchmultiButton = By.xpath("//*[@id=\"flightWidgetFormMultiCity\"]/div[10]/input");

    By Totalfare= By.xpath("//*[@id=\"one-way\"]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div/strong");
    By roundbook=By.xpath("//*[@id=\"round-trip\"]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div/a");
    By multibook=By.xpath("//*[@id=\"round-trip\"]/div[2]/div/div[1]/div/div[2]/div[2]/div[2]/div/a");

    By mybookings=By.xpath("//*[@id=\"mybooking\"]/a");
    By signout=By.xpath("//*[@id=\"user-info\"]/ul/li[3]/span[2]/a");


    public SearchBookingAgency ClickOnBookingFlightIcon() {
        driver.element().click(FlightIcon);
        return new SearchBookingAgency(driver);
    }

    public SearchBookingAgency AddStartingFrom(String Place) {
        driver.element().click(StartingFrom);
        By source = By.xpath("//div[contains(@title,'"+Place+" -')]");
        driver.element().type(StartingFrom, Place).waitUntilPresenceOfAllElementsLocatedBy(source).keyPress(StartingFrom, Keys.ENTER);
        return new SearchBookingAgency(driver);
    }

    public SearchBookingAgency AddGoingTo(String Place) throws InterruptedException {
        driver.element().click(GoingTo);
        driver.element().type(GoingTo, Place);
      Thread.sleep(300);
        driver.element().keyPress(GoingTo,Keys.ENTER);
        return new SearchBookingAgency(driver);
    }

    public SearchBookingAgency SelectDateOfJourney(String Months, String Year, int Day) {
        driver.element().click(DataPicker);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-year']"), Year);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-month']"), Months);
        driver.element().click(By.xpath("//a[contains(@class, 'ui-state-default') and text()='" + Day + "']"));

        return new SearchBookingAgency(driver);
    }
    public SearchBookingAgency Selectroundjourneytype(){
        driver.element().click(By.xpath("//*[@id=\"flight-landing-wrap\"]/div/div/div/div[3]/div/div[1]/ul/li[2]"));
        return new SearchBookingAgency(driver);
    }
    public SearchBookingAgency Selectmultijourneytype(){
        driver.element().click(By.xpath("//*[@id=\"flight-landing-wrap\"]/div/div/div/div[3]/div/div[1]/ul/li[3]"));
        return new SearchBookingAgency(driver);
    }
    public SearchBookingAgency AddmultiStartingFrom(String Place) {
//        driver.element().click(StartingFrom);
//        driver.element().type(StartingFrom, Place).select(StartingFrom, Place);
        driver.element().click(StartingmultiFrom);
        By source = By.xpath("//div[contains(@title,'"+Place+" -')]");
        driver.element().type(StartingmultiFrom, Place).waitUntilPresenceOfAllElementsLocatedBy(source).keyPress(StartingmultiFrom, Keys.ENTER);
        return new SearchBookingAgency(driver);
    }
    public SearchBookingAgency AddmultiGoingTo(String Place) throws InterruptedException {
        driver.element().click(GoingmultiTo);
        driver.element().type(GoingmultiTo, Place);
        Thread.sleep(300);
        driver.element().keyPress(GoingmultiTo,Keys.ENTER);
        return new SearchBookingAgency(driver);

    }
    public SearchBookingAgency AddmultiGoingToo(String Place) throws InterruptedException {
        driver.element().click(GoingmultiToo);
        driver.element().type(GoingmultiToo, Place);
        Thread.sleep(300);
        driver.element().keyPress(GoingmultiToo,Keys.ENTER);
        return new SearchBookingAgency(driver);

    }
    public SearchBookingAgency SelectmultiDateOfJourney(String Months, String Year, int Day) {
        driver.element().click(multiDataPicker);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-year']"), Year);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-month']"), Months);
        driver.element().click(By.xpath("//a[contains(@class, 'ui-state-default') and text()='" + Day + "']"));
        driver.element().click(multiiDataPicker);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-year']"), Year);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-month']"), Months);
        driver.element().click(By.xpath("//a[contains(@class, 'ui-state-default') and text()='" + Day + "']"));

        return new SearchBookingAgency(driver);
    }

        public SearchBookingAgency SelectNumberOfAdult(int Number) {
        driver.element().select(noOfAdults, String.valueOf(Number));
        return new SearchBookingAgency(driver);
    }

    public SearchBookingAgency clickOnSearchButton() {
        driver.element().click(SearchButton);
        return new SearchBookingAgency(driver);
    }
    public SearchBookingAgency clickOnSearchroundButton() {
        driver.element().click(SearchroundButton);
        return new SearchBookingAgency(driver);
    }
    public SearchBookingAgency clickOnSearchmultiButton() {
        driver.element().click(SearchmultiButton);
        return new SearchBookingAgency(driver);
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


    public SearchBookingAgency AddroundStartingFrom(String Place) {
//        driver.element().click(StartingFrom);
//        driver.element().type(StartingFrom, Place).select(StartingFrom, Place);
        driver.element().click(StartingroundFrom);
        By source = By.xpath("//div[contains(@title,'"+Place+" -')]");
        driver.element().type(StartingroundFrom, Place).waitUntilPresenceOfAllElementsLocatedBy(source).keyPress(StartingroundFrom, Keys.ENTER);
        return new SearchBookingAgency(driver);
    }
    public SearchBookingAgency AddroundGoingTo(String Place) throws InterruptedException {
        driver.element().click(GoingroundTo);
        driver.element().type(GoingroundTo, Place);
        Thread.sleep(300);
        driver.element().keyPress(GoingroundTo,Keys.ENTER);
        return new SearchBookingAgency(driver);
    }

    public SearchBookingAgency SelectroundDateOfJourney(String Months, String Year, int Day) {
        driver.element().click(roundDataPicker);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-year']"), Year);
        driver.element().select(By.xpath("//select[@class='ui-datepicker-month']"), Months);
        driver.element().click(By.xpath("//a[contains(@class, 'ui-state-default') and text()='" + Day + "']"));

        return new SearchBookingAgency(driver);
    }

    public SearchBookingAgency SelectNumberOfAdultround(int Number) {
        driver.element().select(noOfAdultsround, String.valueOf(Number));
        return new SearchBookingAgency(driver);
    }

    public SearchBookingAgency SelectNumberOfAdultmulti(int Number) {
        driver.element().select(noOfAdultsmulti, String.valueOf(Number));
        return new SearchBookingAgency(driver);
    }


    public SearchBookingAgency clickOnWhiteMarkupButton() {
        driver.element().click(WhiteMarkup);
        return new SearchBookingAgency(driver);
    }

    public SearchBookingAgency ValidateTheDiscountIsApplied(int DiscountAdded) {
        String Discount = driver.getDriver().findElement(DiscountLabel).getText();
        String processedText = Discount.replace("Save EGP ", "").replace(".00", "");

        Assert.assertEquals(processedText, String.valueOf(DiscountAdded));
        return new SearchBookingAgency(driver);
    }
    public SearchBookingAgency ValidateTheServiceChargeIsApplied(int ServiceCharge) {
        String Service = driver.getDriver().findElement(ServiceChargeLabel).getText();
        String processedText = Service.replace("EGP ", "").replace(".00", "");
        Assert.assertEquals(processedText, String.valueOf(ServiceCharge));
        driver.element().click(FareDetails);
        String ServiceOnFareDetails = driver.getDriver().findElement(ServiceChargeOnFareDetails).getText();
        String ServiceOnFareDetailsProcessedText = ServiceOnFareDetails.replace(".00", "");
        Assert.assertEquals(ServiceOnFareDetailsProcessedText, String.valueOf(ServiceCharge));



        return new SearchBookingAgency(driver);
    }
    public SearchBookingAgency ValidateTheCancellationChargeIsApplied(int CancelCharge) {
        String Discount = driver.getDriver().findElement(CancelChargeLabel).getText();
        String processedText = Discount.replace("EGP", "").replace(".0", "");
        Assert.assertEquals(processedText, String.valueOf(CancelCharge));

        return new SearchBookingAgency(driver);
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

    public SearchBookingAgency gotosearchbooking() {
        driver.element().click(mybookings);
        return new SearchBookingAgency(driver);
    }
    public String getagencywallet(){
        String agenwallet=driver.element().getText(By.xpath("//*[@id=\"new-passenger-details-wrap\"]/div[1]/div/div[1]/div/div[1]/span[2]"));
        return agenwallet;
    }



    public SearchBookingAgency signout() {
        driver.element().click(signout);
        return new SearchBookingAgency(driver);
    }


}

