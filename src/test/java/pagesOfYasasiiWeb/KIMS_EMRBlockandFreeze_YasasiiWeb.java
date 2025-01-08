package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_EMRBlockandFreeze_YasasiiWeb  extends PageFactoryInitYasasiiWeb {

	public KIMS_EMRBlockandFreeze_YasasiiWeb(WebDriver driver) {
		super(driver);
	} 


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[normalize-space()='Master']")
	public WebElement Master;

    @FindBy(xpath = "//div[normalize-space()='Block/Freeze Schedule']")
	public WebElement blockAndFreeze;

	@FindBy(xpath="//input[@id='fromtime']")
	public WebElement fromtime;

	@FindBy(xpath="//body/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-timer[1]/owl-date-time-timer-box[1]/button[1]/span[1]/*[1]")
	public WebElement time;

	@FindBy(xpath="//input[@id='totime']")
	public WebElement totime;

	@FindBy(xpath="//input[@id='reasonid']")
	public WebElement reason;

	@FindBy(xpath="//input[@id='remarks']")
	public WebElement remarks;

	@FindBy(xpath="//i[@class='ki ki-save']")
	public WebElement save;

	@FindBy(xpath="//ki-calendar[@id='fromdate']//input[@type='text']")
	public WebElement fromDate;

	@FindBy(xpath="//ki-calendar[@id='todate']//input[@type='text']")
	public WebElement todate;

	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement MainCategory;

	@FindBy(xpath="//input[@id='searchtext']") 
	public WebElement SearchField;

	@FindBy(xpath="//button[@class='shedule icon']") 
	public WebElement appointment;

	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement Search;

	@FindBy(xpath="//i[@class='ki ki-calendar-fill']")
	public WebElement Appointment;

	@FindBy(xpath="//input[@placeholder='Search Resource..']")
	public WebElement DoctorSearch;

	@FindBy(xpath="//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement AppReason;

	@FindBy(xpath="//button[@id='appointmentsaveid']")
	public WebElement AppSave;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-global-modal-shell[1]/div[2]/div[1]/div[1]/div[2]/app-blockschedule[1]/div[1]/div[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement blockedSchedule;

	@FindBy(xpath="//label[normalize-space()='Freeze']")
	public WebElement freeeze;

	@FindBy(xpath="//label[@class='check-container m0']//span[@class='checkmark']")
	public WebElement freeSlot;

	@FindBy(xpath="//div[@class='pat-details ng-star-inserted']//img[@class='ng-star-inserted']")
	public WebElement AppointmentSlot;

	@FindBy(xpath="//modal-container[@class='modal fade show']//input[@id='undefined']")
	public WebElement CancelReason;
	
	@FindBy(xpath="//i[contains(@class,'ki ki-clear-back')]")
	public WebElement Cancel;

	@FindBy(xpath="//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-close']")
	public WebElement cLOSEiPApp;

	@FindBy(xpath="//i[@class='ki ki-telephone-fill']")
	public WebElement AppSelect;

	@FindBy(xpath="//span[@id='refreshsearch']//i[@class='ki ki-refresh']")
	public WebElement Refresh;

	@FindBy(xpath="//input[@id='holidayresource']")
	public WebElement resource;




	public void EMRblock(String MRNO) throws InterruptedException, AWTException{


		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-sthethescope']")).click();
		Thread.sleep(1000);
		Thread.sleep(500);
    	List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		Thread.sleep(1000);
		
		Master.click(); 
		Thread.sleep(800);
		blockAndFreeze.click();
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
		
		/////Block	

		Thread.sleep(800);
		fromDate.click();
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		todate.click();
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(400);
        r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
    	r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		fromtime.click();
		for (int i = 0; i <=5; i++) {
			fromtime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(800);
		Thread.sleep(800);
		fromtime.sendKeys(Keys.HOME + "05 00");
		Thread.sleep(800);
		totime.click();
		for (int i = 0; i <=5; i++) {
			totime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(800);
		totime.sendKeys(Keys.HOME + "05 30");
		Thread.sleep(800);

		reason.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Leave']")).click();
		Thread.sleep(800);
		remarks.click();
		Thread.sleep(800);
		remarks.sendKeys("Absent");
		Thread.sleep(800);
		save.click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[@id='global_modal_close_button']")).click();
		Thread.sleep(800);

		MainCategory.click();
		Thread.sleep(800); 
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(800);
		SearchField.clear();
		Thread.sleep(800);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();  
		Thread.sleep(5000);
 
		Thread.sleep(500);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		
		
		
	/*	driver.findElement(By.xpath("//i[@class='dashboard-lock-arrow ki ki-chevron-up']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//i[@title='Lock/Unlock']")).click();
		Thread.sleep(2000); */

 
        //Appointment 
		
		appointment.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-arrow-left']")).click();
		Thread.sleep(800);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Search Resource..')]")));
		Thread.sleep(800);

		Thread.sleep(800);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]")));
		Thread.sleep(800);
		DoctorSearch.clear();
		Thread.sleep(800);
		DoctorSearch.sendKeys(Provider); 
		Thread.sleep(800);
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[3]/div[1]/span[1]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		
		Thread.sleep(800);
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);		
		
		AppReason.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
		Thread.sleep(800);
		AppSave.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);

		//Blocked schedule Delete
		Thread.sleep(2000);   
		Hamberger.click();
		Thread.sleep(800);
		blockAndFreeze.click();
		Thread.sleep(800);
        JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Refresh);
		Thread.sleep(800);
		Refresh.click();
		Thread.sleep(3000);
		
		
	/*	resource.click();
    	Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Raina S(raina)']")).click();
		Thread.sleep(800);  */


		blockedSchedule.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();


		//////Freeze

		Thread.sleep(2000);
		freeeze.click();
		Thread.sleep(800);


		Thread.sleep(800);
		fromDate.click();
		
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		todate.click();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		
		
		fromtime.click();
		for (int i = 0; i <=5; i++) {
			fromtime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(800);
		Thread.sleep(800);
		fromtime.sendKeys(Keys.HOME + "05 00");
		Thread.sleep(800);
		totime.click();
		for (int i = 0; i <=5; i++) {
			totime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(800);
		totime.sendKeys(Keys.HOME + "05 30");
		reason.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='VVIP']")).click();
		Thread.sleep(800);
		remarks.click();
		Thread.sleep(800);
		remarks.sendKeys("for vip only");
		Thread.sleep(800);
		save.click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[@id='global_modal_close_button']")).click();
        Thread.sleep(800);
   
        

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-sthethescope']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'EMR HomeScreen')]")).click();
        Thread.sleep(1000);
		
		
//		driver.findElement(By.xpath("//div[@class='v-action-bar']")).click();
//		Thread.sleep(2000);
		
		
		MainCategory.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[contains(text(),'IP')]")).click();
		Thread.sleep(800);
		SearchField.clear();
		Thread.sleep(800);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);

		appointment.click();
		Thread.sleep(800);	
		driver.findElement(By.xpath("//i[@class='ki ki-arrow-left']")).click();		
		Thread.sleep(800);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Search Resource..')]")));
		Thread.sleep(800);
		DoctorSearch.clear();
		Thread.sleep(800);
		DoctorSearch.sendKeys(Provider);
		Thread.sleep(800);
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[3]/div[1]/span[1]")).click();
		Thread.sleep(800);
		freeSlot.click();
		Thread.sleep(800);
		AppointmentSlot.click(); 


		////App Closing
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@title='Cancel']")).click();
		Thread.sleep(800);
		CancelReason.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor on Leave']")).click();
		Thread.sleep(1200);
		Cancel.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();


		Thread.sleep(800);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(800);
		List<WebElement> dynamicElement2=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement2.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);		
		
		AppReason.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Follow-Up']")).click();
		Thread.sleep(800);
		AppSave.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		act.moveToElement(AppSelect).click().perform();
		//AppSelect.click();
		Thread.sleep(800); 
		cLOSEiPApp.click();
		Thread.sleep(800);
		
		//driver.findElement(By.xpath("//modal-container[@class='modal fade show']//button[@type='button'][normalize-space()='Cancel']")).click();
		Thread.sleep(1200);
		//driver.findElement(By.xpath("//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")).click();
		CancelReason.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor on Leave']")).click();
		Thread.sleep(800);
		//Cancel.click();
		driver.findElement(By.xpath("//modal-container[@class='modal fade show']//button[@type='button'][normalize-space()='Cancel']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(800);

		//freezed schedule Delete

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(800);
		Master.click(); 
		Thread.sleep(800);		
		blockAndFreeze.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='blockorfreeze']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Freeze']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-global-modal-shell[1]/div[2]/div[1]/div[1]/div[2]/app-blockschedule[1]/div[1]/div[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='global_modal_close_button']")).click();
		Thread.sleep(800);
		
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		

	}


}
