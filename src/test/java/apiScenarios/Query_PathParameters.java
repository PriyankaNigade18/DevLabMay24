package apiScenarios;

import org.testng.annotations.Test;
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
public class Query_PathParameters
{
  @Test
  public void f() 
    {
	    
	 /*
	  *  https://reqres.in/api/users?page=2
	  */
	  
	  given()
	  	.pathParam("path","users")
	  	.queryParam("page",1)
	  
	  .when()
	  .get("https://reqres.in/api/{path}")
	  
	  .then()
	  .log().body();
	  
	  
  }
}
