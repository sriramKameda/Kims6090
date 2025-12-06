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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_Diagnosis_LogView_YasasiiWeb extends PageFactoryInitYasasiiWeb {

	public KIMS_Diagnosis_LogView_YasasiiWeb(WebDriver driver) {
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

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement Diagnosis;

	@FindBy(xpath = "//div[normalize-space()='Add Note']")
	public WebElement AddNote;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-diagnosis-template[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Onset;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-diagnosis-template[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[2]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement duration;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-diagnosis-template[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[3]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement Remarks;

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EMRSave;

	@FindBy(xpath = "//span//i[@class='ki ki-chevron-down']")
	public WebElement ActiveProblems;

	@FindBy(xpath = "//div[contains(text(),'Active Problems')]")
	public WebElement ActiveProblems2;

	@FindBy(xpath = "//button[@class='btn btn-danger sm clear']")
	public WebElement Close;

	@FindBy(xpath = "//label[contains(text(),'Problems')]")
	public WebElement Problems;

	@FindBy(xpath = "//div[@class='hsc-md-header']//span[contains(text(),'Active Problems')]//i[@class='ki ki-chevron-down']")
	public WebElement DownArrow;

	@FindBy(xpath = "//div[@class='modal-footer']//button[@class='btn btn-danger sm clear'][normalize-space()='Close']")
	public WebElement Close1;

	@FindBy(xpath = "//div[normalize-space()='Active Problems']")
	public WebElement ActiveProblems1;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement templatelog;

	@FindBy(xpath = "//i[@title='More']")
	public WebElement More;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;







	public void Patreg(String title, String Name, String lastname, String Dob, String DocID, String MobNo,String Address, String MRNo,  String ADTprovider)	throws InterruptedException, IOException, AWTException {

		/////////////////// Register a female patient
		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click(); 
		Thread.sleep(1000);
		Registration.click();
		Thread.sleep(500);
		List<WebElement> dynamicElement = driver
				.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement.size() != 0) {
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"))
			.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

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
		Thread.sleep(1000);
		EnterAddress.sendKeys(Address);
		Thread.sleep(1000);
		DocumentIdentification.click();
		Thread.sleep(1000);
		for (int i = 0; i <= 15; i++) {
			EnterAadhar.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
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
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@id='consentsave']//i[@class='ki ki-save']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1600);
		
		
		
		

		/////////////// encounter

		//	billing.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + Provider + "']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		// printUnckeck.click();
		// Thread.sleep(1000);
		billSave.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);


		String mrno = driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src = new File(Excelfilepath);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration = wb.getSheetAt(4);
		int i = BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		Thread.sleep(2000);


	}

	public void DoctorNote(String DOCuser, String DOCpassword, String MRNo, String ADTProvider)throws InterruptedException, AWTException, IOException {

		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize = driver.getWindowHandles().size();
		int windowopen = Windowsize - 1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']"))
		// );
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo + "')])[1]")).click();
		Thread.sleep(1000);

		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1 = driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if (dynamicElement1.size() != 0) {
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(700);
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
		Thread.sleep(2000);

		Diagnosis.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@title='Abnormal blood-gas level']")).click();
		Thread.sleep(1000);

		//		driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[2]")).click();
		//		Thread.sleep(1000);
		//
		//		AddNote.click();
		//		Thread.sleep(700);
		//		Onset.sendKeys("5");
		//		Thread.sleep(700);
		//		duration.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='Days']")).click();
		//		Thread.sleep(1000);
		//		Remarks.sendKeys("Adda247 provides you best compilation of Sports Current Affairs & News. Sports Current Affairs includes National and International sports and tournaments, and awards related to cricket, football, tennis, and other sports. This article covers all the important Current Affairs related to Sports News & Events. Sports Current Affairs");
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//div[@class='modal-footer ng-star-inserted']//button[1]")).click();
		//		Thread.sleep(1000);

		EMRSave.click();
		Thread.sleep(3000);

		ActiveProblems.click();
		Thread.sleep(700);
		ActiveProblems1.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("(//i[@title='Log'])[1]")).click();
		Thread.sleep(3000);
		Close.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@title='Log'])[2]")).click();
		Thread.sleep(3000);
		Close.click();
		Thread.sleep(1700);

		Problems.click();
		Thread.sleep(2000);
		DownArrow.click();
		Thread.sleep(2000);
		ActiveProblems2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@title='Log'])[3]")).click();
		Thread.sleep(3000);
		Close1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@title='Log'])[4]")).click();
		Thread.sleep(3000);

		//		 
		//		  act.moveToElement(templatelog).click().build().perform(); Thread.sleep(3000);

		Close1.click();
		Thread.sleep(1000);
		Close.click();
		Thread.sleep(1000);

		////Edit Diagnosis

		More.click();
		driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
		Thread.sleep(3000);

		Diagnosis.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("(//div[@class='item-label-action ng-star-inserted'][normalize-space()='Set as Primary'])[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//div[@class='item-label-action ng-star-inserted'][normalize-space()='Mark as Final'])[2]")).click();
		Thread.sleep(1000);
		EMRSave.click();
		Thread.sleep(3000);

		ActiveProblems.click();
		Thread.sleep(700);
		ActiveProblems1.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("(//i[@title='Log'])[1]")).click();
		Thread.sleep(3000);
		Close.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@title='Log'])[2]")).click();
		Thread.sleep(3000);
		Close.click();
		Thread.sleep(1700);

		Problems.click();
		Thread.sleep(2000);
		DownArrow.click();
		Thread.sleep(2000);
		ActiveProblems2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@title='Log'])[3]")).click();
		Thread.sleep(3000);
		Close1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@title='Log'])[4]")).click();
		Thread.sleep(3000);

		Close1.click();
		Thread.sleep(1000);
		Close.click();
		Thread.sleep(1000);


	}

}
