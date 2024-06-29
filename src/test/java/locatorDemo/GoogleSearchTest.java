package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args)
	{

		//create drievr session
		WebDriver driver=new ChromeDriver();
		
		//open google
		driver.get("https://www.google.com");
		
		
		//technique 3: identify + perform action
		
		driver.findElement(By.id("APjFqb")).sendKeys("testng",Keys.ENTER);
		
		/*
		//technique 2: identify + validation +perform action
		
		WebElement ele=driver.findElement(By.id("APjFqb"));
		
		if(ele.isDisplayed() && ele.isEnabled())
		{
			//action
			ele.sendKeys("java");
		}
		*/
		
		
		
		
		
		
		/*
		//technique 1: By locators strategies-(Framework design)
		//By is class in selenium
		
		By searchele=By.id("APjFqb");
		
		WebElement searchbox=driver.findElement(searchele);
		
		//validation
		System.out.println("Is search box is displayed?"+searchbox.isDisplayed());
		System.out.println("Is search box enabled?: "+searchbox.isEnabled());
		
		
		//perform action
		searchbox.sendKeys("selenium",Keys.ENTER);
		
		//close the browser
		//driver.quit();
		
		
		
		*/
		
		
		
		
		
		

	}

}
