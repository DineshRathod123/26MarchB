package verificationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void myMethod() 
  {
	  String x=null;
	  String y="mno";
	  
//	  Assert.assertNull(x, "value is not null tc is failed");
//	  Reporter.log("value is null tc is passed",true);
	  
	  Assert.assertNotNull(y, "value is null tc is failed");
	  Reporter.log("value is not null tc is passed",true);
	  
	  Assert.fail();
  }
}
