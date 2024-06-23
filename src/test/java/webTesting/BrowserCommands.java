package webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args)
	{

		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		
		//To open application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//To get  the title- getTitle()
		System.out.println("Title is: "+driver.getTitle());
		
		//To get current url
		System.out.println("Current url is: "+driver.getCurrentUrl());
		
		//To get page source -getPageSource()
		System.out.println(driver.getPageSource());
		
		//To close browser
		driver.close();
	}

}
