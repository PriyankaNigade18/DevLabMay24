package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelDataReading {
  @Test
  public void fileRead() throws IOException
  {
	  //path of file
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  
	  //read
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb-->sheet-->row-->cell-->value
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
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
			  
			  System.out.print(data[i-1][j]+"   ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //single entry
//	  String value=wb.getSheet("userdata").getRow(4).getCell(0).getStringCellValue();
//	  
//	  System.out.println(value);
	  /*
	  XSSFSheet sheet1=wb.getSheet("userdata");
	  
	  XSSFRow row=sheet1.getRow(2);
	  
	  XSSFCell cell=row.getCell(0);
	  
	  String value=cell.getStringCellValue();
	  
	  
	  System.out.println(value);
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
