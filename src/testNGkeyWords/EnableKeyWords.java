package testNGkeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableKeyWords {
	@Test
	  public void p() 
	  {
		  Reporter.log("p is running",true);
	  }
	  
	  @Test(enabled=false)
	  public void v() 
	  {
		  Reporter.log("v is running",true);
	  }
	  
	  @Test
	  public void a() 
	  {
		  Reporter.log("a is running",true);
	  }
}
