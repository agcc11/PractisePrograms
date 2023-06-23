package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupanddown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_menu_hor_scroll");
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(300,0)");
	//	Thread.sleep(3000);
	//	Thread.sleep(3000);
	//	jse.executeScript("window.scrollBy(300,000)");

	}

}
