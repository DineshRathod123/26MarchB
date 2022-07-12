package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityCross 
{
	
	public static void captureScreenshot(WebDriver driver,String TCID) throws IOException
	   {
		  
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File distination=new File("C:\\velocity\\MyScreenshot"+TCID+".png");
			
			FileHandler.copy(source, distination);
				   
	   }
	   
	   public static String getDataFromPropertyFile(String key) throws IOException
	   {
		   // create object of properties
		   
		   Properties prop=new Properties();
		   
		   FileInputStream myfile=new FileInputStream("C:\\Users\\91826\\eclipse-workspace\\MyProjectSelenium\\myProperties.Properties");
		   prop.load(myfile);
		   String value=prop.getProperty(key);
		   return value;
	   }
}
