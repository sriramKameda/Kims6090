package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
import com.w2a.utilities.RandomString;

public class KIMS_IP_PackageBilling_YasassiWeb extends PageFactoryInitYasasiiWeb {

	public KIMS_IP_PackageBilling_YasassiWeb(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
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

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='age']")
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

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;

	@FindBy(xpath = "//li[contains(text(),'Thomas')]")
	public WebElement SelectProviderName;

	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;

	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPriority;

	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement BedCategory;

	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement SelectBedCategory;

	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectRoomType;

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBed;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSAve;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type1;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement enterOrganisation;

	@FindBy(xpath = "//li[normalize-space()='Kameda']")
	public WebElement selectKameda;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printUnckeck;

	@FindBy(xpath = "//label[@class='check-container zero-right']//span[@class='checkmark']")
	public WebElement Admission;

	@FindBy(xpath = "//input[@id='roomtypeid']")
	public WebElement Roomtype;

	@FindBy(xpath = "//input[@id='reservationtypeid']")
	public WebElement ReservationmType;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;

	@FindBy(xpath = "//button[@id='updatepatadtbutton']")
	public WebElement ADTUpdate;

	@FindBy(xpath = "//i[@class='ki ki-note']")
	public WebElement RemarksView;

	@FindBy(xpath = "//label[@title='Log']//i[@class='ki ki-list']")
	public WebElement Log;

	@FindBy(xpath = "//img[@class='dr-image']")
	public WebElement Recommendation;

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

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[2]/div[1]")
	public WebElement disgnosis;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEpharm;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement MedicineSearch;

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement Orderingreason;

	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement justification;

	@FindBy(xpath = "//label[contains(text(),'G91.2')]//span[@class='checkmark']")
	public WebElement diagnosischevckbox;

	@FindBy(xpath = "//label[contains(@class,'check-container ng-star-inserted')]//span[contains(@class,'checkmark')]")
	public WebElement inclinicadmin;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement medicineAdd;

	@FindBy(xpath = "//label[normalize-space()='No Current Medication']//span[@class='checkmark']")
	public WebElement NoCurrentmed;

	@FindBy(xpath = "//label[@class='check-container no-label']//span[@class='checkmark']")
	public WebElement NoCurrentmedCheck;

	@FindBy(xpath = "//i[@class='ki ki-discharge-reconciliation']")
	public WebElement dischargeReconcile;

	@FindBy(xpath = "//i[@class='ki ki-reconciliation']")
	public WebElement Reconsile;

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EmrSave;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement OP;

	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement SelectIP;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//div[normalize-space()='CPOE Service']")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeServiceSearch;

	@FindBy(xpath = "//div[@class='card card-service-details cpoe-ser-card wrapper']//div[2]//div[1]//ki-input-control[1]//div[1]//input[1]")
	public WebElement medicineQuantity;

	@FindBy(xpath = "//textarea[@id='clinicalindication']")
	public WebElement clinicalIndication;

	@FindBy(xpath = "//button[@id='orderdetails_add']")
	public WebElement addMedicine;

	@FindBy(xpath = "//i[contains(@class,'ki ki-service-category')]")
	public WebElement baseCategory;

	@FindBy(xpath = "//div[@title=' Radiology']")
	public WebElement radiologyCategory;

	@FindBy(xpath = "//div[normalize-space()='Procedure']")
	public WebElement procedureCategory;

	@FindBy(xpath = "//div[contains(@title,'Ayurveda')]")
	public WebElement ayurvedaCatogory;

	@FindBy(xpath = "//div[@title=' All']")
	public WebElement allCategory;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement serviceTab;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement addNewOrderTab;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='servicetypeid']//input[@id='undefined']")
	public WebElement serviceType;

	@FindBy(xpath = "//li[contains(text(),'Package')]")
	public WebElement packagE;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement serviceName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add1;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement save;

	// f0_opPanel_Billing_package

	@FindBy(xpath = "//div[normalize-space()='Pharmacy Panel']")
	public WebElement pharmacyPanelTab;

	@FindBy(xpath = "//div[normalize-space()='OP Panel']")
	public WebElement opPanelTab;

	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement pharmacyLocation;

	@FindBy(xpath = "//button[@id='btnsearch']")
	public WebElement okButton;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement yesConfirmation;

	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement searchField;

	@FindBy(xpath = "//i[@title='Search']")
	public WebElement searchIcon;

	@FindBy(xpath = "//div[@class='pat-name']")
	public WebElement selectPatient;

	@FindBy(xpath = "//i[@id='lock']")
	public WebElement unlockIcon;

	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement selectAllCheckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[3]/div[2]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement availablePackage;

	@FindBy(xpath = "//button[@id='confirmsave']")
	public WebElement confirmSave;

	@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
	public WebElement status;

	@FindBy(xpath = "//li[normalize-space()='Confirmed']")
	public WebElement confirmedStatus;// selectPatient

	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement selectAll;

	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement stockReservation;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")
	public WebElement succefullyOK; // status

	@FindBy(xpath = "//li[normalize-space()='Stock Reservation']")
	public WebElement stockReservationStatus; // selectpatient

	@FindBy(xpath = "//label[normalize-space()='Print']//span[@class='checkmark']")
	public WebElement uncheckPrint;

	@FindBy(xpath = "//button[@id='billingsave']//i[@class='ki ki-save']")
	public WebElement saveBill;

	@FindBy(xpath = "//li[normalize-space()='Pending']")
	public WebElement pendingStatus;

	@FindBy(xpath = "//div[@title='Dispensing']")
	public WebElement dispencingTab;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='FO']")
	public WebElement foTab;

	@FindBy(xpath = "//li[normalize-space()='OP']")
	public WebElement selectOP;

	@FindBy(xpath = "//i[@class='ki ki-file-view-fill']")
	public WebElement packageAllocation;

	@FindBy(xpath = "//i[@class='ki ki-cash-transfer-fill']")
	public WebElement availedService;

	@FindBy(xpath = "//span[normalize-space()='Package View']")
	public WebElement packageView;

	@FindBy(xpath = "//i[@class='ki ki-search text-white']")
	public WebElement search;

	@FindBy(xpath = "//label[@class='multi-action item-value']//i[@class='fa fa-1 fa-ellipsis-v custom-color']")
	public WebElement threeDots;

	@FindBy(xpath = "//label[normalize-space()='Package Details']")
	public WebElement packageDetails;

	@FindBy(xpath = "//input[contains(@placeholder,'Service Name')]")
	public WebElement serviceName1;

	@FindBy(xpath = "//span[@aria-hidden='true']")
	public WebElement close; // 3

	@FindBy(xpath = "//label[normalize-space()='Package Utilization']")
	public WebElement packageUtilization;

	@FindBy(xpath = "//tab[@id='1']//input[contains(@placeholder,'Service Name')]")
	public WebElement serviceName2;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement close2; // 3

	@FindBy(xpath = "//label[normalize-space()='Package Allocation']")
	public WebElement packageAllocation2; // close2 ,3

	@FindBy(xpath = "//label[normalize-space()='Package Closure']")
	public WebElement packageClosure;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement remarks1;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement saveButton;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement admissinChargeYes;

	@FindBy(xpath = "//button[@class='icon cpoeadmin']")
	public WebElement cpoeAdmin;

	@FindBy(xpath = "//label[normalize-space()='Service Administration']")
	public WebElement serviceAdmin;

	@FindBy(xpath = "//input[@id='category']")
	public WebElement categoryDropdown;

	@FindBy(xpath = "//li[normalize-space()='Procedure']")
	public WebElement procedure;

	@FindBy(xpath = "//li[normalize-space()='Ayurveda']")
	public WebElement ayurveda;

	@FindBy(xpath = "//li[normalize-space()='Cardiology']")
	public WebElement cardioogy;

	@FindBy(xpath = "//li[normalize-space()='IVF']")
	public WebElement ivf;

	@FindBy(xpath = "//li[normalize-space()='Nuclear Medicine']")
	public WebElement nuclearMedicine;

	@FindBy(xpath = "//li[normalize-space()='Radiology']")
	public WebElement radiology;

	@FindBy(xpath = "//i[@class='ki ki-beaker']")
	public WebElement Investigation;

	@FindBy(xpath = "//input[@id='executionlocid']")
	public WebElement Executionloc;

	@FindBy(xpath = "//button[@class='btn btn-primary active sm m0']")
	public WebElement ExecutionlocOK;

	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement confirmOK;

	@FindBy(xpath = "//input[@id='mrno']")
	public WebElement SearchField;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement ivstgnSave;

	@FindBy(xpath = "//button[normalize-space()='Ok']//i[@class='ki ki-check']")
	public WebElement SaveOK1;

	@FindBy(xpath = "//input[@id='status']")
	public WebElement billStatus;

	@FindBy(xpath = "//li[normalize-space()='Sample Collection Pending - Unbilled']")
	public WebElement unbilled;

	@FindBy(xpath = "//label[normalize-space()='Modules']")
	public WebElement module;

	@FindBy(xpath = "//li[normalize-space()='CPOE Order']")
	public WebElement cpoeOrder;

	@FindBy(xpath = "//input[@id='subcategory']")
	public WebElement subCategory;

	@FindBy(xpath = "//li[normalize-space()='Pending(IP)']")
	public WebElement pendingIp;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement servicesTab;

	@FindBy(xpath = "//ki-checkbox-control[@class='eyeicon ng-untouched ng-pristine ng-valid']//span[@class='checkmark']")
	public WebElement allocationCheckbox;

	@FindBy(xpath = "//div[@class='col-md-12']//div[1]//div[1]//div[1]//table[1]//thead[1]//tr[1]//th[1]//ki-checkbox-control[1]//label[1]//label[1]//span[1]")
	public WebElement moveServices;

	@FindBy(xpath = "//i[@class='ki ki-chevron-double-right']")
	public WebElement doublearrow;

	 @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-package-allocation[1]/div[1]/div[1]/form[1]/div[4]/div[3]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	 public WebElement deallocatecheckbox;
	 @FindBy(xpath = "//i[@class='ki ki-chevron-double-left']") public WebElement doubleLeft;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;

	

	public void createPatient(String Packagename, String title, String Name2, String lastname2, String Dob, String DocID2,
			String MobNo, String Address, String MRNo2) throws InterruptedException, IOException, AWTException {

		/////////////////// Patient registration for IP package flow//////////////

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
		Thread.sleep(1000);
		Registration.click();
		Thread.sleep(500);
		List<WebElement> dynamicElement = driver
				.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement.size() != 0) {
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		Title.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='" + title + "']")).click();
		Thread.sleep(500);
		EnterFirstNME.sendKeys(Name2);
		Thread.sleep(500);
		String lastName =RandomString.lastName();
		
		System.out.println(lastName + "LastName" );
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastName);
		Thread.sleep(500);

		EnterAge.click();
		Thread.sleep(500);

		Robot t = new Robot();
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
		enterOrganisation.sendKeys("Kameda");
		Thread.sleep(500);
		selectKameda.click();

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
		for (int i = 0; i <= 15; i++) {
			EnterAadhar.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
       String DOCID = RandomString.DOCID();
		
		EnterAadhar.sendKeys(DOCID );
		Thread.sleep(600);
		Clickadd.click();
		Thread.sleep(800);

		List<WebElement> dynamicElement1 = driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement1.size());
		if (dynamicElement1.size() == 0) {
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}

		Thread.sleep(600);
		emergencyContact.click();
		Thread.sleep(600);
		Type1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Emergency Contact']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='guarantorfirstname']")).sendKeys("SRI");
		Thread.sleep(600);
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='guarantorphonehome']")).sendKeys("9845123658");
		Thread.sleep(600);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Add1);
		Add1.click();
		Thread.sleep(600);

		HowDidYouKnow.click();
		Thread.sleep(600);
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		Save.click();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Close']")));
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(billing));
		Thread.sleep(3000);
		/////////////// encounter//////////

		billing.click();
		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + Provider + "']")).click();
		Thread.sleep(2000);
		add.click();
		Thread.sleep(1000);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]")));
		Thread.sleep(3000);

		billSave.click();
		Thread.sleep(3000);

		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']"))
				.click();
		Thread.sleep(1000);

		String mrno2 = driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno2);

		File src = new File(Excelfilepath);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration = wb.getSheetAt(55);
		int i = BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);
		BirthRegistration.getRow(i).createCell(25).setCellValue(mrno2);
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		Thread.sleep(2000);

	}
                   ///////// Admit the patient  /////////////
	
	
	public void ADT(String Packagename) throws InterruptedException {
		
		Thread.sleep(2000);
		ADT.click();
		Thread.sleep(1000);
		Thread.sleep(500);
		List<WebElement> dynamicElement11 = driver.findElements(By.xpath(
				"//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']"));

		if (dynamicElement11.size() != 0) {
			driver.findElement(By.xpath(
					"//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']"))
					.click();
		}

		else {
			System.out.println("sri");
		}

		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'" + ADTprovider + "')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);
		{

			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		BedCategory.click();
		Thread.sleep(1000);
		SelectBedCategory.click();
		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Ultra-Deluxe')])")).click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
		Thread.sleep(500);

		Thread.sleep(2000);

		List<WebElement> dynamicElement1111 = driver
				.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if (dynamicElement1111.size() != 0) {
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);

		List<WebElement> dynamicElement11111 = driver
				.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if (dynamicElement11111.size() != 0) {
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);


		List<WebElement> dynamicElement411 = driver.findElements(By.xpath(
				"//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement411.size() != 0) {
			driver.findElement(By.xpath(
					"//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"))
					.click();
			Thread.sleep(1000);

		}

		else {
			System.out.println("sri");
		}

		add.click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		succefullyOK.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1500);
		packagE.click();
		Thread.sleep(1500);
		serviceName.sendKeys(Packagename);
		Thread.sleep(1500);

		driver.findElement(By.xpath("//li[normalize-space()='" + Packagename + "']")).click();
		// li[normalize-space()='Executive Health Package(EHP) - B']
		Thread.sleep(1500);
		add.click();
		Thread.sleep(1500);
		saveButton.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']"))
				.click();
		Thread.sleep(1000);

	}

	public void doctorNoteForIpPatient(String DOCuser, String DOCpassword, String MRNo2, String DocID)
			throws InterruptedException, AWTException {

		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize = driver.getWindowHandles().size();
		int windowopen = Windowsize - 1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(DOCuser);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);
		OP.click();
		Thread.sleep(600);
		SelectIP.click();
		Thread.sleep(1000);

		EnterPatientName.sendKeys(MRNo2);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo2 + "')])[1]")).click();
		Thread.sleep(1000);

		Thread.sleep(500);
		List<WebElement> dynamicElement = driver
				.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement.size() != 0) {
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		/////// Create the doctor note////////////

	 DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1 = driver
				.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if (dynamicElement1.size() != 0) {
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
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(EmrSave));
		Thread.sleep(2000);

		disgnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(2000);

		/////// ORDER CPOESERVICES/////////

		CpoeService.click();
		Thread.sleep(1000);
		CpoeServiceSearch.click();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Potassium (ISE Indirect)", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Plasma Potassium (ISE Indirect)']")).click();
//		driver.findElement(By.xpath("//div[@id='cpoeservicelist_1']//label[@class='item-name']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
//		Thread.sleep(1000);
//		medicineQuantity.sendKeys("1");
//		Thread.sleep(1000);
//		clinicalIndication.sendKeys("test");
//		Thread.sleep(1000);
//		addMedicine.click();
		Thread.sleep(1000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Sodium (ISE Indirect)", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//I[@class='ki ki-close-circle'])[6]")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
//		Thread.sleep(1000);
//		clinicalIndication.sendKeys("test");
//		Thread.sleep(1000);
//		addMedicine.click();
//		Thread.sleep(1000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Lipid Panel", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Lipid Panel']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Absolute Basophil Count", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Absolute Basophil Count']")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("CT Knee Joint", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='CT Knee Joint']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("CT Abdomen + Pelvis Plain", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='CT Abdomen + Pelvis Plain']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("CBCT-A", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='CBCT-A']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Bone Marrow", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Bone Marrow']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("ABDOMINAL TAPPING", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='ABDOMINAL TAPPING']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Balloon Bronchoplasty", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Balloon Bronchoplasty']")).click();
		Thread.sleep(2000);
		baseCategory.click();
		Thread.sleep(2000);
		ayurvedaCatogory.click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("AYR4 Head & Neck Massage", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='AYR4 Head & Neck Massage']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("G13 Henna", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='G13 Henna']")).click();
		Thread.sleep(2000);
		baseCategory.click();
		Thread.sleep(2000);
		allCategory.click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("ECHO Cardiogram", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='ECHO Cardiogram']")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Ambulatory BP Monitoring ( ABPM)", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Ambulatory BP Monitoring ( ABPM)']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Embryo Freezing (6 Months)", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Embryo Freezing (6 Months)']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Frozen Embryo Transfer", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Frozen Embryo Transfer']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("131 Iodine MIBG Administration charge", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='131 Iodine MIBG Administration charge']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Isotope -Thyroid Scan", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Isotope -Thyroid Scan']")).click();
		Thread.sleep(2000);
		EmrSave.click();
		Thread.sleep(3000);

		///////////////// CPOE Administration///////////////////
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(cpoeAdmin));
		Thread.sleep(2000);		
		
		
		cpoeAdmin.click();
		Thread.sleep(1000);
		serviceAdmin.click();
		Thread.sleep(1000);
		categoryDropdown.click();
		Thread.sleep(1000);
		procedure.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='servadmincontainer']//div[2]//div[5]//label[1]//i[1]")).click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='servadmincontainer']//div[2]//div[5]//label[1]//i[1]")).click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='adm-xl-body']//div[3]//div[5]//label[1]//i[1]")).click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		categoryDropdown.click();
		Thread.sleep(1000);
		ayurveda.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='sar-table-list ng-star-inserted']//div[1]//div[5]//label[1]//i[1]"))
				.click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='servadmincontainer']//div[2]//div[5]//label[1]//i[1]")).click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		categoryDropdown.click();
		Thread.sleep(1000);
		cardioogy.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='sar-table-list ng-star-inserted']//div[1]//div[5]//label[1]//i[1]"))
				.click();
		Thread.sleep(1000);
		saveButton.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='servadmincontainer']//div[2]//div[5]//label[1]//i[1]")).click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		categoryDropdown.click();
		Thread.sleep(1000);
		ivf.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='sar-table-list ng-star-inserted']//div[1]//div[5]//label[1]//i[1]"))
				.click();
		Thread.sleep(1000);
		saveButton.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='servadmincontainer']//div[2]//div[5]//label[1]//i[1]")).click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		categoryDropdown.click();
		Thread.sleep(1000);
		nuclearMedicine.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='sar-table-list ng-star-inserted']//div[1]//div[5]//label[1]//i[1]"))
				.click();
		Thread.sleep(1000);
		saveButton.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='servadmincontainer']//div[2]//div[5]//label[1]//i[1]")).click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(2000);
		/*
		 * categoryDropdown.click(); Thread.sleep(1000); radiology.click();
		 * Thread.sleep(1000); driver.findElement(By.
		 * xpath("//div[@class='sar-table-list ng-star-inserted']//div[1]//div[5]//label[1]//i[1]"
		 * )).click(); Thread.sleep(1000); saveButton.click();
		 * 
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//div[@id='servadmincontainer']//div[2]//div[5]//label[1]//i[1]")).click();
		 * Thread.sleep(1000); driver.findElement(By.
		 * xpath("//div[@class='modal ki-dialog fade blockoutside in show']")).click();
		 * Thread.sleep(1000); saveButton.click(); Thread.sleep(2000);
		 */

	}

	public void samplecollection(String MRNo2) throws InterruptedException, AWTException {

		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize = driver.getWindowHandles().size();
		int windowopen = Windowsize - 1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		userid.click();
		Thread.sleep(1000);
		userid.sendKeys("admin");
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		Investigation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP Sample Collection']")).click();
		Thread.sleep(1000);
		ExecutionlocOK.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(3000);

		///////////// Sample Collection/////////////////

		billStatus.click();
		Thread.sleep(1000);
		unbilled.click();
		Thread.sleep(1000);
		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNo2, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo2 + "')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Print Barcode')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Print Receipt')]")).click();

		ivstgnSave.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		SaveOK1.click();
		Thread.sleep(2000);

	}
	// ------------------------------------------------------------

	// FO BILLING OF PENDING CPOE ORDERS

	public void foBillingServices(String MRNo2) throws InterruptedException {
		
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize = driver.getWindowHandles().size();
		int windowopen = Windowsize - 1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		userid.click();
		Thread.sleep(1000);
		userid.sendKeys("admin");
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		MenuToggle.click();
		Thread.sleep(1000);
		//module.click();
		Thread.sleep(1000);
		FOModule.click();
		Thread.sleep(1000);
		Registration.click();
		Thread.sleep(1000);
		OP.click();
		Thread.sleep(1000);
		cpoeOrder.click();
		Thread.sleep(1000);
		subCategory.click();
		Thread.sleep(1000);
		pendingIp.click();
		Thread.sleep(1000);
		
		
		
		try{
		EnterPatientName.sendKeys(MRNo2, Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo2 + "')])[1]")).click();
		Thread.sleep(1000);
		}
		
		catch(Exception e)
		
		{
			System.out.println(e + "Exception");
			
			EnterPatientName.clear();
			Thread.sleep(1000);
			EnterPatientName.sendKeys(MRNo2, Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo2 + "')])[1]")).click();
			Thread.sleep(1000);
			
		}
		
		
		

		Thread.sleep(500);
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement.size() != 0) {
			
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		servicesTab.click();
		Thread.sleep(2000);
		saveButton.click();
		Thread.sleep(2000);
		succefullyOK.click();
		
		
	}
	/////////// PACKAGE ALLOCATION////////////////

	public void packageAllocation(String mRNo2) throws InterruptedException {
	
		Thread.sleep(2000);
		packageAllocation.click();
		Thread.sleep(1000);
		allocationCheckbox.click();
		Thread.sleep(1000);

		Thread.sleep(500);
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//div[@class='modal ki-dialog fade blockoutside in show']//label[@class='dialog-title'][normalize-space()='Information']"));

		if (dynamicElement.size() != 0) {
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		
		
		moveServices.click();
		Thread.sleep(1000);
		doublearrow.click();
		Thread.sleep(1000);
		moveServices.click();
		Thread.sleep(1000);
		doublearrow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		allocationCheckbox.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Package Availed Amount']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		Thread.sleep(1000);
		deallocatecheckbox.click();
		Thread.sleep(1000);
		doubleLeft.click();
		Thread.sleep(1000);
		saveButton.click();

	}

}
