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

public class KIMS_PharmacyBilling_Additive_outsider_Walkin_Yasasiiweb  extends PageFactoryInitYasasiiWeb{
	public KIMS_PharmacyBilling_Additive_outsider_Walkin_Yasasiiweb(WebDriver driver) {
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


	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	
	
	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//label[@title='Add']")
	public WebElement EncounterAdd;


	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")    //input[@id='chiefcomplainttext']
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement cpoeServiceSearch;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement cpoePharmacy;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement medicineSearch;

	@FindBy(xpath = "//input[contains(@formcontrolname,'searchText')]")
	public WebElement medicineSearch1;

	@FindBy(xpath = "//div[@class='btn-pharmacy-search def-search']//i[@class='ki ki-favourite-fill']")
	public WebElement uncheckStar;

	@FindBy(xpath = "//input[@placeholder='Search Medicines']")
	public WebElement medicineSelect;

	@FindBy(xpath = "//app-cpoe-pharmacy-prescription//ki-select-control[@id='routeid']//input[1]")
	public WebElement Route;

	@FindBy(xpath = "//input[@id='formid']")
	public WebElement Form;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement AddMedicine;

	@FindBy(xpath = "//input[@id='mindose']")
	public WebElement DoseLevel;

	@FindBy(xpath = "//input[@id='doseunitid']")
	public WebElement Doseunit;

	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement DurationUnit;

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement reason;


	@FindBy(xpath = "//button[contains(@class,'icon emrsave')]")
	public WebElement EMRsave;

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

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//a[contains(@title,'EMR HomeScreen (To View Home Screen)')]")
	public WebElement EMRhomescreen;


	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;


	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine;
	@FindBy(xpath="//div[@class='order-details']//i[@class='fa fa-ellipsis-v']")
	public WebElement editpharmacy;
	@FindBy(xpath="//input[@name='remarks']")
	public WebElement remarkedit;
	@FindBy(xpath="//button[@id='updatePharmacy']")
	public WebElement updatepharmacy;
	@FindBy(xpath="//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement yesdeletepharmacy;
	@FindBy(xpath="//input[@id='MedicineName']")
	public WebElement medicinename;
	@FindBy(xpath="//span[@title='Add Additive']//i[@class='ki ki-plus']")
	public WebElement Add;
	@FindBy(xpath="//div[contains(@class,'col-md-12 pr0 ta-r')]//button[contains(@type,'button')][normalize-space()='OK']")
	public WebElement ok;
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency;
	@FindBy(xpath="//input[@id='ivrate']")
	public WebElement addrate;

	@FindBy(xpath="//input[@id='ivrateunitid']")
	public WebElement idadd;

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle pro-pic tab-prof-wrap']")
	public WebElement username;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
	public WebElement logout;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[@class='logout list-item ']")
	public WebElement logout1;


	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement logoutConfirm;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement counterSearch;

	@FindBy(xpath = "//i[@title='Search']")
	public WebElement counterSearchicon;

	@FindBy(xpath = "//i[@title='Outsider']")
	public WebElement outsider;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement PatName;

	@FindBy(xpath = "//input[@id='genderid']")
	public WebElement Gender;

	@FindBy(xpath = "//input[@id='genderage']")
	public WebElement Age;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MobileNo;

	@FindBy(xpath = "//input[@id='medicinename']")
	public WebElement ItemName;

	@FindBy(xpath = "//input[@id='qtynew']")
	public WebElement Qty;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement itemadd;

	@FindBy(xpath = "(//i[@title='Medicine Information'])[2]")
	public WebElement medicineInformation1;

	@FindBy(xpath = "(//i[@title='Medicine Information'])[3]")
	public WebElement medicineInformation2;

	@FindBy(xpath = "(//i[@title='Stock Information'])[2]")
	public WebElement Stockinformation;

	@FindBy(xpath = "//button[@id='confirmsave']")
	public WebElement Confirm;

	@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
	public WebElement Status;

	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement medicineCheck;

	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	public WebElement threeDot;

	@FindBy(xpath = "//div[normalize-space()='Pharmacist Remark']")
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

	@FindBy(xpath = "//i[@title='Order Information']")
	public WebElement orderInformation;

	@FindBy(xpath = "//span[normalize-space()='Admin View']")
	public WebElement AdminView;


	@FindBy(xpath = "//div[@class='col-md-12 mb0 med-area med-name-head-wrap']//i[@title='Stock Information']")
	public WebElement StockInformation;

	@FindBy(xpath = "//div[normalize-space()='Pharmacist Remark']")
	public WebElement PharmasistRemark;

	@FindBy(xpath = "//textarea[@id='note']")
	public WebElement InterventionRemark;

	@FindBy(xpath = "//i[@title='Prescription Print']")
	public WebElement print;

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EMRsave1;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
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

	@FindBy(xpath = "//i[@title='Delete']")
	public WebElement Additives;

	@FindBy(xpath = "//ki-checkbox-control[@class='ng-untouched ng-pristine ng-valid']//label[@class='check-container zero-label']//span[@class='checkmark']")
	public WebElement AdditiveUncheck;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement Fo;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[1]/div[1]/div[1]/label[1]")
	public WebElement bar;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[1]/div[1]/div[1]")
	public WebElement barspace;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[2]/div[1]/div[1]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")
	public WebElement daterange;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement site1;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchPAt;

	@FindBy(xpath = "//i[contains(@class,'ki ki-cash-transfer')]")
	public WebElement AvailedService;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Checkbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[1]/i[1]")
	public WebElement rightArrow;

	@FindBy(xpath = "//input[@id='quantity0']")
	public WebElement QuantityEdit;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement auth;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM']")
	public WebElement RCM;

	@FindBy(xpath = "//div[normalize-space()='Approve Request']")
	public WebElement ApproveRequest;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement CHECK;

	@FindBy(xpath = "//span[normalize-space()='Advance Approval']")
	public WebElement AdvanceApproval;

	@FindBy(xpath = "//div[@class='row advance-approve ng-star-inserted']//th[@class='amount'][normalize-space()='Net Amount']")
	public WebElement Element;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement AmountEdit;

	@FindBy(xpath = "//input[@id='approvalamount0']")
	public WebElement Amount1;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark1;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement APPROVE;

	@FindBy(xpath = "//td[@class='icon-info']//i[@title='Request Approved']")
	public WebElement reqAPPROVE;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement reqSave;

	@FindBy(xpath="//div[text()='Cancellation/Refund']")
	public WebElement cancelrefund;

	@FindBy(xpath="//i[@class='ki ki-medical-kit']")
	public WebElement encounter;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement patientSearch;

	@FindBy(xpath = "//input[@id='status']")
	public WebElement Status1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MrnoSearch;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[9]/label[1]/button[1]")
	public WebElement SearchIcon1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/i[1]")
	public WebElement CancelReq;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement firstcheckbox;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement SaVe;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement  yes;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/span[1]/i[1]")
	public WebElement RemarksIcon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement  checkbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement RemarksIcon1;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement RemarksIcon2;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement excloc;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement  checkbox1;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group ki-dropdown']//input[@id='undefined']")
	public WebElement Scheme;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;




	public void patreg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo ) throws InterruptedException, AWTException, IOException {


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


		Title.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+title+"']")).click();
		Thread.sleep(500);
		EnterFirstNME.sendKeys(Name);
		Thread.sleep(500);
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


			JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",emergencyContact );
		Thread.sleep(1000);
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
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Add1 );
		Add1.click();
		Thread.sleep(600);


		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement11.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		Thread.sleep(1000);

		
		
		
		HowDidYouKnow.click();
		Thread.sleep(600);
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		Save.click();
		Thread.sleep(1000);

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
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(billing));
		Thread.sleep(3000);
		
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
		HSSFSheet BirthRegistration=wb.getSheetAt(30);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);


	}




	public void doctorNote(String MRNo ,String site , String User) throws InterruptedException, AWTException {



		////////logout
		Thread.sleep(3000);
		username.click();
		Thread.sleep(1000);
		logout1.click(); 
		Thread.sleep(1000);
		logoutConfirm.click();

		///login
		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		site1.click();
		Thread.sleep(1000);

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
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNo + "')]")).click();

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

		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement111.size() !=0)
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
		Thread.sleep(1000);
		tempOk.click();
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(EMRsave1));

		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Diagnosis and Plan')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);

		cpoePharmacy.click();
		Thread.sleep(1000);
		//uncheckStar.click();
		//Thread.sleep(2000);
		medicineSearch1.click();
		Thread.sleep(1000);
		medicineSearch1.sendKeys("DEXTROSE 5% 500ML ACULIFE", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@title,'by Intravenous')]")).click();
		Thread.sleep(1000);

		///////////////////
		driver.findElement(By.xpath("//i[@class='ki ki-additive custom-additive']")).click();
		Thread.sleep(1000);
		medicinename.click();
		Thread.sleep(1000);
		medicinename.sendKeys("GLUCI INJ 10ML");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='GLUCI INJ 10ML']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//li[normalize-space()='Dixin 0.5Mg/2Ml Inj']")).click();
		//Thread.sleep(500);
		Add.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		//	ok.click();
		Thread.sleep(500);
		frequency.click();
		driver.findElement(By.xpath("//li[normalize-space()='BD']")).click();
		Thread.sleep(1000);
		//rateadd.click();
		//	rateadd.sendKeys("5");
		Thread.sleep(500);
		addrate.click();
		addrate.sendKeys("100");
		Thread.sleep(500);
		idadd.click();
		driver.findElement(By.xpath("//li[normalize-space()='ml/Hr']")).click();
		Thread.sleep(500);
		//	driver.findElement(By.xpath("//input[@id='slotduration']")).sendKeys("5");
		Thread.sleep(1000);
		ADDMedicine.click();
		//	yesadd.click();
		Thread.sleep(3000);			    
		//Edit-Additivemedicine
		editpharmacy.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
		Thread.sleep(1000);
		remarkedit.click();
		Thread.sleep(1000);
		remarkedit.sendKeys("Adding Additive");
		Thread.sleep(1000);
		updatepharmacy.click();
		Thread.sleep(3000);
		EMRsave1.click();

		////////logout
	WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link dropdown-toggle pro-pic tab-prof-wrap']")));

		Thread.sleep(3000);
		username.click();
		Thread.sleep(1000);
		logout1.click(); 
		Thread.sleep(1000);
		logoutConfirm.click();

		///login
		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		site1.click();
		Thread.sleep(1000);

//			JavascriptExecutor js= (JavascriptExecutor) driver;
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
		Thread.sleep(1000);
		opPanel.click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		pharloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(1000);
		pharlocOK.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);


		Thread.sleep(1000);
		counterSearch.click();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNo,Keys.ENTER);
		Thread.sleep(1000);
		counterSearchicon.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		// patientSearch2.click();
		Thread.sleep(2500);
		medicineCheck.click();
		Thread.sleep(2000);
		
		StockInformation.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger sm clear')]")).click();
		Thread.sleep(2000);
		orderInformation.click();
		Thread.sleep(1000);
		AdminView.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		medicineCheck.click();
		Thread.sleep(2000);
		medicineCheck.click();
		Thread.sleep(2000);
		Confirm.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(3000);
		medicineCheck.click();
		Thread.sleep(3000);

	//	JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Additives );
		Thread.sleep(1000);

		AdditiveUncheck.click();
		Thread.sleep(2000);
		stockSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dialog-content Information']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);

		//		js.executeScript("arguments[0].scrollIntoView();",medicineCheck);
		//		Thread.sleep(1000);
		//act.moveToElement(AdditiveUncheck).click().build().perform();
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//i[@class='ki ki-info-circle-fill ng-star-inserted']")));
		Thread.sleep(2000);
		medicineCheck.click();
		Thread.sleep(1000);
		act.moveToElement(threeDot).build().perform();
		Thread.sleep(1000);
		PharmasistRemark.click();
		Thread.sleep(1000);
		InterventionRemark.click();
		Thread.sleep(1000);
		InterventionRemark.sendKeys("pharmacy2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);
		stockSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		StockReservation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Print']//span[@class='checkmark']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='billingsave']")).click();
		Thread.sleep(1000);
		
		
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")));		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);


		Dispensing.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		RightArrow.click();
		Thread.sleep(1000);
		Dispensed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		OPOrder.click();
		Thread.sleep(1000);


	} 


	public void Outsider(String outsiderName1) throws AWTException, InterruptedException {

		toggle.click();
		Thread.sleep(1000);
		Fo.click();
		Thread.sleep(1000);
		Pharmacypanel.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		opPanel.click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//Thread.sleep(1000);
		pharloc.click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(1000);
		//	callerID.click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//li[normalize-space()='2nd Level Pharmacy-Caller 1']")).click();
		pharlocOK.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);


		daterange.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		outsider.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='closed-ads ng-star-inserted']//i[@class='ki ki-close']")).click();
		Thread.sleep(1000);
		
		PatName.click();
		Thread.sleep(1000);
        String lastName =RandomString.lastName();
		
		System.out.println(lastName + "LastName" );
		PatName.sendKeys(outsiderName1 + lastName);
		Thread.sleep(1000);
		Gender.click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Male']")).click();
		Thread.sleep(1000);
		Age.click();
		Thread.sleep(1000);
		Age.sendKeys("23");
		Thread.sleep(1000);
		MobileNo.click();
		Thread.sleep(1000);
		MobileNo.sendKeys("7797611554");
		Thread.sleep(1000);
//		Scheme.click();
//		driver.findElement(By.xpath("//li[normalize-space()='Default']")).click();
//		Thread.sleep(1000);


		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",ItemName );
		Thread.sleep(1000);


		ItemName.click();
		Thread.sleep(1000);
		ItemName.sendKeys("DOLOPAR 650 TAB");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='DOLOPAR 650 TAB']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("5");
		Thread.sleep(1000);
		itemadd.click();
		Thread.sleep(1000);
		ItemName.clear();
		Thread.sleep(1000);
		ItemName.sendKeys("CROCIN 650MG TAB");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='CROCIN 650MG TAB']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("5");
		Thread.sleep(1000);
		itemadd.click();
		Thread.sleep(1000);



		//JavascriptExecutor js= (JavascriptExecutor) driver;
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
		Thread.sleep(1000);
		Confirm.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed']")).click();
		Thread.sleep(1000);



		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(outsiderName1 , Keys.ENTER);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'"+outsiderName1+"')]")).click();
		Thread.sleep(1000);
		medicineCheck.click();
		Thread.sleep(1000);
		act.moveToElement(threeDot).build().perform();
		Thread.sleep(2000);
		PharmistRemarks.click();
		Thread.sleep(1000);
		labelremark.click();
		Thread.sleep(1000);
		labelremark.sendKeys("pharmacy2");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);
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
		counterSearch.sendKeys(outsiderName1 , Keys.ENTER);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+outsiderName1+"')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Print']//span[@class='checkmark']")).click();
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//button[@id='billingsave']")).click();
		Thread.sleep(1000);
		

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")));		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		///dispense	

		Dispensing.click();
		Thread.sleep(3000);

		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(outsiderName1 ,Keys.ENTER);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'"+outsiderName1+"')]")).click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		RightArrow.click();
		Thread.sleep(1000);
		Clear.click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		Dispensed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);




	}


	public void walkin(String PROVIDER, String MRNo) throws InterruptedException, AWTException {

//
//		toggle.click();
//		Thread.sleep(1000);
//		Fo.click();
//		Thread.sleep(500);
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		Thread.sleep(1000);
//		Pharmacypanel.click();
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		opPanel.click();
//		Thread.sleep(3000);
//		//driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		Thread.sleep(1000);
//		pharloc.click(); 
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Base_Nagercoil_Central']")).click();
//		Thread.sleep(1000);
//		//		//	callerID.click();
//		//		Thread.sleep(1000);
//		//		//	driver.findElement(By.xpath("//li[normalize-space()='2nd Level Pharmacy-Caller 1']")).click();
//		pharlocOK.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		Thread.sleep(1000);


		Thread.sleep(1000);
		OPOrder.click();
		Thread.sleep(2000);
		walkin.click();
		Thread.sleep(1000);
		walkinSearch.click();
		Thread.sleep(1000);
		walkinSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(1000);
		walkinSearch.sendKeys( Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='pat-mrn-g']//span[contains(text(),'"+MRNo+"')]")).click();
		Thread.sleep(1000);
		//		OPprovider.clear();
		//		Thread.sleep(1000);
		//		OPprovider.sendKeys(PROVIDER);
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER+"']")).click(); 
		Thread.sleep(1000);

		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);
		ItemName.sendKeys("CROCIN 650MG TAB");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='CROCIN 650MG TAB']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("5");
		Thread.sleep(1000);
		itemadd.click();
		Thread.sleep(1000);
		ItemName.clear();
		Thread.sleep(1000);
		ItemName.sendKeys("DOLOPAR 650 TAB");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='DOLOPAR 650 TAB']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("5");
		Thread.sleep(1000);
		itemadd.click();
		Thread.sleep(1000);



		JavascriptExecutor js= (JavascriptExecutor) driver;
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
		Thread.sleep(2000);
		Confirm.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		//
		//		act.moveToElement(barspace).build().perform();
		//		Thread.sleep(1000);
		//		js.executeScript("arguments[0].scrollIntoView();", bar);
		//		Thread.sleep(1000);
		//		
		//		bar.click();
		//		Thread.sleep(1000);
		//		
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed']")).click();
		Thread.sleep(1000);



		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNo+"')]")).click();
		Thread.sleep(1000);
		medicineCheck.click();
		Thread.sleep(1000);
		act.moveToElement(threeDot).build().perform();
		Thread.sleep(1000);
		PharmistRemarks.click();
		Thread.sleep(1000);
		labelremark.click();
		Thread.sleep(1000);
		labelremark.sendKeys("pharmacy2");
		Thread.sleep(1000);
		//		print.click();
		//		Thread.sleep(2000);
		//		Robot t=new Robot();
		//		t.keyPress(KeyEvent.VK_ESCAPE);
		//		t.keyRelease(KeyEvent.VK_ESCAPE);
		//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(3000);
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
		counterSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNo+"')]")).click();
		Thread.sleep(1000);


		driver.findElement(By.xpath("//label[normalize-space()='Print']//span[@class='checkmark']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='billingsave']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		///dispense	

		Dispensing.click();
		Thread.sleep(1000);

		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNo+"')]")).click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		RightArrow.click();
		Thread.sleep(1000);
		Clear.click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		Dispensed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);


	}
	public void Availed(String User , String Password , String site,String MRNo) throws InterruptedException {



		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site1.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		toggle.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);

		Registration.click();

		Thread.sleep(600);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);



		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchtext']")));


		Thread.sleep(1500);
		SearchPAt.click();
		Thread.sleep(600);
		SearchPAt.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(600);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);




		Thread.sleep(1000);
		AvailedService.click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//label[normalize-space()='OP Credit']//span[@class='checkmark']")).click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//label[normalize-space()='IP']//span[@class='checkmark']")).click();
//		Thread.sleep(700);
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(2000);

		rightArrow.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/span[1]/i[1]")).click();
		Thread.sleep(1000);

		QuantityEdit.clear();
		Thread.sleep(700);
		QuantityEdit.sendKeys("3");
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='modal-footer ta-r']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='fa fa-close bydefault'])[1]")).click();
		Thread.sleep(1000);



		Thread.sleep(2000);
		auth.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='"+authoriser+"']")).click();
		Thread.sleep(1000);
		remark.click();
		Thread.sleep(1000);
		remark.sendKeys("Requested");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);



	}

	public void AuthorisingRequest( String User , String Password , String site,String MRNo ) throws InterruptedException, AWTException {


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
		userid.sendKeys(FinalbillUser);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site1.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Hamberger.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		RCM.click();
		Thread.sleep(1000);
		ApproveRequest.click();
		Thread.sleep(1000); 

		Thread.sleep(600);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);


		List<WebElement> dynamicElement=driver.findElements(By.xpath("//td[@class='max mr-num']"));

		int z =	dynamicElement.size();
		int a= z/4;

		System.out.println("size="+a);
		Thread.sleep(1000);
		patientSearch.clear();
		Thread.sleep(1000);
		patientSearch.sendKeys(MRNo ,Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();	
		//CHECK.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")).click();	

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

		///////Approve Cancel

		Thread.sleep(1000);
		Status1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon1.click();
		Thread.sleep(1000);
		checkbox1.click();
		Thread.sleep(1000);
		CancelReq.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);




		Thread.sleep(3000);
		Status1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		checkbox1.click();
		Thread.sleep(1000);
		RemarksIcon2.click();
		Thread.sleep(800);
		Remarks1.click();
		Thread.sleep(1000);
		Remarks1.sendKeys("ok");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")).click();
		Thread.sleep(800);
		SaVe.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);

		/////////////////////////////

		Hamberger.click();
		Thread.sleep(1000);
		//FO.click();
		Thread.sleep(1000);
		//RCM.click();
		Thread.sleep(1000);
		cancelrefund.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//span[@class='checkmark']"));
		Thread.sleep(1000);
		int y =	dynamicElement1.size();
		System.out.println("Y="+y);
		int b= y/4;
		System.out.println("b="+ b);
		Thread.sleep(1000);



		Thread.sleep(1000);
		patientSearch.clear();
		Thread.sleep(1000);
		patientSearch.sendKeys(MRNo ,Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		//		String Returnamount =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")).getText();
		//		Thread.sleep(1000);
		//		System.out.println("returnAmount"+Returnamount);
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//input[@id='cash']")).sendKeys( Keys.BACK_SPACE);
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//input[@id='wallet']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//input[@id='wallet']")).sendKeys( Keys.BACK_SPACE);
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//input[@id='wallet']")).sendKeys(Returnamount);
		//		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//label[@class='check-container zero-label']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		reqSave.click();
		Thread.sleep(1000);
		excloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Base_Nagercoil_Central']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-footer']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(3000);
//		Robot t =new Robot();
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(500);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);

		/*		Thread.sleep(1000);
		int n =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("CURRENT NO.OF WINDOWS"+ n);
		int m= n-3;
		Thread.sleep(1000);
		System.out.println("go to window no."+ m);
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(m));
		Thread.sleep(3000);



		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		RightArrow.click();
		Thread.sleep(1000);
		Clear.click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		Dispensed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();  */
		Thread.sleep(1000);

	}

}


































