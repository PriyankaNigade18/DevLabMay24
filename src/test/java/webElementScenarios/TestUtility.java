package webElementScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Utility;

public class TestUtility {
  @Test
  public void amazonTest()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  WebElement ele=driver.findElement(By.id("searchDropdownBox"));
	  Utility.selectBasedDropdown(ele,"Baby");
	  
	  
	  
  }
}
