package Pages.Login;

import Pages.BasePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    public  LoginPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public String ValidUser = "e.saady";
    public String ValidPass = "qqE6)Cxp6>B8";

    public String ValidPassForMb3 = "9YDkEZfw3x6Yeua";
    By usernameele = By.id("id-Username");
    By passwordele = By.id("id-Password");
    By loginbttnele = By.xpath("//span[@class='p-button-label']");
    By forgotPassword = By.id("forgot-password");
    By ENTERUSERINMESSAGE = By.xpath("//*[@id=\"userName\"]");
    public By submit = By.xpath("//*[@id=\"send\"]");
    public By validMessageBtn = By.xpath("//*[@id=\"modal_reset\"]/div/button");
    public By messageForget = By.xpath("//*[@id=\"modal_reset\"]/p");
    public By DropDownLogout = By.xpath("//p[@class='drpdwn_usr']");
    public By LogoutButton= By.xpath("//a[contains(text(),'Logout')]");
    public String actualResult2;

    public String expectedResult = "A reset password link has been sent to you via email. If you don't see this email in your inbox within 5 minutes, look for it in your junk mail folder.";


    public void LoginWithValidData(String username, String password) throws InterruptedException {
        driver.browser().navigateToURL("http://192.168.1.50/auth/login");
        driver.element().type(usernameele, ValidUser);

        if(driver.browser().getCurrentURL().contains("https://mb3.ndceg.com/")){
            driver.element().type(passwordele, ValidPassForMb3);
        }
        else {
            driver.element().type(passwordele, ValidPass);
        }
        Thread.sleep(5000);
//        driver.getDriver().manage().timeouts().implicitlyWait(80000, TimeUnit.SECONDS);
        driver.element().click(loginbttnele);
        Thread.sleep(5000);

    }
    // hagar adds //

    public void loginWithForgetPassword(String username, String userforgetpass) throws InterruptedException {
        driver.element().type(usernameele, ValidUser)
                .click(forgotPassword);
        Thread.sleep(1000);
        driver.element().type(ENTERUSERINMESSAGE, "E.saady")
                .click(submit);
        actualResult2 = driver.element().getText(messageForget);
        Thread.sleep(1000);
        driver.element().click(validMessageBtn);

    }
    public void Logout(){
        driver.element().click(DropDownLogout).click(LogoutButton);
    }

}
