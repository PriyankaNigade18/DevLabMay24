package locatorDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_XpathOperatorIndexing {

	public static void main(String[] args)
	{
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		//firstname using and
		driver.findElement(By.xpath("//input[@name='firstname' and @class='form-control' ]")).sendKeys("Jay");
		
		//lastname using or
		driver.findElement(By.xpath("//input[@name='lastname' or @class='form-contro' ]")).sendKeys("Nigade");
		
		//email
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=3]")).sendKeys("jay24@gmail.com");
		
		
		//telephone
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("6666666666");
		
		//password
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//cpassword
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		
		/*
		 * test Radio button
		 * If any radio button is not selected do click on it
		 * 
		 */
		List<WebElement> allbtn=driver.findElements(By.xpath("//div[@class='col-sm-10']//label//input"));
		for(WebElement i:allbtn) {
			
			if(!i.isSelected())
			{
				i.click();//yes
				break;
			}
			
			
			
		}
		
		
		//privacy policy
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//continue btn
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		//validation
		//result text
		String text=driver.findElement(By.xpath("//h1[contains(text(),'Created')]")).getText();
		
		
		
		if(text.equals("Your Account Has Been Created!"))
		{
			System.out.println("Registeration for new user completed Successfully!");
			System.out.println("After Register text is: "+text);
		}else
		{
			System.out.println("Registeration for new user not completed !");
			System.out.println("After Register text is: "+text);
		}
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
