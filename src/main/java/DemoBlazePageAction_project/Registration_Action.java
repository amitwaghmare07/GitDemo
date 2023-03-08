package DemoBlazePageAction_project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import DemoBlazePageLocators_Project.Registration_Locator;
import WebCommonFunction.WebButton;
import WebCommonFunction.WebTextBox;

public class Registration_Action {
	
	public WebDriver driver=null;
	public ExtentTest graphicalTest=null;
	
	Registration_Locator regpagePL=null;
	
	
	public Registration_Action(WebDriver driver,ExtentTest graphicalTest) 
	{
		this.driver=driver;
		this.graphicalTest=graphicalTest;
		
	regpagePL=new	Registration_Locator(driver);
	}
	
	

	public void clickLoginButton()
	{
		if(regpagePL.logbtn()!=null)
		{
			//WebElement btn=regpagePL.logbtn();or
			WebButton.click(regpagePL.logbtn());
			graphicalTest.log(LogStatus.PASS, "Click on Login Button successfully");
			
		}else
		{
			graphicalTest.log(LogStatus.FAIL, "Login Button Failed ");
		}
	}
	
	
	public void enterUserName(String userVal) throws InterruptedException
	{
		//Thread.sleep(2000);
		WebElement user=regpagePL.userName();
		if(user!=null)
		{
			WebTextBox.sendInput(user,userVal);
			graphicalTest.log(LogStatus.PASS, "UserName Entered Successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Worng UserName Entered ");
		}
	}
	
	public void enterUserPassword(String userPassword) throws InterruptedException
	{
		//Thread.sleep(2000);
		if(regpagePL.password()!=null)
		{
			WebTextBox.sendInput(regpagePL.password(),userPassword);
			graphicalTest.log(LogStatus.PASS, "Password Entered successfully");
		}else
		{
			graphicalTest.log(LogStatus.FAIL, "Incorrect password ");
		}
	}
	public void clickLogin()
	{
		if(regpagePL.loginbtn()!=null)
		{
			WebButton.click(regpagePL.loginbtn());
			graphicalTest.log(LogStatus.PASS, "Click on Login  Button successfully ");
		}else
		{
			graphicalTest.log(LogStatus.FAIL, "Click on Login  Button failed ");
		}
	}
	public void regPageOneAction(String user,String pass) throws  Exception
	{
		clickLoginButton();
		enterUserName(user);
		enterUserPassword(pass);
		clickLogin();

	}

}
