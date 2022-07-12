package KiteBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import KiteUtility.UtilityProp;

public class BaseBylistener
{
    protected static WebDriver driver;
	public void openBrowser() throws IOException
	{
		         
	       System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
	       
		    ChromeOptions opt=new ChromeOptions();
	        //opt.addArguments("headless");
		    opt.addArguments("disable-notifications");
	       // opt.addArguments("incognito");
	        driver=new ChromeDriver(opt);
		
		   driver.get("https://Kite.zerodha.com");
		   driver.manage().window().maximize();
		   driver.get(UtilityProp.getDataFromPropertyFile("URL"));
		   Reporter.log("launch Browser",true);
		   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  
	}
	
	public  void captureScreenshot(String TCname) throws IOException
	   {
		  
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File distination=new File("C:\\velocity\\MyScreenshot"+TCname+".png");
			
			FileHandler.copy(source, distination);
				   
	   }

}
