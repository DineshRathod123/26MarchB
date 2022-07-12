package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			Thread.sleep(2000);
			
			// find source and destination
			
			WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
			
			WebElement destination = driver.findElement(By.id("amt8"));
			
			// How to drag and drop using action class
			
			// create an object of action class and pass the driver object
			
			Actions act=new Actions(driver);
			
			// by using action class method perform desired action
			
			act.dragAndDrop(source, destination).perform();

	}

}
