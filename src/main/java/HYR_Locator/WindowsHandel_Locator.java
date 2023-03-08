package HYR_Locator;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataSources.ExpliciteWait;

public class WindowsHandel_Locator extends ExpliciteWait {

	public WebDriver driver;
	public WindowsHandel_Locator(WebDriver driver)
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
	@FindBy(xpath="//a[contains(text(),'Window Handles')]")
	WebElement ClickOnWindowsHandel;
	public WebElement ClickOnWindowsHandel()
	{	
		waitForElementToAppear(ClickOnWindowsHandel);
		return ClickOnWindowsHandel;
	}
	@FindBy(xpath="//input[@id='name']")
	WebElement enterName;
	public WebElement windowsOption()
	{
		waitForElementToAppear(enterName);
		return enterName;
	}
	@FindBy(xpath="//button[@id='newWindowBtn']")
	WebElement clickOnWindow;
	public WebElement clickOnWindow()
	{
		waitForElementToAppear(clickOnWindow);
		return clickOnWindow;
	}
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	public WebElement firstName()
	{
		waitForElementToAppear(firstName);
		return firstName;
	}
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	public WebElement lastName()
	{
		waitForElementToAppear(lastName);
		return lastName;
	}
	
	@FindBy(xpath="//input[@id='malerb']")
	WebElement radioButton;
	public WebElement radioButton()
	{
		waitForElementToAppear(radioButton);
		return lastName;
	}
	@FindBy(xpath="//input[@id=\"englishchbx\"]")
	WebElement checkBoxSingel;
	public WebElement checkBoxSingel()
	{
		waitForElementToAppear(checkBoxSingel);
		return checkBoxSingel;
	}
	@FindBy(xpath="//inpt[@type=\"checkbox\"]")
	List<WebElement> checkBox;
	public List<WebElement > checkBoxMultiple()
	{
		 waitForAllElementList(checkBox);
		return  checkBox;
	}
	@FindBy(xpath="//button[@id='newTabBtn']")
	WebElement windowsTab;
	public WebElement windowsTab()
	{
		waitForElementToAppear(windowsTab);
		return windowsTab;
	}
	
	@FindBy(xpath="//button[@id='alertBox']")
	WebElement clickOnAlert;
	public WebElement clickOnAlert()
	{
		waitForElementToAppear(clickOnAlert);
		return clickOnAlert;
	}
}
