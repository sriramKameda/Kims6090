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

public class KIMS_PatientJourney_OP_Yasasiiweb  extends PageFactoryInitYasasiiWeb{

	public KIMS_PatientJourney_OP_Yasasiiweb(WebDriver driver) {

		super(driver);

	}
	

	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//li[normalize-space()='Miss']")
	public WebElement SelectMr;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;

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

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//i[@class='ki ki-info-circle-fill ng-star-inserted']")
	public WebElement EpisodeIcon;

	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//span[contains(text(),'Encounter')]")
	public WebElement Encounter;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other Information']")
	public WebElement insuranceinfo;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Insurance')]//input[@id='undefined']")
	public WebElement insurance;
	
	@FindBy(xpath = "//ki-select-control[@placeholder='Corporate']//input[@id='undefined']")
	public WebElement Corporate;
	
	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement Plan;

	@FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-star-inserted ng-valid']")
	public WebElement validto;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement referenceLetter;

	@FindBy(xpath = "//input[@id='refno']")
	public WebElement referenceNo;

	@FindBy(xpath = "//ki-calendar[@formcontrolname='validfrom']//input[@type='text']")
	public WebElement fromdate;

	@FindBy(xpath = "//ki-calendar[@formcontrolname='validto']//input[@type='text']")
	public WebElement todate;

	@FindBy(xpath = "//i[@class='ki ki-reference-letter-fill']")
	public WebElement referenceletter;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;

	@FindBy(xpath = "//input[@id='remarksControl']")
	public WebElement Reason;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement referenceLetter1;

	@FindBy(xpath = "//input[@id='refno']")
	public WebElement referencenumber;

	@FindBy(xpath = "//ki-calendar[@formcontrolname='validfrom']//input[@type='text']")
	public WebElement FrmDate;

	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-valid ng-star-inserted ng-touched']")
	public WebElement ToDate;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement ADD;
	
	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement add;

	//login
		@FindBy(xpath = "//input[@id='loginemail']")
		public WebElement userid;

		@FindBy(xpath = "//input[@id='loginpassword']")
		public WebElement password;

		@FindBy(xpath = "//input[@id='loginsite']")
		public WebElement site;

		///doctornote


		@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
		public WebElement MenuToggle;

		@FindBy(xpath = "//label[contains(text(),'Modules')]")
		public WebElement MOdules;

		@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
		public WebElement EMRHomeScreen;

		@FindBy(xpath = "//input[@id='searchtext']")
		public WebElement EnterPatientName;

		@FindBy(xpath = "//input[@id='chiefcomplainttext']")
		public WebElement reasonForVisit;

		@FindBy(xpath = "//input[@id='emrtemplateid']")
		public WebElement Template;

		@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
		public WebElement TemplateOK;


		@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
		public WebElement disgnosis;

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[11]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
		public WebElement diagnosischevckbox;

		@FindBy(xpath = "//div[normalize-space()='CPOE Service']")
		public WebElement CpoeService;

		@FindBy(xpath = "//input[@id='cpoeSearchText']")
		public WebElement CpoeServiceSearch;

		@FindBy(xpath = "//button[@class='icon doctornote']")
		public WebElement DoctorNote;

		@FindBy(xpath = "//input[@id='cpoeSearchDb']")
		public WebElement CpoeServiceSearch1;

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
		public WebElement PlanText;

		@FindBy(xpath = "//button[@class='icon emrsave']")
		public WebElement EmrSave;

		@FindBy(xpath = "(//i[@class='ki ki-execution-pending pendingstatus ng-star-inserted'])[1]")
		public WebElement pending1;

		@FindBy(xpath = "//div[contains(text(),'CPOE Info')]")
		public WebElement CPOEInfo;

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/label[1]/i[1]")
		public WebElement service1;

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[5]/label[1]/i[1]")
		public WebElement service2;

		@FindBy(xpath = "//textarea[@id='remarks']")
		public WebElement Remarks;

		@FindBy(xpath = "//label[normalize-space()='Service Administration']")
		public WebElement Serviceadmin;

		@FindBy(xpath = "//button[@class='icon cpoeadmin']")
		public WebElement CpoeAdministration;

		@FindBy(xpath = "//i[@class='ki ki-save']")
		public WebElement Save1;

		@FindBy(xpath = "(//i[@title='Order Details'])[1]")
		public WebElement orderDetails1;

		@FindBy(xpath = "(//i[@title='Order Details'])[2]")
		public WebElement Orderdeatils2;
	
		@FindBy(xpath = "(//i[@class='ki ki-execution-pending coloredstatus ng-star-inserted'])[1]")
		public WebElement Executed1;
	
		@FindBy(xpath = "//label[normalize-space()='CPOE Orderset']")
		public WebElement CPOEOrderset;

		@FindBy(xpath = "//div[@class='btn-pharmacy-search custom-search']//input[@placeholder='Search With Favorites']")
		public WebElement ordersetSearch;
		
		@FindBy(xpath = "//button[@id='ordersetAdd']")
		public WebElement serviceAdd;
		
		@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-duplicate-medicine-confirmation[1]/div[2]/div[1]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]")
		public WebElement Duplicatevalidation;

		@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
		public WebElement toggle;

		@FindBy(xpath = "//div[normalize-space()='Pharmacy Panel']")
		public WebElement Pharmacypanel;

		@FindBy(xpath = "//div[normalize-space()='OP Panel']")
		public WebElement opPanel;

		@FindBy(xpath = "//input[@id='locationid']")
		public WebElement pharloc;

		@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")
		public WebElement pharlocOK;

		@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
		public WebElement Fo;
		
		@FindBy(xpath = "//div[normalize-space()='OP Orders']")
		public WebElement OPOrder;

		@FindBy(xpath = "//input[@id='searchText']")
		public WebElement counterSearch;

		@FindBy(xpath = "//i[@title='Search']")
		public WebElement counterSearchicon;

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
		public WebElement patientSearch2;

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
		public WebElement medicineCheck;

		@FindBy(xpath = "//button[@id='confirmsave']")
		public WebElement medicineSaveconfirm;

		@FindBy(xpath = "//button[normalize-space()='OK']")
		public WebElement confirmOK;

		@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
		public WebElement status;

		@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
		public WebElement medicineCheck1;

		@FindBy(xpath = "//button[@id='billholdsave']")
		public WebElement holdbillSave;

		@FindBy(xpath = "//button[@id='billingsave']")
		public WebElement BILLsave;

		@FindBy(xpath = "//div[normalize-space()='Dispensing']")
		public WebElement dispensing;


		@FindBy(xpath = "//button[@id='billholdsave']")
		public WebElement dispensed;

		@FindBy(xpath = "//label[@class='check-container zero-top']//span[@class='checkmark']")
		public WebElement checkMedicine;

		@FindBy(xpath = "//div[@class='pat-name']")
		public WebElement PATientselect;

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[2]/div[2]/div[1]/span[1]/i[1]")
		public WebElement counterIcon2;

		@FindBy(xpath = "//i[@title='Substitute Medicine']")
		public WebElement Substitute;

		@FindBy(xpath = "//input[@id='medicinename']")
		public WebElement ItemName;

		@FindBy(xpath = "//div[@class='form-group zero-bottom ki-dropdown']//input[@id='undefined']")
		public WebElement DispenseStatus;

		@FindBy(xpath = "//span[@class='checkmark']")
		public WebElement Dispensedcheckbox;

		@FindBy(xpath = "//button[@id='billholdsave']")
		public WebElement cancelDispensed;

		@FindBy(xpath = "//div[@class='link-value'][normalize-space()='FO']")
		public WebElement FO;

		@FindBy(xpath = "//i[@class='ki ki-info-circle-fill ng-star-inserted']")
		public WebElement episodeIcon;

		@FindBy(xpath = "//input[@id='searchtext']")
		public WebElement FOSearchField;

		@FindBy(xpath = "//input[@id='searchtext']")
		public WebElement FOPatientSelect;

		@FindBy(xpath = "/html/body/modal-container/div/div/app-encounter-episode-view/form/div/div/div/div/div[1]/tabset/div/tab[1]/div/table/tbody/tr[1]/td[2]/label/i")
		public WebElement closeEncounter;

	
		@FindBy(xpath = "//input[@id='department']")
		public WebElement Destination;

		@FindBy(xpath = "//button[@class='btn btn-primary active sm mr0 mt0 mb0']")
		public WebElement closedencSave;

		@FindBy(xpath = "//span[normalize-space()='Insurance and Other Information']")
		public WebElement InsuranceAndcorp;

		@FindBy(xpath = "//ki-select-control[@placeholder='Insurance ']//input[@id='undefined']")
		public WebElement Insurance;

		

		@FindBy(xpath = "//label[normalize-space()='Send for Claim']")
		public WebElement Sendforclaim;

		@FindBy(xpath = "//label[normalize-space()='Response Receive']")
		public WebElement ResponseRecieve;

		@FindBy(xpath = "//a[@id='1-link']//span[contains(text(),'Invoice Generation')]")
		public WebElement invoiceGeneration;

		@FindBy(xpath = "//div[normalize-space()='Generate Statement']")
		public WebElement GenerateStatement;

		@FindBy(xpath = "//div[@class='form-container invoice-gen mb-1']//div[@class='col-md-3']//input[@id='undefined']")
		public WebElement Payertype;

		@FindBy(xpath = "//li[normalize-space()='Company']")
		public WebElement Company;

		@FindBy(xpath = "//div[@class='form-container invoice-gen mb-1']//div[@class='col-md-12 btm-top-mrgn']//div[@class='row']//div[@class='ng-star-inserted']//input[@id='undefined']")
		public WebElement Companyname;

		@FindBy(xpath = "//div[@class='form-container invoice-gen mb-1']//i[@class='ki ki-search']")
		public WebElement Searchstatement;

		@FindBy(xpath = "//tbody/tr[1]/td[2]/i[1]")
		public WebElement statementEye1;

		@FindBy(xpath = "//tbody/tr[2]/td[2]/i[1]")
		public WebElement statementEye2;

		@FindBy(xpath = "//th[@class='ng-star-inserted']//span[@class='checkmark']")
		public WebElement SelectAll;

		@FindBy(xpath = "//button[@title='Save']")
		public WebElement statementSave;

		@FindBy(xpath = "//a[@id='2-link']//span[contains(text(),'Statement View')]")
		public WebElement StatementView;

		@FindBy(xpath = "//body//app-root//div[@class='row']//div[@class='row']//div[1]//ki-select-control[1]//div[1]//input[1]")
		public WebElement Paytype;

		@FindBy(xpath = "//div[@class='form-container invoice-view mb0']//div[@class='col-md-12 btm-top-mrgn']//div[@class='row']//div[@class='ng-star-inserted']//input[@id='undefined']")
		public WebElement Companyname1;

		@FindBy(xpath = "//div[@class='col-md-3 ta-r']//div//i[@class='ki ki-search']")
		public WebElement Searchicon;

		@FindBy(xpath = "//i[@title='View Statement']")
		public WebElement ViewStatement;

		@FindBy(xpath = "//ki-select-control[@placeholder='Statement Status']//input[@id='undefined']")
		public WebElement StatementStatus;

		@FindBy(xpath = "//div[normalize-space()='Settle Statement']")
		public WebElement Settle_Statement;

		@FindBy(xpath = "//i[@title='Settle Statement']")
		public WebElement Settle;

		@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
		public WebElement ThreeDot1;

		@FindBy(xpath = "//label[normalize-space()='Modules']")
		public WebElement module;

		@FindBy(xpath = "//i[@class='ki ki-plus']")
		public WebElement EncounterAdd;
		
		@FindBy(xpath = "//span[normalize-space()='Service']")
		public WebElement Service;

		@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
		public WebElement Addnew;

		@FindBy(xpath = "//input[@id='serviceidBilling']")
		public WebElement servName;

		@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
		public WebElement AddService;

		@FindBy(xpath = "//i[@class='ki ki-save']")
		public WebElement ServSave;
		
		@FindBy(xpath = "//i[contains(@class,'ki ki-bill')]")
		public WebElement finalBilling;

		@FindBy(xpath = "//div[normalize-space()='Generate Invoice']")
		public WebElement GenerateInvoice;

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ki-input-control[1]/div[1]/input[1]")
		public WebElement MRNoEnter;

		@FindBy(xpath = "//div[@class='col-1 pl-0 col-md-1 ta-r']//i[@class='ki ki-search']")
		public WebElement Search;

		@FindBy(xpath = "//i[@class='fa fa-chevron-right ng-star-inserted']")
		public WebElement RightArrow1;

		@FindBy(xpath = "/html/body/app-root/app-layout/main/app-ip-invoice-generation/div/tabset/div/tab[1]/form/div[1]/tabset/div/tab[1]/div/div/table/tbody/tr[2]/td[12]/i")
		public WebElement RightArrow2;

		@FindBy(xpath = "//label[@class='check-container zero-label']//span[@class='checkmark']")
		public WebElement InvoicePrintUncheck;

		@FindBy(xpath = "//tbody/tr[1]/td[1]/i[1]")
		public WebElement eye;

		@FindBy(xpath = "//tbody/tr[1]/td[15]/i[1]")
		public WebElement itemsview1;

		@FindBy(xpath = "//button[normalize-space()='Draft Generate']")
		public WebElement DraftGenerate;

		@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='undefined']")
		public WebElement invoiceMode;

		@FindBy(xpath = "//div[normalize-space()='OP']")
		public WebElement Op;

		@FindBy(xpath = "//button[normalize-space()='OK']")
		public WebElement OK1;
		
		@FindBy(xpath = "//span[normalize-space()='Invoice View']")
		public WebElement InvoiceView;

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
		public WebElement MRNoenter;

		@FindBy(xpath = "//div[contains(@class,'col-12 col-md-3 ta-r')]//i[contains(@class,'ki ki-search')]")
		public WebElement Search2;

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/label[1]/i[1]")
		public WebElement ThreeDot;

		@FindBy(xpath = "//label[normalize-space()='Draft Finalization']")
		public WebElement DraftFinalization;
		
		@FindBy(xpath = "//label[normalize-space()='Generate Invoice']")
		public WebElement GenerateInvoice1;

		@FindBy(xpath = "//i[contains(@class,'ki ki-cheque icon-btn-billing btn-dark-green inline')]")
		public WebElement Cheque;

		@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
		public WebElement issuingBank;

		@FindBy(xpath = "//input[@id='amountPayType']")
		public WebElement Amount;

		@FindBy(xpath = "//input[@id='cheqnoPayType']")
		public WebElement TransactionNo;
		
		@FindBy(xpath = "//label[contains(@title,'Add')]")
		public WebElement Cardadd;

		@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
		public WebElement cardok;
		
		@FindBy(xpath = "//button[normalize-space()='Settle']")
		public WebElement settle;
		
		@FindBy(xpath = "//i[@class='ki ki-cheque icon-btn-billing btn-dark-green inline']")
		public WebElement payment;
		
		@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
		public WebElement Hamberger;
	
	public void patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo) throws InterruptedException, AWTException, IOException {

		///////////////////Register a female patient


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
		ERmob.sendKeys("9845123658");
		Thread.sleep(600);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Add1 );
		Add1.click();
		Thread.sleep(600);

		insuranceinfo.click();
		Thread.sleep(800);
		insurance.click();
		Thread.sleep(800);
		//Corporate.click();
	
		//		JavascriptExecutor js=(JavascriptExecutor)driver;
		//		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//li[normalize-space()='MSD Ins Corp PVT.LTD']")));		
		//		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(500);
		Plan.click();
		driver.findElement(By.xpath("//li[normalize-space()='MSD Full cover']")).click();
		Thread.sleep(500);
		validto.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {

			t.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(300);
			t.keyRelease(KeyEvent.VK_RIGHT);

		}

		t.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);

		add.click();
		Thread.sleep(500);

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

		
		
		driver.findElement(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@id='consentsave']//i[@class='ki ki-save']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1600);
		


	}




	public void encounter( ) throws AWTException, InterruptedException, IOException {



		/////////Provider1		
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		//	printuncheck.click();
		//	Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(2000);
		referenceLetter.click();
		Thread.sleep(1000);
		referencenumber.click();
		Thread.sleep(1000);
		referencenumber.sendKeys("524356346");
		Thread.sleep(1000);

		FrmDate.click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		ToDate.click();
		Thread.sleep(1000);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);

		ADD.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(1000);

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(53);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);

	}
	
	
	public void	DoctorNote(String DOCuser ,String DOCpassword,String MRNo,String OrdersetName ) throws InterruptedException, AWTException, IOException {


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
		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();


		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);

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
		driver.findElement(By.xpath("//div[contains(text(),'Mark as Final')]")).click();
		Thread.sleep(1000); 
		
		
		CPOEOrderset.click();
		Thread.sleep(800);
		ordersetSearch.clear();
		Thread.sleep(800);
		ordersetSearch.sendKeys(OrdersetName , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[normalize-space()='"+OrdersetName+"']")).click();
		Thread.sleep(1000); 
		serviceAdd.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[contains(text(),'G91.2')]//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(1000);
		
		
		Duplicatevalidation.click();
		Thread.sleep(800);
		Duplicatevalidation.sendKeys("Duplicatevalidation");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click();
		Thread.sleep(1000); 
			
		///////cpoe Service	

		CpoeService.click();
		Thread.sleep(1000);
		CpoeServiceSearch.click();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Potassium (ISE Indirect)" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")).click();
//		Thread.sleep(2000);


		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Folic Acid(ECLIA)", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Folic Acid(ECLIA)']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")).click();
//		Thread.sleep(2000);


		EmrSave.click();
		Thread.sleep(3000);

	}

	
	
	public void serviceExecution(String DOCuser ,String DOCpassword,    String MRNo) throws InterruptedException {


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
		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();


		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		CpoeAdministration.click();
		Thread.sleep(1000);

		Serviceadmin.click();
		Thread.sleep(1000);

		service1.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(3000);
		service2.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Remarks");
		Thread.sleep(700);
		Save1.click();
		Thread.sleep(2000);

		orderDetails1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
		Orderdeatils2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='ki ki-file-log'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='ki ki-file-log'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);



	}	

	public void OrderBilling(String adminuser,String adminpassword ,  String MRNo) throws InterruptedException {

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
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

		JavascriptExecutor js= (JavascriptExecutor) driver;//li[normalize-space()='Naufar Center']
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);




		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
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


		Registration.click();
		Thread.sleep(500);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='CPOE Order']")).click();
		Thread.sleep(1000);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(2000);

		act.moveToElement(Executed1).build().perform();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//span[@class='checkmark']")).click();
		//Thread.sleep(1000);
		Save1.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		CPOEInfo.click();
		Thread.sleep(2000);




	}

	
	
	public void PharmacyBilling(String MRNO ,String PROVIDER) throws InterruptedException, AWTException {

		toggle.click();
		Thread.sleep(1000);
		Pharmacypanel.click();
		Thread.sleep(1000);
		opPanel.click();
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
		pharloc.click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(1000);
		pharlocOK.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		OPOrder.click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		Thread.sleep(1000);
	
	
		counterSearch.click();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		// patientSearch2.click();
		Thread.sleep(1000);
		Substitute.click();
		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		Thread.sleep(1000);
		//		QTY.clear();
		//		Thread.sleep(1000);
		//		QTY.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		medicineCheck1.click();
		Thread.sleep(1000);
	
		//medicineCheck.click();	
		Thread.sleep(2000);
		medicineSaveconfirm.click();
		Thread.sleep(2000);
		confirmOK.click(); 
		Thread.sleep(2000);

		status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed'] ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		// patientSearch2.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		medicineCheck1.click();
		Thread.sleep(1000);
		holdbillSave.click();
		Thread.sleep(2000);
		confirmOK.click();
		Thread.sleep(1000);
		status.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[normalize-space()='Stock Reservation']")).click();
		// driver.findElement(By.xpath("//li[normalize-space()='Bill Hold']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		//JavascriptExecutor js= (JavascriptExecutor) driver;
	
		driver.findElement(By.xpath("//label[normalize-space()='Print']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		BILLsave.click();
		Thread.sleep(2000);

		//		Robot t = new Robot();
		//		t.keyPress(KeyEvent.VK_ESCAPE);
		//		Thread.sleep(500);
		//		t.keyRelease(KeyEvent.VK_ESCAPE);
		//		t.keyPress(KeyEvent.VK_ESCAPE);
		//		t.keyRelease(KeyEvent.VK_ESCAPE);
		//		Thread.sleep(1500);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(confirmOK));
		Thread.sleep(2000);
		confirmOK.click();
		Thread.sleep(1000);

		///dispensing 

		dispensing.click();
		Thread.sleep(1000);
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		//counterIcon2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		checkMedicine.click();
		Thread.sleep(1000);
		dispensed.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(1000);


		////dispense cancel	
		DispenseStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dispensed']")).click();
		Thread.sleep(1000);
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
//		counterIcon2.click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Dispensedcheckbox.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa pointer fa-chevron-right ng-star-inserted']")).click();
		Thread.sleep(1000);
		cancelDispensed.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(1000);


		DispenseStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Reported']")).click();
		Thread.sleep(1000);
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		//	counterIcon2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='check-wrapper ng-star-inserted']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		dispensed.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
	
	
	
	}
	
	public void encounterClose(String MRNO, String service1,String service2,String service3,String provider) throws InterruptedException, AWTException {

		toggle.click();
		Thread.sleep(1000);
		FO.click();
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


		FOSearchField.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		FOSearchField.sendKeys(MRNO);
		Thread.sleep(1000);
		FOSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(3000);
		Thread.sleep(500);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		episodeIcon.click();//
		Thread.sleep(1000);
		Encounter.click();
		Thread.sleep(2000);

		//encounter 1

		closeEncounter.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		Reason.click();
		Thread.sleep(1000);
		Reason.sendKeys("%");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Planned - Transfer']")).click();
		Thread.sleep(1000);
		Destination.click();
		Thread.sleep(1000);
		Destination.sendKeys("%");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='External Treatment']")).click();
		Thread.sleep(1000);
		closedencSave.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='btn btn-dark-green btn-primary sm mr0 mb0 mt0 ng-star-inserted']")).click();
		Thread.sleep(1000);



		/////Encounter2

		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		//printuncheck.click();
		//Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(2000);
		EncounterAdd.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//Thread.sleep(1000);


		Thread.sleep(2000);
		referenceLetter.click();
		Thread.sleep(1000);
		referencenumber.click();
		Thread.sleep(1000);
		referencenumber.sendKeys("524356347");
		Thread.sleep(1000);

		FrmDate.click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		ToDate.click();
		Thread.sleep(1000);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);

		ADD.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		SAvesuccess.click();
		Thread.sleep(3000);

		///Service Billing

		Thread.sleep(2000);
		Service.click();
		Thread.sleep(1000);
		Addnew.click();   
		Thread.sleep(1000);
		servName.click();
		Thread.sleep(1000);
		servName.sendKeys(service1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+service1+"']")).click();
		Thread.sleep(1000);

		AddService.click();
		Thread.sleep(1000);
		servName.clear();
		Thread.sleep(1000);
		servName.sendKeys(service2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+service2+"']")).click();

		AddService.click();
		Thread.sleep(1000);
		servName.clear();
		Thread.sleep(1000);
		servName.sendKeys(service3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+service3+"']")).click();

		AddService.click();
		Thread.sleep(1000);
		servName.clear();
		Thread.sleep(1000);
		servName.sendKeys("Bleeding Time");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Bleeding Time']")).click();

		AddService.click();
		Thread.sleep(1000);
		servName.clear();
		Thread.sleep(1000);
		servName.sendKeys("Blood Urea Nitrogen (GLDH Urease kinetic method)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Blood Urea Nitrogen (GLDH Urease kinetic method)']")).click();


		AddService.click();
		Thread.sleep(1000);
		ServSave.click();
		Thread.sleep(1000);

		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);


		Thread.sleep(1000);
		episodeIcon.click();//
		Thread.sleep(2000);
		//	Encounter.click();
		Thread.sleep(2000);

		//encounter 2 closing

		closeEncounter.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		Reason.click();
		Thread.sleep(1000);
		Reason.sendKeys("%");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Planned - Transfer']")).click();
		Thread.sleep(1000);
		Destination.click();
		Thread.sleep(1000);
		Destination.sendKeys("%");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='External Treatment']")).click();
		Thread.sleep(1000);
		closedencSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green btn-primary sm mr0 mb0 mt0 ng-star-inserted']")).click();
		Thread.sleep(2000);



	}

	public void finalbilling(String MRNO) throws InterruptedException {



		Hamberger.click();
		Thread.sleep(1000);
		module.click();
		Thread.sleep(1000);
		finalBilling.click();
		Thread.sleep(1000);
	//	Op.click();
		Thread.sleep(1000);
		GenerateInvoice.click();
		Thread.sleep(1000);

		////Invoice 1

		MRNoEnter.click();
		Thread.sleep(1000);
		MRNoEnter.sendKeys(MRNO);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		RightArrow1.click();
		Thread.sleep(1000);
		//RightArrow2.click();
		Thread.sleep(1000);
		eye.click();
		Thread.sleep(1000);
		itemsview1.click();
		Thread.sleep(1000);
		InvoicePrintUncheck.click();
		Thread.sleep(1000);
		DraftGenerate.click();
		Thread.sleep(1000);
		OK1.click();
		Thread.sleep(1000);

		Thread.sleep(3000);
		InvoiceView.click();
		Thread.sleep(1000);
		MRNoenter.click();
		Thread.sleep(1000);
		MRNoenter.sendKeys(MRNO);
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(2000);

		ThreeDot.click();
		Thread.sleep(1000);
		Sendforclaim.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);

		invoiceMode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sent for Claim']")).click();
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(2000);
		ThreeDot.click();
		Thread.sleep(1000);
		ResponseRecieve.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);


		invoiceMode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Response Received']")).click();
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(2000);
		ThreeDot.click();
		Thread.sleep(1000);
		DraftFinalization.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		invoiceMode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Draft Finalized']")).click();
		Thread.sleep(1000);

		Search2.click();
		Thread.sleep(2000);
		ThreeDot.click();
		Thread.sleep(1000);
		GenerateInvoice1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		invoiceMode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Generated']")).click();
		Thread.sleep(1000);

		/////////////Invoice 2	

		invoiceGeneration.click();
		Thread.sleep(1000);
		MRNoEnter.clear();
		Thread.sleep(1000);
		MRNoEnter.sendKeys(MRNO);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		RightArrow1.click();
		Thread.sleep(1000);
		//RightArrow2.click();
		Thread.sleep(1000);
		eye.click();
		Thread.sleep(1000);
		itemsview1.click();
		Thread.sleep(1000);
		InvoicePrintUncheck.click();
		Thread.sleep(1000);
		DraftGenerate.click();
		Thread.sleep(1000);
		OK1.click();
		Thread.sleep(1000);

		Thread.sleep(3000);
		InvoiceView.click();
		Thread.sleep(1000);

		invoiceMode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Draft']")).click();
		Thread.sleep(1000);	
		MRNoenter.clear();
		Thread.sleep(1000);
		MRNoenter.sendKeys(MRNO);
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(2000);

		ThreeDot.click();
		Thread.sleep(1000);
		Sendforclaim.click();
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);

		invoiceMode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sent for Claim']")).click();
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(1000);
		ThreeDot.click();
		Thread.sleep(1000);
		ResponseRecieve.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);


		invoiceMode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Response Received']")).click();
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(1000);
		ThreeDot.click();
		Thread.sleep(1000);
		DraftFinalization.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		invoiceMode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Draft Finalized']")).click();
		Thread.sleep(1000);

		Search2.click();
		Thread.sleep(1000);
		ThreeDot.click();
		Thread.sleep(1000);
		GenerateInvoice1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		invoiceMode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Generated']")).click();
		Thread.sleep(1000);



		/////----------Statement Settlement

		Hamberger.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Statement']")).click();
		Thread.sleep(1000);
		GenerateStatement.click();
		Thread.sleep(700);
		Payertype.click();
		Thread.sleep(700);
		Company.click();
		Thread.sleep(700);
		Companyname.click();
		driver.findElement(By.xpath("//li[normalize-space()='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(1000);
		Searchstatement.click();
		Thread.sleep(700);
		statementEye1.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		statementEye2.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		SelectAll.click();
		Thread.sleep(700);
		statementSave.click();
		Thread.sleep(700);
		OK1.click();
		Thread.sleep(700);
		StatementView.click();
		Thread.sleep(700);
		Paytype.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Company']")).click();
		Thread.sleep(1000);
		Companyname1.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(1000);
		Searchicon.click();
		Thread.sleep(700);
		ViewStatement.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);		

		ThreeDot1.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//label[normalize-space()='Verify Statement']")).click();
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		OK1.click();
		Thread.sleep(700);


		StatementStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Verified']")).click();
		Thread.sleep(1000);	
		Searchicon.click();
		Thread.sleep(700);
		ThreeDot1.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//label[normalize-space()='Approve Statement']")).click();
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		OK1.click();
		Thread.sleep(1000);
		
		StatementStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);	
		Searchicon.click();
		Thread.sleep(1700);


		/////Statement settle

		Thread.sleep(700);
		Hamberger.click();
		Thread.sleep(1000);
		Settle_Statement.click();
		Thread.sleep(700);
		Paytype.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Company']")).click();
		Thread.sleep(1000);

		Companyname1.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(1000);
		Searchicon.click();
		Thread.sleep(700);
		Settle.click();
		Thread.sleep(700);


		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", payment);
		Thread.sleep(1000);
		String AMOUNT = driver.findElement(By.xpath("(//label[@class='pay-style'])[2]")).getText();
		
		System.out.println(AMOUNT);

		///	converting string into int 

		double i = new Double(AMOUNT);
		
		
	//	int i = Integer.parseInt(AMOUNT);

		double DV =  (i/2); 
		System.out.println(DV);

		///converting double into int

		int Rupee = (int)Math.round (DV) ;


		///converting int into String

		String amount = String.valueOf(Rupee);


		Cheque.click();
		Thread.sleep(1000);
		issuingBank.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(1000);
		Amount.clear();
		Thread.sleep(1000);
		Amount.sendKeys(amount);
		Thread.sleep(1000);
		TransactionNo.sendKeys("9787564");
		Thread.sleep(1000);
		Cardadd.click();
		Thread.sleep(5000);
		cardok.click();
		Thread.sleep(1000);
		settle.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		OK1.click();
		Thread.sleep(1000);

		StatementStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Partially Settled']")).click();
		Thread.sleep(1000);
//		Paytype.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Company']")).click();
//		Thread.sleep(1000);
//
//		Companyname1.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='MSD Ins Corp PVT.LTD']")).click();
//		Thread.sleep(1000);
		Searchicon.click();
		Thread.sleep(1000);
		Settle.click();
		Thread.sleep(1000);
		

//		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", payment);
		Thread.sleep(1000);
		String AMOUNT1 = driver.findElement(By.xpath("(//label[@class='pay-style'])[2]")).getText();
		
		System.out.println(AMOUNT1);
		
		Cheque.click();
		Thread.sleep(1000);
		issuingBank.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(1000);
		Amount.clear();
		Thread.sleep(1000);
		Amount.sendKeys(AMOUNT1);
		Thread.sleep(1000);
		TransactionNo.sendKeys("9787564");
		Thread.sleep(1000);
		Cardadd.click();
		Thread.sleep(5000);
		cardok.click();
		Thread.sleep(1000);
		settle.click();
		Thread.sleep(1000);
		OK1.click();
		Thread.sleep(1000);

	}




}
