package webElementScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Goibibo_Calendar {
  @Test
  public void testCalendar() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.goibibo.com/flights/");
	  driver.manage().window().maximize();
	  
	  
	//open calendar
	  driver.findElement(By.xpath("(//span[contains(@class,'fswDownArrow')])[1]")).click();
	  
	  //expectation
	  String date="27";
	  String month="October";
	  String year="2024";
	  
	  
	  //Month selection
	  while(true)
	  {
	  //current month + year
	  String cdate=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
	  //System.out.println(cdate);
	 String cmonth=cdate.split(" ")[0];
	 String cyear=cdate.split(" ")[1];
	 //System.out.println(cmonth+"  : "+cyear);
	 
	 if(cmonth.contains(month) && cyear.contains(year))
	 { 
		 break;
	 }else
	 {
		 //click on arrow
		 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		 
		 
	 }
	 
	 
	  }
	  
	  //date selection
	  
 List<WebElement> dates= driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Week']//div[@class='DayPicker-Day']"));
	  
	  for(WebElement i:dates)
	  {
		  if(i.getText().contains(date))
		  {
			  i.click();
			  break;
		  }
	  }
//	  
	  
	  
	  
	  
  }
}
