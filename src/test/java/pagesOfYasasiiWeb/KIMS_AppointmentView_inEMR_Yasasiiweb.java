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
import java.util.Iterator;
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

public class KIMS_AppointmentView_inEMR_Yasasiiweb  extends PageFactoryInitYasasiiWeb{
	public KIMS_AppointmentView_inEMR_Yasasiiweb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;
	@FindBy(xpath = "//div[@class='module-icon-wrap active ng-star-inserted']//i[@class='ki ki-reception-fill']")
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

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;

	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lastname;

	////////////////appointment


	@FindBy(xpath = "//i[@class='ki ki-calendar-fill']")
	public WebElement Appointment;

	@FindBy(xpath = "//input[@placeholder='Search Resource..']")
	public WebElement SearchResoaurce;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement ReportingStatus;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement AppRemarks;

	@FindBy(xpath = "//button[@id='appointmentsaveid']")
	public WebElement AppSave;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement MainCategory;

	@FindBy(xpath="//input[@id='searchtext']") 
	public WebElement SearchField;

	@FindBy(xpath="//button[@class='shedule icon']") 
	public WebElement appointment;

	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement Search;

	@FindBy(xpath="//input[@placeholder='Search Resource..']")
	public WebElement DoctorSearch;

	@FindBy(xpath="//span[@class='btn btn-link ng-star-inserted']")
	public WebElement ResourceDetail;

	@FindBy(xpath="(//label[@title='Cancel']//i[@class='ki ki-close'])[4]")
	public WebElement AppCancel;

	@FindBy(xpath="//modal-container[@class='modal fade show']//input[@id='undefined']")
	public WebElement AppReason;

	@FindBy(xpath="//label[@title='Schedule View']")
	public WebElement ScheduleView;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Slots;

	@FindBy(xpath = "//label[@class='btn btn-red clear btn-clear']")
	public WebElement ResetAll;

	@FindBy(xpath = "//label[@title='Appointment Details']//i[@class='ki ki-info-circle-fill']")
	public WebElement AppointmentDetails;

	@FindBy(xpath = "(//i[@class='ki ki-info-circle-fill'])[2]")
	public WebElement logview;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;




	public void Patreg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ) throws InterruptedException, IOException, AWTException {

		///////////////////Register a  patient

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
		lastname.click();
		Thread.sleep(500);
		lastname.sendKeys(Lastname);
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


		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']"));

		System.out.println(dynamicElement11.size());
		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[@id='consentsave']//i[@class='ki ki-save']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
			Thread.sleep(1600);

		}


	}


	public void Appointment() throws InterruptedException, IOException {


		Thread.sleep(3000);
		Appointment.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
		Thread.sleep(2000);


		SearchResoaurce.click();
		Thread.sleep(1000);
		SearchResoaurce.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]")).click();
		Thread.sleep(1000);

		List<WebElement> slot =	driver.findElements(By.xpath("//td[@class='app-booking-bar ng-star-inserted']"));
		Thread.sleep(1000);

		int Count = slot.size();

		System.out.println("Count=" + Count);
		int a= Count-1;
		System.out.println("a=" + a);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-"+a+"-0 ng-star-inserted']//td[@class='app-booking-bar ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-"+a+"-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		ReportingStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='uparrow-yellow'])[1]")).click();
		Thread.sleep(1000);
		AppRemarks.click();
		Thread.sleep(1000);
		AppRemarks.sendKeys("Regular checkup");
		Thread.sleep(1000);

		Slots.clear();
		Thread.sleep(1000);
		Slots.sendKeys("1");
		Thread.sleep(1000);

		AppSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(3000);

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(6);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);


	}


	public void EMR_Appointment(String MRNo , String Provider,String MobNo,String User , String Password) throws InterruptedException {


		//openNewTab


		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(ProviderID);
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


		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[contains(text(),'EMR HomeScreen')]")).click();
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


		MainCategory.click();
		Thread.sleep(800); 
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(800);
		SearchField.clear();
		Thread.sleep(800);
		SearchField.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();  
		Thread.sleep(5000);

		Thread.sleep(500);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);



		String FullNmae = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/lib-patient-header[1]/div[1]/div[2]/div[1]/label[1]/span[1]")).getText();


		System.out.println(FullNmae);
		/*	driver.findElement(By.xpath("//i[@class='dashboard-lock-arrow ki ki-chevron-up']")).click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//i[@title='Lock/Unlock']")).click();
	Thread.sleep(2000); */

		//Appointment 

		appointment.click();
		Thread.sleep(800);
		AppointmentDetails.click();
		Thread.sleep(2000);
		Close.click();
		Thread.sleep(800);
		logview.click();
		Thread.sleep(2000);
		Close.click();
		Thread.sleep(1000);


		driver.findElement(By.xpath("//i[@class='ki ki-arrow-left']")).click();
		Thread.sleep(800);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Search Resource..')]")));
		Thread.sleep(800);

		Thread.sleep(800);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]")));
		Thread.sleep(800);
		DoctorSearch.clear();
		Thread.sleep(800);
		DoctorSearch.sendKeys(Provider); 
		Thread.sleep(800);

		///Edit Appointment

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container m0']//span[@class='checkmark']")).click();
		Thread.sleep(800);


		//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//label[text()="+MobNo+"]")));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("(//div[normalize-space()='"+FullNmae+"'])[3]")) );

		WebElement appSlot = driver.findElement(By.xpath("(//div[normalize-space()='"+FullNmae+"'])[3]"));
		Thread.sleep(800);
		//act.moveToElement(appSlot).build().perform();
		//Thread.sleep(800);
		act.moveToElement(appSlot, 170, 4)
		.click()
		.build()
		.perform();
		Thread.sleep(1000);

		List<WebElement> Headcount=driver.findElements(By.xpath("(//i[@class='ki ki-pencil'])"));
		Thread.sleep(1000);
		int a=Headcount.size();
		System.out.println(a + " =A "); 


		int b = a-1;


		//		Thread.sleep(1000);
		//		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//tr[@class='row-75-0 ng-star-inserted']//img[@class='ng-star-inserted']")));

		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("(//div[normalize-space()='"+FullNmae+"'])[3]")) );

		WebElement appSlot1 = driver.findElement(By.xpath("(//div[normalize-space()='"+FullNmae+"'])[3]"));
		Thread.sleep(1800);
		act.moveToElement(appSlot1).build().perform();
		Thread.sleep(800);
		act.moveToElement(appSlot1, 165, 4)
		.click()
		.build()
		.perform();
		Thread.sleep(1000);


		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='ki ki-pencil'])["+a+"]")).click();
		Thread.sleep(800);
		ResourceDetail.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@id='appointmentupdateid']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();



		//Vewing updated log
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@title='Schedule View']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@title='Schedule View']")).click();
		Thread.sleep(800);

		logview.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//modal-container[@class='modal fade show']//span[contains(text(),'Log')]")).click();
		Thread.sleep(1800);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//modal-container[@class='modal fade show']//button[@type='button'][normalize-space()='Close']")));
		Thread.sleep(800);
		driver.findElement(By.xpath("//modal-container[@class='modal fade show']//button[@type='button'][normalize-space()='Close']")).click();
		Thread.sleep(800);

		driver.findElement(By.xpath("//i[@class='ki ki-arrow-left']")).click();
		Thread.sleep(800);



		Thread.sleep(800);
		//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Search Resource..')]")));
		Thread.sleep(800);

		Thread.sleep(800);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]")));
		Thread.sleep(800);
		DoctorSearch.clear();
		Thread.sleep(800);
		DoctorSearch.sendKeys(Provider); 
		Thread.sleep(800);

		///Edit Appointment

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container m0']//span[@class='checkmark']")).click();
		Thread.sleep(800);


		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("(//div[normalize-space()='"+FullNmae+"'])[3]")) );

		WebElement appSlot11 = driver.findElement(By.xpath("(//div[normalize-space()='"+FullNmae+"'])[3]"));
		Thread.sleep(1800);
		act.moveToElement(appSlot11).build().perform();
		Thread.sleep(800);
		act.moveToElement(appSlot11, 165, 4)
		.click()
		.build()
		.perform();
		Thread.sleep(1000);


		Thread.sleep(500);
		List<WebElement> Slotcount=driver.findElements(By.xpath("//*[@id=\"weekviewLoaderId\"]//tr"));

		int A= Slotcount.size();

		int Slot = A-1;
		
		System.out.println(Slot + "Slot");
		
		driver.findElement(By.xpath("//tr[@class='row-"+Slot+"-0 ng-star-inserted']//i[@class='ki ki-close']")).click();
		Thread.sleep(800);
		Thread.sleep(800);
		AppReason.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor on Leave']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-clear-back']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1500);

		appointment.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//i[@class='ki ki-arrow-left']")).click();
		Thread.sleep(800);
		ScheduleView.click(); 
		Thread.sleep(3000);

	}














}
