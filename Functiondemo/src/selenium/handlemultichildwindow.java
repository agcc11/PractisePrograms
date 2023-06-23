package selenium;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlemultichildwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		WebElement tryit01=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		Thread.sleep(3000);
		tryit01.click();
		WebElement tryit02=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		Thread.sleep(3000);
		tryit02.click();
		WebElement tryit03=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		Thread.sleep(3000);
		tryit03.click();
		ArrayList<String>windows=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows);
		Thread.sleep(3000);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(3000);
	//	driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(driver.findElement(By.xpath("//button[text()='Try it']")));
		Thread.sleep(3000);
		WebElement frametryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		Thread.sleep(3000);
		frametryit.click();
		Alert popup03=driver.switchTo().alert();
		Thread.sleep(3000);
		String text03=popup03.getText();
		Thread.sleep(3000);
		System.out.println(text03);
		Thread.sleep(3000);
		popup03.accept();
	}

	
}
