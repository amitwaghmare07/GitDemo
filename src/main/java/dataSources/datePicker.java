package dataSources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datePicker {
	
	static String date="5";
	static String  month="May";
	static String year="2023";
	
	public static void main(String[] args)
	{
	
	WebDriverManager.chromedriver().setup();
	
	 WebDriver driver=new ChromeDriver();
	
	 
	 driver.get("https://jqueryui.com/datepicker/");
	 driver.manage().window().maximize();
	 WebElement dateSwitch=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
	 driver.switchTo().frame(dateSwitch);
	 driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
	 
	while(true)
		{
		String calenderMonth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		String calenderYear=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			if(calenderMonth.equals(month)&&calenderYear.equals(year))
			{
				List<WebElement> dateList=driver.findElements(By.xpath("//table/tbody/tr/td"));
				for(WebElement e:dateList)
				{
					String dateOne=e.getText();
					if(dateOne.equals(date))
					{
					e.click();
					break;
					}
					
					
				}
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
			}
			
		
		}
	 
	 
	 }
}
