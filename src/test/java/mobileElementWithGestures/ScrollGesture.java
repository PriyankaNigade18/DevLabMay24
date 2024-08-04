package mobileElementWithGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGesture {
  @Test
  public void testScroll() throws InterruptedException 
    {
	  
	  //create driver session
	  AppiumDriver driver=Utility.androidDriverSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //area as element
	  WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
    
	  Utility.scrollDown(ele);
	  Thread.sleep(2000);
	  Utility.scrollUp(ele);
	  Thread.sleep(2000);
	  
	  Utility.scrollDownAsPerCount(ele,3);
	  
	  
//	  driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
//			  "elementId",((RemoteWebElement)ele).getId(),
//			  "direction","down",
//			  "percent",0.75
//			  	  
//			  ));
//    
//	  
//	  System.out.println("Scroll Down action completed!");
//	  
//	  Thread.sleep(2000);
//	  
//	  //scroll up
//	  
//	  driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
//			  "elementId",((RemoteWebElement)ele).getId(),
//			  "direction","up",
//			  "percent",0.75
//			  	  
//			  ));
//    
//	  
//	  System.out.println("Scroll Down action completed!");
	  
	  
	  
	  
    
    }
}
