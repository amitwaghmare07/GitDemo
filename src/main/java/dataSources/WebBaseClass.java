package dataSources;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import DemoBlaze_Common_Static_Data.Common_Static_Data;
import dataSources.WebBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebBaseClass {
	public static ExtentTest graphicalTest;
	public static ExtentReports graphicalReport;
	@BeforeSuite
	public void beforeSuiteStart() throws IOException
	{
			graphicalReport=new ExtentReports(PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"reportPath"),true);
	}
		
	public static WebDriver driver=null;
	
	
	
	/*@BeforeMethod
	public void beforeEachTest(Method testMethod) throws IOException
	{
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		String s=PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"browser");
		driver=WebBrowser.openBrowser(s);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//driver.get("https://www.demoblaze.com/");
		driver.get(PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"url"));
		
		graphicalTest=graphicalReport.startTest(testMethod.getName());
	}*/
	@BeforeMethod
	public void beforeTest(Method testMethod) throws IOException
	{
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		String s=PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"browser");
		driver=WebBrowser.openBrowser(s);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//driver.get("https://www.demoblaze.com/");
		driver.get(PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"url"));
		
		graphicalTest=graphicalReport.startTest(testMethod.getName());
	}
	@AfterSuite
	public void afterEachTest()
	{
		graphicalReport.endTest(graphicalTest);
		graphicalReport.flush();
		//driver.quit();
	}
	public static String screenCapture(WebDriver driver, String string) throws IOException
	{
		TakesScreenshot takeSS= (TakesScreenshot)driver;
		File sourceOutputFile=takeSS.getScreenshotAs(OutputType.FILE);
		File Dest=new File("./Screenshot/fullpage12.png");
		FileUtils.copyFile(sourceOutputFile, Dest);
		String errflpath=Dest.getAbsolutePath();
		return errflpath;
	}

}
