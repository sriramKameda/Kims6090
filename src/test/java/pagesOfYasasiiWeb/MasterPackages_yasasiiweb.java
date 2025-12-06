package pagesOfYasasiiWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

public class MasterPackages_yasasiiweb extends  TestBaseYasasiiWeb{
	
	public MasterPackages_yasasiiweb(WebDriver driver) {
		super();

	} 

	@FindBy(xpath = "/html/body/app-root/app-layout/app-header/header/nav/div[2]/div[1]/ul/li[1]/a/label/div/div[3]")
	public WebElement Hamburger;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	
	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement Firstname;
	
	
	
	public void REgistration() throws InterruptedException {
		
		
		Hamburger.click();
		Thread.sleep(1000);
		Registration.click();
		Firstname.sendKeys("Yousuf");
		
		
	}
	
	

}

