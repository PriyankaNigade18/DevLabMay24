package webelementHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingDemo1 {
  @Test
  public void frameTest() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/frames");
	  
	  //frame-indexing
	  //driver.switchTo().frame(4);
	  
	  //frame -id/name
	  //driver.switchTo().frame("frame1");
	  
	  //frame with webElement
	  WebElement frameEle=driver.findElement(By.id("frame1"));
	  
	  driver.switchTo().frame(frameEle);
	  
	  
	  String msg=driver.findElement(By.id("sampleHeading")).getText();
	  System.out.println("Text from frame is: "+msg);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
