package externalDataForTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import generic.PropertiesUtil;

public class DataReadFromPropertiesFile {
  @Test
  public void loginTest() throws IOException 
  {
	  
	  PropertiesUtil pr=new PropertiesUtil("config");
	  System.out.println("User name is: "+pr.getData("un"));
	  System.out.println("User password is: "+pr.getData("psw"));
	  
	  
	  
	  /*
	  //path of file
	  File f1=new File(System.getProperty("user.dir")+"//config.properties");
	  
	  //to read contents from file
	  
	 FileInputStream fs=new FileInputStream(f1);
	 
	 //Properties class- java.util
	 
	 Properties pr=new Properties();
	 pr.load(fs);
	 
	 System.out.println("User name: "+pr.getProperty("un"));
	 System.out.println("Password is: "+pr.getProperty("psw"));
	 */
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
  }
}
