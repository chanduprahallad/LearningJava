import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class LoginPageFunctionality {
    public static WebDriver driver;
    @BeforeMethod
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://sso.teachable.com/secure/9521/identity/login/password");

    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
    @Test
    public static void validUsernameAndValidPassword() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("Chanduprahallad5@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Chandub5@.");
//        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://courses.rahulshettyacademy.com/"));


    }
    @Test
    public static void invalidUsernameAndInvalidPassword()  {
        driver.findElement(By.id("email")).sendKeys("Chanduprahallad@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Chandub5");
        driver.findElement(By.xpath("//input[@name='commit']")).click();

    }
    @Test
    public static void validUsernameAndInvalidPassword(){
        driver.findElement(By.id("email")).sendKeys("Chanduprahallad5@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Chandub5");
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public static void invalidUsernameAndValidPassword(){
        driver.findElement(By.id("email")).sendKeys("Chanduprahallad@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Chandub5@.");
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public static void withNoUsernameAndNoPassword(){
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @Test
    public static void withNoUsernameAndWithValidPassword(){
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("Chandub5@.");
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @Test
    public static void withValidUsernameAndNoPassword(){
        driver.findElement(By.id("email")).sendKeys("chanduprahallad5@gmail.com");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='commit']")).click();
    }
    @Test
    public static void clickOnForgotPassword(){
        driver.findElement(By.id("email")).sendKeys("chanduprahallad5@gmail.com");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.xpath("//a[contains(.,'Forgot Password')]"));
//        driver.findElement(By.xpath("//input[@name='commit']")).click();
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='commit']")));
    }
    @Test
    public static void reloadPage(){
        driver.findElement(By.id("email")).sendKeys("chanduprahallad5@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Chandub5@.");
        driver.navigate().refresh();

    }
    @Test
    public static void UserInterfaceText(){
        driver.findElement(By.xpath("//h3[contains(.,'Log in')]")).isDisplayed();
        driver.findElement(By.id("email")).isDisplayed();
        driver.findElement(By.id("password")).isDisplayed();
        driver.findElement(By.xpath("//label[contains(.,'Remember Me')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(.,'Forgot Password')]")).isDisplayed();
        driver.findElement(By.xpath("//input[@name='commit']")).isDisplayed();
        driver.findElement(By.xpath("//div[contains(.,'Need an account?')]/div[1]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).isDisplayed();
        driver.findElement(By.id("remember_me")).isDisplayed();




    }
    @Test
    public static void clickOnSignUp(){
        driver.findElement(By.xpath("//a[contains(.,'Sign Up')]"));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(By.xpath("//label[contains(.,'Email')]"), "Email"));
    }

}
