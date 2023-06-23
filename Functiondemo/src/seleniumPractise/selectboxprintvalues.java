package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class selectboxprintvalues {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9301538%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwyMiTBhDKARIsAAJ-9VsMRGdiuW1MAYhUjAdgzwK2UruUfSr2HpdxUWUF3F8cB7q2cmdfk2AaAtZuEALw_wcB");
	/*	List<WebElement> day=driver.findElements(By.xpath("//select[@id='day']/option"));
		List<WebElement> month=driver.findElements(By.xpath("//select[@id='month']/option"));
		List<WebElement> year=driver.findElements(By.xpath("//select[@id='year']/option"));
		int daycount=day.size();
		int monthcount=month.size();
		int yearcount=year.size();
		System.out.println(daycount);
		System.out.println(monthcount);
		System.out.println(yearcount);
		for(WebElement dayvalues:day)
		{
			String textdayvalues=dayvalues.getText();
			System.out.println(textdayvalues);
		}
	*/
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select s=new Select(year);
		List<WebElement>all=s.getOptions();
		for(int i=0;i<=all.size()-1;i++) {
			String ss=all.get(i).getText();
			if(ss.equalsIgnoreCase("1996"))
			{
				all.get(i).click();
			}
		}
	}

}
