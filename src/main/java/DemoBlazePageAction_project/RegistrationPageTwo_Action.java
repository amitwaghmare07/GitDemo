package DemoBlazePageAction_project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import DemoBlazePageLocators_Project.RegistrationPageTwo_Locator;
import WebCommonFunction.WebAlert;
import WebCommonFunction.WebButton;
import dataSources.ExpliciteWait;

public class RegistrationPageTwo_Action {

	public WebDriver driver=null;
	public RegistrationPageTwo_Locator regpagePL;
	public ExtentTest graphicalTest=null;
	
	public RegistrationPageTwo_Action(WebDriver driver, ExtentTest graphicalTest)
	{
		//super(driver);
		this.driver=driver;
		this.graphicalTest= graphicalTest;
		regpagePL=new RegistrationPageTwo_Locator(driver);
		
	}
	
	public void clickPhoneButton()
	{
		if(regpagePL.phoneClick()!=null)
		{
			WebButton.click(regpagePL.phoneClick());
			graphicalTest.log(LogStatus.PASS, "Click on phone Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Login Button Failed ");
		}
	}
	public void clickOnMobileSam()
	{
		if(regpagePL.clickOnbtn()!=null)
		{
			WebButton.click(regpagePL.clickOnbtn());
			graphicalTest.log(LogStatus.PASS, "Click on samsungMobile  Options successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Login Button Failed ");
		}
	}
	public void addToCart()
	{
		if(regpagePL.addToCart()!=null)
		{
			WebButton.click(regpagePL.addToCart());
			graphicalTest.log(LogStatus.PASS, "AddToCart successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Login Button Failed ");
		}
			
	}
	public void alert()
	{
		WebAlert al=new WebAlert(driver);
		graphicalTest.log(LogStatus.PASS, "Alert Accepted successfully");
	}
	/*public void alert()
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		//alert.accept();
		graphicalTest.log(LogStatus.PASS, "Alert Accepted successfully");
	}*/
	public void regPageTwoAction() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		clickPhoneButton();
		//Thread.sleep(2000);
		clickOnMobileSam();
		//Thread.sleep(2000);
		addToCart();
		//Thread.sleep(2000);
		alert();
	}
	
}
