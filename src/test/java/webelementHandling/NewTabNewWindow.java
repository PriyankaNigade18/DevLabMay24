package webelementHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTabNewWindow {
  @Test
  public void testNewWindowMethod()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  // 10 new tab--facebook 
	  for(int i=1;i<=10;i++)
	  {
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  System.out.println(newTab.getTitle());
	  
	  }
	  
	  WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);
	  newWindow.get("https://www.amazon.in");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
