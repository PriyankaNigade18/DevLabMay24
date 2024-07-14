package pageObjectModelDesign;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	 // LoginPage lp=new LoginPage();
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("login"),"Test Fail:Url noty matched!");
	  System.out.println("Test Pass: Url matched!");
  }
  
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String title=lp.getAppTitle();
	  Assert.assertTrue(title.contains("Login"),"Test Fail:Title not matched!");
	  System.out.println("Test Pass: Title matched!");
  }
  
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  String url=lp.doLogin("test@gmail.com","test123");
	  Assert.assertTrue(url.contains("customers"),"Test Fail:Login Fail");
	  System.out.println("Test Pass: Login Completed!");
  }
}
