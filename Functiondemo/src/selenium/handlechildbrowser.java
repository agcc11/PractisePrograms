package selenium;

import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlechildbrowser {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);
		String win=driver.getWindowHandle();
		System.out.println(win);
		Thread.sleep(3000);
		System.out.println("----------------------------------------");
		WebElement tryityour=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		Thread.sleep(3000);
		tryityour.click();
		ArrayList<String>window=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(window);
		Thread.sleep(3000);
		driver.switchTo().window(window.get(1));
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		WebElement tryitbtn=driver.findElement(By.xpath("//button[text()='Try it']"));
		tryitbtn.click();
		Thread.sleep(3000);
		Alert popup=driver.switchTo().alert();
		Thread.sleep(3000);
		String text=popup.getText();
		System.out.println(text);
		Thread.sleep(3000);
		if(popup.equals("I am an alert box!"))
		{
			System.out.println("statement is correct");
		}
		else
		{
			System.out.println("statemnt is not correct");
		}
		popup.accept();
		
	}

}
