package apiScenarios;

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
public class Cookies_HeadersValidation {
  @Test
  public void getAllCookies()
  {
	  given()
	  
	  .when()
	  .get("https://www.google.com")
	  
	  .then()
	  .log().cookies();
	  
	  
  }
  
  @Test
  public void validateCookies()
  {
	Response res=given()
	  
	  .when()
	  .get("https://www.google.com");
	  
	 String avalue=res.getCookie("AEC");
	 String evalue="AVYB7cq3EV7ov5AL3fSjzm3DkanYCfN6xS5R8jdN88zIwygng9gcNelbbw";
	 
	 /*
	  * cookies are always unique
	  */
	 
	 Assert.assertFalse(avalue.equals(evalue),"Test Fail: As cookies daa is same");
	 System.out.println("Test Pass: As Cookies are always Unique!");
	 
	 
  }
  
  
  
  @Test
  public void getAllHeaders()
  {
	  
	  given()
	  
	  .when()
	  .get("https://www.google.com")
	  
	  .then()
	  .log().headers();
	 
	  
  }
  
  @Test
  public void validateHeaders()
  {
	  
	  Response res=given()
	  
	  .when()
	  .get("https://www.google.com");
	  
	 
	  String header=res.getHeader("Content-Type");
	  String exp="text/html; charset=ISO-8859-1";
	  
	  Assert.assertEquals(header,exp,"Test Fail");
	  System.out.println("Test Pass:Header matched!");
	  
	  
	  
	 
	  
  }
  
}
