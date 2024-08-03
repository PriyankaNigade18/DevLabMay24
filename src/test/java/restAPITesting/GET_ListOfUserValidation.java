package restAPITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

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

public class GET_ListOfUserValidation {
  @Test
  public void listOfUsersValiadation1() 
  {
	Response res=given()
	  
			.when()
			.get("https://reqres.in/api/users?page=2");
	
	Assert.assertEquals(res.getStatusCode(),200,"Test Fail: Status code not matched");
	System.out.println("Test Pass: Status code matched!");
	
	System.out.println(res.asPrettyString());
	//json body
	
	int pnumber=res.jsonPath().getInt("page");
	Assert.assertEquals(pnumber,2);
	System.out.println("Page number matched!");
	
	//single value validation
	int id=res.jsonPath().getInt("data[1].id");	
	Assert.assertEquals(id,8);
	System.out.println("Id is Matched!");
	
	
	//list of elements
	
	List<Integer> allId=res.jsonPath().getList("data.id");
	System.out.println("Total id are: "+allId.size());
	
	for(Integer i:allId)
	{
		System.out.println(i);
	}
	
	
	//list of first name
	
	
	List<String> name=res.jsonPath().getList("data.first_name");
	
	for(String i:name)
	{
		System.out.println(i);
	}
	
	
  }
  
  
  @Test 
  public void listOfUsersValidation2()
  {
	  
	  given()
	  
	  .when()
	  .get("https://reqres.in/api/users?page=2")
	  
	  .then()
	  .body("data[2].first_name",equalTo("Tobias"))
	  .body("data.id",hasItems(7,8,9,10,11,12))
	  //partial match
	  .body("data.id",hasItems(10,7,11))
	  //change oder
	  .body("data.id",hasItems(12,8,10,7,9,11))
	  //contains() check for strict order and data
	  .body("data.id",contains(7,8,9,10,11,12))
	  //change order=fails
	 // .body("data.id",contains(12,7,10,9,8,11))
	  //partial match=fails
	  .body("data.id",contains(7,8,9))
	  .log().body();
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
