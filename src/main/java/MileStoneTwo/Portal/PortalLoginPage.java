package MileStoneTwo.Portal;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;


public class PortalLoginPage extends PortalBasePage {

    public PortalLoginPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    By AgencyCode = By.id("agencyCodeMain");
    By Email = By.id("userAlias");
    By Password = By.id("password_password");
    By LoginBttn = By.xpath("//input[@type='submit']");
    String ValidPassForMb3 = "9YDkEZfw3x6Yeua";


    public void PortalLoginWithValidData() {
        driver.browser().navigateToURL("http://192.168.1.70:8080/odeysysportal/login/signOut");
        driver.element().type(AgencyCode, "AGN2")
                .type(Email, "E.saady@ndceg.com");
        if(driver.browser().getCurrentURL().contains("https://mb3.ndceg.com/")){
            driver.element().type(Password, ValidPassForMb3);
        }
        else {
            driver.element().type(Password, "qqE6)Cxp6>B8");
        }

        driver.element().click(LoginBttn);

    }


}