package pageObjectmodelUsingPageFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRMLoginTest extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		sp.doSignIn();	
	}
	
	
  @Test
  public void validateLogin()
  {
	  lp.doLogin("test@gmail.com","test123");
  }
}
