package test.PageObjectMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.BaseElementFinder;

public class LoginPage extends BaseElementFinder {
    public LoginPage(WebDriver d){
        super(d);
    }

    public void goTo(){
        driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
    }
    public boolean enterEmail(String name) throws InterruptedException {
        WebElement nameEmail = getElementById("email",2000);
        if(nameEmail != null){
            nameEmail.sendKeys(name);
            return true;
        }
        return false;
    }
    public boolean enterPassword(String password) throws InterruptedException {
        WebElement passwordElement = getElementById("password",2000);
        if(passwordElement!=null){
            passwordElement.sendKeys(password);
            return true;
        }
        return false;
    }

    public boolean clickOnLogin(){
        WebElement loginElement = getElementByXpath("//input[@name='commit']",2000);
        if(loginElement!=null){
             loginElement.click();
             return true;
        }
        return false;
    }
    public boolean clickOnForgotPassword(){
        WebElement forgotPasswordElement = getElementByXpath("//a[contains(.,'Forgot Password')]",2000);
        if(forgotPasswordElement!=null){
            forgotPasswordElement.click();
            return true;
        }
        return false;
    }
    public boolean isCheckBoxTextDisplayed(){
        WebElement checkBoxTextElement =getElementByXpath("//label[contains(.,'Remember Me')]",2000);
        if(checkBoxTextElement !=null){
            return checkBoxTextElement.isDisplayed();
        }
        return false;
    }
    public boolean clickCheckBoxDisplayed() throws InterruptedException {
        WebElement checkBoxElement = getElementById("remember_me",2000);
        if(checkBoxElement!=null){
            checkBoxElement.click();
            return true;
        }
        return false;
    }
    public boolean clickOnSignUpButton(){
        WebElement signUpButton = getElementByXpath("//a[contains(.,'Sign Up')]",2000);
        if(signUpButton!=null){
            signUpButton.click();
            return true;
        }
        return false;
    }
    public boolean isRememberMeTextDisplayed(){
        WebElement rememberMeElement = getElementByXpath("//div[contains(.,'Log in')]/div",2000);
        if(rememberMeElement!=null){
            return rememberMeElement.isDisplayed();
        }
        return false;
    }

}
