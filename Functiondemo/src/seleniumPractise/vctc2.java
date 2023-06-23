package seleniumPractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vctc2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
	WebElement radiobtn01=driver.findElement(By.xpath("//input[@value='Radio1']"));
	Thread.sleep(3000);
		boolean b1=radiobtn01.isSelected();
		System.out.println("b1 :"+b1);
		Thread.sleep(3000);
		if(b1==false)
		{
			radiobtn01.click();
		}
		Thread.sleep(3000);
		WebElement suggestionbox=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		String text=suggestionbox.getText();
		System.out.println(text);
			suggestionbox.sendKeys("india");
			
			WebElement selectbox=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	
		Select d=new Select(selectbox);
		d.selectByVisibleText("Option1");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		boolean b2=checkbox.isSelected();
		System.out.println("b2 :"+b2);
		if(b2!=true)
		{
			checkbox.click();
		}
		WebElement alertbtn=driver.findElement(By.xpath("//input[@id='alertbtn']"));
		alertbtn.click();
		Alert aa=driver.switchTo().alert();
		String texton=aa.getText();
		System.out.println(texton);
		aa.accept();
		Thread.sleep(3000);

		WebElement confirmbtn=driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		confirmbtn.click();
		Thread.sleep(3000);

		Alert bb=driver.switchTo().alert();
	String conftext=bb.getText();
	Thread.sleep(3000);

	System.out.println(conftext);
	Thread.sleep(3000);

	if(conftext.equals("Hello , Are you sure you want to confirm?"))
	{
		bb.dismiss();
	}
	WebElement hide=driver.findElement(By.xpath("//input[@id='hide-textbox']"));
	Thread.sleep(3000);
			hide.click();
			WebElement hidebox=	driver.findElement(By.xpath("//input[@id='displayed-text']"));
			Thread.sleep(3000);
			boolean b3=	hidebox.isDisplayed();
			System.out.println(b3);
			Thread.sleep(3000);
		if(b3==false)
		{
			WebElement show=driver.findElement(By.xpath("//input[@id='show-textbox']"));
						show.click();
		}
		Thread.sleep(3000);
				hidebox.sendKeys("it is available");
				Thread.sleep(3000);
				//HANDLE AUTOSUGGESTION DROPDOWN
				WebElement dropdown=driver.findElement(By.xpath("//input[@list='mah-district']"));
				Thread.sleep(3000);
				dropdown.click();
				Thread.sleep(3000);

				dropdown.sendKeys("pune");
				Thread.sleep(3000);

				dropdown.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);

				dropdown.sendKeys(Keys.ENTER);

			

	}

}
