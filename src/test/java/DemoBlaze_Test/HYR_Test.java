package DemoBlaze_Test;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import DemoBlaze_Common_Static_Data.Common_Static_Data;
import HYR_Action.FrameHandel_Action;
import HYR_Action.WindowsHandel_Action;
import dataSources.PropertyReader;
import dataSources.WebBaseClass;

public class HYR_Test extends WebBaseClass {
	/*@Test(priority=1,description="This Test use to do Select process")
	public void registrationProcess() throws Exception 
	{
		 DropDown_Action regPageOnePA=new  DropDown_Action(driver,graphicalTest);
		Thread.sleep(2000);
		
		regPageOnePA.selectAction(PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"index"),
				PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"multiple"),
				PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"multiple2"));
		//regPageOnePA.selectAction(PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"multiple"));
	
		graphicalTest.log(LogStatus.PASS,graphicalTest.addScreenCapture(screenCapture(driver,"sampleTest"))+ "dropDown selected Successfully ");
	}*/	
	@Test(priority=1,description="This Test use to do Windows Handel process")
	public void WindowsHandelProcess() throws Exception 
	{
		WindowsHandel_Action winPagePA=new  WindowsHandel_Action(driver,graphicalTest);
		Thread.sleep(2000);
		
		winPagePA.WindowsAction(PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"name"),
				PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"name2"),
				PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"lastName"));
		//regPageOnePA.selectAction(PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"multiple"));
	
		graphicalTest.log(LogStatus.PASS,graphicalTest.addScreenCapture(screenCapture(driver,"sampleTest"))+ "dropDown selected Successfully ");
	}
	/* @Test(priority=1,description="This Test use to do Windows Handel process")
	public void FrameHandelProcess() throws Exception 
	{
		FrameHandel_Action framePagePA=new  FrameHandel_Action(driver,graphicalTest);
		Thread.sleep(2000);
		
		framePagePA.FrameAction(PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"name"),
				PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"courseFrame"));
		//regPageOnePA.selectAction(PropertyReader.getPropValues(Common_Static_Data.ConfigPropertyPath,"multiple"));
	
		graphicalTest.log(LogStatus.PASS,graphicalTest.addScreenCapture(screenCapture(driver,"sampleTest"))+ "dropDown selected Successfully ");
	}*/
}
