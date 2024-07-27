package seleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChrossBrowserTestGrid {
	WebDriver driver;
	@Parameters({"bname"})
  @Test
  public void testGrid(String bname) throws MalformedURLException, InterruptedException
  {
	  if(bname.equals("chrome"))
	  {
		  ChromeOptions op=new ChromeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),op);
	  }if(bname.equals("edge"))
	  {
		  EdgeOptions op=new EdgeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),op);
	  }if(bname.equals("firefox"))
	  {
		  FirefoxOptions op=new FirefoxOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),op);
	  }
	  
	  System.out.println("Remote session created!");
	  
	  Thread.sleep(10000);
	  
	  driver.get("https://www.google.com");
	  
	  Thread.sleep(5000);
	  
	  driver.quit();
	  
	  
  }
}
