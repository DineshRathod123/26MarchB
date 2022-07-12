package listenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass
{
  @Test
  public void myMethod() 
  {
	  Reporter.log("myMethod is running",true);
	  
  }
  @Test
  public void myMethod1() 
  {
	  Reporter.log("myMethod1 is running",true);
	  
  }
  @Test
  public void myMethod2() 
  {
	  //Assert.fail();
	  Reporter.log("myMethod2 is running",true);
	  
  }
  @Test(dependsOnMethods="myMethod2")
  public void myMethod3() 
  {
	  Reporter.log("myMethod3 is running",true);
	  
  }
  
}
