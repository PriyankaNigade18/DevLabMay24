package externalDataForTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo 
{
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	public static void scrollUpToEle(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
	}
	
	public static String getTitleJs(WebDriver driver)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 return js.executeScript("return document.title").toString();
		  
	}
	
	
	public static void refreshWithJs(WebDriver driver)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 
		 js.executeScript("history.go(0)");
	}
	public static void ClickOnElementJs(WebDriver driver,WebElement ele)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();",ele);
		
	}
	
	
	@Test
	public void getalertUsingJS()
	{
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in");
		  
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("alert('Hello All I am Js alert')");
		  
		  
	}
	@Test
	public void clickonelementwithJs()
	{
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in");
		  
		  WebElement ele=driver.findElement(By.linkText("Mobiles"));
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();",ele);
		  
		  
	}
	
	
	@Test
	public void refreshwithJs()
	{
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in");
		  
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("history.go(0)");
		  
		  
	}
	
	
	@Test
	public void getTitleUsingJS()
	{
		 WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in");
		  
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  String actTitle=js.executeScript("return document.title").toString();
		  
		  System.out.println(actTitle);
		  
		  
	}
	
	
  @Test
  public void testJavaScriptFunctions() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  
	  scrollDown(driver);
	  
	  Thread.sleep(1500);
	  
	  scrollUp(driver);
	  
	  Thread.sleep(1500);
	  
	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Electric scooters')]")); 
	  scrollUpToEle(driver,ele);
	 
	  
	  
	   
	  
	  
	  
	  
	  
	  
	//up to the element 
//	 
//	  JavascriptExecutor js=(JavascriptExecutor) driver;
//	    
//	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
//	  
	  
	  /*
	  //scroll-down
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(1000);
	  
	  //scroll-up
	  
	  js.executeScript("window.scrollTo(document.body.scrollHeigth,0)");
	  //scroll to the element
	  
	  */
	  
	  
	  
	  
	  
  }
}
