package selenium;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Flipcart {
	
	  @FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
      private WebElement closebtn;
      
       @FindBy(xpath="(//div[@class='xtXmba'])[5]")
       private WebElement electronics;
       
       @FindBy(xpath="//a[text()='Laptop Accessories']")
       private WebElement laptopAccess;
       
       @FindBy(xpath="//a[text()='Mouse']")
       private WebElement mouse;
       
       @FindBy(xpath="//div[text()='Price -- High to Low']")
       private WebElement priceHtoL;
       
       @FindBy(xpath="(//a[@class='s1Q9rs'])[1]")
       private WebElement microsoft;
       
       @FindBy(xpath="(//img[@class='q6DClP'])[1]")
       private WebElement img01;
       
       @FindBy(xpath="(//img[@class='q6DClP'])[2]")
       private WebElement img02;
       
       @FindBy(xpath="(//img[@class='q6DClP'])[3]")
       private WebElement img03;
       
       @FindBy(xpath="(//img[@class='q6DClP'])[4]")
       private WebElement img04;
       
       @FindBy(xpath="(//img[@class='q6DClP'])[5]")
       private WebElement img05;
       
       @FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
       private WebElement addtocart;
     
       @FindBy(xpath="(//html//button)[4]")
       private WebElement placeorderbtn;
       
       public void goclosebtn() {
    	   closebtn.click();
       }
       
       public void goelectronics(WebDriver driver)
       {
    	   Actions act=new Actions(driver);
    	   act.moveToElement(electronics).build().perform();
       }
       
       public void golaptopaccs(WebDriver driver)
       {
    	   Actions act=new Actions(driver);
    	   act.moveToElement(laptopAccess).build().perform();
       }
       
       public void gomouse(WebDriver driver)
       {
    	   Actions act=new Actions(driver);
    	   act.moveToElement(mouse).click().build().perform();
       }
      
       public void gopriceHtoL()
       {
    	   priceHtoL.click();
       }
      
      public void gomicrosoft()
       {
    	   microsoft.click();
       }
       
       public void goimg01(WebDriver driver) throws InterruptedException
       
       {	ArrayList<String>windows=new ArrayList<String>(driver.getWindowHandles());
       		driver.switchTo().window(windows.get(1));
    	   Actions act=new Actions(driver);
    	   act.moveToElement(img01).build().perform();
       }
       public void goimg02(WebDriver driver)
       {
    	   Actions act=new Actions(driver);
    	   act.moveToElement(img02).build().perform();
       }
       public void goimg03(WebDriver driver)
       {
    	   Actions act=new Actions(driver);
    	   act.moveToElement(img03).build().perform();
       }
       public void goimg04(WebDriver driver)
       {
    	   Actions act=new Actions(driver);
    	   act.moveToElement(img04).build().perform();
       }
       public void goimg05(WebDriver driver)
       {
    	   Actions act=new Actions(driver);
    	   act.moveToElement(img05).build().perform();
       }
       public void goaddtocart()
       {
    	   addtocart.click();
       }
       
       public void goplaceorderbtn()
       { 	//ArrayList<String>windows=new ArrayList<String>(driver.getWindowHandles());
  		  //driver.switchTo().window(windows.get(1));
    	  // Actions act=new Actions(driver);
  		  //act.moveToElement(placeorderbtn).click().build().perform();
  		  placeorderbtn.click();
  		  System.out.println("click");
       }
    
       public POM_Flipcart(WebDriver driver)
       {
    	   PageFactory.initElements(driver, this);
       }
     
       
       
       
       
       
      
       


       



}
