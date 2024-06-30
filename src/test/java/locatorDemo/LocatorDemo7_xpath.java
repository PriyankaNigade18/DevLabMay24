package locatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_xpath {

	public static void main(String[] args)
	{

		//create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//username
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		//button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//menu click
		driver.findElement(By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]")).click();
		
		//list
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']//li//a"));
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Logout"))
			{
				i.click();
				System.out.println("Logout completed!");
				break;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
