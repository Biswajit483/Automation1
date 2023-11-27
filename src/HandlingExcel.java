import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HandlingExcel {

	//@Test
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	//public void handlingExcelfile() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/TestExcel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String excelprint = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		//Reporter.log(excelprint);
		System.out.println(excelprint);
	}
	}


