package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findwebelements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.xpath("//table"));
		List<WebElement>row=table.findElements(By.xpath("//tr"));
		int rowsize=row.size();
		System.out.println(rowsize);
		List<WebElement>col=row.get(1).findElements(By.xpath("//td"));
		int colsize=col.size();
		System.out.println(colsize);
		String coltext=col.get(1).getText();
		System.out.println(coltext);
		
		
		
	}

}
