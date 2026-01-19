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

public class KIMS_pathology_biopsy_YasassiWeb extends  PageFactoryInitYasasiiWeb {
	public KIMS_pathology_biopsy_YasassiWeb(WebDriver driver) {
		super(driver);
	}


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

	@FindBy(xpath = "//span[contains(@class,'btn btn-link ng-star-inserted')]")
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

	@FindBy(xpath="//input[@id='status']")
	public WebElement ivstgnStatus;

	@FindBy(xpath="//button[@id='ondespatchid']")
	public WebElement despatch;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='Sample Processing']")
	public WebElement SampleProcessing;

	@FindBy(xpath="//*[@id=\"SmpPage\"]/form/div/div/div/div/div/div/div[1]/div[1]/label/ki-checkbox-control/label/label")
	public WebElement orderCheckbox;

	@FindBy(xpath="//i[@title='Receive']")
	public WebElement Recieve;

	@FindBy(xpath="//i[@class='ki ki-sample-check']")
	public WebElement Accept;

	@FindBy(xpath="//i[@class='ki ki-microscope pl-3']")
	public WebElement pathologyProcess;

	@FindBy(xpath="//input[@id='cassettecount']")
	public WebElement cassetteCount;

	@FindBy(xpath="//input[@id='donebydrname']")
	public WebElement Donebydoc;

	@FindBy(xpath="//input[@id='donebyname']")
	public WebElement Donebytech;

	@FindBy(xpath="//label[normalize-space()='Decalcification']//span[@class='checkmark']")
	public WebElement declarification;

	@FindBy(xpath="//label[normalize-space()='STAT']//span[@class='checkmark']")
	public WebElement Stat;

	@FindBy(xpath="//label[normalize-space()='Special']//span[@class='checkmark']")
	public WebElement Special;

	@FindBy(xpath="//textarea[@id='remarks']")
	public WebElement Remarks;

	@FindBy(xpath="//button[@class='icon-btn btn-dark-green inline']")
	public WebElement pathAdd;

	@FindBy(xpath="//input[@id='cassetremarks0']")
	public WebElement CasssetteRemarks;

	@FindBy(xpath="//button[@id='onsavemain']")
	public WebElement PathSave;

	@FindBy(xpath="//div[@id='id2']")
	public WebElement Processing;

	@FindBy(xpath="//ki-calender-time[@id='enddate']//input[@type='text']")
	public WebElement Enddate;

	@FindBy(xpath="//span[normalize-space()='Today']")
	public WebElement today;

	@FindBy(xpath="//input[@id='blockcount0']")
	public WebElement blockCount;

	@FindBy(xpath="//input[@id='blockremarks0']")
	public WebElement blockRemarks0;

	@FindBy(xpath="//input[@id='blockremarks1']")
	public WebElement blockRemarks1;

	@FindBy(xpath="//input[@id='blockremarks2']")
	public WebElement blockRemarks2;

	@FindBy(xpath="//input[@id='slidecount0']")
	public WebElement slidecount;

	@FindBy(xpath="//input[@id='slideremarks0']")
	public WebElement slideremark0;

	@FindBy(xpath="//input[@id='slideremarks1']")
	public WebElement slideremark1;

	@FindBy(xpath="//input[@id='reversalprocessid']")
	public WebElement reversalprocess;

	@FindBy(xpath="//input[@id='adviceid']")
	public WebElement Advice;

	@FindBy(xpath="//input[@id='specialtestid']")
	public WebElement Specialtest;

	@FindBy(xpath="//ki-checkbox-control[@id='isgeneratefinalreport']//span[@class='checkmark']")
	public WebElement GeneratefinalReport;

	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement investHAmb;

	@FindBy(xpath="//textarea[@id='clinicaldetails']")
	public WebElement clinicalDetails;

	@FindBy(xpath="//textarea[@id='clinicaldiagnosisrep']")
	public WebElement clinicalDiagnosis;

	@FindBy(xpath="(//p)[1]")
	public WebElement macroScopy;

	@FindBy(xpath="(//p)[2]")
	public WebElement microscopy;

	@FindBy(xpath="(//p)[3]")
	public WebElement Diagnosis;

	@FindBy(xpath="(//p)[4]")
	public WebElement FinalDiagnosis;

	@FindBy(xpath="//textarea[@id='commentsrep']")
	public WebElement comment;

	@FindBy(xpath="//label[@class='check-container list-report']//span[@class='checkmark']")
	public WebElement cancerRegistry;

	@FindBy(xpath="//input[@id='ticdname']")
	public WebElement topograghy;

	@FindBy(xpath="//input[@id='micdname']")
	public WebElement morphology;

	@FindBy(xpath="//input[@id='caicdname']")
	public WebElement ICD;

	@FindBy(xpath="//button[normalize-space()='Preview']")
	public WebElement Preview;

	@FindBy(xpath="//button[normalize-space()='Close']")
	public WebElement close;

	@FindBy(xpath="//button[@id='onsaverepgen']")
	public WebElement ReportSave;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Range;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Resulttatus;

	@FindBy(xpath="//i[@class='ki ki-edit-log']")
	public WebElement Resultlog;

	@FindBy(xpath="//i[@title='Home Page']")
	public WebElement Homeicon;

	@FindBy(xpath="//i[@title='Document View']")
	public WebElement DocumentView;

	@FindBy(xpath="//i[@class='ki ki-template-result']")
	public WebElement ResultEnter;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/label[1]/i[1]")
	public WebElement criticalCall;

	@FindBy(xpath="//input[@id='callstatusid']")
	public WebElement callStatus;

	@FindBy(xpath="//textarea[@id='feedback']")
	public WebElement feedback;

	@FindBy(xpath="//button[@id='crcall']")
	public WebElement callSave;

	@FindBy(xpath="//i[@title='Critical result informed']")
	public WebElement criticalInformed;

	@FindBy(xpath="//i[@class='ki ki-edit-log']")
	public WebElement resultlog;

	@FindBy(xpath="//i[@class='ki ki-file-template']")
	public WebElement preview;

	@FindBy(xpath="//div[contains(text(),'Result Authorization')]")
	public WebElement ResultAuth;

	@FindBy(xpath="//i[@class='ki ki-print']")
	public WebElement print;

	@FindBy(xpath="//label[normalize-space()='With header']//span[@class='checkmark']")
	public WebElement HeaderCheckmark;

	@FindBy(xpath="//span[@class='checkmark']")
	public WebElement printcheck;

	@FindBy(xpath="//i[@title='Addendum']")
	public WebElement Addendum;

	@FindBy(xpath="//textarea[@id='addendum']")
	public WebElement AddendumTestarea;

	@FindBy(xpath="//textarea[@id='unauthorizationremarks']")
	public WebElement unauthorizeReason;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	




	public void patReg(String NAME , String lastname ,String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE) throws InterruptedException, IOException {


		Thread.sleep(2000);
		Title.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys(NAME);
		Thread.sleep(1000);
		Thread.sleep(500);
		String lastName =RandomString.lastName();
		
		System.out.println(lastName + "LastName" );
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastName);
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
		//driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
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
		String DOCID = RandomString.DOCID();
			
		aadharNo.sendKeys(DOCID );
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);

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
		Thread.sleep(600);


		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='TV']//span[@class='checkmark']")).click();
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
		Thread.sleep(3000);
		
		
		//////Encounter
		Thread.sleep(1000);
		clear.click();
		//Thread.sleep(1000);
		//printcheck.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();

		Thread.sleep(2000);
		EncounterAdd.click();
		Thread.sleep(2000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();

		Thread.sleep(2000);
		Service.click();	
		Thread.sleep(1000);
		AddnewService.click();
		Thread.sleep(2000);
		servicename.click();
		Thread.sleep(2000);
		servicename.sendKeys(SERVICE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+SERVICE+"']")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		//printcheck.click();
		//Thread.sleep(1000);
		Saveservice.click();
		Thread.sleep(2000);
		SaveOK.click();
		Thread.sleep(1000);

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(2000);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(38);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);
	}

	public void investigtion( String User , String Password , String MRNO) throws InterruptedException {



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


		Thread.sleep(2000);
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
		Thread.sleep(2000);


		Hamberger.click();
		Thread.sleep(1000);
		Investigation.click();
		Thread.sleep(1000);
		//Executionloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+SampleCollectionLocation1+"']")).click();
		Thread.sleep(1000);
		ExecutionlocOK.click();
		Thread.sleep(1000);
		confirmOK.click();
		Thread.sleep(1000);
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/label[2]/span[1]")).click();
//		Thread.sleep(1000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Print Barcode')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Print Receipt')]")).click();
		Thread.sleep(1000);
		ivstgnSave.click();
		Thread.sleep(1000);
		SaveOK1.click();
		Thread.sleep(1000);
		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection-Despatch Pending']")).click();
		Thread.sleep(1000);
		/////despatch Pending 
		Thread.sleep(1000);
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		despatch.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		Thread.sleep(2000);
		investHAmb.click();
		Thread.sleep(1000);
		SampleProcessing.click();
		Thread.sleep(1000);
		
		Thread.sleep(2000);
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
		orderCheckbox.click();
		Thread.sleep(1000);
		Recieve.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-sample-check']")));
		Thread.sleep(1000);
		Accept.click();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-microscope pl-3']")));
		Thread.sleep(2000);
		pathologyProcess.click();
		Thread.sleep(1000);


		///////////////grossing
		Thread.sleep(1000);
		Enddate.click();
		Thread.sleep(1000);
		today.click();
		Thread.sleep(1000);
		cassetteCount.click();
		Thread.sleep(1000);
		cassetteCount.sendKeys("1");
		Thread.sleep(1000);
		Donebydoc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Thread.sleep(1000);
		Donebytech.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(1000);
		declarification.click();
		Thread.sleep(1000);
		Stat.click();
		Thread.sleep(1000);
		Special.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Grossing done successfully");
		Thread.sleep(1000);
		pathAdd.click();
		Thread.sleep(1000);
		CasssetteRemarks.click();
		Thread.sleep(1000);
		CasssetteRemarks.sendKeys("OK");
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(1000);

		/////processing   
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		//Processing.click();
		Thread.sleep(1000);
		Enddate.click();
		Thread.sleep(1000);
		today.click();
		Thread.sleep(1000);
		Donebytech.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(1000);

		///////Embedding
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));

		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(1000);
		today.click();
		Thread.sleep(1000);
		Donebytech.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(1000);
		blockCount.click();
		Thread.sleep(1000);
		blockCount.clear();
		Thread.sleep(1000);
		blockCount.sendKeys("3");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		blockRemarks0.sendKeys("ok");
		Thread.sleep(1000);
		blockRemarks1.sendKeys("ok");
		Thread.sleep(1000);
		blockRemarks2.sendKeys("ok");
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(1000);

		/////////////////microtome
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(3000);
		Enddate.click();
		Thread.sleep(1000);
		today.click();
		Thread.sleep(1000);
		Donebytech.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(1000);
		slidecount.clear();
		Thread.sleep(1000);
		slidecount.sendKeys("2");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		slideremark0.sendKeys("ok");
		Thread.sleep(1000);
		slideremark1.sendKeys("ok");
		Thread.sleep(1000);
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(1000);

		///////////////////Staining

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(1000);
		today.click();
		Thread.sleep(1000);
		Donebytech.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(1000);
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(1000);

		///////////////mounting
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(1000);
		today.click();
		Thread.sleep(1000);
		Donebytech.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Donebydoc.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys(" done successfully");
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(1000);


		////////Reporting
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(1000);
		today.click();
		Thread.sleep(1000);	
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys(" done successfully");
		Thread.sleep(1000);
		reversalprocess.click();
		Thread.sleep(1000);
		Donebydoc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Thread.sleep(1000);
		Advice.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Special Tests']")).click();
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(1000);

		///////////////////Staining
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(1000);
		today.click();
		Thread.sleep(1000);
		Donebytech.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(1000);
		Thread.sleep(1000);
		Specialtest.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-list-item[@id='droplistkey15']//li[1]")).click();
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(1000);

		///////////////mounting
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(1000);
		today.click();
		Thread.sleep(1000);
		Donebytech.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Donebydoc.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys(" done successfully");
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(3000);

		////////Reporting
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(3000);
		Enddate.click();
		Thread.sleep(2000);
		today.click();
		Thread.sleep(1000);	
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys(" done successfully");
		Thread.sleep(1000);
		Donebydoc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Thread.sleep(1000);
		GeneratefinalReport.click();
		Thread.sleep(1000);
		PathSave.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='data-info']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();   
	}


	public void resultEnter(String MRNO, String User , String Password , String site) throws InterruptedException, AWTException {


		Thread.sleep(2000);
		ResultEnter.click();
		Thread.sleep(1000);
		clinicalDetails.clear();	
		Thread.sleep(1000);
		clinicalDetails.sendKeys("clinical details");
		Thread.sleep(1000);
		clinicalDiagnosis.clear();
		Thread.sleep(1000);
		clinicalDiagnosis.sendKeys("Clinical diagnosis");
		Thread.sleep(1000);
//		macroScopy.clear();
//		Thread.sleep(1000);
		//	macroScopy.sendKeys("Macroscopy");
		Thread.sleep(1000);
		//	microscopy.clear();
		Thread.sleep(1000);
		//	microscopy.sendKeys("microscopy");
		Thread.sleep(1000);
		Diagnosis.clear();
		Thread.sleep(1000);
		Diagnosis.sendKeys("Diagnosis");
		Thread.sleep(1000);
		FinalDiagnosis.clear();
		Thread.sleep(1000);
		FinalDiagnosis.sendKeys("final diagnosis");
		Thread.sleep(1000);
		comment.clear();
		Thread.sleep(1000);
		comment.sendKeys("comment");
		Thread.sleep(1000);
		cancerRegistry.click();
		Thread.sleep(1000);
		topograghy.click();
		Thread.sleep(1000);
		topograghy.sendKeys("Spec");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/app-autocompletelist-item[2]/li[1]")).click();
		Thread.sleep(1000);
		morphology.click();
		Thread.sleep(1000);
		morphology.sendKeys("diag");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		Thread.sleep(1000);
		ICD.click();
		Thread.sleep(1000);
		ICD.sendKeys("Malignant neoplasm of small intestine, unspecified");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		Thread.sleep(1000);
		Preview.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-red clear mr-2 btnrprt']")).click();
		Thread.sleep(3000);
		// close.click();
		ReportSave.click();
		Thread.sleep(5000);


		Thread.sleep(1000);
		resultlog.click();
		Thread.sleep(1000);
		preview.click();
		Thread.sleep(1000);
		String biopsyno =driver.findElement(By.xpath("/html[1]/body[1]/modal-container[2]/div[1]/div[1]/div[2]/span[1]/div[1]/p[1]/span[2]")).getText();
		Thread.sleep(1000);
		System.out.println(biopsyno);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger sm clear')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);




//		driver.findElement(By.xpath("//i[@class='ki ki-lock ki-lock-open']")).click();
//		Thread.sleep(1000);
		/////critical informed
		Range.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Critical']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();
		Thread.sleep(3000);
		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Critical Result not informed']")).click();
		Thread.sleep(1000);

		////Critical call informed

		SearchField.clear();
		Thread.sleep(1000);
		Thread.sleep(1000);
		SearchField.sendKeys(biopsyno , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		criticalCall.click();
		Thread.sleep(2000);
		callStatus.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Got the feed back']")).click();
		Thread.sleep(2000);
		feedback.click();
		Thread.sleep(2000);
		feedback.sendKeys("patient should be under observation");
		Thread.sleep(2000);
		callSave.click();
		Thread.sleep(2000);
		criticalInformed.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='btn btn-link ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")).click();
		Thread.sleep(2000);

		///firstlevel Authorize

		Thread.sleep(1000);
		Resulttatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
		Thread.sleep(1000);
//		SearchField.clear();
//		Thread.sleep(1000);
//		SearchField.sendKeys(MRNO , Keys.ENTER);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();

		
//				ivstgnSave.click();//button[@id='onSaveid']
//				Thread.sleep(3000);
//				ivstgnStatus.click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
//				Thread.sleep(1000); 
//		
//				System.out.println(MRNO);
//				Thread.sleep(2500);
//				ivstgnSave.click();
			Thread.sleep(2000);


		/////////unAuthorize

			
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='v-action-bar ng-star-inserted']")).click();
		Thread.sleep(1000);
		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Resulttatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Unauthorized']")).click();
		Thread.sleep(1000);
		unauthorizeReason.click();
		Thread.sleep(1000);
		unauthorizeReason.sendKeys("Prepare the Cucumber environment in less than 5 minutes\r\n"
				+ "Write a feature file and step definition in less than 5 minutes\r\n"
				+ "Understand the role of feature files and the Gherkin business language syntax");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();
		Thread.sleep(2000);


		///////first level Authorize	


		investHAmb.click();
		Thread.sleep(1000);
		ResultAuth.click();
		Thread.sleep(1000);

		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Unauthorized']")).click();
		Thread.sleep(1000);

		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Resulttatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();

		//////////second level authorize

		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Resulttatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();
		//driver.findElement(By.xpath("//button[@id='onSaveid']")).click();
		//	ivstgnSave.click();
		Thread.sleep(3000);
		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(1000);
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Resultlog.click();
		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
		Homeicon.click();
		Thread.sleep(3000);
		DocumentView.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='canvasWrapper']//canvas")).click();
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm ml10'][normalize-space()='Close']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='rounded-1 btn btn-sm btn-red clear']//i[@class='ki ki-clear-back']")).click();
		Thread.sleep(2000);

		ivstgnStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(1000);
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		print.click();
		Thread.sleep(4000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		HeaderCheckmark.click();
		Thread.sleep(1000); 
		print.click();
		Thread.sleep(4000);

		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);




	}

}
