package setsizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			System.out.println(driver.manage().window().getPosition());
			
			// to set position we need to create an object of point class and pass X and Y coordinate
			
		   Point p=new Point(300, 9);
			
			// using set position method we can set the browser position
			
			driver.manage().window().setPosition(p);
	

	}

}
