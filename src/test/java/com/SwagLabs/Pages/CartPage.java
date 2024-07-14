package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utility.Utility;

public class CartPage 
{
	private WebDriver driver;
	
	public CartPage (WebDriver driver)//base class
	{
		this.driver=driver;
		
	}
	
	//locators
	private By name=By.xpath("//div[@class='cart_item_label']//a//div");
	private By rbtn=By.xpath("//button[text()='Remove']");
	private By cshop=By.name("continue-shopping");
	private By checkbtn=By.id("checkout");
	
	
	//methods
	public void getProductDetails()
	{
		System.out.println("Product details: ");
		System.out.println(driver.findElement(name).getText());
	}
	
	
	public void doRemove()
	{
		driver.findElement(rbtn).click();
		Utility.addWait();
		
	}
	
	
	public void doContinueShopping()
	{
		driver.findElement(cshop).click();
		Utility.addWait();
		System.out.println("This navigate to Inventory page");
	}
	
	public String doCheckOut()
	{
		driver.findElement(checkbtn).click();
		Utility.addWait();
		return driver.getCurrentUrl();
	}

}
