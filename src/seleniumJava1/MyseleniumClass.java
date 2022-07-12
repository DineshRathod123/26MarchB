package seleniumJava1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyseleniumClass {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\javaselenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flashscore.in/football/");
		//driver.get("https://vctcpune.com/");
		//driver.get("https://www.arsenal.com/");
//       driver.get("https://vctcpune.com/selenium/practice.html");
//       driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(" hi am velocity member");
//       driver.findElement(By.xpath( "//input[@type='radio']")).click();
       //  driver.get("https://www.facebook.com/login/");
         
         driver.get("https://www.flipkart.com/");
      
    //   driver.findElement(By.xpath("//input[contains(@placeholder,\"Email\")]")).sendKeys(" DINESH IT Engg");
     //   driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
         
         driver.findElement(By.xpath("(//div[contains(text(),'xt')])[2]"));
	}

}
