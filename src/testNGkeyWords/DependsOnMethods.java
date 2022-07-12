package testNGkeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	  public void p() 
	  {
		 // Assert.fail();
		  Reporter.log("p is running",true);
	  }
	  
	  @Test
	  public void v() 
	  {
		  
		  Reporter.log("v is running",true);
	  }
	  
	  @Test (dependsOnMethods= {"p"}, priority=-1)
	  public void a() 
	  {
		  Reporter.log("a is running",true);
	  }
}
