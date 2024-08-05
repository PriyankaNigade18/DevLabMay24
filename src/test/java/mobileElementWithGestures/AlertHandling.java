package mobileElementWithGestures;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertHandling 
{
	/*
	 * Selenium provide Alert interface
	 * Ok==>accept()
	 * Cancle====>dismiss()
	 * text===>getText()
	 * Prompt---->sendKeys()
	 * 
	 */


  @Test
  public void testAlerts() throws InterruptedException 
  {
	  //create a driver session
	  
	  AppiumDriver driver=Utility.androidDriverSession();
	  
	  //app
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  //alert
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //alert1
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  //alert window open
	  Thread.sleep(2000);
	  
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt1.getText());
	  alt1.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
