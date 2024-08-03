package restAPITesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

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
public class POSTRequest
{
	/*
	 * Using HashMap
	 * Using POJO class=plain old java object(Encapsulation=data+method)
	 */
  @Test
  public void PostRequestUsingHashMap() 
  {
	  //request payload(data)
	  HashMap<String,Object> data=new HashMap<String,Object>();
	  data.put("name","Priyanka");
	  data.put("job","SDET");
	  
	  given()
	  .contentType("application/json")
	  //request payload
	  .body(data)
	  	  
	  .when()
	  .post("https://reqres.in/api/users")
	  
	  .then()
	  .statusCode(201)
	  .body("name",equalTo("Priyanka"))
	  .body("job",equalTo("SDET"))
	  .log().body();
	    
  }
  
  
  
  
  @Test
  public void postRequestUsingPOJO()
  {
	  //payload 
	  Pojodata data=new Pojodata();
	  data.setName("Sarang");
	  data.setJob("QA");
	    
	  given()
	  .contentType("application/json")
	  .body(data)
	  
	  .when()
	  .post("https://reqres.in/api/users")
	  
	  .then()
	  .statusCode(201)
	  .body("name",equalTo("Sarang"))
	  .log().body();
	  
	  Assert.assertEquals(data.getName(),"Sarang");
	  System.out.println("Name matched!");

  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
