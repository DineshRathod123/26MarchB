package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(2000);
			
			WebElement checkBox1 = driver.findElement(By.name("checkBoxOption1"));
			
			if(checkBox1.isSelected())
			{
			   System.out.println("checkBox is already selected");	
			}
			else
			{    
				checkBox1.click();
				System.out.println("checkBox is now selected");
			}

	}

}
