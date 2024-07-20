package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OverViewPageTest extends BaseClass
{
	@BeforeClass
	public void cartPageSetup()
	{
		lp.doLogin(pr.getData("un"),pr.getData("psw"));
		ip.addProductToCart(pr.getData("pname"));
		ip.getCartPage();
		cp.doCheckOut();
		chp.doContinue(pr.getData("fn"),pr.getData("ln"),pr.getData("zc"));
	}
	
	
  @Test(priority=1)
  public void varifyDetails() 
  {
	  op.getProductDetails();
  }
  
  
  
  @Test(priority=2)
  public void validateCheckout()
  {
	  op.doComplete();
  }
}
