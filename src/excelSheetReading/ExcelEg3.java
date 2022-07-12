package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 File myfile=new File("C:\\apache poi\\26marchB.xlsx");
		
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		
		 int totalNoOfrow = mysheet.getLastRowNum(); // give me the total row count
	   	 int rowCount = totalNoOfrow;
		 System.out.println("Total number of rows are "+rowCount);
		
		
		 short totalNoOfcells = mysheet.getRow(totalNoOfrow).getLastCellNum(); // total cell count
		 int cellCount = totalNoOfcells-1;
		 System.out.println("Total number of cells are "+cellCount);
		
		
		 System.out.println("**************************");
		
		 for(int i=0; i<=rowCount; i++)    // outer for loop for the rows
		 {
		   for(int j=0; j<=cellCount; j++)    // inner for loop for the cells
		    {
			      Cell cellValue = mysheet.getRow(i).getCell(j);
			  
		          CellType dataType = cellValue.getCellType();
		       
		       if(dataType==CellType.STRING)
		        {
		    	   String value = cellValue.getStringCellValue();
		    	   System.out.print(value+" ");
		        }
		       
		       else if(dataType==CellType.NUMERIC)
		        {
		    	   double value = cellValue.getNumericCellValue();
		    	   System.out.print(value+" ");
		        }
			   
		       else if(dataType==CellType.BOOLEAN)
		        {
		    	   boolean value = cellValue.getBooleanCellValue();
		    	   System.out.print(value+" ");
		        }
		       
		       else if(dataType==CellType.BLANK)
		        {
		    	   System.out.print("     ");
		        }
		   }
		   
		   System.out.println();
		}
		
	}

}
