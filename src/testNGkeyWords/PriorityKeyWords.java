package testNGkeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeyWords {
  @Test(priority=-2)
  public void p() 
  {
	  Reporter.log("p is running",true);
  }
  
  @Test
  public void v() 
  {
	  Reporter.log("v is running",true);
  }
  
  @Test(priority=-1)
  public void a() 
  {
	  Reporter.log("a is running",true);
  }
}
