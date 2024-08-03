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
public class Create_Update_DeleteSameUser
{
	int id;
  @Test(priority=1)
  public void createNewUser()
  {
	  //payload
	  Pojodata data=new Pojodata();
	  data.setName("Kiran");
	  data.setJob("QA");
	    
 id=given()
	  .contentType("application/json")
	  .body(data)
	  
	  .when()
	  .post("https://reqres.in/api/users")
	  .jsonPath().getInt("id");
	  
 	System.out.println("User created with id: "+id);
 
//	  .then()
//	  .log().body();
	  
  }
  
  
 @Test(priority=2,dependsOnMethods = "createNewUser")
  public void updateSameUser()
  {
	 //payload
	 Pojodata data=new Pojodata();
	 data.setName("KiranM");
	 data.setJob("Automation Engg");
			 
	  given()
	  .contentType("application/json")
	  .body(data)
	  
	  .when()
	  .put("https://reqres.in/api/users/"+id)
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  System.out.println("User updated with same id: "+id);
	  
  }
  
  
  @Test(priority=3,dependsOnMethods = "updateSameUser")
  public void deleteSameUser()
  {
	  given()
	  
	  .when()
	  .delete("https://reqres.in/api/users/"+id)
	  
	  .then()
	  .statusCode(204);
	  
	  System.out.println("User deleted with id: "+id);
	  
  }
}
