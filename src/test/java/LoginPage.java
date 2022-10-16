import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BaseElementFinder {
    LoginPage(WebDriver d) {
        super(d);
    }
    public void goTo(String url)
    {
        driver.get(url);
    }


    public boolean enterUserName(String user) throws InterruptedException {

       WebElement we =getElementById("username",5000);
       if((we!=null)) {
           we.sendKeys(user);
           return true;
       }
       return false;
    }
    public boolean enterPassWord(String pwd){

        WebElement enterpwd = getElementByName("password",3000);
        if(enterpwd!=null)
        {
            enterpwd.sendKeys(pwd);
            return true;
        }
        return false;

    }

    public boolean clickAdminRadioButton()
    {
        WebElement adminBtn = getElementByXpath("//div[@class='form-check-inline']//label[1]//span[2]",3000);
        if(adminBtn!=null)
        {
            adminBtn.click();
            return true;
        }
        return false;


    }
    public boolean clickUserRadioButton()
    {
        WebElement byXpath = getElementByXpath("(//span[@class='checkmark'])[2]",2000);
        if(byXpath!=null)
        {
            byXpath.click();
            return true;
        }
        return false;
    }
    public boolean clickOnOkInModel() throws InterruptedException {

        WebElement byXpath = getElementById("myModal",2000);
        WebElement okayBtnRef = getElementById(byXpath,"okayBtn");
        if(okayBtnRef.isDisplayed())
        {
            okayBtnRef.click();
            return true;
        }
        return false;
    }

    public boolean selectDropDown(int index)
    {
        WebElement drpdwn = getElementByXpath("//select[@class='form-control']",2000);
        Select s =  new Select(drpdwn);
        if(drpdwn!=null){
            s.selectByIndex(index);
            return true;
        }
        return false;


    }
    public boolean clickOnCheckBox() throws InterruptedException {
        WebElement clickCheckBox = getElementByXpath(("//input[@id='terms']"),2000);
        if(clickCheckBox!=null)
        {
            clickCheckBox.click();
            return true;
        }

        return false;
    }
    public boolean signInButton() throws InterruptedException {
        WebElement checkSignIn = getElementByXpath("//input[@id='signInBtn']",2000);
        if(checkSignIn!=null)
        {
            checkSignIn.click();
            return true;
        }
        return false;
    }
    public boolean validateTermsAndConditionsMessage()
    {
        WebElement textPresent = getElementByCssSelector(".text-white.termsText",2000);
        String actualText = textPresent.getText();
        String expectedText = "I Agree to the terms and conditions";
        return expectedText.equals(actualText);
    }
    public boolean isSignInSuccessful(){
        WebElement shopNameElement =getElementByCssSelector("h1[class='my-4']",2000);
        if(shopNameElement!=null){
            return true;
        }
        return false;
    }
}
