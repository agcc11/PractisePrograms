package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*public class Testclass_fbsignIn {
	/*	WebDriver driver;
	@BeforeMethod
	public void setproperty()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=1)
	public void usernameMethod() throws InterruptedException
	{	POM_fbsigninpage obj=new POM_fbsigninpage(driver);
		obj.inputusername();
		System.out.println("username entered");
	}
	@Test(priority=2)
	public void passwordMethod1() throws InterruptedException
	{	POM_fbsigninpage obj=new POM_fbsigninpage(driver);
	    obj.inputpassword();
	    System.out.println("password entered");
	}
	@Test(priority=3)
	public void loginbtnMethod() throws InterruptedException
	{	POM_fbsigninpage obj=new POM_fbsigninpage(driver);
	    obj.clickloginbtn();
	    System.out.println("login btn clicked");
	}
	@AfterMethod
	public void closebrowsermethod()
	{
		driver.quit();
	}
}
}
*/