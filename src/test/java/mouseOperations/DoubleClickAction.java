package mouseOperations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickAction {
  @Test
  public void doubleClickTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //ele
	  WebElement ele=driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
	  
	  //actions
	  Actions act=new Actions(driver);
	  act.doubleClick(ele).perform();
	  
	  //alert window
	  Thread.sleep(2000);
	  
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Text of Alert is: "+alt.getText());
	  alt.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
