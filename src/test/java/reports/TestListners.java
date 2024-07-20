package reports;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListners 
{
  @Test(priority=1)
  public void registerTest()
  {
	  Assert.assertEquals(false,false,"Registration Fail");
	  System.out.println("User Registration completed! ");
  }
  
  @Test(priority=2)
  public void loginTest()
  {
	  Assert.assertEquals(true,false,"Login Fail");
	  System.out.println("User login completed! ");
  }
}
