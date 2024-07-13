package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragnDropAction {
  @Test
  public void dragndropTest() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/#default");
	  driver.manage().window().maximize();
	  
	  driver.switchTo().frame(0);
	    
	  //ele
	  
	  WebElement src=driver.findElement(By.id("draggable"));
	  WebElement dest= driver.findElement(By.id("droppable"));
	  
	  //Actions class
	  Actions act=new Actions(driver);
	  act.dragAndDrop(src,dest).perform();
	  
	  
	  
	  
  }
}
