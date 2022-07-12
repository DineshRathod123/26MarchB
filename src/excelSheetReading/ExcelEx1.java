package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// create excel sheet and pass the path with name and extension in file
		
		   File myfile=new File("C:\\apache poi\\26marchB.xlsx");
		
		// using workbookFoctory class read excel sheet
		
		// how to read String value
		
	   String name = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
      
	   System.out.println(name);
	   
	   String name1 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
	   
	   System.out.println(name1);
	   
	   System.out.println("################################");
	   
	   // how to read numeric value
	   
	  double number=WorkbookFactory.create(myfile).getSheet("sheet1").getRow(2).getCell(0).getNumericCellValue();
	   
	   System.out.println(number);
	  
	   System.out.println("################################");
	  
	  // how to read char value
	  
	 String value = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
	  
	 System.out.println(value);
	 
	 String value1 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(3).getCell(1).getStringCellValue();
	 
	 System.out.println(value1);
	 
	   System.out.println("################################");
	 
	 // how to read boolean value
	 
	 boolean myvalue = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(2).getBooleanCellValue();
	 
	 System.out.println(myvalue);
	 
	 boolean myvalue1 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(1).getCell(2).getBooleanCellValue();
	 
	 System.out.println(myvalue1);

	}

}
