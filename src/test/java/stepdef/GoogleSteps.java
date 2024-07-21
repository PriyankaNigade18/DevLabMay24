package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class GoogleSteps 
{
	WebDriver driver;
	String title;
	@Given("Open Google application")
	public void open_google_application()
	{
	     driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("user get the actual title")
	public void user_get_the_actual_title() 
	{
	    title=driver.getTitle();
	    System.out.println("Actual title is: "+title);
	}

	@Then("Title should matched with Google")
	public void title_should_matched_with_google()
	{
	    Assert.assertTrue(title.contains("Google"),"Title not matched!");
	    System.out.println("Title is matched!");
	}

	@When("User search with valid keyword {string}")
	public void user_search_with_valid_keyword(String keyword) {
	    driver.findElement(By.name("q")).sendKeys(keyword);
	}

	@Then("User should get valid search result")
	public void user_should_get_valid_search_result() 
	{
	    List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	    System.out.println("Valid Search Result is: ");

	    for(WebElement i:list)
	    {
	    	System.out.println(i.getText());
	    }
	}



	
	
	

}
