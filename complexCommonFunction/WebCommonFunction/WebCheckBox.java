package WebCommonFunction;

import java.util.List;

import org.openqa.selenium.WebElement;

public class WebCheckBox {
	
	
	public static void clickOnMultipleCheckBox(List< WebElement> element)
	{
		for(WebElement e:element)
		{
			if(e.isEnabled()&&e.isDisplayed())
			{	
			e.click();
			}
			else {
			}
		}
	}
	public static void clickOnsingelCheckBox(WebElement element)
	{

		if(element.isEnabled()&&element.isDisplayed())
		{	
			element.click();
		}
		else if(element.isSelected())
		{
			element.click();
		}
	}

}
