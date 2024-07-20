package pageObjectmodelUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class BaseClass 
{
	
	public WebDriver driver;
	public SignInPage sp;
	public CRMLoginPage lp;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		//sp=PageFactory.initElements(driver,SignInPage.class);
		sp=new SignInPage(driver);
		lp=new CRMLoginPage(driver);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
