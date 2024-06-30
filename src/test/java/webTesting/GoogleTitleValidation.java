package webTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args)
	{
		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		//To open application- get()
		driver.get("https://www.google.com");
		
		//maximize browser
		driver.manage().window().maximize();
		
		//To get the title- getTitle()
		String actTitle=driver.getTitle();
		
		//validate title is matching with Google
		if(actTitle.equals("Google"))
		{
			System.out.println("Title matched!...Test Pass: Title is: "+actTitle);
		}
		else
		{
			System.out.println("Title is not matched...Test Fail");
		}
		
		//close the browser close()-close active window   quit()-close all windows open by selenium 
		//driver.close();
		//driver.quit();

	}

}
