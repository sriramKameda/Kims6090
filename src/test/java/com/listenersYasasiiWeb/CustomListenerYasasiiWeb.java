package com.listenersYasasiiWeb;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import com.relevantcodes.extentreports.LogStatus;


public class CustomListenerYasasiiWeb extends TestBaseYasasiiWeb implements ITestListener{
		public void onTestFailure(ITestResult args0) {
		
		test.log(LogStatus.FAIL, args0.getName().toUpperCase()+ "FAILED with Exception:" +args0.getThrowable());
		//test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));
		 rep.endTest(test);
	     rep.flush();

	}

	public void onTestSuccess(ITestResult argsO) {
		
		TestBaseYasasiiWeb.test.log(LogStatus.PASS,argsO.getName().toUpperCase()+ "PASS");
        rep.endTest(test);
        rep.flush();
		
	}

	

}
