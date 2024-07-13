package testNGDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
  //@Test
  public void hardAssertionTest()
  {
	  String act="Selenmium WebDriver is an API for WEbUI test";
	  String exp="APII";
	  //java.lang.AssertionError- for assertion failure
//	  Assert.assertEquals(act,exp,"Test Fail: Strings are not equal!");
//	  System.out.println("Test Pass:Strings are equal!");
	  
	  
//	  Assert.assertTrue(act.contains(exp),"Test Fail: String doesnt contains API");
//	  System.out.println("Test Pass: Api is available");
	  
	  Assert.assertFalse(act.contains(exp),"Test Fail:Actual string does contains exp string ");
	  System.out.println("Test PAss: Actual string doesn't contains exp string");
	  
	  
	  
  }
  
  
  
  @Test
  public void softAssertionTest()
  {
	  
	  int a=10,b=20;
	  SoftAssert sf=new SoftAssert();
	  Assert.assertEquals(a,b,"Test Fail: Numbers are not equal");
	  System.out.println("Test Pass: Numbers are equal");
	  
	  sf.assertAll();
	  
	  
	  
  }
  
  
  
  
  
}
