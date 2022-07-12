package miscellaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebpage {

	public static void main(String[] args) throws InterruptedException 
	{

		  System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(2000);
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			
			System.out.println(links.size());
			
			// using Iterator
			
			Iterator<WebElement> li = links.iterator();
			
			while(li.hasNext())
			{
				System.out.println(li.next().getText());
			}
			
			System.out.println("============================");
			
			// using for each loop
			
			for( WebElement x:links)
			{
				System.out.println(x.getText());
			}

	}

}
