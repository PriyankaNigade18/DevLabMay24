package waitScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Utility;

public class webdriverWaitDemo2 {
  @Test
  public void testExplicitWait() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  By btn=By.xpath("//button[normalize-space()='Start']");
	  
	  By text=By.xpath("//h4[normalize-space()='Hello World!']");
	  
	  
	  
	  driver.findElement(btn).click();
	  WebElement ele=Utility.waitForVisibilityOfElement(driver,text);
	 
	  String res=ele.getText();
	  System.out.println(res);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
