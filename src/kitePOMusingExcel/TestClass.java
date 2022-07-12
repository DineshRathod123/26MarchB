package kitePOMusingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		 File myfile=new File("C:\\apache poi\\26marchB.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		 
		 String UN = mysheet.getRow(5).getCell(0).getStringCellValue();
		 String PWD = mysheet.getRow(5).getCell(1).getStringCellValue();
		 String PIN = mysheet.getRow(5).getCell(2).getStringCellValue();
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://Kite.zerodha.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			KiteLoginPage login=new KiteLoginPage(driver);
			
			login.sendUserName(UN);
			login.sendPassword(PWD);
			login.clickOnLoginButton();
			
			Thread.sleep(2000);
			
			KitePinPage pin=new KitePinPage(driver);			
			pin.sendPin(PIN);
			pin.clickOncontinueButton();
						
			Thread.sleep(2000);
			
			KiteHomePage home=new KiteHomePage(driver);
			home.validateUserName(UN);
			home.logOut();
			
			
			driver.close();
			
			
				
	}

}
