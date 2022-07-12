package verificationUsingTestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myMethod()
  {
	  
	  String a="mumbai";
	  String b="mumbai1";
	  
//	  Assert.assertEquals(a, b,"a and b values are not matching tc is failed");
//	  Reporter.log("a and b values are matching tc passed",true);
	  
	  Assert.assertNotEquals(a, b,"a and b values are matching tc is failed");
	  Reporter.log("a and b values are not matching tc passed",true);
  }
}
