package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SingleExecution {
  @Test
  public void chromeTest() throws MalformedURLException, InterruptedException
  {
	  
	  System.out.println("Browser Session started on Remote Server");
	  
	  ChromeOptions option=new ChromeOptions();
	  
	  WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"),option);
	  
	  System.out.println("Browser Session started on Remote Server");
	  Thread.sleep(10000);
	  
	  driver.get("https://www.amazon.in");
	  System.out.println("Application Opened on Remote Server");

	  Thread.sleep(5000);
	  
	  System.out.println("Title is: "+driver.getTitle());
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
  }
}
