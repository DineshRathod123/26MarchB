package KiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base
{
	protected WebDriver driver;
	public void openBrowser()
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		    
		    ChromeOptions opt=new ChromeOptions();
		    opt.addArguments("headless");
			//opt.addArguments("disable-notifications");
		    // opt.addArguments("incognito");
		    driver=new ChromeDriver(opt);
			
			driver.get("https://Kite.zerodha.com");
			driver.manage().window().maximize();
			
			Reporter.log("launch Browser",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	

}
