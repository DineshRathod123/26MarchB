package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Create New Account")).click();
			Thread.sleep(1000);
			
			WebElement day = driver.findElement(By.id("day"));
			
			// create object of action class
			
			Actions act=new Actions(driver);
			
			act.click(day).perform();
			
			for(int i=1; i<=9; i++)
			{
				act.sendKeys(Keys.ARROW_DOWN).perform();
				Thread.sleep(200);
			}
			act.sendKeys(Keys.ENTER).perform();
			
			WebElement namefirst = driver.findElement(By.name("firstname"));
			
		//	namefirst.sendKeys("Dinesh");
			
			
	act.keyDown(namefirst, Keys.SHIFT).sendKeys("d").keyUp(Keys.SHIFT).sendKeys("inesh").build().perform();

	}

}
