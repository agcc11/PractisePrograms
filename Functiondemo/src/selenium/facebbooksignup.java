package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class facebbooksignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
WebElement cna=driver.findElement(By.xpath("(//a[@role='button'])[2]"));  //xpath by index
Thread.sleep(3000);
cna.click();
Thread.sleep(3000);
WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
firstname.sendKeys("Aniket");
Thread.sleep(3000);
WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
Thread.sleep(3000);

surname.sendKeys("Ghorpade");
Thread.sleep(3000);

WebElement mobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
mobile.sendKeys("9657202232");
Thread.sleep(3000);
	
WebElement password=driver.findElement(By.xpath("//input[@id='password_step_input']"));
password.sendKeys("965720232");
WebElement selectday=driver.findElement(By.xpath("//select[@id='day']"));
Thread.sleep(3000);

Select d=new Select(selectday);
d.selectByIndex(2);
WebElement selectmonth=driver.findElement(By.xpath("//select[@id='month']"));
Thread.sleep(3000);

Select m=new Select(selectmonth);
m.selectByIndex(7);
Thread.sleep(3000);

WebElement selectyear=driver.findElement(By.xpath("//select[@id='year']"));
Thread.sleep(3000);

Select y=new Select(selectyear);
y.selectByVisibleText("1996");
Thread.sleep(3000);
	
WebElement gender=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
gender.click();


	}

}
