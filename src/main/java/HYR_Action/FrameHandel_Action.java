package HYR_Action;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import HYR_Locator.DropDown_Locator;
import HYR_Locator.FrameHandel_Locator;
import HYR_Locator.WindowsHandel_Locator;
import WebCommonFunction.WebAlert;
import WebCommonFunction.WebButton;
import WebCommonFunction.WebCheckBox;
import WebCommonFunction.WebDropDown;
import WebCommonFunction.WebFrame;
import WebCommonFunction.WebRadioButton;
import WebCommonFunction.WebTextBox;
import WebCommonFunction.WebWindowsHandel;

public class FrameHandel_Action {

	public WebDriver driver;
	public FrameHandel_Locator frameOption;
	public ExtentTest graphicalTest=null;
	public FrameHandel_Action(WebDriver driver,ExtentTest graphicalTest)
	{
		this.driver=driver;
		this.graphicalTest=graphicalTest;
		frameOption =new FrameHandel_Locator(driver);
		
	}
	public void selectFirst()
	{
		if(frameOption.selectfirst()!=null)
		{
			WebButton.click(frameOption.selectfirst());
			graphicalTest.log(LogStatus.PASS, "Click on Select Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Click on Button Failed ");
		}
	}
	public void ClickOnFrameHandel()
	{
		if(frameOption.ClickOnFramesPractice()!=null)
		{
			WebButton.click(frameOption.ClickOnFramesPractice());
			graphicalTest.log(LogStatus.PASS, "Click on DropDown Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Click On Button Failed ");
		}
	}
	public void enterNameFirst(String userName)
	{
		if(frameOption.enterName()!=null)
		{
			WebTextBox.sendInput(frameOption.enterName(),userName);
			graphicalTest.log(LogStatus.PASS, "Password Entered successfully");
		}else
		{
			graphicalTest.log(LogStatus.FAIL, "Incorrect password ");
		}
	}
	
	
	public void switchToFrame()
	{
		if(frameOption.switchToFrame()!=null)
		{
			new WebFrame(driver,frameOption.switchToFrame());
			 

			graphicalTest.log(LogStatus.PASS, "switchToFrame successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Click On Button Failed ");
		}
	}
		
	public void selectOption(String course)
	{
		if(frameOption.selectOption()!=null)
		{
			WebButton.click(frameOption.selectOption());
			WebDropDown.selelctByVisibleText(frameOption.selectOption(), course);
			graphicalTest.log(LogStatus.PASS, "Select option successfully");
		}else
		{
			graphicalTest.log(LogStatus.FAIL, "Incorrect password ");
		}
	}
	
	public void FrameAction(String name,String course)
	{
		selectFirst();
		ClickOnFrameHandel();
		enterNameFirst(name);
		switchToFrame();
		selectOption(course);
	}
	
	
	
}
