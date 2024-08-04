package mobileElementWithGestures;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsInAppium {
  @Test
  public void mobileElements() throws InterruptedException
  {
	  
	  //create a driver session
	  AppiumDriver driver=Utility.androidDriverSession();
	  
	  //locator-accessibilityId
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Element1 text is: "+ele1.getText());
	  ele1.click();
	  
	  Thread.sleep(1000);
	  
	  //back
	  driver.navigate().back();
	  
	  //xpath
	  WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
	  System.out.println("Element2 text is: "+ele2.getText());
	  ele2.click();
	  
	  Thread.sleep(1000);
	  //back
	  driver.navigate().back();
	  
	  
	  //className
	 // WebElement ele3=driver.findElement(AppiumBy.className("android.widget.TextView"));	  
	  
	  WebElement ele3=driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
	  System.out.println("Eleement3 text is: "+ele3.getText());
	  ele3.click();
	  
	  Thread.sleep(1000);
	  
	  //back
	  driver.navigate().back();
	  
	  
	  //resource-id (id)
	  WebElement ele4=driver.findElements(AppiumBy.id("android:id/text1")).get(3);
	  System.out.println("Element4 text is: "+ele4.getText());
	  ele4.click();
	  
	  Thread.sleep(1000);
	  
	  //back
	  driver.navigate().back();
	  
	  //androidUIAutomator- ele is available with text

	  	WebElement ele5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Content\")"));	  
	  	System.out.println("Element 5 text is: "+ele5.getText());
	  	ele5.click();
	  	
	    
		  Thread.sleep(1000);
		  
		  //back
		  driver.navigate().back();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
