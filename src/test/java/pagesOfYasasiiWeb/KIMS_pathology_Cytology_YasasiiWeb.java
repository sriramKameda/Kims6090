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

public class KIMS_pathology_Cytology_YasasiiWeb extends  PageFactoryInitYasasiiWeb {

	public KIMS_pathology_Cytology_YasasiiWeb(WebDriver driver) {
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

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
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

	@FindBy(xpath="//input[@id='cassettecount']")
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


	@FindBy(xpath="(//div[@role='textbox'])[3]")
	public WebElement opinion;

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

	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement EmrSearch;


	@FindBy(xpath="//label[contains(text(),'Cancer Registry')]")
	public WebElement EMRcancerRegistry;

	@FindBy(xpath="//i[@class='fa fa-ellipsis-v']")
	public WebElement Threedot;

	@FindBy(xpath="//label[@class='remark']")
	public WebElement remarks;

	@FindBy(xpath="//div[@class='form-group zero-bottom ng-star-inserted']//textarea[@id='undefined']")
	public WebElement EnterRemarks;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosisandplan;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEphar;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement medicineSearch;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement frequency;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement medicineAdd;

	@FindBy(xpath = "//button[contains(@class,'icon emrsave')]")
	public WebElement EMRsave;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProvidername;
	@FindBy(xpath = "//li[contains(text(),'Thomas')]")
	public WebElement SelectProvidername;
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement prioty;
	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPrirty;
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement Roomcatgry;
	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement Selectcategry;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement BEd;//input[@id='bedclass']
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectBEd;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BEDno;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBEDno;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAVE;

	@FindBy(xpath = "//input[@id='prescriptiontypeid']")
	public WebElement Ongoing;

	@FindBy(xpath = "//button[@class='icon discharesum']")
	public WebElement visitsummary;

	@FindBy(xpath = "//div[contains(@class,'form-group zero-bottom ng-star-inserted')]//input[contains(@type,'text')]")
	public WebElement DOD;

	@FindBy(xpath = "//input[@id='educationlevel-1']")
	public WebElement IP;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF3498']")
	public WebElement historyandfindings;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF2156']")
	public WebElement Investigationtext;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF2158']")
	public WebElement referedby;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF2160']")
	public WebElement conditionatdischarge;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF2162']")
	public WebElement dischargeRecommendation;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF2164']")
	public WebElement followup;

	@FindBy(xpath = "//th[@class='remarks']")
	public WebElement remarksSummary;

	@FindBy(xpath = "//i[@class='ki ki-file-report']")
	public WebElement Report;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement Basecategory;

	@FindBy(xpath = "//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")
	public WebElement Go;

	@FindBy(xpath = "//button[normalize-space()='Log']")
	public WebElement LOG;

	@FindBy(xpath = "//button[normalize-space()='Preview']")
	public WebElement Previewsummary;

	@FindBy(xpath = "//label[normalize-space()='Authorize']//span[@class='checkmark']")
	public WebElement Authorize;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement SummarySave;

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

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//div[@class='dl-body']//div[2]")
	public WebElement Visit;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	


	public void patReg(String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE ) throws InterruptedException, IOException, AWTException {

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(700);
		FO.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[normalize-space()='Registration']")).click();


		Thread.sleep(700);

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
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(700);
		FirstName.click();
		Thread.sleep(700);
		FirstName.sendKeys(NAME);
		Thread.sleep(700);
		String lastName =RandomString.lastName();
		
		System.out.println(lastName + "LastName" );
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastName);
		Thread.sleep(500);



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
		//	driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
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


		Thread.sleep(700);
		howDidYouKnow.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//label[normalize-space()='TV']//span[@class='checkmark']")).click();
		Thread.sleep(700);
		OKhowDidYouKnow.click();
		Thread.sleep(700);
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


		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(1000);


		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(39);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(1000);

		//////Encounter

		clear.click();
		Thread.sleep(700);
		//	billprint.click();
		//	Thread.sleep(700);
		providerName.click();
		Thread.sleep(700);
		providerName.sendKeys(Provider);
		Thread.sleep(700);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();

		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(700);
		EncounterSave.click();
		Thread.sleep(700);
		Thread.sleep(1000);
		SAvesuccess.click();

		//////////Admit the patient
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-patient-bed-fill']")).click();


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
		EnterProvidername.sendKeys(ADTprovider);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider+"')])")).click();
		Thread.sleep(800);
		//SelectProvidername.click();
		prioty.click();
		Thread.sleep(800);
		SelectPrirty.click();
		Thread.sleep(500);
		{

			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			//JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		Roomcatgry.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='ROOM']")).click();
		Thread.sleep(700);

		BEd.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'Ultra-Deluxe')])")).click();
		Thread.sleep(700);
		BEDno.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
		Thread.sleep(1000);
		SAVE.click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement1111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if(dynamicElement1111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);



		List<WebElement> dynamicElement31=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if(dynamicElement31.size() !=0)
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



		///service Order


		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-reception-fill']")).click();

		Thread.sleep(1000);
		Service.click();	
		Thread.sleep(1000);
		//	billprint.click();
		//	Thread.sleep(700);
		AddnewService.click();
		Thread.sleep(1000);

		servicename.click();
		Thread.sleep(1000);
		servicename.sendKeys("Admission Charge");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Admission Charge']")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Saveservice.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);


		servicename.click();
		Thread.sleep(1000);
		servicename.sendKeys(SERVICE);
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+SERVICE+"']")).click();
		Thread.sleep(700);
		Thread.sleep(700);
		Add.click();
		Thread.sleep(3000); 


		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);

		act.moveToElement(Threedot).build().perform();
		Thread.sleep(1000);

		//act.moveToElement(remarks).click().build().perform();
		//		remarks.click();
		//		Thread.sleep(700);
		//		EnterRemarks.sendKeys("followed by biopsy");
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//button[@class='btn btn-primary active sm mr0 mt0 mb0']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		Saveservice.click();
		Thread.sleep(1000);
		SaveOK.click();




	}

	public void investigtion( String User , String Password ,  String MRNO) throws InterruptedException {



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
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );

		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(1000);


		Hamberger.click();
		Thread.sleep(700);
		Investigation.click();
		//Thread.sleep(700);
		//Executionloc.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+SampleCollectionLocation1+"']")).click();
		Thread.sleep(700);
		ExecutionlocOK.click();
		Thread.sleep(700);
		confirmOK.click();
		Thread.sleep(3000);
		//SampleProcessing
		SearchField.click();
		Thread.sleep(700);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(5000);
		//caudatecheckbox.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Print Barcode')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Print Receipt')]")).click();
		Thread.sleep(1000);

		ivstgnSave.click();
		Thread.sleep(1000);
		SaveOK1.click();
		Thread.sleep(3000);
		ivstgnStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection-Despatch Pending']")).click();
		Thread.sleep(3000);
		/////despatch Pending 
		Thread.sleep(3000);
		SearchField.clear();
		Thread.sleep(3000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(3000);
		despatch.click();
		Thread.sleep(3000); 


		investHAmb.click();
		Thread.sleep(700);
		SampleProcessing.click();
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
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")));
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);

		orderCheckbox.click();
		Thread.sleep(1000);
		Recieve.click();
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-sample-check']")));
		Accept.click();
		Thread.sleep(2000);  

		//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-microscope pl-3']")));
		pathologyProcess.click();
		Thread.sleep(700);

		//		///////////////grossing
		//		Thread.sleep(700);
		//		Enddate.click();
		//		Thread.sleep(700);
		//		today.click();
		//		Thread.sleep(700);
		//		cassetteCount.click();
		//		Thread.sleep(700);
		//		cassetteCount.sendKeys("1");
		//		Thread.sleep(700);
		//		Donebydoc.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		//		Thread.sleep(700);
		//		Donebytech.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		//		Thread.sleep(700);
		//		declarification.click();
		//		Thread.sleep(700);
		//		Stat.click();
		//		Thread.sleep(700);
		//		Special.click();
		//		Thread.sleep(700);
		//		Remarks.click();
		//		Thread.sleep(700);
		//		Remarks.sendKeys("Grossing done successfully");
		//		Thread.sleep(700);
		//		pathAdd.click();
		//		Thread.sleep(700);
		//		CasssetteRemarks.click();
		//		Thread.sleep(700);
		//		CasssetteRemarks.sendKeys("OK");
		//		Thread.sleep(700);
		//		PathSave.click();
		//		Thread.sleep(700);
		//		/////processing   
		//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));

		//Processing.click();
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

		Thread.sleep(1000);
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
		Thread.sleep(3000);

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
		slidecount.clear();
		Thread.sleep(700);
		slidecount.sendKeys("2");
		Thread.sleep(700);
		Add.click();
		Thread.sleep(700);
		slideremark0.sendKeys("ok");
		Thread.sleep(700);
		slideremark1.sendKeys("ok");
		Thread.sleep(700);
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700);

		///////////////////Staining

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(1000);
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
		PathSave.click();
		Thread.sleep(700);

		///////////////mounting
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(1000);
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
		Thread.sleep(1000);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);	
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys(" done successfully");
		Thread.sleep(700);
		reversalprocess.click();
		Thread.sleep(700);
		Donebydoc.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Thread.sleep(700);
		Advice.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Special Tests']")).click();
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700);

		///////////////////Staining
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(1000);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);
		Donebytech.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//i[@class='ki ki-screen-expand ng-star-inserted']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//i[@class='ki ki-screen-collapse ng-star-inserted']")).click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys("Processing done successfully");
		Thread.sleep(700);
		Thread.sleep(700);
		Specialtest.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Periodic acid Schiffs Staining (PAS)']")).click();
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700); 

		///////////////mounting
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(1000);
		Enddate.click();
		Thread.sleep(700);
		today.click();
		Thread.sleep(700);
		Donebytech.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyTechnician+"']")).click();
		Thread.sleep(700);
		Donebydoc.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+BiopsyDoctor+"']")).click();
		Thread.sleep(700);
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys("mounting done successfully");
		Thread.sleep(700);
		PathSave.click();
		Thread.sleep(700);

		////////Reporting
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-calender-time[@id='enddate']//input[@type='text']")));
		Thread.sleep(2000);
		Enddate.click();
		Thread.sleep(1000);
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
		Thread.sleep(1000);	

	}


	public void resultEnter(String MRNO, String User , String Password) throws InterruptedException {


		Thread.sleep(3000);
		ResultEnter.click();
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
		opinion.clear();
		Thread.sleep(700);
		opinion.sendKeys("builder.keyDown(Keys.CONTROL) .click(someElement) .click(someOtherElement) .keyUp(Keys.CONTROL); // Then get the action: Action selectMultiple = builder.build(); // And execute it: selectMultiple.perform(); Is this code for drag and drop? I think, it's for multiple selection. – \r\n"
				+ "Ripon Al Wasim\r\n"
				+ " Apr 6, 2017 at 13:21\r\n"
				+ "when i try to run this i get :- Exception in thread \"main\" org.openqa.selenium.interactions.MoveTargetOutOfBoundsException: move target out of bounds, any idea how to solve it – \r\n"
				+ "Anurag Sharma\r\n"
				+ " Jun 3, 2021 at 8:39 ");
		Thread.sleep(1000);
		comment.clear();
		Thread.sleep(700);
		comment.sendKeys("comment");
		Thread.sleep(700);
		cancerRegistry.click();
		Thread.sleep(700);
		topograghy.click();
		Thread.sleep(700);
		topograghy.sendKeys("Spec");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		Thread.sleep(3000);
		morphology.click();
		Thread.sleep(3000);
		morphology.sendKeys("diag");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		Thread.sleep(3000);
		ICD.click();
		Thread.sleep(3000);
		ICD.sendKeys("Malignant neoplasm of small intestine, unspecified");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-reportgeneration[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		Thread.sleep(3000);
		Preview.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-red clear mr-2 btnrprt']")).click();
		Thread.sleep(3000);
		// close.click();
		ReportSave.click();
		Thread.sleep(5000);

		List<WebElement> dynamicElement31=driver.findElements(By.xpath("//i[@class='ki ki-lock ki-lock-open']"));

		if(dynamicElement31.size() !=0)
		{
			driver.findElement(By.xpath("//i[@class='ki ki-lock ki-lock-open']")).click();
			Thread.sleep(1000);

		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);






		//		driver.findElement(By.xpath("//i[@class='ki ki-lock ki-lock-open']")).click();
		/////critical informed
		Range.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
		//		Thread.sleep(700);
		//	//	driver.findElement(By.xpath("//li[normalize-space()='Critical']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/span[1]/button[1]")).click();
		//		Thread.sleep(3000);
		//		ivstgnStatus.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='Critical Result not informed']")).click();
		//		Thread.sleep(700);
		//		SearchField.clear();
		//		Thread.sleep(700);
		//		Thread.sleep(700);
		//		SearchField.sendKeys(MRNO , Keys.ENTER);
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		//		Thread.sleep(1000);
		//		
		//		
		//		criticalCall.click();
		//		Thread.sleep(1000);
		//		callStatus.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Got the feed back']")).click();
		//		Thread.sleep(1000);
		//		feedback.click();
		//		Thread.sleep(1000);
		//		feedback.sendKeys("patient should be under observation");
		//		Thread.sleep(1000);
		//		callSave.click();
		//		Thread.sleep(1000);
		//		criticalInformed.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//span[@class='btn btn-link ng-star-inserted']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")).click();
		//		Thread.sleep(1000);

		///firstlevel Authorize

		Thread.sleep(700);
		Resulttatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click(); 

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

		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
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
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm ml10'][normalize-space()='Close']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='rounded-1 btn btn-sm btn-red clear']//i[@class='ki ki-clear-back']")).click();
		Thread.sleep(700);

	}


	public void cancerRegistryView( String User1,String Password1,String MRNO ) throws InterruptedException, AWTException {



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
		Thread.sleep(700);
		userid.sendKeys(ProviderID);
		Thread.sleep(700);
		password.click();
		Thread.sleep(700);
		password.sendKeys(Password);
		Thread.sleep(700);
		site.click();
		Thread.sleep(700);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );

		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(500);

		EmrSearch.click();
		Thread.sleep(700);
		EmrSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(700);
		act.moveToElement(EMRcancerRegistry).build().perform();
		Thread.sleep(3000);

		Thread.sleep(700);
		DoctorNote.click();
		Thread.sleep(700);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 


		Thread.sleep(700);
		reasonForVisit.clear();
		Thread.sleep(700);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(700);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(700);
		Template.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(700);
		TemplateOK.click();
		Thread.sleep(700);



		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(EMRsave));
		Thread.sleep(3000);		
		diagnosisandplan.click();
		driver.findElement(By.xpath("//*[contains(text(),'normal pressure hydrocephalus')]")).click();
		//SelectICD.click();
		Thread.sleep(800);

		Thread.sleep(700);

		Thread.sleep(1000);
		CPOEphar.click();
		Thread.sleep(700);
		medicineSearch.click();
		Thread.sleep(700);
		medicineSearch.sendKeys("DOLOPAR 650 TAB", Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
		Thread.sleep(700);
		//driver.findElement(By.xpath("//input[@id='reason0']")).click();
		//Thread.sleep(700);
		//Reason.click();
		//Reason.sendKeys("needed for patient");
		//Thread.sleep(700);
		//driver.findElement(By.xpath("//button[@class='btn btn-dark-green active'][normalize-space()='Yes']")).click();
		Ongoing.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Discharge']")).click();
		Thread.sleep(700);
		frequency.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(700);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);



		///////Medicine REconciliation
		Thread.sleep(700);
		driver.findElement(By.xpath("//label[normalize-space()='No Current Medication']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		Thread.sleep(700);


		//Diagnosischeckbox	
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='col-md-11']//span[@class='checkmark']")).click();
		Thread.sleep(700);

		medicineAdd.click();
		Thread.sleep(700);
		EMRsave.click();
		Thread.sleep(1000); 

		//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='icon discharesum']")));
		Thread.sleep(1000);
		visitsummary.click();
		Thread.sleep(3200);
		Visit.click();
		Thread.sleep(2700);
		//IP.click();
		//Thread.sleep(700);
		//		DOD.click();
		//		Thread.sleep(1000);
		//		Robot r=new Robot(); 
		//		r.keyPress(KeyEvent.VK_ENTER);
		//		Thread.sleep(500);
		//		r.keyRelease(KeyEvent.VK_ENTER);
		//		Thread.sleep(1000);	
		//		


		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//ki-checkbox-control[@id='isdiagnosischk']//span[@class='checkmark']")));
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ki-checkbox-control[@id='isdiagnosischk']//span[@class='checkmark']")));
		Thread.sleep(700);
		driver.findElement(By.xpath("//ki-checkbox-control[@id='isdiagnosischk']//span[@class='checkmark']")).click();
		Thread.sleep(700);
		js.executeScript("arguments[0].scrollIntoView();", historyandfindings);
		Thread.sleep(700);
		historyandfindings.sendKeys("16 Best Trello Alternatives & Competitors In 2022\r\n"
				+ "Best Sample Test Cases For Coffee Vending Machine\r\n"
				+ "14 Best APM Tools In 2022 (Application Performance Monitoring Tools)\r\n"
				+ "Sample Test Cases For Water bottle\r\n"
				+ "Sample Test Cases For Calculator");
		Thread.sleep(700);
		js.executeScript("arguments[0].scrollIntoView();", Investigationtext);
		Thread.sleep(700);
		Investigationtext.sendKeys("Modernize the Enterprise with Full-Stack Testing\r\n"
				+ "\r\n"
				+ "Stop wasting time and money using multiple tools to test\r\n"
				+ "\r\n"
				+ "every technology layer of an application.\r\n"
				+ "\r\n"
				+ "• How to improve business agility with full-stack testing\r\n"
				+ "• Why you must test all application technology layers together\r\n"
				+ "• The benefits of executing automated full-stack testing in a single framework\r\n"
				+ "• How Keysight's Eggplant simplifies full-stack testing");

		Thread.sleep(700);

		js.executeScript("arguments[0].scrollIntoView();", conditionatdischarge);
		Thread.sleep(700);
		conditionatdischarge.sendKeys("fully cured");
		Thread.sleep(700);
		js.executeScript("arguments[0].scrollIntoView();", dischargeRecommendation);
		Thread.sleep(700);
		dischargeRecommendation.sendKeys("proceed discharge processes");
		Thread.sleep(700);
		js.executeScript("arguments[0].scrollIntoView();", followup);
		Thread.sleep(700);
		followup.sendKeys("Selenium has gained enormous popularity in the field of test automation. Most of the companies adopting this tool. Being an automation tester myself, I know the challenges we face while finding robust XPath in Selenium. ");
		Thread.sleep(700);
		js.executeScript("arguments[0].scrollIntoView();", remarksSummary);
		Thread.sleep(700);
		Report.click();
		Thread.sleep(700);
		Basecategory.click();
		Thread.sleep(700);
		Basecategory.sendKeys("laboratory");
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
		Thread.sleep(700);
		Go.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//label[@class='check-container zero-bottom']//span[@class='checkmark']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[@type='button']")).click();
		Thread.sleep(700);

		js.executeScript("arguments[0].scrollIntoView();", referedby);
		Thread.sleep(700);
		referedby.sendKeys("Here I am going to present the 10 best Google Chrome extensions to find XPath in Selenium which helps you find XPath easily. \r\n"
				+ "\r\n"
				+ "");

		Thread.sleep(700);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[11]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("Test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[12]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("Test");
		Thread.sleep(1000);


		Previewsummary.click();
		
		Thread.sleep(3000);
		Authorize.click();
		Thread.sleep(700);
		SummarySave.click();
		Thread.sleep(3200);
		Visit.click();
		Thread.sleep(2700);
		driver.findElement(By.xpath("//button[@id='dischargesummary_preview']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//i[@class='ki ki-print']")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//label[normalize-space()='With Header']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']")).click();

		Thread.sleep(5000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);

		try {
			LOG.click();
			Thread.sleep(1000);	
		}
		catch (Exception e) {
			System.out.println(e +"- Exception");  

			Thread.sleep(5000);
			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
			LOG.click();
			Thread.sleep(1000);
		}


		driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(700);



	}


}

