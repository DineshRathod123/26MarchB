package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2
{
   
	@Test
	  public void myMethod4() 
	  {
		  Reporter.log("myMethod4 is running",true);
		  
	  }
	
	  @Test
	  public void myMethod5() 
	  {
		  Reporter.log("myMethod5 is running",true);
		  
	  }
	  
	  @Test
	  public void myMethod6() 
	  {
		 // Assert.fail();
		  Reporter.log("myMethod6 is running",true);
		  
	  }
	  
	  @Test(dependsOnMethods="myMethod6")
	  public void myMethod7() 
	  {
		  Reporter.log("myMethod7 is running",true);
		  
	  }	
	
}
