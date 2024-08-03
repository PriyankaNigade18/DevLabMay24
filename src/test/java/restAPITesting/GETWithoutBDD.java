package restAPITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETWithoutBDD {
  @Test
  public void singleUser()
  {
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  System.out.println("status code: "+res.getStatusCode());
	  System.out.println("Status line: "+res.getStatusLine());
	  System.out.println("Response time: "+res.getTime());
	  
	  System.out.println(res.asString());
	  System.out.println("******************");
	  
	  System.out.println(res.asPrettyString());
	  
  }
  
  
  @Test
  public void validateSingleUser()
  {
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  
	  int code=res.getStatusCode();
	  
	  Assert.assertEquals(code,200,"Status code not matched!");
	  System.out.println("Status code matched: "+code);
	  
	  //json data
	  
	  System.out.println(res.asPrettyString());
	  
	  int id=res.jsonPath().getInt("data.id");
	  Assert.assertEquals(id,2,"Test Fail!");
	  System.out.println("Test Pass: Id matched!");
	  
	  
	  String url=res.jsonPath().getString("support.url");
	  Assert.assertEquals(url,"https://reqres.in/#support-heading");
	  System.out.println("Test Pass!");
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
