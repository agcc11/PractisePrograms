package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vctciframeExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		driver.switchTo().frame("iframe-name");
		Thread.sleep(5000);
		WebElement btn=driver.findElement(By.xpath("//a[text()='Click to Start Selenium Practice Now']"));
		btn.click();
		Thread.sleep(5000);
		//driver.close();
		//Thread.sleep(5000);
		WebElement btn1=driver.findElement(By.xpath("(//a[text()='Read More'])[1]"));
		Thread.sleep(5000);
		btn1.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.switchTo().frame("iframe-name");
		Thread.sleep(5000);
		WebElement btn2=driver.findElement(By.xpath("(//a[text()='Read More'])[9]"));
		btn2.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.switchTo().frame("iframe-name");
		WebElement btn3=driver.findElement(By.xpath("(//a[text()='Read More'])[17]"));
		btn3.click();
		Thread.sleep(5000);
		driver.navigate().back();
	//	System.out.println("done");
		/*Thread.sleep(5000);
		driver.switchTo().frame("iframe-name");
		WebElement searchbtn=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchbtn.sendKeys("patience");*/
		
	}

}
