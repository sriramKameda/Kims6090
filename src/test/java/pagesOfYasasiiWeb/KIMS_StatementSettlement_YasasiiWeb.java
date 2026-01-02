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

public class KIMS_StatementSettlement_YasasiiWeb extends PageFactoryInitYasasiiWeb{

	public KIMS_StatementSettlement_YasasiiWeb(WebDriver driver) {

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

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement ServSave;

	////Pharmacy bill

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

	@FindBy(xpath = "//i[contains(@class,'ki ki-bill')]")
	public WebElement finalBilling;

	@FindBy(xpath = "//div[normalize-space()='Generate Invoice']")
	public WebElement GenerateInvoice;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-alternate-invoice-generation/div/tabset/div/tab[1]/form/div[1]/div/div/div/div[2]/div[3]/div[2]/ki-input-control/div/input")
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

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-alternate-invoice-generation/div/tabset/div/tab[2]/form/div[1]/div[1]/div/div/div[2]/div[2]/div[1]/ki-input-control/div/input")
	public WebElement MRNoenter1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/ki-select-control[1]/div[1]/input[1]")
	public WebElement invoiceMode;

	@FindBy(xpath = "//div[normalize-space()='OP']")
	public WebElement Op;

	@FindBy(xpath = "//span[normalize-space()='Invoice View']")
	public WebElement InvoiceView;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNoenter;

	@FindBy(xpath = "//div[contains(@class,'col-12 col-md-3 ta-r')]//i[contains(@class,'ki ki-search')]")
	public WebElement Search2;

	@FindBy(xpath = "//*[@id=\"2\"]/form/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/label/i")
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

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ip-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Mrnoenter3;

	@FindBy(xpath = "//i[@title='Settle Invoice']")
	public WebElement settleicon1;

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

	@FindBy(xpath = "//input[@id='cheqnoPayType']")
	public WebElement TransactionNo;


	@FindBy(xpath = "//label[contains(@title,'Add')]")
	public WebElement Cardadd;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
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

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other Information']")
	public WebElement InsuranceAndcorp;

	@FindBy(xpath = "//ki-select-control[@placeholder='Corporate']//input[@id='undefined']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[@placeholder='Corporate']//input[@id='undefined']")
	public WebElement Corporate;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement Plan;

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

	@FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-star-inserted ng-valid']")
	public WebElement validto;

	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//span[contains(text(),'Encounter')]")
	public WebElement Encounter;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;

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

		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement1.size());
		if(dynamicElement1.size() ==0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}

		//	JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", InsuranceAndcorp);

		Thread.sleep(600);
		InsuranceAndcorp.click();
		Thread.sleep(600);
		Corporate.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(600);
		Plan.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='MSD Full cover']")).click();
		Thread.sleep(600);




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
		//		t.keyPress(KeyEvent.VK_ENTER);
		//		t.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")).click();
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




	}


	public void Billing(String provider , String service1,String service2,String service3 ) throws InterruptedException, AWTException, IOException {



		///Encounter	

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
		Thread.sleep(2000);
		SAvesuccess.click();
		Thread.sleep(3000);


		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(51);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);


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
		//	driver.findElement(By.xpath("//label[@class='check-container zero-label']")).click();
		//	Thread.sleep(1000);
		ServSave.click();
		Thread.sleep(1000);

		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));


		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);


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
		walkin.click();
		Thread.sleep(1000);

		walkinSearch.click();
		Thread.sleep(1000);
		walkinSearch.sendKeys(MRNO, Keys.ENTER);
		Thread.sleep(3000);

		Robot t=new Robot(); 
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);

		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[normalize-space()='"+MRNO+"']")).click();

		//		OPprovider.click();
		//		Thread.sleep(1000);
		//		OPprovider.sendKeys(PROVIDER);
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER+"']")).click(); 
		//		Thread.sleep(1000);

		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);

		ItemName.sendKeys("DOLO 650MG TAB");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='DOLO 650MG TAB']")).click();
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
		counterSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[normalize-space()='Print']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(2000);
		OK1.click();
		Thread.sleep(1000);

		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
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
		//		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		Thread.sleep(1000);


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
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);



		servName.clear();
		Thread.sleep(1000);
		servName.sendKeys(service2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+service2+"']")).click();
		AddService.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);

		servName.clear();
		Thread.sleep(1000);
		servName.sendKeys(service3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+service3+"']")).click();
		Thread.sleep(1000);
		AddService.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);



		servName.clear();
		Thread.sleep(1000);
		servName.sendKeys("Bleeding Time");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Bleeding Time']")).click();
		Thread.sleep(1000);
		AddService.click();
		Thread.sleep(1000);



		servName.clear();
		Thread.sleep(1000);
		servName.sendKeys("Blood Urea Nitrogen (GLDH Urease kinetic method)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Blood Urea Nitrogen (GLDH Urease kinetic method)']")).click();
		Thread.sleep(1000);
		AddService.click();
		Thread.sleep(1000);


		ServSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
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
		//Op.click();
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
		MRNoenter1.click();
		Thread.sleep(1000);
		MRNoenter1.sendKeys(MRNO);
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(2000);

		ThreeDot.click();
		Thread.sleep(1000);
		//		Sendforclaim.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("333");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		//		Thread.sleep(1000);
		//
		//		invoiceMode.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Sent for Claim']")).click();
		//		Thread.sleep(1000);
		//		Search2.click();
		//		Thread.sleep(2000);
		//		ThreeDot.click();
		//		Thread.sleep(1000);
		//		ResponseRecieve.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("333");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		//		Thread.sleep(1000);
		//
		//
		//		invoiceMode.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Response Received']")).click();
		//		Thread.sleep(1000);
		//		Search2.click();
		//		Thread.sleep(2000);
		//		ThreeDot.click();
		Thread.sleep(1000);
		DraftFinalization.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("333");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
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
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("333");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
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
		MRNoenter1.clear();
		Thread.sleep(1000);
		MRNoenter1.sendKeys(MRNO);
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(2000);

		ThreeDot.click();
		Thread.sleep(1000);
		//		Sendforclaim.click();
		//		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		//		Thread.sleep(1000);
		//
		//		invoiceMode.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Sent for Claim']")).click();
		//		Thread.sleep(1000);
		//		Search2.click();
		//		Thread.sleep(1000);
		//		ThreeDot.click();
		//		Thread.sleep(1000);
		//		ResponseRecieve.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		//		Thread.sleep(1000);
		//
		//
		//		invoiceMode.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Response Received']")).click();
		//		Thread.sleep(1000);
		//		Search2.click();
		//		Thread.sleep(1000);
		//		ThreeDot.click();
		//		Thread.sleep(1000);
		DraftFinalization.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("333");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
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
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("333");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
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
		StatementStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
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
		
		driver.findElement(By.xpath("(//i[@class='fa fa-close'])[5]")).click();
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
//		Amount.clear();
//		Thread.sleep(1000);
//		Amount.sendKeys(amount);
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
