package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TimeOutsAttribute 
{
  @Test
  public void testcase1()
  {
	  System.out.println("This is testcase 1");
	  
  }
  
  @Test(timeOut = 3000 )
  public void testcase2() throws InterruptedException
  {
	  System.out.println("This is testcase 2");
	  Thread.sleep(4000);
	  
  }
}
