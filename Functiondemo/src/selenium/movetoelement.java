package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
	/*	driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement closebtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Thread.sleep(5000);
		closebtn.click();
		Thread.sleep(5000);
		WebElement fashion=driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
	//	WebElement elctronics=driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(fashion).build().perform();
		Thread.sleep(5000);
		WebElement mensfoot=driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		Thread.sleep(5000);
		act.moveToElement(mensfoot).build().perform();

	//	WebElement gaming=driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		Thread.sleep(5000);
	//	gaming.click();

	//	Thread.sleep(5000);
		mensfoot.click();
		String text=driver.getTitle();
		System.out.println(text);
	*/
		//MOVETO ELEMENT SUBMENU EXAMPLE
		driver.get("http://mrbool.com/");
		Thread.sleep(3000);
		WebElement menu=driver.findElement(By.xpath("//a[@class='menulink']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(menu).build().perform();
		WebElement submenu=driver.findElement(By.xpath("(//a[text()='Courses'])[2]"));
		Thread.sleep(3000);
		submenu.click();
		

	}

}
