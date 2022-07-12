package parallelAndserialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass1 {
  @Test
  public void myMethod() 
  {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://Kite.zerodha.com");
		driver.manage().window().maximize();
	  
  }
}
