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

public class Authentication {
  @Test
  public void basicAuthentication()
  {
	  //Base64
	  given()
	  	.auth().basic("postman","password")
	  .when()
	  .get("https://postman-echo.com/basic-auth")
	  
	  .then()
	  .statusCode(200)
	  .body("authenticated",equalTo(true))
	  .log().body();
	  
	  System.out.println("Basic Authentication!");
  }
  
  
  @Test
  public void digestAuthentication()
  {
	  //MD5 algorithm
	  System.out.println("Digest authentication");
	  given()
	  
	  .auth().digest("postman","password")
	  .when()
	  .get("https://postman-echo.com/digest-auth")
	  
	   .then()
	   .statusCode(200)
	   .body("authenticated",equalTo(true))
	   .log().body();
	  
	  
  }
  
  @Test
  public void tokenTest()
  {
	  given()
	  
	  .header("Authorization","Bearer 12345")
	  
	  .when()
	  .get("https://postman-echo.com")
	  
	  .then()
	  .statusCode(200)
	  .log().all();
	  
	  
  }
  
  @Test
  public void outh2Test()
  {
	  given()
	  .auth().oauth2("3433333")
	  .when()
	  .get("https://postman-echo.com")
	  .then()
	  .statusCode(200)
	  .log().all();
	  
	  
  }
  
  
}
