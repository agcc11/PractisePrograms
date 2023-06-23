package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class POM_assertconcept {

		@FindBy(xpath="//button[text()='Search Buses']")
		private WebElement Searchbuses; 
		
		public void Assertmethod(WebDriver driver) throws InterruptedException
		{	String Expectedtitle="Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India";
			String actualtitle=driver.getTitle();
			Thread.sleep(3000);
			System.out.println(actualtitle);
			SoftAssert SoftAssert=new SoftAssert();
			SoftAssert.assertEquals(actualtitle, Expectedtitle);
			SoftAssert.assertAll();
			
		}
		
		public void SearchbusesMethod(WebDriver driver) throws InterruptedException
		{	String expectsearchbtn="search_btn";
			String attributervalue=Searchbuses.getAttribute("id");
			Thread.sleep(3000);
			System.out.println(attributervalue);
			SoftAssert SoftAssert=new SoftAssert();
			SoftAssert.assertEquals(attributervalue, expectsearchbtn);
			SoftAssert.assertAll();		}
		
	}



