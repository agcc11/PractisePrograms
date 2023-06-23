package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assertConceptTestClass {

	WebDriver driver;
	@BeforeMethod
	public void setprop1() throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
	}
	@Test(priority=1,groups="sub")
	public void assertmethodtest() throws InterruptedException
	{
		POM_assertconcept jj=new POM_assertconcept();
		jj.Assertmethod(driver);
	}
	@Test(priority=2,groups="main")
	public void SearchbusesMethodtest() throws InterruptedException
	{
		POM_assertconcept jj=new POM_assertconcept();
		jj.SearchbusesMethod(driver);
		
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}

	
	
}
