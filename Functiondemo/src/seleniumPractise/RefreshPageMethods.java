package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RefreshPageMethods {

	public static void main(String[] args) throws InterruptedException {


		  System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			Thread.sleep(2000);
		
			//navigate method
			driver.navigate().refresh();
			System.out.println("1");
			Thread.sleep(2000);
			
			//getcurrent url method
			
			String url=driver.getCurrentUrl();
			driver.navigate().to(url);
			System.out.println("2");
			Thread.sleep(2000);
			
			//Actions class and keyboard method
			
			Actions act=new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys(Keys.F5);
			System.out.println("3");
			Thread.sleep(2000);
			
			//findelement and keyboard method
			
			driver.findElement(By.id("email")).sendKeys(Keys.F5);
			System.out.println("4");
			Thread.sleep(2000);
			
			//javaScriptExecutor
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.location.reload(true)");
			System.out.println("5");
			
	}

}
