package WebCommonFunction;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import dataSources.WebBaseClass;

public class WebElementCommon {
	
	
	public static boolean isPresent(WebElement element)
	{
	boolean	isPre=false;
	if(element.isDisplayed())
	{
		isPre=true;
	}else
		{
		WebBaseClass.graphicalTest.log(LogStatus.FAIL, " isDisplayed Element is not present"); 
		}
	return isPre;
	}

	public static boolean isClickable(WebElement element)
	
	{
		boolean isClick=false;
		if(isPresent(element))
		{
			if(element.isEnabled())
			{
				isClick=true;
			}else
				{
					WebBaseClass.graphicalTest.log(LogStatus.FAIL, "isEnabled Element is not present");
				}
		}
		return isClick;
	}
	
}
