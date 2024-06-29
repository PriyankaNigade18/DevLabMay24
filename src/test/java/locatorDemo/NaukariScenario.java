package locatorDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariScenario {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
				
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		String exp="https://www.naukri.com/engineering-jobs?src=gnbjobs_homepage_srch";
		System.out.println("Total Links are: "+list.size());
		
		for(WebElement i: list)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
			try {
			if(i.getAttribute("href").contains(exp))
			{
				System.out.println("Link Found...Test pass");
				break;
			}
			}catch(NullPointerException n )
			{
				System.out.println("Attribute value is null");
			}
		}
		
		
		
		
		

	}	
}
