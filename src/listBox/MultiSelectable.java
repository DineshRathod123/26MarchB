package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/select-menu");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
		    WebElement multiselectelement = driver.findElement(By.name("cars"));
		    
		    Select s=new Select(multiselectelement);
		    
		    System.out.println("multi select status is " +s.isMultiple());
		    
		    s.selectByVisibleText("Volvo");
		    s.selectByValue("saab");
		    s.selectByIndex(3);
		    
//		    //s.deselectall();
//		    Thread.sleep(1000);
//		    s.deselectByIndex(3);
//		    Thread.sleep(1000);
//		    s.deselectByValue("saab");
//		    Thread.sleep(1000);
//		    s.deselectByIndex(2);
		    
		    System.out.println(s.getFirstSelectedOption().getText());
		    
		    s.getAllSelectedOptions();
		    

	}

}
