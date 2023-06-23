package selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropconcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		Thread.sleep(5000);
		WebElement tryitbtn=driver .findElement(By.xpath("//a[@class='w3-btn w3-margin-bottom']"));
		tryitbtn.click();
		Thread.sleep(5000);
		ArrayList<String>windows=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows);
		Thread.sleep(5000);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		Thread.sleep(5000);
		WebElement source=driver.findElement(By.xpath("//img[@id='drag1']"));
		Thread.sleep(5000);
		WebElement dest=driver.findElement(By.xpath("//div[@id='div1']"));
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.clickAndHold(source).moveToElement(dest).release().build().perform();
		System.out.println("done");
		
	
	/*	driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement drg=driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(5000);
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.dragAndDrop(drg, drop).build().perform();
		Thread.sleep(5000);
		System.out.println("done");
	*/
}
}