package WebCommonFunction;

import org.openqa.selenium.WebElement;

public class WebTextBox {
	
	public static void sendInput(WebElement textBox, String text)
	{
		if(WebElementCommon.isClickable(textBox))
		{
			textBox.sendKeys(text);
		}
	}
	public static void clearInput(WebElement textBox)
	{
		textBox.clear();
	}
	
	

}
