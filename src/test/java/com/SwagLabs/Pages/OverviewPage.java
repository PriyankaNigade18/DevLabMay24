package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage 
{
	
	private WebDriver driver;
	
	public OverviewPage(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	
	//locator
	private By pdetails=By.id("checkout_summary_container");
	private By fbtn=By.id("finish");
	private By msg=By.tagName("h2");
	
	
	//method
	
	public void getProductDetails()
	{
		System.out.println("Product Details are:");
		System.out.println(driver.findElement(pdetails).getText());
	}
	
	public void doComplete()
	{
		driver.findElement(fbtn).click();
		System.out.println(driver.findElement(msg).getText());
	}
	
	
	
	
	
	
	
	
	
	
	

}
