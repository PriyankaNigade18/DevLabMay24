package externalDataForTesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDatafromXMLFile 
{
 @Parameters({"un","psw"})
  @Test
  public void login(String un,String psw)
  {
	  System.out.println("User name is: "+un);
	  System.out.println("User password is: "+psw);
  }
}
