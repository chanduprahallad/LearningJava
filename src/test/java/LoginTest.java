import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest
{
    @Test
   public void test() throws InterruptedException, IOException {
      LoginPage loginPage = new LoginPage(driver);
      loginPage.goTo("https://www.rahulshettyacademy.com/loginpagePractise/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      assertTrue(loginPage.enterUserName("rahulshettyacademy"),"unable to enter username");
      assertTrue(loginPage.enterPassWord("learning"));
      assertTrue(loginPage.clickOnCheckBox());
      assertTrue(loginPage.selectDropDown(2));
      assertTrue(loginPage.clickAdminRadioButton());
      assertTrue(loginPage.clickUserRadioButton());

//      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//      wait.until(ExpectedConditions.alertIsPresent());
//      File screenShotOfLoginPage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//       FileUtils.copyFile(screenShotOfLoginPage,new File(System.getProperty("user.dir")+"\\src\\main\\resources\\screenshots\\loginpage.png"));
       assertTrue(loginPage.clickOnOkInModel());
      assertTrue(loginPage.validateTermsAndConditionsMessage());
      assertTrue(loginPage.signInButton());
      assertTrue(loginPage.isSignInSuccessful());



   }


}
