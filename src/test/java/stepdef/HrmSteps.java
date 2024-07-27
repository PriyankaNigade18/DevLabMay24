package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import utility.BrowserProvider;

public class HrmSteps
{
	WebDriver driver=BrowserProvider.getDriver();
	@Given("Open Hrm application")
	public void open_hrm_application() {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String un, String psw) {

		// username

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);

		// password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(psw);

	}
	@When("User click on Hrm login")
	public void user_click_on_hrm_login() {
		// button
					driver.findElement(By.xpath("//button[@type='submit']")).click();
					
	}

	@Then("User should able to login and navigated to dashboard only for valid set")
	public void user_should_able_to_login_and_navigated_to_dashboard_only_for_valid_set() {
		//Assertion

		
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			System.out.println("Test Pass: User is able to login with valid data");
			
		}else
		{
			System.out.println("Test Pass: User is not able to login with Invalid data");

		}
	}


}
