package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmltablehandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		WebElement uk=driver.findElement(By.xpath("//table//tr[5]//td[3]"));
		String value=uk.getText();
		Thread.sleep(3000);
		System.out.println(value);
	}

}
