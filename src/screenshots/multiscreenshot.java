package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class multiscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			String apply = RandomString.make(5); // to create multiple screenshots by this one
			
			
            File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File distination=new File("C:\\velocity\\screenshot1"+apply+".png");
			
			FileHandler.copy(source, distination);
			
	}

}
