package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserProvider
{
	public static WebDriver driver;
	
	//ThreadLocal class
	static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	

	public static WebDriver setDriver(String bname)
	{

		if(bname.equals("chrome"))
		{
			driver=new ChromeDriver();
			tdriver.set(driver);
			
		}else if(bname.equals("firefox"))
		{
			driver=new FirefoxDriver();
		tdriver.set(driver);
			
		}else if(bname.equals("edge"))
		{
			driver=new EdgeDriver();
			tdriver.set(driver);
		}
		
		return getDriver();
	}
	
	
	public static WebDriver getDriver()
	{
		return tdriver.get();
	}
	
	

}
