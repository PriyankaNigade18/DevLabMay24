package externalDataForTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.PropertiesUtil;

public class HRMPropertiesFile {
	@Test
	public void f() 
	{
		PropertiesUtil pr=new PropertiesUtil("config");
		
		// create a driver session
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pr.getData("url"));

		// username

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(pr.getData("un"));

		// password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pr.getData("psw"));

		// button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
}
