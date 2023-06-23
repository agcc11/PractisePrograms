package seleniumPractise;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3schoolchildbrowserhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_opener");
		Thread.sleep(3000);
		String paradd=driver.getWindowHandle();
		Thread.sleep(3000);
		System.out.println(paradd);
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		WebElement tyritbtn=driver.findElement(By.xpath("//button[text()='Try it']"));
		Thread.sleep(3000);
		tyritbtn.click();
		ArrayList<String>alladd=new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(3000);
		System.out.println(alladd);
		Thread.sleep(3000);
		driver.switchTo().window(alladd.get(1));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String childtitile=driver.getTitle();
		Thread.sleep(3000);
		System.out.println(childtitile);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(alladd.get(0));
		String maintitle=driver.getTitle();
		System.out.println(maintitle);
		driver.quit();
	}

}
