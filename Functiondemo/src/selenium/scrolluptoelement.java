package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolluptoelement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	/*	Thread.sleep(3000);
		driver.get("https://www.w3schools.com/howto/howto_css_menu_horizontal_scroll.asp");
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Actions act=new Actions(driver);
		WebElement tryit=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		jse.executeScript("arguments[0].scrollIntoView(true);", tryit);
		act.moveToElement(tryit).click().build().perform();
		Thread.sleep(3000);
	*/
	//	driver.manage().window().maximize();
		driver.get("http://mrbool.com/");
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		WebElement oct =driver.findElement(By.xpath("(//h6[text()='by Ayad Boudiab'])[9]"));

		Thread.sleep(3000);
		jse.executeScript("arguments[0].scrollIntoView(true);", oct);
		WebElement morebtn =driver.findElement(By.xpath("//a[@class='mb-btn-moreposts']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(morebtn).click().build().perform();
		Thread.sleep(3000);
		
	}

}
