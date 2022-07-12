package verificationUsingTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyRadioButton {
  @Test
  public void myMethod() throws InterruptedException 
  {
	  	   
	    System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='Radio2']"));
		radioButton.click();
		Thread.sleep(500);
		
//		if(radioButton.isSelected())
//		{
//			Reporter.log("Tast case is pass radio button is selected",true);
//		}
//		else
//		{
//			Reporter.log("Tast case is failed radio button is not selected",true);
//		}
		
		Assert.assertTrue(radioButton.isSelected(),"radio button is not selected tc is failed");
				
  }
}
