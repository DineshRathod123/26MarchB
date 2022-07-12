package grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass2 {
  
	@Test
	  public void m() 
	  {
		 // Assert.fail();
		  Reporter.log("m is running",true);
	  }
	  
	  @Test(groups= {"regression"})
	  public void n() 
	  {
		  Reporter.log("n is running regression",true);
	  }
	  
	  @Test(groups= {"sanity"})
	  public void o() 
	  {
		  Reporter.log("o is running sanity",true);
	  }
	  
	  @Test(groups= {"regression"})
	  public void p()
	  {
		  Reporter.log("p is running regression",true);
	  }
		  
}
