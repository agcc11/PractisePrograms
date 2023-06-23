package Alertpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3school {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(3000);

	   driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);

	   WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		Thread.sleep(3000);

	   tryit.click();
		Thread.sleep(3000);

	   Alert as=driver.switchTo().alert();
		Thread.sleep(3000);
					 String text=as.getText();
	   System.out.println(text);
		Thread.sleep(3000);

	   if(text.equals("I am an alert box!"))
	   {
		   System.out.println("statement is correct");
	   }
	   else
	   {
		   System.out.println("statement is not correct");
	   }
	   as.accept();
		Thread.sleep(3000);

	    tryit.click();
		Thread.sleep(3000);

	   as.dismiss();

	   
	   
		   
	   
	}

}
