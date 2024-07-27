package retryFailTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer
{

	int count=1;
	
	@Override
	public boolean retry(ITestResult result)
	{
		if(count<=3)
		{
			count ++;
			return true;
			
		}
	
		return false;
	}

}
