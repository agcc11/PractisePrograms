package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_amazon_searchbtn {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchicon;
	
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[4]")
	private WebElement iphone13;
	
	public void searchitem() throws InterruptedException
	{	Thread.sleep(3000);
		searchbox.sendKeys("i phone 13 pro max");
	}
	public void searchiconMethod() throws InterruptedException
	{	Thread.sleep(3000);
		searchicon.click();
	}
	public void iphone13Method() throws InterruptedException
	{	Thread.sleep(3000);
		iphone13.click();
	}
	public POM_amazon_searchbtn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
