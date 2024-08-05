package mobileElementWithGestures;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class NotificationsToggleSetupTestInAppium {
  //@Test
  public void testNotifications() 
  {
	  /*
	   * open Notification
	   * openNotifications()
	   */
	  
	  //create driver session
	  AppiumDriver driver=Utility.androidDriverSession();
	  
	  //to open notification
	((AndroidDriver)driver).openNotifications();
	  
	  
	System.out.println("******Notification Headings********");
	List<WebElement> list=driver.findElements(AppiumBy.id("android:id/title"));
	System.out.println("Total Notifications are: "+list.size());
	
	for(WebElement i:list)
	{
		System.out.println(i.getText());
	}
	
	
	//Notifiaction message
	System.out.println("*****First Notification message is:******");
	
	String text1=driver.findElement(AppiumBy.id("android:id/big_text")).getText();
	System.out.println(text1);
	
	System.out.println("*****Second Notification message is:******");
	String text2=driver.findElement(AppiumBy.id("android:id/text")).getText();
	System.out.println(text2);
	
  }
  
  @Test
  public void toogleNetworkTest() throws InterruptedException
  
  {
	  /*
	   * wifi---------->toggleWifi()
	   * mobile data--->toggleData()
	   * airplane mode--->toggleAirplaneMode()
	   */
	  //create a driver 
	  AppiumDriver driver=Utility.androidDriverSession();
	  
	  System.out.println("Initially Wifi is On");
	  
	  //on -=-->Off
	 ((AndroidDriver)driver).toggleWifi();
	  
	 System.out.println("After toogle setup Wifi is Off");
	  
	 Thread.sleep(2000);
	 
	  //Off--->on
	 ((AndroidDriver)driver).toggleWifi();
	 System.out.println("Wifi is On");
	  
	  //Mobiledata
	 System.out.println("Intially mobile data is On");
	 
	 //swipe
	 WebElement ele=driver.findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	 Utility.swipeLeft(ele);
	 
	 //On-->off
	 
	 ((AndroidDriver)driver).toggleData();
	 System.out.println("After toggle setup data is Off");
	 
	 //Off--On
	 
	 ((AndroidDriver)driver).toggleData();
	 System.out.println("After toggle setup data is ON");
	 
	  
	 //airplaneMode
	 
	 System.out.println("Airplane mode is Off");
	 //Off to On
	 ((AndroidDriver)driver).toggleAirplaneMode();
	 
	 System.out.println("Off --->On");
	 ((AndroidDriver)driver).toggleAirplaneMode();
	 System.out.println("ON ---->OFF");
	 
	 
	 
	 
	 
	 
	 
  }
  
  
  
  
}
