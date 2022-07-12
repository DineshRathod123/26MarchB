package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(2000);
			
			WebElement hide = driver.findElement(By.id("hide-textbox"));
		    WebElement show = driver.findElement(By.id("show-textbox"));
		    WebElement textbox = driver.findElement(By.name("show-hide"));
			
		    if(textbox.isDisplayed())
		    {
		    	System.out.println("Thanks to displaying textbox");
		    }
		    else
		    {
		    	System.out.println("cannot find textbox");
		    }
		    
		    hide.click();
		    
		    if(textbox.isDisplayed())
		    {
		    	System.out.println("Thank u textbox is displayed");
		    }
		    else
		    {
		    	System.out.println("cant find textbox");
		    }
		    
		    show.click();
		    
		    if(textbox.isDisplayed())
		    {
		    	System.out.println("Thank u textbox is displayed");
		    }
		    else
		    {
		    	System.out.println("cant find textbox");
		    }
		    
		
		
	}

}
