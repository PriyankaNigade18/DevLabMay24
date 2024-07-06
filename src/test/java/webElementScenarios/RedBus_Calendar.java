package webElementScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBus_Calendar {
  @Test
  public void testCalendar()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.redbus.in/");
	  
	  //open calendar
	  driver.findElement(By.xpath("//span[text()='Date']")).click();
	  
	  //expectation
	  String date="27";
	  String month="Dec";
	  String year="2024";
	  
	  
	  //Month selection
	  while(true)
	  {
	  //current month + year
	  String cdate=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__Icon')])[2]")).getText();
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
		 driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__Icon')])[3]")).click();
		 
		 
	 }
	 
	 
	  }
	  
	  //date selection
	  
 List<WebElement> dates= driver.findElements(By.xpath("//div[contains(@class,'DayTilesWrapper')]//span[contains(@class,'DayTiles__CalendarDays')]"));
	  
	  for(WebElement i:dates)
	  {
		  if(i.getText().contains(date))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
  }
}
