package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_amazon {
	WebDriver driver;
	@BeforeClass
	public void setproperty()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test(priority=1)
	public void searchitemTest() throws InterruptedException
	{
		POM_amazon_searchbtn objj=new POM_amazon_searchbtn(driver);
		objj.searchitem();
	}
	@Test(dependsOnMethods="searchitemTest",priority=2)
	public void searchiconMethodTest() throws InterruptedException
	{
		POM_amazon_searchbtn objj=new POM_amazon_searchbtn(driver);
		objj.searchiconMethod();
	}
	@Test(dependsOnMethods="searchiconMethodTest",priority=3)
	public void iphone13MethodTest() throws InterruptedException
	{
		POM_amazon_searchbtn objj=new POM_amazon_searchbtn(driver);
		objj.iphone13Method();
	}
	@Test(dependsOnMethods="iphone13MethodTest",priority=4)
	public void addtocartbtnMethodTest() throws InterruptedException
	{
		POM_iphonepage objj=new POM_iphonepage(driver);
		objj.addtocartbtnMethod(driver);
	}
	@Test(dependsOnMethods="addtocartbtnMethodTest",priority=5)
	public void gotocartMethodTest() throws InterruptedException
	{
		POM_iphonepage objj=new POM_iphonepage(driver);
		objj.gotocartMethod();
	}
	@Test(dependsOnMethods="gotocartMethodTest",priority=6)
	public void dropdownMethod() throws InterruptedException
	{
		POM_iphonepage objj=new POM_iphonepage(driver);
		objj.dropdownMethod();
	}
	@Test(dependsOnMethods="dropdownMethod",priority=7)
	public void proceedtopayMethodTest() throws InterruptedException
	{
		POM_iphonepage objj=new POM_iphonepage(driver);
		objj.proceedtopayMethod();
	}
	@AfterClass
	public void closebrowsermethod()
	{
		driver.quit();
	}
	
	
	
}
