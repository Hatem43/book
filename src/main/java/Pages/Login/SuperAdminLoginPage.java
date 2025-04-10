package Pages.Login;
import Pages.BasePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class SuperAdminLoginPage extends BasePage {
    public SuperAdminLoginPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String ValidUser = "odeysysadmin";
    public String ValidPass = "qqE6)Cxp6>B8";
 //   public String ValidPassForMb3 = "9YDkEZfw3x6Yeua";

    By usernameele = By.id("id-Username");
    By passwordele = By.id("id-Password");
    By loginbttnele = By.xpath("//button[@type='submit']");

    public void LoginWithValidData() {
        driver.browser().navigateToURL("http://192.168.1.60:8080/odeysysadmin/");
        driver.element().type(usernameele, ValidUser);
        if(driver.browser().getCurrentURL().contains("http://192.168.1.60:8080/odeysysadmin/")){
            driver.element().type(passwordele, ValidPass);
        }
        else {
            driver.element().type(passwordele, ValidPass);
        }
        driver.getDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.element().click(loginbttnele);
    }
}
