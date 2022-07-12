package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathOnReview {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("one plus 10r");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			
			WebElement text = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
			Thread.sleep(2000);
			System.out.println(text.getText());

	}

}
