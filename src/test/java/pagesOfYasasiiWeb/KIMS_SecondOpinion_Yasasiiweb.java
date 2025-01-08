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

public class KIMS_SecondOpinion_Yasasiiweb extends PageFactoryInitYasasiiWeb{

	public KIMS_SecondOpinion_Yasasiiweb(WebDriver driver) {

		super(driver);

	}



	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//li[normalize-space()='Miss']")
	public WebElement SelectMr;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;

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

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement nationality;

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//i[@class='ki ki-info-circle-fill ng-star-inserted']")
	public WebElement EpisodeIcon;

	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//span[contains(text(),'Encounter')]")
	public WebElement Encounter;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;


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

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EmrSave;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//label[@class='icon nursenote']")
	public WebElement NurseNote;

	@FindBy(xpath="//button[normalize-space()='Check-In']")
	public WebElement Checkin;

	@FindBy(xpath="//input[@id='inchargeproviderid']")
	public WebElement visitList;

	@FindBy(xpath="//div[contains(text(),'Vital Signs and Measurement')]")
	public WebElement vitalSigns;

	@FindBy(xpath="//div[normalize-space()='Second Opinion']")
	public WebElement SecondOpinion;

	@FindBy(xpath="//label[@title='Doctors List']//i[@class='ki ki-doctor-fill']")
	public WebElement DoctorList;

	@FindBy(xpath="//input[@id='docsearch']")
	public WebElement DoctorSearch;

	@FindBy(xpath="//span[@class='btn btn-danger clear sm']")
	public WebElement close;

	@FindBy(xpath="//i[@class='fa fa-caret-right']")
	public WebElement visit;

	@FindBy(xpath="//textarea[@id='secondopinionremarkstxt']")
	public WebElement SecondOpinionText;

	@FindBy(xpath="//label[normalize-space()='Send']")
	public WebElement Send;

	@FindBy(xpath="//i[@title='Second opinion request']")
	public WebElement secondOpinionRequest;

	@FindBy(xpath="//div[contains(text(),'Risk Assessment')]")
	public WebElement RiskAssessment;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	@FindBy(xpath = "//input[@id='vital000']")
	public WebElement height;

	@FindBy(xpath = "//input[@id='vital010']")
	public WebElement weight;

	@FindBy(xpath = "//input[@id='vital040']")
	public WebElement Temperature;

	@FindBy(xpath = "//input[@id='vital060']")
	public WebElement pulse;


	@FindBy(xpath = "//form[@class='ng-untouched ng-valid ng-dirty']//i[@class='ki ki-notes ng-star-inserted']")
	public WebElement pulseRemarks;

	@FindBy(xpath = "//textarea[@id='modalremarks']")
	public WebElement pulseRemarkstext;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Referral']")
	public WebElement Referral;

	@FindBy(xpath = "//input[@id='rhtonamewithid']")
	public WebElement providername;

	@FindBy(xpath = "//input[@id='timeframeid']")
	public WebElement timeFrame;

	@FindBy(xpath = "//textarea[@id='reason']")
	public WebElement referralremarks;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='EMR']")
	public WebElement EMR;

	@FindBy(xpath = "//div[@class='col-md-12 ta-r rtl-right pr-0']//button[@type='button'][normalize-space()='Add']")
	public WebElement ReferralAdd;

	@FindBy(xpath = "//div[normalize-space()='File Request Approval']")
	public WebElement Filerequestapprove;

	@FindBy(xpath = "//input[@id='mrno']")
	public WebElement MRNOSearch;

	@FindBy(xpath = "//input[@id='statuschange']")
	public WebElement Status;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement UPdate;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement Search;

	@FindBy(xpath = "//div[@class='fi-title ml0 ng-star-inserted']")
	public WebElement Doclist;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement Searchicon;

	@FindBy(xpath = "//div[normalize-space()='File Request Approval']")
	public WebElement FileReqApproval;

	@FindBy(xpath = "//input[@id='statuschange']")
	public WebElement Status1;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;


	public void patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo) throws InterruptedException, AWTException, IOException {

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
		for (int i = 0; i <=15; i++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		EnterAadhar.sendKeys(DocID );
		Thread.sleep(600);
		Clickadd.click();
		Thread.sleep(800);


		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement1.size());
		if(dynamicElement1.size() ==0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}
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
	
		
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(15);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);


	}


	public void encounter( String Provider1) throws AWTException, InterruptedException {



		/////////Provider1		
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		//	printuncheck.click();
		//	Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(2000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);


		
	}



	public void docnote( String User , String Password , String MRNO ,String User1,String Provider1) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);
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
		Thread.sleep(1200);

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='My OP and IP']")).click();
		Thread.sleep(500);

		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2500);
		//SelectPatient.click();
		/*	Thread.sleep(5000);
		UpArrow.click();
		Thread.sleep(500);
		Lock.click(); */
		///////Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(2000);
		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(3000);


		vitalSigns.click();
		//driver.findElement(By.xpath("//input[@title='Test V']")).click();
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//label[@class='cat-type-label gen']//i[@class='ki ki-ellipsis-v']")).click();
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("/span[normalize-space()='Default View']")).click();
		//	Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@title='Risk']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@title='Show Favorites Only']//i[@class='ki ki-favourite-fill']")).click();
//		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//span[normalize-space()='Add new']")).click();
		//	Thread.sleep(1000);


		height.sendKeys("170");
		Thread.sleep(600);
		weight.sendKeys("90");
		Thread.sleep(600);
		Temperature.sendKeys("96");
		Thread.sleep(600);
		pulse.sendKeys("120");
		Thread.sleep(600);
//		pulseRemarks.click();
//		Thread.sleep(600);
//		pulseRemarkstext.click();
//		Thread.sleep(600);
//		pulseRemarkstext.sendKeys("pulseRemarkstext");
//		Thread.sleep(600);
//		driver.findElement(By.xpath("//div[@class='modal-footer ng-star-inserted']//i[@class='ki ki-check']")).click();
//		Thread.sleep(1000);

		///referral	

		Referral.click();
		Thread.sleep(600);
		providername.click();
		Thread.sleep(600);
		providername.sendKeys(SecondOpinionProviderID);
		Thread.sleep(600);
		driver.findElement(By.xpath("(//*[contains(text(),'"+SecondOpinionProviderID+"')])[1]")).click();
		timeFrame.click();
		driver.findElement(By.xpath("//li[normalize-space()='Within 1 Day']")).click();
		Thread.sleep(1000);

		referralremarks.click();
		Thread.sleep(600);
		referralremarks.sendKeys("referralremarks");
		Thread.sleep(600);
		ReferralAdd.click();
		Thread.sleep(600);

		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[contains(@title,'More')])[1]")));
		Thread.sleep(4000);



		//visit.click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[contains(@title,'More')])[1]")).click();
		Thread.sleep(2000);
		System.out.println(User1 +"-User1");
		System.out.println(User+"-User");
		SecondOpinion.click();
		Thread.sleep(1000);
		DoctorList.click();
		Thread.sleep(1000);

		///Adding doctor	

		DoctorSearch.click();
		Thread.sleep(1000);
		DoctorSearch.sendKeys(SecondOpinionProviderID);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'"+SecondOpinionProviderID+"')])[1]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='"+SecondOpinionProvider+"']")).click();
		Thread.sleep(1000);//li[normalize-space()='']
		//	driver.findElement(By.xpath("(//*[contains(text(),'"+User1+"')])[1]")).click();
		//	Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);

		//		///adding nurse
		//
		//		DoctorSearch.sendKeys("100413");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Mrs. Nadia Benaissa(100413)']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		//		Thread.sleep(1000);
		//
		//		//Adding non-md
		//
		//
		//		DoctorSearch.sendKeys("100416");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Miss. Estelle Emile Atallah(100416)']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		//		Thread.sleep(1000);

		close.click();
		Thread.sleep(1000);
		SecondOpinionText.click();
		Thread.sleep(1000);
		SecondOpinionText.sendKeys("Patient is in critical ststus...need ur opinion pls refer the reports");
		Thread.sleep(1000);
		Send.click();
		Thread.sleep(3000);


	}


	public void secondopinion( String User1 , String Password, String MRNO ) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(SecondOpinionProviderID);
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
		Thread.sleep(1200);

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='My Pending Task']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Second Opinion']")).click();
		Thread.sleep(2000);

		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2500);


		//	visit.click();
		//	Thread.sleep(500);
		secondOpinionRequest.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-emr-homescreen-shell[1]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]")).click();
		Thread.sleep(5000);
		//		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		Thread.sleep(2000);
		//		Hamburger.click();
		//		EMR.click();
		//		
		//		FileReqApproval.click();
		//		
		//		MRNOSearch.sendKeys(MRNO);
		//		Search.click();
		//		Status1.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//div[@class='col-md-2']//li[contains(text(),'Approved')]")).click();
		//		Thread.sleep(1000);
		//		UPdate.click();
		//		
		//		Hamburger.click();
		//		driver.findElement(By.xpath("//div[normalize-space()='EMR HomeScreen']")).click();
		//		Thread.sleep(1000);
		//		
		//		
		//		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//li[normalize-space()='My Pending Task']")).click();
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//li[normalize-space()='Second Opinion']")).click();
		//		Thread.sleep(2000);
		//
		//		EnterPatientName.sendKeys(MRNO);
		//		Thread.sleep(1500);
		//		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		//		Thread.sleep(2500);
		//
		//
		//		//	visit.click();
		//		//	Thread.sleep(500);
		//		secondOpinionRequest.click();
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]")).click();
		//		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);


	}



	public void fileReadRequest( String User , String Password , String MRNO) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);
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
		Thread.sleep(1200);


		MenuToggle.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		Filerequestapprove.click();
		Thread.sleep(1000);
		MRNOSearch.click();
		Thread.sleep(1000);
		MRNOSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		UPdate.click();
		Thread.sleep(3000);
		MRNOSearch.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-file-log info-icon hasloding']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);



	}


	public void secondopinion1( String User1 , String Password , String MRNO ) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(SecondOpinionProviderID);
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
		Thread.sleep(1200);

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='My Pending Task']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Second Opinion']")).click();
		Thread.sleep(2000);

		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2500);


		//	visit.click();
		//	Thread.sleep(500);
		secondOpinionRequest.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-emr-homescreen-shell[1]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]")).click();
		Thread.sleep(2000);


		SecondOpinionText.click();
		Thread.sleep(500);
		SecondOpinionText.sendKeys("SecondOpinionText");
		Thread.sleep(500);
		Send.click();
		Thread.sleep(3000);


	}


	public void secondopinion_Comments_View( String User , String Password ,  String MRNO ) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);
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
		Thread.sleep(1200);

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='My Pending Task']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Second Opinion']")).click();
		Thread.sleep(2000);

		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2500);


		//	visit.click();
		//	Thread.sleep(500);
		secondOpinionRequest.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-emr-homescreen-shell[1]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]")).click();
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView();",Doclist);
		Thread.sleep(3500);


	}



	public void ReferalEncounter( String AdminID , String Password ,  String MRNO ) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(AdminID);
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
		Thread.sleep(1200);

		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		Searchicon.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(500);

		Checkin.click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(2000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(1000);

	}


	public void ReferalDoctor( String User1 , String Password , String MRNO ) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(SecondOpinionProviderID);
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
		Thread.sleep(1200);


		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2500);



	}






}