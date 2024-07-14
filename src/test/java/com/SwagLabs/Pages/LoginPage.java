package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utility.Utility;

public class LoginPage
{

	private WebDriver driver;
	
	//initialize driver
	public LoginPage(WebDriver driver)//base class
	{
		this.driver=driver;
	}
	
	//locators
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By btn=By.id("login-button");
	
	
	
	//methods
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getApptitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		Utility.addWait();
		driver.findElement(btn).click();
		
		
		
		
	}

	
	
	
}
