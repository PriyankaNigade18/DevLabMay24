package waitScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class FluetWaitDemo {
  @Test
  public void fluentWaitTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  By btn=By.xpath("//button[normalize-space()='Start']");
	  
	  By text=By.xpath("//h4[normalize-space()='Hello World!']");
	  
	  driver.findElement(btn).click();
	  
	  FluentWait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(5))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(NoSuchElementException.class);
	  String res=wait.until(ExpectedConditions.visibilityOfElementLocated(text)).getText();
	  
	  System.out.println(res);
	  
	  
	  
	  
	  
  }
}
