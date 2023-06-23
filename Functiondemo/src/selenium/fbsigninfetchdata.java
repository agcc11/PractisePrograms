package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class fbsigninfetchdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	for(int i=1;i<=4;i++)
		{
				for(int j=0;j<=0;j++)
				{	String path="G:\\Software Testing\\Demo Fetch Data\\FB sign in data.xlsx";
				  FileInputStream File=new FileInputStream(path);
					WebElement usernamefield=driver.findElement(By.xpath("//input[@id='email']"));
					Thread.sleep(3000);
					String username= WorkbookFactory.create(File).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
					Thread.sleep(3000);
					usernamefield.sendKeys(username);
				}
				for(int j=1;j<=1;j++)
				{ String path="G:\\Software Testing\\Demo Fetch Data\\FB sign in data.xlsx";
					FileInputStream File=new FileInputStream(path);
				WebElement passfield=driver.findElement(By.xpath("//input[@id='pass']"));
				Thread.sleep(3000);
				String password=new DataFormatter().formatCellValue(WorkbookFactory.create(File).getSheet("sheet1").getRow(i).getCell(j));
				passfield.sendKeys(password);
				}
				Thread.sleep(6000);
				driver.navigate().refresh();
			}
		
	
	
			//PARAMETER
	
	
/*	public static String parameterisation( int i,int j,String Sheet) throws EncryptedDocumentException, IOException
	{
		String p="G:\\Software Testing\\Demo Fetch Data\\TestData.xlsx";
		FileInputStream file =new FileInputStream(p);
		String v=new DataFormatter().formatCellValue(WorkbookFactory.create(file).getSheet(Sheet).getRow(i).getCell(j));
		return v;
	}
	
	 public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
		    System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			Thread.sleep(3000);
			for(int i=1;i<=4;i++)
			{
				for(int j=0;j<=0;j++)
				{
					WebElement user=driver.findElement(By.xpath("//*[@id=\"email\"]"));
					user.sendKeys(parameterisation(i, j,"Sheet1"));
					Thread.sleep(3000);
					
				}
				for(int j=1;j<=1;j++)
				{
					WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
					pass.sendKeys(parameterisation(i, j,"Sheet1"));
					driver.navigate().refresh();
				}
			}	
	*/
			
		}
	
	
}



