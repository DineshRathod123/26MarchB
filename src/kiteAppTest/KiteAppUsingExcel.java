package kiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		 File myfile=new File("C:\\apache poi\\26marchB.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		 
		 String UN = mysheet.getRow(5).getCell(0).getStringCellValue();
		 String PWD = mysheet.getRow(5).getCell(1).getStringCellValue();
		 String PIN = mysheet.getRow(5).getCell(2).getStringCellValue();
		 
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://Kite.zerodha.com");
			Thread.sleep(2000);
			
			WebElement userID = driver.findElement(By.id("userid"));
			WebElement passWord = driver.findElement(By.id("password"));
			WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			userID.sendKeys(UN);
			passWord.sendKeys(PWD);
			loginButton.click();
			
			
			Thread.sleep(1000);
			WebElement pin = driver.findElement(By.id("pin"));
			WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			pin.sendKeys(PIN);
			continueButton.click();
			
			Thread.sleep(2000);
			WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
			
			String actualuserID = userName.getText();
			String expecteduserID =UN;
			
			if(actualuserID.equals(expecteduserID))
			{
				System.out.println("User ID matching and test case is passed");
			}
			else
			{
				System.out.println("User ID not matching and test case is failed");
			}
			
			userName.click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@target='_self']")).click();
			
			Thread.sleep(3000);
			driver.close();
			 
	}

}
