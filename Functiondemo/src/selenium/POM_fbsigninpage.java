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

public class POM_fbsigninpage {
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginbtn;
	
/*	public void inputusername() throws InterruptedException
	{		Thread.sleep(3000);
		username.sendKeys("aniket ghorpade");
	}
	public void inputpassword() throws InterruptedException
	{	Thread.sleep(3000);
		password.sendKeys("7845129");
	}
	
	public void clickloginbtn() throws InterruptedException
	{	Thread.sleep(3000);
		loginbtn.click();
	}
*/
	public void excelsheet(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException
	{
	for(int i=1;i<=4;i++)
{
	for(int j=0;j<=0;j++)
	{	String path="G:\\Software Testing\\Demo Fetch Data\\FB sign in data.xlsx";
	  FileInputStream File=new FileInputStream(path);
	//	WebElement usernamefield=driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(3000);
		String username1= WorkbookFactory.create(File).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
		Thread.sleep(3000);
		username.sendKeys(username1);
	}
	for(int j=1;j<=1;j++)
	{ String path="G:\\Software Testing\\Demo Fetch Data\\FB sign in data.xlsx";
		FileInputStream File=new FileInputStream(path);
	//WebElement passfield=driver.findElement(By.xpath("//input[@id='pass']"));
	Thread.sleep(3000);
	String password1=new DataFormatter().formatCellValue(WorkbookFactory.create(File).getSheet("sheet1").getRow(i).getCell(j));
	password.sendKeys(password1);
	}
	loginbtn.click();
	Thread.sleep(6000);
	driver.navigate().refresh();
}
	}

	public POM_fbsigninpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
			
	


}
