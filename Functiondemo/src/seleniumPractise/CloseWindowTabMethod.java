package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWindowTabMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		    System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			Thread.sleep(3000);
			
			//open new tab
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
			driver.get("https://www.amazon.in/");
			
			try
			{
			//close new tab
				Thread.sleep(3000);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"w");
			Thread.sleep(3000);
			}
			catch(Exception e)
			{
				
				System.out.println(e);
			}
			
										
		
	}

}
