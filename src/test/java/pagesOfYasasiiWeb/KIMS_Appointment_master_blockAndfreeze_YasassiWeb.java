package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_Appointment_master_blockAndfreeze_YasassiWeb extends PageFactoryInitYasasiiWeb {

	public KIMS_Appointment_master_blockAndfreeze_YasassiWeb(WebDriver driver) {
		super(driver);
	} 



	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement menu;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='Appointment']")
	public WebElement Appointment;

	@FindBy(xpath = "//input[@placeholder='Search Resource..']")
	public WebElement Searchresource;

	@FindBy(xpath = "//div[@title='Radhakrishnan Marimuthu(NGL18286)']")
	public WebElement provider;

	@FindBy(xpath = "//label[@title='Block/Freeze Schedule']//i[@class='ki ki-cog']")
	public WebElement blockfreeze;

	@FindBy(xpath = "//input[@id='fromtime']")
	public WebElement FromTym;

	@FindBy(xpath = "//input[@id='totime']")
	public WebElement Totym;

	@FindBy(xpath = "//ki-calendar[@id='todate']//input[@type='text']")
	public WebElement ToDate;

	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Reason;

	@FindBy(xpath = "//button[@id='blockschedulesaveid']")
	public WebElement blockSave;

	@FindBy(xpath = "//ki-calendar[@id='fromdate']//input[@type='text']")
	public WebElement FromDate;

	@FindBy(xpath = "//span[@id='refreshsearch']//i[@class='ki ki-refresh']")
	public WebElement BottomRefresh;

	@FindBy(xpath = "//input[@id='remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//button[@id='blockscheduleupdateid']")
	public WebElement BlockUpdate;

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement Delete;

	@FindBy(xpath = "//label[normalize-space()='Freeze']")
	public WebElement Freeze;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//tr[@class='row-0-0 ng-star-inserted']//td[@title='VIP']")
	public WebElement FreezedSlot;

	@FindBy(xpath = "//input[@id='blockorfreeze']")
	public WebElement blockandfreeze;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement PAS;





	public void App() throws InterruptedException, AWTException{
		Thread.sleep(2000);	
		menu.click();
		Thread.sleep(1000);
		PAS.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);


		Appointment.click();

		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri"); 
		}

		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-appointment-landing[1]/div[1]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));

		Thread.sleep(1000);
		Searchresource.clear();
		Thread.sleep(500);
		Searchresource.sendKeys("Radhakrishnan Marimuthu(NGL18286)");
		Thread.sleep(2000);	
		
		WebElement Provider= driver.findElement(By.xpath("//div[@title='Radhakrishnan Marimuthu(NGL18286)']"));
		
		act.moveToElement(Provider).build().perform();
		Thread.sleep(1000);
		blockfreeze.click();
		Thread.sleep(1000);
		FromTym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			FromTym.sendKeys( Keys.BACK_SPACE);
		} 
		Thread.sleep(1000);
		FromTym.sendKeys("00 00");
		Thread.sleep(1000);

		Totym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			Totym.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		Totym.sendKeys("23 45");
		Thread.sleep(1000);

		FromDate.click();
		Thread.sleep(1000);


		Robot r=new Robot(); 

		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		ToDate.click();
		Thread.sleep(1000);

		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		Reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/app-blockschedule/div/div[2]/form/div[1]/div/div/div/div/div[5]/div[1]/ul/app-list-item[1]/li")).click();
		Thread.sleep(1000);
		blockSave.click();
		Thread.sleep(3000);  

		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		Thread.sleep(1000);
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("/html[1]/body[1]/modal-container[2]/div[1]/div[1]/ki-dialog-common[1]/div[1]/div[2]/div[2]/button[1]"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("/html[1]/body[1]/modal-container[2]/div[1]/div[1]/ki-dialog-common[1]/div[1]/div[2]/div[2]/button[1]")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		
	
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(BottomRefresh));
	
		for (int i = 0; i < 3; i++) {
			BottomRefresh.click();
			Thread.sleep(500);
		}
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='result-name ng-star-inserted'])[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='result-name ng-star-inserted'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("personal reason");
		Thread.sleep(1000);
		BlockUpdate.click();
		Thread.sleep(2000);
		BottomRefresh.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-blockschedule[1]/div[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);


		///////////////Freeze

		Thread.sleep(1000);
		Freeze.click();
		Thread.sleep(1000);
		FromTym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {

			FromTym.sendKeys( Keys.BACK_SPACE);

		}
		Thread.sleep(1000);
		FromTym.sendKeys("00 00");
		Thread.sleep(1000);

		Totym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			Totym.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		Totym.sendKeys("09 00");

		FromDate.click();
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		Thread.sleep(1000);


		ToDate.click();

		Thread.sleep(1000);
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		Reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='VIP']")).click();
		Thread.sleep(1000);
		blockSave.click();
		Thread.sleep(3000);
		Close.click();
		Thread.sleep(1000);

		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

		Thread.sleep(2000);
		Searchresource.clear();
		Thread.sleep(500);
		Searchresource.sendKeys("Radhakrishnan Marimuthu(NGL18286)");
		Thread.sleep(2000);	


		/////nextdaySlot
		driver.findElement(By.xpath("(//div[@class='slot-wrapper free-slot'])[2]")).click();
		Thread.sleep(1000);
		FreezedSlot.click();
		act.moveToElement(FreezedSlot).build().perform();
		Thread.sleep(1000);
		act.moveToElement(provider).build().perform();
		Thread.sleep(1000);
		blockfreeze.click();
		Thread.sleep(1000);

		blockandfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Freeze']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-blockschedule[1]/div[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Delete.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);

		Close.click();
		Thread.sleep(1000);


	}


}







