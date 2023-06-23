package Apachepoi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzonscreenshoy {
	
	public static void screenshot( WebDriver driver ,String Filename) throws IOException
	{
		File a1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File b1=new File("G:\\selenium\\Screenshot folder\\"+Filename+".jpg");
		FileUtils.copyFile(a1, b1);
	}
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	screenshot(driver, "amazon");
	Thread.sleep(3000);
	
	driver.navigate().to("https://zerodha.com/");
	
	screenshot(driver, "zerodha_page");
	
		
}
}
