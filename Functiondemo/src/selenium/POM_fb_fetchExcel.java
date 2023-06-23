package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_fb_fetchExcel {

	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginbtn;
	
	public void firstlogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String path="G:\\Software Testing\\Demo Fetch Data\\FB sign in data.xlsx";
		  FileInputStream File=new FileInputStream(path);
		  String username1= WorkbookFactory.create(File).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
			Thread.sleep(3000);
			username.sendKeys(username1);
			Thread.sleep(3000);
			String path2="G:\\Software Testing\\Demo Fetch Data\\FB sign in data.xlsx";
			  FileInputStream File2=new FileInputStream(path2);
			
			String password1=new DataFormatter().formatCellValue(WorkbookFactory.create(File2).getSheet("sheet1").getRow(1).getCell(1));
			Thread.sleep(3000);
			password.sendKeys(password1);
			Thread.sleep(3000);
			loginbtn.click();
	}
	public void secondlogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String path3="G:\\Software Testing\\Demo Fetch Data\\FB sign in data.xlsx";
		  FileInputStream File3=new FileInputStream(path3);
		  String username1= WorkbookFactory.create(File3).getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
			Thread.sleep(3000);
			username.sendKeys(username1);
			Thread.sleep(3000);
			String path4="G:\\Software Testing\\Demo Fetch Data\\FB sign in data.xlsx";
			  FileInputStream File4=new FileInputStream(path4);
			String password1=new DataFormatter().formatCellValue(WorkbookFactory.create(File4).getSheet("sheet1").getRow(2).getCell(1));
			Thread.sleep(3000);
			password.sendKeys(password1);
			Thread.sleep(3000);
			loginbtn.click();
	}
	public void thirdlogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String path5="G:\\Software Testing\\Demo Fetch Data\\FB sign in data.xlsx";
		  FileInputStream File5=new FileInputStream(path5);
		  String username1= WorkbookFactory.create(File5).getSheet("sheet1").getRow(3).getCell(0).getStringCellValue();
			Thread.sleep(3000);
			username.sendKeys(username1);
			Thread.sleep(3000);
			String path6="G:\\Software Testing\\Demo Fetch Data\\FB sign in data.xlsx";
			  FileInputStream File6=new FileInputStream(path6);
			String password1=new DataFormatter().formatCellValue(WorkbookFactory.create(File6).getSheet("sheet1").getRow(3).getCell(1));
			Thread.sleep(3000);
			password.sendKeys(password1);
			Thread.sleep(3000);
			loginbtn.click();
	}
	public POM_fb_fetchExcel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
