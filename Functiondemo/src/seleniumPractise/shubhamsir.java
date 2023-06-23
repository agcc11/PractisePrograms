package seleniumPractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shubhamsir {

	
	
	public static void main(String[] webdriver) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		login.getText();
		System.out.println(login);
		/*Alert alert=driver.switchTo().alert();
		alert.dismiss();
		driver.findElement(By.className("FXox6K"));*/
	}

}
