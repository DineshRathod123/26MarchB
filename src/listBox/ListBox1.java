package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(4000);
			
			// 1. Identify list box to be handled and store in the reference variable
			
			WebElement listBox = driver.findElement(By.name("dropdown-class-example"));
			
			// 2. Create an object of selects class which will accept WebElement as argument
			
			Select s=new Select(listBox );
			
			// 3. By using one of the select class method we can select values from list box like
			
			s.selectByVisibleText("Option3");
			
			s.selectByValue("option1");
			
			s.selectByIndex(3);

	}

}
