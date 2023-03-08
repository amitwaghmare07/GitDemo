package WebCommonFunction;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDropDown {
	
	public static void selelctByVisibleText(WebElement element,String text)
	{
		Select select= new Select(element);
		if(select.isMultiple())
		{
			System.out.println("It is a multiple selection option");
		}
		else
		{
			select.selectByVisibleText(text);
		}
		
	}
	public static void selelctByValue(WebElement element,String text,String text1)
	{
		Select select= new Select(element);
		if(select.isMultiple())
		{
			System.out.println("It is a multiple selection option");
		}
		else
		{
			select.selectByValue(text);
		}
		
	}public static void selelctByIndex(WebElement element,int text)
	{
		Select select= new Select(element);
		if(select.isMultiple())
		{
			System.out.println("It is a multiple selection option");
		}
		else
		{
			select.selectByIndex(text);
		}
	}	
		public static void selelctByAllMultipleOptions(WebElement element)
		{
			Select select= new Select(element);
			if(select.isMultiple())
			{
				//System.out.println("It is a multiple selection option");
				
				List<WebElement> allOptions=select.getOptions();
				System.out.println(allOptions);
				for(WebElement ele:allOptions)
				{
					System.out.println(ele.getText());
					
				}
			}
			else
			{
				//select.selectByValue(text);
				
			}
			//return select;
	}

}
