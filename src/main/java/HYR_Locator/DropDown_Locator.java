package HYR_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataSources.ExpliciteWait;

public class DropDown_Locator extends ExpliciteWait {

	public WebDriver driver;
	public DropDown_Locator(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Selenium Practice')]")
	WebElement select;
	public WebElement selectfirst()
	{	
		waitForElementToAppear(select);
		//Actions action= new Actions(driver);
		//action.moveToElement(select);
		return select;
	}
	@FindBy(xpath="//a[contains(text(),'Dropdowns')]")
	WebElement dropDownClick;
	public WebElement dropDownClick()
	{	
		waitForElementToAppear(dropDownClick);
		return dropDownClick;
	}
	@FindBy(xpath="//select[contains(@id,'course')]")
	WebElement selectSecond;
	public WebElement selectSecond()
	{
		waitForElementToAppear(selectSecond);
		return selectSecond;
	}
	@FindBy(xpath="//select[@id=\"ide\"]")
	WebElement multipleSelect;
	public WebElement multipleSelect()
	{
		waitForElementToAppear(multipleSelect);
		return multipleSelect;
	}
	
}
