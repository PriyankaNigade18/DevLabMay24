package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderTest {
  @Test
  public void slideraction() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/slider/");
	  
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  //ele
WebElement sliderele=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));


//Actions class
Actions act=new Actions(driver);
act.clickAndHold(sliderele).moveToElement(sliderele,200,0).build().perform();














	  
	  
  }
}
