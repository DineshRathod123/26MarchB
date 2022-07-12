package KiteUtility;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteBase.BaseBylistener;

public class UtilityListener extends BaseBylistener implements ITestListener
{
	
	// create an object 
	
	BaseBylistener bl=new BaseBylistener();
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("tc is passed TC name is"+result.getName(),true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		String TCname = result.getName();
		Reporter.log("tc is failed TC name is"+result.getName(),true);
		try 
		{
			bl.captureScreenshot(TCname);
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	


}
