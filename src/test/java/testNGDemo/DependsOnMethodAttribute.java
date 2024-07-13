package testNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodAttribute 
{
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("This is register test");
	  AssertJUnit.assertEquals(false,true);
  }
  
  @Test(priority=2,dependsOnMethods ="registerTest")
  public void loginTest()
  {
	  System.out.println("This is login test");
  }
  
  @Test(priority=3,dependsOnMethods ="loginTest")
  public void logoutTest()
  {
	  System.out.println("This is logout test");
  }
}
