package testNG_02pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_concept {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void beforetest(String x) throws InterruptedException
	{
		if(x.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "‪‪G:\\selenium\\chromedriver.exe");
			 Thread.sleep(3000);
			 driver=new ChromeDriver();
			 Thread.sleep(3000);
	//		driver.get("https://www.google.com/");
	//		System.out.println("beforetest");
		}
		
	/*	{
			System.setProperty("webdriver.edge.driver", "‪G:\\selenium\\msedgedriver.exe");
			 driver=new EdgeDriver();
			driver.get("https://www.google.com/");
			System.out.println("beforetest");
		}*/
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest");
		driver.close();
	}
}


