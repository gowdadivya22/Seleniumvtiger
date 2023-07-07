package genericlibraries;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LiestenerImplementation implements ITestListener{
	ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/listen.html");
	ExtentReports report=new ExtentReports();
	public  static ExtentTest logger;
	@Override
	public void onTestStart(ITestResult result) {
		report.attachReporter(reporter);
		logger=report.createTest(result.getMethod().getMethodName());

	}
	@Override
	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "This test is passed "+ result.getMethod().getMethodName());

	}
	@Override
	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL,"This test is failed"+result.getMethod().getMethodName());
		logger.addScreenCaptureFromPath(ScreenshotUtility.takingScreenshot(result.getMethod().getMethodName()));

	}

	@Override
	public void onStart(ITestContext context) {
		report.attachReporter(reporter);
		
	}
	
	@Override
	public void onFinish(ITestContext context) {

		report.flush();
	}


}
