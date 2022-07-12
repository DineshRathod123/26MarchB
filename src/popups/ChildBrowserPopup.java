package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException
	{

	    System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String mainPageID = driver.getWindowHandle(); // id of main page
		System.out.println(mainPageID);
		
		System.out.println("====================================");
		
		// to open child window
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(3000);
		
		// to handle multiple windows /to get multiple ids
		
		Set<String> allPageID = driver.getWindowHandles();
		
		Iterator<String> it = allPageID.iterator();
		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		 String  mainPageid=it.next(); // will return main page id
		 String childPageid=it.next(); //  will return child page id
		 
		 // switch focus to child window
		 
		 driver.switchTo().window(childPageid); // changing the focus from main page to child page
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Velocity center");
		 
//		 driver.close(); will close only current focus tab
//		 driver.quit();  will close all tabs/pages open by selenium
		 
		 driver.switchTo().window(mainPageid);
		 
		 WebElement myElement = driver.findElement(By.xpath("//p[text()='Click below to open link in new browser window']"));
         System.out.println(myElement.getText());
         
	}

}
