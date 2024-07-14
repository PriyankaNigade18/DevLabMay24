package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl()
  {
	  String url=lp.getAppUrl();
	  Assert.assertTrue(url.contains("demo"),"Test Fail:Url is Not matched!");
	  System.out.println("Test Pass: Url is matched!: "+url);
  }
  
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String title=lp.getApptitle();
	  Assert.assertTrue(title.contains("Labs"),"Test Fail:Title is Not matched!");
	  System.out.println("Test Pass: Title is matched!: "+title);
  }
  
  @Test(priority=1)
  public void validateLogin() 
  {
	  lp.doLogin(pr.getData("un"),pr.getData("psw"));
	
	  Assert.assertTrue(lp.getAppUrl().contains("inventory"),"Test Fail: Login Fail");
	  System.out.println("Test Pass: LoginCompleted!");
	  
  }
}
