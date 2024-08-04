package mobileElementWithGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGesture {
  @Test
  public void testClickGesture()
  {
	  
	  //create driver session
	  
	  AppiumDriver driver=Utility.androidDriverSession();
	  
	  
	  //ele
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  //gesture
	  driver.executeScript("mobile:clickGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId()
			  
			   ));
	  
	  
	  System.out.println("Click gesture completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
