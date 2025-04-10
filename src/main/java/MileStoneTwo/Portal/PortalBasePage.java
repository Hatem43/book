package MileStoneTwo.Portal;

import Pages.BaseUtil;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class PortalBasePage extends BaseUtil {
//    protected SHAFT.GUI.WebDriver driver;

//    public PortalBasePage(SHAFT.GUI.WebDriver driver) {
//        this.driver = driver;
//    }
public PortalBasePage(SHAFT.GUI.WebDriver driver) {
    super(driver);
}


    public boolean isElementPresent(By locator) {
        return driver.getDriver().findElements(locator).size() > 0;
    }
}
