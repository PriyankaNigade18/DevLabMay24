package mouseOperations;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickAction {
  @Test
  public void rightclickTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //button
	  WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //Actions class
	  Actions act=new Actions(driver);
	  act.contextClick(ele).perform();
	  
	  //right click action
	  List<WebElement> list=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  
	  System.out.println("Number of options are: "+list.size());
	  
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Copy"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  //alert box will open
	  Thread.sleep(2000);
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Text of alert is: "+alt.getText());
	  alt.accept();
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
