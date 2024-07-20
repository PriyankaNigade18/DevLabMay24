package reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void addReport()
   {
	  ExtentReports extent=new ExtentReports();
	  //path
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//Automation.html");
	  
	  //configuration
	  spark.config().setDocumentTitle("ExtentReport");
	  spark.config().setReportName("Sprint1 Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  
	  //attached the report
	  extent.attachReporter(spark);
	  
	  //create test
	 ExtentTest test= extent.createTest("Test Report");
	 
	 //logs
	 test.log(Status.FAIL, "Test Fail");
	 test.log(Status.PASS, "Test Pass");
	 test.log(Status.SKIP, "Test Skip");
	 test.log(Status.INFO, "Test Info");
	 
	 //flush()
	 extent.flush();
	 
	  
	  
  }
}
