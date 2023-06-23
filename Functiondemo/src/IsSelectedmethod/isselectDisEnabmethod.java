package IsSelectedmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselectDisEnabmethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://freecrm.com/");
		WebElement url=driver.findElement(By.xpath("//a[text()='Sign Up']"));
		Thread.sleep(3000);
		url.click();
		//is Displayed method
		boolean b1=driver.findElement(By.xpath("//button[@name='action']")).isDisplayed();
		System.out.println(b1);
		Thread.sleep(3000);
		//is Selected Method
		WebElement checkbox=driver.findElement(By.id("terms"));
		boolean b2=checkbox.isSelected();
		System.out.println(b2);
		Thread.sleep(3000);

		if(b2==false)
		{
			checkbox.click();
		}
		Thread.sleep(3000);
		//get text method
		WebElement text=driver.findElement(By.xpath("//p[text()= 'For Security you must verify Email and Phone']"));
		String aa=text.getText();
		System.out.println("text is"+aa);
		//is Enabled method
		 boolean b3=checkbox.isEnabled();
		 System.out.println(b3);
	}

}
