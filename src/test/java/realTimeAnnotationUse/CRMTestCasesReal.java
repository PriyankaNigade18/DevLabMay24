package realTimeAnnotationUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class CRMTestCasesReal extends BaseTest
{
		
  @Test(priority=1)
  public void validateLink()
  {
	    
	  //sign In link validation
	  driver.findElement(By.linkText("Sign In")).click();
  }
  
  @Test(priority=2)
  public void validateLogin()
  {

	  //login
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
	  driver.findElement(By.id("submit-id")).click();
	 
 
  }
  
  
}
