package apiScenarios;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import restAPITesting.Pojodata;

public class Serialization_Deserialization
{
	/*
	 * POJO--->JSON=Serialization
	 * 
	 * JSON--->POJO=De serialization
	 */
  @Test
  public void serialization() throws JsonProcessingException
  {
	  Pojodata data=new Pojodata();
	  data.setName("Kumar");
	  data.setJob("QA");
	  
	  //into json
	  ObjectMapper obj=new ObjectMapper();
	  String json=obj.writerWithDefaultPrettyPrinter().writeValueAsString(data);
	  System.out.println(json);
	  }
  
  
  
  @Test
  public void deserialization() throws JsonMappingException, JsonProcessingException
  {
	  String json="{\n"
	  		+ "  \"name\" : \"Kumar\",\n"
	  		+ "  \"job\" : \"QA\"\n"
	  		+ "}";
	  ObjectMapper obj=new ObjectMapper();
	 Pojodata data= obj.readValue(json,Pojodata.class);
	  
	  System.out.println(data.getName());
	  System.out.println(data.getJob());
	  
	  
	  
	  
  }
}
