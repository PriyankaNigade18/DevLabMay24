package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Cartsteps
{
	WebDriver driver;
	@Given("Open Register page")
	public void open_register_page() {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("User enters all required details")
	public void user_enters_all_required_details(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<Map<String,String>> data=table.asMaps();
		
		driver.findElement(By.id("input-firstname")).sendKeys(data.get(0).get("fname"));
		driver.findElement(By.id("input-lastname")).sendKeys(data.get(0).get("lname"));
		driver.findElement(By.id("input-email")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(data.get(0).get("tele"));
		driver.findElement(By.id("input-password")).sendKeys(data.get(0).get("pass"));
		driver.findElement(By.id("input-confirm")).sendKeys(data.get(0).get("cpass"));
		
		
		
		
		
	    
	}

	@When("User click on yes readio button")
	public void user_click_on_yes_readio_button() {
	   
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}

	@When("User click on privacy policy")
	public void user_click_on_privacy_policy() {
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	    
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("User should be register")
	public void user_should_be_register() {
	    
		System.out.println("User Register");
	}
	




}
