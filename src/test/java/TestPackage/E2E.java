package TestPackage;

import Pages.DashboardPage;
import Pages.Login.SuperAdminLoginPage;
import TestPackage.BasePage.TCBase;
import TestPackage.Login.LoginPageTC;

import TestPackage.MileStoneTwo.BookingMidOffice.SearchBookingBranchTC;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class E2E extends TCBase {
    SuperAdminLoginPage loginPage;
    DashboardPage DashboardPage;

    LoginPageTC loginPageTC =new LoginPageTC();
    SearchBookingBranchTC searchBookingBranchTC = new SearchBookingBranchTC();

    @BeforeTest
    public void beforeTest() throws InterruptedException {
        loginPage = new SuperAdminLoginPage(driver);
        loginPage.LoginWithValidData();
        DashboardPage = new DashboardPage(driver);
        DashboardPage.openMaster();
        DashboardPage.openMaster_Supplier();

    }
    @Test
    public void E2E() throws InterruptedException {
        loginPageTC.Logout();
        loginPageTC.loginWithValidCredentials();
        //AddNewBranchTC.AddNewBranchNdcIntegration();
        searchBookingBranchTC.onewaybooking();
        searchBookingBranchTC.roundbooking();
        searchBookingBranchTC.multibooking();




        //MarkUpTc.AddMarkUp();


       // SupplierCredentialsPageTC.searchInSupplierCredentialWithValidData();
       // SupplierCredentialsPageTC.testforscanario();
    }

}
