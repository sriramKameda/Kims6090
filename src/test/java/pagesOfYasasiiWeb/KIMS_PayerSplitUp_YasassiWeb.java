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

import junit.framework.Assert;

public class KIMS_PayerSplitUp_YasassiWeb extends PageFactoryInitYasasiiWeb {

	public KIMS_PayerSplitUp_YasassiWeb(WebDriver driver) {
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

	@FindBy(xpath = "//input[@id='lastname']")
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

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement AddService;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement ServSave;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement advanceAmount;

	//// Pharmacy bill

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

	@FindBy(xpath = "(//i[@class='fa fa-ellipsis-v'])[1]")
	public WebElement threeDot;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/div[2]")
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

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement Fo;

	@FindBy(xpath = "//i[contains(@class,'ki ki-bill')]") // i[@class='ki ki-bill']
	public WebElement finalBilling;

	@FindBy(xpath = "//div[normalize-space()='Generate Invoice']")
	public WebElement GenerateInvoice;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNoEnter;

	@FindBy(xpath = "//div[@class='col-1 pl-0 col-md-1 ta-r']//i[@class='ki ki-search']")
	public WebElement Search;

	@FindBy(xpath = "//i[@class='fa fa-chevron-right ng-star-inserted']")
	public WebElement RightArrow1;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-ip-invoice-generation/div/tabset/div/tab[1]/form/div[1]/tabset/div/tab[1]/div/div/table/tbody/tr[2]/td[12]/i")
	public WebElement RightArrow2;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[1]")
	public WebElement eye1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/i[1]")
	public WebElement eye2;

	@FindBy(xpath = "//tbody/tr[1]/td[15]/i[1]")
	public WebElement itemsview1;

	@FindBy(xpath = "//button[normalize-space()='Draft Generate']")
	public WebElement DraftGenerate;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='undefined']")
	public WebElement invoiceMode;

	@FindBy(xpath = "//div[normalize-space()='OP']")
	public WebElement Op;

	@FindBy(xpath = "//span[normalize-space()='Invoice View']")
	public WebElement InvoiceView;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNoenter;

	@FindBy(xpath = "//div[contains(@class,'col-12 col-md-3 ta-r')]//i[contains(@class,'ki ki-search')]")
	public WebElement Search2;

	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	public WebElement ThreeDot;

	@FindBy(xpath = "//label[normalize-space()='Draft Finalization']")
	public WebElement DraftFinalization;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement OK1;

	@FindBy(xpath = "//label[normalize-space()='Generate Invoice']")
	public WebElement GenerateInvoice1;

	@FindBy(xpath = "//div[@class='col-12 col-md-3 ta-r']//i[@class='ki ki-search']")
	public WebElement Search4;

	@FindBy(xpath = "//div[normalize-space()='Settle Invoice']")
	public WebElement SettleInvoice;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Mrnoenter3;

	@FindBy(xpath = "//i[@title='Settle Invoice']")
	public WebElement settleicon1;//

	@FindBy(xpath = "//td[contains(@class,'max group-info')]")
	public WebElement grid1;

	@FindBy(xpath = "//button[normalize-space()='Settle']")
	public WebElement settle;

	@FindBy(xpath = "//i[@class='ki ki-cheque icon-btn-billing btn-dark-green inline']")
	public WebElement payment;

	@FindBy(xpath = "//i[contains(@class,'ki ki-cheque icon-btn-billing btn-dark-green inline')]")
	public WebElement Cheque;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement issuingBank;

	@FindBy(xpath = "//input[@id='amountPayType']")
	public WebElement Amount;

	@FindBy(xpath = "//label[contains(@title,'Add')]")
	public WebElement Cardadd;

	@FindBy(xpath = "//button[@class='btn btn-primary sm active']")
	public WebElement cardok;

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

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/i[1]")
	public WebElement eye;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[1]/div[1]/div[1]/label[1]")
	public WebElement bar;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[1]/div[1]/div[1]")
	public WebElement barspace;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other Information']")
	public WebElement InsuranceAndcorp;

	@FindBy(xpath = "//ki-select-control[@placeholder='Insurance ']//input[@id='undefined']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[@placeholder='Corporate']//input[@id='undefined']")
	public WebElement Corporate;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement Plan;

	@FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-star-inserted ng-valid']")
	public WebElement validto;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='invoicemode']//input[@id='undefined']")
	public WebElement InvoiceMode;
	//

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement referenceLetter;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement referenceLetter1;

	@FindBy(xpath = "//input[@id='refno']")
	public WebElement referencenumber;

	@FindBy(xpath = "//ki-calendar[@formcontrolname='validfrom']//input[@type='text']")
	public WebElement FrmDate;

	@FindBy(xpath = "//ki-calendar[@formcontrolname='validto']//input[@type='text']")
	public WebElement ToDate;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement ADD;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;

	@FindBy(xpath = "//input[@id='cheqnoPayType']")
	public WebElement TransactionNO;

	@FindBy(xpath = "//label[normalize-space()='Send for Claim']")
	public WebElement sendForClaim;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement Yes;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement remarks;

	@FindBy(xpath = "//li[normalize-space()='Sent for Claim']")
	public WebElement sendForClaimStatus;

	@FindBy(xpath = "//label[normalize-space()='Response Receive']")
	public WebElement responseReceive;

	@FindBy(xpath = "//li[normalize-space()='Response Received']")
	public WebElement responseReceiveStatus;

	@FindBy(xpath = "//i[@title='Split Invoice']")
	public WebElement splitInvoice;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	public WebElement add;

	@FindBy(xpath = "//li[normalize-space()='Partially Settled']")
	public WebElement partiallySettled;

	@FindBy(xpath = "//i[@class='ki ki-wallet icon-btn-billing btn-dark-green inline']")
	public WebElement advance;

	@FindBy(xpath = "//ki-checkbox-control[@formcontrolname='ischeck']//span[@class='checkmark']")
	public WebElement advanceCheckbox;

	@FindBy(xpath = "//input[@id='withdrawalamount0']")
	public WebElement withdrawalAmount;

	public void Patreg(String title, String Name, String Lastname, String Dob, String DocID, String MobNo,
			String Address, String MRNo, String provider) throws InterruptedException, IOException, AWTException {

		/////////////////// Register a patient

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
		Thread.sleep(1000);

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

		Registration.click();
		Thread.sleep(500);
		List<WebElement> dynamicElement1 = driver
				.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement1.size() != 0) {
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
		lastname.click();
		Thread.sleep(500);
		lastname.sendKeys(lastName);
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Add1);
		Add1.click();
		Thread.sleep(600);

		List<WebElement> dynamicElement11 = driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement11.size());
		if (dynamicElement11.size() == 0) {
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}

		// JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", InsuranceAndcorp);

		Thread.sleep(600);
		InsuranceAndcorp.click();
		Thread.sleep(600);
		Insurance.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(600);
		Plan.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='MSD Full cover']")).click();
		Thread.sleep(600);

		/*
		 * validto.click(); Thread.sleep(1000); for (int i = 0; i <=20; i++) {
		 * 
		 * t.keyPress(KeyEvent.VK_DOWN); t.keyRelease(KeyEvent.VK_DOWN);
		 * Thread.sleep(400);
		 * 
		 * }
		 * 
		 * t.keyPress(KeyEvent.VK_ENTER); t.keyRelease(KeyEvent.VK_ENTER);
		 */

		driver.findElement(
				By.xpath("//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']"))
				.click();
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

	}

	public void Billing(String provider, String service1, String service2, String service3)
			throws InterruptedException, AWTException, IOException {

		/// Encounter

		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		// printuncheck.click();
		// Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'" + Provider + "')]")).click();
		Thread.sleep(2000);
		EncounterAdd.click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		referenceLetter.click();
		Thread.sleep(1000);
		referencenumber.click();
		Thread.sleep(1000);
		referencenumber.sendKeys("524356346");
		Thread.sleep(1000);

		FrmDate.click();
		Thread.sleep(1000);
		Robot t = new Robot();
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

		String mrno = driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src = new File(Excelfilepath);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration = wb.getSheetAt(56);
		int i = BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		Thread.sleep(2000);

		/// Service Billing

		Thread.sleep(2000);
		Service.click();
		Thread.sleep(1000);
		Addnew.click();
		Thread.sleep(1000);
		servName.click();
		Thread.sleep(1000);
		servName.sendKeys(service1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + service1 + "']")).click();
		Thread.sleep(1000);

		AddService.click();
		Thread.sleep(1000);
		servName.clear();
		Thread.sleep(1000);
		servName.sendKeys(service2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + service2 + "']")).click();

		AddService.click();
		Thread.sleep(1000);
		ServSave.click();
		Thread.sleep(1000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")));
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']"))
				.click();
		Thread.sleep(1000);

		////////////// GIVE GENERAL ADVANCE

		servName.click();
		Thread.sleep(1000);
		servName.sendKeys(service3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + service3 + "']")).click();
		Thread.sleep(1000);
		advanceAmount.clear();
		Thread.sleep(1000);
		advanceAmount.sendKeys("2000");
		Thread.sleep(1000);
		AddService.click();
		Thread.sleep(1000);
		ServSave.click();
		Thread.sleep(1000);
		OK1.click();

	}

	public void encounterClose(String MRNO) throws InterruptedException {

		toggle.click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//i[@class='ki
		// ki-reception-fill']")).click();//DEL FOR FULL

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

		FOSearchField.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		FOSearchField.sendKeys(MRNO);
		Thread.sleep(1000);
		FOSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNO + "')])[1]")).click();
		Thread.sleep(3000);
		Thread.sleep(500);
		List<WebElement> dynamicElement1 = driver
				.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement1.size() != 0) {
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		episodeIcon.click();//
		Thread.sleep(1000);
		Encounter.click();
		Thread.sleep(2000);

		// encounter 1

		closeEncounter.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"))
				.click();
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

		driver.findElement(
				By.xpath("//button[@class='btn btn-dark-green btn-primary sm mr0 mb0 mt0 ng-star-inserted']")).click();
		Thread.sleep(1000);

	}

	public void FinalBilling(String MRNO) throws InterruptedException, AWTException {
		Thread.sleep(1000);
		toggle.click();
		Thread.sleep(1000);
		module.click();
		Thread.sleep(1000);
		finalBilling.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		GenerateInvoice.click();
		Thread.sleep(1000);
		MRNoEnter.click();
		Thread.sleep(1000);
		MRNoEnter.sendKeys(MRNO);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		// RightArrow1.click();
		// Thread.sleep(1000);
		// RightArrow2.click();
		// Thread.sleep(1000);
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

		///////// InvoiceView
		Thread.sleep(3000);
		InvoiceView.click();
		Thread.sleep(1000);
		MRNoenter.click();
		Thread.sleep(1000);
		MRNoenter.sendKeys(MRNO);
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(1000);

		ThreeDot.click();
		Thread.sleep(1000);
		sendForClaim.click();
		Thread.sleep(1000);
		Yes.click();
		Thread.sleep(1000);
		remarks.sendKeys("APPROVED");
		Thread.sleep(1000);
		ServSave.click();
		Thread.sleep(1000);
		OK1.click();
		Thread.sleep(1000);
		invoiceMode.click();
		Thread.sleep(1000);
		sendForClaimStatus.click();
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(1000);
		ThreeDot.click();
		Thread.sleep(1000);
		responseReceive.click();
		Thread.sleep(1000);
		Yes.click();
		Thread.sleep(1000);
		remarks.sendKeys("APPROVED");
		Thread.sleep(1000);
		ServSave.click();
		Thread.sleep(2000);
		OK1.click();
		Thread.sleep(1000);
		invoiceMode.click();
		Thread.sleep(1000);
		responseReceiveStatus.click();
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(1000);
		splitInvoice.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Percentage']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]"))
				.sendKeys("30");
		add.click();

		Thread.sleep(1000);
		ServSave.click();
		Thread.sleep(1000);
		OK1.click();
		Thread.sleep(1000);
		toggle.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Thread.sleep(1000);
		GenerateInvoice.click();
		Thread.sleep(1000);
		InvoiceView.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//ki-select-control[@clearval='false']//input[@id='undefined']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Draft Finalized']")).click();
		Thread.sleep(1000);
		MRNoenter.click();
		Thread.sleep(1000);
		MRNoenter.sendKeys(MRNO);
		Thread.sleep(1000);

		Search2.click();
		Thread.sleep(1000);

		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"2\"]/form/div[1]/div[2]/div/table/tbody/tr/td[19]"));
		String a = ele1.getText();
		Thread.sleep(1000);
		System.out.println("Patient amount in copay is : " + a);
		Thread.sleep(1000);
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"2\"]/form/div[1]/div[2]/div/table/tbody/tr/td[20]"));
		Thread.sleep(1000);
		String b = ele2.getText();
		System.out.println("Sponser amount in copay is : " + b);

		ThreeDot.click();
		Thread.sleep(1000);
		GenerateInvoice1.click();
		Thread.sleep(1000);
		Yes.click();
		Thread.sleep(1000);
		remarks.sendKeys("APPROVED");
		Thread.sleep(1000);
		ServSave.click();
		Thread.sleep(1000);
		OK1.click();

		//// OP Settlement
		Thread.sleep(1000);
		toggle.click();
		Thread.sleep(1000);
		SettleInvoice.click();
		Thread.sleep(1000);
		Mrnoenter3.clear();
		Thread.sleep(1000);
		Mrnoenter3.sendKeys(MRNO, Keys.ENTER);
		Thread.sleep(1000);
		Search2.click();

		/// settlement1 from sponser copay

		settleicon1.click();// i[@title='Settle Invoice']
		Thread.sleep(1000);
		payment.click();
		Thread.sleep(1000);
		issuingBank.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(1000);
		TransactionNO.sendKeys("5356436");
		Thread.sleep(1000);
		Cardadd.click();
		Thread.sleep(2000);
		cardok.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='check-container zero-label']")).click();
		Thread.sleep(1000);
		settle.click();
		Thread.sleep(1000);

		Thread.sleep(10000);

		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);

		List<WebElement> dynamicElement = driver.findElements(By.xpath(
				"//div[@class='modal ki-dialog fade blockoutside in show']//label[@class='dialog-title'][normalize-space()='Success']"));

		if (dynamicElement.size() != 0) {
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		// OK1.click();
		
		/////////settlement 2 from patient advance
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//div[@class='col-md-6 col-3 ta-r pr-1']//button[@type='button'][normalize-space()='Clear']"))
				.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/ki-select-control[1]/div[1]/input[1]"))
				.click();

		Thread.sleep(1000);
		partiallySettled.click();
		Thread.sleep(1000);
		Mrnoenter3.clear();
		Thread.sleep(1000);
		Mrnoenter3.sendKeys(MRNO, Keys.ENTER);
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(1000);
		settleicon1.click();
		driver.findElement(By.xpath("//label[normalize-space()='Copay']//span[@class='checkmark']")).click();
		Thread.sleep(1000);

		WebElement X = driver.findElement(By.xpath("(//label[@class='pay-style'])[1]"));
		String CopayShare = X.getText();

		Thread.sleep(1000);
		System.out.println("Patient amount in copay is : " + CopayShare);
		Thread.sleep(1000);

		advance.click();
		Thread.sleep(1000);
		advanceCheckbox.click();
		Thread.sleep(1000);
		withdrawalAmount.clear();
		Thread.sleep(1000);
		withdrawalAmount.sendKeys(CopayShare);
		Thread.sleep(1000);
		cardok.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[@class='check-container zero-label']")).click();
		Thread.sleep(1000);

		settle.click();
		Thread.sleep(3000);

		// Robot t = new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);

		List<WebElement> dynamicElement1 = driver.findElements(By.xpath(
				"//div[@class='modal ki-dialog fade blockoutside in show']//label[@class='dialog-title'][normalize-space()='Success']"));

		if (dynamicElement1.size() != 0) {
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		Thread.sleep(1000);

		/// Settled view

		driver.findElement(By.xpath("//i[@class='fa fa-chevron-up myicon down']")).click();
		Thread.sleep(1000);
		InvoiceMode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Settled']")).click();
		Thread.sleep(1000);
		MRNoenter.clear();
		Thread.sleep(1000);
		MRNoenter.sendKeys(MRNO);
		Thread.sleep(1000);
		Search4.click();
		Thread.sleep(1000);

		Assert.assertEquals(CopayShare, b);

	}

}
