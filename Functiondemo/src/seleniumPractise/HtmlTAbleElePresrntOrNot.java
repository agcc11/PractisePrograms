package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTAbleElePresrntOrNot {

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			Thread.sleep(3000);
			jse.executeScript("window.scrollBy(0,600)");
			int rc=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
			int cc=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
			//tr=row    td=row+col   th=col
			
			
			boolean r=false;
			for(int i=1;i<rc;i++)
			{
				for(int j=1;j<=cc;j++)
				{
					String text1=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();   //i+1 because i=1 coloumn heading   
					if(text1.equals("Roland Mendel"))
					{
						r=true;
						System.out.println(i+":"+j);
						break;
						
					}
				}
				
			}
			if(r)
			{
				System.out.println("given element is present");
				
			}
			driver.close();
			
			

	}

}
