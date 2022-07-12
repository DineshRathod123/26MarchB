package kiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://Kite.zerodha.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement userID = driver.findElement(By.id("userid"));
			WebElement passWord = driver.findElement(By.id("password"));
			WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			userID.sendKeys("ELR321");
			passWord.sendKeys("Dhana1111");
			loginButton.click();
			
			
			Thread.sleep(1000);
			WebElement pin = driver.findElement(By.id("pin"));
			WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			pin.sendKeys("982278");
			continueButton.click();
			
			Thread.sleep(2000);
			WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
			
			String actualuserID = userName.getText();
			String expecteduserID = "ELR321";
			
			if(actualuserID.equals(expecteduserID))
			{
				System.out.println("User ID matching and test case is passed");
			}
			else
			{
				System.out.println("User ID not matching and test case is failed");
			}
			
			userName.click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@target='_self']")).click();
			
			Thread.sleep(2000);
			driver.close();
			
			
	}

}
