package externalDataForTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import generic.Utility;

public class HrmAppDataPassingUsingXML
{
	@Parameters({"un","psw"})
	@Test
	public void loginTest(String un,String psw) {
		// create a driver session
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// username

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);

		// password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(psw);

		Utility.getScreenshot(driver, "logindata");
		// button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utility.getScreenshot(driver, "DashboardPage");
	}
}
