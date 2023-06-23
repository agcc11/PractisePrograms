package seleniumPractise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksOnWebpage {

	
	public static void verifylink(String linkurl) throws IOException
	{
		try
		{
		URL url=new URL(linkurl);
		HttpURLConnection httpurlconnect=(HttpURLConnection)url.openConnection();
		httpurlconnect.setConnectTimeout(3000);
		httpurlconnect.connect();
		if(httpurlconnect.getResponseCode()==200)
		{
			System.out.println(linkurl+" "+httpurlconnect.getResponseMessage());
		}
		if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(linkurl+" "+httpurlconnect.getResponseMessage());
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 List<WebElement>alllinks=driver.findElements(By.xpath("//a"));
		 int s=alllinks.size();
		 
		 for(int i=0;i<alllinks.size();i++)
		 {
			WebElement ele= alllinks.get(i);
			String url=ele.getAttribute("href");
			verifylink(url);
			
		 }
		
		
	}

}
