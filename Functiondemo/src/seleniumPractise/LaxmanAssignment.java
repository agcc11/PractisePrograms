package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaxmanAssignment {

	public static void main(String[] args) throws InterruptedException {

		
		  System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.mcxindia.com/#");
			driver.findElement(By.xpath("(//div[@class='close_apply_now'])[2]")).click();
			WebElement market=driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div[1]/div[2]/div/div/div/div/ul/li[2]/a"));
			market.click();
			WebElement watch=driver.findElement(By.xpath("(//a[@href='/market-data/market-watch'])[1]"));
			Actions ac=new Actions(driver);
			ac.moveToElement(watch).click().build().perform();
			WebElement all=driver.findElement(By.xpath("//input[@id='ctl00_cph_InnerContainerRight_C005_ddlSymbols1_Input']"));
			all.click();
			List<WebElement> drop=driver.findElements(By.xpath("//li[@class='rcbItem']"));
			Thread.sleep(3000);
			for(int i=0;i<drop.size();i++)
			{
				String text=drop.get(i).getText();
				if(text.equals("GOLD"))
				{
					drop.get(i).click();
				}
			}
		/*	WebElement value=driver.findElement(By.xpath("(//table[@class='markt marketwatch-table'])[1]//tr[2]//td[16]"));
			String first=value.getText();
			System.out.println(first);
			Thread.sleep(180000);
			
			String second=value.getText();
			System.out.println(second);
			
			float a=Float.parseFloat(first);      //CONVERT STRING TO FLOAT
			float b=Float.parseFloat(second);
			float diff=a-b;
			System.out.println(diff);
		*/
			
			String s="(//table[@class='markt marketwatch-table'])[1]//tr[1]//td[";
			String e="]";
			for(int i=1;i<=3;i++)
			{
				String row=s+i+e;
				WebElement aa=driver.findElement(By.xpath(row));
				System.out.println(aa.getText());
			}
			
			
			
			
			
	}

}
