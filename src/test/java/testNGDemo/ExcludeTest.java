package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExcludeTest {
	 @Test(priority=1,description="Test case1 ")
	  public void registerTest() 
	  {
		  System.out.println("This is register test");
		  
	  }
	  
	  
	  @Test(priority=2,description="Test case2 ")
	  public void loginTest() 
	  {
		  System.out.println("This is Login test");
		  
	  }
	  
	  
	  @Test(priority=3,description="Test case3 ")
	  public void searchTest() 
	  {
		  System.out.println("This is search test");
		  
	  }
	  
	  @Test(priority=4,description="Test case4 ",enabled=false)
	  public void addToCartTest() 
	  {
		  System.out.println("This is addToCart test");
		  
	  }
}
