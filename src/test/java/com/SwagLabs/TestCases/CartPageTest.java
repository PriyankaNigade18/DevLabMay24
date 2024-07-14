package com.SwagLabs.TestCases;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class CartPageTest extends BaseClass
{
	
	@BeforeClass
	public void cartPageSetup()
	{
		lp.doLogin(pr.getData("un"),pr.getData("psw"));
		ip.addProductToCart(pr.getData("pname"));
		ip.getCartPage();
	}
  @Test(priority=1)
  public void verifyProduct()
  {
	  cp.getProductDetails();
  }
  
 
  @Test(priority=2)
  public void verifyRemove()
  {
	  cp.doRemove();
  }
  
  @Test(priority=3)
  public void verifyContinueShopping()
  {
	  cp.doContinueShopping();
	  ip.addProductToCart(pr.getData("pname2"));
	  ip.getCartPage();
  }
  
  @Test(priority=4)
  public void verifyCheckout()
  {
	  cp.doCheckOut();
  }
}
