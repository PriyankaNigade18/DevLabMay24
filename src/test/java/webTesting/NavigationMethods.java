package webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com");
		
		//title
		System.out.println("Title is: "+driver.getTitle());
		
		Thread.sleep(2000);
		//to(url)
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(2000);
		//back()
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//forward()
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		//refresh()
		driver.navigate().refresh();
		
		
		
		
		
		
		

	}

}
