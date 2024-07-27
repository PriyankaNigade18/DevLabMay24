package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonSteps {
	WebDriver driver;

	@Given("Open Amazon application")
	public void open_amazon_application() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
	}

	@When("User get the title")
	public void user_get_the_title() {
		System.out.println("Title is: " + driver.getTitle());
	}

	@Then("title should matched with Home page title")
	public void title_should_matched_with_home_page_title() {

		Assert.assertTrue(driver.getTitle().contains("India"), "Title is not matched");
		System.out.println("Title matched! title is: " + driver.getTitle());
	}

	@When("User open Bestsellers page")
	public void user_open_bestsellers_page() {
		driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("User get the title of BestSeller")
	public void user_get_the_title_of_best_seller() {

		System.out.println("Title of best seller: " + driver.getTitle());
	}

	@Then("Title should matche with bestsellers page")
	public void title_should_matche_with_bestsellers_page() {
		Assert.assertTrue(driver.getTitle().contains("Bestsellers"), "Test Fail");
		System.out.println("Test Pass!");
	}

	@When("User open TodaysDeal page")
	public void user_open_todays_deal_page() {
		driver.findElement(By.linkText("Today's Deals")).click();
	}

	@When("User get the title of TodaysDeal")
	public void user_get_the_title_of_todays_deal() {
		System.out.println("Title of TodaysDeal page: " + driver.getTitle());
	}

	@Then("Title should matche with TodaysDealpage")
	public void title_should_matche_with_todays_dealpage() {
		Assert.assertTrue(driver.getTitle().contains("Deals"), "Test Fail");
		System.out.println("Test Pass!");
	}

	@When("User open Mobiles page")
	public void user_open_mobiles_page() {

		driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("User get the title of Mobiles")
	public void user_get_the_title_of_mobiles() {
		System.out.println("Title of mobiles page: "+driver.getTitle());
	}

	@Then("Title should matche with Mobiles page")
	public void title_should_matche_with_mobiles_page() {
		Assert.assertTrue(driver.getTitle().contains("Phones"), "Test Fail");
		System.out.println("Test Pass!");
	}

}
