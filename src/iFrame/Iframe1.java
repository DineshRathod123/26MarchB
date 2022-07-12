package iFrame;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
	 		driver.switchTo().frame("iframeResult");
			
			driver.findElement(By.xpath("//button[@type='button']")).click();
			
						
	}	
}
