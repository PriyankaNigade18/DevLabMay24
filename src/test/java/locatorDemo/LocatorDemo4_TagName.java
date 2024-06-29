package locatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4_TagName {

	public static void main(String[] args)
	{
		//create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		/*
		List<WebElement> inputBoxes=driver.findElements(By.tagName("input###"));
		System.out.println("Total Input boxes are: "+inputBoxes.size());//0
		System.out.println(inputBoxes);//[]
		
		int count=driver.findElements(By.tagName("img")).size();
		System.out.println("Number of images are: "+count);
		*/
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Number of links are: "+allLinks.size());
		
		String exp="https://www.youtube.com/c/OrangeHRMInc";
		for(WebElement i:allLinks)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
			
			if(i.getAttribute("href").contains(exp))
			{
				i.click();
				System.out.println("Link Found ....Test pasS!");
				break;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
