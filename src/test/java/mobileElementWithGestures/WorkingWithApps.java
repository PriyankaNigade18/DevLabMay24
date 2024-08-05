package mobileElementWithGestures;

import java.time.Duration;

import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApps {
  @Test
  public void testApplicationstatus() throws InterruptedException
  {
	  //create a driver session
	  AppiumDriver driver=Utility.androidDriverSession();
	  
	  System.out.println("Current state of Application: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  //terminate app
	  ((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  System.out.println("After terminate Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  Thread.sleep(2000);
	  
	  //activate app
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("After activate app Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  Thread.sleep(2000);
	  //uninstall app-removeApp
	  
	  ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  System.out.println("After uninstall app Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  Thread.sleep(2000);
	  //installApp
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  
	  ((AndroidDriver)driver).installApp(path);
	  System.out.println("After Installation app Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  Thread.sleep(2000);
	  
	//activate app
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  System.out.println("After activate app Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  //background execution
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
	  System.out.println("After background Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));


	  
	  
	  
	  
	  
	  //reset app
	  
//	  ((AndroidDriver)driver).resetApp();
//	  System.out.println("After Installation app Status is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
//
//	  driver.resetApp();
//	  
//	  
	  
	  
	  
	  
	  
  }
}
