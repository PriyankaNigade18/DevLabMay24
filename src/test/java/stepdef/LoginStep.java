package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginStep
{
	WebDriver driver;

	@Given("Open Login page")
	public void open_login_page() {
	    driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("User enter {string} and user enter {string}")
	public void user_enter_and_user_enter(String email, String psw) {
	 
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User should be able to login into cart application")
	public void user_should_be_able_to_login_into_cart_application() {
	    
		System.out.println("Url is: "+driver.getCurrentUrl());
	}



}
