package webElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Goibibo_DropdownAutomation {
  @Test
  public void testDropdown()
  {
	  
	  //create driver session
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.goibibo.com/flights/");
	  
	  
	  //from
	  driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
	  
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
	  
	  
	  //list
	  List<WebElement> list=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
	  
	  System.out.println("Total options are: "+list.size());
	  
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Pantnagar, India "))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
  }

  
  
  
  
}
