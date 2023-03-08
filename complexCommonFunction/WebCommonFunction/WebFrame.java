package WebCommonFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebFrame {
	
	public WebDriver driver;
	
	public WebFrame(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
		
	}
	

}
