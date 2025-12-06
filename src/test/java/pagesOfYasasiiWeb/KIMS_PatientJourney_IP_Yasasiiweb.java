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

public class KIMS_PatientJourney_IP_Yasasiiweb  extends PageFactoryInitYasasiiWeb{

	public KIMS_PatientJourney_IP_Yasasiiweb(WebDriver driver) {

		super(driver);

	}



	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;

	@FindBy(xpath = "//div[@class='module-icon-wrap active ng-star-inserted']//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Title;

	@FindBy(xpath = "//li[normalize-space()='Miss']")
	public WebElement SelectMr;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement EnterFirstNME;

	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lastname;

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

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printUnckeck;	

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add2;
	
	@FindBy(xpath = "//label[normalize-space()='Unreserve']//span[@class='checkmark']")
	public WebElement Unreserve;
	

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//label[contains(@class,'check-container zero-label')]")
	public WebElement printuncheck;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement Addnew;

	@FindBy(xpath = "//input[@id='serviceidBilling']") 
	public WebElement servName;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement AddService;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement ServSave;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']//i[@class='ki ki-plus']")
	public WebElement Add1;


	@FindBy(xpath = "//input[@id='cheqnoPayType']")
	public WebElement TransactionNO;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;

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

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAve;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//label[@title='Add Registration']//i[@class='ki ki-doctor-fill']")
	public WebElement AddRegisteration;

	@FindBy(xpath = "//label[normalize-space()='CPOE Orderset']")
	public WebElement CPOEOrderset;

	@FindBy(xpath = "//div[@class='btn-pharmacy-search custom-search']//input[@placeholder='Search With Favorites']")
	public WebElement ordersetSearch;

	@FindBy(xpath = "//button[@id='ordersetAdd']")
	public WebElement serviceAdd;

	@FindBy(xpath = "/html/body/modal-container/div/div/lib-duplicate-medicine-confirmation/div[2]/div/div[3]/div/ki-input-control/div/input")
	public WebElement Duplicatevalidation;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement category1;

	@FindBy(xpath = "//div[normalize-space()='EMR HomeScreen']")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")    
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement cpoePharmacy;
	
	@FindBy(xpath = "//label[normalize-space()='Active']")
	public WebElement Activemedicine;
	
	@FindBy(xpath = "//label[@class='tab-item ng-star-inserted']")
	public WebElement IPpendingorders;
	

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement medicineSearch;


	@FindBy(xpath = "//div[@class='btn-pharmacy-search def-search']//i[@class='ki ki-favourite-fill']")
	public WebElement uncheckStar;

	@FindBy(xpath = "//input[@placeholder='Search Medicines']")
	public WebElement medicineSelect;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='duration']")
	public WebElement duration;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement AddMedicine;

	@FindBy(xpath = "//button[contains(@class,'icon emrsave')]")
	public WebElement EMRsave;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement Diagnosis;

	@FindBy(xpath = "//div[contains(text(),'Mark as Final')]")
	public WebElement markasFinal;

	@FindBy(xpath = "//input[@id='admndischargestatusid']")
	public WebElement DischargeStatus;

	@FindBy(xpath = "//span[normalize-space()='Discharge Recommendation']")
	public WebElement DisRecom;

	@FindBy(xpath = "//label[contains(text(),'G91.2')]//span[@class='checkmark']")
	public WebElement Diagnosischeckbox;

	@FindBy(xpath = "//div[normalize-space()='CPOE Service']")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeServiceSearch;

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

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle pro-pic tab-prof-wrap']")
	public WebElement Logoutarw;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[contains(@class,'logout list-item')]")
	public WebElement Logoutbutton;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement Logoutconfrm;


	@FindBy(xpath = "//div[normalize-space()='Pharmacy Panel']")
	public WebElement PharmacyPanel;

	@FindBy(xpath = "//div[normalize-space()='IP Panel']")
	public WebElement Ip_panel;

	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement pharmacyLocation;

	@FindBy(xpath = "//button[@id='btnsearch']")
	public WebElement OK1;

	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement Search;

	@FindBy(xpath = "//i[@title='Search']")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIconWB;
	
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIconFB;
	
	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='EMR']")
	public WebElement EMR;

	@FindBy(xpath = "//div[normalize-space()='White Board']")
	public WebElement WhiteBoard;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[8]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement NameSearch;
	
	@FindBy(xpath = "//button[normalize-space()='Physical Discharge']")
	public WebElement PhysicalClearance;
	
	@FindBy(xpath = "//input[@id='enteredbynameview']")
	public WebElement verifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement verifyPassword;

	@FindBy(xpath = "//button[@id='verifyuser']")
	public WebElement verifySave;

	
	@FindBy(xpath = "//i[@title='Pharmacist Verification Pending']")
	public WebElement PharmacistVerification;

	@FindBy(xpath = "//div[@class='form-container pt-1 billing-card cb-40-bottom ng-star-inserted']//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//span[2]//i[1]")
	public WebElement ThreeDot;

	@FindBy(xpath = "//div[@class='form-container pt-1 billing-card cb-40-bottom ng-star-inserted']//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//span[2]//div[1]//div[2]")
	public WebElement pharmacistNote;

	@FindBy(xpath = "//textarea[@id='pharmacistnote']")
	public WebElement TextpharmacistNote;

	@FindBy(xpath = "//label[normalize-space()='To Nurse']//span[@class='checkmark']")
	public WebElement ToProvider;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement Save11;

	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement SelectAll;

	//@FindBy(xpath = "//div[@class='form-container pt-1 billing-card cb-40-bottom ng-star-inserted']//div[3]//div[1]//div[2]//div[2]//div[3]//div[7]//label[1]//i[1]")
	//public WebElement batchdelete;
	@FindBy(xpath = "//*[@id=\"addNewOrder\"]/div[2]/div[3]/div[7]/label[2]/i")
	public WebElement batchdelete;
	
	@FindBy(xpath = "(//i[@title='Stock List'])[1]")
	public WebElement Stockinfo;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-brandpriority[1]/form[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	public WebElement BatchSelect;

	@FindBy(xpath = "//i[@title='Prescription Print']")
	public WebElement prescriptionPrint;

	@FindBy(xpath = "(//i[@title='Medicine Information'])[1]")
	public WebElement MedicineInfo;

	@FindBy(xpath = "(//i[@title='Order Information'])[1]")
	public WebElement Admininfo;

	@FindBy(xpath = "//label[normalize-space()='Label print']//span[@class='checkmark']")
	public WebElement LabelPrint;

	@FindBy(xpath = "//label[normalize-space()='Transfer']")
	public WebElement Transfer;

	@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
	public WebElement Status;

	@FindBy(xpath = "//i[@class='ki ki-inventory']")
	public WebElement Inventory;

	@FindBy(xpath = "//input[@id='sublocationid']")
	public WebElement Location;	

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Transfer']")
	public WebElement transfer;

	@FindBy(xpath = "//div[normalize-space()='Patient Stock Transfer']")
	public WebElement PatientStockTransfer;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='phreqlocid']")
	public WebElement reqLocation;

	@FindBy(xpath = "//input[@id='phreqlocid']")
	public WebElement reqLocation1;

	@FindBy(xpath = "//div[@class='form-group filter-search-close ng-star-inserted']//input[@id='mrno']")
	public WebElement MRNoSearch;

	@FindBy(xpath = "//label[normalize-space()='Submit']//span[@class='checkmark']")
	public WebElement Submit;

	@FindBy(xpath = "//div[@class='searchbar-container lab emr-locked locked']//div[@class='row']//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Status2;

	@FindBy(xpath = "//span[@title='Search']//i[@class='ki ki-search']")
	public WebElement patientstockSearch;

	@FindBy(xpath = "//label[@class='check-container zero-label']//span[@class='checkmark']")
	public WebElement InvoicePrintUncheck;

	@FindBy(xpath = "//i[@class='fa fa-eye']")
	public WebElement eye;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark1;
	
	@FindBy(xpath = "//div[normalize-space()='Stock Transfer']")
	public WebElement Stocktransfer;	

	@FindBy(xpath = "//tab[@id='1']//div[@class='row']//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement transferStatus;

	@FindBy(xpath = "//input[@id='mrno']")
	public WebElement MRNOSearch;

	@FindBy(xpath = "//button[@id='print']")
	public WebElement Print;

	@FindBy(xpath = "//div[normalize-space()='Stock Receive']")
	public WebElement StockRecieve;

	@FindBy(xpath = "//input[@id='phreqlocid']")
	public WebElement ReqLoc;

	@FindBy(xpath = "//label[@class='check-container pl-3']//span[@class='checkmark']")
	public WebElement Recieve;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stockreceive[1]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/input[1]")
	public WebElement RecieveQTY;

	@FindBy(xpath = "//button[@id='btnreceiveStock']")
	public WebElement ReceiveStock;

	@FindBy(xpath = "//div[normalize-space()='Receive Rejected Stock']")
	public WebElement Recieverejected;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Stock']")
	public WebElement Stock;

	@FindBy(xpath = "//div[normalize-space()='Reserved Stock View']")
	public WebElement Reservedstock;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-reserved-stock-view[1]/div[1]/form[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement location;

	@FindBy(xpath = "//button[@id='btnsearch']")
	public WebElement reaserveSearch;

	@FindBy(xpath = "//span[normalize-space()='Update']")
	public WebElement Update;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement search2;

	@FindBy(xpath = "//i[@title='IV Rate Change']")
	public WebElement IVRatechange;
	
	@FindBy(xpath = "//input[@id='rate']")
	public WebElement Rate;
	
	@FindBy(xpath = "//input[@id='remarks']")
	public WebElement Rateremarks;
	
	@FindBy(xpath = "//button[@class='icon cpoeadmin']")
	public WebElement CPOEadministration;
	
	
	
	@FindBy(xpath = "//i[@title='Pharmacist Note']")
	public WebElement Pharmacistverification;
	
	@FindBy(xpath = "//textarea[@id='providernote']")
	public WebElement ProviderAcknowlegement;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[1]")
	public WebElement admin1;

	@FindBy(xpath = "//input[@id='batchnoid']")
	public WebElement Batch;

	@FindBy(xpath = "//input[@id='medicinesource']")
	public WebElement MedicineSource;

	@FindBy(xpath = "//input[@id='medicinesource1']")
	public WebElement MedicineSource1;

	@FindBy(xpath = "//input[@id='batchnoid1']")
	public WebElement batch1;

	@FindBy(xpath = "//input[@id='quantity']")
	public WebElement quantity;

	@FindBy(xpath = "//button[normalize-space()='Consumed Item']")
	public WebElement ConsumedItem;

	@FindBy(xpath = "//i[@class='ki ki-reset']")
	public WebElement Close;
	
	@FindBy(xpath = "//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")
	public WebElement Close1;
	
	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close2;
	

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[2]")    
	public WebElement admin2;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[4]")
	public WebElement admin3;

	@FindBy(xpath = "(//i[@class='ki ki-info-circle admin-info'])[2]")
	public WebElement Admininfo3;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[5]")
	public WebElement admin4;

	@FindBy(xpath = "//input[@id='rejectquantity']")
	public WebElement rejectionQty;

	@FindBy(xpath = "//input[@id='verifiedbyname']")
	public WebElement VerifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement Verifypassword;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[6]")
	public WebElement Admin5;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[11]")
	public WebElement admin6;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[12]")
	public WebElement Admin7;
	
	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[8]")
	public WebElement Admin8;
	
	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[10]")
	public WebElement Admin9;

	@FindBy(xpath = "//i[@class='ki ki-trash']")    
	public WebElement Delete;

	@FindBy(xpath = "//label[@class='check-container m0']//span[@class='checkmark']")
	public WebElement Unusedmedicine;

	@FindBy(xpath = "//button[normalize-space()='Delete Consumption']")
	public WebElement Deletebillposting;


	@FindBy(xpath = "//div[normalize-space()='Back End Billing']")
	public WebElement Backendbilling;

	@FindBy(xpath = "//span[normalize-space()='Pharmacy']")
	public WebElement Pharmacy;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-back-end-billing[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOsearch;

	@FindBy(xpath = "//div[@class='col-lg-2 col-6 mbl-pl0 col-md-2 mb10 icon-space']//i[@class='ki ki-search']")
	public WebElement search;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement BillCheck;

	@FindBy(xpath = "(//i[contains(@class,'ki ki-save')])[2]")
	public WebElement Generate;

	@FindBy(xpath = "//div[@class='col-lg-2 col-6 mbl-pl0 col-md-3 mbl-pl0 mb10']//input[@id='status']")
	public WebElement Status1;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM']")
	public WebElement RCM;

	@FindBy(xpath = "//label[normalize-space()='Patient for Discharge']//span[contains(@class,'checkmark')]")
	public WebElement Dischargecheckbox;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-duplicate-medicine-confirmation[1]/div[2]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement overrideReason;

	@FindBy(xpath = "//div[normalize-space()='Discharge Med']")
	public WebElement Dischargemedicine;

	@FindBy(xpath = "//label[normalize-space()='Dispense']")
	public WebElement Dispense;

	@FindBy(xpath = "//i[contains(@class,'ki ki-bell')]")
	public WebElement taskIcon;

	@FindBy(xpath = "//label[@title='Clinical Pharmacist Clearance']")
	public WebElement ClinicalPharmacistClearance;

	@FindBy(xpath = "//span[@title='My Tasks']")
	public WebElement Mytasks;
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar3']")
	public WebElement Menu;

	@FindBy(xpath = "//div[@class='count ng-star-inserted']")
	public WebElement Task;	

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement fosave;

	@FindBy(xpath = "//div[@class='dl-body']//div[2]")
	public WebElement Visit; 

	@FindBy(xpath = "//span[normalize-space()='Today']")
	public WebElement Today;

	@FindBy(xpath = "//div[@class='form-group zero-bottom ng-star-inserted']//input[@type='text']")
	public WebElement DOD;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement Report;

	@FindBy(xpath = "//ki-checkbox-control[@id='isdiagnosischk']//span[@class='checkmark']")
	public WebElement Disgnosis;

	@FindBy(xpath = "//label[normalize-space()='DS Initiated']//span[@class='checkmark']")
	public WebElement DSInitiated;

	@FindBy(xpath = "//label[normalize-space()='Draft Completed']//span[@class='checkmark']")
	public WebElement DraftCompleted;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement save;

	@FindBy(xpath = "//i[@class='ki ki-file-log']")
	public WebElement LOG1;

	@FindBy(xpath = "//label[@title='Discharge Summary Clearance']")
	public WebElement DSClearance;

	@FindBy(xpath = "//label[@title='Draft Completed']")
	public WebElement DraftCompletedtask;

	@FindBy(xpath = "//label[normalize-space()='Verified']//span[@class='checkmark']")
	public WebElement verified;

	@FindBy(xpath = "//label[normalize-space()='Authorize']//span[@class='checkmark']")
	public WebElement Authorize;

	@FindBy(xpath = "//button[normalize-space()='Print']")
	public WebElement print;

	@FindBy(xpath = "//td[@class='ta-c']//span[@class='checkmark']")
	public WebElement PharmacyCheckbox;
	
	@FindBy(xpath = "//label[@title='Pharmacy Clearance']")
	public WebElement pharmacyClearance;

	@FindBy(xpath = "//td[@class='ta-c']//span[@class='checkmark']")
	public WebElement pharmacyClearanceCheckbox;

	@FindBy(xpath = "//button[@id='verifyuser']//i[@class='ki ki-save']")
	public WebElement verifyuserSave;	

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOSearchField;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOPatientSelect;

	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement disposition;

	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement dischargeStatus;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSave;

	@FindBy(xpath = "//i[contains(@class,'ki ki-bill')]")
	public WebElement finalBilling;

	@FindBy(xpath = "//div[contains(text(),'Invoice Generation')]")
	public WebElement InvoiceGeneration;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNoEnter;

	@FindBy(xpath = "//div[@class='col-1 pl-0 col-md-1 ta-r']//i[@class='ki ki-search']")
	public WebElement search1;

	@FindBy(xpath = "//i[@class='fa fa-chevron-right ng-star-inserted']")
	public WebElement RightArrow1;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-ip-invoice-generation/div/tabset/div/tab[1]/form/div[1]/tabset/div/tab[1]/div/div/table/tbody/tr[2]/td[12]/i")
	public WebElement RightArrow2;

	@FindBy(xpath = "//td[@title='Expand All']//i[@class='fa fa-chevron-right ng-star-inserted']")
	public WebElement itemsview1;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement APPROVE;

	@FindBy(xpath = "//div[normalize-space()='IP']")
	public WebElement IP;

	@FindBy(xpath = "//span[normalize-space()='Invoice View']")
	public WebElement InvoiceView;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNoenter;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/label[1]/button[1]")
	public WebElement Search2;

	@FindBy(xpath = "//div[normalize-space()='Settle Invoice']")
	public WebElement SettleInvoice;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Mrnoenter3;

	@FindBy(xpath = "(//i[@title='Settle Invoice'])[1]")
	public WebElement settleicon1;

	@FindBy(xpath = "//tr[@class='ng-star-inserted']//i[@class='fa fa-chevron-right ng-star-inserted']")
	public WebElement grid1;

	@FindBy(xpath = "//button[normalize-space()='Settle']")
	public WebElement settle;

	@FindBy(xpath = "//i[@class='ki ki-cheque icon-btn-billing btn-dark-green inline']")
	public WebElement payment;

	@FindBy(xpath = "//i[@class='ki ki-cheque icon-btn-billing btn-dark-green inline']")
	public WebElement Cheque;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement issuingBank;

	@FindBy(xpath = "//input[@id='amountPayType']")
	public WebElement Amount;

	@FindBy(xpath = "//label[contains(@title,'Add')]")
	public WebElement Cardadd;

	@FindBy(xpath = "//button[@class='btn btn-primary sm active']")
	public WebElement cardok;

	@FindBy(xpath = "//a[contains(@title,'FO')]//span[1]")
	public WebElement FO;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO1;

	@FindBy(xpath = "//span[normalize-space()='Invoice Adjustment Approval']")
	public WebElement InvoiceadjApprove;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement patientSearch;

	@FindBy(xpath = "//div[@class='col-12 col-md-3 ta-r']//i[@class='ki ki-search']")
	public WebElement invoiceSearch;

	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	public WebElement options;

	@FindBy(xpath = "//label[normalize-space()='Draft Finalization']")
	public WebElement DraftFinalization;

	@FindBy(xpath = "//ki-select-control[@clearval='false']//input[@id='undefined']")
	public WebElement Invoicemode;

	@FindBy(xpath = "//li[normalize-space()='Draft Finalized']")
	public WebElement Draftfinalized;

	@FindBy(xpath = "//label[normalize-space()='Generate Invoice']")
	public WebElement GenerateInvoice;

	@FindBy(xpath = "//button[normalize-space()='Draft Generate']")
	public WebElement DraftGenerate;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/app-billing-adjustment[1]/div[1]/div[2]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement AdjustmentPercentage;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline ml0 ng-star-inserted']")
	public WebElement RaiseRequest;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[2]/a[1]/div[1]")
	public WebElement invoiceCancel;

	@FindBy(xpath = "//i[@title='Request for Adjustment']")
	public WebElement Adjustment;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Authoriser;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement RemarksFB;
	
	@FindBy(xpath = "//button[normalize-space()='Financial Clearance']")
	public WebElement Financial_Clearance;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel Financial Clearance']")
	public WebElement Cancel_Financial_Clearance;
	
	@FindBy(xpath = "//div[normalize-space()='IP Panel']")
	public WebElement IPpanel;
	
	@FindBy(xpath = "//div[normalize-space()='Pharmacy Panel']")
	public WebElement Pharmacypanel;
	
	@FindBy(xpath = "//button[normalize-space()='Department Clearance']") 																		// Clearance']
	public WebElement Depclearance;
	
	@FindBy(xpath = "//button[normalize-space()='Ready for discharge']")
	public WebElement readyForDischarge;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOsearch1;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement remarks;
	
	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement saveButton;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	
	@FindBy(xpath = "(//i[@class='ki ki-execution-pending coloredstatus ng-star-inserted'])[1]")
	public WebElement Executed1;
	
	@FindBy(xpath = "//div[contains(text(),'CPOE Info')]")
	public WebElement CPOEInfo;




	
	
	

	public void Patreg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider) throws InterruptedException, IOException, AWTException {

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
		lastname.click();
		Thread.sleep(500);
		lastname.sendKeys(Lastname);
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


		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement1.size());
		if(dynamicElement1.size() ==0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}



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
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Add1);
		Thread.sleep(600);
		Add1.click();
		Thread.sleep(600);



		HowDidYouKnow.click();
		Thread.sleep(600);
		TV.click();
		Thread.sleep(1000);
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

		///Consent	

		/*driver.findElement(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@id='consentsave']//i[@class='ki ki-save']")).click();
		Thread.sleep(600);
		//driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1600);*/


		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(clear));

		Thread.sleep(2000);
		clear.click();
		Thread.sleep(1000);

		AddRegisteration.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(54);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);
	}

	public void ADT( ) throws InterruptedException {


		/////Admit the patient
		Thread.sleep(2000);
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
			JavascriptExecutor js=(JavascriptExecutor)driver;
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
		SAve.click();
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



		List<WebElement> dynamicElement411=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if(dynamicElement411.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//textarea[@id='undefined']")).sendKeys("Admission charge not required");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='save']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			Thread.sleep(1000);
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);



		///Service Billing
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/label[1]/i[1]")).click();
		Thread.sleep(2000);
		Service.click();
		Thread.sleep(1000);
		Addnew.click();   
		Thread.sleep(1000);



		servName.click();
		Thread.sleep(1000);
		servName.sendKeys("Admission Charge");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Admission Charge']")).click();
		Thread.sleep(1000);
		//AddService.click();
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		ServSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);

	}
	public void doctoreNote (String docid,String docpassword,String MRNO,String OrdersetName) throws InterruptedException {


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

		////////login
		Thread.sleep(3000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);    
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		/////doctornote
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(2000);
		Thread.sleep(500);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);

		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(2000);

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

//		UParrow.click();
//		Thread.sleep(1000);
//		act.doubleClick(UParrow).perform();
//		Thread.sleep(1000);
//		lock.click();
//		Thread.sleep(1000); 
		 DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 


		cheifComplaint.clear();
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(800);
		tempOk.click();
		Thread.sleep(3000);


		///Diagnosis	

		Diagnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);
		//		markasFinal.click();
		//		Thread.sleep(1000);
		//		DisRecom.click();
		//		Thread.sleep(1000); 
		//		Dischargecheckbox.click();
		//		Thread.sleep(1000);
		//		DischargeStatus.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		//		Thread.sleep(1000);


		////cpoe pharmacy



		/////medicine reconsilation

		//		NoCurrentmed.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		//		Thread.sleep(1000);
		//		NoCurrentmedCheck.click();
		//		Thread.sleep(1000);
		//		DischargeReconcile.click();
		//		Thread.sleep(1000);
		//		//AdmsnReconcile.click();
		//		Thread.sleep(1000);
		//		Reconsile.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		Thread.sleep(1000);  


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

		List<WebElement> dynamicElement111=driver.findElements(By.xpath("/html/body/modal-container/div/div/lib-duplicate-medicine-confirmation/div[2]/div/div[3]/div/ki-input-control/div/input"));

		if(dynamicElement111.size() !=0)
		{
			Duplicatevalidation.click();
			Thread.sleep(800);
			Duplicatevalidation.sendKeys("Duplicatevalidation");
			Thread.sleep(800);
			driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click();
			Thread.sleep(1000); 
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);



		CpoeService.click();
		Thread.sleep(1000);
		CpoeServiceSearch.click();

		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Cannulation" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		//		Thread.sleep(2000);

		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("CT Ankle Joint ( Plain)" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='CT Ankle Joint ( Plain)']")).click();
		Thread.sleep(1000);

		//		CpoeServiceSearch.clear();
		//		Thread.sleep(1000);
		//		CpoeServiceSearch.sendKeys("Folic Acid(Eclia)", Keys.ENTER);
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//label[normalize-space()='Folic Acid(Eclia)']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		//		Thread.sleep(2000);

		EMRsave.click();
		Thread.sleep(3000);




	}

	public void serviceExecution() throws InterruptedException {


		Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(CpoeAdministration));	
		Thread.sleep(2000);
		CpoeAdministration.click();
		Thread.sleep(1000);

		Serviceadmin.click();
		Thread.sleep(1000);

		service1.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(1000);
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
	
	public void OrderBilling(String mRNo) throws InterruptedException {
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
		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Pending(IP)']")).click();
		Thread.sleep(1000);
		EnterPatientName.sendKeys(mRNo);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+mRNo+"')])[1]")).click();
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

	public void IPpanel(String FoUser,String MRNo) throws InterruptedException, AWTException {

		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);


		//login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(FinalbillUser);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
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

		PharmacyPanel.click();
		Thread.sleep(800);
		Ip_panel.click();
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

		pharmacyLocation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(800);
		OK1.click();
		Thread.sleep(800);
		Search.clear();
		Thread.sleep(800);
		Search.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(800);
		SearchIcon.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@title='"+MRNo+"']")).click();
		Thread.sleep(1800);
		
		
		
		

		List<WebElement> Reserved =driver.findElements(By.xpath("//i[@title='Pharmacist Verification Pending']"));

		int a= Reserved.size();

		System.out.println(a + "=Pharmacist verification");


		for (int i = 0; i < a; i++) {
			
			PharmacistVerification.click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			Thread.sleep(800);

			act.moveToElement(ThreeDot).build().perform();
			//ThreeDot.click();
			Thread.sleep(800);
			pharmacistNote.click();
			Thread.sleep(800);
			TextpharmacistNote.click();
			Thread.sleep(800);
			ToProvider.click();
			Thread.sleep(1200);
			Save1.click();
			Thread.sleep(800);
			

		}
		
	
		SelectAll.click();
		Thread.sleep(2000);

		batchdelete.click();
		Thread.sleep(800);
		Stockinfo.click();
		Thread.sleep(1200);
		BatchSelect.click();
		Thread.sleep(1200);
		
		Thread.sleep(500);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade blockoutside in show']//label[@class='dialog-title'][normalize-space()='Information']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);
		
		
		
		
//		prescriptionPrint.click();
//		Thread.sleep(5000);
//
//		Robot t=new Robot();
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(400);


		Thread.sleep(800);
		MedicineInfo.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1200);
		Admininfo.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1800);

		LabelPrint.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[normalize-space()='Transfer Summary Print']//span[contains(@class,'checkmark')]")).click();
		
		
		Transfer.click();
		Thread.sleep(3000);   
		
	    Thread.sleep(1500);
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Status));
	    
		Status.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Stock Transferred']")).click();
		Thread.sleep(800);
		Search.clear();
		Thread.sleep(800);
		Search.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(800);
		SearchIcon.click();
		Thread.sleep(1800);
		driver.findElement(By.xpath("//div[@title='"+MRNo+"']")).click();  
		Thread.sleep(800);



	}



	public void Stockreceive(String MRNo) throws InterruptedException, AWTException {


		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(800);	
		Inventory.click();
		Thread.sleep(800);
		Location.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(800);

		transfer.click();
		Thread.sleep(800);
		Stocktransfer.click();
		Thread.sleep(800);
		transferStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(800);

		MRNOSearch.clear();
		Thread.sleep(800);
		MRNOSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//b[normalize-space()='"+MRNo+"']")).click();
		Thread.sleep(1800);

		Print.click();
		Thread.sleep(5000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		StockRecieve.click();
		Thread.sleep(800);

		ReqLoc.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);

		MRNOSearch.clear();
		Thread.sleep(800);
		MRNOSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//b[normalize-space()='"+MRNo+"']")).click();
		Thread.sleep(1800);

		Recieve.click();
		Thread.sleep(800);
//		RecieveQTY.clear();
//		Thread.sleep(800);
//		RecieveQTY.sendKeys("4");
//		Thread.sleep(800);
		ReceiveStock.click();
		Thread.sleep(800);
//		driver.findElement(By.xpath("//input[@id='text']")).sendKeys("The provided medicine number fails safety checks and cannot be accepted.ThankYou");
//		Thread.sleep(800);
		//driver.findElement(By.xpath("//div[@class='col-md-12']//button[@type='button'][normalize-space()='OK']")).click();
		//Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);




	}

	public void IPMedicineAdministration( String MRNO) throws InterruptedException {

		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);


		//login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000); 
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(2000);
		Thread.sleep(500);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='My Location(IP)']")).click();
		Thread.sleep(1000);

		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(2000);

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
		
		////pharmacist note verification
		
		List<WebElement> Reserved =driver.findElements(By.xpath("//i[@title='Pharmacist Note']"));

		int a= Reserved.size();

		System.out.println(a + "=Pharmacist verification");


		for (int i = 0; i < a; i++) {
			
			Pharmacistverification.click();
			Thread.sleep(1000);
			ProviderAcknowlegement.click();
			Thread.sleep(1000);
			Save1.click();
			Thread.sleep(1000);
			
		}
		
	
		Thread.sleep(1000);
		CPOEadministration.click();
		Thread.sleep(1500);
		
		IVRatechange.click();
		Thread.sleep(500);
		Rate.clear();
		Thread.sleep(500);
		Rate.sendKeys("150");
		Thread.sleep(500);
		Rateremarks.sendKeys("OK");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(2000);

		//////////Dextrose
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.elementToBeClickable(admin2));
//
//		 Thread.sleep(2000);
//		admin2.click();
//
//		Thread.sleep(1000);
//		MedicineSource.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='locmedbrnadid']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
//		Thread.sleep(1000);
//
//		Batch.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//
//		MedicineSource1.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
//		Thread.sleep(1000);
//		batch1.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/ul[1]/app-list-item[1]/li[1]")).click();
//		Thread.sleep(1000);
//		//Add.click();
// 
//		Thread.sleep(500);
//		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//		if(dynamicElement11.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		Thread.sleep(2000);
//
//		Save1.click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		Thread.sleep(1000);
//		
//		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//label[@class='dialog-title'][normalize-space()='Confirmation']"));
//
//		if(dynamicElement111.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		List<WebElement> dynamicElement01=driver.findElements(By.xpath("//input[@id='verifiedbyname']"));
//
//		if(dynamicElement01.size() !=0)
//		{
//			VerifiedBy.sendKeys("Anitha R (NGL17697)");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//li[normalize-space()='Anitha R (NGL17697)']")).click();
//			Thread.sleep(1000);
//			Verifypassword.click();
//			Thread.sleep(1000);
//			Verifypassword.sendKeys(Password);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
//			Thread.sleep(1000);
//		}
//		else {
//			System.out.println("NO second nurse verification");
//		}
//		//Save1.click();
//		Thread.sleep(6000);
//		
//		admin2.click();
//		Thread.sleep(2000);
//	
//		quantity.clear();
//		Thread.sleep(1000);
//		quantity.sendKeys("250");
//		Thread.sleep(1000);
//		Add.click();
//
//		Thread.sleep(500);
//		List<WebElement> dynamicElement1111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//		if(dynamicElement1111.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		Thread.sleep(2000);
//
//		Save1.click();
//		Thread.sleep(2000);
//		List<WebElement> dynamicElement011=driver.findElements(By.xpath("//input[@id='verifiedbyname']"));
//
//		if(dynamicElement011.size() !=0)
//		{
//			VerifiedBy.sendKeys("Anitha R (NGL17697)");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//li[normalize-space()='Anitha R (NGL17697)']")).click();
//			Thread.sleep(1000);
//			Verifypassword.click();
//			Thread.sleep(1000);
//			Verifypassword.sendKeys(Password);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
//			Thread.sleep(1000);
//		}
//		else {
//			System.out.println("NO second nurse verification");
//		}
//		Thread.sleep(2000);
//		ConsumedItem.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
//		
//		Thread.sleep(1000);
//
//
//		//////////Agotin
//
//		Thread.sleep(1000);
//		admin1.click();
//		Thread.sleep(1000);
//
//		MedicineSource.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='locmedbrnadid']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
//		Thread.sleep(1000);
//		Batch.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
//		Thread.sleep(1000);
//		Add.click();
//
//		Thread.sleep(500);
//		List<WebElement> dynamicElement4=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//		if(dynamicElement4.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		Thread.sleep(2000);
//
//		Save1.click();
//		Thread.sleep(3000);
//		List<WebElement> dynamicElement0111=driver.findElements(By.xpath("//input[@id='verifiedbyname']"));
//
//		if(dynamicElement0111.size() !=0)
//		{
//			VerifiedBy.sendKeys("Anitha R (NGL17697)");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//li[normalize-space()='Anitha R (NGL17697)']")).click();
//			Thread.sleep(1000);
//			Verifypassword.click();
//			Thread.sleep(1000);
//			Verifypassword.sendKeys(Password);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
//			Thread.sleep(1000);
//		}
//		else {
//			System.out.println("NO second nurse verification");
//		}
//		Thread.sleep(2000);
//
//		///Ahaglow	
//		
//		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(admin3));
//
//		Thread.sleep(2000);
//		admin3.click();
//		
//		Thread.sleep(1000);
//
//		MedicineSource.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='locmedbrnadid']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
//		Thread.sleep(1000);
//		Batch.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
//		Thread.sleep(1000);
//		Add.click();
//
//		Thread.sleep(500);
//		List<WebElement> dynamicElement41=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//		if(dynamicElement41.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		Thread.sleep(2000);
//
//		Save1.click();
//		Thread.sleep(2000);
//
//		List<WebElement> dynamicElement01111=driver.findElements(By.xpath("//input[@id='verifiedbyname']"));
//
//		if(dynamicElement01111.size() !=0)
//		{
//			VerifiedBy.sendKeys("Anitha R (NGL17697)");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//li[normalize-space()='Anitha R (NGL17697)']")).click();
//			Thread.sleep(1000);
//			Verifypassword.click();
//			Thread.sleep(1000);
//			Verifypassword.sendKeys(Password);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
//			Thread.sleep(1000);
//		}
//		else {
//			System.out.println("NO second nurse verification");
//		}
//
//
//		Thread.sleep(2000);
//		Admininfo3.click();
//		Thread.sleep(2000);
//
//		///////////Corex	
//		
//
//		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(admin4));
//
//		Thread.sleep(2000);
//		admin4.click();
//		
//		Thread.sleep(1000);
//		
//
//		MedicineSource.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='locmedbrnadid']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
//		Thread.sleep(1000);
//		Batch.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
//		Thread.sleep(1000);
////		rejectionQty.click();
////		Thread.sleep(1000);
////		rejectionQty.sendKeys("0");
////		Thread.sleep(1000);
//
//		Add.click();
//		Thread.sleep(500);
//		List<WebElement> dynamicElement5=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//		if(dynamicElement5.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		Thread.sleep(2000);
//
//		Save1.click();
//		Thread.sleep(2000);
//
//		List<WebElement> dynamicElement001=driver.findElements(By.xpath("//input[@id='verifiedbyname']"));
//
//		if(dynamicElement001.size() !=0)
//		{
//			VerifiedBy.sendKeys("Anitha R (NGL17697)");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//li[normalize-space()='Anitha R (NGL17697)']")).click();
//			Thread.sleep(1000);
//			Verifypassword.click();
//			Thread.sleep(1000);
//			Verifypassword.sendKeys(Password);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
//			Thread.sleep(1000);
//		}
//		else {
//			System.out.println("NO second nurse verification");
//		}
//		Thread.sleep(2000);
//
//
//
//		/////fiasp	
//		
//
//		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//	//rejqntiynotcame    wait.until(ExpectedConditions.elementToBeClickable(Admin5));
//
//		Thread.sleep(2000);
//		Admin5.click();
//		
//		Thread.sleep(1000);
//		
//		
//		MedicineSource.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='locmedbrnadid']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
//		Thread.sleep(1000);
//		Batch.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
//		Thread.sleep(1000);
//
//
//		rejectionQty.click();
//		Thread.sleep(1000);
//		rejectionQty.sendKeys("0");
//		Thread.sleep(1000);
//		Add.click();
//
//		Thread.sleep(500);
//		List<WebElement> dynamicElement51=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//		if(dynamicElement51.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		Thread.sleep(2000);
//
//
//
//		Save1.click();
//		Thread.sleep(2000);
//
//		List<WebElement> dynamicElement61=driver.findElements(By.xpath("//input[@id='verifiedbyname']"));
//
//		if(dynamicElement61.size() !=0)
//		{
//			VerifiedBy.sendKeys("Anitha R (NGL17697)");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//li[normalize-space()='Anitha R (NGL17697)']")).click();
//			Thread.sleep(1000);
//			Verifypassword.click();
//			Thread.sleep(1000);
//			Verifypassword.sendKeys(Password);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
//			Thread.sleep(1000);
//		}
//		else {
//			System.out.println("NO second nurse verification");
//		}
//
//		
////	////////////////////
//		
//		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(Admin8));
//	    Thread.sleep(2000);
//		Admin8.click();
//				
//		Thread.sleep(1000);
//
//		;
//
//		MedicineSource.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='locmedbrnadid']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
//		Thread.sleep(1000);
//		Batch.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
//		Thread.sleep(1000);
//
//
//		rejectionQty.click();
//		Thread.sleep(1000);
//		rejectionQty.sendKeys("0");
//		Thread.sleep(1000);
//		Add.click();
//
//		Thread.sleep(500);
//		List<WebElement> dynamicElement5a1=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//		if(dynamicElement5a1.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		Thread.sleep(2000);
//
//
//
//		Save1.click();
//		Thread.sleep(2000);
//
//		List<WebElement> dynamicElement6a1=driver.findElements(By.xpath("//input[@id='verifiedbyname']"));
//
//		if(dynamicElement6a1.size() !=0)
//		{
//			VerifiedBy.sendKeys("Anitha R (NGL17697)");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//li[normalize-space()='Anitha R (NGL17697)']")).click();
//			Thread.sleep(1000);
//			Verifypassword.click();
//			Thread.sleep(1000);
//			Verifypassword.sendKeys(Password);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
//			Thread.sleep(1000);
//		}
//		else {
//			System.out.println("NO second nurse verification");
//		}

		///////////////////////////////

		
	
		////pantocid		

		Thread.sleep(500);
		List<WebElement> dynamicElement6=driver.findElements(By.xpath("(//i[@class='ki-user-drug ki'])[11]"));

		if(dynamicElement6.size() !=0)
		{
			
			Thread.sleep(2000);
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(admin6));
		    Thread.sleep(2000);
		    admin6.click();
					
			Thread.sleep(1000);

			MedicineSource.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
			Thread.sleep(1000);

			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='locmedbrnadid']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
			Thread.sleep(1000);
			Batch.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
			Thread.sleep(1000);
			
			
			List<WebElement> dynamicElement5511=driver.findElements(By.xpath("//input[@id='rejectquantity']"));

			if(dynamicElement5511.size() !=0)
			{
				Thread.sleep(1000);
				rejectionQty.click();
				Thread.sleep(1000);
				rejectionQty.sendKeys("0");
				Thread.sleep(1000);

			}


			else {
				System.out.println("sri");
			}
			
			Add.click();

			Thread.sleep(500);
			List<WebElement> dynamicElement511=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

			if(dynamicElement511.size() !=0)
			{
				driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			}


			else {
				System.out.println("sri");
			}
			Thread.sleep(2000);

			Save1.click();
			Thread.sleep(2000);
		}


		else {
			System.out.println("sri");
		}


		/////////////suncross		



		Thread.sleep(500);
		List<WebElement> dynamicElement611=driver.findElements(By.xpath("(//i[@class='ki-user-drug ki'])[12]"));

		if(dynamicElement611.size() !=0)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(Admin7));
		    Thread.sleep(2000);
		    Admin7.click();
			
			Thread.sleep(1000);

			MedicineSource.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
			Thread.sleep(1000);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='locmedbrnadid']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
			Thread.sleep(1000);

			Batch.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
			Thread.sleep(1000);
			
			
			List<WebElement> dynamicElement5511=driver.findElements(By.xpath("//input[@id='rejectquantity']"));

			if(dynamicElement5511.size() !=0)
			{
				Thread.sleep(1000);
				rejectionQty.click();
				Thread.sleep(1000);
				rejectionQty.sendKeys("0");
				Thread.sleep(1000);

			}


			else {
				System.out.println("sri");
			}
			
			List<WebElement> dynamicElement5111=driver.findElements(By.xpath("//label[@class='addition']"));

			if(dynamicElement5111.size() !=0)
			{
				Thread.sleep(2000);
				Add.click();
				Thread.sleep(500);
			}


			else {
				System.out.println("sri");
			}

			Thread.sleep(500);
			List<WebElement> dynamicElement6111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

			if(dynamicElement6111.size() !=0)
			{
				driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			}


			else {
				System.out.println("sri");
			}
			Thread.sleep(2000);

			Save1.click();
			Thread.sleep(1000);
			List<WebElement> dynamicElement011111=driver.findElements(By.xpath("//input[@id='verifiedbyname']"));

			if(dynamicElement011111.size() !=0)
			{
				VerifiedBy.sendKeys("Anitha R (NGL17697)");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='Anitha R (NGL17697)']")).click();
				Thread.sleep(1000);
				Verifypassword.click();
				Thread.sleep(1000);
				Verifypassword.sendKeys(Password);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
				Thread.sleep(1000);
			}
			else {
				System.out.println("NO second nurse verification");
			}
			Thread.sleep(2000);
			ConsumedItem.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
			
			Thread.sleep(1000);
			Thread.sleep(2000);
			
			
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='adm-xl-body p-0 footer-open']//div[3]//div[4]//div[1]//span[2]//label[1]//i[1]")));
			
//			act.moveToElement(admin4).build().perform();
//		    Thread.sleep(2000);
//	
//			js.executeScript("arguments[0].scrollIntoView();", admin4);		
//		    admin4.click();
			
            driver.findElement(By.xpath("//div[@class='adm-xl-body p-0 footer-open']//div[3]//div[4]//div[1]//span[2]//label[1]//i[1]")).click();
			
			Thread.sleep(1000);
		    
		    
			
			Thread.sleep(2000);
			Delete.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(1000);
			Save1.click();
			Thread.sleep(2000);
			Thread.sleep(1000);
			List<WebElement> dynamicElement911=driver.findElements(By.xpath("//input[@id='verifiedbyname']"));

			if(dynamicElement911.size() !=0)
			{
				VerifiedBy.sendKeys("Anitha R (NGL17697)");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='Anitha R (NGL17697)']")).click();
				Thread.sleep(1000);
				Verifypassword.click();
				Thread.sleep(1000);
				Verifypassword.sendKeys(Password);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
				Thread.sleep(1000);
			}
			else {
				System.out.println("NO second nurse verification");
			}
			Thread.sleep(2000);
			ConsumedItem.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
			

			ConsumedItem.click();
			Thread.sleep(1000);
			Unusedmedicine.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@class='check-container zero-top']//span[@class='checkmark']")).click();
			Thread.sleep(1000);
			Deletebillposting.click();
			Thread.sleep(2000);


		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);






	}

	public void BackendBillgeneration(String MRNO ) throws InterruptedException, AWTException {
		
		
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);


		//login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(FinalbillUser);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(800);
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
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

		RCM.click();
		Thread.sleep(800);
		Backendbilling.click();
		Thread.sleep(800);

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

		Pharmacy.click();
		Thread.sleep(800);
		MRNOsearch.click();
		Thread.sleep(800);
		MRNOsearch.sendKeys(MRNO);
		Thread.sleep(800);
		search.click();
		Thread.sleep(800);
		BillCheck.click();
		Thread.sleep(800);
		Generate.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1800);


		Status1.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Billed']")).click();
		Thread.sleep(1800);
		Thread.sleep(800);
		MRNOsearch.click();
		Thread.sleep(800);
		MRNOsearch.sendKeys(MRNO);
		Thread.sleep(800);
		search.click();
		Thread.sleep(800);


	}

	public void doctoreNote_discharge(String docid,String docpassword,String MRNO ) throws InterruptedException {


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

		////////login
		Thread.sleep(3000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);    
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		/////doctornote
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(2000);
		Thread.sleep(500);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);

		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(2000);

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

		/*	UParrow.click();
	Thread.sleep(1000);
	act.doubleClick(UParrow).perform();
	Thread.sleep(1000);
	lock.click();
	Thread.sleep(1000); */
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 


		cheifComplaint.clear();
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(800);
		tempOk.click();
		Thread.sleep(1000);


		///Diagnosis	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(EMRsave));

		Diagnosis.click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);
		markasFinal.click();
		Thread.sleep(1000);
		DisRecom.click();
		Thread.sleep(1000); 
		Dischargecheckbox.click();
		Thread.sleep(1000);
		DischargeStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);


		////cpoe pharmacy

		cpoePharmacy.click();
		Thread.sleep(1000);
		uncheckStar.click();
		Thread.sleep(2000);
		medicineSearch.click();
		Thread.sleep(1000);
		medicineSearch.sendKeys("MIRAGO 25MG TAB", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
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
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END); 
		Thread.sleep(1000);
		Diagnosischeckbox.click();
		Thread.sleep(1000);

		/////medicine reconsilation

		//	NoCurrentmed.click();
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		//	Thread.sleep(1000);
		//	NoCurrentmedCheck.click();
		//	Thread.sleep(1000);
		//	DischargeReconcile.click();
		//	Thread.sleep(1000);
		//	//AdmsnReconcile.click();
		//	Thread.sleep(1000);
		//	Reconsile.click();
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//	Thread.sleep(1000);  
		AddMedicine.click();
		Thread.sleep(1000);
//		overrideReason.click();
//		Thread.sleep(1000);
//		overrideReason.sendKeys("ok");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click(); 
//		Thread.sleep(1500);

		Thread.sleep(2000);
		medicineSearch.clear();
		Thread.sleep(1000);
		medicineSearch.sendKeys("DOLO 650MG TAB", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
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
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END); 
		Thread.sleep(1000);
		Diagnosischeckbox.click();
		Thread.sleep(1000);
		AddMedicine.click();
		Thread.sleep(1000);
//		overrideReason.click();
//		Thread.sleep(1000);
//		overrideReason.sendKeys("ok");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click(); 
//		Thread.sleep(1500);

		EMRsave.click();
		Thread.sleep(3000);




	}


	public void IPpanel_DischargeMedicine(String MRNo) throws InterruptedException, AWTException {

		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);


		//login
	    userid.click();
		Thread.sleep(1000);
		userid.sendKeys(FinalbillUser);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
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
		
				PharmacyPanel.click();
				Thread.sleep(800);
				Ip_panel.click();
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
		
				pharmacyLocation.click();
				Thread.sleep(800);
				driver.findElement(By.xpath("//li[normalize-space()='Base_Nagercoil_Central']")).click();
				Thread.sleep(800);
				OK1.click();
				Thread.sleep(800);
		
				Dischargemedicine.click();
				Thread.sleep(1000);
		
				Search.clear();
				Thread.sleep(800);
				Search.sendKeys(MRNo , Keys.ENTER);
				Thread.sleep(800);
				SearchIcon.click();
				Thread.sleep(800);
				driver.findElement(By.xpath("//div[@title='"+MRNo+"']")).click();
				Thread.sleep(1800);
		
				
				
				List<WebElement> Reserved =driver.findElements(By.xpath("//i[@title='Pharmacist Verification Pending']"));

				int a= Reserved.size();

				System.out.println(a + "=Pharmacist verification");


				for (int i = 0; i < a; i++) {
					
					PharmacistVerification.click();
					Thread.sleep(800);
					driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
					Thread.sleep(800);
					driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
					Thread.sleep(800);

//					act.moveToElement(ThreeDot).build().perform();
//					//ThreeDot.click();
//					Thread.sleep(800);
//					pharmacistNote.click();
//					Thread.sleep(800);
//					TextpharmacistNote.click();
//					Thread.sleep(800);
//					ToProvider.click();
//					Thread.sleep(1200);
//					Save1.click();
//					Thread.sleep(800);
					

				}				
				SelectAll.click();
				Thread.sleep(800);
				LabelPrint.click();
				Thread.sleep(800);
				driver.findElement(By.xpath("//label[contains(text(),'Dispense Summary Print')]")).click();
				Thread.sleep(2000);
				Dispense.click();
				Thread.sleep(1500); 
		
				////Clinical Pharmacist Clearance
		
		
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
					Thread.sleep(1000);
					userid.sendKeys(FinalbillUser  );
					Thread.sleep(1000);
					password.click();
					password.sendKeys(Password); 
					Thread.sleep(1000);
					site.click();
					Thread.sleep(1000);
					//JavascriptExecutor js= (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
					driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
					Thread.sleep(5000);
//				//
//				//	
//		
//				//	
					/* repeat Thread.sleep(3000);
					Hamberger.click();
					Thread.sleep(1000);
					//FO1.click();
					Thread.sleep(1000);
					Pharmacypanel.click();
					
					Thread.sleep(1000);
					IPpanel.click();
				
					Thread.sleep(500);
					List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
				
					if(dynamicElement11.size() !=0)
					{
						driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
					}
				
				
					else {
						System.out.println("sri");
					}
					Thread.sleep(2000);
					
					
					Close1.click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/div[1]/div[1]/div[5]/label[1]/span[1]/span[1]")).click();

				//taskIcon.click();
				Thread.sleep(1000);
				ClinicalPharmacistClearance.click();
				Thread.sleep(1000);
		
				Searchfield.sendKeys(MRNo, Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[5]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				Thread.sleep(1000);
				//driver.findElement(By.xpath("//label[normalize-space()='New Order']")).click();
				//Thread.sleep(1000);
				//driver.findElement(By.xpath("//label[@class='check-container cust-label-chk']//span[@class='checkmark']")).click();
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();*/
				Thread.sleep(1000); 

	}

	public void patient_stockreturn(String MRNo) throws InterruptedException {


		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		//driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(800);	
		Inventory.click();
		Thread.sleep(800);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);


		Location.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='North Central pharmacy']")).click();
		Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(800);

		//	Thread.sleep(1000);
		//	Hamburger.click();
		Thread.sleep(800);
		transfer.click();	
		Thread.sleep(800);
		PatientStockTransfer.click();
		Thread.sleep(800);
		reqLocation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Base_Nagercoil_Central']")).click();
		Thread.sleep(800);
		MRNoSearch.clear();
		Thread.sleep(800);
		MRNoSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//i[@class='ki ki-search']")).click();
		Thread.sleep(800);
		
		
		

		for (int i = 0; i <3; i++) {
			driver.findElement(By.xpath("//ki-checkbox-control[@id='selectall']//span[@class='checkmark']")).click();
			Thread.sleep(400);
		}

		Unreserve.click();
		Thread.sleep(800);

	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Add2);		

		Add2.click();
		Thread.sleep(800);
		Submit.click();
		Thread.sleep(800);
		Save1.click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);

		 Status2.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Submitted']")).click();
		Thread.sleep(1000);
		patientstockSearch.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//b[normalize-space()='"+MRNo+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='checkmark ng-star-inserted']")).click();
		Thread.sleep(1000);
		Update.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);

		Status2.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Verified']")).click();
		Thread.sleep(1000);
		patientstockSearch.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//b[normalize-space()='"+MRNo+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='checkmark ng-star-inserted']")).click();
		Thread.sleep(1000);

		Update.click();
		Thread.sleep(1800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 
		
		
		Status2.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		patientstockSearch.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//b[normalize-space()='"+MRNo+"']")).click();
		Thread.sleep(1000);

		Hamburger.click();
		Thread.sleep(800);
		StockRecieve.click();
		Thread.sleep(800);

		reqLocation1.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='col-md-5 plt-prt-5']//li[@class='uparrow-yellow'][normalize-space()='Base_Nagercoil_Central']")).click();
		Thread.sleep(1000);

		search2.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//b[normalize-space()='"+MRNo+"']")).click();
		Thread.sleep(1000);

		Recieve.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);

		///Unreserve stock

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		Stock.click();
		Thread.sleep(800);
		Reservedstock.click();
		Thread.sleep(800);
		location.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[@title='Base_Nagercoil_Central']")).click();
		Thread.sleep(1000);
		MRNOSearch.clear();
		Thread.sleep(800);
		MRNOSearch.sendKeys(MRNo);
		Thread.sleep(800);
		reaserveSearch.click();


		List<WebElement> Reserved =driver.findElements(By.xpath("//span[@class='ellipsis']"));

		int a= Reserved.size();

		System.out.println(a + "=reserved stock numbers");


		for (int i = 0; i < a; i++) {

			driver.findElement(By.xpath("//span[@class='ellipsis']")).click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			Thread.sleep(1000);

		}

	}

	
	
	public void doctoreNote1 (String docid,String docpassword,String MRNO) throws InterruptedException {


		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);

		////////login
		Thread.sleep(3000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);    
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		/////doctornote
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(2000);
		Thread.sleep(500);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);

		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(2000);

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

		/*	UParrow.click();
		Thread.sleep(1000);
		act.doubleClick(UParrow).perform();
		Thread.sleep(1000);
		lock.click();
		Thread.sleep(1000); */
		DoctorNote.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Edit Existing Note']")).click();
		Thread.sleep(3000);
	
		cpoePharmacy.click();
		Thread.sleep(1000);
		//Activemedicine.click();
		IPpendingorders.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//i[@class='ki ki-diagnosis']")));
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(800);
		
		List<WebElement> Reserved =driver.findElements(By.xpath("//i[@class='ki ki-diagnosis']"));

		int a= Reserved.size();

		System.out.println(a + "=ip pending orders");
		Thread.sleep(1000);
		
		for (int i = 0; i < a; i++) {
			
			
			int b= i+1;
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//div["+b+"]//div[1]//div[2]//div[1]//i[1]")).click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//div[@class='multi-action']//div[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='discontinueremarks']")).sendKeys("Discontinuing Medicie ");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
			Thread.sleep(1000);
			
		

		}
	

		Thread.sleep(1000);
		EMRsave.click();
		Thread.sleep(3000);
	
	}
	
	public void clinicalPharmasistclearance(String MRNo, String NurseID, String adminPassword)
			throws InterruptedException {
		
		
		
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

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(Pharmacist_Id);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		//// Clinical Pharmacist Clearance

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		FO1.click();
		Thread.sleep(1000);
		 Pharmacypanel.click();
		
		Thread.sleep(1000);
		IPpanel.click();

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

		 Close2.click();
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(taskIcon));
		
		
		
		
		 taskIcon.click();
		Thread.sleep(1000);
		ClinicalPharmacistClearance.click();
		Thread.sleep(1000);

		Searchfield.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[5]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"))
				.click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//label[normalize-space()='New
		// Order']")).click();
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//label[@class='check-container
		// cust-label-chk']//span[@class='checkmark']")).click();
		// Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
	}

	//// ready for discharge // nurse
	public void readyForDischarge(String MRNo,  String Pharmacist_Id, String adminPassword)
			throws InterruptedException {

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

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		/// driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(2000);

		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIconWB.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView();", readyForDischarge);
		Thread.sleep(2000);
		act.moveToElement(readyForDischarge).click().build().perform();
		Thread.sleep(2000);

		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + NurseID + "')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000); 

		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		// Depclearance.click();
		Thread.sleep(1000);

		PharmacyCheckbox.click();
		Thread.sleep(1000);

		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + NurseID + "')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);

	}


	public void dischargeApproval(String MRNO , String nurseUser , String  NursePassword , String Pharmacist_Id, String Pharmacist_password) throws InterruptedException, AWTException {

		////ready for discharge


		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize1 =driver.getWindowHandles().size();
		int windowopen1= Windowsize1-1;

		driver.switchTo().window(tabs1.get(windowopen1));
		driver.switchTo().window(tabs1.get(windowopen1));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js1= (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);


		///	driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(2000);

		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		Mytasks.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Ready For Discharge']")).click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO, Keys.ENTER);

		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(3000);
		
	
		
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);


	}






	public void Discharge_Summary_Clearance(String MRDUser, String MRDPassword,String MRNO,String DOCuser,String DOCpassword) throws InterruptedException, AWTException {

//

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
		Thread.sleep(1000);
		userid.sendKeys(MRDID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);	

		Menu.click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);

		Task.click();
		Thread.sleep(1000);
		DSClearance.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='dl-body']//div[2]"));

		if(dynamicElement.size() ==0)
		{
			driver.findElement(By.xpath("//button[@class='icon discharesum']")).click();
			Thread.sleep(2000);	
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);		

		
		Visit.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(DOD));
		Thread.sleep(2000);		
		
		
		DOD.click();
		Thread.sleep(1000);
		Today.click();
		Thread.sleep(1000);
		Report.click();
		Thread.sleep(1000);
		Report.sendKeys("ChatGPT is a chatbot developed by OpenAI and launched on November 30, 2022. Based on large language models, it enables users to refine and steer a conversation towards a desired length, format, style,");
		Thread.sleep(1000);
		Disgnosis.click();
		Thread.sleep(1000);
		DSInitiated.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(3000);


		Visit.click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(DraftCompleted));
		Thread.sleep(2000);		
		
		DraftCompleted.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(3000);

		Visit.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Preview']")));
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
		Thread.sleep(3000);	
		LOG1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']//i[@class='ki ki-close-circle']")).click();
		Thread.sleep(3000);	



		////Doctor verification

		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);


		//login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
//			JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);


		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(2000);

		Task.click();
		Thread.sleep(1000);
		DraftCompletedtask.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		
		

		List<WebElement> dynamicElement14=driver.findElements(By.xpath("//div[@class='dl-body']//div[2]"));

		if(dynamicElement14.size() ==0)
		{
			driver.findElement(By.xpath("//button[@class='icon discharesum']")).click();
			Thread.sleep(2000);	
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);		

		Visit.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(verified));
		Thread.sleep(2000);		
		
		
		verified.click();
		Thread.sleep(1000);
		Authorize.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(3000);
		Visit.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(print));
		Thread.sleep(2000);	
		
		//		driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
		//		Thread.sleep(3000);	
		print.click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']//i[@class='ki ki-check']")).click();
		Thread.sleep(3000);	
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(4000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


	}




	public void PharmacyClearance(String MRNO ) throws InterruptedException {


		//////////Pharmacy clearance	

		Thread.sleep(2000);
		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);

		//login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(Pharmacist_Id);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);


		////Clinical Pharmacist Clearance

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		PharmacyPanel.click();
		Thread.sleep(800);
		Ip_panel.click();
		Thread.sleep(500);

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

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));




		Close1.click();
		Thread.sleep(1000);
		taskIcon.click();
		Thread.sleep(1000);
		pharmacyClearance.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[5]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		pharmacyClearanceCheckbox.click();
		Thread.sleep(1000);
		verifyuserSave.click();
		Thread.sleep(1000);


	}

	public void ADTAppoval(String MRNo ) throws InterruptedException, AWTException {


		Thread.sleep(2000);
		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);

		//login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(Pharmacist_Id);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);


		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(1000);
		
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


		FOSearchField.click();
		Thread.sleep(1000);
		FOSearchField.sendKeys(MRNo);
		Thread.sleep(1000);
		FOSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);

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

		ADT.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);


		
		driver.findElement(By.xpath("//input[@id='dischargestatus']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(2000);
		disposition.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='To Home']")).click();
		Thread.sleep(1000);
		ADTSave.click();
		Thread.sleep(2000);
		
		Thread.sleep(500);
		List<WebElement> dynamicElement111 = driver
				.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//label[@class='dialog-title'][normalize-space()='Confirmation']"));

		if (dynamicElement111.size() != 0) {
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		
	

	}
	
	

	public void FinalBilling(String MRNO) throws InterruptedException {


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
		Thread.sleep(1000);
		userid.sendKeys(FinalbillUser);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);


		Hamburger.click();
		Thread.sleep(800);
		Thread.sleep(1000);
		//	module.click();
		Thread.sleep(1000);
		finalBilling.click();
		Thread.sleep(1000);
		IP.click();
		Thread.sleep(1000);
		InvoiceGeneration.click();
		Thread.sleep(1000);
		MRNOsearch1.click();
		Thread.sleep(1000);
		MRNOsearch1.sendKeys(MRNO);
		Thread.sleep(1000);
//		Search.click();
//		Thread.sleep(1000);
		search1.click();
		Thread.sleep(1000);
//		RightArrow1.click();
//		Thread.sleep(1000);
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
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);


		InvoiceView.click();
		Thread.sleep(1000);
		invoiceSearch.click();
		Thread.sleep(1000);
		options.click();
		Thread.sleep(1000);
		DraftFinalization.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"))
				.click();
		Thread.sleep(2000);
		remarks.sendKeys("APPROVED");
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//div[@class='form-container invoice-view mb0']//div[@class='row justify-content-between']")).click();
//		Thread.sleep(2000);
		
		Invoicemode.click();
		Thread.sleep(1000);
		Draftfinalized.click();
		Thread.sleep(1000);
		invoiceSearch.click();
		Thread.sleep(1000);
		options.click();
		Thread.sleep(1000);
		GenerateInvoice.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
		remarks.sendKeys("APPROVED");
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);



		/////////InvoiceView
		Thread.sleep(3000);
		InvoiceView.click();
		Thread.sleep(1000);
		Invoicemode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Generated']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys(MRNO);
		//MRNOsearch1.click();
		//Thread.sleep(1000);
		//MRNOsearch1.sendKeys(MRNO);
		//Thread.sleep(1000);
		//	Search.click();
		Thread.sleep(1000);
		//Search2.click();
		driver.findElement(By.xpath("//div[@class='col-12 col-md-3 ta-r']//button[@title='Search']")).click();
		
		Thread.sleep(1000);

		Adjustment.click();
		Thread.sleep(1000);
		AdjustmentPercentage.click();
		Thread.sleep(1000);
		AdjustmentPercentage.sendKeys("25");
		Thread.sleep(1000);
		RaiseRequest.click();
		Thread.sleep(1000);
		Authoriser.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='"+authoriser+"']")).click();
		Thread.sleep(1000);
		RemarksFB.click();
		Thread.sleep(1000);
		RemarksFB.sendKeys("ok"); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);

		//RCM
		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800); 
		RCM.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//div[normalize-space()='Approve Request']")).click();
		Thread.sleep(1000);
		InvoiceadjApprove.click();
		Thread.sleep(1000);
		patientSearch.clear();	
		Thread.sleep(1000);
		patientSearch.sendKeys(MRNO ,Keys.ENTER);
		Thread.sleep(1000);
		SearchIconFB.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[5]/lib-invoice-adj-approval[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();	
		//CHECK.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[5]/lib-invoice-adj-approval[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")).click();	

		Thread.sleep(1000);
		remark1.click();
		Thread.sleep(1000);
		remark1.sendKeys("approved");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		APPROVE.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();	
		Thread.sleep(1000);  

		///refund

		Hamburger.click();
		Thread.sleep(800); 
		//RCM.click();
		Thread.sleep(1000);
		invoiceCancel.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Invoice Adjustment Apply']")).click();	
		Thread.sleep(1000);
		patientSearch.clear();
		Thread.sleep(1000);
		patientSearch.sendKeys(MRNO ,Keys.ENTER);
		Thread.sleep(1000);
		SearchIconFB.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[5]/lib-invoice-adj-apply[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
  



		////Settle invoice	

		Hamburger.click();
		Thread.sleep(800);
		IP.click();
		Thread.sleep(1000); 
		SettleInvoice.click();
		Thread.sleep(1000);
		Mrnoenter3.click();
		Thread.sleep(1000);
		Mrnoenter3.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/label[1]/button[1]/i[1]")).click();
		Thread.sleep(1000);


		///settlement1


		settleicon1.click();
		Thread.sleep(1000);
		grid1.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", payment);
		Thread.sleep(1000);
		String AMOUNT = driver.findElement(By.xpath("//label[@class='pay-style']")).getText();


		driver.findElement(By.xpath("//span[@class='close-input-val ng-star-inserted']//i[@class='fa fa-close']")).click();
		Thread.sleep(1000);

		Cheque.click();
		Thread.sleep(1000);
		issuingBank.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(1000);
		Amount.clear();
		Thread.sleep(1000);
		Amount.sendKeys(AMOUNT);
		Thread.sleep(1000);
		TransactionNO.sendKeys("775544");
		Thread.sleep(1000);
		Cardadd.click();
		Thread.sleep(1000);
		cardok.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='check-container zero-label']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		settle.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='form-container invoice-view mb0']//div[@class='row justify-content-between']")).click();
		Thread.sleep(2000);
		
		
		Invoicemode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Settled']")).click();
		Thread.sleep(2000);
		invoiceSearch.click();
		Thread.sleep(1000);
		Financial_Clearance.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);
		
		Cancel_Financial_Clearance.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);
		
		Financial_Clearance.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);
		



	}


	
	public void PhysicalClearance(String MRNo , String nurseUser , String  NursePassword ) throws InterruptedException {

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
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);


		///	driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(2000);


		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIconWB.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
	//
//		js.executeScript("arguments[0].scrollIntoView();", FinancialClearance);
//		Thread.sleep(2000);
//		act.moveToElement(FinancialClearance).click().build().perform();
//		Thread.sleep(2000);
	//
//		verifiedBy.click();
//		Thread.sleep(1000);
//		verifiedBy.sendKeys(nurseUser);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
//		Thread.sleep(1000);
//		verifyPassword.click();
//		verifyPassword.sendKeys(NursePassword);
//		Thread.sleep(1000);
//		verifySave.click();
//		Thread.sleep(2000);

		////Physical Clearance

		js.executeScript("arguments[0].scrollIntoView();", PhysicalClearance);
		Thread.sleep(2000);
		act.moveToElement(PhysicalClearance).click().build().perform();
		Thread.sleep(2000);

		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);

	}

	





	}
	
	
	
	
	
	
	
	











