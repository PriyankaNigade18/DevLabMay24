package locatorDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo10_XpathAxies {

	public static void main(String[] args) 
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=axZcSc&submit-name=");
		
		System.out.println("********Ancestior tagname for John is*******");
		String tagname=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();		
		System.out.println("Ancestor tagname for John is: "+tagname);
		
		System.out.println("********Parent tagname for John is*******");
		String tgname=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("Parent tagname for John is: "+tgname);
		
		System.out.println("************Print all child node for row number 4*******");
		List<WebElement> list=driver.findElements(By.xpath("//tbody//tr[4]//child::td"));
		System.out.println("Total child nodes for row 4 are: "+list.size());
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("************Count all following nodes(td) for john *****");
		
		int count=driver.findElements(By.xpath("//td[text()='John']//following::td")).size();
		System.out.println("Total td elements after John are: "+count);//13
		
		
		System.out.println("************Count all preceding nodes(td) for john *****");
		int c=driver.findElements(By.xpath("//td[text()='John']//preceding::td")).size();
		System.out.println("Total td elements before John are: "+c);//16
		
		System.out.println("**********All following sigblings of John*********");
		
		int fs=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();
		System.out.println("Total Following siblings are: "+fs);
		
		
		System.out.println("**********All preceding sigblings of John*********");
		
		int ps=driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td")).size();
		System.out.println("Total preceding siblings are: "+ps);
		
		System.out.println("***********Get all child and grand child nodes for tbody*******");
		int dc=driver.findElements(By.xpath("//tbody//descendant::tr")).size();
		System.out.println("Total descendant nodes for tbody are: "+dc);
		
		
		
		
		
		
		
		
		
	}

}
