package mobileElementWithGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGesture {
  @Test
  public void testSwipe() throws InterruptedException
   {
	  
	  
	  //create a driver session
	  AppiumDriver driver=Utility.androidDriverSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  //photos
	  
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  //area-swipe
	  WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  //swipegesture
	  
	  Utility.swipeLeft(area);
	  
	  Thread.sleep(2000);
	  
	  Utility.swipeRight(area);
	  
//	  driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
//			  
//			  "elementId", ((RemoteWebElement)area).getId(),
//			  "direction","left",
//			  "percent",0.75
//			  ));
//	  
	  System.out.println("Left side swipe!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
