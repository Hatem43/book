package TestPackage.MileStoneTwo.PortalPackage;

import MileStoneTwo.Portal.PortalLoginPage;
import MileStoneTwo.Portal.PortalTCBase;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;


public class PortalLoginTC extends PortalTCBase {
    PortalLoginPage portalloginobject;


    @AfterSuite
    public void CloseBrowser() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().closeCurrentWindow();
        driver.quit();
    }



    @Test
    public void PortalLoginWithValidCredentials()  {
        portalloginobject = new PortalLoginPage(driver);
        portalloginobject.PortalLoginWithValidData();
    }

}