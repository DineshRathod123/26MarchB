package KitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName
{
	
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	
	
  @BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException
  {
	    System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
	    
	    ChromeOptions opt=new ChromeOptions();
	    opt.addArguments("headless");
		//opt.addArguments("disable-notifications");
	    // opt.addArguments("incognito");
	    driver=new ChromeDriver(opt);
		
		driver.get("https://Kite.zerodha.com");
		driver.manage().window().maximize();
		
		Reporter.log("launch Browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File myfile=new File("C:\\apache poi\\26marchB.xlsx");
	    mySheet = WorkbookFactory.create(myfile).getSheet("sheet2");
	     
	    login=new KiteLoginPage(driver);
	    pin=new KitePinPage(driver);
	    home=new KiteHomePage(driver);	  
  }
  
  @BeforeMethod
  public void loginToKiteApp()
  {
	     String UN =  mySheet.getRow(5).getCell(0).getStringCellValue();
		 String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
		 String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
		 
		 login.sendUserName(UN);
		 Reporter.log("sending username",true);
		 login.sendPassword(PWD);
		 Reporter.log("sending password",true);
		 login.clickOnLoginButton();
		 Reporter.log("click on login button",true);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		 pin.sendPin(PIN);
		 Reporter.log("sending PIN",true);
		 pin.clickOncontinueButton();
		 Reporter.log("click on continue button",true);
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  	   
  }
  
  @Test
  public void validateUserName()
  {
	   String expectedUN = mySheet.getRow(5).getCell(0).getStringCellValue();
	   String actualUN = home.getActualUserName();
	   Reporter.log("validate username",true);
	   Assert.assertEquals(actualUN, expectedUN,"actual and expected UNare not matching tc is failed");
	   Reporter.log("actual and expected UN are matching tc passed",true);	  
	  
  }
  
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException
  {
	  home.logOut();
	  Reporter.log("logging out",true);
	  	  
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Reporter.log("closing browser",true);
	  driver.close();
  }
  
	  
  
}
