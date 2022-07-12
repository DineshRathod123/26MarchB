package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void myMethod3() throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://Kite.zerodha.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	  
  }
  
  @Test
  public void myMethod4() throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	  
  }
  
}
