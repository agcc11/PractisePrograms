	package seleniumPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSortedOrNot {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Thread.sleep(3000);
			driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfb%20sign%20up%7C&placement=&creative=589460569891&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9301538%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAqOucBhDrARIsAPCQL1ZbfUvEoocC6yGYsSFuDffy3ADwVWs0bMFy-ksqre95SkvTJt3QM50aAj40EALw_wcB");
			WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
			Select s=new Select(month);
			List<WebElement>all=s.getOptions();
			int ss=all.size();
			System.out.println(ss);

			ArrayList or=new ArrayList();
			ArrayList temp=new ArrayList();
			
			for(int i=0;i<all.size();i++)
			{
				
				or.add(all.get(i).getText());
				temp.add(all.get(i).getText());
			}
			System.out.println("or list"+or);
			System.out.println("before sorting temp list"+temp);
			
			Collections.sort(temp);
			
			System.out.println("or list"+or);
			System.out.println("After sorting temp list"+temp);
			
			if(or.equals(temp))
			{
				System.out.println("sorted");
			}
			else
			{
				System.out.println("not sorted");
			}
			
			
	}

}
