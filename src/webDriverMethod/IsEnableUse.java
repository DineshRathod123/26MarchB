package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableUse {

	public static void main(String[] args) throws InterruptedException
	{
		    System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
			
			WebElement outputget = driver.findElement(By.xpath("//button[text()='Get OTP']"));
			System.out.println(outputget.isEnabled());
			
		//	driver.findElement(By.id("mobileNumber")).sendKeys("8262991773");
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9604283051");
			System.out.println(outputget.isEnabled());
			outputget.click();
			
			
			

	}

}
