package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartLoginTest {

	public static void main(String[] args) 
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
		//email-Id
		driver.findElement(By.id("input-email")).sendKeys("testmay2024@gmail.com");
		
		//password
		
		driver.findElement(By.name("password")).sendKeys("test123");
		/*
		 * InvalidSelectorException: Compound class names not permitted
		 */
		//click on login btn
		//driver.findElement(By.className("btn btn-primary")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
