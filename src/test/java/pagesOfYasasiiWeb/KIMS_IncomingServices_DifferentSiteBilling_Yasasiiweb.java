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

public class KIMS_IncomingServices_DifferentSiteBilling_Yasasiiweb extends PageFactoryInitYasasiiWeb {

	public KIMS_IncomingServices_DifferentSiteBilling_Yasasiiweb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;
	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Title;
	@FindBy(xpath = "//li[normalize-space()='Miss']")
	public WebElement SelectMr;
	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement EnterFirstNME;
	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='age']")
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

	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement billSave;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printUnckeck;	

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;	

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other Information']")
	public WebElement insuranceInfo;

	@FindBy(xpath = "//label[normalize-space()='Misc Company Type']//span[@class='checkmark']")
	public WebElement Misctype;

	@FindBy(xpath = "//ki-select-control[@placeholder='Company Type']//input[@id='undefined']")
	public WebElement CompanyType;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement planNmae;	

	@FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-star-inserted ng-valid']")
	public WebElement ValidTo;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement ADDnew;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement ServiceName;	

	@FindBy(xpath = "//label[normalize-space()='Modules']")
	public WebElement modules;	

	@FindBy(xpath = "//div[@class='module-icon-wrap ng-star-inserted']//i[@class='ki ki-beaker']")
	public WebElement investigation;

	@FindBy(xpath = "//*[@id=\"id0\"]/div[2]/div/div[2]/div[3]/label/i")
	public WebElement incomingService;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement InvHamb;

	@FindBy(xpath = "//ki-select-control[@placeholder='Company Name']//input[@id='undefined']")
	public WebElement CompanyNmae;

	@FindBy(xpath="//input[@id='executionlocid']")
	public WebElement Executionloc;

	@FindBy(xpath="//button[@class='btn btn-primary active sm m0']")
	public WebElement ExecutionlocOK;

	@FindBy(xpath="//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement confirmOK;

	@FindBy(xpath="//input[@id='mrno']")
	public WebElement SearchField;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Search;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='incomastschemeid']//input[@id='undefined']")
	public WebElement Scheme;

	@FindBy(xpath = "//div[contains(text(),'Patient Info')]")
	public WebElement PatientInfo;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Orders;	

	@FindBy(xpath = "//div[@class='asideright-sub-container']//div[2]//div[1]//div[1]//div[1]//div[3]//div[2]//i[1]")
	public WebElement serviceDelete;

	@FindBy(xpath = "//div[@title='Availed Services']//div[@class='item-icon']")
	public WebElement AvailedService;

	@FindBy(xpath = "//i[@class='ki ki-search text-white']")
	public WebElement AvailedSearch;

	@FindBy(xpath = "//th[@class='ordered-site']")
	public WebElement Ordersite;

	@FindBy(xpath="//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath="//button[@id='updateregistrationbutton']//i[@class='ki ki-upload']")
	public WebElement Update;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement disgnosis;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//div[normalize-space()='CPOE Service']")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeServiceSearch;

	@FindBy(xpath = "//input[@id='cpoeSearchDb']")
	public WebElement CpoeServiceSearch1;

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EmrSave;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM']")
	public WebElement RCM;

	@FindBy(xpath = "//div[normalize-space()='Billing Message Master']")
	public WebElement BillingMessage;

	@FindBy(xpath = "//div[@class='col-md-3 mbl-pl0 mbl-pr-pl-0']//i[@title='Advanced Search']")
	public WebElement AdvanceSearch;

	@FindBy(xpath = "//label[@class='check-container ']")
	public WebElement CurrentEncounter;

	@FindBy(xpath = "//textarea[@id='messagepat']")
	public WebElement Message;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//a[@id='tab2-link']//span[contains(text(),'Billing Message View')]")
	public WebElement BillMessageView;

	@FindBy(xpath = "//div[@class='col-6 col-md-3']//input[@id='mrno']")
	public WebElement MrnoSearch;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='multisiteid']//input[@id='undefined']")
	public WebElement siteSelect;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;







	public void Patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo  ) throws InterruptedException, IOException, AWTException {

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
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastname);
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


		Organisation.click();
		Thread.sleep(800);
		Organisation.sendKeys("KIMS");
		Thread.sleep(800);
		

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
		EnterAadhar.sendKeys(DocID );
		Thread.sleep(600);
		Clickadd.click();
		Thread.sleep(800);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",emergencyContact );
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
	//	JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Add1 );
		Add1.click();
		Thread.sleep(600);
		
		
		
		
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",insuranceInfo );
		Thread.sleep(800);

		insuranceInfo.click();
		Thread.sleep(800);
		Misctype.click();
		Thread.sleep(800);
		CompanyType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='External Institution For Incoming']")).click();
		Thread.sleep(800);
		CompanyNmae.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Dube Medicals']")).click();
		Thread.sleep(800);

		planNmae.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(800);
//		ValidTo.click();
//		Thread.sleep(800);
//		for (int i = 0; i <=9; i++) {
//			t.keyPress(KeyEvent.VK_DOWN);
//			Thread.sleep(500);
//			t.keyRelease(KeyEvent.VK_DOWN);
//
//		}
//		Thread.sleep(1000);
//		t.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(500);
//		t.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
		insAdd.click();

	



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
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(signupload));
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

	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(billing));
		Thread.sleep(3000);

		///////////////encounter

		billing.click();
		Thread.sleep(1000);
		Service.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(1000);
		ADDnew.click();
		Thread.sleep(800);
		ServiceName.click();
		Thread.sleep(800);
		ServiceName.sendKeys("Electrolyte Panel");
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Electrolyte Panel']")).click();
		Thread.sleep(800);
		add.click();
		Thread.sleep(800);
		billSave.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")));
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		
		
		

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(46);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);



	}





	public void	BillingMessage(String DOCuser ,String DOCpassword, String Site , String MRNo) throws InterruptedException, AWTException, IOException {


		///Incoming service View - investigation

		Hamburger.click();
		Thread.sleep(800);
		modules.click();
		Thread.sleep(800);

		investigation.click();
		Thread.sleep(800);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
	//	Executionloc.click();
	//	Thread.sleep(2000);
	//	Executionloc.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='LEVEL 2 SAMPLE COLLECTION']")).click();
		Thread.sleep(1000);
		
		ExecutionlocOK.click();
		Thread.sleep(1000);
		
		Thread.sleep(800);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		
		
		
	//	confirmOK.click();
		Thread.sleep(3000);

		//Sample Collection

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));		
		wait.until(ExpectedConditions.elementToBeClickable(incomingService));
		Thread.sleep(800);
		incomingService.click();
		Thread.sleep(3000);

		InvHamb.click();
		Thread.sleep(800);
		modules.click();
		Thread.sleep(800);
		FO.click();
		Thread.sleep(800);
		Registration.click();
		Thread.sleep(800);

		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1000);

		Search.click();
		Thread.sleep(800);
		Search.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//label[@title='Clear']//i[@class='ki ki-close']")).click();
		Thread.sleep(2000);
		Scheme.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"droplistkey1\"]/li")).click();
		Thread.sleep(1000);

		encProvider.clear();
		Thread.sleep(800);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement21=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement21.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1000);
		
		///printUnckeck.click();
		//Thread.sleep(1000);
		billSave.click();
		Thread.sleep(1000);
		
		List<WebElement> dynamicElement211=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement211.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);


		Hamburger.click();
		Thread.sleep(1000);
		RCM.click();
		Thread.sleep(1000);
		BillingMessage.click();
		Thread.sleep(1000);
		AdvanceSearch.click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		Search.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(2000);

		CurrentEncounter.click();
		Thread.sleep(1000);
		Message.sendKeys("சேவை விலை இல்லாமல் வழங்கப்படுகிறது. வார்த்தைகள், சொற்றொடர்கள், இணையப் பக்கங்களைத் தமிழில் இருந்து 100க்கும் மேற்பட்ட");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		CurrentEncounter.click();
		Thread.sleep(1000);
		CurrentEncounter.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		billSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();	
		Thread.sleep(2000);
		BillMessageView.click();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-md-2']//i[@class='ki ki-search']")).click();
		Thread.sleep(3000);



	}

	public void DoctorNote(String DOCuser ,String DOCpassword , String MRNo,String Site) throws InterruptedException {





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

		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(DOCuser);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(DOCpassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(2000);

		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(1000);
		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dental Examination and Treatment']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(1000);

		disgnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(2000);

		///////cpoe Service	

		CpoeService.click();
		Thread.sleep(1000);
		CpoeServiceSearch.click();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Potassium (ISE Indirect)", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch.clear();//input[@id='cpoeSearchText']
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Basophils", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Basophils']")).click();
		Thread.sleep(2000);

		EmrSave.click();
		Thread.sleep(3000);


	}




	public void Billing_inTVM(String Site1,String MRNO) throws InterruptedException {



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

		userid.click();
		Thread.sleep(1000);
		userid.sendKeys("admin");
		password.click();
		Thread.sleep(1000);
		password.sendKeys("KAmeda123$");
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site1+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);


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

		Search.click();
		Thread.sleep(800);
		Search.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		Close.click();
		Thread.sleep(1000);



		PatientInfo.click();
		Thread.sleep(800);
		Edit.click();
		Thread.sleep(800);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));		
		wait.until(ExpectedConditions.elementToBeClickable(Update));
		Thread.sleep(800);
		Update.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();	
		Thread.sleep(2000);
		//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));		
		wait.until(ExpectedConditions.elementToBeClickable(billing));
		Thread.sleep(2000);
		billing.click();
		Thread.sleep(2000);
		Close.click();
		Thread.sleep(1000);


		Service.click();
		Thread.sleep(1000);
		siteSelect.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH Nagarcoil']")).click();	
		Thread.sleep(800);
		Orders.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='fa fa-square-o']")).click();	
		Thread.sleep(800);
		serviceDelete.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		billSave.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();	
		Thread.sleep(800);
		AvailedService.click();
		Thread.sleep(800);
		AvailedSearch.click();
		Thread.sleep(800);
		Ordersite.click();
		Thread.sleep(800);



	}

	public void Billing_inKollam(String Site2,String MRNO,String Provider1,String Provider) throws InterruptedException {



		Thread.sleep(1500);
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
		userid.sendKeys("admin");
		password.click();
		Thread.sleep(1000);
		password.sendKeys("KAmeda123$");
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site2+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);


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

		Search.click();
		Thread.sleep(800);
		Search.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);

		Close.click();
		Thread.sleep(1000);

		PatientInfo.click();
		Thread.sleep(1200);
		Edit.click();
		Thread.sleep(800);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));	
		wait.until(ExpectedConditions.elementToBeClickable(Update));
		Thread.sleep(1000);
		Update.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();	
		Thread.sleep(2000);	
		wait.until(ExpectedConditions.elementToBeClickable(billing));
		Thread.sleep(2000);
		billing.click();
		Thread.sleep(2000);
		Close.click();
		Thread.sleep(1000);
		Service.click();
		Thread.sleep(800);
		siteSelect.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH Nagarcoil']")).click();	
		Thread.sleep(800);
		Orders.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='fa fa-square-o']")).click();	
		Thread.sleep(800);
		billSave.click();
		Thread.sleep(1800);
		encProvider.click();
		Thread.sleep(800);
		encProvider.sendKeys(Provider1);
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider1+"']")).click();
		Thread.sleep(1000);
		billSave.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();	
		Thread.sleep(800);
		AvailedService.click();
		Thread.sleep(800);
		AvailedSearch.click();
		Thread.sleep(800);
		Ordersite.click();
		Thread.sleep(3000);



	}



}
