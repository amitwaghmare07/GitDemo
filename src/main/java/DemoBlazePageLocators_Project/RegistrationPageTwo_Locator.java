package DemoBlazePageLocators_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataSources.ExpliciteWait;

public class RegistrationPageTwo_Locator extends ExpliciteWait {
	
	public WebDriver driver;
	
	
	public RegistrationPageTwo_Locator(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@onclick=\"byCat('phone')\"]")
			WebElement phoneClick;
	////By product1= By.xpath("//a[@onclick=\"byCat('phone')\"]");
	
	public WebElement phoneClick()
	{
		waitForElementToAppear(phoneClick);
		return phoneClick;
	}
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	WebElement clickOnbtn;
	By product2=By.xpath("//a[contains(text(),'Samsung galaxy s6')]");
	
	public WebElement clickOnbtn()
	{
		waitForElementToAppear(clickOnbtn);
		return clickOnbtn;
	}
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	WebElement addToCart;
	By product3= By.xpath("//a[contains(text(),'Add to cart')]");
	public WebElement addToCart()
	{
		waitForElementToAppear(addToCart);
		return addToCart;
		
	}

}
