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

public class KIMS_OP_PackageBilling_YasassiWeb2 extends PageFactoryInitYasasiiWeb {

	public KIMS_OP_PackageBilling_YasassiWeb2(WebDriver driver) {
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

	public void Patreg(String Packagename, String title, String Name, String lastname, String Dob, String DocID, String MobNo,
			String Address, String MRNo) throws InterruptedException, AWTException, IOException {

		/////////////////// Patient registration /////////////////////////

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
		
		
		/////////////// encounter///////////////////

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

		String mrno = driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src = new File(Excelfilepath);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration = wb.getSheetAt(55);
		int i = BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);
		BirthRegistration.getRow(i).createCell(16).setCellValue(mrno);
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		Thread.sleep(2000);

		serviceTab.click();
		Thread.sleep(1500);
		addNewOrderTab.click();
		Thread.sleep(1500);
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
		save.click();
		Thread.sleep(2000);

	}

	public void doctorNote(String DOCuser, String DOCpassword, String MRNo, String DocID) throws InterruptedException {

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
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo + "')])[1]")).click();
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

		///////////////// ORDER CPOE PHARMACY////////////////////

		Thread.sleep(1000);
		CPOEpharm.click();
		Thread.sleep(1000);
		MedicineSearch.clear();
		Thread.sleep(1000);
		MedicineSearch.sendKeys("DOLO 650MG TAB", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);
		medicineAdd.click();
		Thread.sleep(2000);
//		MedicineSearch.clear();
//		Thread.sleep(1000);
//		MedicineSearch.sendKeys("6-MP 50 MG TAB", Keys.ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root/app-layout/main[contains(@class,'page-body')]/app-emr-homescreen/div[contains(@class,'page-container h-100')]/div[contains(@class,'note-layout emr-homescreen-dash main-wrapper ng-star-inserted ab-locked layout-1')]/div[contains(@class,'notelayoutcontainer')]/app-emrtemplateloader[contains(@class,'ng-star-inserted')]/div[contains(@class,'pat-note-entry')]/div[contains(@class,'pat-current-temp')]/div[contains(@class,'temp-container')]/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[contains(@class,'card-container')]/div[contains(@class,'row')]/div[contains(@class,'col-lg-7 mbl-pr5')]/div[contains(@class,'ng-star-inserted')]/div/div[contains(@class,'ng-star-inserted')]/div/div/app-cpoe-pharmacy-list/form[contains(@class,'ng-valid ng-dirty ng-touched')]/div[contains(@class,'card card-left list-container pharmacy-list')]/div[contains(@class,'card-body item-list-container')]/div[1]/div[1]/div[1]"))
//				.click();
//		Frequency.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
//		Thread.sleep(1000);
//		medicineAdd.click();
//		Thread.sleep(2000);

		MedicineSearch.clear();
		Thread.sleep(1000);
		MedicineSearch.sendKeys("CROCIN 650MG TAB", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root/app-layout/main[@class='page-body']/app-emr-homescreen/div[@class='page-container h-100']/div[@class='note-layout emr-homescreen-dash main-wrapper ng-star-inserted ab-locked layout-1']/div[@class='notelayoutcontainer']/app-emrtemplateloader[@class='ng-star-inserted']/div[@class='pat-note-entry']/div[@class='pat-current-temp']/div[@class='temp-container']/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[@class='card-container']/div[@class='row']/div[@class='col-lg-7 mbl-pr5']/div[@class='ng-star-inserted']/div/div[@class='ng-star-inserted']/div/div/app-cpoe-pharmacy-list/form[@class='ng-valid ng-dirty ng-touched']/div[@class='card card-left list-container pharmacy-list']/div[@class='card-body item-list-container']/div[@class='item-list ng-star-inserted']/div[@class='item-list-row']/div[1]"))
				.click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);
		medicineAdd.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Override Reason']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click();

		Thread.sleep(2000);

//		MedicineSearch.clear();
//		Thread.sleep(1000);
//		MedicineSearch.sendKeys("SALISIA TV LOTION 50ML", Keys.ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//body/app-root/app-layout/main[@class='page-body']/app-emr-homescreen/div[@class='page-container h-100']/div[@class='note-layout emr-homescreen-dash main-wrapper ng-star-inserted ab-locked layout-1']/div[@class='notelayoutcontainer']/app-emrtemplateloader[@class='ng-star-inserted']/div[@class='pat-note-entry']/div[@class='pat-current-temp']/div[@class='temp-container']/div[@id='noterightregion']/div[@id='section_cpoe']/div[@id='component_cpoe']/app-cpoe-container/div[@class='card-container']/div[@class='row']/div[@class='col-lg-7 mbl-pr5']/div[@class='ng-star-inserted']/div/div[@class='ng-star-inserted']/div/div/app-cpoe-pharmacy-list/form[@class='ng-valid ng-dirty ng-touched']/div[@class='card card-left list-container pharmacy-list']/div[@class='card-body item-list-container']/div[@class='item-list ng-star-inserted']/div[@class='item-list-row']/div[1]"))
//				.click();
//		Thread.sleep(1000);
//		Frequency.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='antibioticorderingreasonid']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Culture']")).click();
//		Thread.sleep(1000);
//	
//		medicineAdd.click();
		Thread.sleep(2000);

		MedicineSearch.clear();
		Thread.sleep(1000);
		MedicineSearch.sendKeys("ABCIXIREL 10MG 5ML INJ", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@title,'ABCIXIREL')]")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(2000);
		medicineAdd.click();
		Thread.sleep(3000);

		EmrSave.click();

		Thread.sleep(3000);

	}

	public void foPanelPackageBilling(String Packagename, String MRNo) throws InterruptedException {

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
		userid.sendKeys(FinalbillUser);
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
		pharmacyPanelTab.click();
		Thread.sleep(1000);
		opPanelTab.click();
		Thread.sleep(1000);
		pharmacyLocation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + PharmacyLocation + "']")).click();
		Thread.sleep(1000);
		okButton.click();
		Thread.sleep(1000);
		yesConfirmation.click();
		Thread.sleep(1000);
		searchField.sendKeys(MRNo);
		Thread.sleep(2000);
		searchIcon.click();
		Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(1500);
//		List<WebElement> dynamicElement = driver
//				.findElements(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']"));
//
//		if (dynamicElement.size() != 0) {
//			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']"))
//			.click();
//			Thread.sleep(1000);
//			unlockIcon.click();
//		}
//
//		else {
//			System.out.println("sri");
//		}
//		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
//		Thread.sleep(1000);
		unlockIcon.click();
		Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(1500);
		selectAllCheckbox.click();
		Thread.sleep(1000);
		availablePackage.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[3]/div[2]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/app-list-item[1]/li[1]"))
				.click();
		Thread.sleep(2000);
		confirmSave.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(succefullyOK));
		Thread.sleep(2000);
		succefullyOK.click();

		wait.until(ExpectedConditions.elementToBeClickable(status));

		status.click();
		Thread.sleep(1000);
		confirmedStatus.click();
		Thread.sleep(2000);
		searchField.clear();
		Thread.sleep(1000);
		searchField.sendKeys(MRNo);
		Thread.sleep(2000);
		searchIcon.click();
		Thread.sleep(1000);
		selectPatient.click();
		Thread.sleep(1000);
		selectAll.click();
		Thread.sleep(2000);
		stockReservation.click();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(succefullyOK));
		Thread.sleep(2000);
		succefullyOK.click();
		Thread.sleep(1000);

		wait.until(ExpectedConditions.elementToBeClickable(status));
		Thread.sleep(2000);
		status.click();
		Thread.sleep(1000);
		stockReservationStatus.click();
		Thread.sleep(2000);
		searchField.clear();
		Thread.sleep(2000);
		searchField.sendKeys(MRNo);
		Thread.sleep(2000);
		searchIcon.click();
		Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(2000);
		uncheckPrint.click();
		Thread.sleep(3000);
		saveBill.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(succefullyOK));
		Thread.sleep(2000);
		succefullyOK.click();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(status));
		Thread.sleep(2000);

		status.click();
		Thread.sleep(2000);
		pendingStatus.click();
		Thread.sleep(2000);
		searchField.clear();
		Thread.sleep(2000);
		searchField.sendKeys(MRNo);
		Thread.sleep(2000);
		searchIcon.click();
		Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(2000);
		selectAll.click();
		Thread.sleep(2000);
		confirmSave.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(succefullyOK));
		Thread.sleep(2000);
		succefullyOK.click();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(status));
		Thread.sleep(2000);

		status.click();
		Thread.sleep(2000);
		confirmedStatus.click();
		Thread.sleep(2000);
		searchField.clear();
		Thread.sleep(2000);
		searchField.sendKeys(MRNo);
		Thread.sleep(2000);
		searchIcon.click();
		Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(2000);
		selectAll.click();
		Thread.sleep(2000);
		stockReservation.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(succefullyOK));
		Thread.sleep(2000);

		succefullyOK.click();
		Thread.sleep(2000);
      	wait.until(ExpectedConditions.elementToBeClickable(status));
		Thread.sleep(2000);
		status.click();
		Thread.sleep(2000);
		stockReservationStatus.click();
		Thread.sleep(2000);
		searchField.clear();
		Thread.sleep(2000);
		searchField.sendKeys(MRNo);
		Thread.sleep(2000);
		searchIcon.click();
		Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveBill));
		saveBill.click();
		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(succefullyOK));
		Thread.sleep(2000);
		succefullyOK.click();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(status));
		Thread.sleep(2000);

		dispencingTab.click();
		Thread.sleep(2000);
		searchField.clear();
		Thread.sleep(2000);
		searchField.sendKeys(MRNo);
		Thread.sleep(12000);
		searchIcon.click();
		Thread.sleep(2000);
		selectPatient.click();

	}

	public void packageClosure(String MRNo) throws InterruptedException {
		MenuToggle.click();
		Thread.sleep(1000);
		foTab.click();
		Thread.sleep(2000);
		Registration.click();
		Thread.sleep(1000);
		OP.click();
		Thread.sleep(1000);
		selectOP.click();
		Thread.sleep(1000);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo + "')])[1]")).click();
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
		packageAllocation.click();
		Thread.sleep(2000);
		availedService.click();
		Thread.sleep(2000);
		packageView.click();
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		threeDots.click();
		Thread.sleep(2000);
		packageDetails.click();
		Thread.sleep(2000);
		serviceName1.sendKeys("SALISIA TV LOTION 50M");
		Thread.sleep(2000);
		close.click();
		Thread.sleep(2000);
		threeDots.click();
		Thread.sleep(2000);
		packageUtilization.click();
		Thread.sleep(2000);
		serviceName2.sendKeys("SALISIA TV LOTION 50M");
		Thread.sleep(2000);
		close2.click();
		Thread.sleep(2000);
		threeDots.click();
		Thread.sleep(2000);
		packageAllocation2.click();
		Thread.sleep(2000);
		close2.click();
		Thread.sleep(2000);
		threeDots.click();
		Thread.sleep(2000);
		packageClosure.click();
		Thread.sleep(2000);
		remarks1.sendKeys("PACKAGE CLOSURE");
		Thread.sleep(2000);
		saveButton.click();
		Thread.sleep(2000);

	}

}
