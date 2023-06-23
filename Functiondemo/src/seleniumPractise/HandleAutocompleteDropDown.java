







package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutocompleteDropDown {

	public static void main(String[] args) throws InterruptedException {

		
		
		 System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Thread.sleep(3000);
			driver.get("https://www.twoplugs.com/");
			WebElement live=driver.findElement(By.xpath("//a[text()='Live Posting']"));
			live.click();
			Thread.sleep(3000);
			WebElement box=driver.findElement(By.xpath("//input[@id='autocomplete']"));
			box.clear();
			box.sendKeys("Toronto");
			
			String text;
			do
			{
				box.sendKeys(Keys.ARROW_DOWN);
				text=box.getAttribute("value");
				if(text.equals("Toronto, OH, USA"))
				{
					box.sendKeys(Keys.ENTER);
					break;
				}
						
			}while(!text.isEmpty());
			

	}

}
