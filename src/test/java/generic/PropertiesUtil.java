package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil 
{
	 Properties pr;	
	public PropertiesUtil(String filename)
	{
		//Properties class- java.util
		 
		pr=new Properties();
		//path of file
		  File f1=new File(System.getProperty("user.dir")+"//"+filename+".properties");
		  
		  //to read contents from file
		  
		 FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			pr.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
	}
	
	public String getData(String key)
	{
		return pr.getProperty(key);
	}

}
