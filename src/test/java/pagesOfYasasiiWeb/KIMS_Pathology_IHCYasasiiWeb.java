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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
import com.w2a.utilities.RandomString;

public class KIMS_Pathology_IHCYasasiiWeb extends  PageFactoryInitYasasiiWeb {
	public KIMS_Pathology_IHCYasasiiWeb(WebDriver driver) {
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

	@FindBy(xpath="//button[@id='onsaveid']")
	public WebElement ivstgnSave;

	@FindBy(xpath="//button[normalize-space()='Ok']//i[@class='ki ki-check']")
	public WebElement SaveOK1;

	@FindBy(xpath="//input[@id='status']")
	public WebElement ivstgnStatus;

	@FindBy(xpath="//button[@id='ondespatchid']")
	public WebElement despatch;

	@FindBy(xpath="//div[normalize-space()='Sample Processing']")
	public WebElement SampleProcessing;

	@FindBy(xpath="//label[normalize-space()='Select All']//span[@class='checkmark']")
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

	@FindBy(xpath="//input[@id='blockremarks0']")
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

	@FindBy(xpath="(//div[@role='textbox'])[1]")
	public WebElement macroScopy;

	@FindBy(xpath="(//div[@role='textbox'])[2]")
	public WebElement microscopy;

	@FindBy(xpath="(//div[@role='textbox'])[3]")
	public WebElement Diagnosis;

	@FindBy(xpath="(//div[@role='textbox'])[4]")
	public WebElement FinalDiagnosis;

	@FindBy(xpath="(//textarea[@id='commentsrep'])[1]")
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

	@FindBy(xpath="//i[@class='ki ki-microscope pl-3']")
	public WebElement pathologyno;
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	public WebElement pathologySearch;
	
	@FindBy(xpath="/html/body/modal-container/div/div/div[2]/div/table/tbody/tr/td[3]")
	public WebElement ServiceClick;
	
	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement Searchfield;
	
	@FindBy(xpath="//i[@id='viewcassteid']")
	public WebElement viewcassete;

	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]")
	public WebElement biopsyblockCount;
	
	@FindBy(xpath="//input[@id='markername']")
	public WebElement marker;
	
	@FindBy(xpath="//textarea[@id='natureofspecimen']")
	public WebElement specimen;
	
	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/ki-calender-time-range[1]/div[1]/input[1]")
	public WebElement daterange;
	
	
	
	
	
	
	
	public void patReg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE1) throws InterruptedException, IOException {


	/*	Thread.sleep(2000);
		Title.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(700);
		FirstName.click();
		Thread.sleep(700);
		FirstName.sendKeys(NAME);
		Thread.sleep(700);
		age.click();
		Thread.sleep(700);
		age.sendKeys(AGE);
		Thread.sleep(700);
		mobileNo.click();
		Thread.sleep(700);
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(700);
		Organisation.click();
		Thread.sleep(700);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		Thread.sleep(700);
		ContactInformation.click();
		Thread.sleep(700);
		address.click();
		Thread.sleep(700);
		address.sendKeys(ADDRESS);
		Thread.sleep(700);
		DocID.click();
		Thread.sleep(700);
		for (int i = 0; i <=15; i++) {
			aadharNo.sendKeys( Keys.BACK_SPACE);
		}
		//aadharNo.click();
		 
		 String DOCID = RandomString.DOCID();
		
		aadharNo.sendKeys(DOCID );
		
		Thread.sleep(700);
		docAdd.click();
		Thread.sleep(700);

		Thread.sleep(700);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		Thread.sleep(700);
		howDidYouKnow.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(700);
		RegSave.click();
		Thread.sleep(3000);
		SaveSuccess.click();
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(2000);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(99);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout); */

		Thread.sleep(2000);

	
		
		//////Encounter
	/*	Thread.sleep(700);
		clear.click();
		Thread.sleep(700);
		providerName.click();
		Thread.sleep(700);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();

		Thread.sleep(5000);
		EncounterAdd.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Two Years Registration']")));
		EncounterSave.click();
		Thread.sleep(700);
		SAvesuccess.click();   */

		//ServiceAdd
		Thread.sleep(700);
		// js= (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();",  Service);
	
		
		Thread.sleep(3000);
		Searchfield.clear();
		Thread.sleep(700);
		Searchfield.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(700);
		
		Thread.sleep(2000);
		Service.click();	
		Thread.sleep(700);
		clear.click();
		Thread.sleep(700);
		providerName.click();
		Thread.sleep(700);
		providerName.sendKeys(Provider);
		Thread.sleep(700);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();

		AddnewService.click();
		Thread.sleep(2000);
		servicename.click();
		Thread.sleep(2000);
		servicename.sendKeys(SERVICE1);
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+SERVICE1+"']")).click();
		Thread.sleep(700);
		Add.click();
		Thread.sleep(700); 

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//label[@class='dialog-title'][normalize-space()='Confirmation']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}

		else
		{
			
		}
		Thread.sleep(700);
		Saveservice.click();
		Thread.sleep(700);
		
		Thread.sleep(700);

		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//label[@class='dialog-title'][normalize-space()='Confirmation']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}

		else
		{
			
		}
		Thread.sleep(700);
		SaveOK.click();


	}

	public void investigtion( String User , String Password , String MRNO) throws InterruptedException, AWTException {
	

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		
		Thread.sleep(2000);
		userid.click();
		Thread.sleep(700);
		userid.sendKeys(User);
		Thread.sleep(700);
		password.click();
		Thread.sleep(700);
		password.sendKeys(Password);
		Thread.sleep(700);
		site.click();
		Thread.sleep(700);
		JavascriptExecutor js= (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );

		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);


		Hamberger.click();
		Thread.sleep(700);
		Investigation.click();
		Thread.sleep(700);
	//	Executionloc.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+SampleCollectionLocation1+"']")).click();
		Thread.sleep(700);
		ExecutionlocOK.click();
		Thread.sleep(700);
		confirmOK.click();
		Thread.sleep(700);
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
		
 
		Thread.sleep(2000);
		investHAmb.click();
		Thread.sleep(700);
		SampleProcessing.click();
		Thread.sleep(1000);
		
		ivstgnStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Despatched']")).click();
		Thread.sleep(700);
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='Sample No']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='MRNo/Name']//i[@class='ki ki-user']")).click();
		Thread.sleep(1000);
		
		
		
		SearchField.clear();
		Thread.sleep(700);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(700);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30)); 
		
		orderCheckbox.click();
		Thread.sleep(2000);
		Recieve.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-sample-check']")));
		Accept.click();
		Thread.sleep(5000);   
		pathologyno.click();
		Thread.sleep(700);
		
		
//		daterange.click();
//		Thread.sleep(1700);
//		driver.findElement(By.xpath("//span[@class='owl-dt-calendar-cell-content'][normalize-space()='1']")).click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//span[normalize-space()='From:']")).click();
//		Thread.sleep(700);
//	
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_RIGHT);
		t.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(400);
	
		driver.findElement(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(700);
		
//		pathologySearch.click();
//		Thread.sleep(700);
//		ServiceClick.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary sm mt0 mb0 mr2 active']")).click();
//		Thread.sleep(700);
//		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-microscope pl-3']")));
//		pathologyProcess.click();
		Thread.sleep(2000);
		///////////////grossing
		Thread.sleep(700);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);
//	//	viewcassete.click();
//		Thread.sleep(700);
//	//	biopsyblockCount.click();
//		Thread.sleep(700);
//	//	driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click();
//		Thread.sleep(700);
//		Thread.sleep(3000);
//		
////	String count =driver.findElement(By.xpath("//input[@id='cassettecount']")).getText();
		
	Thread.sleep(700);
	    cassetteCount.clear();
		Thread.sleep(700);
		cassetteCount.sendKeys("4");
		Thread.sleep(700);
		Donebydoc.click();
		Thread.sleep(700);
    	driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Thread.sleep(700);
		Donebytech.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(700);
	//	//declarification.click();
	//	Thread.sleep(700);
		//Stat.click();
		Thread.sleep(700);
		//Special.click();
		Thread.sleep(700);
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys("Grossing done successfully");
		Thread.sleep(700);
		pathAdd.click();
		Thread.sleep(700);
//		CasssetteRemarks.click();
//		Thread.sleep(700);
//		CasssetteRemarks.sendKeys("OK");
//		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700);
		
		
		
		/////processing  
	
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Processing.click();
		Thread.sleep(700);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);
		Donebytech.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(700);
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700);  

		///////Embedding
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));

		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);
		Donebytech.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(700);
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(700);
		blockCount.click();
		Thread.sleep(700);
		blockCount.clear();
		Thread.sleep(700);
		blockCount.sendKeys("3");
		Thread.sleep(700);
		Add.click();
		Thread.sleep(700);
		blockRemarks0.sendKeys("ok");
		Thread.sleep(700);
		blockRemarks1.sendKeys("ok");
		Thread.sleep(700);
		blockRemarks2.sendKeys("ok");
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700);  

		/////////////////microtome
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(3000);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);
		Donebytech.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(700);
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(700);
		//slidecount.clear();
		Thread.sleep(700);
	//	slidecount.sendKeys("2");
		Thread.sleep(700);
		Add.click();
		Thread.sleep(700);
		slideremark0.sendKeys("ok");
		Thread.sleep(700);
	//	slideremark1.sendKeys("ok");
		//Thread.sleep(1000);
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700);

		///////////////////Staining
	
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);
		Donebytech.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(700);
		marker.click();
		//driver.findElement(By.xpath("//li[normalize-space()='AMACR']")).click();
		//Add.click();
		
		
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(700);
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700);

		///////////////mounting
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);
		Donebytech.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Donebydoc.click();
	    driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys(" done successfully");
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700);


		////////Reporting
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);	
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys(" done successfully");
		Thread.sleep(700);
		//reversalprocess.click();
	//	Thread.sleep(700);
		Donebydoc.click();
		Thread.sleep(700);
	    driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Thread.sleep(700);
	//	Advice.click();
		Thread.sleep(700);
	//.findElement(By.xpath("//li[normalize-space()='Special Tests']")).click();
		Thread.sleep(700);
		GeneratefinalReport.click();
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='data-info']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

		///////////////////Staining//N
	Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);
		Donebytech.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(700);
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(700);
		Thread.sleep(700);
		Specialtest.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//app-list-item[@id='droplistkey15']//li[1]")).click();
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700);

		///////////////mounting
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);
		Donebytech.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Donebydoc.click();
	  driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys(" done successfully");
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700);   

		////////Reporting
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(2000);
		today.click();
		Thread.sleep(700);	
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys(" done successfully");
		Thread.sleep(700);
		Donebydoc.click();
		Thread.sleep(700);
	   driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Thread.sleep(700);
		GeneratefinalReport.click();
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='data-info']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Back']")).click(); 
	}


	public void resultEnter(String MRNO, String User , String Password ) throws InterruptedException {
		
	
		Thread.sleep(7000);
		ResultEnter.click();
		Thread.sleep(700);
		specimen.click();
		Thread.sleep(700);
		specimen.sendKeys("quade");
		Thread.sleep(700);
		
		clinicalDetails.clear();	
		Thread.sleep(700);
		clinicalDetails.sendKeys("clinical details");
		Thread.sleep(700);
		clinicalDiagnosis.clear();
		Thread.sleep(700);
		clinicalDiagnosis.sendKeys("Clinical diagnosis");
		Thread.sleep(700);
		macroScopy.clear();
		Thread.sleep(700);
		macroScopy.sendKeys("Macroscopy");
		Thread.sleep(700);
		microscopy.clear();
		Thread.sleep(700);
		microscopy.sendKeys("microscopy");
		Thread.sleep(700);
		Diagnosis.clear();
		Thread.sleep(700);
		Diagnosis.sendKeys("Diagnosis");
		Thread.sleep(700);
		FinalDiagnosis.clear();
		Thread.sleep(700);
		FinalDiagnosis.sendKeys("final diagnosis");
		Thread.sleep(700);
		comment.clear();
		Thread.sleep(700);
		comment.sendKeys("comment");
		Thread.sleep(700);
//		cancerRegistry.click();
//		Thread.sleep(700);
//		topograghy.click();
//		Thread.sleep(700);
//		topograghy.sendKeys("Spec");
//		Thread.sleep(700);
//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/app-autocompletelist-item[2]/li[1]")).click();
//		Thread.sleep(700);
//		morphology.click();
//		Thread.sleep(700);
//		morphology.sendKeys("diag");
//		Thread.sleep(700);
//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
//		Thread.sleep(700);
//		ICD.click();
//		Thread.sleep(700);
//		ICD.sendKeys("liver");
//		Thread.sleep(700);
//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
//		Thread.sleep(700);
//		
		
		
		Preview.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-red clear mr-2 btnrprt']")).click();
		Thread.sleep(3000);
		// close.click();
		ReportSave.click();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//i[@class='ki ki-lock ki-lock-open']")).click();
		/////critical informed
		Thread.sleep(700);
		Range.click();
		Thread.sleep(700);
		//driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Critical']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();
		Thread.sleep(3000);
		ivstgnStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Critical Result not informed']")).click();
		Thread.sleep(700);
		SearchField.clear();
		Thread.sleep(700);
		Thread.sleep(700);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
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
		
		Thread.sleep(700);
     	Resulttatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();
		
		//ivstgnSave.click();//button[@id='onSaveid']
		Thread.sleep(3000);
		ivstgnStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
		Thread.sleep(700);
		SearchField.clear();
		Thread.sleep(700);
		Thread.sleep(700);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(700);
		Resulttatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();
		//ivstgnSave.click();
		Thread.sleep(3000);
		ivstgnStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(700);
		SearchField.clear();
		Thread.sleep(700);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(700);
		Resultlog.click();
		Thread.sleep(700);
		close.click();
		Thread.sleep(700);
		Homeicon.click();
		Thread.sleep(3000);
		DocumentView.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='canvasWrapper']//canvas")).click();
		Thread.sleep(700);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm ml10'][normalize-space()='Close']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[@class='rounded-1 btn btn-sm btn-red clear']//i[@class='ki ki-clear-back']")).click();
		Thread.sleep(700);

		



	}

}
