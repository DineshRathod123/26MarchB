package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCreation1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(2000);
			
			// how to find no of rows in table
			
			 List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
			 
			 int totalrows = rows.size();
			 System.out.println("Total no of rows in table"+totalrows);
			 
			// how to find no of columns in table
			 
			 List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
			 
			 int totalcolumns = columns.size();
			 System.out.println("Total no of colunms in a table"+totalcolumns);
			 
			 System.out.println("==============================");
			 
			// how to read header
			 
			 for(WebElement header:columns)
			 {
				 System.out.print(header.getText()+" ");
			 }
			 
			 // how to read all rows from table
			 
			 List<WebElement> allrowsdata = driver.findElements(By.xpath("//table//tr"));
			 
			 Iterator<WebElement> it = allrowsdata.iterator();
			 
			 while(it.hasNext())
			 {
				 System.out.print(it.next().getText()+" ");
				 System.out.println();
				 
			 }
			 
	}

}
