package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=1;j++)
			{
				String path="G:\\Software Testing\\Demo Fetch Data\\Demo Fetch Data.xlsx";
				FileInputStream File=new FileInputStream(path);
				String value=WorkbookFactory.create(File).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(value);
				
			}
			System.out.println();
		}
	
	}

}
