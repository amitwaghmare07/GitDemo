package WebCommonFunction;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import dataSources.WebBaseClass;

public class WebRadioButton {
	
	
	
	public static void click(WebElement button)
	{
		if(WebElementCommon.isClickable(button))
		{
			button.click();
		}
		else
		{
			WebBaseClass.graphicalTest.log(LogStatus.FAIL, "isClickable Element is not present");
		}
		
	}

}
