package selenium;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_iphonepage {
		
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocartbtn;
	
	@FindBy(xpath="//a[@class='a-button-text']")
	private WebElement gotocart;
	
	@FindBy(xpath="//span[@id='a-autoid-4-announce']")
	private WebElement dropdown;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	private WebElement proceedtopay;
	
	public void addtocartbtnMethod(WebDriver driver) throws InterruptedException
	{	ArrayList<String>win=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(win.get(1));
		Thread.sleep(3000);
		addtocartbtn.click();
	}
	public void gotocartMethod() throws InterruptedException
	{	Thread.sleep(6000);
		gotocart.click();
	}
	public void dropdownMethod() throws InterruptedException
	{	Thread.sleep(3000);
		dropdown.click();
		Select d=new Select(dropdown);
		d.selectByValue("2");
	}
	public void proceedtopayMethod() throws InterruptedException
	{	Thread.sleep(3000);
		proceedtopay.click();
	}
	public POM_iphonepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
