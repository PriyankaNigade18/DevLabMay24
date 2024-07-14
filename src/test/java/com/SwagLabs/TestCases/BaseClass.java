package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utility.PropertiesUtil;

public class BaseClass 
{
	
	public WebDriver driver;
	public LoginPage lp;
	public PropertiesUtil pr;
	public InventoryPage  ip;
	public CartPage cp;
	
	
	@BeforeTest
	public void BrowserSetUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pr=new PropertiesUtil("config");
		driver.get(pr.getData("url"));
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage(driver);
		
	}
	
	

}
