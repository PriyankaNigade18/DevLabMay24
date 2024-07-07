package webelementHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandlingDemo2 {
  @Test
  public void alertHandling() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  WebElement result=driver.findElement(By.id("result"));
	  //alert1
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  Thread.sleep(1000);
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  //ok
	  alt1.accept();
	  System.out.println("Result status is: "+result.getText());
	  
	  //alert2
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  Alert alt2=driver.switchTo().alert();	
	  Thread.sleep(1000);
	 
	  System.out.println("Alert2 text is: "+alt2.getText());
	  //ok
	  alt2.dismiss();
	  System.out.println("Result status is: "+result.getText());
	  
	//alert3
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  Alert alt3=driver.switchTo().alert();	
	  Thread.sleep(1000);
	 
	  System.out.println("Alert3 text is: "+alt3.getText());
	  //ok
	  alt3.sendKeys("Hello All");
	  alt3.accept();
	  System.out.println("Result status is: "+result.getText());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
