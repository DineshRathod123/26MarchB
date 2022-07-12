package testNGstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnoTationStudy1 {
  @Test
  public void PaymentOption()
  {
	  
	  Reporter.log("Payment is done",true);
	  
  }
  @BeforeMethod
  public void LoginPaymentPortal() 
  {
	  Reporter.log("login is successfull",true);
	  
  }

  @AfterMethod
  public void LogoutPaymentPortal()
  {
	  Reporter.log("logout is done",true);
	  
  }

  @BeforeClass
  public void LaunchBrowser() 
  {
	  Reporter.log("browser launched",true);
	  
  }

  @AfterClass
  public void CloseBrowser() 
  {
	  Reporter.log("browser closed",true);
	  
  }

}
