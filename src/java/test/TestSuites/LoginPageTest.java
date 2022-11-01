package test.TestSuites;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;
import test.PageObjectMethods.LoginPage;

public class LoginPageTest extends BaseTest {
    @Test
    public void enterValidUsernameAndValidPassword() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.goTo();
        Assert.assertTrue(lp.enterEmail("chanduprahallad5@gmail.com"));
        Assert.assertTrue(lp.enterPassword("Chandub5@."));
        Assert.assertTrue(lp.clickOnLogin());

    }
//    @Test
//    public void enterInvalidUsernameAndValidPassword() throws InterruptedException {
//        LoginPage lp = new LoginPage(chromeSetup());
//        lp.goTo();
//        Assert.assertTrue(lp.enterEmail("chanduprahallad@gmail.com"));
//        Assert.assertTrue(lp.enterPassword("Chandub5@."));
//        Assert.assertTrue(lp.clickOnLogin());
//
//    }
//    @Test
//    public void enterValidUsernameAndInvalidPassword() throws InterruptedException {
//        LoginPage lp = new LoginPage(chromeSetup());
//        lp.goTo();
//        Assert.assertTrue(lp.enterEmail("chanduprahallad5@gmail.com"));
//        Assert.assertTrue(lp.enterPassword("Chandub5."));
//        Assert.assertTrue(lp.clickOnLogin());
//
//    }
//    @Test
//    public void enterInvalidUsernameAndInvalidPassword() throws InterruptedException {
//        LoginPage lp = new LoginPage(chromeSetup());
//        lp.goTo();
//        Assert.assertTrue(lp.enterEmail("chanduprahallad@gmail.com"));
//        Assert.assertTrue(lp.enterPassword("Chandub5."));
//        Assert.assertTrue(lp.clickOnLogin());
//
//    }
//    @Test
//    public void noUsernameAndNoPassword() throws InterruptedException {
//        LoginPage lp = new LoginPage(chromeSetup());
//        lp.goTo();
//        Assert.assertTrue(lp.enterEmail(""));
//        Assert.assertTrue(lp.enterPassword(""));
//        Assert.assertTrue(lp.clickOnLogin());
//
//    } @Test
//    public void enterValidUsernameAndNoPassword() throws InterruptedException {
//        LoginPage lp = new LoginPage(chromeSetup());
//        lp.goTo();
//        Assert.assertTrue(lp.enterEmail("chanduprahallad5@gmail.com"));
//        Assert.assertTrue(lp.enterPassword(""));
//        Assert.assertTrue(lp.clickOnLogin());
//
//    } @Test
//    public void enterNoUsernameAndValidPassword() throws InterruptedException {
//        LoginPage lp = new LoginPage(chromeSetup());
//        lp.goTo();
//        Assert.assertTrue(lp.enterEmail(""));
//        Assert.assertTrue(lp.enterPassword("Chandub5@."));
//        Assert.assertTrue(lp.clickOnLogin());
//
//    }
//    @Test
//    public void forgotPassword() throws InterruptedException {
//        LoginPage lp = new LoginPage(chromeSetup());
//        lp.goTo();
//       Assert.assertTrue(lp.clickOnForgotPassword());
//
//    }
//    @Test
//    public void refreshThePage() throws InterruptedException {
//        LoginPage lp = new LoginPage(chromeSetup());
//        lp.goTo();
//        Assert.assertTrue(lp.enterEmail("chanduprahallad5@gmail.com"));
//        Assert.assertTrue(lp.enterPassword("Chandub5@."));
//        driver.navigate().refresh();
//
//    }

}
