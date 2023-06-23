package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_fbSignUp_page_main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		POM_fbSignUp_page obj=new POM_fbSignUp_page(driver);
		obj.creatbtnclick();
		Thread.sleep(3000);
		obj.inputfirstname();
		Thread.sleep(3000);
		obj.inputsurname();
		Thread.sleep(3000);
		obj.inputmobile();
		Thread.sleep(3000);
		obj.inputpass();
		Thread.sleep(3000);
		obj.inputselectday();
		Thread.sleep(3000);
		obj.inputselectmonth();
		Thread.sleep(3000);
		obj.inputselectyear();
		Thread.sleep(3000);
		obj.selectradiobtn();
		
		
	
	}

}
