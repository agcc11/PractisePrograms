package seleniumPractise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinkNewTab {

	public static void main(String[] args) throws InterruptedException {

		
		  System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			WebElement all=driver.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[3]//li"));
			
			for(int i=0;i<all.findElements(By.tagName("a")).size();i++)
			{
				String op=Keys.chord(Keys.CONTROL,Keys.ENTER);
				Thread.sleep(2000);
				all.findElements(By.tagName("a")).get(i).sendKeys(op);
			}
			
			//TITLE OF EACH WINDOW
			Set<String>ab=driver.getWindowHandles();
			Iterator<String> ss=ab.iterator();
			while(ss.hasNext())
			{
				driver.switchTo().window(ss.next());
				System.out.println(driver.getTitle());
			}
			
			//ALTERNATE FOR GET TITLE
			
            ArrayList<String> ar=new ArrayList<String>(driver.getWindowHandles());
			
			for(int j=0;j<=ar.size()-1;j++)
			{
				driver.switchTo().window(ar.get(j));
				System.out.println(driver.getTitle());
			}
				
		
		
	  
	}

}
