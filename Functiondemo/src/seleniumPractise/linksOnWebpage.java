package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class linksOnWebpage {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 List<WebElement>alllinks=driver.findElements(By.xpath("//a"));
		 int s=alllinks.size();
		 System.out.println("no of links are "+s);
		 for(WebElement links:alllinks)
		 {
			 String textoflinks=links.getText();
			 System.out.println(textoflinks); 
		 }
	
		 		//alternate 
	/*	 for(int i=0;i<alllinks.size();i++)
		 {
			System.out.println(driver.findElements(By.xpath("//a")).get(i).getText());
		 }
	*/	
		 
		 
		
	}

}
