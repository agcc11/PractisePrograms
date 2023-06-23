package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_dynamic_element_by_contains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(3000);
		WebElement checkbox=driver.findElement(By.xpath("//input[contains(@name,'chk_altemail')]"));
		boolean aa=checkbox.isSelected();
		if(aa!=true)
		{
			checkbox.click();
		}
		System.out.println(aa);
		
	}
			//relative xpath (//html//input)[7]
}
