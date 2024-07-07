package webelementHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo1 {
  @Test
  public void alertHandling() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  //username
	  driver.findElement(By.id("login1")).sendKeys("Priyanka");
	  
	  /*
	   * If alert is not handled
	   * UnhandledAlertException
	   * 
	   * How to handle
	   * ------------------
	   * Alert interface in selenium
	   * Ok---accept()
	   * Cancel---dismiss()
	   * alert text--->getText()
	   * prompt alert--->sendKeys()
	   * 
	   */
	  //click -alert window will open
	  driver.findElement(By.name("proceed")).click();
	  
	  Thread.sleep(2000);
	  
	  //handle
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt1.getText());
	  
	  //ok
	  alt1.accept();
	  
	  //password
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
	  
	  
	  
	  
	  
	  
  }
}
