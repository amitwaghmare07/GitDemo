package DemoBlazePageLocators_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataSources.ExpliciteWait;

public class PlaceOrder_Locator extends ExpliciteWait {
	
	public WebDriver driver;
	
	public PlaceOrder_Locator(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id=\"cartur\"]")
	WebElement cart;
	public WebElement cart()
	{
		waitForElementToAppear(cart);
		return cart;
	}
	@FindBy(xpath="//button[@class=\"btn btn-success\"]")
	WebElement placeOrder;
	public WebElement placeOrder()
	{
		waitForElementToAppear(placeOrder);
		return placeOrder;
	}
	@FindBy(xpath="//input[@id=\"name\"]")
	WebElement name;
	public WebElement name()
	{
		waitForElementToAppear(name);
		return name;
	}
	@FindBy(xpath="//input[@id=\"country\"]")
	WebElement country;
	public WebElement country()
	{
		waitForElementToAppear(country);
		return country;
	}
	@FindBy(xpath="//input[@id=\"city\"]")
	WebElement city;
	public WebElement city()
	{
		waitForElementToAppear(city);
		return city;
	}
	@FindBy(xpath="//input[@id=\"card\"]")
	WebElement creditCard;
	public WebElement creditCard()
	{
		waitForElementToAppear(creditCard);
		return creditCard;
	}
	@FindBy(xpath="//input[@id=\"month\"]")
	WebElement month;
	public WebElement month()
	{
		waitForElementToAppear(month);
		return month;
	}
	@FindBy(xpath="//input[@id=\"year\"]")
	WebElement year;
	public WebElement year()
	{
		waitForElementToAppear(year);
		return year;
	}
	@FindBy(xpath="//button[contains(text(),'Purchase')]")
	WebElement purchase;
	public WebElement purchase()
	{
		waitForElementToAppear(purchase);
		//Actions action= new Actions(driver);
		//action.contextClick(purchase).build().perform();
		return purchase;
	}
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement okBtn;
	public WebElement okBtn()
	{
		waitForElementToAppear(okBtn);
		return okBtn;
	}
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement logOut;
	public WebElement logOut()
	{
		waitForElementToAppear(logOut);
		return logOut;
	}

}
