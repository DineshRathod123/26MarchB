package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		    System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			//driver.findElement(By.id("confirmButton")).click();
			driver.findElement(By.id("promtButton")).click();
			Thread.sleep(5000);
			//1. to handle alert popup we need to switch selenium focus from main page to alert popup bu using syntax
             
			Alert alt = driver.switchTo().alert();
			
		    // 2.Alert is an interface which contains abstract methods like:
			//	1. accept(): use to click on ok button.
			//	2. dismiss(): use to click on cancel button.
			//	3. getText(): use to get text present in a alert popup.

			//alt.accept();
			//alt.dismiss();
						
			System.out.println(alt.getText());
			Thread.sleep(6000);
			alt.sendKeys("velocity");
			
			
	}

}
