package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
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

import junit.framework.Assert;

public class KIMS_MedicineAdmin_VisitSummary_YasasiWeb extends PageFactoryInitYasasiiWeb{

	public KIMS_MedicineAdmin_VisitSummary_YasasiWeb(WebDriver driver) {

		super(driver);

	}


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;
	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Title;
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

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printUnckeck;	

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	


	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;


	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement disgnosis;

	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEpharm;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement MedicineSearch;

	@FindBy(xpath = "//label[normalize-space()='G91.2 (Idiopathic) normal pressure hydrocephalus']//span[@class='checkmark']")
	public WebElement diagnosischevckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[11]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement diagnosischevckbox1;

	@FindBy(xpath = "//label[contains(@class,'check-container ng-star-inserted')]//span[contains(@class,'checkmark')]")
	public WebElement inclinicadmin;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement medicineAdd;	

	@FindBy(xpath = "//label[normalize-space()='No Current Medication']//span[@class='checkmark']")
	public WebElement NoCurrentmed;

	@FindBy(xpath = "//label[@class='check-container no-label']//span[@class='checkmark']")
	public WebElement NoCurrentmedCheck;

	@FindBy(xpath = "//i[@class='ki ki-admission-reconciliation']")
	public WebElement AdmsnReconcile;

	@FindBy(xpath = "//i[@class='ki ki-reconciliation']")
	public WebElement Reconsile;

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EmrSave;


	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//div[contains(text(),'ADT Info')]")
	public WebElement ADT;

	@FindBy(xpath = "//input[@id='admittype']")
	public WebElement AdmissionType;

	@FindBy(xpath = "//input[@id='admittedproviderdisplayname']")
	public WebElement providername;

	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;

	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement BedCategory;

	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAve;

	@FindBy(xpath = "//input[@id='prescriptiontypeid']")
	public WebElement prescriptionType;

	@FindBy(xpath = "//i[@class='ki ki-discharge-reconciliation']")
	public WebElement DischargeReconcile;

	@FindBy(xpath = "//i[@class='fa fa-print print-size']")
	public WebElement PrescriptionPrintDN;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Plan']")
	public WebElement Plan;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement PlanText;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-emr-homescreen-shell[1]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]")
	public WebElement EnteredNote;

	@FindBy(xpath = "//i[@class='fa fa-pencil']")
	public WebElement Editnote;

	@FindBy(xpath = "//i[@class='ki ki-file-log']")
	public WebElement Log;

	@FindBy(xpath = "//i[@class='ki ki-user-computer']")
	public WebElement CpoeView;

	@FindBy(xpath = "//span[normalize-space()='Medicine']")
	public WebElement Medicine;

	@FindBy(xpath = "//i[contains(@title,'Prescription Print')]")
	public WebElement cpoePrescriptionPrint;

	@FindBy(xpath = "//label[contains(text(),'CPOE Service')]")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeServiceSearch;

	@FindBy(xpath = "//input[@id='cpoeSearchDb']")
	public WebElement CpoeServiceSearch1;

	@FindBy(xpath = "//label[@id='emrdashboardpatient_cpoeadministration']//label[contains(@class,'icon cpoeadmin')]")
	public WebElement CpoeAdministration;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[1]")
	public WebElement AdminIcon;

	@FindBy(xpath = "//textarea[@id='Remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Plus;

	@FindBy(xpath = "//label[@title='Admin Info']//i[@class='ki ki-info-circle']")
	public WebElement AdminInfo;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save1;

	@FindBy(xpath = "//label[normalize-space()='Range']//span[@class='checkmark']")
	public WebElement Range;

	@FindBy(xpath = "//label[normalize-space()='Service Administration']")
	public WebElement Serviceadmin;

	@FindBy(xpath = "//label[normalize-space()='Medicine Administration']")
	public WebElement MedicineAdministration;

	@FindBy(xpath = "//div[@class='sar-table-list ng-star-inserted']//div[1]//div[5]//label[1]//i[1]")
	public WebElement serviceadmin1;

	@FindBy(xpath = "//input[@id='adminstatus']")
	public WebElement AdminStatus;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[5]/label[1]/i[1]")
	public WebElement serviceadmin2;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[8]/label[1]/i[1]")
	public WebElement orderdetails;

	@FindBy(xpath = "//span[contains(@class,'btn btn-danger sm clear')]")
	public WebElement Close;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[8]/label[2]/i[1]")
	public WebElement ServiceDetails;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[8]/label[3]/i[1]")
	public WebElement log;

	@FindBy(xpath = "//input[contains(@placeholder,'Status')]")
	public WebElement Status;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='duration']")
	public WebElement duration;

	@FindBy(xpath = "//i[contains(@title,'Reset')]")
	public WebElement Reset;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[normalize-space()='Group Note']")
	public WebElement GroupNote;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement HomeScreen;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-duplicate-medicine-confirmation[1]/div[2]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement OverRidereason;

	@FindBy(xpath = "//input[@id='verifiedbyname']")
	public WebElement VerifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement Passsword;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/label[5]/i[1]")
	public WebElement Homedose;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-homedose[1]/div[2]/div[1]/div[1]/div[2]/ki-calender-time[1]/div[1]/input[1]")
	public WebElement Todate;

	@FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-star-inserted ng-invalid']")
	public WebElement Fromdate;

	@FindBy(xpath = "//input[@id='receviedby']")
	public WebElement RecievedBy;

	@FindBy(xpath = "//button[normalize-space()='Signature']")
	public WebElement Signature;

	@FindBy(xpath = "(//div[@title='Home Dose']//i[@class='ki-user-drug ki'])[1]")
	public WebElement HomedoseAdmin;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement ServiceRemarks;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;	

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement OrderingReason;	

	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement justification;	

	@FindBy(xpath = "//span[normalize-space()='Report']")
	public WebElement Report;

	@FindBy(xpath = "//label[@class='icon refresh']")
	public WebElement Refresh;

	@FindBy(xpath = "//div[normalize-space()='Others']")
	public WebElement others;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;

	@FindBy(xpath = "//li[contains(text(),'Thomas')]")
	public WebElement SelectProviderName; 

	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPriority;

	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement SelectBedCategory;

	@FindBy(xpath = "//div[@class='module-icon-wrap ng-star-inserted']//i[@class='ki ki-file']")
	public WebElement MISReports;	

	@FindBy(xpath = "//div[normalize-space()='Reports']")
	public WebElement Reports;	

	@FindBy(xpath = "//span[normalize-space()='EMR']")
	public WebElement EMR;	

	@FindBy(xpath = "//span[normalize-space()='Adjustment Audit']")
	public WebElement ADjAudit;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement UnbilledCPOE;

	@FindBy(xpath = "//button[@id='misreportfetch']")
	public WebElement MISSearch;	

	@FindBy(xpath = "//input[@aria-label='Zoom']")
	public WebElement zoom;

	@FindBy(xpath = "//div[@class='dxrd-image-padding dxrd-image-search']//*[name()='svg']")
	public WebElement SearchInReports;

	@FindBy(xpath = "//input[@title='Search']")
	public WebElement Searchtext;

	@FindBy(xpath = "(//label[@class='vi-info-label ng-star-inserted'])[2]")
	public WebElement reasonForVisitDOCNote;

	@FindBy(xpath = "//label[@class='active-label ellipsis']")
	public WebElement MedicineFilter;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement PayType;

	@FindBy(xpath="//input[@id='subcategory']")
	public WebElement SubCategory;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	@FindBy(xpath = "//ki-calender-time[@id='startdate']//input[@type='text']")
	public WebElement StartDate;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;





	public void Patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo ,String ADTprovider ) throws InterruptedException, IOException, AWTException {

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
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastname);
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
		EnterAadhar.sendKeys(DocID );
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
		driver.findElement(By.xpath("//input[@id='guarantorphonehome']")).sendKeys("9845123658");
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

		js.executeScript("arguments[0].scrollIntoView();", signupload);
		Thread.sleep(1000);
		signupload.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		Action drawAction = builder.moveToElement(driver.findElement(By.cssSelector(".upper-canvas"))) //start points x axis and y axis. 

				.moveByOffset(-100,0)
				.clickAndHold()
				.moveByOffset(-50,0) // 2nd points (x1,y1)
				.moveByOffset(20, 50)// 3rd points (x2,y2)
				.moveByOffset(30,0) // 2nd points (x1,y1)
				.moveByOffset(0,-50)// 3rd points (x2,y
				.moveByOffset(100,10)
				.moveByOffset(12,70)
				.moveByOffset(50,6)
				.release()
				.build();
		drawAction.perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@id='consentsave'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(3000);


		///////////////encounter

		billing.click();
		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(2000);
		add.click();
		Thread.sleep(1000);
		//	printUnckeck.click();
		//	Thread.sleep(1000);
		billSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(26);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);
	}


	public void ADT( ) throws InterruptedException {


		ADT.click();
		Thread.sleep(1000);
		Thread.sleep(500);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);
		{

			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		BedCategory.click();
		Thread.sleep(1000);
		SelectBedCategory.click();
		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Ultra-Deluxe')])")).click();
		Thread.
		sleep(800);
		Bed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
		//SelectBed.click();
		Thread.sleep(500);
		SAve.click();
		Thread.sleep(3000);
		Thread.sleep(2000);

		List<WebElement> dynamicElement1111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if(dynamicElement1111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

	}



	public void	DoctorNote(String DOCuser ,String DOCpassword , String MRNo,String ADTProvider ) throws InterruptedException, AWTException, IOException {


		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;//li[normalize-space()='Naufar Center']
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		Hamburger.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();

		//UParrow.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		//Lock.click();
		Thread.sleep(1500);

		///ADT

		/*	ADT.click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(1000);
	AdmissionType.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Day Case Admission']")).click();
	Thread.sleep(2000);
	providername.click();//input[@id='admittedproviderdisplayname']
	Thread.sleep(1000);
	providername.sendKeys(ADTProvider);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+ADTProvider+"')])[1]")).click();
	Thread.sleep(1000);
	Priority.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
	Thread.sleep(1000);
	BedCategory.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='ROOM']")).click();
	Thread.sleep(1000);
	RoomType.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'Deluxe')])")).click();
	Thread.sleep(1000);
	Bed.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
	Thread.sleep(500);
	SAve.click();
	Thread.sleep(2500);     */

		SubCategory.click();
		Thread.sleep(1000);
		System.out.println(MRNo);

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(700);
		EnterPatientName.click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		/*	UParrow.click();
	Thread.sleep(500);
	Lock.click();
	Thread.sleep(500); */
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(1000);
		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(3000);

		disgnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(2000);


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);





		driver.findElement(By.xpath("//div[contains(text(),'Mark as Final')]")).click();
		Thread.sleep(1000); 


		///////cpoe Service	

		CpoeService.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='btn-service-search']//i[@class='ki ki-favourite-fill']")).click();
		//Thread.sleep(1000);	
		CpoeServiceSearch.click();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Liver Biopsy", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='LIVER BIOPSY']")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@id='orderdetails_add']")).click();
//		Thread.sleep(1000);

	
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Absolute Eosinophil Count", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Absolute Eosinophil Count']")).click();
		Thread.sleep(1000);

		//Using tagname with anchor
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='items-name ellipsis ng-star-inserted']"));
		System.out.println("The number of services = " + links.size());

		int servicecountInEMR =links.size();
		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(26);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(13).setCellValue(servicecountInEMR);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);


		/////Cpoe Pharmacy


		CPOEpharm.click();
		Thread.sleep(1000);
		MedicineSearch.clear();
		Thread.sleep(1000);
		MedicineSearch.sendKeys("crocin 650mg", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
		Thread.sleep(1000);
		//	prescriptionType.click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//li[normalize-space()='Discharge']")).click();
		/*	Orderingreason.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
			Thread.sleep(1000);
			justification.click();
			Thread.sleep(1000);
			justification.sendKeys("ok");
			Thread.sleep(1000); */
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);

		NoCurrentmed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		Thread.sleep(1000);
		NoCurrentmedCheck.click();
		Thread.sleep(1000);
		//DischargeReconcile.click();
		//Thread.sleep(1000);
//		AdmsnReconcile.click();
//		Thread.sleep(1000);
//		Reconsile.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		Thread.sleep(1000);
		medicineAdd.click();
		Thread.sleep(1000);


		CPOEpharm.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search Medicines']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search Medicines']")).sendKeys("dolopar 650", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@title,'by Oral')])[1]")).click();
		Thread.sleep(1000);
		//	prescriptionType.click();
		//  Thread.sleep(1000);
		//  driver.findElement(By.xpath("//li[normalize-space()='Discharge']")).click();

		StartDate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);

		medicineAdd.click();
		Thread.sleep(1000);
		OverRidereason.click();
		Thread.sleep(500);
		OverRidereason.sendKeys("ok");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click();
		Thread.sleep(500);
		PrescriptionPrintDN.click();
		Thread.sleep(3000);

		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);

		EmrSave.click();
		Thread.sleep(3000);    



		///EditNote


		///WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-reset']")));
		Thread.sleep(3000);
		EnteredNote.click();
		Thread.sleep(2000);

		//Mousehovering to view reason for visit tooltip
		act.moveToElement(reasonForVisitDOCNote).build().perform();

		Thread.sleep(2000);
		Editnote.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(CPOEpharm));
		Thread.sleep(3000);

		CPOEpharm.click(); 
		Thread.sleep(1000);
		MedicineSearch.click();
		Thread.sleep(1000);
		MedicineSearch.sendKeys("MORPHINE 50MG TAB", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='MORPHINE 50MG TAB, 1 Tablet  by Oral']")).click();
		Thread.sleep(1000);
		
		
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);
		duration.clear();
		Thread.sleep(1000);
		duration.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='durationunitid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
//		OrderingReason.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
//		Thread.sleep(1000);
//		justification.click();
//		Thread.sleep(1000);
//		justification.sendKeys("ok");
//		Thread.sleep(1000);





		/*	NoCurrentmed.click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
			Thread.sleep(1000);
			//NoCurrentmedCheck.click();
			//Thread.sleep(1000);
			//DischargeReconcile.click();
			Thread.sleep(1000);
			AdmsnReconcile.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[contains(@class,'ki ki-continue')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[contains(@class,'ki ki-continue')]")).click();
			Thread.sleep(1000);
			Reconsile.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click(); */



		medicineAdd.click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-emr-homescreen-shell[1]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]")));
		Thread.sleep(4000);


		EnteredNote.click();
		Thread.sleep(3000);
		Log.click();
		Thread.sleep(1000);
		CpoeView.click();
		Thread.sleep(2000);
		Medicine.click();
		Thread.sleep(1000);
		cpoePrescriptionPrint.click();
		Thread.sleep(2000);
	//		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000); 



		///Active & In-active filter
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//button[@class='icon refresh']")).click();
		Thread.sleep(2000); 
		MedicineFilter.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//div[normalize-space()='Inactive Medicines']")).click();
		Thread.sleep(2000); 
		MedicineFilter.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//div[normalize-space()='Antibiotic Medicines']")).click();
		Thread.sleep(2000); 
		MedicineFilter.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//div[normalize-space()='Drug Class']")).click();
		//Thread.sleep(2000); 
		//driver.findElement(By.xpath("//span[normalize-space()='Glycopeptide Antibiotics']")).click();
		Thread.sleep(3000); 
	}


//
//	public void CPOEAdministration() throws InterruptedException, AWTException {
//		Thread.sleep(1000);
//		CpoeAdministration.click();
//		Thread.sleep(1000);
//		MedicineAdministration.click();
//		Thread.sleep(1000);
//		AdminIcon.click();
//		Thread.sleep(1000);
//		Remarks.click();
//		Thread.sleep(1000);
//		Remarks.sendKeys("Medicine Administered");
//		Thread.sleep(1000);
//		Plus.click();
//
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//
//		Thread.sleep(1000);
//		AdminInfo.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[contains(@class,'modal-content-area')]//button[contains(@type,'button')][normalize-space()='Close']")).click();
//		Thread.sleep(1000);
//		Save1.click();
//		Thread.sleep(3000);
//
//		/////SecondNurse verification
//
//		VerifiedBy.click();
//		Thread.sleep(1000);
//		VerifiedBy.sendKeys("Athira M R(NGL17895)");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Athira M R(NGL17895)']")).click();
//		Thread.sleep(1000);
//		Passsword.click();
//		Thread.sleep(1000);
//		Passsword.sendKeys("KAmeda123$");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
//		Thread.sleep(3000);    
//
//
//		Range.click();
//		Thread.sleep(1000);
//		Range.click();
//		Thread.sleep(1000);
//
//
//		///ServiceAdministration 
//
//		Serviceadmin.click();
//		Thread.sleep(1000);
//		serviceadmin1.click();
//		Thread.sleep(1000);
//		AdminStatus.click();
//		Thread.sleep(1000);
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//li[normalize-space()='Acknowledged']")));
//		Thread.sleep(1000);		
//
//		driver.findElement(By.xpath("//li[normalize-space()='Acknowledged']")).click();
//		Thread.sleep(1000);
//		ServiceRemarks.click();
//		Thread.sleep(1000);
//		ServiceRemarks.sendKeys("Text files can store large amount of data as there is no limitation on the size of contents. However, text editors opening such large files need to be smart for loading and displaying these. Almost all operating systems come with text editors that allow you to create and edit text files. For example, Windows OS comes with Notepad and Wordpad for this purpose. Similarly, MacOS comes with TextEdit for creating and editing Text Documents. There are, however, other free text editors available as well over the internet that provide you the capability to work with Text Documents like Notepad++ which is far more advanced in terms of functionality.");
//		Thread.sleep(1000);
//		Save1.click();
//		Thread.sleep(2000);
//		serviceadmin2.click();
//		Thread.sleep(1000);
//		//AdminStatus.click();
//		//driver.findElement(By.xpath("")).click();
//		ServiceRemarks.click();
//		Thread.sleep(1000);
//		ServiceRemarks.sendKeys("Text files can store large amount of data as there is no limitation on the size of contents. However, text editors opening such large files need to be smart for loading and displaying these. Almost all operating systems come with text editors that allow you to create and edit text files. For example, Windows OS comes with Notepad and Wordpad for this purpose. Similarly, MacOS comes with TextEdit for creating and editing Text Documents. There are, however, other free text editors available as well over the internet that provide you the capability to work with Text Documents like Notepad++ which is far more advanced in terms of functionality.");
//		Thread.sleep(1000);
//		Save1.click();
//		Thread.sleep(1000);
//		//JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", log);
//		Thread.sleep(1000);
//		orderdetails.click();
//		Thread.sleep(1000);
//		Close.click();
//		Thread.sleep(1000);
//		ServiceDetails.click();
//		Thread.sleep(1000);
//		Close.click();
//		Thread.sleep(1000);
//		log.click();
//		Thread.sleep(1000);
//		Close.click(); 
//		Thread.sleep(1000);
//		Status.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Completed']")).click();
//		Thread.sleep(1000);
//		Status.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Pending']")).click();
//		Thread.sleep(1000);
//		Reset.click();
//		Thread.sleep(1000);
//		serviceadmin1.click();
//		Thread.sleep(1000);
//		Save1.click();
//		Thread.sleep(2000);
//		//	JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", log);
//		Thread.sleep(1000);
//		log.click();
//		Thread.sleep(1000);
//		Close.click();
//		Thread.sleep(1000);
//
//		//		serviceadmin1.click();
//		//		Thread.sleep(1000);
//		//		Report.click();
//		//		Thread.sleep(1000);
//		//		driver.findElement(By.xpath("//label[normalize-space()='Authorize']//span[@class='checkmark']")).click();
//		//		Thread.sleep(1000);
//		//		Save1.click();
//		//		Thread.sleep(2000);
//		//
//		//
//		//		Refresh.click();
//		//		Thread.sleep(2000);
//		//		others.click();
//		//		Thread.sleep(1000);
//		//		driver.findElement(By.xpath("//i[@title='Document View']")).click();
//		//		Thread.sleep(2000);
//		//		driver.findElement(By.xpath("//button[@class='btn btn-danger sm ml10'][normalize-space()='Close']")).click();
//		//		Thread.sleep(1000);
//
//
//
//
//	}




	public void MIS(String AUTHUser,String AUTHpassword,String MRNo ,String servicecountInEMR ) throws InterruptedException {


		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys("admin");
		password.click();
		password.sendKeys("KAmeda123$");
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);



		Hamberger.click();
		Thread.sleep(600);
		MISReports.click();
		Thread.sleep(1000);
		Reports.click();
		Thread.sleep(1000);

		EMR.click();
		Thread.sleep(1000);
		UnbilledCPOE.click();
		Thread.sleep(1000);
		MISSearch.click();
		Thread.sleep(1000);
		zoom.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='100%']")).click();
		Thread.sleep(1000);
		SearchInReports.click();
		Thread.sleep(1000);
		Searchtext.click();
		Thread.sleep(1000);
		Searchtext.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);

		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dxrd-preview-search-tab-item-text propertygrid-editor-displayName dxd-text-primary']"));
		System.out.println("The number of services = " + links.size());

		int i =links.size();

		//  converting int into String

		String servicecountInMIS = String.valueOf(i);


		System.out.println(servicecountInEMR + servicecountInMIS);
		Thread.sleep(1000);

		//Assert.assertEquals(servicecountInEMR, servicecountInMIS);
		Assert.assertEquals(servicecountInEMR, servicecountInMIS);

		Thread.sleep(1000);





	}











}
