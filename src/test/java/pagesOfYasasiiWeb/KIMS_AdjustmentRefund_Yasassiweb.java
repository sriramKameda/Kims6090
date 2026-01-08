package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
import com.w2a.utilities.RandomString;

import junit.framework.Assert;

public class KIMS_AdjustmentRefund_Yasassiweb extends PageFactoryInitYasasiiWeb {

	public KIMS_AdjustmentRefund_Yasassiweb(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement TransactionDone;

	@FindBy(xpath = "//span[@class='pay-style']")
	public WebElement payment;

	@FindBy(xpath = "//button[@class='btn btn-primary sm active'][normalize-space()='OK']")
	public WebElement reqOK;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billsave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement billsaveOK;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//i[@title='Collapse All']")
	public WebElement collapse;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement Clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//i[@class='ki ki-cash-transfer-fill']")
	public WebElement AvailedService;

	@FindBy(xpath = "//td[normalize-space()='Card']")
	public WebElement card;

	//button[normalize-space()='OK']
	@FindBy(xpath = "(//i[@title='Remarks'])[2]")
	public WebElement remarks;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement ApproveSuccess;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement save;

	@FindBy(xpath = "//i[@class='ki ki-debit-card icon-btn-billing btn-dark-green inline']")
	public WebElement debitCard;

	@FindBy(xpath = "//div[@class='row pt-4 ng-star-inserted']//div[@class='col-md-6']//input[1]")
	public WebElement provider;

	@FindBy(xpath = "//input[@id='amountPayType']")
	public WebElement Amount;

	@FindBy(xpath = "//input[@id='cardnoPayType']")
	public WebElement cardNO;

	@FindBy(xpath = "//input[@id='apprnoPayType']")
	public WebElement approveNO;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline ng-star-inserted']")
	public WebElement CardAdd;

	@FindBy(xpath = "//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")
	public WebElement CardOK;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement authoriser;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement SearchAuth;

	@FindBy(xpath = "//i[@class='fa fa-times']")
	public WebElement Back;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//textarea[@id='undefined']")
	public WebElement Remarks;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement EnterRemarks;

	@FindBy(xpath = "//div[contains(text(),'Cancellation/Refund')]")
	public WebElement cancelRefund;

	@FindBy(xpath = "//span[normalize-space()='Adjustment Apply']")
	public WebElement Adjapply;

	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;

	@FindBy(xpath = "//i[@class='ki ki-chevron-down']")
	public WebElement modules;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Masters;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM-Finance']")
	public WebElement RCMFinance;

	@FindBy(xpath = "//li[@class='sidebar-item ng-star-inserted']//li[1]//a[1]")
	public WebElement Cardmaster;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement Delete;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement Update;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-star-inserted ng-valid']//input[@id='undefined']")
	public WebElement ServiceName;

	@FindBy(xpath = "//div[@class='form-group min-clear-bottom billing ki-dropdown']//input[@id='undefined']")
	public WebElement status;

	@FindBy(xpath = "//label[@class='icon-info pl-3 ng-star-inserted']//i[@title='Cancel Request']")
	public WebElement Reqcancel;

	@FindBy(xpath = "//i[@class='ki ki-pencil ng-star-inserted']")
	public WebElement Adjustment;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/app-billing-adjustment[1]/div[1]/div[2]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Adjustmentpercentage;

	@FindBy(xpath = "//input[@id='status']")
	public WebElement Status;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MrnoSearch;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[9]/label[1]/button[1]")
	public WebElement SearchIcon1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/i[1]")
	public WebElement CancelReq;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement firstcheckbox;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement SaVe;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement  yes;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/span[1]/i[1]")
	public WebElement RemarksIcon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement  checkbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement RemarksIcon1;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks1;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement Expand;

	@FindBy(xpath = "(//i[@class='ki ki-pencil ng-star-inserted'])[1]")
	public WebElement AdjustEdit;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-adjustment[1]/div[1]/div[2]/div[4]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement AdjustAmount;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline ml0 ng-star-inserted']")
	public WebElement RaiseRequest;

	@FindBy(xpath = "//label[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement Fo;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM']")
	public WebElement RCM;

	@FindBy(xpath = "//div[normalize-space()='Approve Request']")
	public WebElement viewRequest;

	@FindBy(xpath = "//span[normalize-space()='Adjustment Approval']")
	public WebElement AdjApprove;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement checkrequest;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement Approve;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement IssuingBank;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='bankname']//input[@id='undefined']")
	public WebElement RecievingBank;

	@FindBy(xpath = "//input[@id='cheqnoPayType']")
	public WebElement IBANO;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement ChequeAdd;
	
	@FindBy(xpath = "(//i[@class='fa fa-1 fa-ellipsis-v custom-color'])[1]")
	public WebElement Threedot;
	

	@FindBy(xpath = "(//label[contains(text(),'Payment Info')])[1]")
	public WebElement PaymentInfo;

	@FindBy(xpath = "(//label[contains(text(),'Adjustment Log')])[1]")
	public WebElement adjInfo;

	@FindBy(xpath = "//i[@class='ki ki-cheque icon-btn-billing btn-dark-green inline']")
	public WebElement cheque;

	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middleName;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement PAS;

	@FindBy(xpath="//input[@id='searchtext']") 
	public WebElement SearchField;

	@FindBy(xpath="//i[@class='ki ki-reception-fill']")
	public WebElement Billing;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;

	@FindBy(xpath = "//div[@class='module-icon-wrap active ng-star-inserted']//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

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

	@FindBy(xpath = "//label[normalize-space()='Radio']//span[@class='checkmark']")
	public WebElement TV;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement Ok;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save;

	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement OK;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement nationality;

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;	

	@FindBy(xpath = "//input[@id='cash']")
	public WebElement cash;	

	@FindBy(xpath = "//div[@class='module-icon-wrap ng-star-inserted']//i[@class='ki ki-file']")
	public WebElement MISReports;	

	@FindBy(xpath = "//div[normalize-space()='Reports']")
	public WebElement Reports;	

	@FindBy(xpath = "//span[normalize-space()='Billing']")
	public WebElement billing;	

	@FindBy(xpath = "//span[normalize-space()='Adjustment Audit']")
	public WebElement ADjAudit;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[2]/ki-dynamic-tabs[1]/ki-dynamic-tab[1]/div[1]/lib-reportcriteria[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNO;

	@FindBy(xpath = "//button[@id='misreportfetch']")
	public WebElement MISSearch;	

	@FindBy(xpath = "//input[@aria-label='Zoom']")
	public WebElement zoom;

	@FindBy(xpath = "//div[@class='dxrd-image-padding dxrd-image-search']//*[name()='svg']")
	public WebElement SearchInReports;

	@FindBy(xpath = "//input[@title='Search']")
	public WebElement Searchtext;

	@FindBy(xpath = "//input[@id='occupation']")
	public WebElement Occupation;

	@FindBy(xpath = "//input[@id='employmentstatus']")
	public WebElement EmployeeStatus;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	@FindBy(xpath = "//input[@id='highestlevelofeducationid']")
	public WebElement highestedu;

	@FindBy(xpath = "//input[@id='paidemptime']")
	public WebElement paidEmployment;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;






	public void patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo) throws InterruptedException, AWTException, IOException {

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
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastName);
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

	public void combpay(String MRNo , String PROVIDER ,String ADJAMOUNT , String CARDAMOUNT , String CARDNO , String APPROVENO , String AUTHPERSON , String REMARK1, String REMARK2,String AUTHUser,String AUTHpassword,String DebitCard , String Site) throws InterruptedException, AWTException, IOException {



		//////Encounter
		Thread.sleep(2000);
		clear.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();
		Thread.sleep(2000);
		EncounterAdd.click();
		Thread.sleep(1000);
		Expand.click();
		Thread.sleep(1000);
		//EncounterSave.click();
		Thread.sleep(1000);
		//SAvesuccess.click();

		//ServiceAdd
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", payment);

		String netAmount=driver.findElement(By.xpath("(//div[@class='bill-amt'])[6]")).getText();

		System.out.println("total payment is " + netAmount);

		double i = new Double(netAmount);

		double j = new Double(ADJAMOUNT);
		System.out.println("Adjustment amount is "+j);

		double  percentage = (int) (j*100)/i;

		System.out.println("percentage of adjustment is "+percentage+"%");

		js.executeScript("arguments[0].scrollIntoView();", collapse );

		Thread.sleep(1000);

		AdjustEdit.click();

		Thread.sleep(1000);
		String limit =	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-adjustment[1]/div[1]/div[2]/div[4]/div[1]/ki-input-control[1]/div[1]/input[1]")).getText();
		System.out.println("Actual Allowed ajdusment limit is "+limit);


		boolean  compare = (percentage <= 100 ) ;

		System.out.println(compare);

		//Assert.assertTrue(compare);



		Thread.sleep(1000);
		AdjustAmount.click();
		Thread.sleep(1000);
		AdjustAmount.sendKeys(ADJAMOUNT);
		Thread.sleep(1000);
		RaiseRequest.click();
		Thread.sleep(2000);
		//	Close.click();
		//	Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", payment);	
		String netAmount1= driver.findElement(By.xpath("(//div[@class='bill-amt'])[6]")).getText();
		Thread.sleep(1000);
		System.out.println("total payment is " + netAmount1);


		if(percentage <= 50)
		{
			System.out.println("Adjustment within the limit ");
			Thread.sleep(1000);
			debitCard.click();
			Thread.sleep(1000);
			provider.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='"+DebitCard+"']")).click();
			Amount.click();
			Thread.sleep(1000);
			Amount.sendKeys(CARDAMOUNT);
			cardNO.click();
			Thread.sleep(1000);
			cardNO.sendKeys(CARDNO);
			approveNO.click();
			Thread.sleep(1000);
			approveNO.sendKeys(APPROVENO);
			Thread.sleep(1000);
			CardAdd.click();
			Thread.sleep(3000);
			CardOK.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@class='checkmark']")).click();
			Thread.sleep(1000);
			Save.click();
			Thread.sleep(2000);
			billsaveOK.click();
			Thread.sleep(2000);

			



			/////////	
			Thread.sleep(1000);
			AvailedService.click();

			Thread.sleep(1000);

			Thread.sleep(3000);
			//driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
			Thread.sleep(2000);

			//		driver.findElement(By.xpath("(//i[@title='Adjustment Log'])[1]")).click();

			driver.findElement(By.xpath("(//i[@title='Payment Info'])[1]")).click();

			//			List<WebElement> dynamicElement=driver.findElements(By.xpath("//i[@class='ki pointer ki-info-circle']"));
			//			Thread.sleep(1000);
			//			int a=dynamicElement.size();
			//			System.out.println(dynamicElement);
			//			int b=a-3;
			//			 System.out.println(a +" = a");
			//			 System.out.println(b +" = b");
			//			
			//			Thread.sleep(4000);
			//			driver.findElement(By.xpath("(//i[@class='ki pointer ki-info-circle'])["+b+"]")).click();
			Thread.sleep(1000);
			card.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
			Thread.sleep(1000);
		}

		if(percentage > 50) {
			Thread.sleep(1000);
			System.out.println("Adjustment exceeds the limit ");
			Thread.sleep(1000);
			//	driver.findElement(By.xpath("//span[@class='checkmark']")).click();
			//	Thread.sleep(1000);

			////cardpayment

			debitCard.click();
			Thread.sleep(1000);
			provider.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-payment-types[1]/form[1]/div[1]/div[2]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//li[normalize-space()='"+DebitCard+"']")).click();
//			Thread.sleep(1000);
			Amount.click();
			Thread.sleep(1000);
			Amount.sendKeys(CARDAMOUNT);
			Thread.sleep(1000);
			cardNO.click();
			Thread.sleep(1000);
			cardNO.sendKeys(CARDNO);
			approveNO.click();
			approveNO.sendKeys(APPROVENO);
			Thread.sleep(1000);
			CardAdd.click();
			Thread.sleep(2000);
			CardOK.click();
			Thread.sleep(1000);
			save.click();
			Thread.sleep(3000);
			authoriser.click();
			Thread.sleep(1000);
			SearchAuth.sendKeys(AUTHPERSON);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@title='"+AUTHPERSON+"']")).click();

			//driver.findElement(By.xpath("//*[contains(text(),'" +AUTHPERSON+ "')]")).click();
			Thread.sleep(1000);
			reqOK.click();
			Thread.sleep(1000);
			Remarks.click();
			Thread.sleep(1000);
			Remarks.sendKeys(REMARK1);
			Thread.sleep(2000);
			reqOK.click();
			Thread.sleep(5000);
			TransactionDone.click();
			Thread.sleep(1000);
			Thread.sleep(1000);
			AvailedService.click();
			Thread.sleep(1000);
			//AdvanceView.click();

			Thread.sleep(3000);
			//driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
			Thread.sleep(1000);

			String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
			System.out.println(mrno +  " = MRNO");

			File src=new File(Excelfilepath);
			FileInputStream fis=new FileInputStream(src);
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet BirthRegistration=wb.getSheetAt(1);	
			int i1=BirthRegistration.getLastRowNum();
			System.out.println("Number of rows: " + i1);		
			BirthRegistration.getRow(i1).createCell(7).setCellValue(mrno);	
			FileOutputStream fout=new FileOutputStream(src);	
			wb.write(fout);
			Thread.sleep(2000);

		}

	}

	public void RcmRefund(String MRNo , String REMARK2,String AUTHUser,String AUTHpassword,String DebitCard,String ADJAMOUNT) throws InterruptedException, AWTException 
	{



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
		userid.sendKeys(AUTHUser);
		password.click();
		password.sendKeys(AUTHpassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);



		//request approval
		Hamberger.click();
		Thread.sleep(2000);
		Fo.click();
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
		RCM.click();
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

		viewRequest.click();
		Thread.sleep(1000);


		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1000);


		AdjApprove.click();
		Thread.sleep(1000);
		MRNOSearch.click();
		Thread.sleep(1000);
		MRNOSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		checkrequest.click();
		Thread.sleep(1000);    
		remarks.click();
		Thread.sleep(1000);
		EnterRemarks.sendKeys(REMARK2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		Approve.click();
		Thread.sleep(2000);
		ApproveSuccess.click();

		//////////////Approve Cancel


		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon1.click();
		Thread.sleep(1000);
		checkbox.click();
		Thread.sleep(1000);
		CancelReq.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		checkbox.click();
		Thread.sleep(1000);
		remarks.click();
		Thread.sleep(800);
		Remarks1.click();
		Thread.sleep(1000);
		Remarks1.sendKeys("ok");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")).click();
		Thread.sleep(800);
		SaVe.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(800);

		////////////////////////////////////////////////////////		


		///cancel refund
		Hamberger.click();
		Thread.sleep(2000);
		cancelRefund.click();
		Thread.sleep(2000);
		Adjapply.click();//span[normalize-space()='Adjustment Apply']
		Thread.sleep(1000);
		MRNOSearch.click();
		Thread.sleep(1000);
		MRNOSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		
		String Returnamount =driver.findElement(By.xpath("//input[@id='cash']")).getText();
		Thread.sleep(1000);
		System.out.println("returnAmount"+Returnamount);
		Thread.sleep(1000);


		cash.click();
		Thread.sleep(500);
		cash.clear();
		Thread.sleep(1000);

		for (int i = 0; i < 3; i++) {

			cash.sendKeys(Keys.BACK_SPACE);

		}
		Thread.sleep(500);
		cheque.click();
		Thread.sleep(600);
		IssuingBank.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(600);
		RecievingBank.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(600);
		IBANO.click();
		Thread.sleep(600);
		IBANO.sendKeys("7875940");
		Thread.sleep(600);
		Amount.click();
		Thread.sleep(600);
		//Amount.sendKeys(Returnamount);
		Amount.sendKeys(ADJAMOUNT);
		Thread.sleep(600);
		ChequeAdd.click();
		Thread.sleep(600);

		driver.findElement(By.xpath("//button[@aria-label='Ok'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);



		/*		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			int Y =driver.getWindowHandles().size();
			Thread.sleep(1000);
			System.out.println("window handles no."+ Y);
			int Z= Y-2;
			int X=Y-1;
			Thread.sleep(1000);
			System.out.println("go to window no."+ Z);
			Thread.sleep(2000);
			driver.switchTo().window(tabs1.get(Z));  */

	}

	public void cardmaster(String MRNo,String AUTHUser,String AUTHpassword,String DebitCard) throws InterruptedException, AWTException{


		//openNewTab

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
		userid.sendKeys(AUTHUser);
		password.click();
		password.sendKeys(AUTHpassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);


		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		PAS.click();
		Thread.sleep(600);
		Registration.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement01=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement01.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(3000);

		Thread.sleep(1000);
		List<WebElement> dynamicElement011=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement011.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}


		Billing.click();
		Thread.sleep(1000);
		AvailedService.click();
		Thread.sleep(1000);
		//AdvanceView.click();

		Thread.sleep(3000);
		//driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(1000);

		Threedot.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView();", PaymentInfo);
		Thread.sleep(1000);
		PaymentInfo.click();
		Thread.sleep(3000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/label[4]/i[1]")).click();
		Threedot.click();
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView();", adjInfo);
		Thread.sleep(1000);
		adjInfo.click();
		Thread.sleep(3000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(2000);
		modules.click();
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",RCMFinance);
		Thread.sleep(1000);
		RCMFinance.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",Cardmaster);
		Thread.sleep(1000);
		Cardmaster.click();
		Thread.sleep(1000);
		SearchAuth.click();
		Thread.sleep(1000);
		SearchAuth.sendKeys(DebitCard ,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-card-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		Delete.click();
		Thread.sleep(2000);
		ApproveSuccess.click();
		Thread.sleep(1000);
		Update.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-card-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
		ApproveSuccess.click();
		Thread.sleep(2000);

	}


	public void MIS(String AUTHUser,String AUTHpassword,String MRNo,String ADJAMOUNT  ) throws InterruptedException {


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
		userid.sendKeys(AUTHUser);
		password.click();
		password.sendKeys(AUTHpassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);



		Hamberger.click();
		Thread.sleep(600);
		MISReports.click();
		Thread.sleep(1000);
		Reports.click();
		Thread.sleep(1000);
		billing.click();
		Thread.sleep(1000);
		ADjAudit.click();
		Thread.sleep(1000);
		MRNO.click();
		Thread.sleep(1000);
		MRNO.sendKeys(MRNo);
		Thread.sleep(1000);
		MISSearch.click();
		Thread.sleep(1000);
		zoom.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'100%')]")).click();
		Thread.sleep(2000);
		SearchInReports.click();
		Thread.sleep(1000);
		Searchtext.click();
		Thread.sleep(1000);
		Searchtext.sendKeys(ADJAMOUNT , Keys.ENTER);
		Thread.sleep(1000);
		String misadj = driver.findElement(By.xpath("//div[@class='dxrd-preview-search-tab-item-text propertygrid-editor-displayName dxd-text-primary']")).getText();
		Thread.sleep(1000);
		System.out.println(misadj);
		Thread.sleep(1000);
		Assert.assertEquals("-"+ADJAMOUNT+".00", misadj);
		Thread.sleep(1000);





	}





}



