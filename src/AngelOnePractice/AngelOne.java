package AngelOnePractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AngelOne {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://trade.angelbroking.com/Login");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement UserID = driver.findElement(By.id("txtUserID"));
		 WebElement password = driver.findElement(By.id("txtTradingPassword"));
		 WebElement loginID = driver.findElement(By.id("loginBtn"));
		 
		 UserID.sendKeys("V342742");
		 password.sendKeys("Vijay@1995");
		 loginID.click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("tabclose")).click();
//		 Alert alt = driver.switchTo().alert();
//		 alt.accept();
		 
		 WebElement username = driver.findElement(By.xpath("//a[text()='V342742 ']"));
		 username.click();
		 Thread.sleep(2000);
		 
		 String actualuserID = username.getText();
		 System.out.println(actualuserID);
		 String expecteduserID ="V342742";
		 
		 if(actualuserID.equals(expecteduserID))
		 {
			 System.out.println("User ID matching and test case is passed");
		 }
		 else
		 {
			 System.out.println("User ID not matching and test case is failed");
		 }
		 
		
	}

}
