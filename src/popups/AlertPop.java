package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) throws InterruptedException
	{

	    System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
		Thread.sleep(2000);
	    driver.findElement(By.id("confirmBox")).click();
		Alert a1 = driver.switchTo().alert();
	    System.out.println(a1.getText());
	    a1.accept();
	    
		Thread.sleep(5000);
	    driver.findElement(By.id("promptBox")).click();
		Alert a2 = driver.switchTo().alert();
		Thread.sleep(5000);
		
		System.out.println(a2.getText());
		a2.sendKeys("DINESH RATHOD");
		
		a2.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
	
		
		
	}

}
