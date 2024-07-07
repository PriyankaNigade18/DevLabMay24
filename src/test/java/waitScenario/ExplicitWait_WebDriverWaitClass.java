package waitScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic.Utility;

public class ExplicitWait_WebDriverWaitClass
{
	
	
	
	
	
	
	
	
  @Test
  public void testWait() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locator
	  By email=By.id("input-email");
	  By password=By.name("password");
	  By btn=By.xpath("//input[@value='Login']");
	  
	  
	  boolean status=Utility.waitForUrlContains(driver,"login");
	  System.out.println("Url contains login?: "+status);
	  Utility.waitForElementPresent(driver,email).sendKeys("test@gmail.com");
	  Utility.waitForVisibilityOfElement(driver,password).sendKeys("test123");
	  Utility.waitForElementClickable(driver, btn).click();
	  
	  
	  
	  
	  
	  /*
	 // driver.findElement(email).sendKeys("test@gmail.com");
	  /*
	   * TimeoutException: Expected condition failed:
	   *  waiting for presence of element located by: By.id: input-email### 
	   *  (tried for 5 second(s) with 500 milliseconds interval)
	   *  
	   *  Selenium default timeout is 0.5 sec =500 milliseconds
	   *  interval time =Polling time
	   
	  //explicit Wait
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement emailele=wait.until(ExpectedConditions.presenceOfElementLocated(email));
	  
	  emailele.sendKeys("test@gmail.com");
	  
	  //password- visibility
	  WebDriverWait pass=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement pswele=pass.until(ExpectedConditions.visibilityOfElementLocated(password));
	  
	  pswele.sendKeys("test123");
	  
	  */
	  
	  
	  
	  
	  
	  
  }
}
