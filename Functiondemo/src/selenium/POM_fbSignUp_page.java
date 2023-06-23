package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_fbSignUp_page {
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement creatnewbtn;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy (xpath="//input[@name='lastname']")
	private WebElement surname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobilenum;
	
	@FindBy(xpath="//input[@id='password_step_input']")
	private WebElement Newpass;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement day;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement year;

	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement male;
	
	public void creatbtnclick()
	{
		creatnewbtn.click();
	}
	
	public void inputfirstname()
	{
		firstname.sendKeys("aniketttt");
	}
	
	public void inputsurname()
	{
		surname.sendKeys("ghorpade");
	}
	public void inputmobile()
	{
		mobilenum.sendKeys("96572022");
	}
	
	public void inputpass()
	{
		Newpass.sendKeys("124578");
	}
	public void inputselectday()
	{
		Select d= new Select(day);
		d.selectByIndex(30);			
	}
	public void inputselectmonth()
	{
		Select d= new Select(month);
		d.selectByIndex(4);
	}
	
	public void inputselectyear()
	{
		Select d= new Select(year);
		d.selectByVisibleText("1999");
	}
	public void selectradiobtn()
	{
		male.click();
	}
	public POM_fbSignUp_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	
	

	


	

	
	




	
	
	
	

}
