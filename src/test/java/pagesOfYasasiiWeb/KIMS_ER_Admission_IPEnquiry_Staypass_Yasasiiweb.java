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

public class KIMS_ER_Admission_IPEnquiry_Staypass_Yasasiiweb extends PageFactoryInitYasasiiWeb{

	public KIMS_ER_Admission_IPEnquiry_Staypass_Yasasiiweb(WebDriver driver) {

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

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	
	
	@FindBy(xpath = "//input[@id='admittedproviderdisplayname']")
	public WebElement EnterProviderName;
	@FindBy(xpath = "//li[contains(text(),'Thomas')]")
	public WebElement SelectProviderName;
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;
	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPriority;
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement BedCategory;
	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement SelectBedCategory;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectRoomType;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBed;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSAve;

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

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;


	////Nurse note

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

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//button[@class='icon nursenote']")
	public WebElement NurseNote;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeSearch;

	@FindBy(xpath = "//label[@class='d-icons']//i[@title='Information']")
	public WebElement ServiceInformation;

	@FindBy(xpath = "//span[@class='btn btn-danger sm clear']")
	public WebElement Close;

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EMRSave;

	@FindBy(xpath = "//i[@class='ki ki-plus-circle-fill ng-star-inserted']")
	public WebElement ERIcon;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='EMR']")
	public WebElement EMR;

	@FindBy(xpath = "//div[normalize-space()='White Board']")
	public WebElement WhiteBoard;

	@FindBy(xpath = "//input[@id='wb']")
	public WebElement WBSelect;

	@FindBy(xpath = "//div[contains(text(),'Patient Info')]")
	public WebElement patientInfo;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement edit;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADTinfo;

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement threedot;

	@FindBy(xpath = "//label[@class='text-ellipsis blink-bg color-info']")
	public WebElement StatProcedure;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[6]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement NameSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOSearchField;

	@FindBy(xpath = "//div[contains(text(),'Transfer to IP')]")
	public WebElement TransferToIP;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='ADT']")
	public WebElement ADT1;

	@FindBy(xpath = "//div[normalize-space()='IP Enquiry']")
	public WebElement IPEnquiry;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]")
	public WebElement Bedinfo;

	@FindBy(xpath = "//button[@id='updateregistrationbutton']")
	public WebElement update;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAve;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-global-modal-shell[1]/div[2]/div[1]/div[1]/div[2]/lib-room-booking[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOsearch;

	@FindBy(xpath = "//i[@title='Color indication']")
	public WebElement Colorind;

	@FindBy(xpath = "//i[@title='Large View']")
	public WebElement largeView;

	@FindBy(xpath = "//button[@title='Search']//i[@class='ki ki-search']")
	public WebElement BedSearch;

	@FindBy(xpath = "//i[@title='Filter by Room status']")
	public WebElement Filter;

	@FindBy(xpath = "//div[text()='Room/Bed Status']")
	public WebElement Room_BedStatus;

	@FindBy(xpath = "//input[@id='bedname']")
	public WebElement Bedname;

	@FindBy(xpath = "//input[@id='newstatus']")
	public WebElement NewStatus;

	@FindBy(xpath = "//div[@id='globalmodalshell_roombedstatussave']")
	public WebElement RoomStatus_Save;

	@FindBy(xpath = "//span[@id='global_modal_close_button']")
	public WebElement close;

	@FindBy(xpath = "//div[normalize-space()='Stay Pass']")
	public WebElement StayPass;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-global-modal-shell[1]/div[2]/div[1]/div[1]/div[2]/app-pat-staypass[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOsearch1;

	@FindBy(xpath = "//span[@id='staypassprint']")
	public WebElement Staypass_print;

	@FindBy(xpath = "//span[normalize-space()='Bed Status']")
	public WebElement BedStatus;

	@FindBy(xpath = "//input[@id='sblock']")
	public WebElement Blocks;

	@FindBy(xpath = "(//i[@title='Print'])[1]")
	public WebElement Stay_passReprint;

	@FindBy(xpath = "//input[@id='sfloor']")
	public WebElement Floor;

	@FindBy(xpath = "//button[@title='Search']")
	public WebElement BedSearch1;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF126']")
	public WebElement AccompaniedBy;

	@FindBy(xpath = "//button[@class='btn btn-primary sm active mr10']")
	public WebElement pieView;

	@FindBy(xpath = "//tbody/tr[3]/td[3]/i[1]")
	public WebElement inuse;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF152']")
	public WebElement TriagePriority;


	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;


	public void Patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo ) throws InterruptedException, IOException, AWTException {

		///////////////////Patient registration

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

		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement1.size());
		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}

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
		ERmob.sendKeys("9845123658");
		Thread.sleep(600);
	//	JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Add1 );
		Add1.click();
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
		


		///////////////encounter

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='ki ki-reception-fill']")));
	
		Thread.sleep(2000);
		
		
		billing.click();
		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		encProvider.sendKeys(ERProvider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+ERProvider+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		//printUnckeck.click();
		//Thread.sleep(1000);
		billSave.click();
		Thread.sleep(1000);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'][normalize-space()='OK'])[1]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='OK'])[1]")).click();
		Thread.sleep(2000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);


		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(33);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000); 

	}


	public void ER_Admission() throws InterruptedException {

		Thread.sleep(700);
		ADT.click();
		Thread.sleep(1600);
		
		EnterProviderName.clear();
		Thread.sleep(700);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		Thread.sleep(1000);
		
		
		RoomType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'ER_Exclusive')])[1]")).click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'Emergency care')])[1]")).click();
		Thread.sleep(1000);
		SAve.click();
		Thread.sleep(2000);

		List<WebElement> dynamicElement1111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if(dynamicElement1111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Close')][normalize-space()='No']")).click();
		//	Thread.sleep(2000);



	}


	public void NurseNote( String MRNo ) throws InterruptedException, AWTException{

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
		userid.sendKeys(NurseID);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);



		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);

		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='ER']")).click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);

		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(5000);
		/*	UParrow.click();
		Thread.sleep(2000);
		Lock.click();
		Thread.sleep(1000);*/

		///nursenote	
		NurseNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}


//		Thread.sleep(1000);
//		Template.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Nurse Note -OP']")).click();
//		Thread.sleep(1000);
//		TemplateOK.click();
//		Thread.sleep(2000);
//
//		CpoeService.click();
//
//		CpoeSearch.sendKeys("Platelet Count", Keys.ENTER);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//label[normalize-space()='Platelet Count']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@id='orderdetails_add']")).click();
//		Thread.sleep(1000);
//		
//		
//		
//		
//		ServiceInformation.click();
//		Thread.sleep(1000);
//		Close.click();
//		Thread.sleep(1000);
//		EMRSave.click();
//		Thread.sleep(3000);
//		ERIcon.click();
//
//		NurseNote.click();
//		Thread.sleep(1000);
//		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
//
//		if(dynamicElement1.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
//		}


		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Triage Template']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Trolley']")).click();
		Thread.sleep(1000);

		AccompaniedBy.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Public']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//label[@title='Not Assessed']//span[@class='checkmark']")).click();
		Thread.sleep(1000);

		TriagePriority.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Level 5']")).click();
		Thread.sleep(1000);
		EMRSave.click();



		Thread.sleep(3000);
		Hamburger.click();
		Thread.sleep(2000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
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


		WBSelect.click();
		driver.findElement(By.xpath("//li[normalize-space()='ER White Board']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(2000);


		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);

//		js.executeScript("arguments[0].scrollIntoView();", StatProcedure);
//		Thread.sleep(2000);
//		act.moveToElement(StatProcedure).click().build().perform();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
//		Thread.sleep(2000);



	}


	public void TransferToIP(String Admin , String AdminPassword,String MRNo,String MobileNO ,String Address ,String DocID) throws InterruptedException, AWTException, IOException {


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
		userid.sendKeys(Admin);
		password.click();
		password.sendKeys(AdminPassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

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


		FOSearchField.click();
		Thread.sleep(1000);
		FOSearchField.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);

		Thread.sleep(500);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);


		///Registering as normal


		patientInfo.click();
		Thread.sleep(1000);
		edit.click();


		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement11.size());
		if(dynamicElement11.size() ==0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}

		EnterMob.click();
		Thread.sleep(700);
		EnterMob.sendKeys(MobileNO);
		Thread.sleep(700);
		Organisation.click();
		Thread.sleep(700);
		Organisation.sendKeys("Allianz");
		Thread.sleep(700);
		//driver.findElement(By.xpath("//li[normalize-space()='Allianz']")).click();
		Thread.sleep(700);
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



		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement111.size());
		if(dynamicElement111.size() ==0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}

		HowDidYouKnow.click();
		Thread.sleep(600);
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		update.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(700);


		ADTinfo.click();
		Thread.sleep(600);

		String badname  = Bedinfo.getText();
		System.out.println(badname);
		Thread.sleep(600);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(33);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(15).setCellValue(badname);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000); 


		threedot.click();
		Thread.sleep(600);
		TransferToIP.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();

		Thread.sleep(1500);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);
		{

			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		BedCategory.click();
		Thread.sleep(1000);
		SelectBedCategory.click();
		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Ultra-Deluxe')])")).click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[2]")).click();
		Thread.sleep(700);
		SAve.click();
		Thread.sleep(2000);

		List<WebElement> dynamicElement1111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if(dynamicElement1111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);




	}



	public void ADT(String badname , String MRNo) throws InterruptedException, AWTException	{



		/////IP Enquiry

		Hamburger.click();
		Thread.sleep(1200);
		
	//	WebElement element = driver.findElement(By.xpath("//div[@class='link-value'][normalize-space()='ADT']"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ADT1);
		
		Thread.sleep(800);
		ADT1.click();
		Thread.sleep(800);
		IPEnquiry.click();
		Thread.sleep(800);

		List<WebElement> dynamicElement5=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement5.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);


		MRNOsearch.sendKeys(MRNo);
		Thread.sleep(800);
		BedSearch.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-patient-bed-fill rest']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(700);
		largeView.click();
		Thread.sleep(800);
		Colorind.click();
		Thread.sleep(800);
		Filter.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='filter-icon-roomstatus relative']//label[@class='check-container'][normalize-space()='All']//span[@class='checkmark']")).click();
		Thread.sleep(700);
		close.click();
		Thread.sleep(700);


		////Room bed Status

		Hamburger.click();
		Thread.sleep(800);
		Room_BedStatus.click();
		Thread.sleep(800);

		////		Thread.sleep(500);
		////		List<WebElement> dynamicElement6=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		////
		////		if(dynamicElement6.size() !=0)
		////		{
		////			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		////		}
		////
		////
		////		else {
		////			System.out.println("sri");
		////		}
		////		Thread.sleep(1000);
		//
		//		Bedname.click();
		//		Thread.sleep(800);
		//		Bedname.sendKeys(badname , Keys.ENTER);
		//		Thread.sleep(2000);
		//		Bedname.sendKeys(Keys.ENTER);
		//		Thread.sleep(2000);
		//		
		//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-global-modal-shell[1]/div[2]/div[1]/div[1]/div[2]/app-roombed-status[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/form[1]/div[1]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")));
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-global-modal-shell[1]/div[2]/div[1]/div[1]/div[2]/app-roombed-status[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/form[1]/div[1]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		//		Thread.sleep(700);
		//		NewStatus.click();
		//		Thread.sleep(800);
		//		driver.findElement(By.xpath("//li[normalize-space()='Release']")).click();
		//		Thread.sleep(700);
		//		RoomStatus_Save.click();
		//		Thread.sleep(2000);

		BedStatus.click();
		Thread.sleep(700);
		Blocks.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='A1 Block']")).click();
		Thread.sleep(700);
		Floor.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Ground floor']")).click();
		Thread.sleep(700);
		BedSearch1.click();
		Thread.sleep(700);
		inuse.click();
		Thread.sleep(700);
		pieView.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(800);


		////Staypass



		Hamburger.click();
		Thread.sleep(800);
		StayPass.click();
		Thread.sleep(800);

		Thread.sleep(500);
		List<WebElement> dynamicElement7=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement7.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);


		MRNOsearch1.sendKeys(MRNo,Keys.ENTER);
		Thread.sleep(800);

//		Staypass_print.click();
//		Robot t=new Robot();
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(400);
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(800);

//		Stay_passReprint.click();
//		Thread.sleep(800);
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(400);
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(800);
		close.click();
		Thread.sleep(800);



	}


}
