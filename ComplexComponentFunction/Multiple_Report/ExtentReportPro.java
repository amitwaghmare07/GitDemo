package Multiple_Report;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//import com.mongodb.MapReduceCommand.OutputType;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import DemoBlaze_Common_Static_Data.Common_Static_Data;
import dataSources.PropertyReader;

public class ExtentReportPro {
	
	 static ExtentTest graphicalTest;
	 static ExtentReports graphicalReport;
	
	@BeforeSuite
	public void beforeSuiteStart() throws IOException
	{
		
		graphicalReport=new ExtentReports("E:/projects/Maven_Project_Practice/Maven_Project_P1/Report/WebReport/Demo1.html",true);
	}
	@BeforeMethod
	public void beforeEachTest(Method testMethod)
	{
		graphicalTest=graphicalReport.startTest(testMethod.getName());
	}
	@Test
	public void TC1()
	{
		graphicalTest.log(LogStatus.PASS, "Navigate TO TC2");
	}
	@AfterMethod
	public void afterEachTest()
	{
		graphicalReport.endTest(graphicalTest);
		graphicalReport.flush();
	}
	public static String screenCapture(WebDriver driver) throws IOException
	{
		TakesScreenshot takeSS= (TakesScreenshot)driver;
		File sourceOutputFile=takeSS.getScreenshotAs(OutputType.FILE);
		File Dest=new File("./Screenshot/fullpage.png");
		FileUtils.copyFile(sourceOutputFile, Dest);
		String errflpath=Dest.getAbsolutePath();
		return errflpath;
	}
}
