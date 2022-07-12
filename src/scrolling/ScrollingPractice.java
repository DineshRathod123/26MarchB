package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPractice {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://vctcpune.com/selenium/practice.html");
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		    
		    WebElement output = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		    
		    JavascriptExecutor j = (JavascriptExecutor)driver;
		    j.executeScript("arguments[0].scrollIntoView(true)",output);
		    
		    driver.findElement(By.id("autocomplete")).sendKeys("shekhar bhosale");
		    driver.findElement(By.name("checkBoxOption1")).click();
		    
		    

	}

}
