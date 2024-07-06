package webElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HesdLessTesting {
  @Test
  public void headless() 
  {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--headless");
	  
	  // Create a driver session
		WebDriver driver=new ChromeDriver(options);
		System.out.println("Driver session is created!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		System.out.println("Google application  is Opened!");
		
		driver.findElement(By.name("q")).sendKeys("testng");
		System.out.println("search for testng");
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	
		System.out.println("Printing result.......");
		for(WebElement i:list)
	{
		System.out.println(i.getText());
	}
		
		
		driver.quit();
		System.out.println("Browser closed!");
		
		
	  
	  
  }
}
