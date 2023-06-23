package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizeandpositionofbrowser {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Thread.sleep(3000);
 //Dimension d=new Dimension(200, 500);						//TO SET SIZE Of BROWSER
//driver.manage().window().setSize(d);;

Point p=new Point(100, 300);								//TO SET POSITION Of BROWSER
driver.manage().window().setPosition(p);




	}

}
