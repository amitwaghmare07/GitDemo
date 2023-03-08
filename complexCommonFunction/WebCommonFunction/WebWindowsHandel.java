package WebCommonFunction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebWindowsHandel {
	
	public WebDriver dirver;
	
	public void  WebWindowsHandel(WebDriver driver) 
	{
		
	//WebDriver driver=null;
	Set<String>windows=driver.getWindowHandles();//[parent,child window]
	Iterator<String> it=windows.iterator();
	String parentId=it.next();
	String childId=it.next();
	driver.switchTo().window(childId);
	driver.manage().window().maximize();
	//return driver;
	
	}

}
