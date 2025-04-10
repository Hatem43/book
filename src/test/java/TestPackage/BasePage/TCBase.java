package TestPackage.BasePage;

import com.shaft.driver.SHAFT;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TCBase {
    public String URL = "http://192.168.1.60:8080/odeysysadmin/";
    public static SHAFT.GUI.WebDriver driver;
    By logOutDropDown = By.xpath("(//p[@class='drpdwn_usr'])[1]");
    By logOut = By.xpath("//a[normalize-space()='Logout']");

    @BeforeSuite
    public void OpenBrowser() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL(URL);

    }
    public boolean isElementPresent(By locator) {
        return driver.getDriver().findElements(locator).size() > 0;   }
    public void logOut(){
        driver.element().click(logOutDropDown)
                .click(logOut);
    }
    public String readJsonFromFile(String filePath) throws IOException {
        Path path = Path.of(filePath);
        return Files.readString(path);
    }
    public String getElementFromJsonArray(JSONObject jsonObject , String fieldName, int index ) throws JSONException {
        JSONArray array = jsonObject.getJSONArray(fieldName);
        return array.getString(index);

    }
    public JSONObject getJsonObjectFromFile(String filePath) throws JSONException, IOException {
        String jsonString = readJsonFromFile(filePath);
        return new JSONObject(jsonString);
    }

    }


