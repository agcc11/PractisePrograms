package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class vctcexample {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);

		WebElement google=driver.findElement(By.xpath("//input[@name='q']"));
		google.sendKeys("vctc");
		Thread.sleep(3000);

	WebElement gbutton=	driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		gbutton.submit();
		Thread.sleep(3000);

		WebElement vctc=driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		vctc.click();
		Thread.sleep(3000);

		WebElement start=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		start.click();
		Thread.sleep(3000);

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);


		WebElement radiobtn01=driver.findElement(By.xpath("//input[@value='Radio1']"));
		Thread.sleep(3000);

		boolean r1=radiobtn01.isSelected();
		Thread.sleep(3000);

		System.out.println(r1);
		if(r1==false)
		{
			radiobtn01.click();
		}
		
		
		
		
	}

}
