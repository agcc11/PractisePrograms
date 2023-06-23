package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class you_tube {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
		 Thread.sleep(3000);
		 WebDriver driver=new ChromeDriver();
		 Thread.sleep(3000);
		 driver.get("https://www.youtube.com/");
		WebElement search= driver.findElement(By.xpath("//input[@id='search']"));
		 Thread.sleep(3000);
		search.sendKeys("raj aal raj aal");
		WebElement searchic=driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]"));
		searchic.click();
		 Thread.sleep(3000);
		WebElement song=driver.findElement(By.xpath("(//yt-formatted-string[text()='Raja Aala Official Song - Pawankhind | Marathi Song 2022 | Chinmay Mandlekar | Digpal Lanjekar'])[2]"));
		 Thread.sleep(3000);
		song.click();
	}

}
