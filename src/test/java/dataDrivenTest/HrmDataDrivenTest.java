package dataDrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Utility;

public class HrmDataDrivenTest 
{
  //@Test(dataProvider = "testdata",dataProviderClass = CustomData.class)
  @Test(dataProvider = "exceldata",dataProviderClass = CustomData.class)
  public void hrmLogin(String un,String psw)
  {
	// create a driver session
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			// username

			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);

			// password
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(psw);

			
			// button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//Assertion
//			Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
//			System.out.println("Login Pass!");
			
			if(driver.getCurrentUrl().contains("dashboard"))
			{
				System.out.println("Test Pass: User is able to login with valid data");
				
			}else
			{
				System.out.println("Test Pass: User is not able to login with Invalid data");

			}
			
  }
}
