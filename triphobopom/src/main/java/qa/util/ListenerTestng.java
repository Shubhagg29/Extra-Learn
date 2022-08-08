package qa.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import qa.base.TestBase;

public class ListenerTestng implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(">-----TestNg Listener Started---->");
		
		//ITestListener.super.onTestSuccess(result);
	
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(">-----Test Passed---->"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(">-----Test Failed---->"+result.getName());
       TestBase.getScreenShot();
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
