package TestPackage;

import Pages.DashBoardModulePage;
import Pages.DashboardPage;
import Pages.Login.LoginPage;
import TestPackage.BasePage.TCBase;
import com.shaft.validation.Validations;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashBoardModulePageTC extends TCBase {
    LoginPage loginObj;
    DashBoardModulePage dashObj;
    DashboardPage dsh;
    @BeforeTest
    public void BeforeTest() throws InterruptedException {
        loginObj = new LoginPage(driver);
        loginObj.LoginWithValidData("e.saady", "a");
        dsh=new DashboardPage(driver);
        dsh.openDashBard();
        dashObj=new DashBoardModulePage(driver);
    }
    @Test
    public void dashObj() throws InterruptedException {
        dashObj.DashBoard();
       // Validations.verifyThat().element(dashObj.FLIGHTS).exists().perform();
    }
    @Test
    public void searchWithValidData() throws InterruptedException {
        dsh.openDashBard();
        dashObj.searchOnDashBoardPage();
        //Validations.verifyThat().element(By.xpath("//*[@id=\"activ_0_2\"]/a/p")).exists().perform();

    }
}
