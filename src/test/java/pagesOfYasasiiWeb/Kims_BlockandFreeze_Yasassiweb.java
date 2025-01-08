package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
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

public class Kims_BlockandFreeze_Yasassiweb extends PageFactoryInitYasasiiWeb {

	public Kims_BlockandFreeze_Yasassiweb(WebDriver driver) {
		super(driver);
	} 




	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement menu;

	@FindBy(xpath="//i[@class='ki ki-cog']")
	public WebElement masters;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='Resource']")
	public WebElement resource;

	@FindBy(xpath="//div[contains(text(),'Block/Freeze Schedule')]")
	public WebElement blockandfreeze;

	@FindBy(xpath="//input[@id='resourcecategoryid']")
	public WebElement category;
	@FindBy(xpath="//input[@id='resourcemastername']")
	public WebElement name;
	@FindBy(xpath="//div[@class='form-group ki-dropdown']//input[@id='siteid']")
	public WebElement site;
	@FindBy(xpath="//ki-calendar[@id='fromdate']//input[@type='text']")
	public WebElement fromDate;
	@FindBy(xpath="//ki-calendar[@id='todate']//input[@type='text']")
	public WebElement todate;
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
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement save;
	@FindBy(xpath="//span[normalize-space()='Set']")
	public WebElement set;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-radio-list[1]/label[2]/span[1]")
	public WebElement Freeze;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/ki-time-picker[1]/div[1]/input[1]")
	public WebElement time1;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/ki-dialog-confirm[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement yes;
	@FindBy(xpath="//button[normalize-space()='Ok']")
	public WebElement ok;

	@FindBy(xpath="//label[normalize-space()='Freeze']")
	public WebElement freeeze;

	@FindBy(xpath="//input[@id='holidaycategory']")
	public WebElement SelectCategory;

	@FindBy(xpath="//input[@id='blockorfreeze']")
	public WebElement blockORfreeze;

	@FindBy(xpath="//input[@id='holidayresource']")
	public WebElement SelectResource;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement element;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]/i[1]")
	public WebElement Edit;

	@FindBy(xpath="//i[@class='ki ki-trash']")
	public WebElement delete;

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site1;


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

	@FindBy(xpath="//button[@id='blockscheduleupdateid']")
	public WebElement blockUpdate;

	@FindBy(xpath="//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement RescheduleOK;


	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement Maincategory;

	@FindBy(xpath="//input[@id='subcategory']")
	public WebElement Subcategory;

	@FindBy(xpath="//ki-select-control[@placeholder='Reschedule Reason']//input[@id='undefined']")
	public WebElement REshedulereason;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[2]/div[1]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")
	public WebElement reschedulecalender;

	@FindBy(xpath="//div[@title='Cancel']//i[@class='ki ki-close']")
	public WebElement DeleteApp;

	@FindBy(xpath="//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement DeleteReason;

	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[3]/div[1]/div[1]/button[1]")
	public WebElement cancelApp;

	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[3]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement ReasonREporting;

	@FindBy(xpath="//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-close']")
	public WebElement cLOSEiPApp;

	@FindBy(xpath="//label[@class='check-container m0']//span[@class='checkmark']")
	public WebElement FREESLOT;


	@FindBy(xpath="//i[@class='ki ki-telephone-fill']")
	public WebElement AppSelect;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "//label[normalize-space()='Modules']")
	public WebElement Modules;

	@FindBy(xpath = "//div[normalize-space()='Lookup Master']")
	public WebElement lookupMaster;

	@FindBy(xpath = "//input[@id='reasonType']")
	public WebElement lookuptype;

	@FindBy(xpath = "//input[@id='lookupvalue']")
	public WebElement lookupValue;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save;

	@FindBy(xpath = "//input[@id='reasonlookupid']")
	public WebElement lookupcat;

	@FindBy(xpath = "//input[@placeholder='Search Text']")
	public WebElement Searchlookup;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Editlookup;

	@FindBy(xpath = "//textarea[@id='comments']")
	public WebElement Comments;

	@FindBy(xpath = "//i[@class='ki ki-upload']")
	public WebElement Upload;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement lookupAdd;

	@FindBy(xpath = "//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")
	public WebElement Close;



	public void Block(String User , String Password , String MRNO) throws InterruptedException, AWTException {




		//////////////////Blocking

		Thread.sleep(1000);
		menu.click();
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(600);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", resource);
		Thread.sleep(1000);  
		resource.click();
		Thread.sleep(1000);

		//////Lookup Reason add


		lookupMaster.click();
		Thread.sleep(1000);
		lookuptype.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Appointment Block']")).click();
		Thread.sleep(1000);
		lookupValue.click();
		Thread.sleep(1000);
		lookupValue.sendKeys("Early leaving");
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(2000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade blockoutside in show']")).click();
		Thread.sleep(2000);
		
		
	
		lookupcat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Appointment Block']")).click();
		Thread.sleep(1000);
		Searchlookup.sendKeys("Early leaving" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Early leaving']")).click();
		Thread.sleep(1000);
		Editlookup.click();
		Thread.sleep(1000);
		Comments.clear();
		Thread.sleep(1000);
		Comments.sendKeys("ok");
		Thread.sleep(1000);
		Upload.click();
		Thread.sleep(1000);

		/////////////////////////////block and freeze	



		Thread.sleep(1000);
		menu.click();
		Thread.sleep(1000);
		blockandfreeze.click();
		Thread.sleep(1000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		name.click();
		Thread.sleep(1000);
		System.out.println(ADTprovider+"ProviderID");
		System.out.println(Provider+"Provider");

		name.sendKeys(ADTprovider);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ProviderID+"')])[1]")).click();
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ki-calendar[1]/div[1]/span[1]/i[1]")).click();
		Thread.sleep(1000);
		fromDate.click();
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT); 
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		todate.click();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		Thread.sleep(1000);

		fromtime.click();
		for (int i = 0; i <=5; i++) {
			fromtime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		Thread.sleep(1000);
		fromtime.sendKeys(Keys.HOME + "08 00");
		Thread.sleep(1000);
		totime.click();
		for (int i = 0; i <=5; i++) {
			totime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		totime.sendKeys(Keys.HOME + "08 30");

		reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Early leaving']")).click();
		Thread.sleep(1000);
		remarks.clear();
		Thread.sleep(1000);
		remarks.sendKeys("Absent");
		Thread.sleep(1000);
		save.click();
		Thread.sleep(3000); 



		//// refreshing the tab
		//driver.findElement(By.xpath("//i[@class='ki ki-refresh']")).click();
	//	Thread.sleep(2000);

		/*	driver.navigate().refresh();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		Thread.sleep(1000);   */



		SelectCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		blockORfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Block']")).click();
		Thread.sleep(1000);
		SelectResource.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ProviderID+"')])[1]")).click();
		Thread.sleep(1000);
		//	act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		//delete.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);


		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		System.out.println(Windowsize);


		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);

		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site1.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(1000);


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
		Thread.sleep(1500);

		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri"); 
		}

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchtext']")));
		Thread.sleep(1000);
		/*	driver.findElement(By.xpath("//i[@title='Phone No']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='MRNo/Name']//i[@class='ki ki-user']")).click();  */
		Thread.sleep(1000);
		Search.clear();
		Thread.sleep(1000);
		Search.sendKeys(MRNO);
		Thread.sleep(1000);
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(3000);
		Appointment.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
		Thread.sleep(1000);
		DoctorSearch.clear();
		Thread.sleep(1000);
		DoctorSearch.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[3]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		AppReason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
		Thread.sleep(1000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/ki-input-control[1]/div[1]/input[1]")).clear();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("1");
		//		Thread.sleep(1000);
		AppSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);

		//////////////////////////////

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize1 =driver.getWindowHandles().size();
		int windowopen1= Windowsize1-1;

		driver.switchTo().window(tabs1.get(windowopen1));
		driver.switchTo().window(tabs1.get(windowopen1));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);

		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click(); 
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site1.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(1000);


		Thread.sleep(1000);
		menu.click();
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", resource);
		Thread.sleep(1000);  
		resource.click();
		Thread.sleep(1000);
		blockandfreeze.click();
		Thread.sleep(1000);

		SelectCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		blockORfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Block']")).click();
		Thread.sleep(1000);
		SelectResource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ProviderID+"')])[1]")).click();
		Thread.sleep(1000);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		fromtime.click();
		for (int i = 0; i <=5; i++) {
			fromtime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		fromtime.sendKeys(Keys.HOME + "05 00");
		//delete.click();
		Thread.sleep(1000);
		blockUpdate.click();
		Thread.sleep(1000);
		RescheduleOK.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Ok'][normalize-space()='OK']")).click();
		Thread.sleep(1000);



		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs11 = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize11 =driver.getWindowHandles().size();
		int windowopen11= Windowsize11-1;

		driver.switchTo().window(tabs11.get(windowopen11));
		driver.switchTo().window(tabs11.get(windowopen11));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);

		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site1.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		FO.click();
		Thread.sleep(600);
		Registration.click();


		Thread.sleep(1000);
		List<WebElement> dynamicElement01=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement01.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1500);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchtext']")));
		Thread.sleep(1000);


		//Robot r=new Robot(); 
		//// refreshing the tab
		//		driver.navigate().refresh();
		//		Thread.sleep(2000);
		//		r.keyPress(KeyEvent.VK_ENTER);
		//		Thread.sleep(800);
		//		r.keyRelease(KeyEvent.VK_ENTER);
		//		Thread.sleep(800);
		//		Thread.sleep(1000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='maincategory']")));
		Thread.sleep(3000);
		Maincategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Appointment']")).click();
		Thread.sleep(1000);
		Subcategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Reschedule']")).click();
		Thread.sleep(1000);
		reschedulecalender.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		set.click();
		Thread.sleep(1000);
		Search.clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);



		Thread.sleep(1000);
		List<WebElement> dynamicElement21=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement21.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1500);




		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='"+ADTprovider+"']")));
		Thread.sleep(1000);
		DoctorSearch.clear();
		Thread.sleep(1000);
		DoctorSearch.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[3]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//ki-dialog-common//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		REshedulereason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor on Leave']")).click();
		Thread.sleep(1000);
		ReasonREporting.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
		Thread.sleep(1000);

		AppSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		//// refreshing the tab

		//	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();


		//	driver.navigate().refresh();
		//		Thread.sleep(1000);
		//		r.keyPress(KeyEvent.VK_ENTER);
		//		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		driver.findElement(By.xpath("//i[@id='refresh']")).click();

		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='maincategory']")));

		///////cancel the appointment
		Maincategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Appointment']")).click();
		Thread.sleep(1000);
		Subcategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='All(Pending)']")).click();
		Thread.sleep(1000);
		reschedulecalender.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		set.click();  
		Thread.sleep(1000);
		Search.clear();
		Thread.sleep(1000);
		Search.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Cancel']//i[@class='ki ki-close']")));
		DeleteApp.click();
		Thread.sleep(1000);
		DeleteReason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor on Leave']")).click();
		Thread.sleep(1000);
		cancelApp.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);    




		Thread.sleep(1000);
		menu.click();
		Thread.sleep(1000);
		Modules.click();
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", resource);
		Thread.sleep(1000);  
		resource.click();
		Thread.sleep(1000);
		blockandfreeze.click();
		Thread.sleep(1000);
		SelectCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		blockORfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Block']")).click();
		Thread.sleep(1000);
		SelectResource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ProviderID+"')])[1]")).click();
		Thread.sleep(1000);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);



	}

	public void freeze(String VIP  ) throws InterruptedException, AWTException {

		//////////////////Freezing

//				Thread.sleep(1000);
//				menu.click();
//				Thread.sleep(1000);
//				masters.click();
//				Thread.sleep(1000);
//				JavascriptExecutor js1 = (JavascriptExecutor) driver;
//				js1.executeScript("arguments[0].scrollIntoView();", resource);
//				Thread.sleep(1000);  
//				resource.click();
//				Thread.sleep(1000);
//		
//				blockandfreeze.click();

		///masters
		Thread.sleep(3000);
		freeeze.click();
		Thread.sleep(1000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		name.click();
		Thread.sleep(1000);
		name.sendKeys(ProviderID);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ProviderID+"')])[1]")).click();
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ki-calendar[1]/div[1]/span[1]/i[1]")).click();
		Thread.sleep(1000);
		fromDate.click();
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800); 

		todate.click();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		Thread.sleep(1000);

		fromtime.click();
		for (int i = 0; i <=5; i++) {
			fromtime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		Thread.sleep(1000);
		fromtime.sendKeys(Keys.HOME + "05 00");
		Thread.sleep(1000);
		totime.click();
		for (int i = 0; i <=5; i++) {
			totime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		totime.sendKeys(Keys.HOME + "08 30");
		reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='VIP']")).click();
		Thread.sleep(1000);
		remarks.click();
		Thread.sleep(1000);
		remarks.sendKeys("Absent");
		Thread.sleep(1000);
		save.click();
		Thread.sleep(3000); 


		//////////////


		Thread.sleep(1000);
		menu.click();
		Thread.sleep(1000);
		Modules.click();
		Thread.sleep(1000);
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
		Thread.sleep(1500);

		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchtext']")));
		Thread.sleep(1000);


		/*	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		int n =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("window handles no."+ n);
		int m= n-2;
		Thread.sleep(1000);
		System.out.println("previous Window."+ m);
		Thread.sleep(2000);
		int p  =m+1 ;
		System.out.println("next window."+ p);

		driver.switchTo().window(tabs.get(p));*/

		/////FO  IPblock
		Thread.sleep(2000);
		Maincategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Search']")).click();
		Thread.sleep(1000);
		Search.clear();
		Thread.sleep(1000);
		Search.sendKeys(VIP , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+VIP+"')])[1]")).click();
		Thread.sleep(2000);
		Appointment.click();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
		Thread.sleep(1000);
		DoctorSearch.clear();
		Thread.sleep(1000);
		DoctorSearch.sendKeys(ProviderID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[3]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		AppReason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
		Thread.sleep(1000);
		AppSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		FREESLOT.click();
		Thread.sleep(1000);
		act.moveToElement(AppSelect).click().perform();
		//AppSelect.click();
		Thread.sleep(1000);
		cLOSEiPApp.click();
		Thread.sleep(1000);
		DeleteReason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor on Leave']")).click();
		Thread.sleep(1000);
		cancelApp.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);




		Thread.sleep(1000);
		menu.click();
		Thread.sleep(1000);
		Modules.click();
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", resource);
		Thread.sleep(1000);  
		resource.click();
		Thread.sleep(1000);
		blockandfreeze.click();
		Thread.sleep(1000);

		////masters
		SelectCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		blockORfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Freeze']")).click();
		Thread.sleep(1000);
		SelectResource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ProviderID+"')])[1]")).click();
		Thread.sleep(1000);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);

		////////////Look up reason delete

		lookupAdd.click();
		Thread.sleep(1000);
		lookupcat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Appointment Block']")).click();
		Thread.sleep(1000);
		Searchlookup.sendKeys("Early leaving" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='Early leaving']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		Thread.sleep(3000);
	//	Close.click();
	//	Thread.sleep(3000); 

	}


}
