package webElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RedBusDropdown_Automation {
  @Test
  public void redbusTest() 
  {
	  
	  //customize-disable notification
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  WebElement fromele=driver.findElement(By.id("src"));
	  
	  fromele.click();
	  fromele.sendKeys("pune");
	  
	  List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//li//text[@class='placeHolderMainText']"));
	  System.out.println("Total Options are: "+alloptions.size());
	  
	  for(WebElement i:alloptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Kharadi"))
		  {
			  i.click();
			  break;
		  }
			  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
