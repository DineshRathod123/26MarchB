package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEg1 {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			Thread.sleep(2000);
			
			WebElement seleniumButton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
			Thread.sleep(2000);
			// seleniumButton.click();---> using webelement method
			
			// How to click using action class
			// create object of action class and pass driver object
			
			Actions act=new Actions(driver);
			
			// using one the required action  complete the process
			
			// act.moveToElement(seleniumButton).perform();
			// act.click().perform();
			
			// act.moveToElement(seleniumButton).click().build().perform();
			
			// act.click(seleniumButton).perform();
			
			// How to right click(contextClick)using action class
			
			WebElement rightclickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
			
			// act.moveToElement(rightclickButton).contextClick().build().perform();
			
			// act.contextClick(rightclickButton).perform();
			
			// How to double click using action class
			
			WebElement doubleclickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			Thread.sleep(2000);
			act.doubleClick(doubleclickButton).perform();
			
			
	}

	
}
