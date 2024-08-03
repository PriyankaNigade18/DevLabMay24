package restAPITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

/* given() -prerequisite
 * ----------------------
 * request header,request body,query parameter,path parameter,cookies,authentication
 * 
 * when()- API Request type
 * --------------------------
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then()- validate response
 * -------------------------------
 * status code,message,response payload,header,cookies,time
 *  
 */

public class GETWithBDD {
  @Test
  public void SingleUser() 
  {
	  given()
	  
	  .when()
	  	.get("https://reqres.in/api/users/2")
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	 
  }
  
  
  
  @Test
  public void SingleUserValidation() 
  {
	  Response res=given()
	  
			  .when()
			  	.get("https://reqres.in/api/users/2");
	  	
	  
	  int actual=res.getStatusCode();
	  Assert.assertEquals(actual,200,"Status code not matched");
	  System.out.println("Test Pass:Status code matched");
	  
	  System.out.println(res.asPrettyString());
	  //jsonpath
	  String name=res.jsonPath().getString("data.first_name");
	  
	  Assert.assertEquals(name,"Janet","Test Fail");
	  System.out.println("Test Pass:First name matched!");
	  
	  
	  
	  
//	  .then()
//	  .statusCode(200)
//	  .log().body();
	  
	 
  }
  /*HamCRST
   * equalTo()
   * hasIteams()
   * contains()
   */
  @Test
  public void SingleUserValidationWithMethod() 
  {
	  given()
	  
	  .when()
	  	.get("https://reqres.in/api/users/2")
	  	
	  .then()
	  .statusCode(200)
	  .body("data.first_name",equalTo("Janet"))
	  .body("data.id",equalTo(2))
	  .log().body();
	  
	 
  }
  
  
  
  
  
  
  
  
  
  
  
}
