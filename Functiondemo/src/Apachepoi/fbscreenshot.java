	package Apachepoi;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbscreenshot {


	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("G:\\selenium\\Screenshot folder\\facebook166.jpg");
	FileUtils.copyFile(Source, dest);
	}

}
