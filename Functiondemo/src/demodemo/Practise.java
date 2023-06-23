package demodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;


public class Practise {
	

//company	//*[@id="customers"]/tbody/tr[2]/td[1]
//contact    //*[@id="customers"]/tbody/tr[2]/td[2]	
//country    	//*[@id="customers"]/tbody/tr[2]/td[3]	

	//*[@id="customers"]/tbody/tr[4]/td[1]
	public static void main(String[] args) throws InterruptedException, IOException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriverfolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,500)");
	
		int r=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int d=driver.findElements(By.xpath("//table[@id='customers']//td")).size();
		System.out.println(r+" "+d);
	
		for(int i=1;i<r;i++)
		{
			for(int j=1;j<=d;j++)
			{
				String te=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				System.out.println(te);
			}
			
		}
		
		
	

	}
}

	

		


		