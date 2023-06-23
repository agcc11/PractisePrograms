package selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass_onebyonelogin {

	WebDriver driver;
	@BeforeMethod
	public void setproperty()
	{       System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
	}
	@Test(priority=1)
	public void firstlogintest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		POM_fb_fetchExcel fetch=new POM_fb_fetchExcel(driver);
				fetch.firstlogin();
	}
	@Test(priority=2)
	public void secondlogintest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		POM_fb_fetchExcel fetch=new POM_fb_fetchExcel(driver);
				fetch.secondlogin();
	}
	@Test(priority=3)
	public void thirdlogintest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		POM_fb_fetchExcel fetch=new POM_fb_fetchExcel(driver);
				fetch.thirdlogin();
	}
	@AfterMethod
	public void closebb()
	{
		driver.quit();
	}



}
