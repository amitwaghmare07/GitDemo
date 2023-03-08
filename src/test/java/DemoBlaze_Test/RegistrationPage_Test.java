 package DemoBlaze_Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import DemoBlazePageAction_project.PlaceOrder_Action;
import DemoBlazePageAction_project.RegistrationPageTwo_Action;
import DemoBlazePageAction_project.Registration_Action;
import DemoBlaze_Common_Static_Data.Common_Static_Data;
import dataSources.PropertyReader;
import dataSources.WebBaseClass;

public class RegistrationPage_Test extends WebBaseClass {
	
	@Test(priority=1,description="This Test use to do Registration process")
	public void registrationProcess() throws Exception 
	{
		Registration_Action regPageOnePA=new Registration_Action(driver,graphicalTest);
		Thread.sleep(2000);
		
		regPageOnePA.regPageOneAction(PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"userName"),
				PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"Password"));
						graphicalTest.log(LogStatus.PASS,graphicalTest.addScreenCapture(screenCapture(driver,"sampleTest"))+ "Sample test run ");
						graphicalTest.log(LogStatus.FAIL,graphicalTest.addScreenCapture(screenCapture(driver,"sampleTest"))+ "Sample test run Failed ");
	}		
		@Test(priority=2,description="This Test use to do Add To Cart")
		public void addToCart() throws  Exception
		{
						RegistrationPageTwo_Action regPageTwoPA=new RegistrationPageTwo_Action(driver,graphicalTest);
						regPageTwoPA.regPageTwoAction();
						graphicalTest.log(LogStatus.PASS,graphicalTest.addScreenCapture(screenCapture(driver,"sampleTest"))+ "Add To cart Successfully ");
						graphicalTest.log(LogStatus.FAIL,graphicalTest.addScreenCapture(screenCapture(driver,"sampleTest"))+ "Add To cart Failed ");
		}	
		@Test(priority=3,description="This Test use to do Puarchase Product")
		public void puarchase() throws InterruptedException, IOException
		{
						PlaceOrder_Action placeOrderPA=new PlaceOrder_Action(driver,graphicalTest);
						placeOrderPA.placeOrderAction(PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"name"), 
								PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"country"),
								PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"city"),
								PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"creditCard"),
								PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"month"),
								PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"year"));
						graphicalTest.log(LogStatus.PASS,graphicalTest.addScreenCapture(screenCapture(driver,"sampleTest"))+ "Order Purchased ");
						graphicalTest.log(LogStatus.FAIL,graphicalTest.addScreenCapture(screenCapture(driver,"sampleTest"))+ "Order Purchase Failed ");
		}					
	

	

}
