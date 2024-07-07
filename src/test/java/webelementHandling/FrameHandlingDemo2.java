package webelementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingDemo2 {
  @Test
  public void frameTest() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
	  
	  
	  //frame
	  driver.switchTo().frame("globalSqa");
	  
	  
	  //search
	  driver.findElement(By.id("s")).sendKeys("books");
	  
	  driver.findElement(By.xpath("//button[@class='button_search']")).click();
	  
	  //result
	  List<WebElement> results=driver.findElements(By.xpath("//ol[@class='search_res']//li//div//h3//a"));
	  System.out.println("Total results for books: "+results.size());
	  
	  Thread.sleep(1000);
	  System.out.println("***********Books Headings************");
	  for(WebElement i:results)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	
	  
	  
  }
}
