package DemoBlazePageAction_project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import DemoBlazePageLocators_Project.PlaceOrder_Locator;
import WebCommonFunction.WebButton;
import WebCommonFunction.WebTextBox;

public class PlaceOrder_Action {
	
	public WebDriver driver;
	public PlaceOrder_Locator placeOrderPL;
	public ExtentTest graphicalTest=null;
	public PlaceOrder_Action(WebDriver driver,ExtentTest graphicalTest)
	{
		this.driver=driver;
		this.graphicalTest=graphicalTest;
		placeOrderPL=new PlaceOrder_Locator(driver);
	}
			
	public void clickOnCart()
	{
		if(placeOrderPL.cart()!=null)
		{
			WebButton.click(placeOrderPL.cart());
			graphicalTest.log(LogStatus.PASS, "Click on cart button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Login Button Failed ");
		}
	}
	public void clickOnPlaceOrder()
	{
		if(placeOrderPL.placeOrder()!=null)
		{
			WebButton.click(placeOrderPL.placeOrder());
			graphicalTest.log(LogStatus.PASS, "Click on placeOrder Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Login Button Failed ");
		}
	}
	public void enterName(String userVal) throws InterruptedException
	{
		if(placeOrderPL.name()!=null)
		{
			WebTextBox.sendInput(placeOrderPL.name(),userVal);
			graphicalTest.log(LogStatus.PASS, "UserName Entered Successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Worng UserName Entered ");
		}
	}
	public void enterCountry(String userVal) throws InterruptedException
	{
		if(placeOrderPL.country()!=null)
		{
			WebTextBox.sendInput(placeOrderPL.country(),userVal);
			graphicalTest.log(LogStatus.PASS, "Country Entered Successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Worng Counrty Entered ");
		}
	}
	public void enterCity(String userVal) throws InterruptedException
	{
			if(placeOrderPL.city()!=null)
		{
			WebTextBox.sendInput(placeOrderPL.city(),userVal);
			graphicalTest.log(LogStatus.PASS, "City Entered Successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Worng City Entered ");
		}
	}
	public void enterCreditCard(String userVal) throws InterruptedException
	{
		//Thread.sleep(2000);
		
		if(placeOrderPL.creditCard()!=null)
		{
			WebTextBox.sendInput(placeOrderPL.creditCard(),userVal);
			graphicalTest.log(LogStatus.PASS, "CreditCard Entered Successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Worng Cardnumber Entered ");
		}
	}
	public void enterMonth(String userVal) throws InterruptedException
	{
		if(placeOrderPL.month()!=null)
		{
			WebTextBox.sendInput(placeOrderPL.month(),userVal);
			graphicalTest.log(LogStatus.PASS, "month Entered Successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Worng month Entered ");
		}
	}
	public void enterYear(String userVal) throws InterruptedException
	{
		if(placeOrderPL.year()!=null)
		{
			WebTextBox.sendInput(placeOrderPL.year(),userVal);
			graphicalTest.log(LogStatus.PASS, "Year Entered Successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "Worng Year Entered ");
		}
	}
	public void clickOnPurchase()
	{
		if(placeOrderPL.purchase()!=null)
		{
			WebButton.click(placeOrderPL.purchase());
			graphicalTest.log(LogStatus.PASS, "Click on purchase Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "purchase Button Failed ");
		}
	}	
	public void clickOnOk()
	{
		if(placeOrderPL.okBtn()!=null)
		{
			WebButton.click(placeOrderPL.okBtn());
			graphicalTest.log(LogStatus.PASS, "Click on Ok Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "purchase Button Failed ");
		}
	}	

	public void clickOnlogOut()
	{
		if(placeOrderPL.logOut()!=null)
		{
			WebButton.click(placeOrderPL.logOut());
			graphicalTest.log(LogStatus.PASS, "Click on Logout Button successfully");
		}
		else
		{
			graphicalTest.log(LogStatus.FAIL, "purchase Button Failed ");
		}
	}	
		
	
	public void placeOrderAction(String name,String country,String city,String creditCard,String month,String year) throws InterruptedException
	{
		clickOnCart();
		clickOnPlaceOrder();
		enterName(name);
		enterCountry(country);
		enterCity(city);
		enterCreditCard(creditCard);
		enterMonth(month);
		enterYear(year);
		clickOnPurchase();
		clickOnOk();
		clickOnlogOut();
		
	}
}
