package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
import com.w2a.utilities.RandomString;

public class KIMS_AppointmentFuture_Yasasiiweb extends PageFactoryInitYasasiiWeb{
	public KIMS_AppointmentFuture_Yasasiiweb(WebDriver driver) {
		super(driver);

	}



	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;

	@FindBy(xpath = "//div[@class='module-icon-wrap active ng-star-inserted']//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//li[normalize-space()='Miss']")
	public WebElement SelectMr;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement EnterFirstNME;

	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement EnterAge;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement EnterMob;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement EnterOrganisationLetter;

	@FindBy(xpath = "//li[contains(text(),'Others')]")
	public WebElement SelectOrganisation;

	@FindBy(xpath = "//span[contains(text(),'Contact Information')]")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement EnterAddress;

	@FindBy(xpath = "//span[contains(text(),'Document Identification')]")
	public WebElement DocumentIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement EnterAadhar;

	@FindBy(xpath = "//i[@title='Add']")
	public WebElement Clickadd;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement HowDidYouKnow;

	@FindBy(xpath = "//label[normalize-space()='TV']//span[@class='checkmark']")
	public WebElement TV;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement Ok;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement Save;

	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement OK;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement nationality;

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	


	@FindBy(xpath = "//i[@class='ki ki-calendar-fill']")
	public WebElement Appointment;

	@FindBy(xpath = "//input[@placeholder='Search Resource..']")
	public WebElement SearchResoaurce;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement ReportingStatus;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement AppRemarks;

	@FindBy(xpath = "//button[@id='appointmentsaveid']")
	public WebElement AppSave;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;	

	@FindBy(xpath = "//input[@id='daycount']")
	public WebElement every;	

	@FindBy(xpath = "//label[normalize-space()='Repeat']//span[@class='checkmark']")
	public WebElement Repeat;	

	@FindBy(xpath = "//input[@id='repeatCount']")
	public WebElement EndAfter;	

	@FindBy(xpath = "//button[@id='repaeatappointmentbuttonid']")
	public WebElement Continue;	

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save1;	

	@FindBy(xpath = "//button[normalize-space()='OK']//i[@class='ki ki-check']")
	public WebElement Ok1;	

	@FindBy(xpath = "//label[@title='Week']")
	public WebElement Weekview;	

	@FindBy(xpath = "//i[@class='ki ki-chevron-right']")
	public WebElement Right;	

	@FindBy(xpath = "//i[@class='ki ki-chevron-left']")
	public WebElement Left;	

	@FindBy(xpath = "//i[@class='fa fa-calendar']")
	public WebElement Calendar;	

	@FindBy(xpath = "//label[@class='btn-date-current']")
	public WebElement Today;	

	@FindBy(xpath = "//i[@class='ki ki-upload']")
	public WebElement Update;	

	@FindBy(xpath = "//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement Reason;	

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	public WebElement Cancel;	

	@FindBy(xpath = "//i[@class='ki ki-filter-list']")
	public WebElement ResourceFilter;	

	@FindBy(xpath = "//input[@id='providerSearchDb']")
	public WebElement ProviderSearch;	

	@FindBy(xpath ="(//i[@class='ki ki-chevron-down'])[2]")
	public WebElement DownArrow;	

	@FindBy(xpath ="//i[@title='Expand All Card']")
	public WebElement ExpandAllCard;	

	@FindBy(xpath ="//i[@title='Collapse All Card']")
	public WebElement CollapseAllCard;	

	@FindBy(xpath ="//input[@id='maincategory']")
	public WebElement MainCategory;	

	@FindBy(xpath ="//div[@class='form-group zero-bottom ng-star-inserted']//input[@class='form-control ng-untouched ng-pristine ng-valid ng-star-inserted']")
	public WebElement Daterange;	

	@FindBy(xpath ="(//i[@class='ki ki-info-circle-fill'])[1]")
	public WebElement StatusIcon;	

	@FindBy(xpath ="//input[@id='status']")
	public WebElement Status;	

	@FindBy(xpath ="//button[@class='btn btn-primary sm active ng-star-inserted']//i[@class='ki ki-save']")
	public WebElement save;	

	@FindBy(xpath ="//i[@title='Delete']")
	public WebElement Delete;	

	@FindBy(xpath ="//div[@class='form-group ng-star-inserted']//textarea[@id='remarks']")
	public WebElement Remarks;	

	@FindBy(xpath ="//i[@title='Edit']")
	public WebElement Edit;	

	@FindBy(xpath ="//button[@type='button']//i[@class='ki ki-upload']")
	public WebElement Update1;	

	@FindBy(xpath ="//button[@class='btn btn-danger sm clear ng-star-inserted']")
	public WebElement clear;	

	@FindBy(xpath ="//button[normalize-space()='Close']")
	public WebElement close;	

	@FindBy(xpath ="//span[normalize-space()='Log']")
	public WebElement Log;	

	@FindBy(xpath ="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Slot;	


	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;








	public void patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo) throws InterruptedException, AWTException, IOException {

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
		Thread.sleep(1000);
		Registration.click();
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


		Title.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+title+"']")).click();
		Thread.sleep(500);
		EnterFirstNME.sendKeys(Name);
		Thread.sleep(500);
		String lastName =RandomString.lastName();
			
	    System.out.println(lastName + "LastName" );
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastName);
		Thread.sleep(500);

		EnterAge.click();
		Thread.sleep(500);


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		EnterAge.sendKeys(Dob);
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);


		Thread.sleep(600);
		EnterMob.sendKeys(MobNo);
		Thread.sleep(500);
		maritialStatus.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Single']")).click();
		Thread.sleep(500);

		ContactInformation.click();
		Thread.sleep(1000);
		EnterAddress.sendKeys(Address);
		Thread.sleep(1000);
		DocumentIdentification.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		String DOCID = RandomString.DOCID();
			
		EnterAadhar.sendKeys(DOCID );
		Thread.sleep(600);
		Clickadd.click();
		Thread.sleep(800);

		
		Thread.sleep(600);
		emergencyContact.click();
		Thread.sleep(600);
		Type.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Emergency Contact']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='guarantorfirstname']")).sendKeys("SRI");
		Thread.sleep(600);
                ERmob.sendKeys("9845123658");
		Thread.sleep(600);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Add1 );
		Add1.click();
		Thread.sleep(600);
		
		
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement1.size());
		if(dynamicElement1.size() ==0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}

		HowDidYouKnow.click();
		Thread.sleep(600);
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		Save.click();
		Thread.sleep(3000);

		  List<WebElement> dynamicElement11=driver.findElements(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']"));

			System.out.println(dynamicElement11.size());
			if(dynamicElement11.size() !=0)
			{
				driver.findElement(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']")).click();
				Thread.sleep(600);
				driver.findElement(By.xpath("//button[@id='consentsave']//i[@class='ki ki-save']")).click();
				Thread.sleep(600);
				driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
				Thread.sleep(600);
				driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
				Thread.sleep(1600);

	}
		
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);


		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(5);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000); 

	}


	public void Appointment(String Provider , String MRNo) throws AWTException, InterruptedException {


		Appointment.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
		Thread.sleep(2000);


		SearchResoaurce.click();
		Thread.sleep(1000);
		SearchResoaurce.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-3-0 ng-star-inserted']//div[@class='appointment-info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-3-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		Repeat.click();
		Thread.sleep(1000);


		every.sendKeys("1");
		Thread.sleep(1000);
		EndAfter.click();
		Thread.sleep(1000);
		EndAfter.sendKeys("4");
		Thread.sleep(1000);		
		ReportingStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
		Thread.sleep(1000);

		Slot.clear();
		Thread.sleep(600);
		Slot.sendKeys("1");
		Thread.sleep(600);

		AppRemarks.click();
		Thread.sleep(1000);
		AppRemarks.sendKeys("Regular checkup");
		Thread.sleep(1000);


		Continue.click();
		Thread.sleep(1000);
		Save1.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")));
		Thread.sleep(500);
		Ok1.click();
		Thread.sleep(3000);  
		Weekview.click();
		Thread.sleep(3000);    

		Right.click();
		Thread.sleep(3000);
		Left.click();
		Thread.sleep(3000);

		Calendar.click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_DOWN);
		t.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		Today.click();
		Thread.sleep(3000);

		ResourceFilter.click();
		Thread.sleep(2000);
		ProviderSearch.click();
		Thread.sleep(1000);
		ProviderSearch.sendKeys(Provider ,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='bg-overlay']")).click();
		Thread.sleep(2000);
		DownArrow.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='custom-list-item active ng-star-inserted']")).click();
		Thread.sleep(2000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//div[text()='"+MRNo+"']")));
		Thread.sleep(1000);



		//		js.executeScript("window.scrollBy(0,-250)", "");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//div[text()='"+MRNo+"']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("(//i[@class='ki ki-pencil'])[1]")).click();
		//		Thread.sleep(1000);
		//		
		//		AppRemarks.clear();
		//		Thread.sleep(1000);
		//		AppRemarks.sendKeys("OK");
		//		Thread.sleep(1000);
		//		Update.click();
		//		Thread.sleep(1000);
		//		Ok1.click();
		//		Thread.sleep(1000);
		//		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//div[text()='"+MRNo+"']")));
		//		Thread.sleep(1000);
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//div[text()='"+MRNo+"']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("(//i[@class='ki ki-close'])[1]")).click();
		//		Thread.sleep(1000);
		//		Reason.click();
		//		Thread.sleep(1000);
		//		
		//		
		//		Cancel.click();
		//		Thread.sleep(1000);
		//		Ok1.click();
		//		Thread.sleep(1000);
		//		ResourceFilter.click();
		//		Thread.sleep(2000);
		//		ProviderSearch.click();
		//		Thread.sleep(1000);
		//		ProviderSearch.sendKeys(Provider ,Keys.ENTER);
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
		//		Thread.sleep(2000);
		//		
		//		driver.findElement(By.xpath("//div[@class='bg-overlay']")).click();
		//		Thread.sleep(2000);
		//		DownArrow.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//div[@class='custom-list-item active ng-star-inserted']")).click();
		//		Thread.sleep(2000);
		ExpandAllCard.click();
		Thread.sleep(1000);
		CollapseAllCard.click();
		Thread.sleep(2000);



	}

	public void AppointmentStatus() throws InterruptedException, AWTException {

		Thread.sleep(700);
		MainCategory.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Appointment']")).click();
		Thread.sleep(700);
		Daterange.click();
		Thread.sleep(700);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_UP);
		t.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_DOWN);
		t.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(700);
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(1000);

		WebElement patient = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]"));
		Thread.sleep(1500);

		act.moveToElement(patient).click().build().perform();
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
		StatusIcon.click();
		Thread.sleep(700);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);

		Status.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='No Show']")).click();
		Thread.sleep(700);
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys("Remarks");
		Thread.sleep(700);
		save.click();
		Thread.sleep(1200);
		Edit.click();
		Thread.sleep(700);
		Update1.click();
		Thread.sleep(700);

		Edit.click();
		Thread.sleep(700);
		clear.click();

		Thread.sleep(1200);
		Delete.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1700);

		Log.click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//button[normalize-space()='Close']")));
		Thread.sleep(2000);
		close.click();
		Thread.sleep(700);






	}










}