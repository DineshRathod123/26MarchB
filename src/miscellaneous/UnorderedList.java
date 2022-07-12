package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			
			Thread.sleep(2000);
			
			driver.findElement(By.name("q")).sendKeys("honda");
			Thread.sleep(200);
			
			List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
			Thread.sleep(2000);
			System.out.println(searchResults.size());
			
			// using for each
			
			for(WebElement a:searchResults) // getting text only
			{
				System.out.println(a.getText());
			}
		
			for(WebElement result:searchResults) // for clicking on required result
			{
				String actualText = result.getText();
				String expectedText = "honda amaze";
				
				if(actualText.equals(expectedText))
				{
					result.click();
					break;
				}
			}
			
		driver.findElement(By.linkText("Images")).click();
	}

	}
