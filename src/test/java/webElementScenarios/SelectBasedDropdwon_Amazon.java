package webElementScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectBasedDropdwon_Amazon {
  @Test
  public void amazonDropdownTest() throws InterruptedException
  {
	  
	  //create a driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.amazon.in");
	  
	  
	  //dropdown address
	  WebElement ele1=driver.findElement(By.id("searchDropdownBox"));
	  
	  //select tag based-->Select class
	  
	  Select ddele=new Select(ele1);
	  
	  System.out.println("Is dropdown support multiple sleection?: "+ddele.isMultiple());
	  
	  //single selection
	  ddele.selectByIndex(3);
	  Thread.sleep(2000);
	  ddele.selectByValue("search-alias=baby");
	  Thread.sleep(2000);
	  ddele.selectByVisibleText("Gift Cards");
	  
	  /*
	   * all opetions
	   * 
	   * To get number of options
	   * select any specific option
	   * 
	   */
	  
	  List<WebElement> allOptions=ddele.getOptions();
	  System.out.println("Total Options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Prime Video"))
		  {
			  i.click();
			  System.out.println("Option is selected!");
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
