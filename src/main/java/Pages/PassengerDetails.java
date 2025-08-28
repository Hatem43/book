package Pages;


import com.shaft.driver.SHAFT;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class PassengerDetails {
    public final By AdultpassengerTitle = By.xpath("//*[@id=\"passengerTitle_0\"]");
    public final By Adultpassengerfirstname = By.id("passengerFirstName_0");
    public final By AdultgetPassengerlastname = By.id("passengerLastName_0");
    public final By Adultdate = By.id("passengerDob_0");
    public final By Adultbirthmonth = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]");
    public final By Adultbirthyear = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]");
    public final By Adultbirth = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[7]/a");
    public final By Adultpassengergender = By.xpath("//select[@id=\"passengerGender_0\"]");
    public final By Adultpassportnumber = By.xpath("//*[@id=\"passengerDocument_0\"]");
    public final By Adultpassportexpire = By.xpath("//*[@id=\"passengerDocExp_0\"]");
    public final By Adultpassmonth = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]");
    public final By Adultpassyear = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]");
    public final By Adultexpiredate = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a");
    public final By Adultnationality = By.xpath("//*[@id=\"passengerNationality_0\"]");
    public final By Adultnan = By.id("ui-id-1");


    public final By Faredetails = By.xpath("//*[@id=\"flightCashFormTrav\"]/div[2]/div/div[1]/div[4]/div[2]/div/div[2]/ng-container/div");
    public final By Adult1basefare = By.xpath("//*[@id=\"flightCashFormTrav\"]/div[2]/div/div[1]/div[4]/div[2]/div/div[2]/ng-container/div/p[1]/span");
    public final By Adult1taxfare = By.xpath("//*[@id=\"flightCashFormTrav\"]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[2]/div[2]/ng-container/p[2]/span");
    public final By Totalfare = By.xpath("//*[@id=\"flightCashFormTrav\"]/div[2]/div/div[1]/div[4]/div[2]/div/div[2]/ng-container/div/p[10]/span");

    public final By Faredetailsportal = By.xpath("//*[@id=\"flightCashFormTrav\"]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[2]");
    public final By Adult1basefareportal = By.xpath("//*[@id=\"flightCashFormTrav\"]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[2]/div[2]/ng-container/p[1]/span");
    public final By Adult1taxfareportal = By.xpath("//*[@id=\"flightCashFormTrav\"]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[2]/div[2]/ng-container/p[2]/span");
    public final By Totalfareportal = By.xpath("//*[@id=\"flightCashFormTrav\"]/div/div[2]/div[1]/div/div[4]/div[2]/div/div[2]/div[2]/p[3]/span");

    public final By bookandpay = By.xpath("//input[@id='bookButtonShowHide']");
    public final By signout = By.xpath("//*[@id=\"user-info\"]/ul/li[3]/span[2]/a");

    SHAFT.GUI.WebDriver driver;


    public PassengerDetails(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public PassengerDetails setAdultTitle(String title) {
        driver.element().select(AdultpassengerTitle, title);
        return new PassengerDetails(driver);
    }

    public PassengerDetails setAdultFirstName(String firstName) {
        driver.element().type(Adultpassengerfirstname, firstName);
        return new PassengerDetails(driver);
    }

    public PassengerDetails setAdultLastName(String lastName) {
        driver.element().type(AdultgetPassengerlastname, lastName);
        return new PassengerDetails(driver);
    }

    public PassengerDetails setAdultdateofbirth(String year, String month) {
        driver.element().click(Adultdate);
        driver.element().select(Adultbirthyear, year);
        driver.element().select(Adultbirthmonth, month);
        driver.element().waitUntilPresenceOfAllElementsLocatedBy(Adultbirth);
        driver.element().click(Adultbirth);
        return new PassengerDetails(driver);
    }

    public PassengerDetails setAdultGender(String gender) {
        driver.element().select(Adultpassengergender, gender);
        return new PassengerDetails(driver);
    }

    public PassengerDetails setAdultPassport(String passport) {
        driver.element().type(Adultpassportnumber, passport);
        return new PassengerDetails(driver);
    }

    public PassengerDetails AdultPassportexpire(String expmonth,String expyear) {
        driver.element().click(Adultpassportexpire);
        driver.element().select(Adultpassmonth,expmonth);
        driver.element().select(Adultpassyear,expyear);
        driver.element().waitUntilPresenceOfAllElementsLocatedBy(Adultexpiredate);
        driver.element().click(Adultexpiredate);
        return new PassengerDetails(driver);
    }

    public PassengerDetails setAdultAnationality(String national) {

        driver.element().type(Adultnationality, national);
        driver.element().waitUntilPresenceOfAllElementsLocatedBy(Adultnan);
        driver.element().scrollToElement(Adultnan);
        driver.element().click(Adultnan);
        return new PassengerDetails(driver);
    }

    public String getTotalfare() {
        boolean found=false;
        String tot = "";
        while(true) {
            List<WebElement> FareBreakup = driver.getDriver().findElements(Faredetails);
            for (WebElement fare : FareBreakup) {
                WebElement AdultBasefare = fare.findElement(Adult1basefare);
                String adult = AdultBasefare.getText();
                System.out.println("AdultBaseFare is "+adult);
                WebElement AdultTaxFare = fare.findElement(Adult1taxfare);
                String adulttax = AdultTaxFare.getText();
                System.out.println("AdultTaxFare is "+adulttax);
                WebElement Total = fare.findElement(Totalfare);
                tot = Total.getText();
                System.out.println("the total fare is " + tot);
                found=true;
                break;
            }

            if (found) {
                break;
            }
        }
        return tot;
    }

    public String getTotalfareportal() {
        boolean found=false;
        String tot = "";
        while(true) {
            List<WebElement> FareBreakup = driver.getDriver().findElements(Faredetailsportal);
            for (WebElement fare : FareBreakup) {
                WebElement AdultBasefare = fare.findElement(Adult1basefareportal);
                String adult = AdultBasefare.getText();
                System.out.println("AdultBaseFare is "+adult);
                WebElement AdultTaxFare = fare.findElement(Adult1taxfareportal);
                String adulttax = AdultTaxFare.getText();
                System.out.println("AdultTaxFare is "+adulttax);
                WebElement Total = fare.findElement(Totalfareportal);
                tot = Total.getText();
                System.out.println("the total fare is " + tot);
                found=true;
                break;
            }

            if (found) {
                break;
            }
        }
        return tot;
    }

    public PassengerDetails book() {
        driver.element().click(bookandpay);
        Alert a = driver.getDriver().switchTo().alert();
        a.dismiss();
        return new PassengerDetails(driver);
    }

    public PassengerDetails signout(){
        driver.element().click(signout);
        return new PassengerDetails(driver);
    }
}

