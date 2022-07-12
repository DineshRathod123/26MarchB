package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_practice2 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://ui.vision/demo/webtest/frames/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			

			// switch the frame first
			
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("RATHOD");
			
			// reverse to the main page
			
			driver.switchTo().parentFrame();
			
			// switch to frame third
			
			driver.switchTo().frame(2);
			driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("corporation");
			
			// switch in nested frame
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@height='350']")));
			driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
			
			
			
			
           
	}

}
