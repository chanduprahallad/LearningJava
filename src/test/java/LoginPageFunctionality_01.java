import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageFunctionality_01 extends BaseElementFinder {


    LoginPageFunctionality_01(WebDriver d) {
        super(d);
    }

    public void goTo(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }
/*    @FindBy(how=How.ID,id="email") WebElement ele1;
    @FindBy(how=How.ID,id="password") WebElement passwordElement;
    @FindBy(how = How.NAME,name ="commit") WebElement buttonElement;*/

    public boolean enterValidUsernameAndValidPassword(String email, String password) throws InterruptedException {

        WebElement emailElement = getElementById("email", 2000);
        WebElement passwordElement = getElementById("password", 2000);
        WebElement buttonElement = getElementByXpath("//input[@name='commit']", 2000);
        if (emailElement != null) {
            emailElement.sendKeys(email);
            if (passwordElement != null) {
                passwordElement.sendKeys(password);
            }
            if (buttonElement != null) {
                buttonElement.click();
            }

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.urlToBe("https://courses.rahulshettyacademy.com/"));
            return true;
        }
        return false;
    }

    public boolean enterValidUsernameAndInvalidPassword(String email, String password) throws InterruptedException {
        WebElement emailElement1 = getElementById("email", 2000);
        WebElement passwordElement1 = getElementById("password", 2000);
        WebElement buttonElement1 = getElementByXpath("//input[@name='commit']", 2000);
        if (emailElement1 != null) {
            emailElement1.sendKeys(email);
            if (passwordElement1 != null) {
                passwordElement1.sendKeys(password);
            }
            if (buttonElement1 != null) {
                buttonElement1.click();
                return true;
            }
        }
        return false;
    }

    public boolean enterInvalidUsernameAndInvalidPassword(String email, String password) throws InterruptedException {
        WebElement emailElement1 = getElementById("email", 2000);
        WebElement passwordElement1 = getElementById("password", 2000);
        WebElement buttonElement1 = getElementByXpath("//input[@name='commit']", 2000);
        if (emailElement1 != null) {
            emailElement1.sendKeys(email);
            if (passwordElement1 != null) {
                passwordElement1.sendKeys(password);
            }
            if (buttonElement1 != null) {
                buttonElement1.click();
                return true;
            }
        }
        return false;

    }

    public boolean enterInvalidUsernameAndValidPassword(String email, String password) throws InterruptedException {
        WebElement emailElement1 = getElementById("email", 2000);
        WebElement passwordElement1 = getElementById("password", 2000);
        WebElement buttonElement1 = getElementByXpath("//input[@name='commit']", 2000);
        if (emailElement1 != null) {
            emailElement1.sendKeys(email);
            if (passwordElement1 != null) {
                passwordElement1.sendKeys(password);
            }
            if (buttonElement1 != null) {
                buttonElement1.click();
                return true;
            }
        }
        return false;
    }

    public boolean noUsernameAndNoPassword(String email, String password) throws InterruptedException {
        WebElement emailElement1 = getElementById("email", 2000);
        WebElement passwordElement1 = getElementById("password", 2000);
        WebElement buttonElement1 = getElementByXpath("//input[@name='commit']", 2000);
        if (emailElement1 != null) {
            emailElement1.sendKeys(email);
            if (passwordElement1 != null) {
                passwordElement1.sendKeys(password);
            }
            if (buttonElement1 != null) {
                buttonElement1.click();
                return true;
            }
        }
        return false;
    }

    public boolean noUsernameAndWithPassword(String email, String password) throws InterruptedException {
        WebElement emailElement1 = getElementById("email", 2000);
        WebElement passwordElement1 = getElementById("password", 2000);
        WebElement buttonElement1 = getElementByXpath("//input[@name='commit']", 2000);
        if (emailElement1 != null) {
            emailElement1.sendKeys(email);
            if (passwordElement1 != null) {
                passwordElement1.sendKeys(password);
            }
            if (buttonElement1 != null) {
                buttonElement1.click();
                return true;
            }
        }
        return false;
    }

    public boolean withUsernameAndNoPassword(String email, String password) throws InterruptedException {
        WebElement emailElement1 = getElementById("email", 2000);
        WebElement passwordElement1 = getElementById("password", 2000);
        WebElement buttonElement1 = getElementByXpath("//input[@name='commit']", 2000);
        if (emailElement1 != null) {
            emailElement1.sendKeys(email);
            if (passwordElement1 != null) {
                passwordElement1.sendKeys(password);
            }
            if (buttonElement1 != null) {
                buttonElement1.click();
                return true;
            }
        }
        return false;
    }

    public boolean clickOnForgotPassword(String email, String password) throws InterruptedException {
        WebElement emailElement1 = getElementById("email", 2000);
        WebElement passwordElement1 = getElementById("password", 2000);
//        WebElement buttonElement1  = getElementByXpath("//input[@name='commit']",2000);
        WebElement forgotElement = getElementByXpath("//a[contains(.,'Forgot Password')]", 2000);

        if (emailElement1 != null) {
            emailElement1.sendKeys(email);
            if (passwordElement1 != null) {
                passwordElement1.sendKeys(password);
            }
            if (forgotElement != null) {
                forgotElement.click();
                return true;
            }
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='commit']")));
        return false;
    }

    public void reloadPage() throws InterruptedException {
        WebElement emailElement = getElementById("email", 2000);
        WebElement passwordElement = getElementById("password", 2000);
        driver.navigate().refresh();
    }

    public boolean UserInterfaceText() throws InterruptedException {
        WebElement logInElement = getElementByXpath("//h3[contains(.,'Log in')]", 2000);
        if (logInElement != null) {
            logInElement.isDisplayed();
            return true;
        }
        WebElement emailElement = getElementById("email", 2000);
        if (emailElement != null) {
            emailElement.isDisplayed();
            return true;
        }
        WebElement passwordElement = getElementById("password", 2000);
        if (passwordElement != null) {
            passwordElement.isDisplayed();
            return true;
        }
        WebElement rememberMeElement = getElementByXpath("//label[contains(.,'Remember Me')]", 2000);
        if (passwordElement != null) {
            passwordElement.isDisplayed();
            return true;
        }
        WebElement forgotPasswordElement = getElementByXpath("//a[contains(.,'Forgot Password')]", 2000);
        if (forgotPasswordElement != null) {
            forgotPasswordElement.isDisplayed();
            return true;
        }
        WebElement logInElement1 = getElementByXpath("//input[@name='commit']", 2000);
        if (logInElement != null) {
            logInElement.isDisplayed();
            return true;
        }
        WebElement needAnAccountElement = getElementByXpath("//div[contains(.,'Need an account?')]/div[1]", 2000);
        if (needAnAccountElement != null) {
            needAnAccountElement.isDisplayed();
            return true;
        }
        WebElement signUpElement = getElementByXpath("//a[contains(.,'Sign Up')]", 2000);
        if (signUpElement != null) {
            signUpElement.isDisplayed();
            return true;
        }
        WebElement rememberElement = getElementById("remember_me", 2000);
        if (rememberElement != null) {
            rememberElement.isDisplayed();
            return true;
        }
        return false;

    }
}
