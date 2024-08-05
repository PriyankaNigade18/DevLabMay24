package mobileElementWithGestures;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Lock_Unlock_Rotate {
  @Test
  public void testBaseSetup()
  {
	  
	  //create a driver session
	  AppiumDriver driver=Utility.androidDriverSession();
	  
	  /*
	   * lockDevice()
	   * unlockDevice()
	   * rotate(ScreenOrintation)
	   * 
	   * 
	   */
	  
	  //Lock device
	  
	  ((AndroidDriver)driver).lockDevice();
	  System.out.println("Device is locked!");
	  
	  //Unlock
	  ((AndroidDriver)driver).unlockDevice();
	  
	  System.out.println("Device is unlocked!");
	  
	  //rotate
	  
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  
	  
	  
	  
  }
}
