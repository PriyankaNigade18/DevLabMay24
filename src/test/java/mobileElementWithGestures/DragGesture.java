package mobileElementWithGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragGesture {
  @Test
  public void testDrag()
  {
	  
	  //create a driver session
	  
	  AppiumDriver driver=Utility.androidDriverSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag
	  
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //dot3
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  Utility.getScreenShot(driver);
	  driver.executeScript("mobile:dragGesture",ImmutableMap.of(
			  "elementId", ((RemoteWebElement)ele).getId(),
			  "endX",655,
			  "endY",1117
			   
			  ));
	  
	  Utility.getScreenShot(driver);
	  
	  //result text
	  String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  System.out.println("Result text is: "+text);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
