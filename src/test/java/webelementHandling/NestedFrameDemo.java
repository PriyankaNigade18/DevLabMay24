package webelementHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NestedFrameDemo {
  @Test
  public void nestedFrameTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  //top--->left
	  
//	  driver.switchTo().frame(0);
//	  //left frame
//	  driver.switchTo().frame("frame-left");
	  
	  driver.switchTo().frame(0).switchTo().frame("frame-left");
	  System.out.println("Left Frame Page Source");
	  System.out.println(driver.getPageSource());
	  
	  //come back to top frame
	  //driver.switchTo().parentFrame();
	  //Selects either the first frame on the page, or the main document when a page containsiframes.
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(0).switchTo().frame("frame-middle");
	  System.out.println("Page source for Middle frame");
	  System.out.println(driver.getPageSource());
	  
	  //come back
	  driver.switchTo().defaultContent();//top
	  driver.switchTo().frame(0).switchTo().frame("frame-right");
	  System.out.println("Page source for Right frame");
	  System.out.println(driver.getPageSource());
	  
	  //come back top
	  driver.switchTo().defaultContent();//top
	 
	  //go to bottom
	  driver.switchTo().frame(1);
	  System.out.println("Page source of Bottom frame is");
	  System.out.println(driver.getPageSource());
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
