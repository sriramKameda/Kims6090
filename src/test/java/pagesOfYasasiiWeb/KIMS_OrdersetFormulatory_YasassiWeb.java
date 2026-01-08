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

public class KIMS_OrdersetFormulatory_YasassiWeb  extends  PageFactoryInitYasasiiWeb {
	public KIMS_OrdersetFormulatory_YasassiWeb (WebDriver driver) {
		super(driver);
	}



	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement search;

	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement hamberger;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='EMR']")
	public WebElement EMR;

	@FindBy(xpath="//div[normalize-space()='Order Set']")
	public WebElement Orderset;

	@FindBy(xpath="//input[@id='name']")
	public WebElement OrdersetNAme;

	@FindBy(xpath="//button[normalize-space()='Add Order']")
	public WebElement AddOrder;

	@FindBy(xpath="//input[@id='displaytext']")
	public WebElement medicineName;

	@FindBy(xpath="//textarea[@id='description']")
	public WebElement comments;

	@FindBy(xpath="//button[@title='Add Recommend Dose Here']")
	public WebElement RecommendDose;

	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath="//button[@id='updatePharmacy']")
	public WebElement recomAdd;

	@FindBy(xpath="//button[normalize-space()='Add and Continue']")
	public WebElement AddContinue;


	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement Save;

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath="//i[@class='ki ki-cog']")
	public WebElement master;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='Pharmacy']")
	public WebElement pharmacy;

	@FindBy(xpath="//div[normalize-space()='Formulary Master']")
	public WebElement formulatorymaster;

	@FindBy(xpath="//tr[contains(@class,'ng-star-inserted')]//i[contains(@class,'ki ki-file')]")
	public WebElement siteview;

	@FindBy(xpath="//button[@id='saveSite']")
	public WebElement SaveSite;

	@FindBy(xpath="//div[normalize-space()='EMR HomeScreen']")
	public WebElement Homescreen;

	@FindBy(xpath="//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template1;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//label[normalize-space()='CPOE Orderset']")
	public WebElement cpoeOrderSet;

	@FindBy(xpath = "//div[@class='btn-pharmacy-search custom-search']//input[@placeholder='Search With Favorites']")
	public WebElement medicineSearch;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosis;

	@FindBy(xpath = "//button[@id='ordersetAdd']")
	public WebElement AddOrderset;


	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement duration;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-cpoe-diagnosis-list[1]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement DiagnosisCheckbox;

	@FindBy(xpath = "//button[normalize-space()='Ok']")
	public WebElement formulatoryblockOK;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-orderset-container[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ordersetSearch;

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement delete;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok']")
	public WebElement yes;


	@FindBy(xpath = "//label[normalize-space()='Service']//span[@class='checkmark']")
	public WebElement Service;

	@FindBy(xpath = "//input[@id='displaytext']")
	public WebElement Servicename;

	@FindBy(xpath = "//i[@class='ki ki-edit-log']")
	public WebElement ViewOrdersetDetails;

	@FindBy(xpath = "//button[@class='btn btn-dark-green active mob-mb5']")
	public WebElement Add;

	@FindBy(xpath = "//label[normalize-space()='Applicable To Me']")
	public WebElement ApplicableToMe;

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement orderingReason;

	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement Justification;

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
	public WebElement Savereg;
	
	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	


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

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Servicebilling;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement Addnew;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement AddService;///i[@class='ki ki-plus']


	@FindBy(xpath = "//i[@class='ki ki-cash-transfer-fill']")
	public WebElement AvailedService;

	@FindBy(xpath = "//label[normalize-space()='IP']//span[@class='checkmark']")
	public WebElement IP;

	@FindBy(xpath = "//i[@class='ki ki-search text-white']")
	public WebElement AvailSearch;

	@FindBy(xpath = "//label[normalize-space()='Cash']//span[@class='checkmark']")
	public WebElement Cash;

	@FindBy(xpath = "//label[normalize-space()='OP Credit']//span[@class='checkmark']")
	public WebElement OPCredit;

	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	public WebElement threedot;

	@FindBy(xpath = "//label[normalize-space()='Last One Month']")
	public WebElement lastonemonth;

	@FindBy(xpath = "//label[normalize-space()='Last Three Months']")
	public WebElement lastThreemonth;

	@FindBy(xpath = "//div[@class='form-group zero-bottom dark-bg ki-dropdown']//input[@id='undefined']")
	public WebElement episode;

	@FindBy(xpath = "//div[@class='form-group min-clear-bottom billing ki-dropdown']//input[@id='undefined']")
	public WebElement Status;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[3]/div[1]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement scheme;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='category']//input[@id='undefined']")
	public WebElement Category;

	@FindBy(xpath = "//span[@class='close-select ng-star-inserted']//i[@class='fa fa-close']")
	public WebElement close;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[3]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement servname;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[3]/div[1]/div[5]/ki-input-control[1]/div[1]/input[1]")
	public WebElement providername;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[3]/div[1]/div[6]/ki-input-control[1]/div[1]/input[1]")
	public WebElement billby;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	public void Patreg(String title, String Name, String lastname, String Dob, String DocID, String MobNo,String Address, String MRNo)	throws InterruptedException, IOException, AWTException {

		/////////////////// Register a female patient
		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click(); 
		Thread.sleep(3000);
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
		String lastName =RandomString.lastName();
			
		System.out.println(lastName + "LastName" );
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastName);
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
        String DOCID = RandomString.DOCID();
		
		EnterAadhar.sendKeys(DOCID );
		Thread.sleep(600);
		Clickadd.click();
		Thread.sleep(800);

		List<WebElement> dynamicElement1 = driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement1.size());
		if (dynamicElement1.size() == 0) {
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
		driver.findElement(By.xpath("//input[@id='guarantorphonehome']")).sendKeys("9845123658");
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
		Savereg.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(signupload));
		Thread.sleep(3000);		
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(3000);

		
	
		String mrno = driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src = new File(Excelfilepath);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration = wb.getSheetAt(37);
		int i = BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		Thread.sleep(2000);

		/////////////// encounter

		billing.click();
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
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")));
		Thread.sleep(3000);		
		
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		//Service Billing


		Thread.sleep(1000);
		Servicebilling.click();
		Thread.sleep(1000);
		Addnew.click();
		Thread.sleep(1000);
		servName.click();
		Thread.sleep(1000);
		servName.sendKeys("Sodium (ISE Indirect)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sodium (ISE Indirect)']")).click();
		Thread.sleep(1000);
		AddService.click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")));
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000); 

		//Availed services filters


		Thread.sleep(3000);
		AvailedService.click();
		Thread.sleep(1000);
		IP.click();
		Thread.sleep(1000);
		Cash.click();
		Thread.sleep(1000);
		OPCredit.click();
		Thread.sleep(1000);
		IP.click();
		Thread.sleep(1000);
		AvailSearch.click();
		Thread.sleep(3000);
		Cash.click();
		Thread.sleep(1000);
		AvailSearch.click();
		Thread.sleep(2000);
		OPCredit.click();
		Thread.sleep(1000);
		AvailSearch.click();
		Thread.sleep(2000);
		act.moveToElement(threedot).build().perform();
		//threedot.click();
		Thread.sleep(1500);
		lastonemonth.click();
		Thread.sleep(1000);
		AvailSearch.click();
		Thread.sleep(2000);
		act.moveToElement(threedot).build().perform();
		Thread.sleep(1000);
		lastThreemonth.click();
		Thread.sleep(2000);
		episode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		AvailSearch.click();
		Thread.sleep(2000);
		episode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		AvailSearch.click();
		Thread.sleep(1000);
		episode.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ul[1]/app-list-item[2]/li[1]")).click();
		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
		//AvailSearch.click();
		Thread.sleep(2000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='All']")).click();
		Thread.sleep(1000);
//		IP.click();
//		Thread.sleep(1000);
//		Cash.click();
//		Thread.sleep(1000);
//		OPCredit.click();
//		Thread.sleep(1000);
		AvailSearch.click();
		Thread.sleep(1000);
		scheme.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[3]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Registration']")).click();
		Thread.sleep(1000);
//		Category.click();
//		Thread.sleep(1000);
//		close.click();
//		Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Consultation']")).click();
		Thread.sleep(1000);
//		Category.click();
//		Thread.sleep(1000);
//		close.click();
//		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Registration']")).click();
		Thread.sleep(1000);
		//close.click();
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
		Thread.sleep(1000);
//		Category.click();
//		Thread.sleep(1000);
//		close.click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='All']")).click();
		Thread.sleep(1000);
		AvailSearch.click();
		Thread.sleep(2000);
		servname.clear();
		Thread.sleep(1000);
		servname.sendKeys("2 Year Registration");
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Print']")));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Service View']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Bill View']")).click();
		Thread.sleep(1000);
		
		servname.clear();
		servname.sendKeys("First" , Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Print']")));
		Thread.sleep(2000);
		servname.clear();
		servname.sendKeys("Sodium (ISE Indirect)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Print']")));
		Thread.sleep(2000);
		
		servname.clear();
		Thread.sleep(1000);
		providername.sendKeys(Provider);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Print']")));
		Thread.sleep(2000);
		providername.clear();

		servname.clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@title='Print'])[1]")));
		Thread.sleep(2000);
		billby.sendKeys("Mr Administrator" , Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@title='Print'])[1]")));
		Thread.sleep(2000);




	}




	public void orderset(String ORDERNAME,String sitename, String MRNO , String medicine1,String medicine2,String service1,String service2) throws InterruptedException, AWTException {

		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize = driver.getWindowHandles().size();
		int windowopen = Windowsize - 1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(2000);
		driver.get(URL);
		Thread.sleep(3000);

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
//		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		///orderSet
		Thread.sleep(2000);
		hamberger.click();
		Thread.sleep(700);
		EMR.click();
		Thread.sleep(700);
		Orderset.click();
		Thread.sleep(1500);
		OrdersetNAme.click();
		Thread.sleep(700);
		OrdersetNAme.sendKeys(ORDERNAME);
		Thread.sleep(700);
		AddOrder.click();
		Thread.sleep(700);
		medicineName.click();
		Thread.sleep(700);
		medicineName.sendKeys(medicine1 , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[contains(text(),'"+medicine1+"')]")).click();
		Thread.sleep(700);
		comments.sendKeys("ok");
		Thread.sleep(700);
		RecommendDose.click();
		Thread.sleep(700);
		Frequency.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='BD']")).click();
		Thread.sleep(700);
		duration.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(700);
		recomAdd.click();
		Thread.sleep(700);
		AddContinue.click();
		Thread.sleep(700);

		//////	medicine2

		Thread.sleep(700);
		medicineName.click();
		Thread.sleep(700);
		medicineName.sendKeys(medicine2 , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(700);
		comments.sendKeys("ok");
		Thread.sleep(700);
		RecommendDose.click();
		Thread.sleep(700);
		Frequency.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(700);
		duration.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(700);
		orderingReason.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(700);
		Justification.sendKeys("Justification");
		Thread.sleep(700);
		recomAdd.click();
		Thread.sleep(700);
		AddContinue.click();
		Thread.sleep(700);

		/////seervice 1

		Service.click();
		Thread.sleep(700);
		Servicename.click();
		Thread.sleep(700);
		Servicename.sendKeys(service1, Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(700);
		AddContinue.click();
		Thread.sleep(700);
		ViewOrdersetDetails.click();
		Thread.sleep(1700);
		driver.findElement(By.xpath("//button[normalize-space()='X']")).click();
		Thread.sleep(700);

		///////////Service 2

		Servicename.click();
		Thread.sleep(700);
		Servicename.sendKeys(service2, Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(700);
		Add.click();
		Thread.sleep(700);
		ApplicableToMe.click();
		Thread.sleep(700);
		Save.click();
		Thread.sleep(1000);
		//		List<WebElement> dynamicElement=driver.findElements(By.xpath("/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));
		//
		//		if(dynamicElement.size() !=0)
		//		{
		//			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		//		}
		Thread.sleep(800); 
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(700);

		

		////doctornote
		hamberger.click();
		Thread.sleep(700);
		Homescreen.click();
		Thread.sleep(700);
		//		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		//		Thread.sleep(700);

		search.clear();
		Thread.sleep(700);
		search.sendKeys(MRNO ,Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(700);

		Thread.sleep(700);
		DoctorNote.click();
		Thread.sleep(700);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 
		cheifComplaint.clear();
		Thread.sleep(800); 
		cheifComplaint.sendKeys("fever");
		Thread.sleep(700);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Template1.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(700);
		tempOk.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='icon emrsave']")));
		Thread.sleep(800);
		diagnosis.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(700);

		cpoeOrderSet.click();
		Thread.sleep(700);
		medicineSearch.click();
		Thread.sleep(700);
		medicineSearch.sendKeys(ORDERNAME, Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='"+ORDERNAME+"']")).click();
		Thread.sleep(700);
		AddOrderset.click();
		Thread.sleep(700);
		DiagnosisCheckbox.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(700);
		Thread.sleep(700);
		List<WebElement> dynamicElement3=driver.findElements(By.xpath("//button[@id='orderdetails_add']"));

		if(dynamicElement3.size() !=0)
		{
			driver.findElement(By.xpath("//button[@id='orderdetails_add']")).click();
		}

		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@class='icon emrsave']")).click();
		Thread.sleep(5000);

		//		formulatoryblockOK.click();
		//		Thread.sleep(2000);

		///orderSet
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(hamberger));
		hamberger.click();            
		Thread.sleep(700);
		EMR.click();
		Thread.sleep(700);
		Orderset.click();
		Thread.sleep(700);
		List<WebElement> dynamicElement2=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok']"));

		if(dynamicElement2.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok']")).click();
		}

		//driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok']")).click();
		Thread.sleep(700);
		ordersetSearch.click();
		Thread.sleep(700);
		ordersetSearch.sendKeys(ORDERNAME , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='"+ORDERNAME+"']")).click();
		Thread.sleep(700);
		delete.click();
		Thread.sleep(700);
		yes.click();
		Thread.sleep(700);

		//		int k=n-1;
		//		driver.switchTo().window(tabs.get(k));
		//		Thread.sleep(2000);
		//		siteview.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-site-view[1]/form[1]/div[1]/table[1]/tbody[1]/tr[11]/td[1]/label[1]/span[1]")).click();
		//		Thread.sleep(700);
		//		SaveSite.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		//		Thread.sleep(700);

	}






}
