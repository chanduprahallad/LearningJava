import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RedBusPage extends BaseElementFinder{
    RedBusPage(WebDriver d) {
        super(d);
    }

    public boolean clickOnBusTicketTab()
    {
        WebElement busTicketElement = getElementByXpath("//a[@id='redBus'])",2000);
        if(busTicketElement!=null)
        {
            busTicketElement.click();
            return true;
        }
        return false;
    }
    public boolean clickOnRydeTab()
    {
        WebElement rYdeElement = getElementByXpath("//a[@id='rYde']",2000);
        if(rYdeElement!=null)
        {
            rYdeElement.click();
            return true;
        }
        return false;
    }
    public boolean clickOnRedRailTab()
    {
        WebElement redRailElement = getElementByPartialLinkText("//a[@class='nav-link active']",2000);
        if(redRailElement!=null)
        {
            redRailElement.click();
            return true;
        }
        return false;
    }
    public boolean clickOnHelp()
    {
        WebElement helpIcon = getElementByCssSelector("a[href='/info/redcare']",2000);
        if(helpIcon!=null)
        {
            helpIcon.click();
            return true;
        }
        return false;
    }
    public boolean manageBookingIcon()
    {
        WebElement manageBookingElement= getElementByXpath("//div[@class='manageHeaderLbl']",2000);
        if(manageBookingElement!=null)
        {
            manageBookingElement.click();
            return true;
        }
        return false;
    }
    public boolean manageBookingDropdown(int index)
    {

        WebElement manageBookingDropdownElement =getElementByXpath("//div[@class='icon-down icon ich dib mbh']",2000);
        Select selectManageBookingDropdown = new Select(manageBookingDropdownElement);
        if(manageBookingDropdownElement!=null)
        {
            selectManageBookingDropdown.selectByIndex(index);
            return true;
        }
        return false;
    }
    public boolean profilePicDropdown(String visibleText)
    {
        WebElement profilePicDropElement = getElementByXpath("//div[@id='sign-in-icon-down']",2000);
        Select selectProfilePicDropdown = new Select(profilePicDropElement);
        if(profilePicDropElement!=null)
        {
            selectProfilePicDropdown.selectByVisibleText(visibleText);
            return true;
        }
        return false;
    }
    public boolean redBusTitle() throws InterruptedException {
        WebElement redBusTitleElement = getElementById("welcome_image_div",2000);
        if(redBusTitleElement!=null)
            return true;
        return false;
    }
    public boolean enterFromPlace(String fromPlace)
    {
        WebElement fromPlaceElement = getElementByXpath("//input[@id='src']",2000);
        if(fromPlaceElement!=null)
        {
            fromPlaceElement.sendKeys(fromPlace);
            return true;
        }
        return false;
    }
    public boolean enterToPlace(String toPlace)
    {
        WebElement toPlaceElement = getElementByXpath("//input[@id='dest']",2000);
        if(toPlaceElement!= null)
        {
            toPlaceElement.sendKeys(toPlace);
            return true;
        }
        return false;
    }

}
