package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
	
	@BeforeClass
	public void pageSetUp()
	{
		lp.doLogin(pr.getData("un"),pr.getData("psw"));
	}
	
  @Test(priority=1)
  public void verifyTotalProducts() 
  {
	  int count=ip.getProductCount();
	  Assert.assertEquals(count,6,"Test Fail: Product count not matched!");
	  System.out.println("Test Pass: Product count is matched!: "+count);
  }
  
  
  @Test(priority=2)
  public void verifyProducts() 
  {
	  ip.getProductNames();
	
  }
  
  
  @Test(priority=3)
  public void validateAddToCart() 
  {
	  ip.addProductToCart(pr.getData("pname"));
  }
  
  @Test(priority=4)
  public void verifyCartPage() 
  {
	  ip.getCartPage();
  }
}
