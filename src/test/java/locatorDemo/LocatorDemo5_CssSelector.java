package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_CssSelector {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//signIn
		driver.findElement(By.cssSelector("a#SignIn")).click();
		
		//email
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.cssSelector("input.form-control#password")).sendKeys("test123");
		
		//check box
		
		driver.findElement(By.className("input#remember")).click();
		
		//submit
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-primary")).click();
		

	}

}
