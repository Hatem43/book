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


    int DiscountAmount = Integer.parseInt(DataUtils.getJsonData("DiscountData", "DiscountAmount"));
    int ServiceChargeAmount = Integer.parseInt(DataUtils.getJsonData("ServiceChargeData", "ServiceChargeAmount"));
    //int ServiceChargeAmount = Integer.parseInt(DataUtils.getJsonData("ServiceChargeData", "ServiceChargeAmount"));
    int CancellationChargeValueOfAdult = Integer.parseInt(DataUtils.getJsonData("CancellationChargeData", "CancellationChargeValueOfAdult"));
    int CancellationChargeValueOfChild = Integer.parseInt(DataUtils.getJsonData("CancellationChargeData", "CancellationChargeValueOfChild"));
    int CancellationChargeValueOfInfant = Integer.parseInt(DataUtils.getJsonData("CancellationChargeData", "CancellationChargeValueOfInfant"));
    String source = DataUtils.getJsonData("SearchBooking", "source");
    String destination = DataUtils.getJsonData("SearchBooking", "destination");
    String BranchName = DataUtils.getJsonData("SearchBooking", "branchname");
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
    String adult2tit = DataUtils.getJsonData("passengerDetails", "Adult2title");
    String adult2fir = DataUtils.getJsonData("passengerDetails", "Adult2firstname");
    String adult2las = DataUtils.getJsonData("passengerDetails", "Adult2lastname");
    String adult2biryear = DataUtils.getJsonData("passengerDetails", "Adult2birthyear");
    String adult2birmonth = DataUtils.getJsonData("passengerDetails", "Adult2birthmnoth");
    String adult2mobile = DataUtils.getJsonData("passengerDetails", "Adult2Mobile");
    String adult2gen = DataUtils.getJsonData("passengerDetails", "Adult2gender");
    String adult2pass = DataUtils.getJsonData("passengerDetails", "Adult2passport");
    String adult2passexpmonth = DataUtils.getJsonData("passengerDetails", "Adult2passexpiremonth");
    String adult2passexpyear = DataUtils.getJsonData("passengerDetails", "Adult2passexpireyear");
    String adult2nat = DataUtils.getJsonData("passengerDetails", "Adult2nationality");
    String childtit = DataUtils.getJsonData("passengerDetails", "childtitle");
    String childfir = DataUtils.getJsonData("passengerDetails", "childfirstname");
    String childlas = DataUtils.getJsonData("passengerDetails", "childlastname");
    String childbiryear = DataUtils.getJsonData("passengerDetails", "childbirthyear");
    String childbirmonth = DataUtils.getJsonData("passengerDetails", "childbirthmnoth");
    String childmobile = DataUtils.getJsonData("passengerDetails", "childMobile");
    String childgen = DataUtils.getJsonData("passengerDetails", "childgender");
    String childpass = DataUtils.getJsonData("passengerDetails", "childpassport");
    String childpassexpmonth = DataUtils.getJsonData("passengerDetails", "childpassexpiremonth");
    String childpassexpyear = DataUtils.getJsonData("passengerDetails", "childpassexpireyear");
    String childnat = DataUtils.getJsonData("passengerDetails", "childnationality");
    String child2tit = DataUtils.getJsonData("passengerDetails", "child2title");
    String child2fir = DataUtils.getJsonData("passengerDetails", "child2firstname");
    String child2las = DataUtils.getJsonData("passengerDetails", "child2lastname");
    String child2biryear = DataUtils.getJsonData("passengerDetails", "child2birthyear");
    String child2birmonth = DataUtils.getJsonData("passengerDetails", "child2birthmnoth");
    String child2mobile = DataUtils.getJsonData("passengerDetails", "child2Mobile");
    String child2gen = DataUtils.getJsonData("passengerDetails", "child2gender");
    String child2pass = DataUtils.getJsonData("passengerDetails", "child2passport");
    String child2passexpmonth = DataUtils.getJsonData("passengerDetails", "child2passexpiremonth");
    String child2passexpyear = DataUtils.getJsonData("passengerDetails", "child2passexpireyear");
    String child2nat = DataUtils.getJsonData("passengerDetails", "child2nationality");
    String infanttit = DataUtils.getJsonData("passengerDetails", "infanttitle");
    String infantfir = DataUtils.getJsonData("passengerDetails", "infantfirstname");
    String infantlas = DataUtils.getJsonData("passengerDetails", "infantlastname");
    String infantbiryear = DataUtils.getJsonData("passengerDetails", "infantbirthyear");
    String infantbirmonth = DataUtils.getJsonData("passengerDetails", "infantbirthmnoth");
    String infantmobile = DataUtils.getJsonData("passengerDetails", "infantMobile");
    String infantgen = DataUtils.getJsonData("passengerDetails", "infantgender");
    String infantpass = DataUtils.getJsonData("passengerDetails", "infantpassport");
    String infantpassexpmonth = DataUtils.getJsonData("passengerDetails", "infantpassexpiremonth");
    String infantpassexpyear = DataUtils.getJsonData("passengerDetails", "infantpassexpireyear");
    String infantnat = DataUtils.getJsonData("passengerDetails", "infantnationality");
    String infant2tit = DataUtils.getJsonData("passengerDetails", "infant2title");
    String infant2fir = DataUtils.getJsonData("passengerDetails", "infant2firstname");
    String infant2las = DataUtils.getJsonData("passengerDetails", "infant2lastname");
    String infant2biryear = DataUtils.getJsonData("passengerDetails", "infant2birthyear");
    String infant2birmonth = DataUtils.getJsonData("passengerDetails", "infant2birthmnoth");
    String infant2mobile = DataUtils.getJsonData("passengerDetails", "infant2Mobile");
    String infant2gen = DataUtils.getJsonData("passengerDetails", "infant2gender");
    String infant2pass = DataUtils.getJsonData("passengerDetails", "infant2passport");
    String infant2passexpmonth = DataUtils.getJsonData("passengerDetails", "infantpassexpiremonth");
    String infant2passexpyear = DataUtils.getJsonData("passengerDetails", "infantpassexpireyear");
    String infant2nat = DataUtils.getJsonData("passengerDetails", "infant2nationality");

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