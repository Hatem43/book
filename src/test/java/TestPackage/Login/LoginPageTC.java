package TestPackage.Login;

import Pages.Login.LoginPage;
import TestPackage.BasePage.TCBase;
import com.shaft.validation.Validations;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTC extends TCBase {
    LoginPage loginObj;



    @Test
    public void loginWithValidCredentials() throws InterruptedException {
        loginObj = new LoginPage(driver);
        loginObj.LoginWithValidData(loginObj.ValidUser, loginObj.ValidPass);
    }

    // hagar adds //
    @Test
    public void loginWithForgetPassword() throws InterruptedException {
        loginObj = new LoginPage(driver);
        loginObj.loginWithForgetPassword(loginObj.ValidUser, loginObj.ValidUser);
      //  Validations.verifyThat().element(loginObj.messageForget).exists().perform();
        Assert.assertTrue(loginObj.actualResult2.contains(loginObj.expectedResult));
    }
    @Test
    public void Logout(){
        loginObj=new LoginPage(driver);
        loginObj.Logout();
    }


}