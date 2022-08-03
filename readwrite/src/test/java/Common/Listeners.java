package Common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;

import utilities.testutils;

public class Listeners extends testutils implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest test = extent.createTest(result.getTestClass().getName()+"::"+result.getMethod().getMethodName());
		Reporter.log("Method name is-"+result.getName());
		System.out.println("Test case is starting");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of Execution-"+result.getStatus());
		pass();
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed-screenshot captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fail();
		scrnsht();
		Reporter.log("<a href=\"D:\\Selenium\\Sel-Work-Space\\readwrite\\screenshot\\Sat-Jul-23-10-32-06-IST-2022.png\">Test Result</a>");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
