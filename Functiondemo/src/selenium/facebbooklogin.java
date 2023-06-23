package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebbooklogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("facebbok");
Thread.sleep(5000);

driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
Thread.sleep(5000);

driver.findElement(By.xpath("//h3[contains(text(),'Facebook - Log In or Sign Up')]")).click();
Thread.sleep(5000);

driver.findElement(By.name("email")).sendKeys("9657202232");
Thread.sleep(5000);

driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9763238600");
Thread.sleep(5000);

driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
Thread.sleep(5000);
System.out.println(driver.getTitle());

}

}
