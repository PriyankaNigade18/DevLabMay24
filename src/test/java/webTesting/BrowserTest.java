package webTesting;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args)
	{
		//create a driver session with chrome
		WebDriver driver1=new ChromeDriver();
		
		//create a driver session with firfox
		WebDriver driver2=new FirefoxDriver();
		
		//create driver session with Edge
		WebDriver driver=new EdgeDriver();
	
		
		//Parent interface for selenium WebDriver
		SearchContext driver3=new ChromeDriver();

		

	}

}
