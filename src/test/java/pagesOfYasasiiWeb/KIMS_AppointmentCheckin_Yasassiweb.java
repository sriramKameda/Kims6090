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

public class KIMS_AppointmentCheckin_Yasassiweb  extends PageFactoryInitYasasiiWeb {

	public KIMS_AppointmentCheckin_Yasassiweb(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
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

	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
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

	@FindBy(xpath = "//div[@class='item-icon']//i[@class='ki ki-reception-fill']")
	public WebElement Billing;

	@FindBy(xpath = "//i[@class='ki ki-print']")
	public WebElement AppPrint;

	@FindBy(xpath = "//button[normalize-space()='Check-In']")
	public WebElement CheckIn;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement BillPrintUncheck;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncSave;


	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement EncSaveSuccess;

	@FindBy(xpath = "//label[normalize-space()='Repeat']//span[@class='checkmark']")
	public WebElement Repeat;

	@FindBy(xpath = "//input[@id='daycount']")
	public WebElement EveryDAy;

	@FindBy(xpath = "//input[@id='repeatCount']")
	public WebElement endAfter;

	@FindBy(xpath = "//button[@id='repaeatappointmentbuttonid']")
	public WebElement Continue;

	@FindBy(xpath = "//i[@class='ki ki-calendar-check-fill']")
	public WebElement upcomingAppointments;

	@FindBy(xpath = "//div[@class='asideright-container ng-star-inserted']//div[2]//div[1]//div[1]//div[1]//img[1]")
	public WebElement patientheadIcon;

	@FindBy(xpath = "//input[@id='cancelRemark']")
	public WebElement appCancelremarks;

	@FindBy(xpath = "//i[@class='ki ki-medical-kit']")
	public WebElement Encounterbill;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement AddNewOrder;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement ServiceName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement ServiceAdd;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement ServiceSave;

	@FindBy(xpath = "//i[@class='ki ki-cash-transfer-fill']")
	public WebElement AvailedServices;

	@FindBy(xpath = "//i[@class='ki ki-search text-white']")
	public WebElement AvailedSearch;

	@FindBy(xpath = "//span[normalize-space()='Service View']")
	public WebElement ServiceView;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]")
	public WebElement consultation;

	@FindBy(xpath = "//tab[@id='2']//i[@class='ki ki-info-circle-fill ng-star-inserted']")
	public WebElement Taxview;

	@FindBy(xpath = "//div[@class='col-md-6 pl0']//i[@title='Adjustment Log']")
	public WebElement AdjustmentView;

	@FindBy(xpath = "//label[normalize-space()='Daily']")
	public WebElement daily;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;	

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Slot;	

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement MainCategory;

	@FindBy(xpath = "//input[@id='subcategory']")
	public WebElement Subcategory;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;

	//	@FindBy(xpath = "//div[contains(text(),'Billing')]")
	//	public WebElement Billing;







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
		driver.findElement(By.xpath("//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")).click();
		Thread.sleep(500);
		

//		Robot t=new Robot();
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(500);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(500);

		EnterAge.sendKeys(Dob);
//		Thread.sleep(600);
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(500);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(500);


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

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",emergencyContact );
		
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
	//	JavascriptExecutor js= (JavascriptExecutor) driver;
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
		
		
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']")));
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
			Thread.sleep(1600);
		
		

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);


		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(2);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000); 

	}


	public void Appointment(String Provider,String service ,String MRNo) throws AWTException, InterruptedException {


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
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//td[@class='app-booking-bar ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		ReportingStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
		Thread.sleep(1000);
		Slot.clear();
		Thread.sleep(1000);
		Slot.sendKeys("1");
		Thread.sleep(1000);
		AppRemarks.click();
		Thread.sleep(1000);
		AppRemarks.sendKeys("Regular checkup");
		Thread.sleep(1000);
		AppSave.click();
		Thread.sleep(2000);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='OK']")));
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(3000);  
		driver.findElement(By.xpath("//label[@title='Schedule View']")).click();
		Thread.sleep(3000);



		////billing

		Billing.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-print']")));
		//Thread.sleep(2000);
		AppPrint.click();
		Thread.sleep(2500);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);  

		Thread.sleep(1000);
		CheckIn.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		//BillPrintUncheck.click();
		//Thread.sleep(1000);
		EncSave.click();
				
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")));
		Thread.sleep(2000);
		EncSaveSuccess.click();
		Thread.sleep(1000);


		/////upcoming Appointment

		Appointment.click(); 
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
		Thread.sleep(2000);
		SearchResoaurce.click();
		Thread.sleep(1000);
		SearchResoaurce.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[3]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//td[@class='app-booking-bar ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		Repeat.click();
		Thread.sleep(1000);
		daily.click();
		Thread.sleep(1000);
		EveryDAy.click();
		Thread.sleep(1000);
		EveryDAy.sendKeys("2");
		Thread.sleep(1000);
		endAfter.click();
		Thread.sleep(1000);
		endAfter.sendKeys("5");
		Thread.sleep(1000);
		ReportingStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
		Thread.sleep(1000);
		AppRemarks.click();
		Thread.sleep(1000);
		AppRemarks.sendKeys("Regular checkup");
		Thread.sleep(1000);
		Continue.click();


		////Cancelling last occurances
		Thread.sleep(2500);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[5]/div[2]/i[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[2]/i[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[2]/i[1]")).click();
		Thread.sleep(1000);

		AppSave.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='OK']")));
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Billing.click();
		Thread.sleep(2000);
		upcomingAppointments.click();

		//print app
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='ki ki-print'])[1]")).click();
		Thread.sleep(10000);
		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);  


		//resourceIcon
		driver.findElement(By.xpath("(//i[@title='Appointment Details'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//modal-container[@class='modal fade show']//span[@class='btn btn-link ng-star-inserted'][normalize-space()='Resource Details']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);

		act.moveToElement(patientheadIcon).click().build().perform();
		Thread.sleep(2000);
		///delete App
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-upcoming-appt[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[2]/div[1]/label[1]/i[1]")).click();
		Thread.sleep(1000);
		appCancelremarks.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor on Leave']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		Billing.click();

		//		
		//		,
		//		Thread.sleep(1000);
		//		Encounterbill.click();
		Thread.sleep(2000);
		Service.click();
		Thread.sleep(1000);
		//printUncheck

		//driver.findElement(By.xpath("//label[@class='check-container zero-label']")).click();
		//Thread.sleep(1000);
		AddNewOrder.click();
		Thread.sleep(1000);
		ServiceName.click();
		Thread.sleep(1000);
		ServiceName.sendKeys(service);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'"+service+"')]")).click();
		Thread.sleep(1000);
		ServiceAdd.click();
		Thread.sleep(1000);

		ServiceSave.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		AvailedServices.click();
		Thread.sleep(1000);
		//  AvailedSearch.click();
		Thread.sleep(2000);
		ServiceView.click();
		Thread.sleep(2000);
		AvailedSearch.click();
		Thread.sleep(1000);
		consultation.click();
		Thread.sleep(1000);
		//  act.moveToElement(Taxview).build().perform();
		//	  Thread.sleep(1000);
		AdjustmentView.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Close'][normalize-space()='Close']//i[@class='ki ki-close-circle']")).click();
		Thread.sleep(1000);

	}

}








