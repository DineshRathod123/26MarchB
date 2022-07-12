package verificationUsingTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void multiMethod() 
  {
	  String k="thane";
	  String g="mumbai";
	  
	  Assert.assertNotEquals(k, g, "tc is failed values are equal");
	  Assert.assertNotNull(g, "tc is failed value is null");
	 
  }
}
