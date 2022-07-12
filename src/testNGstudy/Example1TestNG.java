package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1TestNG {
  @Test
  public void myMethod() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://Kite.zerodha.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    
		System.out.println("Hi method is working");
		Reporter.log("Hi method is running this is reported output");
		Reporter.log("Hi method is working this is reported output",true);
		
  }
     
    @Test
    public void myMethod1() throws InterruptedException
    {
  	  System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
  		
  		WebDriver driver=new ChromeDriver();
  		
  		driver.get("https://www.facebook.com/r.php");
  		driver.manage().window().maximize();
  		Thread.sleep(2000);
  		
  		System.out.println("Hi this is dinesh rathod");
  		Reporter.log("this is reported by output",true);
  		
    }
  
}
