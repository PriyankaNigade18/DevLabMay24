package mouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverAction {
  @Test
  public void mouseOverTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
	  
	 
	 //ele
	 
	 driver.switchTo().frame("iframeResult");
	 
	 WebElement ele=driver.findElement(By.xpath("//img[@alt='Smiley']"));
	 
	 Actions act=new Actions(driver);
	 act.moveToElement(ele).perform();
	 
	 
	 
  }
}
