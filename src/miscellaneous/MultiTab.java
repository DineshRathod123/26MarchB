package miscellaneous;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTab {

	public static void main(String[] args) throws InterruptedException
	{

		  System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.w3schools.com/");
			
			Thread.sleep(2000);
			
			String MpId = driver.getWindowHandle();
			System.out.println(MpId);
			
			driver.findElement(By.linkText("Try it Yourself")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Try it Yourself")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Try it Yourself")).click();
			
			Set<String> MultiId = driver.getWindowHandles();
			
			// ArrayList al=new ArrayList(MultiId)
			
			for(String x:MultiId)
			{
				System.out.println(x);
				
				if(x.equals(MultiId))
				{
					driver.switchTo().window(x);
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
					
				}
			}
			
			driver.switchTo().window(MpId);
			String text = driver.findElement(By.linkText("Try it Yourself")).getText();
			System.out.println(text);
			
	}

}
