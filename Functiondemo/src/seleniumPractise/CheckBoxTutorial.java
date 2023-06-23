package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTutorial {

	public static void main(String[] args) throws InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Thread.sleep(3000);
			driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,850)");
			
			List<WebElement>all=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
			
			
			//select first two checkboxes
			for(int i=0;i<2;i++)
			{
				all.get(i).click();
			}
			
			//select last two chechboxes
			for(int i=all.size()-2;i<all.size();i++)
			{
				all.get(i).click();
			}
			
			//select all chechboxes
			
			for(int i=0;i<all.size();i++)
			{
				all.get(i).click();
				
			}
	}

}
