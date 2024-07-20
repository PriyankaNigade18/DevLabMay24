package reports;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Event implements ITestListener 
{

	public void onTestFailure(ITestResult test)
	{
		System.out.println("Test Fail: "+test.getName());
	}
	
	public void onTestSuccess(ITestResult test)
	{
		System.out.println("Test Pass: "+test.getName());
	}
	
	
}
