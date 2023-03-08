package DemoBlazePageLocators_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataSources.ExpliciteWait;

public class Registration_Locator extends ExpliciteWait {
	
	public WebDriver driver;
	
	public Registration_Locator(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@id=\"login2\"]")
	private WebElement logbtn;
	
	public WebElement logbtn()
	{
		
		return logbtn;
	}
	
	@FindBy(xpath="//input[@id=\"loginusername\"]")
	WebElement username;
	
	public WebElement userName()
	{
		waitForElementToAppear(username);
		return username;
	}
	@FindBy(xpath="//input[@id=\"loginpassword\"]")
	WebElement password;
	public WebElement password()
	{
		waitForElementToAppear(password);
		return password;
	}
	@FindBy(xpath="//button[contains(@onclick,'logIn()')]")
	WebElement loginbtn;
	
	public WebElement loginbtn()
	{
		waitForElementToAppear(loginbtn);
		return loginbtn;
	}
	
	
	

}
