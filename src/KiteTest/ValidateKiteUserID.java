package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import KiteUtility.Utility;
import kitePOMusingExcel.KiteHomePage;
import kitePOMusingExcel.KiteLoginPage;
import kitePOMusingExcel.KitePinPage;



public class ValidateKiteUserID extends Base
{
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	
	
  @BeforeClass
  public void launchBrowser() 
  {
	  openBrowser();
	  login=new KiteLoginPage(driver);
	  pin=new KitePinPage(driver);
	  home=new KiteHomePage(driver);
	   
  }
  
  @BeforeMethod
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  login.sendUserName(Utility.readDataFromExcel(5, 0));
	  login.sendPassword(Utility.readDataFromExcel(5, 1));
	  login.clickOnLoginButton();	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  pin.sendPin(Utility.readDataFromExcel(5, 2));
	  pin.clickOncontinueButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  	  
  }
  
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(5, 0),"actual and expected are not matching tc is failed");
	    
  }
  
  @AfterMethod
  public void logoutFromKite() throws InterruptedException
  {
	 home.logOut(); 
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
