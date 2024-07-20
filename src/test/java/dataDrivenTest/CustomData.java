package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	 XSSFWorkbook wb;
	@DataProvider(name="testdata")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Neha","test123"},{"Sumit","test123"}};
		return data;
	}
	
	
	@DataProvider(name="exceldata")
	public Object[][] excelData()
	{
		//path of file
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  
		  //read
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			//wb-->sheet-->row-->cell-->value
			  wb=new XSSFWorkbook(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		  //number of rows
		  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
		  System.out.println("Total number of rows are: "+rows);//6
		  
		  //number of cells
		  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
		  System.out.println("Total number of cells are: "+cells);

		  //create array of same size like file
		  Object data[][]=new Object[rows-1][cells];//skip heading rows=5
		  
		  //read data from file and store it into array
		  for(int i=1;i<rows;i++)//row
		  {
			  for(int j=0;j<cells;j++)
			  {
				  data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
				  
				  
			  }
			  
		  }
		  
		  return data;
		  
	}
}
