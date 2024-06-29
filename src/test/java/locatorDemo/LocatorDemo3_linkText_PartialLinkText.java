package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3_linkText_PartialLinkText {

	public static void main(String[] args)
	{

		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		//NoSuchElementException
		//driver.findElement(By.name("Priyanka")).click();
			
		//link
		//driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.partialLinkText("In")).click();
		
		
		//Email
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		
		//checkbox
		driver.findElement(By.id("remember")).click();
		
		//button
		
		//driver.findElement(By.id("submit-id")).click();
		
		//InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-default btn-primary")).click();
		
		driver.findElement(By.className("btn-primary")).click();
		
		
		
		

	}

}
