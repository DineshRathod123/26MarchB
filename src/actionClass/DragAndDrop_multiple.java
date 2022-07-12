package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_multiple {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			Thread.sleep(3000);
			
			WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
			WebElement destination = driver.findElement(By.id("amt8"));
			
			Actions act=new Actions(driver);
			
			act.dragAndDrop(source, destination).perform();
			
			Thread.sleep(3000);
			
			WebElement source1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
			WebElement destination1 = driver.findElement(By.id("amt7"));
			
			act.dragAndDrop(source1, destination1).perform();

	}

}
