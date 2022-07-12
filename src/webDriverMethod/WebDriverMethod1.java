package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// 1) get---> to enter url in browser or to open an application.
		
	
		
		driver.get("https://www.cricbuzz.com/");
		
		// 2) close --> to close the current tab of the browser opened by selenium tool.
		
		//driver.close();
		
		// 3) quit--> 
		
	    //	driver.quit();
		
		// 4) maximize / minimize---> used to minimize / maximize the browser
		
//		driver.manage().window().maximize();
//		driver.manage().window().minimize();
//		
		// 5) navigate--> this method is used to open an application, move forward,backward and refresh the webpage.
		
	//	driver.navigate().to("https://in.bookmyshow.com/");
	//	Thread.sleep(5000);
	//	driver.navigate().back();
	//	Thread.sleep(5000);
	//	driver.navigate().forward();
	//	driver.navigate().refresh();
		
	//	Thread.sleep(5000);
		
		// 6) getTitle--> this method is use to get title of a webpage.return type is string value
//		
//		driver.getTitle();
//		String title = driver.getTitle();
//		
//		System.out.println(title);
		
		// 7) getCurrentURL-->
		
		System.out.println(driver.getCurrentUrl());
		String output = driver.getCurrentUrl();
		System.out.println(output);
		
		
		
	
		
	}

}
