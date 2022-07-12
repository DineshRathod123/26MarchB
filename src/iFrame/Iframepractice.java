package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframepractice {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://skpatro.github.io/demo/iframes/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
		    String output = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
		    System.out.println(output);
		    
		    // switch to frame
		    
		   // driver.switchTo().frame("Frame1");
		      driver.switchTo().frame(0);
		    
		    String output2 = driver.findElement(By.id("frametext")).getText();
		    System.out.println(output2);
		    
		    // switch to main page
		    
		    driver.switchTo().parentFrame();
		    
		    String output3 = driver.findElement(By.linkText("Blogger")).getText();
			System.out.println(output3);
			
			// switch to another frame
			
			driver.switchTo().frame(1);
			
			String output4 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
			System.out.println(output4);
			
			// switch to main page
			
			driver.switchTo().defaultContent();
			
			String output5 = driver.findElement(By.linkText("Pavilion")).getText();
			System.out.println(output5);
			System.out.println("something change in my iframe");
			
			
			
	}

}
