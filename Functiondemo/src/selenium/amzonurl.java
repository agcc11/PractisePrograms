package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzonurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver1.get("https://www.amazon.in/");
		long start= System.currentTimeMillis();
		System.out.println(start);
		driver.get("https://www.amazon.in/");
		long amazon =System.currentTimeMillis();
		System.out.println(amazon);
		
	}

}
