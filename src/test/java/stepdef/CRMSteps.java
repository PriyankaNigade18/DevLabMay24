package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import appHooks.CRMHooks;
import io.cucumber.java.en.*;
import utility.BrowserProvider;

public class CRMSteps 
{
	WebDriver driver=BrowserProvider.getDriver();

	@Given("Open CRM Home page")
	public void open_crm_home_page() {
	    //driver=new ChromeDriver();
	    driver.get("https://automationplayground.com/crm/");
	}

	@When("User click on SignIn")
	public void user_click_on_sign_in() {
	    driver.findElement(By.linkText("Sign In")).click();
	}

	@Then("Application should navigate to login page")
	public void application_should_navigate_to_login_page() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Test Fail!");
	    System.out.println("Test Pass!");
	}

	@When("User enter valid {string} and valid password {string}")
	public void user_enter_valid_and_valid_password(String email, String psw) {
	   driver.findElement(By.id("email-id")).sendKeys(email);
	   driver.findElement(By.id("password")).sendKeys(psw);
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
	   driver.findElement(By.id("submit-id")).click();
	}

	@Then("User should able to login and navigated to customers page")
	public void user_should_able_to_login_and_navigated_to_customers_page() {
	   Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Test Fail");
	   System.out.println("Test Pass: User login completed!");
	}

}
