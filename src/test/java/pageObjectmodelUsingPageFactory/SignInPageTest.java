package pageObjectmodelUsingPageFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyTitle()
  {
	  
	  //SignInPage sp= PageFactory.initElements(driver,SignInPage.class);
	  String actTitle=sp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Service"),"Test Fail: Title not mached!");
	  System.out.println("Test Pass: Title mached!");
  }
  
  
  @Test(priority=2)
  public void verifyText()
  {
	  sp.getPageText();
  }
  
  
  
  @Test(priority=3)
  public void validateSignIn()
  {
	  String url=sp.doSignIn();
	  Assert.assertTrue(url.contains("login"),"Navigation Fail");
	  System.out.println("Navigation Pass!");
  }
}
