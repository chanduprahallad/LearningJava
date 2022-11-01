package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseElementFinder {
        public WebDriver driver;

        public BaseElementFinder(WebDriver d) {
            this.driver = d;
        }

        public WebElement getElementById(String input, long time) throws InterruptedException {
            By by = By.id(input);
            WebElement byid = this.driver.findElement(by);
            Thread.sleep(time);
            return byid;
        }

        public WebElement getElementByName(String input, long time) {
            By by = By.name(input);
            WebElement byname = this.driver.findElement(by);
            return byname;
        }

        public WebElement getElementByClassName(String input, long time) {
            By by = By.className(input);
            WebElement byClassName = this.driver.findElement(by);
            return byClassName;
        }

        public WebElement getElementByXpath(String input, long time) {
            By by = By.xpath(input);
            WebElement byxpath = this.driver.findElement(by);
            return byxpath;
        }

        public WebElement getElementByTagName(String input, long time) {
            By by = By.tagName(input);
            WebElement byTagname = this.driver.findElement(by);
            return byTagname;
        }

        public WebElement getElementByCssSelector(String input, long time) {
            By by = By.cssSelector(input);
            WebElement byCss = this.driver.findElement(by);
            return byCss;
        }

        public WebElement getByLinkText(String input, long time) {
            By by = By.linkText(input);
            WebElement byLinkText = this.driver.findElement(by);
            return byLinkText;
        }

        public WebElement getElementByPartialLinkText(String input, long time) {
            By by = By.partialLinkText(input);
            WebElement byPartialLinkText = this.driver.findElement(by);
            return byPartialLinkText;
        }

        public WebElement getElementById(WebElement element, String input) {
            By by = By.id(input);
            WebElement ew = element.findElement(by);
            return ew;
        }

}
