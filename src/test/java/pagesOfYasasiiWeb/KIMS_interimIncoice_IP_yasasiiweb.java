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
import com.w2a.utilities.RandomString;

public class KIMS_interimIncoice_IP_yasasiiweb extends PageFactoryInitYasasiiWeb{

	public KIMS_interimIncoice_IP_yasasiiweb(WebDriver driver) {

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
	
	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

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

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement AddService;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement ServSave;

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
	public WebElement SAve;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;


	@FindBy(xpath = "//input[@id='medicinename']")
	public WebElement ItemName;

	@FindBy(xpath = "//input[@id='qtynew']")
	public WebElement Qty;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement itemadd;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]")
	public WebElement medicineInformation1;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]")
	public WebElement medicineInformation2;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/i[2]")
	public WebElement Stockinformation;

	@FindBy(xpath = "//button[@id='confirmsave']")
	public WebElement Confirm;

	@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
	public WebElement Status;

	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement medicineCheck;

	@FindBy(xpath = "//div[@class='form-container pt-1 billing-card card cb-40-bottom ng-star-inserted']//div[2]//div[1]//div[1]//div[1]//div[1]//div[2]//span[2]//i[1]")
	public WebElement threeDot;

	@FindBy(xpath = "//div[@class='form-container pt-1 billing-card card cb-40-bottom ng-star-inserted']//div[2]//div[1]//div[1]//div[1]//div[1]//div[2]//span[2]//div[1]//div[2]")
	public WebElement PharmistRemarks;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement labelremark;

	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement stockSave;

	@FindBy(xpath = "//li[normalize-space()='Stock Reservation']")
	public WebElement StockReservation;

	@FindBy(xpath = "//div[normalize-space()='Dispensing']")
	public WebElement Dispensing;

	@FindBy(xpath = "//label[@class='check-wrapper ng-star-inserted']//span[@class='checkmark']")
	public WebElement DispenseCheck;

	@FindBy(xpath = "//i[@class='fa pointer fa-chevron-right ng-star-inserted']")
	public WebElement RightArrow;

	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement Dispensed;

	@FindBy(xpath = "//button[@type='button']//i[@class='ki ki-reset']")
	public WebElement Clear;

	@FindBy(xpath = "//div[@class='billing-card ng-star-inserted']//i[@title='Order Information']")
	public WebElement orderInformation;

	@FindBy(xpath = "//span[normalize-space()='Admin View']")
	public WebElement AdminView;


	@FindBy(xpath = "//div[@class='billing-card ng-star-inserted']//i[@title='Stock Information']")
	public WebElement StockInformation;

	@FindBy(xpath = "//div[normalize-space()='Pharmacist Remark']")
	public WebElement PharmasistRemark;

	@FindBy(xpath = "//textarea[@id='note']")
	public WebElement InterventionRemark;

	@FindBy(xpath = "//i[@title='Prescription Print']")
	public WebElement print;

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EMRsave1;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[3]/div/label[1]/i")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@title='Lock/Unlock']")
	public WebElement lock;

	@FindBy(xpath = "//i[@title='Walk-In']")
	public WebElement walkin;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement walkinSearch;

	@FindBy(xpath = "//div[normalize-space()='OP Orders']")
	public WebElement OPOrder;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement OPprovider;

	@FindBy(xpath = "//ki-checkbox-control[@class='ng-untouched ng-dirty ng-valid']//span[@class='checkmark']")
	public WebElement AdditiveUncheck;

	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement counterSearch;

	@FindBy(xpath = "//i[@title='Search']")
	public WebElement counterSearchicon;


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


	@FindBy(xpath = "//i[contains(@class,'ki ki-bill')]")
	public WebElement finalBilling;

	@FindBy(xpath = "//div[normalize-space()='Interim Invoice']")
	public WebElement interimInvoice;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-interim-bill[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNoEnter;

	@FindBy(xpath = "//i[@title='Search']")
	public WebElement Search;

	@FindBy(xpath = "//button[@title='Search']//i[@class='ki ki-search']")
	public WebElement search1;

	@FindBy(xpath = "//i[@class='fa fa-chevron-right ng-star-inserted']")
	public WebElement RightArrow1;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-ip-invoice-generation/div/tabset/div/tab[1]/form/div[1]/tabset/div/tab[1]/div/div/table/tbody/tr[2]/td[12]/i")
	public WebElement RightArrow2;

	@FindBy(xpath = "//td[@title='Expand All']//i[@class='fa fa-chevron-right ng-star-inserted']")
	public WebElement itemsview1;

	@FindBy(xpath = "//button[normalize-space()='Draft Generate']")
	public WebElement DraftGenerate;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement OK1;

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

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
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

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement episodeIcon;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOSearchField;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOPatientSelect;

	@FindBy(xpath = "/html/body/modal-container/div/div/app-encounter-episode-view/form/div/div/div/div/div[1]/tabset/div/tab[1]/div/table/tbody/tr[1]/td[2]/label/i")
	public WebElement closeEncounter;

	@FindBy(xpath = "//input[@id='remarksControl']")
	public WebElement Reason;

	@FindBy(xpath = "//input[@id='department']")
	public WebElement Destination;

	@FindBy(xpath = "//button[@class='btn btn-primary active sm mr0 mt0 mb0']")
	public WebElement closedencSave;

	@FindBy(xpath = "//label[normalize-space()='Modules']")
	public WebElement module;

	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//span[contains(text(),'Encounter')]")
	public WebElement Encounter;

	@FindBy(xpath = "//label[@class='check-container zero-label']//span[@class='checkmark']")
	public WebElement InvoicePrintUncheck;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[1]")
	public WebElement eye;

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle pro-pic tab-prof-wrap']")
	public WebElement username;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
	public WebElement logout;

	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement logoutConfirm;

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

	@FindBy(xpath = "//label[contains(text(),'G91.2')]//span[@class='checkmark']")
	public WebElement Diagnosischeckbox;

	@FindBy(xpath = "//label[normalize-space()='No Current Medication']//span[@class='checkmark']")
	public WebElement NoCurrentmed;

	@FindBy(xpath = "//label[@class='check-container no-label']//span[@class='checkmark']")
	public WebElement NoCurrentmedCheck;

	@FindBy(xpath = "//i[@class='ki ki-admission-reconciliation']")
	public WebElement AdmsnReconcile;

	@FindBy(xpath = "//i[@class='ki ki-reconciliation']")
	public WebElement Reconsile;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement planText;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-duplicate-medicine-confirmation[1]/div[2]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement overrideReason;

	@FindBy(xpath = "//i[@class='fa fa-close bydefault']")
	public WebElement cancelRequest;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Authoriser;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM']")
	public WebElement RCM;

	@FindBy(xpath = "//div[normalize-space()='Approve Request']")
	public WebElement ApproveRequest;

	@FindBy(xpath = "//span[normalize-space()='Invoice Cancellation Approval']")
	public WebElement CancelApproval;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[2]/a[1]/div[1]")
	public WebElement cancellation;

	@FindBy(xpath = "//span[normalize-space()='Invoice Cancel']")
	public WebElement InvoiceCancel;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement patientSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark1;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement APPROVE;

	////Home Leave

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement Threedot;

	@FindBy(xpath = "//div[contains(text(),'Home Leave/Movement')]")
	public WebElement PatientOnleave;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='leavetypeid']//input[@id='undefined']")
	public WebElement Type;

	@FindBy(xpath = "//ki-calendar[@id='expectedreturndate']//input[@type='text']")
	public WebElement ExpectedDate;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//textarea[@id='remarks']")
	public WebElement remarks;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSAve;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;



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

	@FindBy(xpath = "//input[@id='cheqnoPayType']")
	public WebElement TransactionNO;
	
	@FindBy(xpath = "//i[@class='ki ki-patient-fill']")
	public WebElement patientinfo;
	
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement EditInfo;
	
	@FindBy(xpath = "//span[normalize-space()='Insurance and Other Information']")
	public WebElement Insurance_otherinformation;
	
	@FindBy(xpath = "//ki-select-control[@placeholder='Corporate']//input[@id='undefined']")
	public WebElement Insurance;
	
	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement Plan;

	@FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-star-inserted ng-valid']")
	public WebElement validto;
	
	@FindBy(xpath = "//button[@id='updateregistrationbutton']")
	public WebElement UpdateReg;
	
	@FindBy(xpath = "//div[contains(text(),'Scheme Change')]")
	public WebElement SchemeChange;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-scheme-change[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Searchmrno;
	
	@FindBy(xpath = "//ki-checkbox-control[@class='ng-untouched ng-dirty ng-valid']//span[@class='checkmark']")
	public WebElement Selectallbill;
	
	@FindBy(xpath = "//button[@id='schemechange']")
	public WebElement GO;
	
	@FindBy(xpath = "//div[normalize-space()='Patient Share']")
	public WebElement patientShare;
	
	@FindBy(xpath = "//div[@class='form-group min-clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement Planname;

	
	public void Patreg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider) throws InterruptedException, IOException, AWTException {

		///////////////////Register a female patient

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
		Thread.sleep(2000);
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
		lastname.click();
		Thread.sleep(500);
		lastname.sendKeys(lastName);
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

		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys("Self employment");
		Thread.sleep(1000);
		
		
		
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
		Type1.click();
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
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(signupload));
		Thread.sleep(2000);
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
		
		
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(12);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);


	}

	public void ADT( ) throws InterruptedException, AWTException {


		//////Encounter
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
		Thread.sleep(3000);
		EncounterAdd.click();
		Thread.sleep(2000);
		EncounterSave.click();
		Thread.sleep(1000);
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(SAvesuccess));
		Thread.sleep(2000);
		SAvesuccess.click();
		Thread.sleep(3000);


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
		Thread.sleep(3000);

		List<WebElement> dynamicElement1111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if(dynamicElement1111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);
		
		////Admission charge cancel reason
		
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


	}








	public void Billing( String service1,String service2,String service3 ) throws InterruptedException {





		///Service Billing


		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='ki ki-reception-fill']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-reception-fill']")).click();
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
		AddService.click();
		Thread.sleep(1000);
		ServSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);



		servName.click();
		Thread.sleep(1000);
		servName.sendKeys(service1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+service1+"']")).click();
		Thread.sleep(1000);

		AddService.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		servName.click();
		Thread.sleep(1000);
		servName.sendKeys(service2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+service2+"']")).click();

		AddService.click();
		Thread.sleep(1000);
		servName.click();
		Thread.sleep(1000);
		servName.sendKeys(service3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+service3+"']")).click();

		AddService.click(); 
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//label[@class='check-container zero-label']")).click();
		Thread.sleep(1000);
		ServSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);


	}	





	public void doctoreNote(String docid,String docpassword,String MRNO ) throws InterruptedException {


		/////////logout


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

		category1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);

		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(2000);
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
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(EMRsave));
		Diagnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);

		////cpoe pharmacy

		cpoePharmacy.click();
		Thread.sleep(1000);
		uncheckStar.click();
		Thread.sleep(2000);
		medicineSearch.click();
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



		NoCurrentmed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		Thread.sleep(1000);
		NoCurrentmedCheck.click();
		Thread.sleep(1000);
		//DischargeReconcile.click();
		Thread.sleep(1000);
//		AdmsnReconcile.click();
//		Thread.sleep(1000);
//		Reconsile.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		Thread.sleep(1000);
		AddMedicine.click();
		Thread.sleep(1000);


		Thread.sleep(2000);
		medicineSearch.clear();
		Thread.sleep(1000);
		medicineSearch.sendKeys("Crocin 650Mg Tab", Keys.ENTER);
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
		overrideReason.click();
		Thread.sleep(1000);
		overrideReason.sendKeys("ok");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click();
		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//div[@class='item-name'][normalize-space()='Plan']")).click();
		//		Thread.sleep(1000);
		//		planText.sendKeys("planText");
		//		Thread.sleep(2000);
		EMRsave.click();
		Thread.sleep(3000);
		
		

		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(username));
		Thread.sleep(2000);

	}




	public void PharmacyBilling(String MRNO ,String provider,String adminid,String adminpassword  ) throws InterruptedException, AWTException {


		/////////logout

		username.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(2000);
		logoutConfirm.click();

		////////login
		Thread.sleep(2000);
		userid.click();
		userid.sendKeys(FinalbillUser);    
		Thread.sleep(1000);
		password.click();
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
		Thread.sleep(2000);
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		counterSearchicon.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(1000);
		medicineCheck.click();
		Thread.sleep(2000);

		//		walkin.click();
		//		Thread.sleep(1000);
		//		walkinSearch.click();
		//		Thread.sleep(1000);
		//		walkinSearch.sendKeys(MRNO, Keys.ENTER);
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[4]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")).click();
		//		//driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		//		Thread.sleep(1000);
		//		OPprovider.click();
		//		Thread.sleep(1000);
		//		OPprovider.sendKeys(provider);
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='"+provider+"']")).click(); 
		//		Thread.sleep(1000);
		//
		//		Thread.sleep(1000);
		//		ItemName.click();
		//		Thread.sleep(1000);
		//		ItemName.sendKeys("Dolo 500Mg");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Dolo 500Mg']")).click();
		//		Thread.sleep(1000);
		//		Qty.click();
		//		Thread.sleep(1000);
		//		Qty.sendKeys("5");
		//		Thread.sleep(1000);
		//		itemadd.click();
		//		Thread.sleep(1000);
		//		ItemName.clear();
		//		Thread.sleep(1000);
		//		ItemName.sendKeys("Calpol 500Mg");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Calpol 500Mg']")).click();
		//		Thread.sleep(1000);
		//		Qty.click();
		//		Thread.sleep(1000);
		//		Qty.sendKeys("5");
		//		Thread.sleep(1000);
		//		itemadd.click();
		//		Thread.sleep(1000);
		//
		//
		//
		//	//	JavascriptExecutor js= (JavascriptExecutor) driver;
		//		js.executeScript("arguments[0].scrollIntoView();", medicineInformation1);
		//		Thread.sleep(1000);
		//
		//		medicineInformation1.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		//		Thread.sleep(1000);
		//		medicineInformation2.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		//		Thread.sleep(1000);
		//		Stockinformation.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")).click();
		//		Thread.sleep(2000);

		Confirm.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed']")).click();
		Thread.sleep(1000);
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(3000);
		medicineCheck.click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
//		Thread.sleep(3000);
		stockSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		Status.click();
		Thread.sleep(1000);
		StockReservation.click();
		Thread.sleep(1000);

		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[normalize-space()='Print']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='billingsave']//i[@class='ki ki-save']")).click();
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(OK1));
		Thread.sleep(2000);
		OK1.click();
		Thread.sleep(1000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		Thread.sleep(1000);
		
		
		toggle.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='link-value'][normalize-space()='FO']")).click();
		Thread.sleep(2000);
		Registration.click();
		Thread.sleep(2000);
		
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='search-icon']//i[@class='ki ki-search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		patientinfo.click();
		Thread.sleep(1000);
		EditInfo.click();
		Thread.sleep(1000);
//		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Insurance_otherinformation);	
		
		Insurance_otherinformation.click();
		Thread.sleep(1000);
		Insurance.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(2000);
		Thread.sleep(600);
		Plan.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='MSD Full cover']")).click();
		Thread.sleep(600);
//		Robot t=new Robot();


//		validto.click();
//		Thread.sleep(1000);
//		for (int i = 0; i <=20; i++) {
//
//			t.keyPress(KeyEvent.VK_DOWN);
//			t.keyRelease(KeyEvent.VK_DOWN);
//			Thread.sleep(400);
//
//		}
//		
//		
//		t.keyPress(KeyEvent.VK_ENTER);
//		t.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(600);
		
		UpdateReg.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		
		

	}



	public void FinalBilling(String MRNO,String authoriser) throws InterruptedException, AWTException {

		toggle.click();
		Thread.sleep(1000);
		//	module.click();
		Thread.sleep(1000);
		finalBilling.click();
		
		Thread.sleep(1000);
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
	    IP.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//div[normalize-space()='Interim Bill']")).click();
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		List<WebElement> dynamicElement211=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement211.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		MRNoEnter.click();
		Thread.sleep(1000);
		MRNoEnter.sendKeys(MRNO);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		search1.click();
		Thread.sleep(1000);
		
//	String SchemeA=	driver.findElement(By.xpath("//tr[@class='total-row']//td[@class='common max ng-star-inserted']")).getText();
	String SchemeA=	driver.findElement(By.xpath("(//td[@class='common ta-r ng-star-inserted'])[2]")).getText();
	
	System.out.println(SchemeA + "Scheme A Amount");
	Thread.sleep(2000);
	
		
		
		driver.findElement(By.xpath("//td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//td[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@title='Advance Log']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='Print']")).click();
		Thread.sleep(5000);
		
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		driver.findElement(By.xpath("//ki-checkbox-control[@class='ng-untouched ng-dirty ng-valid']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='Print']")).click();
		Thread.sleep(5000);
		
	
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		///////////Scheme change
		
		toggle.click();
		Thread.sleep(1000);
		SchemeChange.click();
		Thread.sleep(1000);
		Searchmrno.click();
		Thread.sleep(1000);
		Searchmrno.sendKeys(MRNO, Keys.ENTER);
		Thread.sleep(1000);
		search1.click();
		Thread.sleep(1000);
		Selectallbill.click();
		Thread.sleep(1000);
		GO.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		Thread.sleep(1500);
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", patientShare);	
		
		
		String SchemeB=	driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//div[4]//div[2]")).getText();
		
		System.out.println(SchemeB + "Scheme B Amount");
		Thread.sleep(2000);
		
	
        try {
        	int m = Integer.parseInt(SchemeA);
    	    int n = Integer.parseInt(SchemeB);
    	    
    		int AmountDiff =n-m;
    		System.out.println(AmountDiff + "AmountDiff");
    		
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            System.out.println(e);
        }
    

	   
	    
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(3000);
		OK1.click();
		Thread.sleep(2000);
		
		
		///after scheme change
		
		toggle.click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Interim Bill']")).click();
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		List<WebElement> dynamicElement1121=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1121.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		MRNoEnter.click();
		Thread.sleep(1000);
		MRNoEnter.sendKeys(MRNO, Keys.ENTER);
		Thread.sleep(2000);
		
		Planname.click();  
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='MSD Ins Corp PVT.LTD/MSD Full cover']")).click();
		Thread.sleep(2000);
	
		search1.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//td[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//i[@title='Advance Log']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='Print']")).click();
		Thread.sleep(5000);
		
		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		driver.findElement(By.xpath("//ki-checkbox-control[@class='ng-untouched ng-dirty ng-valid']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='Print']")).click();
		Thread.sleep(5000);
		
	
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		

	}







}
