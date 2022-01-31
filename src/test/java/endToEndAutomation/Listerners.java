package endToEndAutomation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReporterNG;
import resources.base;
import resources.base2;

public class Listerners extends base2 implements ITestListener {
//	ExtentTest test;
//	ExtentReports extent=ExtentReporterNG.getReportObject();
//	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		 test=extent.createTest(result.getMethod().getMethodName());
		 extentTest.set(test);
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//test.log(Status.PASS, "Test Passed");
		extentTest.get().log(Status.PASS, "Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().fail(result.getMethod().getMethodName());
		extentTest.get().fail(result.getThrowable());
		WebDriver driver=null;
		String testMethodName=result.getMethod().getMethodName();
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			extentTest.get().addScreenCaptureFromPath(captureScreenshot(testMethodName,driver),result.getMethod().getMethodName());
			//getScreenShotPath(testMethodName,driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}

}
