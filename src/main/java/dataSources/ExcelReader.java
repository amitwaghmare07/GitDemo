package dataSources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.RowIdLifetime;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	public static void setExcelFile(String path,String SheetName) throws Exception
	{
		try {
			FileInputStream ExcelFile=new FileInputStream(path);
			ExcelWBook=new XSSFWorkbook(ExcelFile);
			ExcelWSheet=ExcelWBook.getSheet(SheetName);
			
		}catch(Exception e)
		{
			throw(e);
		}
	}
	public static String getCellData(String Path,String SheetName,int RowNum,int ColNum)
	{
		try {
			setExcelFile(Path,SheetName);
			Row=ExcelWSheet.getRow(RowNum);
			Cell=Row.getCell(ColNum);
			String CellData=Cell.getStringCellValue();
			return CellData;
		}catch(Exception e)
		{
			return"";
		}
	}
	/*public static String setCellData(String  Result,int RowNum,int ColNum) throws FileNotFoundException
	{
	
		Cell=Row.getCell(ColNum,);
		if(Cell==null)
		{
			Cell=Row.createCell(ColNum);
			Cell.setCellValue(Result);
			
		}else
		{
			Cell.setCellValue(Result);
		}
		FileOutputStream fileOut=new FileOutputStream("C:/Users/Amit/OneDrive/Desktop/ExcelTestData.xlsx");
		ExcelWBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}*/

}
