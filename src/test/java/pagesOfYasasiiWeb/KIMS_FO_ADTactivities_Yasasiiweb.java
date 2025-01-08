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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_FO_ADTactivities_Yasasiiweb extends PageFactoryInitYasasiiWeb{

	public KIMS_FO_ADTactivities_Yasasiiweb(WebDriver driver) {

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

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printUnckeck;	

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	

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

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement Threedot;

	@FindBy(xpath = "//div[contains(text(),'Admission Edit')]")
	public WebElement AdmissionEdit;

	@FindBy(xpath = "//div[@class='card-body form-inputs']//div[@class='row']//textarea[@id='remarks']")
	public WebElement AdmissionRemarks;

	@FindBy(xpath = "//div[contains(text(),'Admission Cancel')]")
	public WebElement AdmissionCancel;

	@FindBy(xpath = "//textarea[@id='cancelreason']")
	public WebElement CancelReason;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/label[2]/i[1]")
	public WebElement HoldIcon;

	@FindBy(xpath = "//i[@class='ki ki-info-circle']")
	public WebElement BedInfo;

	@FindBy(xpath = "//div[@class='ng-star-inserted']//i[@class='ki ki-ellipsis-v']")
	public WebElement Holdoptions;

	@FindBy(xpath = "//div[contains(text(),'Patient Hold Transfer')]")
	public WebElement holdTransfer;

	@FindBy(xpath = "//div[contains(text(),'New Reservation')]")
	public WebElement NewReservation;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='roomtypeid']//input[@id='undefined']")
	public WebElement ReserveRoomtype;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='reservationtypeid']//input[@id='undefined']")
	public WebElement ReservationType;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[5]/form[1]/div[1]/div[2]/div[1]/div[3]/ki-calendar[1]/div[1]/input[1]")
	public WebElement ReservationDate;

	@FindBy(xpath = "//div[contains(text(),'Reservation Edit/View')]")
	public WebElement ReservationView;

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement Delete;

	@FindBy(xpath = "//div[contains(text(),'Bed History')]")
	public WebElement BedHistory;

	@FindBy(xpath = "//div[contains(text(),'Home Leave/Movement')]")
	public WebElement PatientOnleave;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='leavetypeid']//input[@id='undefined']")
	public WebElement Type;

	@FindBy(xpath = "//ki-calendar[@id='expectedreturndate']//input[@type='text']")
	public WebElement ExpectedDate;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//textarea[@id='remarks']")
	public WebElement remarks;


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

	@FindBy(xpath = "//span[normalize-space()='Discharge Recommendation']")
	public WebElement DisRecom;

	@FindBy(xpath = "//label[normalize-space()='Patient for Discharge']//span[contains(@class,'checkmark')]")
	public WebElement Dischargecheckbox;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement IP;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect1;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;



	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosis;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='EMR']")
	public WebElement EMR;

	@FindBy(xpath = "//div[normalize-space()='White Board']")
	public WebElement WhiteBoard;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement NameSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;


	@FindBy(xpath = "//i[@class='ki ki-info-circle']")
	public WebElement element;

	@FindBy(xpath = "//button[normalize-space()='Ready for discharge']")
	public WebElement REadyForDischarge;

	@FindBy(xpath = "//input[@id='enteredbynameview']")
	public WebElement verifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement verifyPassword;

	@FindBy(xpath = "//button[@id='verifyuser']")
	public WebElement verifySave;

	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EmrIcon;

	@FindBy(xpath = "//button[normalize-space()='Department Clearance']")//button[normalize-space()='Department Clearance']
	public WebElement Depclearance;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-whiteboard-authentication[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement laboratoryCheckbox;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-whiteboard-authentication[1]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement PharmacyCheckbox;

	@FindBy(xpath = "//label[@title='Pharmacy Clearance']")
	public WebElement pharmacyClearance;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOSearchField;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOPatientSelect;

	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement dischargeStatus;

	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement disposition;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSave;

	@FindBy(xpath = "//i[@class='ki ki-redo']")
	public WebElement RollBack;

	@FindBy(xpath = "//div[contains(text(),'Home Leave/Movement Edit')]")
	public WebElement HomeleaveEdit;

	@FindBy(xpath = "//ki-calendar[@id='actualreturndate']//input[@type='text']")
	public WebElement AdctualReturn;

	@FindBy(xpath = "//button[@id='updatepatadtbutton']")
	public WebElement ADTupdate;

	@FindBy(xpath = "//div[contains(text(),'Home Leave/Movement Cancel')]")
	public WebElement homeLeaveCancel;

	@FindBy(xpath = "//span[normalize-space()='Normal']")
	public WebElement Category;

	@FindBy(xpath = "//span[@title='Normal']")
	public WebElement normal;

	@FindBy(xpath = "//span[@title='VVIP']")
	public WebElement VVIP;

	@FindBy(xpath = "//i[@title='MRNo/Name']")
	public WebElement nameicon;

	@FindBy(xpath = "//i[@class='ki ki-files']")
	public WebElement docmnt;

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement dischargethreedot;

	@FindBy(xpath = "//div[contains(text(),'Discharge Cancel')]")
	public WebElement dischargeCancel;

	@FindBy(xpath = "//input[@id='cancelreason']")
	public WebElement dischargeCancelReason;

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

	@FindBy(xpath = "//input[@id='admndischargestatusid']")
	public WebElement DischargeStatus;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UpArrow;

	@FindBy(xpath = "//i[@title='Lock/Unlock']")
	public WebElement Lock1;

	@FindBy(xpath = "//button[normalize-space()='Financial Clearance']")
	public WebElement FinancialClearance;

	@FindBy(xpath = "//button[normalize-space()='Physical Discharge']")
	public WebElement PhysicalClearance;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;	

	@FindBy(xpath = "//input[@id='cancelreason']")
	public WebElement adtCancelReason;	

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Plan']")
	public WebElement Plan;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement PlanText;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement PayType;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;


	@FindBy(xpath = "//tbody/tr[2]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement radiology_imaging;

	@FindBy(xpath = "//tbody/tr[3]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement MedicalRecords;

	@FindBy(xpath = "//button[normalize-space()='Discharge Summary Clearance']")
	public WebElement Discharge_summary_Clearance;

	@FindBy(xpath = "//button[normalize-space()='Clinical Pharmacist Clearance']")
	public WebElement Clinical_Pharmacist_Clearance;

	@FindBy(xpath = "//div[normalize-space()='Pharmacy Panel']")
	public WebElement Pharmacypanel;

	@FindBy(xpath = "//div[normalize-space()='IP Panel']")
	public WebElement IPpanel;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//i[contains(@class,'ki ki-bell')]")
	public WebElement taskIcon;

	@FindBy(xpath = "//label[@title='Clinical Pharmacist Clearance']")
	public WebElement ClinicalPharmacistClearance;

	@FindBy(xpath = "//span[@title='My Tasks']")
	public WebElement Mytasks;

	@FindBy(xpath = "//td[@class='ta-c']//span[@class='checkmark']")
	public WebElement pharmacyClearanceCheckbox;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save1;

	@FindBy(xpath = "//button[@id='verifyuser']//i[@class='ki ki-save']")
	public WebElement verifyuserSave;	
	
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

	@FindBy(xpath = "(//div[@class='element-container removespace font13'])[1]")
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

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle pro-pic tab-prof-wrap']")
	public WebElement Logoutarw;
	
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[contains(@class,'logout list-item')]")
	public WebElement Logoutbutton;
	
	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement Logoutconfrm;

	@FindBy(xpath = "//i[@class='ki ki-bill']")
	public WebElement Finalbill;



	@FindBy(xpath = "//div[contains(text(),'Invoice Generation')]")
	public WebElement InvoiceGeneration;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ki-calendar[1]/div[1]/input[1]")
	public WebElement fromdate;

	@FindBy(xpath = "//button[normalize-space()='Draft Generate']")
	public WebElement DraftGenerate;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOsearch;

	@FindBy(xpath = "//div[@class='col-1 pl-0 col-md-1 ta-r']//i[@class='ki ki-search']")
	public WebElement finalBillSearch;

	@FindBy(xpath = "//span[normalize-space()='Invoice View']")
	public WebElement InvoiceView;

	@FindBy(xpath = "//div[@class='col-12 col-md-3 ta-r']//i[@class='ki ki-search']")
	public WebElement invoiceSearch;

	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	public WebElement options;

	@FindBy(xpath = "//label[normalize-space()='Draft Finalization']")
	public WebElement DraftFinalization;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='invoicemode']//input[@id='undefined']")
	public WebElement Invoicemode;

	@FindBy(xpath = "//li[normalize-space()='Draft Finalized']")
	public WebElement Draftfinalized;

	@FindBy(xpath = "//label[normalize-space()='Generate Invoice']")
	public WebElement GenerateInvoice;
	
    @FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;
	
	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type1;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;
	
	@FindBy(xpath = "//button[normalize-space()='Financial Clearance']")
	public WebElement Financial_Clearance;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel Financial Clearance']")
	public WebElement Cancel_Financial_Clearance;
	

	public void Patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo ) throws InterruptedException, IOException, AWTException {

		///////////////////Patient registration

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


		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement1.size());
		if(dynamicElement1.size() ==0)
		{
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
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Add1 );
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
		

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(billing));
		Thread.sleep(3000);
		///////////////encounter

		billing.click();
		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]")));
		Thread.sleep(3000);
		
		//printUnckeck.click();
		//Thread.sleep(1000);
		billSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);


		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(25);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000); 

	}


	public void ADT() throws InterruptedException, AWTException {


		/////Admit the patient

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
		Admission.click();
		Thread.sleep(800);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);
		Roomtype.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Ultra-Deluxe']")).click();
		Thread.sleep(800);
		ReservationmType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
		Thread.sleep(800);
		Remarks.click();
		Thread.sleep(800);
		Remarks.sendKeys("Recommended for Admission");
		Thread.sleep(800);
		ADTSAve.click();
		Thread.sleep(2000);

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


		Edit.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		Remarks.click();
		Thread.sleep(800);
		Remarks.sendKeys("Recommended for Admission");
		Thread.sleep(800);
		ADTUpdate.click();
		Thread.sleep(800);
		Thread.sleep(2000);
		Thread.sleep(2000);

		List<WebElement> dynamicElement211=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if(dynamicElement211.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		

		act.moveToElement(RemarksView).build().perform();
		Thread.sleep(800);
		Log.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(800);
		Recommendation.click();
		Thread.sleep(1800);
	
		Bed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
		Thread.sleep(500);
		ADTSAve.click();
		Thread.sleep(2000);
		Thread.sleep(2000);

		List<WebElement> dynamicElement311=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if(dynamicElement311.size() !=0)
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
		
	
	/////////Admission Edit

	Thread.sleep(800);
	BedInfo.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
	Thread.sleep(800);
	Threedot.click();
	Thread.sleep(800);
	AdmissionEdit.click();
	Thread.sleep(800);
	AdmissionRemarks.click();
	Thread.sleep(800);
	ADTUpdate.click();
	Thread.sleep(800);


	///Admission Cancel


	Thread.sleep(800);
	Threedot.click();
	Thread.sleep(800);
	AdmissionCancel.click();
	Thread.sleep(800);
	adtCancelReason.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='As per Doctor Request']")).click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[@id='adtcancel']")).click();
	Thread.sleep(800);
	//driver.findElement(By.xpath("//button[@id='adtcancel']//i[@class='ki ki-check']")).click();
	Thread.sleep(2000);
	Recommendation.click();
	Thread.sleep(800);
	Bed.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
	Thread.sleep(500);
	ADTSAve.click();
	Thread.sleep(2000);
	Thread.sleep(2000);

	List<WebElement> dynamicElement4=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

	if(dynamicElement4.size() !=0)
	{
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']")).click();
	}


	else {
		System.out.println("sri");
	}
	Thread.sleep(1000);

	List<WebElement> dynamicElement4111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

	if(dynamicElement4111.size() !=0)
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


	////Hold 

	Thread.sleep(800);
	Threedot.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//div[contains(text(),'New Hold')]")).click();
	Thread.sleep(800);
	BedCategory.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='ROOM']")).click();
	Thread.sleep(800);
	RoomType.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("(//*[contains(text(),'Ultra-Deluxe')])[3]")).click();
	Thread.sleep(800);
	Bed.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[3]")).click();
	Thread.sleep(800);
	ADTSAve.click();

	Thread.sleep(2000);
	HoldIcon.click();
	Thread.sleep(800);
	Holdoptions.click();
	Thread.sleep(800);
	holdTransfer.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	Thread.sleep(800);

	///Reservation

	Thread.sleep(800);
	Threedot.click();
	Thread.sleep(800);
	NewReservation.click();
	Thread.sleep(800);
	ReserveRoomtype.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='ER_Exclusive']")).click();
	Thread.sleep(800);
	ReservationType.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
	Thread.sleep(1200);
	ReservationDate.click();
	Thread.sleep(1200);

	Robot t=new Robot();
	t.keyPress(KeyEvent.VK_RIGHT);
	t.keyRelease(KeyEvent.VK_RIGHT);
	Thread.sleep(400);
	t.keyPress(KeyEvent.VK_ENTER);
	t.keyRelease(KeyEvent.VK_ENTER);

	ADTSAve.click();
	Thread.sleep(3000);
	Threedot.click();
	Thread.sleep(800);
	ReservationView.click();
	Thread.sleep(1000);
	Log.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")).click();
	Thread.sleep(800);
	Delete.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	Thread.sleep(3000);

	Threedot.click();
	Thread.sleep(800);
	BedHistory.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//span[normalize-space()='Log']")).click();
	Thread.sleep(1200);
	driver.findElement(By.xpath("//span[normalize-space()='Recommendation/Reservation log view']")).click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
	Thread.sleep(800);

	////Home Leave

	/*	Thread.sleep(1000);
	Threedot.click();
	Thread.sleep(1000);
	PatientOnleave.click();
	Thread.sleep(1000);
	Type.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Home Leave']")).click();
	Thread.sleep(1000);
	ExpectedDate.click();
	Thread.sleep(1000);
	Robot r=new Robot();
	for (int i = 0; i < 2; i++) {

		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);

	}
	Thread.sleep(800);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(800);
	remarks.click();
	Thread.sleep(1000);
	remarks.sendKeys("as per patient request");
	Thread.sleep(1000);
	ADTSAve.click();
	Thread.sleep(2000);
	 */




}


public void	DoctorNote(String DOCuser ,String DOCpassword , String MRNo,String DocID) throws InterruptedException {



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



	Thread.sleep(3000);
	MenuToggle.click();
	Thread.sleep(1000);
	EMRHomeScreen.click();
	Thread.sleep(1200);
	OP.click();
	Thread.sleep(600);
	SelectIP.click();
//	Thread.sleep(1000);
//	nameicon.click();
//	Thread.sleep(1000);
//	docmnt.click();
//	Thread.sleep(1000);

	EnterPatientName.sendKeys(MRNo);
	Thread.sleep(1500);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
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

	/*	Thread.sleep(5000);
		UpArrow.click();
		Thread.sleep(500);
		Lock1.click(); */
	///////Create the doctor note and select pregnant
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
	Thread.sleep(1000);

	disgnosis.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Mark as Final')]")).click();
	Thread.sleep(1000);


	DisRecom.click();
	Thread.sleep(1000);
	Dischargecheckbox.click();
	Thread.sleep(1000);
	DischargeStatus.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
	Thread.sleep(1000);


	CPOEpharm.click();
	Thread.sleep(1000);
	MedicineSearch.clear();
	Thread.sleep(1000);
	MedicineSearch.sendKeys("Crocin 650", Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
	Thread.sleep(1000);

	/*	Orderingreason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(1000);
		justification.click();
		Thread.sleep(1000);
		justification.sendKeys("ok");
		Thread.sleep(1000); */
	Frequency.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
	Thread.sleep(500);


//	NoCurrentmed.click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
//	Thread.sleep(1000);
//	NoCurrentmedCheck.click();
//	Thread.sleep(1000);
//	dischargeReconcile.click();
//	Thread.sleep(1000);
//	Reconsile.click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	Thread.sleep(1000);
	medicineAdd.click();
	Thread.sleep(1000);
	EmrSave.click();
	Thread.sleep(2000);
}


public void dischargeApproval(String MRNO , String nurseUser , String  NursePassword ,  String Pharmacist_password) throws InterruptedException, AWTException {


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
	Thread.sleep(5000);

	
	////Clinical Pharmacist Clearance
	
	Thread.sleep(2000);
	Hamberger.click();
	Thread.sleep(1000);
	Pharmacypanel.click();
	Thread.sleep(1000);
	IPpanel.click();

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
	
	
	Close.click();
	Thread.sleep(1000);
	taskIcon.click();
	Thread.sleep(1000);
	ClinicalPharmacistClearance.click();
	Thread.sleep(1000);
	
	Searchfield.sendKeys(MRNO, Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[5]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//label[normalize-space()='New Order']")).click();
	//Thread.sleep(1000);
	//driver.findElement(By.xpath("//label[@class='check-container cust-label-chk']//span[@class='checkmark']")).click();
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	Thread.sleep(1000);
	
	
	
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
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//label[@class='dialog-title'][normalize-space()='Confirmation']"));

	if(dynamicElement11.size() !=0)
	{
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);	
	}


	else {
		System.out.println("sri");
	}
	Thread.sleep(1000);
	
	
	
	
	


}






public void Discharge_Summary_Clearance(String MRDUser, String MRDPassword ,String MRNO,String DOCuser,String DOCpassword) throws InterruptedException, AWTException {



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
	EMRHomeScreen.click();
	Thread.sleep(1000);

	Task.click();
	Thread.sleep(1000);
	DSClearance.click();
	Thread.sleep(1000);
	Searchfield.sendKeys(MRNO , Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
	Thread.sleep(1000);
	
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
	Thread.sleep(5000);
	
	DOD.click();
	Thread.sleep(1000);
	Today.click();
	Thread.sleep(1000);
	Report.click();
	Thread.sleep(1000);
	//Report.sendKeys("ChatGPT is a chatbot developed by OpenAI and launched on November 30, 2022. Based on large language models, it enables users to refine and steer a conversation towards a desired length, format, style,");
	Thread.sleep(1000);
	Disgnosis.click();
	Thread.sleep(1000);
	DSInitiated.click();
	Thread.sleep(1000);
	save.click();
	Thread.sleep(3000);


	Visit.click();
	Thread.sleep(3000);
	DraftCompleted.click();
	Thread.sleep(1000);
	save.click();
	Thread.sleep(2000);

	Visit.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
	Thread.sleep(3000);	
//	LOG1.click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']//i[@class='ki ki-close-circle']")).click();
//	Thread.sleep(3000);	



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
	//	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
	driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(5000);


	Menu.click();
	Thread.sleep(2000);
	EMRHomeScreen.click();
	Thread.sleep(1000);

	Task.click();
	Thread.sleep(1000);
	DraftCompletedtask.click();
	Thread.sleep(1000);
	Searchfield.sendKeys(MRNO , Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
	Thread.sleep(1000);
	
	
	
	List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='dl-body']//div[2]"));

	if(dynamicElement1.size() ==0)
	{
		driver.findElement(By.xpath("//button[@class='icon discharesum']")).click();
		Thread.sleep(2000);	
	}


	else {
		System.out.println("sri");
	}
	Thread.sleep(1000);
	Visit.click();
	Thread.sleep(4000);
	
	verified.click();
	Thread.sleep(1000);
	Authorize.click();
	Thread.sleep(1000);
	save.click();
	Thread.sleep(4000);
	Visit.click();
	Thread.sleep(4000);
	//		driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
	//		Thread.sleep(3000);	
	print.click();
	Thread.sleep(1000);	
	driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']//i[@class='ki ki-check']")).click();
	Thread.sleep(3000);	
	Robot t=new Robot();
	t.keyPress(KeyEvent.VK_ESCAPE);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(400);
	t.keyPress(KeyEvent.VK_ESCAPE);
	t.keyRelease(KeyEvent.VK_ESCAPE);


}




public void PharmacyClearance(String MRNO , String Pharmacist_password ) throws InterruptedException {


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
	userid.sendKeys(Pharmacist_Id  );
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
	Pharmacypanel.click();
	Thread.sleep(1000);
	IPpanel.click();

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
	
	
	

	Close.click();
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


	FOSearchField.click();
	Thread.sleep(1000);
	FOSearchField.sendKeys(MRNo);
	Thread.sleep(1000);
	FOSearchField.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(1000);

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

	ADT.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);


	Thread.sleep(2000);
	disposition.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='To Home']")).click();
	Thread.sleep(1000);
	ADTSave.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
Thread.sleep(3500);
	
	

}


public void homeleaveCancel() throws AWTException, InterruptedException {

	////Rollback	 
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", dischargethreedot );


	Thread.sleep(1000);
	dischargethreedot.click();
	Thread.sleep(1000);
	dischargeCancel.click();
	Thread.sleep(1000);
	dischargeCancelReason.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='As per Doctor Request']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='adtcancel']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary sm'][normalize-space()='OK']//i[@class='ki ki-check']")).click();
	Thread.sleep(1000);
	
	
	

	///ADT Discharge

//	Thread.sleep(2000);
//	dischargeStatus.click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
//	Thread.sleep(1000);
//	disposition.click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//li[normalize-space()='To Home']")).click();
//	Thread.sleep(1000);
//	ADTSave.click();
//	Thread.sleep(1000);
	// driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();



}


public void  financialClearance(String MRNo ) throws InterruptedException {


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
	userid.sendKeys(FinalbillUser);
	password.click();
	password.sendKeys(Password);
	Thread.sleep(1000);
	site.click();

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
	driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(2000);


	Hamburger.click();
	Thread.sleep(1000);
	Finalbill.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[normalize-space()='IP']")).click();
	Thread.sleep(2000);
	
	InvoiceGeneration.click();
	Thread.sleep(1000);
	fromdate.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='owl-dt-calendar-cell-content'][normalize-space()='1']")).click();
	Thread.sleep(2000);
	MRNOsearch.sendKeys(MRNo,Keys.ENTER);
	Thread.sleep(1000);
	finalBillSearch.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//i[@title='Generate Invoice']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@class='check-container zero-label']//span[@class='checkmark']")).click();
	Thread.sleep(1000);
	DraftGenerate.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(2000);


	////InvoiceView

	InvoiceView.click();
	Thread.sleep(1000);
	
	Invoicemode.click();
	Thread.sleep(1000);
	Draftfinalized.click();
	Thread.sleep(1000);
	
	Invoicemode.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Draft']")).click();
	Thread.sleep(2000);
	
	invoiceSearch.click();
	Thread.sleep(1000);
	options.click();
	Thread.sleep(1000);
	DraftFinalization.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(2000);

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
	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(2000);
	
//	driver.findElement(By.xpath("//div[@class='form-container invoice-view mb0']//div[@title='Search By'][normalize-space()='Search By']")).click();
//	Thread.sleep(2000);
	
	Invoicemode.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Generated']")).click();
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

public void PhysicalClearance(String MRNo , String nurseUser , String  NursePassword) throws InterruptedException {

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
	SearchIcon.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	Thread.sleep(2000);
//
//	js.executeScript("arguments[0].scrollIntoView();", FinancialClearance);
//	Thread.sleep(2000);
//	act.moveToElement(FinancialClearance).click().build().perform();
//	Thread.sleep(2000);
//
//	verifiedBy.click();
//	Thread.sleep(1000);
//	verifiedBy.sendKeys(nurseUser);
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
//	Thread.sleep(1000);
//	verifyPassword.click();
//	verifyPassword.sendKeys(NursePassword);
//	Thread.sleep(1000);
//	verifySave.click();
//	Thread.sleep(2000);

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
