package dataSources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelHyrDemo_reader {
	
	//public  WebDriver driver;
	
	public 	static	XSSFWorkbook ExcelWBook=null;
	public  static       XSSFSheet ExcelWSheet;
	public 	static		XSSFCell Cell;
	public 	static		XSSFRow Row;
	 			
	public static void main(String[] args) throws Exception {
		
		
		/*@BeforeMethod
		public void beforeMethod()
		{
			
		}
		@Test
		public void loginTest()
		{
			
		}*/
		File file=new File("E:\\projects\\Maven_Project_Practice\\Maven_Project_P1\\src\\test\\resource\\TutorialsNinja.xlsx");
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		ExcelWBook= new XSSFWorkbook(inputStream);
		
		ExcelWSheet = ExcelWBook.getSheet("Testcases");
		
		int ttRow=ExcelWSheet.getLastRowNum()+1;
		
		int ttCells=ExcelWSheet.getRow(0).getLastCellNum();
		
		for(int currentRow=0;currentRow<ttRow;currentRow++)
		{
			
			WebDriverManager.chromedriver().setup();
			
			 WebDriver driver=new ChromeDriver();
			 try {
			 
			 driver.get("https://www.demoblaze.com/index.html");
			 driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@id='login2']")).click();
			driver.findElement(By.xpath("//input[@id=\"loginusername\"]")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(0).toString());
			driver.findElement(By.xpath("//input[@id=\"loginpassword\"]")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(1).toString());
			driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
			driver.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				}
			}
		
		/*	for(int currentCell=0;currentCell<ttCells;currentCell++)
			{
				
				
				
				
	System.out.print();	
	System.out.print("\t");
			}
			System.out.println();
		}*/
		
		
		//@AfterMethod()
		//public void afterMethod()
	//	{
	//		driver.close();
		//}
	

		}
}
