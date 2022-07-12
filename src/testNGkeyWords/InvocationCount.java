package testNGkeyWords;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount=5)
  public void myTest() 
  {
	  Reporter.log("Hi mister RATHOD",true);
  }
  
  @BeforeMethod
  public void test()
  {
	  Reporter.log("janhvi said",true); 
  }
}
