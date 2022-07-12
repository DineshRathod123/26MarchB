package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCreation2 {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver","C:\\javaselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/web-table-element.php");
			
			Thread.sleep(2000);
			
			// get total no of rows
			
			List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
			
			int NoOfrows=rows.size();
			System.out.println("Total number of rows "+NoOfrows);
			
			// get total no of columns
			
			List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
			
			int NoOfcolumns=columns.size();
			System.err.println("Total number of columns "+NoOfcolumns);
			
			// read header of table
			
			for(WebElement header:columns)
			{
				System.out.print(header.getText()+" ");
			}
			System.out.println();
			
			// read rows from table
			
			for(int a=1; a<=NoOfrows-1; a++)
			{
				System.out.print(rows.get(a).getText()+" ");
				System.out.println();
			}
			

	}

}
