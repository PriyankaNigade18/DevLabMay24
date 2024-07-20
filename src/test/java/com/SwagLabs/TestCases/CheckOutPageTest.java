package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckOutPageTest extends BaseClass
{
	@BeforeClass
	public void cartPageSetup()
	{
		lp.doLogin(pr.getData("un"),pr.getData("psw"));
		ip.addProductToCart(pr.getData("pname"));
		ip.getCartPage();
		cp.doCheckOut();
	}
	
	
  @Test
  public void validateCheckOut()
  {
	  chp.doContinue("Priyanka", "Nigade", "411047");
  }
}
