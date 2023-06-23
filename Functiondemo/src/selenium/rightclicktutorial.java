package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclicktutorial {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		WebElement rightclickbtn=driver.findElement(By.xpath("//span[text()='right click me']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.contextClick(rightclickbtn).build().perform();
		Thread.sleep(3000);
		WebElement copy=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
		String text=copy.getText();
		System.out.println(text);
		Thread.sleep(3000);
		copy.click();
		Alert popup=driver.switchTo().alert();
		String text01=popup.getText();
		System.out.println(text01);
		Thread.sleep(3000);
		popup.accept();
		

	}

}
