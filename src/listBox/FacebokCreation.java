package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebokCreation {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/r.php");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("DINESH");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("RATHOD");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("rathoddinesh321@gmail.com");
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("rathoddinesh321@gmail.com");
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dinesh@123");
            
            // 1 select date
            
            WebElement date = driver.findElement(By.id("day"));
            Select s1=new Select(date);
            s1.selectByIndex(3);
            
            // 2 select month
            
            WebElement month= driver.findElement(By.id("month"));
            Select s2=new Select(month);
            s2.selectByValue("9");
            
            // 3 select year
            
            WebElement year = driver.findElement(By.id("year"));
            Select s3=new Select(year);
            s3.selectByVisibleText("1994");
            
            // select gender
            
            driver.findElement(By.xpath("//input[@value='2']")).click();
            
            // click on sign in button
            
//            WebElement button = driver.findElement(By.xpath("//button[@name='websubmit']"));
//            button.click();
//            
            
            driver.findElement(By.name("websubmit")).click();
            
            
            
            
	}

}
