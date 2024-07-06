package webElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.Utility;

public class Facebook_DropdownAutomation
{
	
	
  @Test
  public void facebookTest() 
  {
	  //create a driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.facebook.com/");
	  
	  //signup
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //day
	  WebElement day=driver.findElement(By.id("day"));
	  Utility.selectBasedDropdown(day,"24");
	  
	  
	  //month
	  WebElement month=driver.findElement(By.id("month"));	  
	  Utility.selectBasedDropdown(month,"Sep");
	  
	  //year
	  WebElement year=driver.findElement(By.id("year"));
	  Utility.selectBasedDropdown(year,"2014");
	  
	  
	  
	  
//	  Select daydd=new Select(day);
//	  
//	  System.out.println("Is dropdown support multiple selection?: "+daydd.isMultiple());
//	  
//	  List<WebElement> allOptions=daydd.getOptions();
//	  System.out.println("Total options are: "+allOptions.size());
//	  
//	  for(WebElement i:allOptions)
//	  {
//		  if(i.getText().contains("27"))
//		  {
//			  i.click();
//			  break;
//		  }
//	  }
	  
	  //month
	  
//	  Select dd2=new Select(month);
//	  System.out.println("Is dropdown supported for multiple selection: "+dd2.isMultiple());
//	  List<WebElement> options=dd2.getOptions();
//    System.out.println("Total options are: "+options.size());
//	  
//	  for(WebElement i:options)
//	  {
//		  if(i.getText().contains("Dec"))
//		  {
//			  i.click();
//			  break;
//		  }
//	  }
//	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //month
	  
	  //year
	  
	  
	  
	  
	  
  }
}
