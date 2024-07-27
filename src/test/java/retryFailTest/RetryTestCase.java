package retryFailTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestCase {
  @Test
  public void testCase1() 
  {
	  Assert.assertEquals(true,true,"Test Case Fail!");
	  System.out.println("Test Case pass!");
  }
  
  
  @Test(retryAnalyzer = retryFailTest.RetryTest.class)
  public void testCase2() 
  {
	  Assert.assertEquals(true,false,"Test Case Fail!");
	  System.out.println("Test Case pass!");
  }
  
}
