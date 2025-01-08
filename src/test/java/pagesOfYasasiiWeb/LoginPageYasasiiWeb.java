package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;

public class LoginPageYasasiiWeb extends PageFactoryInitYasasiiWeb {
	public LoginPageYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;
		
	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement loginsite;
	
	@FindBy(xpath="//button[@class=\"btn btn-login\"]")
	public WebElement login;
	
	@FindBy(xpath = "//*[@id=\"loginsite\"]/div/span/span")
	public WebElement warningMessage;
	

	
	//public WebElement warningredMessage;
	
	public boolean iswarningPresent() {
		if(warningMessage.isDisplayed())
		return true ;
		else
		return false;
	}

	
	public HomePageYasasiiWeb enterloginDetails(String myusername,String mypassword,String mysite) throws InterruptedException
	{
///////////////Login credentials
		
		
		//Mazimize current window
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		username.clear();
		Thread.sleep(1000);
		username.sendKeys(myusername);
		Thread.sleep(1000);
		password.clear();
		Thread.sleep(1000);
		password.sendKeys(mypassword);
		Thread.sleep(1000);
		loginsite.click();
		Thread.sleep(1000);
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+mysite+"\")]")) );
//		
		driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+mysite+"\")]")).click();
		Thread.sleep(2000);
		login.click();
		Thread.sleep(1000);
		
		return new HomePageYasasiiWeb(driver);
	}
	
    
	
	

}
