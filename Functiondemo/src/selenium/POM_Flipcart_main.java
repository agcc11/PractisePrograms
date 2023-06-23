package selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Flipcart_main {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		POM_Flipcart obj=new POM_Flipcart(driver);
		obj.goclosebtn();
		Thread.sleep(5000);
		obj.goelectronics(driver);
		Thread.sleep(5000);
		obj.golaptopaccs(driver);
		Thread.sleep(5000);
		obj.gomouse(driver);
		Thread.sleep(5000);
		obj.gopriceHtoL();
		Thread.sleep(5000);
		obj.gomicrosoft();
		Thread.sleep(5000);
		obj.goimg01(driver);
		Thread.sleep(5000);
		obj.goimg02(driver);
		Thread.sleep(5000);
		obj.goimg03(driver);
		Thread.sleep(5000);
		obj.goimg04(driver);
		Thread.sleep(5000);
		obj.goimg05(driver);
		Thread.sleep(5000);
		obj.goaddtocart();
		Thread.sleep(5000);
		obj.goplaceorderbtn();
		
	}

}
