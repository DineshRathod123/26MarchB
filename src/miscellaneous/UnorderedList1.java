package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("sajal ali");
		Thread.sleep(2000);
		List<WebElement> output = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		System.out.println(output.size());
		
		// using for each
		
		for(WebElement x:output)  // for text only
		{
			System.out.println(x.getText());
		}
		
		for(WebElement result:output) // for required result
		{
			String actualText= result.getText();
			String expectedText= "sajal ali age";
			
			if(actualText.equals(expectedText))
			{
				result.click();
				break;
				
			}
			
		}
		
		driver.findElement(By.linkText("Images")).click();
		
		
		List<WebElement> multiple = driver.findElements(By.tagName("img"));
		Thread.sleep(2000);
		System.out.println(multiple.size());
	}

}
