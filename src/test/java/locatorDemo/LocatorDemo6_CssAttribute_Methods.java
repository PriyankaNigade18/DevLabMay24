package locatorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_CssAttribute_Methods {

	public static void main(String[] args) {

		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=test123&submit-name=");
		
		//newCustomer with *contains()
		driver.findElement(By.cssSelector("a[id *='customer']")).click();
		
		//Email with startsWith() ^ startswith()
		driver.findElement(By.cssSelector("input[id ^='Email']")).sendKeys("test@gmail.com");
		
		
		//firstname with css $ endsWith()
		driver.findElement(By.cssSelector("input[placeholder $=' first name']")).sendKeys("Priyanka");
		
	}

}
