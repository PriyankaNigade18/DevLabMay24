package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.SwagLabs.Utility.Utility;

public class InventoryPage 
{
	private WebDriver driver;
	
	public InventoryPage (WebDriver driver)//base class
	{
		this.driver=driver;
	}
	
	
	//locators
	private By pcount=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name ']");
	private By addcartbtn=By.id("add-to-cart");
	private By cartbtn=By.id("shopping_cart_container");
	
	
	
	
	//methods
	public int getProductCount()
	{
		return driver.findElements(pcount).size();
	}
	
	public void getProductNames()
	{
		List<WebElement> list=driver.findElements(pcount);
		System.out.println("*****Product List*******");
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		Utility.addWait();
		
	}
	
	public void addProductToCart(String pname)
	{
		List<WebElement> list=driver.findElements(pcount);
		
		for(WebElement i:list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				Utility.addWait();
				break;
			}
		}
		
		//click on add to cart btb
		driver.findElement(addcartbtn).click();
		Utility.addWait();
		System.out.println("Product added: "+pname);
	}
	
	public void getCartPage()
	{
		driver.findElement(cartbtn).click();
		Utility.addWait();
	}
	
	
	

}
