import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class LoginPageTest extends LoginPageFunctionality implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test case failed : "+iTestResult.getName());
        File file = ((TakesScreenshot) ListenersTest.driver).getScreenshotAs(OutputType.FILE);
        File destinationPath = new File("C:\\Users\\chandu\\IdeaProjects\\LearningJava\\src\\main\\resources\\screenshots\\"+iTestResult.getName()+"_"+iTestResult.getTestClass()+".png");
        try {
            FileUtils.copyFile(file,destinationPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
