package KiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Utility
{
	// excel
	// screenshots
	// closing
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		
		File myfile=new File("C:\\apache poi\\26marchB.xlsx");
	    Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet2");
	    String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}

	
	

}
