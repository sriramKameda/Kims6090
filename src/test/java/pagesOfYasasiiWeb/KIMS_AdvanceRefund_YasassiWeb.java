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

public class KIMS_AdvanceRefund_YasassiWeb  extends PageFactoryInitYasasiiWeb {

	public KIMS_AdvanceRefund_YasassiWeb(WebDriver driver) {
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

	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
	public WebElement Ok;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement Save;

	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement OK;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;

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

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement Clear;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement nationality;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providername;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement addneworder;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement plus;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement amount;

	@FindBy(xpath = "//ki-select-control[contains(@formcontrolname,'servicetypeid')]//input[@id='undefined']")
	public WebElement category;

	@FindBy(xpath = "//i[@class='ki ki-cash-transfer-fill']")
	public WebElement availedservice;

	@FindBy(xpath = "//span[normalize-space()='Advance View']")
	public WebElement advanceview;

	@FindBy(xpath = "//label[@class='print-icon pl-1']//span[@class='checkmark']")
	public WebElement selctcheckbox;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement authorizer;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement entername;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement enterremark;

	@FindBy(xpath = "//i[@title='Request for Advance Refund']")
	public WebElement Advancerefund;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement fo;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM']")
	public WebElement rcm;

	@FindBy(xpath = "//div[normalize-space()='Approve Request']")
	public WebElement refundreq;

	@FindBy(xpath = "//span[normalize-space()='Advance Approval']")
	public WebElement advancerefund;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement firstcheckbox;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement SaVe;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement yes;

	@FindBy(xpath = "//input[@id='status']")
	public WebElement Status;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MrnoSearch;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[9]/label[1]/button[1]")
	public WebElement SearchIcon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/i[1]")
	public WebElement CancelReq;

	@FindBy(xpath = "//span[normalize-space()='Advance View']")
	public WebElement AdvanceView;

	@FindBy(xpath = "//td[@class='icon-info']//i[@title='Cancel Approval']")
	public WebElement ReqCancel;

	@FindBy(xpath = "//tbody/tr[@class='ng-star-inserted']/td[10]/span[1]/i[1]")//textarea[@id='undefined']
	public WebElement RemarksIcon;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement Searchicon;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks;

	@FindBy(xpath = "//i[@title='Advance Transfer']")
	public WebElement AdvanceTransfer;

	@FindBy(xpath = "//input[@id='transferAmount0']")
	public WebElement TransferAmount;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement TransferMRNO;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement Transfer;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement PrintCheck;

	@FindBy(xpath = "//div[contains(text(),'Cancellation/Refund')]")
	public WebElement cancelRefund;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement IssuingBank;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='bankname']//input[@id='undefined']")
	public WebElement RecievingBank;

	@FindBy(xpath = "//input[@id='cheqnoPayType']")
	public WebElement IBANO;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement ChequeAdd;


	@FindBy(xpath = "//i[@title='Payment Info']")
	public WebElement PaymentInfo;

	@FindBy(xpath = "//td[@class='info-icon']//i[@title='Adjustment Log']")
	public WebElement adjInfo;

	@FindBy(xpath = "//i[@class='ki ki-cheque icon-btn-billing btn-dark-green inline']")
	public WebElement cheque;

	@FindBy(xpath = "//input[@id='amountPayType']")
	public WebElement Amount;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOSearch;


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement age;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//i[@title='Expand All']")
	public WebElement Expand;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement servSave;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;	

	@FindBy(xpath = "//input[@id='cash']")
	public WebElement cash;	

	@FindBy(xpath = "//i[@class='ki ki-wallet icon-btn-billing btn-dark-green inline']")
	public WebElement Wallet;	

	@FindBy(xpath = "//input[@id='withdrawalamount0']")
	public WebElement withdarwAmount;	

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

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
		
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']"));

		System.out.println(dynamicElement11.size());
		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[@id='consentsave']//i[@class='ki ki-save']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
			Thread.sleep(3000);

		}
		
		
		
		
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);


		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(22);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000); 


	}


	public void advance(String PROVIDER ,String service ,String service1 , String service2) throws InterruptedException {

		Thread.sleep(1000);
		Clear.click();
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
		//	PrintCheck.click();
		//	Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);

		Service.click();
		Thread.sleep(800);

		addneworder.click();
		Thread.sleep(800);
		/*	category.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Advance']")).click();
			//	driver.findElement(By.xpath("//*[contains(text(),'" + selectcategory + "')]")).click();	
			Thread.sleep(800);             */
		servicename.click();
		Thread.sleep(800);
		servicename.sendKeys(service);
		Thread.sleep(1800);
//		servicename.click();
//		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[normalize-space()='General Advance']")).click();
		//	driver.findElement(By.xpath("//li[normalize-space()='"+service+"']")).click();
		Thread.sleep(800);
		amount.clear();
		Thread.sleep(800);
		amount.sendKeys("10000");
		Thread.sleep(800);
		plus.click();
		//Thread.sleep(800);
		//PrintCheck.click();
		Thread.sleep(800);
		servSave.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);


		Thread.sleep(1000);
		servicename.clear();
		Thread.sleep(1000);
		servicename.sendKeys(service1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+service1+"']")).click();
		Thread.sleep(2000);

		plus.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		servicename.clear();
		Thread.sleep(1000);
		servicename.sendKeys(service2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+service2+"']")).click();
		Thread.sleep(1000);
		plus.click();
		Thread.sleep(2000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Wallet);

		String Amount = driver.findElement(By.xpath("//div[@class='price-breakdown mt-4']//div[@class='bill-amt']")).getText();
		Thread.sleep(1000);
		System.out.println(Amount);
		Thread.sleep(1000);

		Wallet.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ki-checkbox-control[@formcontrolname='ischeck']//span[@class='checkmark']")).click();
		Thread.sleep(1000);

		for (int i = 0; i <=5; i++) {
			withdarwAmount.sendKeys( Keys.DELETE);
		}
		Thread.sleep(1000);

		withdarwAmount.clear();
		Thread.sleep(1000);
		withdarwAmount.sendKeys(Amount);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		//PrintCheck.click();
		//Thread.sleep(800);
		servSave.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);



	}

	public void advanceview(String authorisername , String remarks , String AUTHUser, String AUTHpassword ,String MRNo) throws InterruptedException
	{

		availedservice.click();
		Thread.sleep(1000);
		advanceview.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(1500);
		
		/*
		 
		selctcheckbox.click();
		Thread.sleep(800);
		AdvanceTransfer.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container zero-label']//span[@class='checkmark']")).click();
		Thread.sleep(800);
		TransferAmount.click();


		for (int i = 0; i <=5; i++) {
			TransferAmount.sendKeys( Keys.RIGHT);
		}
		Thread.sleep(1000);

		for (int i = 0; i <=5; i++) {
			TransferAmount.sendKeys( Keys.BACK_SPACE);
		}

		Thread.sleep(800);
		TransferAmount.sendKeys("500");
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//i[@title='Advanced Search']")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//div[@class='col-md-4 col-4 plt-prt-5 col-md-6']//input[@id='maincategory']")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[2]/div[1]/div[1]/div[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
		Thread.sleep(800);
	
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
//		TransferMRNO.click();
//		Thread.sleep(800);
//		TransferMRNO.sendKeys("G000000086523");
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//i[@title='Search']")).click();
//		Thread.sleep(800);
		Transfer.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//i[@class='ki ki-check']")).click();
		Thread.sleep(800);
		
		*/
		
		 selctcheckbox.click();
		Thread.sleep(800);
		Advancerefund.click();
		Thread.sleep(800);
		authorizer.click();
		Thread.sleep(800);
		entername.sendKeys(authorisername);
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[@title='"+authorisername+"']")).click();
		Thread.sleep(800);
		enterremark.sendKeys(remarks);
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1500);


		//openNewTab


		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
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

		////RCm	

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(800);
		fo.click();
		Thread.sleep(800);
		rcm.click();
		Thread.sleep(800);
		refundreq.click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1000);

		advancerefund.click();
		Thread.sleep(800);
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		firstcheckbox.click();
		Thread.sleep(1000);
		RemarksIcon.click();
		Thread.sleep(800);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		SaVe.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(800);


		/////Approve  cancel

		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		firstcheckbox.click();
		Thread.sleep(1000);
		CancelReq.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		yes.click();
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
		firstcheckbox.click();
		Thread.sleep(1000);
		RemarksIcon.click();
		Thread.sleep(800);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")).click();
		Thread.sleep(800);
		SaVe.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(800);




		///cancel refund
		Hamberger.click();
		Thread.sleep(2000);
		cancelRefund.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Advance Refund']")).click();
		Thread.sleep(1000);
		MRNOSearch.click();
		Thread.sleep(1000);
		MRNOSearch.sendKeys(MRNo,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-search']")).click();

		//SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		String Returnamount =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/table[1]/tbody[1]/tr[1]/td[12]")).getText();
		Thread.sleep(1000);
		System.out.println("returnAmount"+Returnamount);
		Thread.sleep(1000);

		////cash zero	

		cash.click();
		Thread.sleep(500);
		cash.clear();
		Thread.sleep(1000);

		for (int i = 0; i < 3; i++) {

			cash.sendKeys(Keys.BACK_SPACE);

		}
		Thread.sleep(500);




		Thread.sleep(1000);
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
		Amount.sendKeys(Returnamount); 
		Thread.sleep(600);
		ChequeAdd.click();
		Thread.sleep(600);

		driver.findElement(By.xpath("//button[@aria-label='Ok'][normalize-space()='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);




	}




}
