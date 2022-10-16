import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class SignUpPageTest extends BaseTest{

    @Test
    public void signUpPageTest() throws InterruptedException {
        SignUpPage signuppage = new SignUpPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(20));
//        wait.until(E)
        signuppage.goTo("https://sso.teachable.com/secure/9521/identity/sign_up/email");
        String email="chanduprahallad5@gmail.com";
        String password = "chandu1234";
        String fullName="chanduprahallad";
        assertTrue(signuppage.enterEmail(email));
        assertTrue(signuppage.enterPassword(password));
        assertTrue(signuppage.enterFullName(fullName));
        assertTrue(signuppage.clickCheckBox(),"unable to click");
        assertTrue(signuppage.agreeToTermsAndPrivacyPolicyText());
        assertTrue(signuppage.promotionalAndInstructionalText());
        assertTrue(signuppage.clickOnAlreadyHaveAnAccount());
        assertTrue(signuppage.clickOnIconEye());
        assertTrue(signuppage.clickOnSignUp());
        assertTrue(signuppage.clickOnLoginInSignupPage());
        driver.navigate().back();
//        assertTrue(signuppage.checkPasswordWithVisibilityOn());
//        assertTrue(signuppage.checkPasswordWithVisibilityOff());
        File screenShotOfSignupPage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


    }
}
