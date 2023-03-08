package HYR_Action;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import HYR_Locator.DropDown_Locator;
import WebCommonFunction.WebButton;
import WebCommonFunction.WebDropDown;

public class DropDown_Action {

	public WebDriver driver;
	public DropDown_Locator selectOption;
	public ExtentTest graphicalTest=null;
	public DropDown_Action(WebDriver driver,ExtentTest graphicalTest)
	{
		this.driver=driver;
		this.graphicalTest=graphicalTest;
		selectOption =new DropDown_Locator(driver);
		
	}
	public void selectFirst()
	{
		if(selectOption.selectfirst()!=null)
		{
			WebButton.click(selectOption.selectfirst());
			graphicalTest.log(LogStatus.PASS, "Click on Select Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Click on Button Failed ");
		}
	}
	public void selectDropDown()
	{
		if(selectOption.dropDownClick()!=null)
		{
			WebButton.click(selectOption.dropDownClick());
			graphicalTest.log(LogStatus.PASS, "Click on DropDown Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Click On Button Failed ");
		}
	}
	public void selectSecondMethod(String index)
	{
		if(selectOption.selectSecond()!=null)
		{
			WebButton.click(selectOption.selectSecond());
			//WebDropDown.selelctByVisibleText(selectOption.selectSecond(), java);
			//WebDropDown.selelctByIndex(selectOption.selectSecond(), index);
			WebDropDown.selelctByVisibleText(selectOption.selectSecond(), index);
			graphicalTest.log(LogStatus.PASS, "Click on DropDown Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Click On Button Failed ");
		}
	}
		public void multipleSelectMethod(String multiple,String multiple2)
		{
			if(selectOption.multipleSelect()!=null)
			{
				WebButton.click(selectOption.multipleSelect());
				//WebDropDown.selelctByVisibleText(selectOption.selectSecond(), java);
				
				WebDropDown.selelctByValue(selectOption.multipleSelect(), multiple,multiple2);
				
				
				graphicalTest.log(LogStatus.PASS, "Click on DropDown Button successfully");
			}
			else
			{
				graphicalTest.log(LogStatus.FAIL, "Click On Button Failed ");
			}
		
	}
		public void allMultipleOptions()
		{
			
			WebDropDown.selelctByAllMultipleOptions(selectOption.multipleSelect());
		}
	public void selectAction(String index,String multiple,String multiple2)
	{
		selectFirst();
		selectDropDown();
		selectSecondMethod(index);
		multipleSelectMethod(multiple,multiple2);
		allMultipleOptions();
	}
	
	
	
}
