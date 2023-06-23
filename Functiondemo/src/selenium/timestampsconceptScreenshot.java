package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class timestampsconceptScreenshot {

	public static String TimeStamps()
	{
	String t=new SimpleDateFormat("MMM dd HH.mm.ss").format(Calendar.getInstance().getTime());
	return t;

	}
	public static void screenshotOnTime(WebDriver driver,String Filename) throws IOException
	{
		File aa=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File bb=new File("G:\\selenium\\Screenshot folder\\"+Filename+TimeStamps()+".jpg");
		FileUtils.copyFile(aa, bb);
		
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");	
	
		screenshotOnTime(driver,"facebook__");
		System.out.println("picture captured");

	}
}
