package seleniumPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AutosuggestiveDropBox {

	public static void main(String[] args) throws InterruptedException {

	/*	  System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.redbus.in/");
			//driver.get("https://www.google.co.in/");
			Thread.sleep(3000);
		WebElement from=driver.findElement(By.xpath("//*[@id=\"src\"]"));
		//	WebElement sear=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
			//sear.sendKeys("selenium");
			from.sendKeys("pun");
			Thread.sleep(3000);
			List<WebElement> all =driver.findElements(By.xpath("//li[@class='sub-city']"));
		//	List<WebElement> all =driver.findElements(By.xpath("//li[@class='sbct']"));
			
			Thread.sleep(3000);
			for(int i=0;i<=all.size()-1;i++)
			{
				if(all.get(i).getText().equalsIgnoreCase("wakad,pune"))
				{
					Thread.sleep(3000);
					all.get(i).click();	
					System.out.println("done");
				}	
			}
		*/	
			
			
			//AMAZON DROPDOWN PRINT VALUES
		    System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			
			WebElement sign=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
			Actions act=new Actions(driver);
			act.moveToElement(sign).build().perform();
			Thread.sleep(3000);
			List<WebElement> ele=driver.findElements(By.xpath("//a[@class='nav-link nav-item']"));
			
			for(int i=0;i<ele.size();i++)
			{
				WebElement e=ele.get(i);
				String te=e.getText();
				System.out.println(te);
			}
			
			
			
				
			// RED BUS DROPDOWN
	
		/*	   System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.redbus.in/");
		    	WebElement from=driver.findElement(By.xpath("//*[@id=\"src\"]"));
		     	from.sendKeys("kat");

		       Thread.sleep(3000);
		       List<WebElement>all=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
		
		for(int i=0;i<=all.size()-1;i++)
		{
			String te=all.get(i).getText();
			if(te.contains("Katraj"))
			{
				all.get(i).click();
				break;
			}
		}
		WebElement to=driver.findElement(By.xpath("//*[@id=\"dest\"]"));
		to.sendKeys("mum");
		Thread.sleep(3000);
		List<WebElement>all2=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
		for(int i=0;i<=all2.size()-1;i++)
		{
			String ss=all2.get(i).getText();
			if(ss.contains("Dadar"))
			{
				all2.get(i).click();
				break;
			}
		}
		WebElement date=driver.findElement(By.xpath("//*[@id=\"onward_cal\"]"));
		date.click();
		//Actions ac=new Actions(driver);
		WebElement next=driver.findElement(By.xpath("//td[@class='next']"));
		next.click();
		List<WebElement>calall=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));
		for(int i=0;i<=calall.size()-1;i++)
		{
			String dt=calall.get(i).getText();
			if(dt.contains("3"))
			{
				calall.get(i).click();
			}
		}

		WebElement search=driver.findElement(By.xpath("//*[@id=\"search_btn\"]"));
		search.click();
		Thread.sleep(3000);
	 //  WebElement view=driver.findElement(By.xpath("//*[@id=\"13918410\"]/div/div[2]/div[1]"));
//		view.click();
		String urll="https://www.redbus.in/search?fromCityName=Katraj%2C%20Pune&fromCityId=67455&toCityName=Dadar%20East%2C%20Mumbai&toCityId=66558&onward=03-Aug-2022&srcCountry=IND&destCountry=IND&opId=0&busType=Any";
		String ur=driver.getCurrentUrl();
		System.out.println(ur);
		Assert.assertEquals(urll, ur,"url not matching");
		driver.close();
			*/	

		

		
			
		
		
	}

}
