package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationBasicDemo {
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("This is register test!");
  }
  
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("This is login test!");
  }
  
  @Test(priority=3)
  public void logoutTest() 
  {
	  System.out.println("This is logout test!");
  }
  
  
  //Annotation-Rules
  @BeforeMethod
  public void bmethod()
  {
	System.out.println("Before Method will run before every test case!");  
  }
  
  @AfterMethod
  public void amethod()
  {
	System.out.println("After Method will run after every test case!");  
  }
  
  
  @BeforeClass
  public void bclass()
  {
	 System.out.println("Before class will run before first test case in class"); 
  }
  
  @AfterClass
  public void aclass()
  {
	 System.out.println("After class will run after last test case in class"); 
  }
  
  @BeforeTest
  public void btest()
  {
	  System.out.println("BeforeTest will run before all classes");
  }
  
  
  @AfterTest
  public void atest()
  {
	  System.out.println("AfterTest will run after all classes");
  }
  
  
  @BeforeSuite
  public void bsuite()
  {
	 System.out.println("Before Suite will run before test"); 
  }
  
  
  @AfterSuite
  public void asuite()
  {
	 System.out.println("After Suite will run after test"); 
  }
}
