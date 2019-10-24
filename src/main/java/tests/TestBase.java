package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.BrowserName;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver webDriver;

    public void initSetting(BrowserName browserName) {
        webDriver = choiceBrowser(browserName);
        webDriver.get("https://shopcart-challenge.4all.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    private WebDriver choiceBrowser(BrowserName browserName) {
        if (browserName.equals(BrowserName.CHROME)) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            return new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
            return new FirefoxDriver();
        }
    }
}
