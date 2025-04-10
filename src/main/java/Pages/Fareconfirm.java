package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;


public class Fareconfirm {

    public Fareconfirm(SHAFT.GUI.WebDriver driver) {
        super();
        this.driver = driver;
    }

    By accp=By.xpath("//*[@id=\"iAccept\"]");
    By cont=By.xpath("//a[contains(text(),'Continue')]");
    SHAFT.GUI.WebDriver driver;

    public Fareconfirm acceptchek(){
        driver.element().waitUntilPresenceOfAllElementsLocatedBy(accp);
        driver.element().click(accp);
        return new Fareconfirm(driver);
    }
  public PassengerDetails continuetopassenger(){
      driver.element().click(cont);
      return new PassengerDetails(driver);
  }

}
