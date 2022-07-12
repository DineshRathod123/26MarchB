package testNGstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnoTationStudy {
  @Test
  public void ValidateUserID()
  {
	  Reporter.log("User ID is validated",true);
	  
  }
  
  @Test
  public void validateDashBoard()
  {
	  Reporter.log("DashBoard is validated",true);
	  
  }
  @BeforeMethod
  public void LoginKiteApp()
  {
	  Reporter.log("Login success",true); 
	  
  }

  @AfterMethod
  public void LogoutKiteApp()
  {
	  Reporter.log("Login out",true);
	  
  }

  @BeforeClass
  public void LaunchBrowser()
  {
	  Reporter.log("Browser launched",true); 
	  
  }

  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("Browser closed",true); 
	  
  }

}
