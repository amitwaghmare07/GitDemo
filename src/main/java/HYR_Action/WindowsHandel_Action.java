package HYR_Action;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import HYR_Locator.DropDown_Locator;
import HYR_Locator.WindowsHandel_Locator;
import WebCommonFunction.WebAlert;
import WebCommonFunction.WebButton;
import WebCommonFunction.WebCheckBox;
import WebCommonFunction.WebDropDown;
import WebCommonFunction.WebRadioButton;
import WebCommonFunction.WebTextBox;
import WebCommonFunction.WebWindowsHandel;

public class WindowsHandel_Action {

	public WebDriver driver;
	public WindowsHandel_Locator windowsOption;
	public ExtentTest graphicalTest=null;
	WebWindowsHandel ob;
	String parentId;
	String childId;
	public WindowsHandel_Action(WebDriver driver,ExtentTest graphicalTest)
	{
		this.driver=driver;
		this.graphicalTest=graphicalTest;
		windowsOption =new WindowsHandel_Locator(driver);
		
	}
	public void selectFirst()
	{
		if(windowsOption.selectfirst()!=null)
		{
			WebButton.click(windowsOption.selectfirst());
			graphicalTest.log(LogStatus.PASS, "Click on Select Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Click on Button Failed ");
		}
	}
	public void ClickOnWindowsHandel()
	{
		if(windowsOption.ClickOnWindowsHandel()!=null)
		{
			WebButton.click(windowsOption.ClickOnWindowsHandel());
			graphicalTest.log(LogStatus.PASS, "Click on DropDown Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Click On Button Failed ");
		}
	}
	public void enterNameFirst(String userName)
	{
		if(windowsOption.windowsOption()!=null)
		{
			WebTextBox.sendInput(windowsOption.windowsOption(),userName);
			graphicalTest.log(LogStatus.PASS, "Password Entered successfully");
		}else
		{
			graphicalTest.log(LogStatus.FAIL, "Incorrect password ");
		}
	}
	
	
	public void clickOnWindow(WebDriver driver)
	{
		if(windowsOption.clickOnWindow()!=null)
		{
			WebButton.click(windowsOption.clickOnWindow());
			//WebWindowsHandel ob	= new WebWindowsHandel();
			//ob.WebWindowsHandel(driver);
			Set<String>windows=driver.getWindowHandles();//[parent,child window]
			Iterator<String> it=windows.iterator();
			this. parentId=it.next();
			this. childId=it.next();
			driver.switchTo().window(childId);
			driver.manage().window().maximize();
			
			 

			graphicalTest.log(LogStatus.PASS, "Click on DropDown Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Click On Button Failed ");
		}
	}
		
	public void enterNameFirstWindow(String userName)
	{
		if(windowsOption.firstName()!=null)
		{
			WebTextBox.sendInput(windowsOption.firstName(),userName);
			
			
			graphicalTest.log(LogStatus.PASS, "Password Entered successfully");
		}else
		{
			graphicalTest.log(LogStatus.FAIL, "Incorrect password ");
		}
	}
	public void enterLastNameWindow(String lastName)
	{
		if(windowsOption.lastName()!=null)
		{
			WebTextBox.sendInput(windowsOption.lastName(),lastName);
			graphicalTest.log(LogStatus.PASS, "Password Entered successfully");
		}else
		{
			graphicalTest.log(LogStatus.FAIL, "Incorrect password ");
		}
	}
	public void ClickOnRadioButton()
	{
		if(windowsOption.radioButton()!=null)
		{
			WebRadioButton.click(windowsOption.radioButton());
			graphicalTest.log(LogStatus.PASS, "Click on Radio Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Click On Button Failed ");
		}
	}
	public void checkBoxSingel()
	{
		if(windowsOption.checkBoxSingel()!=null)
		{
			WebCheckBox.clickOnsingelCheckBox(windowsOption.checkBoxSingel());
			
			WebButton.click(windowsOption.clickOnWindow());
			driver.switchTo().window(childId);
			WebCheckBox.clickOnsingelCheckBox(windowsOption.checkBoxSingel());
			//driver.close();
			
			graphicalTest.log(LogStatus.PASS, " successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "checkbox selection Failed ");
		}
	}
	public void clickOnAllCheckBox()
	{
		if(windowsOption.checkBoxMultiple()!=null)
		{	
			WebCheckBox.clickOnMultipleCheckBox(windowsOption.checkBoxMultiple());
			driver.switchTo().window(parentId);
			WebTextBox.clearInput(windowsOption.windowsOption());
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Yogesh");
			
			graphicalTest.log(LogStatus.PASS, "Click on CheckBox  successfully");
		}
	}
	public void ClickOnWindowsTab()
	{
		if(windowsOption.windowsTab()!=null)
		{
			WebButton.click(windowsOption.windowsTab());
			// new WebWindowsHandel(driver);
			
			graphicalTest.log(LogStatus.PASS, "Click on DropDown Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Click On Button Failed ");
		}
	}
		public void ClickOnAletButton()
		{
			if(windowsOption.clickOnAlert()!=null)
			{
				WebButton.click(windowsOption.clickOnAlert());
				WebAlert element =new WebAlert(driver);
				//ob.WebWindowsHandel(driver);
				//driver.close();
				
				
				graphicalTest.log(LogStatus.PASS, "Click on Alert Button successfully");
			}
			else
			{
				graphicalTest.log(LogStatus.FAIL, "Click On Button Failed ");
			}
	}
	public void WindowsAction(String userName,String name,String lastName)
	{
		selectFirst();
		ClickOnWindowsHandel();
		enterNameFirst(userName);
		clickOnWindow(driver);
		enterNameFirstWindow(name);
	enterLastNameWindow(lastName);
		ClickOnRadioButton();
		//checkBoxSingel();
	clickOnAllCheckBox();
	//	enterNameFirst(userName);
		//ClickOnWindowsTab();
		//ClickOnAletButton();
	}
	
	
	
}
