package realTimeAnnotationUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRMApplication {
  @Test
  public void testlogin()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://automationplayground.com/crm/");
	  System.out.println("Application title: "+driver.getTitle());
	  
	  //sign In link validation
	  driver.findElement(By.linkText("Sign In")).click();
	  
	  //login
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
	  driver.findElement(By.id("submit-id")).click();
	  System.out.println("Application current url: "+driver.getCurrentUrl());
	  	
	  driver.quit();
  }
}
