package seleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclassFlipkartHomePage {
	WebDriver driver;
	@BeforeMethod
	public void setprop1() throws InterruptedException
	{	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/mobile-apps?otracker=ch_vn_mobile_apps");
	//pomFlipkartHomePage home1=new pomFlipkartHomePage(driver);
	//home1.closebtnmethod();

	}
	@Test(priority=1,groups="main1")
	public void searchboxmethodtest() throws InterruptedException
	{	pomFlipkartHomePage home=new pomFlipkartHomePage(driver);
		home.searchboxmethod();
	}	
	@Test(priority=2,groups="main1")
	public void logibtnmethodtest() throws InterruptedException
	{	pomFlipkartHomePage home=new pomFlipkartHomePage(driver);
		home.logibtnmethod();
	}
	@Test(priority=3,groups="sub1")
	public void moreMethodtest() throws InterruptedException
	{	pomFlipkartHomePage home=new pomFlipkartHomePage(driver);
		home.moreMethod(driver);
	}
	@Test(priority=4,groups="sub1")
	public void cartMethodtest() throws InterruptedException
	{	pomFlipkartHomePage home=new pomFlipkartHomePage(driver);
		home.cartMethod();
	}
	@Test(priority=5,groups="sub2")
	public void mainmodulestest() throws InterruptedException
	{	pomFlipkartHomePage home=new pomFlipkartHomePage(driver);
		home.cartMethod();
	}
	@Test(priority=6,groups="sub2")
	public void scrollmethodtest() throws InterruptedException
	{	pomFlipkartHomePage home=new pomFlipkartHomePage(driver);
		home.scrollmethod(driver);
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}

	
	
	
	
	
}

