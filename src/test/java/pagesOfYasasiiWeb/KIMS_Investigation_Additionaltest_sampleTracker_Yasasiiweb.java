package pagesOfYasasiiWeb;

import java.awt.AWTException;
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

public class KIMS_Investigation_Additionaltest_sampleTracker_Yasasiiweb extends  PageFactoryInitYasasiiWeb {
	public KIMS_Investigation_Additionaltest_sampleTracker_Yasasiiweb(WebDriver driver) {
		super(driver);


	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement hamberger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement billprint;

	@FindBy(xpath="//i[@title='Addendum']")
	public WebElement Addendum;

	@FindBy(xpath="//textarea[@id='addendum']")
	public WebElement AddendumTestarea;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;


	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement address;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement DocID;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement aadharNo;

	@FindBy(xpath = "//button[@id='adddoc']//label")
	public WebElement docAdd;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other information']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Ins/Corp')]//input[@id='undefined']")
	public WebElement Inscorp;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Plan name')]//input[@id='undefined']")
	public WebElement PlanName;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;

	@FindBy(xpath = "//button[contains(@class,'btn-feedback')]")
	public WebElement howDidYouKnow;

	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
	public WebElement OKhowDidYouKnow;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;
	
	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;


	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement AddnewService;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement Saveservice;

	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOK;

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;

	@FindBy(xpath="//i[@class='ki ki-beaker']")
	public WebElement Investigation;

	@FindBy(xpath="//input[@id='executionlocid']")
	public WebElement Executionloc;

	@FindBy(xpath="//button[@class='btn btn-primary active sm m0']")
	public WebElement ExecutionlocOK;

	@FindBy(xpath="//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement confirmOK;

	@FindBy(xpath="//input[@id='mrno']")
	public WebElement SearchField;

	@FindBy(xpath="//tbody/tr[1]/td[1]/div[1]/label[2]/span[1]")
	public WebElement caudatecheckbox;

	@FindBy(xpath="//i[@class='ki ki-save']")
	public WebElement ivstgnSave;

	@FindBy(xpath="//button[normalize-space()='Ok']//i[@class='ki ki-check']")
	public WebElement SaveOK1;

	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement InvHamb;

	@FindBy(xpath="//div[normalize-space()='Sample Tracker']")
	public WebElement Sampletracker;

	@FindBy(xpath="//i[@title='Execution Location']")
	public WebElement Executionlocation;

	@FindBy(xpath="//input[@id='status']")
	public WebElement Status;

	@FindBy(xpath="//input[@id='mrno']")
	public WebElement MRNOSearch;

	@FindBy(xpath="//button[normalize-space()='Create Trip']")
	public WebElement CreateTrip;

	@FindBy(xpath="//div[@class='card-body p0 carrier mt15']//div[1]//div[1]//div[1]//div[3]//div[1]//i[1]")
	public WebElement Bag1;

	@FindBy(xpath="//div[@class='row']//div[1]//div[1]//div[3]//div[1]//i[1]")
	public WebElement Carrier1;

	@FindBy(xpath="//button[normalize-space()='Add Samples']")
	public WebElement AddSamples;

	@FindBy(xpath="//input[@id='lissampleno']")
	public WebElement Sampleno;

	@FindBy(xpath="//i[@class='ki ki-info-circle']")
	public WebElement Info;

	@FindBy(xpath="//button[@id='tripStartsSave']")
	public WebElement StartTrip;

	@FindBy(xpath="//button[normalize-space()='View Trip']")
	public WebElement ViewTrip;

	@FindBy(xpath="//button[@class=' btn btn-dark-green active btn-sm clear']")
	public WebElement Back;

	@FindBy(xpath="//button[normalize-space()='Receive Trip']")
	public WebElement recieveTrip;

	@FindBy(xpath="//button[@id='onsaveid']")
	public WebElement CloseTrip;

	@FindBy(xpath="//label[normalize-space()='Completed Trips']")
	public WebElement CompletedTrip;

	@FindBy(xpath="//div[normalize-space()='Sample Processing']")
	public WebElement SampleProcessing;

	@FindBy(xpath="//li[normalize-space()='Sample Received']")
	public WebElement Samplerecieved;

	@FindBy(xpath="//i[@class='ki ki-sample-check']")
	public WebElement Accept;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement ServiceCheck;

	@FindBy(xpath="//label[@id='onrejectallsave']//img[@title='Reject']")
	public WebElement Reject;

	@FindBy(xpath="//textarea[@id='rejectreason']")
	public WebElement RejectRedoReason;

	@FindBy(xpath="//div[normalize-space()='Sample Collection']")
	public WebElement SampleCollection;

	@FindBy(xpath="//input[@id='remarks']")
	public WebElement Comments;

	@FindBy(xpath="//button[@id='ondespatchid']")
	public WebElement Despatch;

	@FindBy(xpath="//i[@title='Receive']")
	public WebElement Recieve;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Result;

	@FindBy(xpath="//div[normalize-space()='Result Authorization']")
	public WebElement ResultAuthorization;

	@FindBy(xpath="//label[@class='check-container resultcancerreg']//span[@class='checkmark']")
	public WebElement RepeatTest;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement ResultStatus;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement ResultStatus1;

	@FindBy(xpath="//button[@id='preview-load']")
	public WebElement ResultPreview;

	@FindBy(xpath="//i[@title='Home Page']")
	public WebElement Homepage;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[2]/lib-modal-shell-common[1]/div[1]/div[1]/app-view-home-page[1]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[3]/div[1]/div[1]/app-emr-homescreen-shell[1]/app-patient-service-result[1]/div[2]/div[1]/div[1]/app-service-result-view[1]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/label[1]")
	public WebElement EMRResult;

	@FindBy(xpath="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[2]")
	public WebElement Operator;

	@FindBy(xpath="//input[@id='resultstatus7111']")
	public WebElement ResultStatus11;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement AdditionalResult;
	
	@FindBy(xpath="//i[@class='ki ki-file-medical pl-3']")
	public WebElement AdditionalTest;
	
//	@FindBy(xpath="//i[@class='ki ki-file-medical pl-3']")
//	public WebElement AdditionalResult;
	
	
	

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Resultrepeat;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath="//input[@id='status']")
	public WebElement ivstgnStatus;

	@FindBy(xpath="//button[@id='ondespatchid']")
	public WebElement despatch;

	@FindBy(xpath="//label[normalize-space()='Liver Biopsy']//span[@class='checkmark']")
	public WebElement orderCheckbox;

	public void patReg(String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE ) throws InterruptedException, IOException, AWTException {

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Registration']")).click();


		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}



		Thread.sleep(1000);
		Title.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys(NAME);
		Thread.sleep(1000);
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastname);
		Thread.sleep(500);



		age.click();
		Thread.sleep(1000);
		age.sendKeys(AGE);
		Thread.sleep(1000);
		mobileNo.click();
		Thread.sleep(1000);
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			aadharNo.sendKeys( Keys.BACK_SPACE);
		}
		//aadharNo.click();
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);

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
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Add1 );
		Add1.click();


		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='TV']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
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
		Thread.sleep(1000);

		//////Encounter
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(clear));
		Thread.sleep(3000);
		clear.click();
		Thread.sleep(1000);
		//	billprint.click();
		//	Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();

		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		SAvesuccess.click();

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(1000);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(42);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(1000);



		///service Order


		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-reception-fill']")).click();

		Thread.sleep(1000);
		Service.click();	
		Thread.sleep(1000);
		//	billprint.click();
		//	Thread.sleep(1000);
		AddnewService.click();
		Thread.sleep(1000);
		servicename.click();
		Thread.sleep(1000);
		servicename.sendKeys(SERVICE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+SERVICE+"']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Saveservice.click();
		Thread.sleep(1000);
		SaveOK.click();


	}


	public void investigtion( String User , String Password, String MRNO) throws InterruptedException {



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



		Thread.sleep(1000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );

		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(1000);


		Hamberger.click();
		Thread.sleep(1000);
		Investigation.click();
		Thread.sleep(1000);
//		Executionloc.click();
//		Thread.sleep(2000);
//		Executionloc.click();
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[normalize-space()='"+SampleCollectionLocation+"']")).click();
		Thread.sleep(1000);
		ExecutionlocOK.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(3000);

		//Sample Collection

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(5000);
		//	caudatecheckbox.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Print Barcode')]")).click();

		ivstgnSave.click();
		Thread.sleep(2000);
		SaveOK1.click();
		Thread.sleep(3000);


		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection-Despatch Pending']")).click();
		Thread.sleep(1000);
		MRNOSearch.clear();
		Thread.sleep(1000);
		MRNOSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(2000);

		String SampleNo =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/inv-samplecollection[1]/div[1]/lib-searchlab[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]")).getText();
		Thread.sleep(2000);
		System.out.println(SampleNo);
		Thread.sleep(1000);

		//		//Sample tracker
		//
		//		InvHamb.click();
		//		Thread.sleep(1000);
		//		Sampletracker.click();
		//		Thread.sleep(1000);
		//		Executionlocation.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//div[normalize-space()='Sample Collection - 1st floor']")).click();
		//		Thread.sleep(1000);
		//		Executionlocation.click();
		//		Thread.sleep(1000);
		//		CreateTrip.click();
		//		Thread.sleep(1000);
		//		Bag1.click();
		//		Thread.sleep(1000);
		//		Carrier1.click();
		//		Thread.sleep(1000);
		//		AddSamples.click();
		//		Thread.sleep(1000);
		//		Sampleno.click();
		//		Thread.sleep(1000);
		//		Sampleno.sendKeys(SampleNo, Keys.ENTER);
		//		Thread.sleep(1000);
		//		Info.click();
		//		Thread.sleep(1000);
		//		StartTrip.click();
		//		Thread.sleep(1000);
		//
		//		ViewTrip.click();
		//		Thread.sleep(1000);
		//		Back.click();
		//		Thread.sleep(1000);
		//
		//		Executionlocation.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//div[normalize-space()='Bio-Chemistry']")).click();
		//		Thread.sleep(1000);
		//		Executionlocation.click();
		//		Thread.sleep(1000);
		//		recieveTrip.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-viewtrip[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]")).click();
		//		Thread.sleep(1000);
		//		Sampleno.click();
		//		Thread.sleep(1000);
		//		Sampleno.sendKeys(SampleNo, Keys.ENTER);
		//		Thread.sleep(1000);
		//		CloseTrip.click();
		//		Thread.sleep(1700);
		//		Back.click();
		//		Thread.sleep(1000);
		//		ViewTrip.click();
		//		Thread.sleep(1000);
		//		CompletedTrip.click();
		//		Thread.sleep(1000);
		//		Back.click();
		//		Thread.sleep(1000);   

		/////despatch Pending 
		Thread.sleep(1000);
		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection-Despatch Pending']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		despatch.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//SampleProcessing

		driver.findElement(By.xpath("//div[@class='menu-toggle change']//div[@class='bar2']")).click();
		Thread.sleep(1000);
		
		//hamberger.click();
		//Thread.sleep(1000);
		SampleProcessing.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@title='Sample No']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='MRNo/Name']//i[@class='ki ki-user']")).click();
		Thread.sleep(1000);
		
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		ServiceCheck.click();
		Thread.sleep(1000);
		Recieve.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-sample-check']")));
		Thread.sleep(1000);
		
		
		Status.click();
		Thread.sleep(1000);
		Samplerecieved.click();
		Thread.sleep(1000);
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);


		ServiceCheck.click();
		Thread.sleep(1000);
		Accept.click();
		Thread.sleep(2000);
		Reject.click();
		Thread.sleep(1000);
		RejectRedoReason.sendKeys("Not a proper sample");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active ng-star-inserted']")).click();
		Thread.sleep(1000);

		///	REDO-Request

		hamberger.click();
		Thread.sleep(1000);
		SampleCollection.click();
		Thread.sleep(1000);

		Executionloc.click();
		Thread.sleep(2000);
		Executionloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+SampleCollectionLocation+"']")).click();
		Thread.sleep(1000);
		ExecutionlocOK.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(1000);


		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection - Redo Request']")).click();
		Thread.sleep(1000);

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);

		Comments.sendKeys("OK");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Print Barcode')]")).click();
		Thread.sleep(1000);
		ivstgnSave.click();
		Thread.sleep(1000);
		SaveOK1.click();
		Thread.sleep(3000);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection-Despatch Pending']")).click();
		Thread.sleep(1000);
		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		Despatch.click();
		Thread.sleep(1000);    

		InvHamb.click();
		Thread.sleep(1000);
		SampleProcessing.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='Sample No']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='MRNo/Name']//i[@class='ki ki-user']")).click();
		Thread.sleep(1000);

		

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")));
		Thread.sleep(500);		
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);

		ServiceCheck.click();
		Thread.sleep(1000);
		Recieve.click();
		Thread.sleep(2000);
		Accept.click();
		Thread.sleep(2000);

		//		Operator.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='<']")).click();
		//		Thread.sleep(1000);
		Result.click();
		Thread.sleep(1000);
		Result.sendKeys("135");
		Thread.sleep(1000);
		
//		AdditionalTest.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary sm mt0 mb0 mr2 active']")).click();
//		Thread.sleep(1000);
		
		
		
		AdditionalResult.click();
		Thread.sleep(1000);
		AdditionalResult.sendKeys("6");
		Thread.sleep(1000);
		ivstgnSave.click();
		Thread.sleep(1000);


		//Result Authorizartion

		InvHamb.click();
		Thread.sleep(1000);
		ResultAuthorization.click();
		Thread.sleep(1000);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Unauthorized']")).click();
		Thread.sleep(1000);

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);

		RepeatTest.click();
		Thread.sleep(1000);
		ivstgnSave.click();
		Thread.sleep(1000);  


		///Repeat-Request	

		InvHamb.click();
		Thread.sleep(1000);
		SampleCollection.click();
		Thread.sleep(1000);

//		Executionloc.click();
//		Thread.sleep(2000);
//		Executionloc.click();
//		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//li[normalize-space()='"+SampleCollectionLocation+"']")).click();
		Thread.sleep(1000);
		ExecutionlocOK.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(1000);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection - Repeat Request']")).click();
		Thread.sleep(1000);

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);

		Comments.sendKeys("OK");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Print Barcode')]")).click();
		Thread.sleep(1000);
		ivstgnSave.click();
		Thread.sleep(1000);
		SaveOK1.click();
		Thread.sleep(2000);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection-Despatch Pending']")).click();
		Thread.sleep(1000);


		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		Despatch.click();
		Thread.sleep(1000); 


		InvHamb.click();
		Thread.sleep(1000);
		SampleProcessing.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@title='Sample No']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='MRNo/Name']//i[@class='ki ki-user']")).click();
		Thread.sleep(1000);

		
		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);

		ServiceCheck.click();
		Thread.sleep(1000);
		Recieve.click();
		Thread.sleep(1000);
		Accept.click();
		Thread.sleep(1000);

		Resultrepeat.click();
		Thread.sleep(1000);
		Resultrepeat.sendKeys("99");
		Thread.sleep(1000);
		ivstgnSave.click();
		Thread.sleep(1000);  


		InvHamb.click();
		Thread.sleep(1000);
		ResultAuthorization.click();

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Unauthorized']")).click();
		Thread.sleep(1000);

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);


		ResultStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(1000);

		ResultStatus1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(1000);

		ivstgnSave.click();
		Thread.sleep(2000);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(1000);

		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);

		ResultPreview.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);

		Homepage.click();
		Thread.sleep(1000);
		EMRResult.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sm btn btn-danger sm clear m0']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='rounded-1 btn btn-sm btn-red clear']")).click();
		Thread.sleep(1000);




	}

}
