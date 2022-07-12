package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://Kite.zerodha.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			KiteLoginPage login=new KiteLoginPage(driver);
			
			login.sendUserName();
			login.sendPassword();
			login.clickOnLoginButton();
			
			Thread.sleep(2000);
			
			KitePinPage pin=new KitePinPage(driver);			
			pin.sendPin();
			pin.clickOncontinueButton();
						
			Thread.sleep(2000);
			
			KiteHomePage home=new KiteHomePage(driver);
			home.validateUserName();
			home.logOut();
			
			
			driver.close();
			
			
				
	}

}
