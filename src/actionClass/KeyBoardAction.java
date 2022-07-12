package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(2000);
			
			// find Element
			
			WebElement textBox = driver.findElement(By.id("autocomplete"));
			
			// textBox.sendKeys("I love u");---> using webelement method
			
			// How to sendkeys using action class
			
			// create an object of action class and pass driver object
			
			Actions act=new Actions(driver);
			
			act.sendKeys(textBox, "Good Afternoon").perform();
			
			// How to handle drop down using action class
			
			WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
			
			// using actions class method handle drop down
			act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			

	}

}
