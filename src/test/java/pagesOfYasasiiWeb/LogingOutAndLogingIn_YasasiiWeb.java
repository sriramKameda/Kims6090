package pagesOfYasasiiWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class LogingOutAndLogingIn_YasasiiWeb extends PageFactoryInitYasasiiWeb{
	
	public LogingOutAndLogingIn_YasasiiWeb(WebDriver driver) {

		super(driver);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']")
	public WebElement downarrow;
	
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[contains(@class,'item-name')][normalize-space()='Logout']")
	public WebElement logout;
		
	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement yes;
	
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement enteruserid;	
		
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement enterpassword;
	
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	
	@FindBy(xpath = "//button[@id='login_spinner']")
	public WebElement login;
		
	
	
	//////////////excel sheet name----loginout
	
	
	public void action(String id, String password,String Site) throws InterruptedException
	{
//////////loging out
		Thread.sleep(3000);
		downarrow.click();//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']
		Thread.sleep(800);
		logout.click();
		Thread.sleep(800);
		yes.click();
		Thread.sleep(1500);
///////////login
		enteruserid.sendKeys(id);
		enterpassword.sendKeys(password);
		Thread.sleep(800);
		site.click();
		Thread.sleep(800);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(800);
		login.click();
		Thread.sleep(800);
	}

}
