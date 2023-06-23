package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
			driver.switchTo().frame(0);
			WebElement drop=driver.findElement(By.xpath("//*[@id=\"cars\"]"));
			Thread.sleep(3000);
			Select d=new Select(drop);
			d.selectByIndex(0);
			Thread.sleep(3000);
			d.selectByValue("volvo");
			Thread.sleep(3000);
			d.selectByVisibleText("Audi");
			Thread.sleep(3000);
			List<WebElement>all=d.getAllSelectedOptions();
			Thread.sleep(3000);
			System.out.println(all.size());
			for(int i=0;i<=all.size()-1;i++)
			{
				String s=all.get(i).getText();
				System.out.println(s);
			}
			d.deselectAll();
			Thread.sleep(3000);
			d.selectByIndex(0);
			Thread.sleep(3000);
			d.selectByVisibleText("Audi");
			Thread.sleep(3000);
			d.deselectByIndex(0);
			List<WebElement>all2=d.getAllSelectedOptions();
			System.out.println(all2.size());
			

			
			
			
			
	    
		 
	
		 
		 
		
		 
		 
		 
	}

}
