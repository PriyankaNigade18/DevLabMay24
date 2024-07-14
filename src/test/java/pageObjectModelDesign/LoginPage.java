package pageObjectModelDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	
	//Encapsulation=private data+public function
	
	private WebDriver driver;
	
	//initialize driver
	
	public LoginPage(WebDriver driver)//driver from baseclass
	{
		this.driver=driver;
	}
	
	//locators
	private By email=By.id("email-id");
	private By psw=By.id("password");
	private By btn=By.id("submit-id");
	
	
	
	//methods
	
	public String getAppTitle()
	{
		return driver.getTitle();
		
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public String doLogin(String em,String ps)
	{
	driver.findElement(email).sendKeys(em);
	driver.findElement(psw).sendKeys(ps);
	driver.findElement(btn).click();
	return driver.getCurrentUrl();
	
	}
	
	
	
	
	
	
	
	

}
