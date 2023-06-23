package seleniumPractise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomFlipkartHomePage {
	WebDriver driver;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
    private WebElement closebtn;
    
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement searchbox;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement searchicon;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//div[@class='exehdJ']")
	private WebElement moreoption;
	
	@FindBy(xpath="//span[text()='Cart']")
	private WebElement cart;
	
	@FindBy(xpath="//span[text()='Electronics']")
	private WebElement ElectronicsModule;
	
	@FindBy(xpath="//span[text()='TVs & Appliances']")
	private WebElement TVsandAppliancesModule;
	
	@FindBy(xpath="//span[text()='Men']")
	private WebElement MenModule;
	
	@FindBy(xpath="//span[text()='Sports, Books & More']")
	private WebElement sportsmodule;
	
	  public void closebtnmethod() throws InterruptedException
	  {	 Thread.sleep(3000);
   	     closebtn.click();
      }
	public void searchboxmethod() throws InterruptedException
		{
			searchbox.sendKeys("iphone");
			Thread.sleep(3000);
			searchicon.click();
		}
	public void logibtnmethod() throws InterruptedException
	{	Thread.sleep(3000);
		loginbtn.click();
	}
	public void moreMethod(WebDriver driver) throws InterruptedException
	{
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(moreoption).build().perform();
	}
	public void cartMethod() throws InterruptedException
	{	Thread.sleep(5000);
		cart.click();
	}
	public void mainmodules() throws InterruptedException
	{
		Actions act2=new Actions(driver);
		Thread.sleep(5000);
		act2.moveToElement(ElectronicsModule).build().perform();
		Thread.sleep(5000);
		act2.moveToElement(TVsandAppliancesModule).build().perform();
		Thread.sleep(5000);
		act2.moveToElement(MenModule).build().perform();
		Thread.sleep(5000);
		act2.moveToElement(sportsmodule).build().perform();
		Thread.sleep(5000);
	}
	public void scrollmethod(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,500)");
	}
	public pomFlipkartHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
  }
	
	

	





