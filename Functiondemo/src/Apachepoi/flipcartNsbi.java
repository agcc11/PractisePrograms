package Apachepoi;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartNsbi {
	
	
	public static void Screen(WebDriver driver,String Filename) throws IOException

	{	File b1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File b2=new File("G:\\selenium\\Screenshot folder\\"+Filename+".jpg");
		FileUtils.copyFile(b1, b2);
	}
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		Screen(driver, "flipcart_login");
		Thread.sleep(3000);

		driver.navigate().to("https://www.onlinesbi.com/");
		Screen(driver, "Sbi_login");
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
	}

}
