package pagesOfYasasiiWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class HomePageYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public HomePageYasasiiWeb(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle pro-pic tab-prof-wrap']")

	WebElement usermenu;

	@FindBy(xpath= "//div[@id='headitemdropdown_desktop']//span[contains(@class,'item-name')][normalize-space()='Logout']")

	WebElement logOut;

	@FindBy(xpath="//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")

	WebElement Okbutton;

	public LoginPageYasasiiWeb clickLogout() throws InterruptedException
	{
		
		
		////////////Loging out script
		
		Thread.sleep(2000);
		usermenu.click();
		Thread.sleep(1000);
		logOut.click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//button[@aria-label='Ok'][normalize-space()='Clear']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//button[@aria-label='Ok'][normalize-space()='Clear']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1000);

		Okbutton.click();

		return new LoginPageYasasiiWeb(driver);

	}
}
