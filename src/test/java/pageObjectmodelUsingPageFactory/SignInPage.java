package pageObjectmodelUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage 
{
	
	private WebDriver driver;
	
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(linkText="Sign In")
	private WebElement link;
	
	@FindBy(tagName="h2")
	private WebElement text;
	
//	@FindBy(xpath="//a[@id='SignIn']")
//	private List<WebElement> ele;
	
	//method
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void getPageText()
	{
		System.out.println("Page Text: "+text.getText());
	}
	
	
	public String doSignIn()
	{
		link.click();
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	

}
