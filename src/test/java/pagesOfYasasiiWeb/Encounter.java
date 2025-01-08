package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Encounter extends PageFactoryInitYasasiiWeb {

	public Encounter(WebDriver driver) {
		super(driver);
	}
 
	
	
	@FindBy(xpath="//label[@title='Clear']//i[@class='ki ki-close']")
	public WebElement close;
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//label[contains(@class,'check-container zero-label')]")
	public WebElement printuncheck;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	
	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement Searchicon;
	
	
	public void encounter(String provider ,String MRNO) throws InterruptedException {
		
		Thread.sleep(1000);
		EnterPatientName.clear();//input[@id='searchtext']
		Thread.sleep(1000);
		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1000);
		Searchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+provider+"')]")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(2000);
		SAvesuccess.click();
		Thread.sleep(3000);
		
		
		
		
		
		
	}

}
