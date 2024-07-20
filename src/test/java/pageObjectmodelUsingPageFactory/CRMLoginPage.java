package pageObjectmodelUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLoginPage 
{

	private WebDriver driver;
	
	 public CRMLoginPage(WebDriver driver)//base class
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
	 
	 //Locators
	 @FindBy(id="email-id")
	 private WebElement email;
	 
	 @FindBy(name="password-name")
	 WebElement pas;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 WebElement submit;
	 
	 
	 public void doLogin(String em,String ps)
	 {
		 email.sendKeys(em);
		 pas.sendKeys(ps);
		 submit.click();
	 }
	 
	 
}





