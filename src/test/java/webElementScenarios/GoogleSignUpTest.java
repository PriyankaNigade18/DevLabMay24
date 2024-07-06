package webElementScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSignUpTest {
  @Test
  public void testgoogle() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();	  
	  //signin
	  driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
	  
	  
	  //email
	  driver.findElement(By.id("identifierId")).sendKeys("hiteshi.test.13@gmail.com");
	  
	  //next
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	  
	  
	  
  }
}
