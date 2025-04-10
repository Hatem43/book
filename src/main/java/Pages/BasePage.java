package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class BasePage extends BaseUtil {
//    protected SHAFT.GUI.WebDriver driver;

//    public BasePage(SHAFT.GUI.WebDriver driver) {
//        this.driver = driver;
//    }
    public BasePage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }


    public boolean isElementPresent(By locator) {
        return driver.getDriver().findElements(locator).size() > 0;
    }

}
