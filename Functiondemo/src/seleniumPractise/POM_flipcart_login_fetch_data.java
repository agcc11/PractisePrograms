package seleniumPractise;

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

public class POM_flipcart_login_fetch_data {
//	WebDriver driver;
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement Name;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement pass;
	
	
	public void loginbtnclick() throws InterruptedException
	{
		loginbtn.click();
		Thread.sleep(3000);
	}
	public void firstlog() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String flip="G:\\Software Testing\\Demo Fetch Data\\Flipkart login.xlsx";
		FileInputStream file=new FileInputStream(flip);
		String Name1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		Name.sendKeys(Name1);
		Thread.sleep(3000);
		String flip1="G:\\Software Testing\\Demo Fetch Data\\Flipkart login.xlsx";
		FileInputStream file1=new FileInputStream(flip1);
		String pass1=new DataFormatter().formatCellValue(WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(1));
		Thread.sleep(3000);
		pass.sendKeys(pass1);		
	}
	public void secondlog() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String flip2="G:\\Software Testing\\Demo Fetch Data\\Flipkart login.xlsx";
		FileInputStream file2=new FileInputStream(flip2);
		String Name1=WorkbookFactory.create(file2).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		Name.sendKeys(Name1);
		Thread.sleep(3000);
		String flip3="G:\\Software Testing\\Demo Fetch Data\\Flipkart login.xlsx";
		FileInputStream file3=new FileInputStream(flip3);
		String pass1=new DataFormatter().formatCellValue(WorkbookFactory.create(file3).getSheet("Sheet1").getRow(2).getCell(1));
		Thread.sleep(3000);
		pass.sendKeys(pass1);		
	}
	public POM_flipcart_login_fetch_data(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}

