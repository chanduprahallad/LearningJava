import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPage extends BaseElementFinder{

    SignUpPage(WebDriver d) {
        super(d);
    }
    public void goTo(String url)
    {
        driver.get(url);
    }

    public boolean enterFullName(String fullName) throws InterruptedException {
        WebElement name = getElementById("user_name",2000);
        if(name!=null) {
            name.sendKeys(fullName);
            return true;
        }
        return false;
    }
    public boolean enterEmail(String email) throws InterruptedException {
        WebElement emailElement = getElementById("user_email",2000);
        if(emailElement!=null)
        {
            emailElement.sendKeys(email);
            return true;
        }
        return false;
    }
    public boolean enterPassword(String pwd) throws InterruptedException {
        WebElement pwdElement = getElementById("password",2000);
        if(pwdElement!=null)
        {
            pwdElement.sendKeys(pwd);
            return true;
        }
        return false;

    }
    public boolean clickCheckBox() throws InterruptedException {
        WebElement checkBoxclick = getElementByXpath((("//input[@type='checkbox']")),2000);
        if(checkBoxclick!=null)
        {
            checkBoxclick.click();
            return true;
        }
        return false;
    }
    public boolean promotionalAndInstructionalText()
    {
        WebElement promotionalText = getElementByXpath(("//label[@for='allow_marketing_emails']"),2000);
        String actualText = promotionalText.getText();
        String expectedText = "I agree to receive promotional and instructional emails from Rahul Shetty Academy";
        return actualText.equals(expectedText);
    }
    public boolean agreeToTermsAndPrivacyPolicyText()
    {
        WebElement termsAndPrivacyElement = getElementByXpath("//div[@class='m-b-3-xs form-footer ash bodyMain']",2000);
        String actualText = termsAndPrivacyElement.getText();
        String expectedText = "By signing up, I agree to Rahul Shetty Academy's Terms of Use & Privacy Policy, and the Terms of Use & Privacy Policy of the learning platform.";
        return actualText.equals(expectedText);
    }
    public boolean clickOnSignUp()
    {
        WebElement signUp = getElementByXpath(("//input[@name='commit']"),2000);
        if(signUp!=null)
        {
            signUp.click();
            return true;
        }
        return false;

    }
    public boolean clickOnAlreadyHaveAnAccount()
    {
        WebElement accountElement = getElementByXpath("//div[@class='bodyMain text-center-xs m-b-5-xs']",2000);
        if(accountElement.isEnabled())
        {
            accountElement.click();
            return true;
        }
        return false;
    }
    public boolean clickOnLoginInSignupPage()
    {
        WebElement logInElement = getElementByXpath("//a[@data-test-id='login-button']",2000);
        if(logInElement.isEnabled())
        {
            logInElement.click();
            return true;
        }
        return false;
    }
    public boolean clickOnIconEye() throws InterruptedException {
        WebElement eyeIconElement = getElementByXpath("//div[@class='password-container']//*[name()='svg']",2000);
        eyeIconElement.click();
        return true;
    }
    public boolean checkPasswordWithVisibilityOn()
    {
        WebElement visiblePasswordElement = getElementByXpath("//input[@id='password']",2000);
        String actualPasswordDisplayed = visiblePasswordElement.getText();
        String expectedPasswordToBeDisplayed = "chandu1234";
        return actualPasswordDisplayed.equals(expectedPasswordToBeDisplayed);
    }
    public boolean checkPasswordWithVisibilityOff()
    {
        WebElement passwordElementWithVisibilityOff = getElementByXpath("//input[@id='password']",2000);
        String actualPasswordDisplayedWithVisibilityOff = passwordElementWithVisibilityOff.getText();
        String expectedPasswordToBeDisplayedWithVisibilityOff = "..........";
        return actualPasswordDisplayedWithVisibilityOff.equals(expectedPasswordToBeDisplayedWithVisibilityOff);
    }
}
