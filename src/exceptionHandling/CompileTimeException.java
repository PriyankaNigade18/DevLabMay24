package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CompileTimeException {

	public static void main(String[] args) throws InterruptedException, IOException
	{

		System.out.println("Program started......");
		Thread.sleep(4000);
		System.out.println("Program ended......");
		
		//File class - path of file
		File f1=new File(System.getProperty("user.dir")+"//Config.properties");
		//to read data from file -FileInputStream
		FileInputStream fs=new FileInputStream(f1);
		//Properties file
		Properties p1=new Properties();
		p1.load(fs);
		
		System.out.println("Browser Name: "+p1.getProperty("bname"));
		System.out.println("Browser version: "+p1.getProperty("bversion"));
		
		
		

	}

}
