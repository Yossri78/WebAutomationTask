package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class TestListeners implements ITestListener {

    ExtentTest test;
    ExtentReports extent = ReportFactory.getReportInstance();

    public TestListeners() throws IOException {
    }

    @Override
    public void onTestStart(ITestResult result) {
      test= extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS,"Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.log(Status.FAIL,"Test Failed");
        test.fail(result.getThrowable());

    }

    @Override
    public void onFinish(ITestContext result) {
        extent.flush();
    }


}
