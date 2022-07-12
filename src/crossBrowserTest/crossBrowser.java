package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowser
{
	
   @Parameters("browserName")
   @Test
  public void myMethod(String name) throws InterruptedException
  {
	  WebDriver driver=null;
	  
	  if(name.equals("Firefox"))
	  {   
		  System.setProperty("webdriver.gecko.driver","C:\\javaselenium\\geckodriver.exe");
		
		  driver=new FirefoxDriver();
	  }
	  
	  else if(name.equals("chrome"))
	  {   
		  System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
		  driver=new ChromeDriver();
	  }
	     driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/");
		 Thread.sleep(2000);
		
	  
  }
}
