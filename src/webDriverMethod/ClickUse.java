package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUse {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
	
		driver.findElement(By.xpath("//input[@value='Radio4']")).click();
		
		
		
	}

}
