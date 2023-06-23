package selenium;

import javax.sql.rowset.spi.XmlReader;

import org.apache.logging.log4j.categories.Layouts.Xml;
import org.apache.poi.xssf.eventusermodel.XSSFReader.XMLSheetRefReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmltabledataStoreInExcelSheet {

	public static void main(String[] args) throws InterruptedException {
		//name
		//*[@id="example"]/tbody/tr[1]/td[1]
		//*[@id="example"]/tbody/tr[2]/td[1]
		//*[@id="example"]/tbody/tr[3]/td[1]
		
		//position
		//*[@id="example"]/tbody/tr[1]/td[2]
		//*[@id="example"]/tbody/tr[2]/td[2]
		//*[@id="example"]/tbody/tr[3]/td[2]
		
		//office
		//*[@id="example"]/tbody/tr[1]/td[3]
		//*[@id="example"]/tbody/tr[2]/td[3]
		System.setProperty("webdriver.chrome.driver","G:\\selenium\\chromedriverfolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://datatables.net/");
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"example_length\"]/label/select"));
		Select d=new Select(drop);
		d.selectByValue("25");
		Thread.sleep(3000);
		String namestart="//*[@id=\"example\"]/tbody/tr[";
		String nameend="]/td[1]";
		
		String posistart="//*[@id=\"example\"]/tbody/tr[";
		String posiend="]/td[2]";
		
		String offstart="//*[@id=\"example\"]/tbody/tr[";
		String offend="]/td[3]";
		
		String path="G:\\Software Testing\\Demo Fetch Data\\importdatafromhtmlptable.xlsx";
		XMLSheetRefReader reader=new XMLSheetRefReader();
	
		
		for(int i=1;i<=20;i++)
		{
			String actname=namestart+i+nameend;
			String name=driver.findElement(By.xpath(actname)).getText();
			System.out.println(name);
			
			String actposi=posistart+i+posiend;
			String position=driver.findElement(By.xpath(actposi)).getText();
			System.out.println(position);
			
			String actoff=offstart+i+offend;
			String office=driver.findElement(By.xpath(actoff)).getText();
			System.out.println(office);
		
		}
		
		
		
	}

}
