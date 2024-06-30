package locatorDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_XapthMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		//best sellers page
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
		
		System.out.println("*******Product category from BestSellers page*******");
		//print all headings of product category
		List<WebElement> headings=driver.findElements(By.xpath("//h2[contains(@class,'a-carousel-heading')]"));
		
		for(WebElement i:headings)
		{
			System.out.println(i.getText());
		}
		
		//click on cart-normalize-space()
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		String text=driver.findElement(By.xpath("(//h2)[1]")).getText();
		System.out.println("Cart text is: "+text);
		
		System.out.println("**********Search Product**********");
		//search a product into search box-contains()
		WebElement ele1=driver.findElement(By.xpath("//input[contains(@id,'searchtext')]"));
		
		ele1.sendKeys("watch",Keys.ENTER);
		
		Thread.sleep(2000);
		//clear text--->bag
		WebElement ele2=driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		
		//clear the text
		ele2.clear();
		Thread.sleep(2000);
		
		ele2.sendKeys("bag",Keys.ENTER);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
