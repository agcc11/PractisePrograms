package seleniumPractise;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

   public class Testclass_flipkart_login_fetchdata {
	WebDriver driver;
   @BeforeMethod
 public void setpro() throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
//	POM_flipcart_login_fetch_data pp=new POM_flipcart_login_fetch_data(driver);
//	pp.loginbtnclick();
}

 @Test(priority=1)
 public void firstlogtest() throws EncryptedDocumentException, IOException, InterruptedException
{
	POM_flipcart_login_fetch_data pp=new POM_flipcart_login_fetch_data(driver);
	pp.firstlog();
}

 @Test(priority=2)
 public void secoondlogtest() throws EncryptedDocumentException, IOException, InterruptedException
{
	POM_flipcart_login_fetch_data pp=new POM_flipcart_login_fetch_data(driver);
	pp.secondlog();
}

 @AfterMethod
 public void closebro()
 {
	driver.quit();
}
}
