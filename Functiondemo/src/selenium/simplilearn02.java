package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplilearn02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");

ChromeDriver driver=new ChromeDriver();



driver.get("https://www.simplilearn.com/");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.id("header_srch")).sendKeys("selenium");
Thread.sleep(5000);
driver.findElement(By.xpath("//span[@class='search_icon input-search-icon']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//h2[text()=\"Selenium 3.0 Training\"]")).click();
Thread.sleep(5000);
//driver.findElement(By.xpath("//a[@class='show more ']")).click();

System.out.println("the page title is:"+ driver.getTitle());


	}

}
