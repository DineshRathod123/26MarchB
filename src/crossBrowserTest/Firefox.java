package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
  @Test
  public void myMethod() 
  {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\javaselenium\\geckodriver.exe");
		
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://vctcpune.com/");
	  
  }
}
