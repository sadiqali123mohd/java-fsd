package listenerdemo;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ItestListernerClass  implements ITestListener{
	@Override 
	
	//Invoked each time before a test will be invoked.
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test has been Invoked");
		
	}
	//Invoked each time a test succeeds.
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Log : Test has been successfull");
	}
	
   // Invoked each time a test fails.
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Log: Test has failed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(" Log: Test has been skipped");
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Log: Test has been failed due to timeout");
	}
	
//	Invoked before running all the test methods belonging to the classes inside the <test> tag
	// and calling all their Configuration methods.	
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("The Main test has started");
	}
	//Invoked after all the test methods belonging to the classes inside the <test> tag have run
	// and all their Configuration methods have been called.
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("The Main test has Completed");
	}
	
	
}
