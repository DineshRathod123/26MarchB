package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
//			WebElement output = driver.findElement(By.xpath("//input[@name='show-hide']"));
//			output.sendKeys("prasad");
		   
		
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File distination=new File("C:\\velocity\\screenshot1.png");
			
			FileHandler.copy(source, distination);
			
			
			
			
	}

}
