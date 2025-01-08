package pagesOfYasasiiWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EncounterPreCondition_yasassiweb  extends PageFactoryInitYasasiiWeb {

	public EncounterPreCondition_yasassiweb(WebDriver driver) {
		super(driver);
	}
	
	
	

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	
	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement Searchicon;
	
	
public void FO() throws InterruptedException	{
	

	Thread.sleep(1000);
	Hamberger.click();
	Thread.sleep(600);
	FO.click();
	Thread.sleep(600);

	List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

	if(dynamicElement1.size() !=0)
	{
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	}


	else {
		System.out.println("sri");
	}
	Thread.sleep(600);



	Registration.click();

	Thread.sleep(1000);
	List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

	if(dynamicElement.size() !=0)
	{
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	}


	else {
		System.out.println("sri");
	}

	
	
	
	
	
}

}
