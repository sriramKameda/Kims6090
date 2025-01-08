package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class KIMS_DialysisNote_YasasiiWeb  extends PageFactoryInitYasasiiWeb{

	public KIMS_DialysisNote_YasasiiWeb(WebDriver driver) {

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
	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
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

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printUnckeck;

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;



	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site1;

	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Search;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//button[@class='icon nursenote']")
	public WebElement nurseNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement cpoeSearch;

	@FindBy(xpath = "//button[@class='icon-btn btn-dark-green inline min-clear-btm']//i[@class='ki ki-plus']")
	public WebElement Plus;

	@FindBy(xpath = "//button[@id='orderdetails_add']")
	public WebElement Add;

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EmrSave;

	@FindBy(xpath = "//i[@class='ki ki-plus-circle']")
	public WebElement DialysisNote;

	@FindBy(xpath = "//ki-calender-time//input[@type='text']")
	public WebElement ExcTime;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[2]/div[4]/ki-select-control[1]/div[1]/input[1]")
	public WebElement hptltype;

	@FindBy(xpath = "//div[4]//div[1]//label[1]//span[2]")
	public WebElement diabetic;

	@FindBy(xpath = "//span[normalize-space()='Permcath']")
	public WebElement permath;

	@FindBy(xpath = "//span[normalize-space()='Jugular/Subcl Catheter']")
	public WebElement jagular;

	@FindBy(xpath = "(//span[@class='checkmark'])[7]")
	public WebElement starttymcheck;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/ki-time-picker[1]/div[1]/input[1]")
	public WebElement starttym;

	@FindBy(xpath = "//button[@aria-label='Minus a hour']//span[@class='owl-dt-control-button-content']//*[name()='svg']")
	public WebElement minusHour;

	@FindBy(xpath = "//span[normalize-space()='Set']")
	public WebElement Set;

	@FindBy(xpath = "(//span[@class='checkmark'])[8]")
	public WebElement endtymcheck;

	@FindBy(xpath = "//div[@class='sectioncontainer']//div[2]//div[2]//div[4]//ki-time-picker[1]//div[1]//input[1]")
	public WebElement endtym;

	@FindBy(xpath = "//span[normalize-space()='Current Time']")
	public WebElement currentTym;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[7]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement assesmentdoc;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/div[4]/div[2]/div[1]/div[1]/div[3]/label[3]/span[2]")
	public WebElement Headache;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tubesReused;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/div[2]/div[2]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement dialyserUsed;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement machineNo;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/div[2]/div[4]/div[1]/label[1]/span[2]")
	public WebElement DialyserDiscarded;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[9]/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement lastpostwt;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[9]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement prediawt;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[9]/div[1]/div[3]/div[2]/div[3]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement PostdiaWt;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[9]/div[1]/div[3]/div[2]/div[4]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement removedfluid;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[10]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement comment;

	@FindBy(xpath = "//button[@class='btn btn-primary sm ml15 ng-star-inserted']//i[@class='ki ki-plus icon-plus']")
	public WebElement DialysisAdd;

	@FindBy(xpath = "//div[@class='col-md-12']//div[1]//div[1]//div[2]//label[3]//i[1]")
	public WebElement DownArrow;

	@FindBy(xpath = "//i[@class='ki ki-eye']")
	public WebElement Eye;

	@FindBy(xpath = "//i[@class='fa fa-caret-right']")
	public WebElement Rightkey;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-emr-homescreen-shell[1]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]")
	public WebElement dialysisnote;

	@FindBy(xpath = "//div[@class='child-list-group']//div[1]//div[1]//div[2]//div[1]//div[4]//div[1]//div[6]//label[1]//i[1]")
	public WebElement more;

	@FindBy(xpath = "//div[normalize-space()='Edit']")
	public WebElement edit;

	@FindBy(xpath = "//label[@class='table-action-icons']//i[@class='ki ki-edit-log']")
	public WebElement logindv;

	@FindBy(xpath = "//span[@class='btn btn-danger sm clear']")
	public WebElement close;

	@FindBy(xpath = "(//i[@class='ki ki-edit-log'])[1]")
	public WebElement logoveall;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement noteEdit;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement update;

	@FindBy(xpath = "//div[@class='dialysis-table relative']//div[1]//div[1]//div[3]//label[2]//i[1]")
	public WebElement Delete;

	@FindBy(xpath = "//textarea[@id='deletedreason']")
	public WebElement deleteReason;

	@FindBy(xpath = "//span[@class='btn btn-primary sm active']")
	public WebElement ReasonSave;

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle pro-pic tab-prof-wrap']")
	public WebElement username;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
	public WebElement logout;

	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement logoutConfirm;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;





	public void PatReg(String title, String Name, String lastname, String Dob, String DocID, String MobNo,String Address, String MRNo) throws InterruptedException, IOException, AWTException {

		Thread.sleep(700);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click(); 
		Thread.sleep(700);
		Registration.click();
		Thread.sleep(500);
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement.size() != 0) {
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"))
			.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(700);

		Title.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='" + title + "']")).click();
		Thread.sleep(500);
		EnterFirstNME.sendKeys(Name);
		Thread.sleep(500);
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastname);
		Thread.sleep(500);

		EnterAge.click();
		Thread.sleep(500);

		Robot t = new Robot();
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
		Thread.sleep(700);
		EnterAddress.sendKeys(Address);
		Thread.sleep(700);
		DocumentIdentification.click();
		Thread.sleep(700);
		for (int i = 0; i <= 15; i++) {
			EnterAadhar.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(700);
		EnterAadhar.sendKeys(DocID);
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



		List<WebElement> dynamicElement1 = driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement1.size());
		if (dynamicElement1.size() == 0) {
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}

		HowDidYouKnow.click();
		Thread.sleep(600);
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		Save.click();

		
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
		
		

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(billing));
		Thread.sleep(3000);

		/////////////// encounter

		billing.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + Provider + "']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1500);
		// printUnckeck.click();
		// Thread.sleep(700);
		billSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		String mrno = driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src = new File(Excelfilepath);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration = wb.getSheetAt(36);
		int i = BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		Thread.sleep(2000);
	}


	public void DialysisNote( String MRNO,String Service) throws InterruptedException {


				((JavascriptExecutor)driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
				int Windowsize =driver.getWindowHandles().size();
				int windowopen= Windowsize-1;
		
				driver.switchTo().window(tabs.get(windowopen));
				driver.switchTo().window(tabs.get(windowopen));
				Thread.sleep(2000);
				driver.get(URL);
				Thread.sleep(1000);
		
				Thread.sleep(2000);
				userid.click();
				Thread.sleep(700);
				userid.sendKeys(ProviderID);
				Thread.sleep(700);
				password.click();
				Thread.sleep(700);
				password.sendKeys(Password);
				Thread.sleep(700);
				Site1.click();
				Thread.sleep(700);
				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		
				driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
				Thread.sleep(700);
				driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
				Thread.sleep(2000);
		
		
			//	Hamberger.click();
				Thread.sleep(700);
				
				Search.clear();                                                      
				Thread.sleep(700);
				Search.sendKeys(MRNO);
				Thread.sleep(700);
				driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
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
				Thread.sleep(2700);
				cpoeService.click();
				Thread.sleep(700);
				cpoeSearch.clear();
				Thread.sleep(700);
				cpoeSearch.sendKeys(Service,Keys.ENTER);
				Thread.sleep(700);
				driver.findElement(By.xpath("//label[normalize-space()='"+Service+"']")).click();
				Thread.sleep(700);
//				
//				Thread.sleep(700);
//				List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[@class='icon-btn btn-dark-green inline min-clear-btm']//i[@class='ki ki-plus']"));
//		
//				if(dynamicElement1.size() !=0)
//				{
//					Plus.click();
//					Thread.sleep(700);
//				}
//				Thread.sleep(800); 

//				Add.click();
				Thread.sleep(700);
				EmrSave.click();
				Thread.sleep(3000);


		/////////logout

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(username));

		Thread.sleep(2000);
		username.click();
		Thread.sleep(2000);
		logout.click();
		Thread.sleep(2000);
		logoutConfirm.click();

		////////login
		Thread.sleep(2000);
		userid.click();
		userid.sendKeys(NurseID);    
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site1.click();

	//	JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);



		Search.clear();                                                      
		Thread.sleep(700);
		Search.sendKeys(MRNO);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(700);

		nurseNote.click();
		Thread.sleep(700);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 

		Thread.sleep(700);
		Template.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Dialysis Note']")).click();
		Thread.sleep(700);
		TemplateOK.click();
		Thread.sleep(3000);
		DialysisNote.click();
		Thread.sleep(700);
		ExcTime.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(700);
		hptltype.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Done from Inside']")).click();
		Thread.sleep(700);
		diabetic.click();
		Thread.sleep(700);
		permath.click();
		Thread.sleep(700);
		jagular.click();
		Thread.sleep(700);
		starttymcheck.click();
		Thread.sleep(700);
		starttym.click();
		Thread.sleep(700);
		minusHour.click();
		Thread.sleep(700);
		minusHour.click();
		Thread.sleep(700);
		Set.click();
		Thread.sleep(700);
		endtymcheck.click();
		Thread.sleep(700);
		endtym.click();
		Thread.sleep(700);
		currentTym.click();
		Thread.sleep(700);
		assesmentdoc.click();
		Thread.sleep(700);
		assesmentdoc.sendKeys("patient is normal");
		Thread.sleep(700);
		Headache.click();
		Thread.sleep(700);
		tubesReused.click();
		Thread.sleep(700);
		tubesReused.sendKeys("2");
		Thread.sleep(700);
		dialyserUsed.click();
		Thread.sleep(700);
		dialyserUsed.sendKeys("2");
		Thread.sleep(700);
		machineNo.click();
		Thread.sleep(700);
		machineNo.sendKeys("2");
		Thread.sleep(700);


		DialyserDiscarded.click();
		Thread.sleep(700);

		lastpostwt.click();
		Thread.sleep(700);
		lastpostwt.sendKeys("48");
		Thread.sleep(700);
		prediawt.click(); 
		Thread.sleep(700);
		prediawt.sendKeys("46");
		Thread.sleep(700);
		PostdiaWt.click();
		PostdiaWt.sendKeys("48");
		Thread.sleep(700);
		removedfluid.click();
		Thread.sleep(700);
		removedfluid.sendKeys("1");
		Thread.sleep(700);
		comment.click();
		Thread.sleep(700);
		comment.sendKeys("patient need medication");
		Thread.sleep(700);
		DialysisAdd.click();
		Thread.sleep(700);
		//DownArrow.click();
		//Thread.sleep(700);
		Eye.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']//i[@class='ki ki-close-circle']")).click();
		Thread.sleep(700);
		EmrSave.click();
		Thread.sleep(3000);


		wait.until(ExpectedConditions.visibilityOf(Rightkey));
		Thread.sleep(2000);


		Rightkey.click();
		Thread.sleep(700);
		dialysisnote.click();
		Thread.sleep(2000);
		more.click();
		Thread.sleep(700);
		edit.click();
		Thread.sleep(2000);

		//	DownArrow.click();
		Thread.sleep(700);
		logindv.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(700);
		logoveall.click();
		Thread.sleep(700);
		close.click();
		Thread.sleep(700);
		noteEdit.click();
		Thread.sleep(2000);
		update.click();
		Thread.sleep(2000);
		EmrSave.click();
		Thread.sleep(2000);
		Rightkey.click();
		Thread.sleep(700);
		dialysisnote.click();
		Thread.sleep(2000);
		more.click();
		Thread.sleep(700);
		edit.click();
		Thread.sleep(700);
		DialysisNote.click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='btn btn-primary sm'][normalize-space()='OK']//i[@class='ki ki-check']")).click();
		Thread.sleep(700);
		ExcTime.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(700);
		hptltype.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Done from Inside']")).click();
		Thread.sleep(700);
		diabetic.click();
		Thread.sleep(700);
		permath.click();
		Thread.sleep(700);
		jagular.click();
		Thread.sleep(700);
		starttymcheck.click();
		Thread.sleep(700);
		starttym.click();
		Thread.sleep(700);
		minusHour.click();
		Thread.sleep(700);
		minusHour.click();
		Thread.sleep(700);
		Set.click();
		Thread.sleep(700);
		DialysisAdd.click();
		Thread.sleep(1500);

	//	DownArrow.click();
		Thread.sleep(700);
		Eye.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(700);
		Delete.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(700);	
		
//		deleteReason.click();
//		Thread.sleep(700);
//		deleteReason.sendKeys("test note");
//		Thread.sleep(700);
//		ReasonSave.click();
		Thread.sleep(700);
		EmrSave.click();
		Thread.sleep(2000);




	}




}






