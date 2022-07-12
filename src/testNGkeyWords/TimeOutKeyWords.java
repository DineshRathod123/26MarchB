package testNGkeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutKeyWords {
	@Test
	  public void p() 
	  {
		  Reporter.log("p is running",true);
	  }
	  
	  @Test(timeOut=1000)
	  public void v() throws InterruptedException 
	  {
		  Thread.sleep(200);
		  Reporter.log("v is running",true);
	  }
	  
	  @Test
	  public void a() 
	  {
		  Reporter.log("a is running",true);
	  }
}
