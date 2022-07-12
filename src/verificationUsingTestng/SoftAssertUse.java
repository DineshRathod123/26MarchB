package verificationUsingTestng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod()
  {
	  String a="abc";
	  String b="abc";
	  
	  // create object of soft assert class 
	  
	  SoftAssert soft=new SoftAssert();
	  
	  soft.assertNull(a,"values is not null tc is failed");
	  soft.assertNotEquals(a, b,"both the values are equal tc is failed");
	  
	  soft.assertAll();
	  
  }
  
  @Test
  public void myMethod1()
  {
	  boolean p=true;
	  boolean q=false;
	  
	  
	  // create object of soft assert class 
	  
	  SoftAssert soft=new SoftAssert();
	  
	  soft.assertTrue(q,"value is failed tc is failed");
	  soft.assertFalse(p, "value is true tc is failed");
	  
	  soft.assertAll();
  }
  
  @Test
  public void myMethod2()
  {
	  String c=null;
	  String d="mno";
	  
      // create object of soft assert class 
	  
	  SoftAssert soft=new SoftAssert();
	  
	  soft.assertEquals(c, d,"c and d values are not equal tc is failed");
	  soft.assertNotNull(c, "d value is null tc is failed");
	  
	  soft.assertAll();
	  
  }
  
}
