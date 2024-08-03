package restAPITesting;

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
public class PUT_DELETERequest {
  @Test
  public void PUTRequest() 
  {
	  //payload
	  Pojodata data=new Pojodata();
	  data.setName("Jay");
	  data.setJob("QA");
	  
	  given()
	  .contentType("application/json")
	  .body(data)
	  
	  .when()
	  .put("https://reqres.in/api/users/2")
	  
	  .then()
	  .statusCode(200)
	  .body("job",equalTo("QA"))
	  .log().body();
	  
	 }
  
  
  
  @Test
  public void deleteUser()
  {
	  given()
	  
	  .when()
	  .delete("https://reqres.in/api/users/2")
	  
	  .then()
	  .statusCode(204);
	  
	  System.out.println("User deleted!");
	  
	  
  }
  
  
}
