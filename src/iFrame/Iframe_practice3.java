package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe_practice3 {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			// for main page
			
			String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
			System.out.println(text);
			
			// switch to frame 2    / using listbox method 
			
			driver.switchTo().frame("frame2");
			WebElement dropdown = driver.findElement(By.id("animals"));
			dropdown.click();
			
			Select s=new Select(dropdown);
			s.selectByValue("big baby cat");
			
			// switch to main page
		
			driver.switchTo().parentFrame();
			
			// switch to frame 1
			
			driver.switchTo().frame("frame1");
			driver.findElement(By.xpath("(//input)[1]")).sendKeys("velocity");
			
			// switch to nested frame 
			
			driver.switchTo().frame("frame3");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			
			// switch to default
			driver.switchTo().defaultContent();
			
			
			

	}

}
