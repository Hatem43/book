package TestPackage.MileStoneTwo.PortalPackage;

import MileStoneTwo.BookingMidOffice.SearchBookingBranch;
import MileStoneTwo.Portal.PortalTCBase;
import MileStoneTwo.Portal.SearchBookingAgency;
import Pages.DashboardPage;
import Pages.Fareconfirm;
import Pages.Login.LoginPage;
import Pages.PassengerDetails;
import Pages.Utilities.DataUtils;
import TestPackage.BasePage.TCBase;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SearchBookingAgencyTC extends PortalTCBase {
    DashboardPage dashObj;

    Faker faker = new Faker();
    LoginPage loginobj;
    TCBase TCBaseObj;
    PortalLoginTC PortalLog ;
    Fareconfirm fareconfirm;
    PassengerDetails passenger;
    SearchBookingAgency search;

    String source = DataUtils.getJsonData("SearchBooking", "source");
    String destination = DataUtils.getJsonData("SearchBooking", "destination");
    String adulttit = DataUtils.getJsonData("passengerDetails", "Adulttitle");
    String adultfir = DataUtils.getJsonData("passengerDetails", "Adultfirstname");
    String adultlas = DataUtils.getJsonData("passengerDetails", "Adultlastname");
    String adultbiryear = DataUtils.getJsonData("passengerDetails", "Adultbirthyear");
    String adultbirmonth = DataUtils.getJsonData("passengerDetails", "Adultbirthmnoth");
    String adultgen = DataUtils.getJsonData("passengerDetails", "Adultgender");
    String adultpass = DataUtils.getJsonData("passengerDetails", "Adultpassport");
    String adultpassexpmonth = DataUtils.getJsonData("passengerDetails", "Adultpassexpiremonth");
    String adultpassexpyear = DataUtils.getJsonData("passengerDetails", "Adultpassexpireyear");
    String adultnat = DataUtils.getJsonData("passengerDetails", "Adultnationality");
    int NumberOfAdults = Integer.parseInt(DataUtils.getJsonData("SearchBooking", "NumberOfAdults"));



    String journeymonth = DataUtils.getJsonData("SearchBooking", "travelmonth");
    String journeyyear = DataUtils.getJsonData("SearchBooking", "travelyear");
    int journeyday = Integer.parseInt(DataUtils.getJsonData("SearchBooking", "travelday"));

    @BeforeTest
    public void beforeTest() throws InterruptedException {
        PortalLog = new PortalLoginTC();
        PortalLog.PortalLoginWithValidCredentials();
        passenger = new PassengerDetails(driver);
        search = new SearchBookingAgency(driver);

    }

    @Test(priority = 0)
    public void onewaybooking() throws InterruptedException {
        search.ClickOnBookingFlightIcon().
                AddStartingFrom(source).AddGoingTo(destination).SelectDateOfJourney(journeymonth,journeyyear,journeyday).
                SelectNumberOfAdult(NumberOfAdults).clickOnSearchButton().clickonBookbutton();
                   fareconfirm = new Fareconfirm(driver);
                   fareconfirm.acceptchek();
                   fareconfirm.continuetopassenger();

        passenger.setAdultTitle(adulttit).setAdultFirstName(adultfir).setAdultLastName(adultlas).setAdultdateofbirth(adultbiryear, adultbirmonth).setAdultGender(adultgen).setAdultPassport(adultpass).AdultPassportexpire(adultpassexpmonth, adultpassexpyear).setAdultAnationality(adultnat);


        String actual=passenger.getTotalfareportal();
        String expected="EGP 7250";
        Assert.assertEquals(actual,expected);
        passenger.signout();


    }




    @Test(priority = 1)
    public void roundbooking () throws InterruptedException {

        PortalLog.PortalLoginWithValidCredentials();
        search.ClickOnBookingFlightIcon().Selectroundjourneytype().
                AddroundStartingFrom(source).AddroundGoingTo(destination).SelectroundDateOfJourney(journeymonth, journeyyear, journeyday).
                SelectNumberOfAdultround(NumberOfAdults).clickOnSearchroundButton().clickonroundBookbutton();

        fareconfirm = new Fareconfirm(driver);
        fareconfirm.acceptchek();
        fareconfirm.continuetopassenger();

        passenger.setAdultTitle(adulttit).setAdultFirstName(adultfir).setAdultLastName(adultlas).setAdultdateofbirth(adultbiryear, adultbirmonth).setAdultGender(adultgen).setAdultPassport(adultpass).AdultPassportexpire(adultpassexpmonth, adultpassexpyear).setAdultAnationality(adultnat);


        String actual=passenger.getTotalfareportal();
        String expected="EGP 11450";
        Assert.assertEquals(actual,expected);
        passenger.signout();


    }





    @Test(priority = 2)
    public void multibooking () throws InterruptedException {

        PortalLog.PortalLoginWithValidCredentials();
        search.ClickOnBookingFlightIcon();
        search.Selectmultijourneytype().AddmultiStartingFrom(source).AddmultiGoingTo(destination).AddmultiGoingToo(source).SelectmultiDateOfJourney(journeymonth, journeyyear, journeyday).
                SelectNumberOfAdultmulti(NumberOfAdults).clickOnSearchmultiButton().clickonmultiBookbutton();

        fareconfirm = new Fareconfirm(driver);
        fareconfirm.acceptchek();
        fareconfirm.continuetopassenger();

        passenger.setAdultTitle(adulttit).setAdultFirstName(adultfir).setAdultLastName(adultlas).setAdultdateofbirth(adultbiryear, adultbirmonth).setAdultGender(adultgen).setAdultPassport(adultpass).AdultPassportexpire(adultpassexpmonth, adultpassexpyear).setAdultAnationality(adultnat);


        String actual=passenger.getTotalfareportal();
        String expected="EGP 11450";
        Assert.assertEquals(actual,expected);
        passenger.signout();

    }



    

    @Test(priority = 3)
    public void gotomybookings () throws InterruptedException{

        PortalLog.PortalLoginWithValidCredentials();
        search.gotosearchbooking();

   }



}