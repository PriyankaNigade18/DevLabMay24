package generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 

{
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		  
		  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
		  
		  List<WebElement> allOptions=dd.getOptions();
		  System.out.println("Total options are: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
	}
	
	
	
	
	public static void dynamicDropdown(WebDriver driver,By loc,String value)
	{
		List<WebElement> alloptions=driver.findElements(loc);
		  System.out.println("Total Options are: "+alloptions.size());
		  
		  for(WebElement i:alloptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
				  
		  }
		  
		  
		  
		
	}
	
	
	public static WebElement waitForElementPresent(WebDriver driver,By loc)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	public static WebElement waitForVisibilityOfElement(WebDriver driver,By loc)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	public static WebElement waitForElementClickable(WebDriver driver,By loc)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	public static boolean waitForTitleContains(WebDriver driver,String title)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait.until(ExpectedConditions.titleContains(title));
	}
	
	public static boolean waitForUrlContains(WebDriver driver,String url)
	{
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait.until(ExpectedConditions.urlContains(url));
	}
	
	
	
	
	

}
