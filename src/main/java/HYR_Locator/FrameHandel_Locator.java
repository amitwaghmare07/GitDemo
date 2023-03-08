package HYR_Locator;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataSources.ExpliciteWait;

public class FrameHandel_Locator extends ExpliciteWait {

	public WebDriver driver;
	public FrameHandel_Locator(WebDriver driver)
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
		return select;
	}
	@FindBy(xpath="//a[contains(text(),'Frames Practice')]")
	WebElement ClickOnFramesPractice;
	public WebElement ClickOnFramesPractice()
	{	
		waitForElementToAppear(ClickOnFramesPractice);
		return ClickOnFramesPractice;
	}
	@FindBy(xpath="//input[@id='name']")
	WebElement enterName;
	public WebElement enterName()
	{
		waitForElementToAppear(enterName);
		return enterName;
	}
	@FindBy(xpath="//iframe[@id=\"frm1\"]")
	WebElement switchToFrame;
	public WebElement switchToFrame()
	{
		waitForElementToAppear(switchToFrame);
		return switchToFrame;
	}
	@FindBy(xpath="//select[@id='selectnav1']")
	WebElement selectOption;
	public WebElement selectOption()
	{
		waitForElementToAppear(selectOption);
		return selectOption;
	}
	
}
