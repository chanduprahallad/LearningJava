import io.github.bonigarcia.wdm.UrlFilter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    @BeforeTest
    public WebDriver chromeSetup()
    {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
    public WebDriver firefoxSetup(String URL)
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver remoteWebDriver = new FirefoxDriver();
        remoteWebDriver.get(URL);
        return remoteWebDriver;
    }
   @AfterTest
    public void closeBrowser()
   {
       driver.quit();
   }

}
