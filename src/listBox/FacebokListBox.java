package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebokListBox {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		
		    // 1.Select date
			WebElement date = driver.findElement(By.id("day"));
			Select s1=new Select(date);
		    s1.selectByIndex(3);
		    
		    // 2.Select month
		    WebElement month = driver.findElement(By.id("month"));
		    Select s2=new Select(month);
		    s2.selectByValue("9");
		    
		    // 3. Select year
		    WebElement year = driver.findElement(By.id("year"));
		    Select s3=new Select(year);
		    s3.selectByVisibleText("1994");
			
			
			
		
		
		
	}

}
