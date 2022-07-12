package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingView {

	public static void main(String[] args) 
	{
		
        System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/");

	    // Implicit Wait
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    
	    WebElement chinchwad = driver.findElement(By.xpath("//strong[text()='Chinchwad Branch']"));
	    
	    JavascriptExecutor j = (JavascriptExecutor)driver;
	    j.executeScript("arguments[0].scrollIntoView(true)",chinchwad);
	    
	    

	}

}
