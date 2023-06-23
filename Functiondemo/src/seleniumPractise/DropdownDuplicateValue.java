package seleniumPractise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDuplicateValue {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://geodata.solutions/");
		Thread.sleep(3000);
		WebElement mm=driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(mm);
		Thread.sleep(3000);
		List<WebElement>all=s.getOptions();
		System.out.println(all.size());
		
		for(int i=0;i<all.size();i++)
		{
			String ss=all.get(i).getText();
			System.out.println(ss) ;
		}
		Thread.sleep(3000);
		Set<String> gf=new HashSet<String>();  //idexwise data is not stored
	
		for(WebElement as :all)
		{
			gf.add(as.getText());
			
		}
		Thread.sleep(3000);
		System.out.println(gf);
		System.out.println(gf.size());
		
		
	/*	Set<String> gf=new LinkedHashSet<String>();  // index wise data is stored
		
		for(int i=0;i<all.size();i++)
		{
			 gf.add(all.get(i).getText());   // cant store in string beacause gf.add retutntype is boolean
			 									// so output is in array
		}
		
		System.out.println(gf);
		System.out.println(gf.size());
		*/
		
	}

}
