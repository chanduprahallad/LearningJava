package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;

    public BaseTest() {
    }

    @BeforeTest
    public WebDriver chromeSetup() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        return this.driver;
    }

    public WebDriver firefoxSetup(String URL) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver remoteWebDriver = new FirefoxDriver();
        remoteWebDriver.get(URL);
        return remoteWebDriver;
    }

    @AfterTest
    public void closeBrowser() {
        this.driver.quit();
    }
}
