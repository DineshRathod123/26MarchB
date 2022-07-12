package verificationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void myMethod() 
  {
	  boolean p=true;
	  boolean q=false;
	  
//	  Assert.assertTrue(p, "tc is failed value is false");
//	  Reporter.log("tc is passed value is true",true);
	  
	  Assert.assertFalse(q, "tc is failed value is true");
	  Reporter.log("tc is passed value is false", true);
	  
  }
}
