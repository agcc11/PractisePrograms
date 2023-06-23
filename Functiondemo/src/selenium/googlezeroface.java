package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlezeroface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(3000);
driver.manage().window().maximize();
Thread.sleep(3000);

driver.findElement(By.name("q")).sendKeys("zerodha");
Thread.sleep(3000);

driver.findElement(By.name("btnK")).submit();
Thread.sleep(3000);

driver.navigate().to("https://www.facebook.com/");
Thread.sleep(3000);

driver.findElement(By.name("email")).sendKeys("Aniket Ghorpade");
Thread.sleep(3000);

driver.findElement(By.name("pass")).sendKeys("12345");
Thread.sleep(3000);

driver.navigate().back();
Thread.sleep(3000);

driver.navigate().forward();
Thread.sleep(3000);

driver.navigate().refresh();
Thread.sleep(3000);

driver.close();





	}

}
