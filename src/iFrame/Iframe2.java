package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://skpatro.github.io/demo/iframes/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			String output = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
			System.out.println(output);
			 
			// driver.switchTo().frame("frame1"); // changing focus from main page to frame1
			
			driver.switchTo().frame(0);
			String output1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		    System.out.println(output1);
		    
		    // xpath by linked text
		    
		     driver.switchTo().parentFrame(); // switch focus from frame to main page
		     
		     String output2 = driver.findElement(By.linkText("Pavilion")).getText();
		     System.out.println(output2);
		     
		     driver.switchTo().defaultContent();
		     
		     String output3 = driver.findElement(By.linkText("Pavilion")).getText();
		     System.out.println(output3);
		     
	}

}
