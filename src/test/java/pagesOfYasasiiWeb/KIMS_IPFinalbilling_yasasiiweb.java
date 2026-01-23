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

public class KIMS_IPFinalbilling_yasasiiweb extends PageFactoryInitYasasiiWeb{

	public KIMS_IPFinalbilling_yasasiiweb(WebDriver driver) {

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
	

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']//i[@class='ki ki-plus']")
	public WebElement Addd;
	

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


	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement medicineCheck;

	@FindBy(xpath = "//div[@class='form-container mb-0 pt-1 billing-card ng-star-inserted']//div[2]//div[1]//div[1]//div[1]//div[1]//div[2]//span[2]//i[1]")
	public WebElement threeDot;

	@FindBy(xpath = "//div[@class='form-container mb-0 pt-1 billing-card ng-star-inserted']//div[2]//div[1]//div[1]//div[1]//div[1]//div[2]//span[2]//div[1]//div[2]")
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

	@FindBy(xpath = "//label[@class='icon emrsave']")
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

	@FindBy(xpath = "//div[@class='plt-prt-5 col-md-8']//i[@class='ki ki-search']")
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

	@FindBy(xpath = "//div[contains(text(),'Invoice Generation')]")
	public WebElement InvoiceGeneration;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNoEnter;



	@FindBy(xpath = "//div[@class='col-1 pl-0 col-md-1 ta-r']//i[@class='ki ki-search']")
	public WebElement search1;

	@FindBy(xpath = "//i[@class='fa fa-chevron-right ng-star-inserted']")
	public WebElement RightArrow1;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-ip-invoice-generation/div/tabset/div/tab[1]/form/div[1]/tabset/div/tab[1]/div/div/table/tbody/tr[2]/td[12]/i")
	public WebElement RightArrow2;

	@FindBy(xpath = "//td[@title='Expand All']//i[@class='fa fa-chevron-right ng-star-inserted']")
	public WebElement itemsview1;



	@FindBy(xpath = "//div[normalize-space()='IP']")
	public WebElement IP;

	@FindBy(xpath = "//span[normalize-space()='Invoice View']")
	public WebElement InvoiceView;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNoenter;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/label[1]/button[1]/i[1]")
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

	@FindBy(xpath = "//i[@title='Generate Invoice']")
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

	@FindBy(xpath = "//i[@class='ki ki-discharge-reconciliation']")
	public WebElement DischargeReconcile;

	@FindBy(xpath = "//i[@class='ki ki-reconciliation']")
	public WebElement Reconsile;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement planText;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-duplicate-medicine-confirmation[1]/div[2]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement overrideReason;

	@FindBy(xpath = "//i[@class='ki ki-file-cancel bydefault']")
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

	@FindBy(xpath = "//li[@class='sidebar-item ng-star-inserted']//li[1]//a[1]")
	public WebElement cancellation;

	@FindBy(xpath = "//span[normalize-space()='Invoice Adjustment Approval']")
	public WebElement InvoiceadjApprove;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement patientSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIconFB;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark1;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement APPROVE;

	@FindBy(xpath = "//div[contains(text(),'Mark as Final')]")
	public WebElement markasFinal;

	@FindBy(xpath = "//input[@id='admndischargestatusid']")
	public WebElement DischargeStatus;

	@FindBy(xpath = "//span[normalize-space()='Discharge Recommendation']")
	public WebElement DisRecom;

	@FindBy(xpath = "//label[normalize-space()='Patient for Discharge']//span[contains(@class,'checkmark')]")
	public WebElement Dischargecheckbox;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='EMR']")
	public WebElement EMR;

	@FindBy(xpath = "//div[normalize-space()='White Board']")
	public WebElement WhiteBoard;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[8]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement NameSearch;

	@FindBy(xpath = "//i[@class='ki ki-info-circle']")
	public WebElement element;

	@FindBy(xpath = "//button[normalize-space()='Ready for discharge']")
	public WebElement REadyForDischarge;

	@FindBy(xpath = "//button[normalize-space()='Clinical Pharmacist Clearance']")
	public WebElement Clinical_Pharmacist_Clearance;

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

	@FindBy(xpath = "//tbody/tr[1]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement laboratoryCheckbox;

	@FindBy(xpath = "//tbody/tr[2]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement radiology_imaging;

	@FindBy(xpath = "//tbody/tr[3]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement MedicalRecords;

	@FindBy(xpath = "//button[normalize-space()='Discharge Summary Clearance']")
	public WebElement Discharge_summary_Clearance;

	@FindBy(xpath = "//button[normalize-space()='Pharmacy Clearance']")
	public WebElement pharmacyClearance;

	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement dischargeStatus;

	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement disposition;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSave;

	@FindBy(xpath = "//i[@class='ki ki-redo']")
	public WebElement RollBack;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/app-billing-adjustment[1]/div[1]/div[2]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement AdjustmentPercentage;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline ml0 ng-star-inserted']")
	public WebElement RaiseRequest;

	@FindBy(xpath = "//div[contains(text(),'Cancellation/refund')]")
	public WebElement invoiceCancel;

	@FindBy(xpath = "//i[@title='Apply Adjustment'][1]")
	public WebElement Adjustment;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-generation-adjustment[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement All;

	@FindBy(xpath = "//button[@title='Add']")
	public WebElement Add1;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-generation-adjustment[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ADJamount;
	
	@FindBy(xpath = "//i[@title='Adjustment Log']")
	public WebElement AdjLog;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement close;
	
	
	
	
	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	@FindBy(xpath = "//input[@id='careadvocateid']")
	public WebElement careteam;

	@FindBy(xpath = "//i[@class='ki ki-doctor-fill']")
	public WebElement ChangeProvider;

	//	@FindBy(xpath = "//input[@id='providername']")
	//	public WebElement Provider;

	@FindBy(xpath = "//label[@title='Add Registration']//i[@class='ki ki-doctor-fill']")
	public WebElement AddRegisteration;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar3']")
	public WebElement Menu;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//div[@class='count ng-star-inserted']")
	public WebElement Task;	

	@FindBy(xpath = "//label[@title='Discharge Summary Clearance']")
	public WebElement DSClearance;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName1;

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

	@FindBy(xpath = "//label[@title='Draft Completed']")
	public WebElement DraftCompletedtask;

	@FindBy(xpath = "//label[normalize-space()='Verified']//span[@class='checkmark']")
	public WebElement verified;

	@FindBy(xpath = "//label[normalize-space()='Authorize']//span[@class='checkmark']")
	public WebElement Authorize;

	@FindBy(xpath = "//button[normalize-space()='Print']")
	public WebElement print1;


	@FindBy(xpath = "//td[@class='ta-c']//span[@class='checkmark']")
	public WebElement pharmacycheckbox;

	@FindBy(xpath = "//div[@class='col-12 col-md-3 ta-r']//i[@class='ki ki-search']")
	public WebElement invoiceSearch;


	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v bydefault']")
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

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add;

	@FindBy(xpath = "//input[@id='cheqnoPayType']")
	public WebElement TransactionNO;

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
	
	@FindBy(xpath = "//span[@class='count ng-star-inserted']")
	public WebElement TaskIcon;

	@FindBy(xpath = "//label[@title='Clinical Pharmacist Clearance']")
	public WebElement PharmacistClearance;
	
	

	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement PharmacyLocation;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")
	public WebElement OK1;

	@FindBy(xpath = "//ki-input-control[@class='ng-untouched ng-valid ng-dirty']//i[@title='Search']")
	public WebElement Search;

	@FindBy(xpath = "//div[@class='col-1 pl-0 col-md-1 ta-r']//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon1;



	@FindBy(xpath = "//i[@title='Pharmacist Verification Pending']")
	public WebElement PharmacistVerification;

	@FindBy(xpath = "//div[@class='form-container pt-1 billing-card cb-40-bottom ng-star-inserted']//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//span[2]//i[1]")
	public WebElement ThreeDot;

	@FindBy(xpath = "//div[@class='form-container pt-1 billing-card cb-40-bottom ng-star-inserted']//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//span[2]//div[1]//div[2]")
	public WebElement pharmacistNote;

	@FindBy(xpath = "//textarea[@id='pharmacistnote']")
	public WebElement TextpharmacistNote;

	@FindBy(xpath = "//label[normalize-space()='To Provider']//span[@class='checkmark']")
	public WebElement ToProvider;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement Save1;

	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement SelectAll;

	@FindBy(xpath = "//div[@class='form-container pt-1 billing-card cb-40-bottom ng-star-inserted']//div[3]//div[1]//div[2]//div[2]//div[3]//div[7]//label[1]//i[1]")
	public WebElement batchdelete;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-ip-panel[1]/div[1]/lib-pharmacy-card[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[6]")
	public WebElement Stockinfo;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-brandpriority[1]/form[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	public WebElement BatchSelect;

	@FindBy(xpath = "//i[@title='Prescription Print']")
	public WebElement prescriptionPrint;

	@FindBy(xpath = "//div[contains(@class,'form-container pt-1 billing-card cb-40-bottom ng-star-inserted')]//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[5]")
	public WebElement MedicineInfo;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-ip-panel[1]/div[1]/lib-pharmacy-card[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[4]")
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

	@FindBy(xpath = "//button[@class='icon cpoeadmin']")
	public WebElement CPOEadministration;

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

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[2]")    
	public WebElement admin2;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[4]")
	public WebElement admin3;

	@FindBy(xpath = "(//i[@class='ki ki-info-circle admin-info'])[3]")
	public WebElement Admininfo3;

	@FindBy(xpath = "//div[5]//div[3]//div[1]//span[2]//label[1]//i[1]")
	public WebElement admin4;

	@FindBy(xpath = "//input[@id='rejectquantity']")
	public WebElement rejectionQty;

	@FindBy(xpath = "//input[@id='verifiedbyname']")
	public WebElement VerifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement Verifypassword;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[9]")
	public WebElement Admin5;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[11]")
	public WebElement admin6;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[12]")
	public WebElement Admin7;

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
		js.executeScript("arguments[0].scrollIntoView(true);", Addd);
		Thread.sleep(600);
		Addd.click();
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

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(14);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);

		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);

		AddRegisteration.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);


	}

	public void ADT( ) throws InterruptedException {


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

	}


	public void Billing(String provider , String service1,String service2,String service3 ) throws InterruptedException {

		///Service Billing
		Thread.sleep(3000);
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
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='"+service1+"']")));
		//driver.findElement(By.xpath("//li[normalize-space()='"+service1+"']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='HBsAg (ECLIA)']")).click();
		Thread.sleep(1000);

		AddService.click();
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


		///Diagnosis	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(EMRsave));
		Diagnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
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
		AddMedicine.click();
		Thread.sleep(1000);


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
		overrideReason.click();
		Thread.sleep(1000);
		overrideReason.sendKeys("ok");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click(); 
		Thread.sleep(1500);
		EMRsave.click();
		Thread.sleep(3000);

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
		//driver.findElement(By.xpath("//li[contains(normalize-space(),'" + PharmacyLocation + "')]"));
		driver.findElement(By.xpath("//li[normalize-space()='West Main']")).click();
		//driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btnsearch']")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']//i[@class='ki ki-check']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']//i[@class='ki ki-check']")).click();
			Thread.sleep(1000);
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);





		driver.findElement(By.xpath("//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(2000);
		medicineCheck.click();
		Thread.sleep(1000);

		/*		walkin.click();
				Thread.sleep(1000);
				walkinSearch.click();
				Thread.sleep(1000);
				walkinSearch.sendKeys(MRNO, Keys.ENTER);
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[4]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")).click();
				//driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
				Thread.sleep(1000);
				OPprovider.click();
				Thread.sleep(1000);
				OPprovider.sendKeys(provider);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='"+provider+"']")).click(); 
				Thread.sleep(1000);

				Thread.sleep(1000);
				ItemName.click();
				Thread.sleep(1000);
				ItemName.sendKeys("Dolo 500Mg");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='Dolo 500Mg']")).click();
				Thread.sleep(1000);
				Qty.click();
				Thread.sleep(1000);
				Qty.sendKeys("5");
				Thread.sleep(1000);
				itemadd.click();
				Thread.sleep(1000);
				ItemName.clear();
				Thread.sleep(1000);
				ItemName.sendKeys("Calpol 500Mg");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='Calpol 500Mg']")).click();
				Thread.sleep(1000);
				Qty.click();
				Thread.sleep(1000);
				Qty.sendKeys("5");
				Thread.sleep(1000);
				itemadd.click();
				Thread.sleep(1000);



			//	JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", medicineInformation1);
				Thread.sleep(1000);

				medicineInformation1.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
				Thread.sleep(1000);
				medicineInformation2.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
				Thread.sleep(1000);
				Stockinformation.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")).click();
				Thread.sleep(2000); */

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
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(3000);
		medicineCheck.click();
		Thread.sleep(1000);
		//		act.moveToElement(threeDot).build().perform();
		//		Thread.sleep(1000);
		//		PharmistRemarks.click();
		//		Thread.sleep(1000);
		//		labelremark.click();
		//		Thread.sleep(1000);
		//		labelremark.sendKeys("pharmacy2");
		Thread.sleep(2000);

		//	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(3000);
		stockSave.click();//button[@id='billholdsave']
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
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[normalize-space()='Print']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='billingsave']")).click();
		Thread.sleep(2000);
		OK1.click();
		Thread.sleep(1000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		Thread.sleep(1000);


	}



	public void dischargeApproval(String MRNO , String nurseUser , String  Password ) throws InterruptedException, AWTException {


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


		///	driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		
		Pharmacypanel.click();
		Ip_panel.click();
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(2000);
		TaskIcon.click();
		Thread.sleep(2000);
		PharmacistClearance.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='"+MRNO+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(2000);
		
		
		//openNewTab --ready for discharge


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
				Thread.sleep(2000);
				
				Thread.sleep(2000);
				Hamberger.click();
				Thread.sleep(1000);
		
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(5000);



//		NameSearch.clear();
//		Thread.sleep(1000);
//		NameSearch.sendKeys(MRNO);
//		Thread.sleep(1000);
//		SearchIcon1.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
//		Thread.sleep(2000);
//
//		js.executeScript("arguments[0].scrollIntoView();", Clinical_Pharmacist_Clearance);
//		Thread.sleep(2000);
//		act.moveToElement(Clinical_Pharmacist_Clearance).click().build().perform();
//		Thread.sleep(2000);
//
//		verifiedBy.click();
//		Thread.sleep(1000);
//		verifiedBy.sendKeys(NurseID);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click();
//		Thread.sleep(1000);
//		verifyPassword.click();
//		verifyPassword.sendKeys(Password);
//		Thread.sleep(1000);
//		verifySave.click();
//		Thread.sleep(3000);




		////Ready for Discharge


		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNO);
		Thread.sleep(2000);
		SearchIcon1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);

//		JavascriptExecutor js1= (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
		Thread.sleep(2000);
		act.moveToElement(REadyForDischarge).click().build().perform();
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

		List<WebElement> dynamicElement1111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		////////ROLLBACK	

		js1.executeScript("arguments[0].scrollIntoView();", RollBack);
		Thread.sleep(3000);
		act.moveToElement(RollBack).click().build().perform();
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

		js1.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
		Thread.sleep(2000);
		act.moveToElement(REadyForDischarge).click().build().perform();
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
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));

		Thread.sleep(2000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		SearchIcon1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);

		pharmacycheckbox.click();
		Thread.sleep(1000);


		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);   


	}


	public void Discharge_Summary_Clearance(String MRDUser, String MRDPassword,String MRNo,String docid,String docpassword, String nurseUser  ) throws InterruptedException, AWTException {



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
		EnterPatientName1.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
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
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Report));
		Thread.sleep(10000);		
		DOD.click();
		Thread.sleep(2000);
		Today.click();
		Thread.sleep(3000);
		Report.click();
		Thread.sleep(1000);
		Report.sendKeys("ChatGPT is a chatbot developed by OpenAI and launched on November 30, 2022. Based on large language models, it enables users to refine and steer a conversation towards a desired length, format, style,");
		Thread.sleep(1000);
		Disgnosis.click();
		Thread.sleep(1000);
		DSInitiated.click();
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[11]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("Test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[12]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("Test");
		Thread.sleep(1000);
		save.click();
		Thread.sleep(2000);

		
		wait.until(ExpectedConditions.elementToBeClickable(Visit));
		Thread.sleep(1000);
		Visit.click();
		Thread.sleep(3000); 
		
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(DOD));
		Thread.sleep(1000);
		
		DraftCompleted.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(Visit));
		Thread.sleep(1000);
		Visit.click();
		Thread.sleep(3000);
		
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(DOD));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
		Thread.sleep(3000);	
		//		LOG1.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']//i[@class='ki ki-close-circle']")).click();
		//		Thread.sleep(3000);	



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
		userid.sendKeys( ProviderID);
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


		Menu.click();
		Thread.sleep(2000);
		EMRHomeScreen.click();
		Thread.sleep(1000);

		Task.click();
		Thread.sleep(2000);
		DraftCompletedtask.click();
		Thread.sleep(1000);
		EnterPatientName1.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement1111=driver.findElements(By.xpath("//div[@class='dl-body']//div[2]"));

		if(dynamicElement1111.size() ==0)
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
		List<WebElement> dynamicElement21=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement21.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(DOD));
		Thread.sleep(1000);
		
		verified.click();
		Thread.sleep(1000);
		Authorize.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(Visit));
		Thread.sleep(3000);
		Visit.click();
		Thread.sleep(3000);
		
		List<WebElement> dynamicElement31=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement31.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(print1));
		Thread.sleep(1000);
		
		//		driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
		//		Thread.sleep(3000);	
		print1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='With Header']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);

		Thread.sleep(3000);	
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

//
//		///Pharmacy Clearance
//		Thread.sleep(1000);
//		Logoutarw.click();
//		Thread.sleep(1000);
//		Logoutbutton.click();
//		Thread.sleep(1000);
//		Logoutconfrm.click();
//		Thread.sleep(1000);
//
//
//		//login
//		userid.click();
//		Thread.sleep(1000);
//		userid.sendKeys(NurseID);
//		Thread.sleep(1000);
//		password.click();
//		password.sendKeys(Password); 
//		Thread.sleep(1000);
//		site.click();
//		Thread.sleep(1000);
////						JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
//		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
//		Thread.sleep(5000);
//
//
//		///	driver.navigate().refresh();
//		Thread.sleep(2000);
//		Hamberger.click();
//		Thread.sleep(1000);
//		EMR.click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
//		Thread.sleep(1000);
//		WhiteBoard.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
//		Thread.sleep(2000);
//
//		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));
//
//		Thread.sleep(2000);
//		NameSearch.clear();
//		Thread.sleep(1000);
//		NameSearch.sendKeys(MRNo);
//		Thread.sleep(1000);
//		SearchIcon1.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
//		Thread.sleep(3000);
//		act.moveToElement(Depclearance).click().build().perform();
//		//Depclearance.click();
//		Thread.sleep(1000);
//
//		pharmacycheckbox.click();
//		Thread.sleep(1000);
//
//
//		verifiedBy.click();
//		Thread.sleep(1000);
//		verifiedBy.sendKeys(NurseID);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click();
//		Thread.sleep(1000);
//		verifyPassword.click();
//		verifyPassword.sendKeys(Password);
//		Thread.sleep(1000);
//		verifySave.click();
//		Thread.sleep(2000);   



	}





	public void ADTAppoval(String MRNO , String adminid ,String adminpassword) throws InterruptedException, AWTException {


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
		Thread.sleep(500);
		userid.sendKeys(FinalbillUser);
		Thread.sleep(500);
		password.click();
		Thread.sleep(500);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);  

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
		Thread.sleep(1000);
		FOSearchField.sendKeys(MRNO);
		Thread.sleep(1000);
		FOSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(3000);
		ADT.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);


		///ADT Discharge

		Thread.sleep(2000);
		dischargeStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);
		disposition.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='To Home']")).click();
		Thread.sleep(1000);
		ADTSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);

		Thread.sleep(2000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);


		// driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();




	}


	public void FinalBilling( String adminid ,String adminpassword ,String MRNO) throws InterruptedException {


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
//		userid.sendKeys(authoriser);
//		Thread.sleep(1000);
		userid.sendKeys("admin");
//		Thread.sleep(1000);
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


		toggle.click();
		Thread.sleep(1000);
		//	module.click();
		Thread.sleep(1000);
		finalBilling.click();
		Thread.sleep(1000);
		IP.click();
		Thread.sleep(1000);
		InvoiceGeneration.click();
		Thread.sleep(1000);
		MRNoEnter.click();
		Thread.sleep(1000);
		MRNoEnter.sendKeys(MRNO);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		search1.click();
		Thread.sleep(1000);
		//RightArrow1.click();
		//Thread.sleep(1000);
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


		InvoiceView.click();
		Thread.sleep(1000);
		invoiceSearch.click();
		Thread.sleep(1000);
		options.click();
		Thread.sleep(1000);
		DraftFinalization.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("APPROVED");
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-select-control[@clearval='false']//input[@id='undefined']"));

		if(dynamicElement1.size() ==0)
		{
			driver.findElement(By.xpath("//div[@class='form-container invoice-view mb0']//div[@title='Search By'][normalize-space()='Search By']")).click();
			Thread.sleep(2000);
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);		
		
		
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
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("APPROVED");
		Thread.sleep(2000);
		Save1.click();
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
		MRNoenter.click();
		Thread.sleep(1000);
		MRNoenter.sendKeys(MRNO);
		Thread.sleep(1000);
		//	Search.click();
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(1000);

		Adjustment.click();
		Thread.sleep(1000);
		All.click();
		Thread.sleep(1000);
		ADJamount.click();
		Thread.sleep(1000);
		ADJamount.sendKeys("500");
		Thread.sleep(1000);
		
		Add1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm inline ml0 ng-star-inserted']")).click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")));
	    
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		
		
		
		AdjLog.click();
        String Adjamount =driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]")).getText();
		Thread.sleep(1000);
		
		System.out.println(Adjamount);
		close.click();
		
//		AdjustmentPercentage.click();
//		Thread.sleep(1000);
//		AdjustmentPercentage.sendKeys("25");
//		Thread.sleep(1000);
//		RaiseRequest.click();
//		Thread.sleep(1000);
//		Authoriser.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@title='"+authoriser+"']")).click();
//		Thread.sleep(1000);
//		Remarks.click();
//		Thread.sleep(1000);
//		Remarks.sendKeys("ok"); 
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='dailog-btn']//i[@class='ki ki-check']")).click();
//		Thread.sleep(1000);
//
//		//RCM
//		Thread.sleep(1000);
//		toggle.click();
//		Thread.sleep(1000); 
//		RCM.click();
//		Thread.sleep(1000); 
//		driver.findElement(By.xpath("//div[normalize-space()='Approve Request']")).click();
//		Thread.sleep(1000);
//		InvoiceadjApprove.click();
//		Thread.sleep(1000);
//		patientSearch.clear();	
//		Thread.sleep(1000);
//		patientSearch.sendKeys(MRNO ,Keys.ENTER);
//		Thread.sleep(1000);
//		SearchIconFB.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[5]/lib-invoice-adj-approval[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();	
//		//CHECK.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[5]/lib-invoice-adj-approval[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")).click();	
//
//		Thread.sleep(1000);
//		remark1.click();
//		Thread.sleep(1000);
//		remark1.sendKeys("approved");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
//		Thread.sleep(1000);
//		APPROVE.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();	
//		Thread.sleep(1000);  
//
//		///refund
//
//		toggle.click();
//		Thread.sleep(1000); 
//		//RCM.click();
//		Thread.sleep(1000);
//		invoiceCancel.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/ul[1]/li[5]/a[1]/span[1]")).click();	
//		Thread.sleep(1000);
//		patientSearch.clear();
//		Thread.sleep(1000);
//		patientSearch.sendKeys(MRNO ,Keys.ENTER);
//		Thread.sleep(1000);
//		SearchIconFB.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[5]/lib-invoice-adj-apply[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
//		Thread.sleep(1000);
//		//driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		//Thread.sleep(1000);
//		OK1.click();
//		Thread.sleep(1000);  



		////Settle invoice	

		toggle.click();
		Thread.sleep(1000); 
//		IP.click();
		Thread.sleep(1000); 
		SettleInvoice.click();
		Thread.sleep(1000);
		Mrnoenter3.click();
		Thread.sleep(1000);
		Mrnoenter3.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/label[1]/button[1]")).click();
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
		OK1.click();
		Thread.sleep(1000);




	}


	public void Discharge_followup(String MRNO) throws InterruptedException {



		toggle.click();
		Thread.sleep(1000); 
		module.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-reception-fill']")).click();
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

		Thread.sleep(1000);
		Clear.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(2000);

		EncounterAdd.click();
		Thread.sleep(2000);
        String DischargeFollowupServiceName= driver.findElement(By.xpath("//*[contains(text(),'"+DischargeFollowupService+"')]")).getText();
        System.out.println("DischargeFollowupServiceName - "+ DischargeFollowupServiceName);

		driver.findElement(By.xpath("//*[contains(text(),'"+DischargeFollowupService+"')]")).click();
		Thread.sleep(2000);
		EncounterSave.click();
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(SAvesuccess));
	    Thread.sleep(1000);
		
		SAvesuccess.click();
		Thread.sleep(3000);

	}



}