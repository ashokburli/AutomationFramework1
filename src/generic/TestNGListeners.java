package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners extends BaseTest implements ITestListener {

	//BaseTest b=new BaseTest();

	@Override
	public void onTestStart(ITestResult result) {


	}

	@Override
	public void onTestSuccess(ITestResult result) {
		

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testmethodName=result.getName();
		takescreenshot(testmethodName);

	}

	@Override
	public void onTestSkipped(ITestResult result) {


	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {


	}

	@Override
	public void onFinish(ITestContext context) {


	}

}
