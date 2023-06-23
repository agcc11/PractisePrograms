package selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassFbFetchMethod {
	WebDriver driver;
	@BeforeMethod
	public void setproperty()
	{       System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
	}
	@Test
	public void fetchData() throws EncryptedDocumentException, InterruptedException, IOException
	{
		POM_fbsigninpage obj2=new POM_fbsigninpage(driver);
		obj2.excelsheet(driver);
	}
	@AfterMethod
	public void closeb()
	{
		driver.quit();
	}


}
