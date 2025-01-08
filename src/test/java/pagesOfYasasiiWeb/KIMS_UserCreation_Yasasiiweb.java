package pagesOfYasasiiWeb;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_UserCreation_Yasasiiweb   extends PageFactoryInitYasasiiWeb{

	public KIMS_UserCreation_Yasasiiweb(WebDriver driver) {

		super(driver);


	}	


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[@class='module-icon-wrap ng-star-inserted']//i[@class='ki ki-user-privilege-fill']")
	public WebElement Security;

	@FindBy(xpath = "//div[contains(text(),'User Creation')]")
	public WebElement UserCreation;

	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middleName;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//input[@id='gender']")
	public WebElement gender;

	@FindBy(xpath = "//input[@id='phoneno']")
	public WebElement phoneno;

	@FindBy(xpath = "//input[@id='empid']")
	public WebElement EmployeeId;

	@FindBy(xpath = "//ki-calendar[@id='doj']//input[@type='text']")
	public WebElement Doj;

	@FindBy(xpath = "//input[@id='usertypeid']")
	public WebElement usertype;

	@FindBy(xpath = "//input[@id='deptname']")
	public WebElement department;

	@FindBy(xpath = "//input[@id='designation']")
	public WebElement designation;

	@FindBy(xpath = "//input[@id='site']")
	public WebElement Allowedsite;

	@FindBy(xpath = "//input[@id='userprofileid']")
	public WebElement UserProfile;

	@FindBy(xpath = "//button[@title='Add to grid']//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//span[normalize-space()='User Credentials']")
	public WebElement Usercredential;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement Password;

	@FindBy(xpath = "//input[@id='cpassword']")
	public WebElement confirmpassword;

	@FindBy(xpath = "//span[normalize-space()='User Information']")
	public WebElement UserInformation;

	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement DOb;


	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement contactInformation;


	@FindBy(xpath = "//input[@id='email']")
	public WebElement Email;

	@FindBy(xpath = "//input[@id='phonenocode']")
	public WebElement Phonecode;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-root[1]/app-userregister[1]/div[2]/form[1]/div[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[4]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement modules;

	@FindBy(xpath = "//input[@id='defaultmodule']")
	public WebElement defaultmodule;

	@FindBy(xpath = "//input[@id='regno']")
	public WebElement regnumber;

	@FindBy(xpath = "//button[@id='multiselect_user_speciality']")
	public WebElement Speciality;

	@FindBy(xpath = "//input[@id='defaultspeciality']")
	public WebElement DefaultSpeacility;

	@FindBy(xpath = "//button[normalize-space()='Login Restriction']")
	public WebElement loginrestriction;

	@FindBy(xpath = "//a[@role='menuitem']")
	public WebElement Selectall;


	@FindBy(xpath="//div[normalize-space()='Tariff Setting']")
	public WebElement TariffSetting;

	@FindBy(xpath="//input[@placeholder='Search reference name...']")
	public WebElement SchemeSearch;

	@FindBy(xpath="//div[normalize-space()='Edit']")
	public WebElement Edit;


	@FindBy(xpath="//span[normalize-space()='Services']")
	public WebElement Services;

	@FindBy(xpath="//ki-select-control[@formcontrolname='servicetypeid']//input[@id='undefined']")
	public WebElement ServiceType;

	@FindBy(xpath="//input[@id='basecategoryid']")
	public WebElement baseCAt;

	@FindBy(xpath="//ki-select-control[@formcontrolname='servicecategoryid']//input[@id='undefined']")
	public WebElement ServiceCAt;

	@FindBy(xpath="//input[@id='serviceidBilling']")
	public WebElement Servicename;

	@FindBy(xpath="//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement Coverage;

	@FindBy(xpath="//label[@class='check-container zero-bottom']//span[@class='checkmark']")
	public WebElement PriceByUser;

	@FindBy(xpath="//span[normalize-space()='Charge Parameter']")
	public WebElement chargingParameter;

	@FindBy(xpath="//input[@id='encountersubmodeid']")
	public WebElement SubMode;
	
	@FindBy(xpath="//input[@id='paymodeid']")
	public WebElement PayMode;

	@FindBy(xpath="//button[@id='AddButton']")
	public WebElement tariffAdd;

	@FindBy(xpath="//input[@placeholder='Service Name']")
	public WebElement ServiceSearch1;

	@FindBy(xpath="//th[@class='code']")
	public WebElement TableClick;

	@FindBy(xpath="//th[normalize-space()='Final Amt.']")
	public WebElement FinalAmount;

	@FindBy(xpath="//button[@id='Savebutton']")
	public WebElement Update;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ADJpercent;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement SponsorAmount;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement withoutvat;

	@FindBy(xpath = "//span[normalize-space()='Charge - Tax']")
	public WebElement ChargeTAx;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tariffBaseCharge;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tariffcontractCharge;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='RCM-Plan']")
	public WebElement RCM;

	@FindBy(xpath="//span[normalize-space()='Provider']")
	public WebElement Provider;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement ProviderName;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='Resource']")
	public WebElement Resource;

	@FindBy(xpath="//div[normalize-space()='Schedule Setting']")
	public WebElement ScheduleSetting;

	@FindBy(xpath="//input[@id='categoryListId']")
	public WebElement Category;

	@FindBy(xpath="//div[@class='form-group ki-dropdown']//input[@id='namelistdisplay']")
	public WebElement Name;

	@FindBy(xpath="//div[@class='form-group ki-dropdown']//input[@id='siteid']")
	public WebElement site1;

	@FindBy(xpath="//input[@id='session']")
	public WebElement Session;

	@FindBy(xpath="//input[@id='fromtime']")
	public WebElement FromTym;

	@FindBy(xpath="//input[@id='totime']")
	public WebElement ToTym;

	@FindBy(xpath="//button[@id='schedulesettingsave']")
	public WebElement ScheduleSetingSave;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement PAS;


	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//label[contains(@class,'check-container zero-label')]")
	public WebElement printuncheck;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath="//input[@id='searchtext']") 
	public WebElement SearchField;

	@FindBy(xpath="//i[@class='ki ki-calendar-fill']") 
	public WebElement Appointment;

	@FindBy(xpath = "//input[@placeholder='Search Resource..']")
	public WebElement SearchResoaurce;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement ReportingStatus;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement AppRemarks;

	@FindBy(xpath = "//button[@id='appointmentsaveid']")
	public WebElement AppSave;

	@FindBy(xpath = "(//div[@class='form-group zero-bottom ng-star-inserted'])[2]//input")
	public WebElement Slot;	

	@FindBy(xpath="//label[@title='Week']")
	public WebElement WEEk;

	@FindBy(xpath="//i[@class='ki ki-filter-list']")
	public WebElement Filter;

	@FindBy(xpath="//input[@id='providerSearchDb']")
	public WebElement SearchResource;

	@FindBy(xpath="//input[@id='type']")
	public WebElement ResourcetYPE;

	@FindBy(xpath="//div[contains(text(),'Billing')]")
	public WebElement Billing;

	@FindBy(xpath="//input[@id='duration']")
	public WebElement SlotDuration;

	@FindBy(xpath="//div[@class='form-group min-clear-bottom ki-dropdown']//input[@id='namelistdisplay']")
	public WebElement resource;

	@FindBy(xpath="//input[@id='schedulecategory']")
	public WebElement scheduleCategory;

	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;

	@FindBy(xpath="//i[@class='ki ki-cog']")
	public WebElement Master;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='FO']")
	public WebElement MastersFO;

	@FindBy(xpath = "//div[normalize-space()='Queue Master']")
	public WebElement QueueMaster;

	@FindBy(xpath = "//input[@id='queuename']")
	public WebElement Queuename;

	@FindBy(xpath = "//input[@id='providername']")
	public WebElement providername;

	@FindBy(xpath = "//input[@id='roomno']")
	public WebElement ProviderRoomNo;

	@FindBy(xpath = "//input[@id='nurseroomno']")
	public WebElement nurseRoomNo1;

	@FindBy(xpath = "//input[@id='nurseroomservice']")
	public WebElement nurseService1;

	@FindBy(xpath = "//input[@id='nurse2roomno']")
	public WebElement NurseRoom2;

	@FindBy(xpath = "//input[@id='nurse2roomservice']")
	public WebElement Nurseservice2;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement save;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-queue-master[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement SiteName;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Queue']")
	public WebElement Queue;

	@FindBy(xpath = "//div[normalize-space()='Queue Display']")
	public WebElement QueueDisplay;

	@FindBy(xpath = "//input[@id='queuetypeid']")
	public WebElement QueueType;

	@FindBy(xpath = "//li[normalize-space()='Encounter Queue']")
	public WebElement EncpunterQueue;

	@FindBy(xpath = "//input[@id='queueid']")
	public WebElement Queuname;

	@FindBy(xpath = "//i[@class='ki ki-token-call']")
	public WebElement TokenCall;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement search;

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement Delete;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Consult Rule']")
	public WebElement consultrule;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-consultrule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement consultruleName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-consultrule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement EpisodeDays;

	@FindBy(xpath = "//input[@id='servicecategory']")
	public WebElement ServiceCategory;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-consultrule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement ServiceName;

	@FindBy(xpath = "//div[@class='col-md-3 mbl-pl0']//i[@class='ki ki-plus']")
	public WebElement SpecialityADD;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement department1;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-valid']//input[@id='undefined']")
	public WebElement Speciality1;

	@FindBy(xpath="//div[@class='col-md-1']//i[@class='ki ki-plus']")
	public WebElement Add1;

	@FindBy(xpath="//button[normalize-space()='Add']//i[@class='ki ki-save']")
	public WebElement specialitysave;

	@FindBy(xpath="//button[@title='Add Consult Rule']//i[@class='ki ki-plus']")
	public WebElement addcnsltrule;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save;

	@FindBy(xpath = "//div[normalize-space()='Consult Rule Mapping']")
	public WebElement ConsultruleMapping;

	@FindBy(xpath = "//input[@id='incomastschemeid']")
	public WebElement plan;

	@FindBy(xpath = "//input[@id='departmentid']")
	public WebElement Department2;

	@FindBy(xpath = "//input[@id='specialityid']")
	public WebElement Speciality11;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-consult-rule-mapping[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement ProviderName1;

	@FindBy(xpath="//input[@id='name']")
	public WebElement Rule;

		@FindBy(xpath="//input[@id='oldpassword']")
		public WebElement OldPassword;
	
		@FindBy(xpath = "//input[@id='newpassword']")
		public WebElement NewPassword;
	
		@FindBy(xpath = "//input[@id='confirmpassword']")
		public WebElement ConfirmPassword;
	
		@FindBy(xpath = "//button[@class='btn btn-dark-green active']")
		public WebElement Save1;














	public void userCreation(String FirstName ,String MiddleName,String LastName,String Gender,String PhoneNumber,String userId,String UserType,String Department,String Designation,String allowedSites,String Userprofile,String Passsword,String DOJ ,String emailid, String DOB , String encounterCreation,String modules1,String modules2,String modules3,String modules4,String modules5,String modules6,String modules7,String modules8,String deafultmodule,String RegistrationNO,String Country) throws InterruptedException, AWTException{


		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(500);
		/// driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		//Thread.sleep(500);
		Security.click();
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

		UserCreation.click();
		Thread.sleep(500);

		firstName.clear();
		Thread.sleep(500);
		firstName.sendKeys(FirstName);
		Thread.sleep(500);
		middleName.clear();
		Thread.sleep(500);
		middleName.sendKeys(MiddleName);
		Thread.sleep(500);
		lastname.clear();
		Thread.sleep(500);
		lastname.sendKeys(LastName);
		Thread.sleep(500);
		gender.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Gender+"')])[1]")).click();
		Thread.sleep(500);

		Phonecode.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+Country+"']")).click();
		Thread.sleep(500);


		phoneno.clear();
		Thread.sleep(500);
		phoneno.sendKeys(PhoneNumber);
		Thread.sleep(500);
		EmployeeId.clear();
		Thread.sleep(500);
		EmployeeId.sendKeys(userId);
		Thread.sleep(500);

		DOb.clear();
		Thread.sleep(500);
		Robot t=new Robot();

		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		DOb.sendKeys(DOB);
		Thread.sleep(1000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", contactInformation);
		Thread.sleep(500);
		contactInformation.click();
		Thread.sleep(500);
		Email.clear();
		Thread.sleep(500);
		Email.sendKeys(emailid);
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", Usercredential);
		Thread.sleep(500);
		Usercredential.click();
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", UserInformation);
		Thread.sleep(500);
		UserInformation.click();
		Thread.sleep(500);
		Doj.clear();
		Thread.sleep(500);
		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		Thread.sleep(500);
		Doj.sendKeys(DOJ);
		Thread.sleep(1000);

		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		usertype.click();
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+UserType+"']")).click();
		Thread.sleep(500);
		department.clear(); 
		Thread.sleep(500);
		department.sendKeys(Department);
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+Department+"']")).click();
		Thread.sleep(500);
		designation.clear();
		Thread.sleep(500);
		designation.sendKeys(Designation);
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+Designation+"']")).click();
		Thread.sleep(500);
		Allowedsite.click();
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(500);
		UserProfile.click();
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+Userprofile+"']")).click();


		////Encounter Creation

		if(encounterCreation.equals("1")) {
			Thread.sleep(500);
			driver .findElement(By.xpath("//label[normalize-space()='Encounter creation allowed']//span[@class='checkmark']")).click();
			Thread.sleep(500);
			Speciality.click();
			Thread.sleep(500);
			driver .findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-root[1]/app-userregister[1]/div[2]/form[1]/div[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[2]")).click();
			Thread.sleep(500);
			DefaultSpeacility.click();
			Thread.sleep(500);
			driver .findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-root[1]/app-userregister[1]/div[2]/form[1]/div[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
			Thread.sleep(500);

		}

		else {
			Thread.sleep(500);
			System.out.println("sri");
		}



		Thread.sleep(500);
		add.click();
		Thread.sleep(500);


		js.executeScript("arguments[0].scrollIntoView();", loginrestriction);
		Thread.sleep(500);


		/////////modules selection	


		modules.click();
		Thread.sleep(500);
		Selectall.click();	
		Thread.sleep(500);
		Selectall.click();	

		if(modules1.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}

		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules1+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules1+"']")).click();

		}

		if(modules2.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}

		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules2+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules2+"']")).click();

		}


		if(modules3.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}


		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules3+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules3+"']")).click();

		}

		if(modules4.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}

		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules4+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules4+"']")).click();

		}	

		if(modules5.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}

		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules5+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules5+"']")).click();

		}

		if(modules6.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}

		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules6+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules6+"']")).click();

		}


		if(modules7.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}

		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules7+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules7+"']")).click();

		}

		if(modules8.equals("NO")) {
			Thread.sleep(500);
			System.out.println("Sri");
		}

		else {
			Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules8+"']")));
			driver .findElement(By.xpath("//span[@title='"+modules8+"']")).click();

		}
		Thread.sleep(500);


		defaultmodule.click();
		Thread.sleep(500);
		driver .findElement(By.xpath("//li[normalize-space()='"+deafultmodule+"']")).click();
		Thread.sleep(500);
		regnumber.click();
		Thread.sleep(500);
		regnumber.sendKeys(RegistrationNO);
		Thread.sleep(500);

		js.executeScript("arguments[0].scrollIntoView();", Usercredential);
		Usercredential.click();
		Thread.sleep(500);
		Password.clear();
		Thread.sleep(500);
		Password.sendKeys(Passsword);
		Thread.sleep(500);
		confirmpassword.clear();
		Thread.sleep(500);
		confirmpassword.sendKeys(Passsword);
		Thread.sleep(500);
		driver .findElement(By.xpath("//button[@id='save']")).click();
		Thread.sleep(2000);

		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);


	}






	public void Caller(String FirstName,String userId, String MRNO,String Queue_Name) throws InterruptedException, AWTException	{

		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(500);		

		Master.click();
		Thread.sleep(700);
		MastersFO.click();
		Thread.sleep(700);
		QueueMaster.click();
		Thread.sleep(700);
		Queuename.click();
		Thread.sleep(700);
		Queuename.sendKeys(Queue_Name+userId);
		Thread.sleep(700);
		SiteName.click();
		Thread.sleep(1000);
		SiteName.sendKeys(Keys.DOWN);
		Thread.sleep(700);
		SiteName.sendKeys(Keys.DOWN);
		Thread.sleep(700);
//		SiteName.sendKeys(Keys.DOWN);
//		Thread.sleep(700);
		SiteName.sendKeys(Keys.ENTER);
		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH Nagarcoil']"));
		//		Thread.sleep(2000);
		providername.click();
		Thread.sleep(700);
		providername.sendKeys(FirstName);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+userId+"')])[1]")).click();
		Thread.sleep(700);

		ProviderRoomNo.click();
		Thread.sleep(700);
		ProviderRoomNo.sendKeys("100");
		Thread.sleep(700);
		nurseRoomNo1.click();
		Thread.sleep(700);
		nurseRoomNo1.sendKeys("101");
		Thread.sleep(700);
		nurseService1.click();
		Thread.sleep(700);
		nurseService1.sendKeys("Visit");
		Thread.sleep(700);
		NurseRoom2.click();
		Thread.sleep(700);
		NurseRoom2.sendKeys("102");
		Thread.sleep(700);
		Nurseservice2.click();
		Thread.sleep(700);
		Nurseservice2.sendKeys("vitals");
		Thread.sleep(700);
		Add.click();
		Thread.sleep(700);
		save.click();
		Thread.sleep(1500);


	}


	public void tariffSetting(String FirstName, String userId,String Department) throws InterruptedException, AWTException {



		Thread.sleep(3000);
		Hamberger.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='ki ki-cog']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", RCM);
		Thread.sleep(1000);
		RCM.click();
		Thread.sleep(1000); 
		TariffSetting.click();
		Thread.sleep(1000); 
		SchemeSearch.click();
		Thread.sleep(1000); 
		SchemeSearch.sendKeys("default" , Keys.ENTER);
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//div[@title='Default']")).click();
		Thread.sleep(1000); 
		//.click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(5000); 

		driver.findElement(By.xpath("//input[@id='plan']")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='DefaultPlan']")).click();
		Thread.sleep(1000); 


		Services.click();
		Thread.sleep(1000); 
		ServiceType.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Consultation']")).click();
		Thread.sleep(1000); 
		baseCAt.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//app-list-item[@id='droplistkey0']//li[contains(text(),'Consultation')]")).click();
		Thread.sleep(1000); 
		ServiceCAt.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='First Consultation']")).click();
		Thread.sleep(1000); 
		Servicename.click();
		Thread.sleep(1000); 
		Servicename.sendKeys("First Consultation");
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='First Consultation']")).click();
		Thread.sleep(1000); 
		Coverage.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Inclusion']")).click();
		Thread.sleep(1000); 
		Provider.click();
		Thread.sleep(1000);
		ProviderName.click();
		Thread.sleep(1000);
		ProviderName.sendKeys(userId);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+FirstName+"')])[1]")).click();
		Thread.sleep(1000);
		chargingParameter.click();
		Thread.sleep(1000); 
		
		
		SubMode.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1000); 
		PayMode.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Cash']")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//label[@title='Add submode and paymode']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000); 
		
		
		
		chargingParameter.click();
		Thread.sleep(1000); 
		ChargeTAx.click();
		Thread.sleep(1000); 
		js.executeScript("arguments[0].scrollIntoView();", withoutvat);
		Thread.sleep(1000); 
		tariffBaseCharge.click();
		Thread.sleep(1000); 
		tariffBaseCharge.sendKeys("245");
		Thread.sleep(1000); 
		tariffcontractCharge.click();
		Thread.sleep(1000); 
		tariffcontractCharge.sendKeys("245");
		Thread.sleep(1000); 
		ADJpercent.click();
		Thread.sleep(1000); 
		ADJpercent.sendKeys("10.5");
		Thread.sleep(1000); 
		SponsorAmount.click();
		Thread.sleep(1000); 
		SponsorAmount.sendKeys("219.28");
		Thread.sleep(1000); 
		withoutvat.click();
		Thread.sleep(1000); 
		withoutvat.sendKeys("219.28");
		Thread.sleep(1000); 


		//	JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", tariffAdd);

		tariffAdd.click();
		Thread.sleep(2500); 
		List<WebElement> dynamicElement=driver.findElements(By.xpath("/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));

		if(dynamicElement.size() !=0)
		{
			Robot t=new Robot();
			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(400);
			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);

		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		Update.click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 

		///consult rule mapping


		Thread.sleep(2000); 
		Hamberger.click();
		Thread.sleep(1000);  

		consultrule.click();
		Thread.sleep(600);
		consultruleName.click();
		Thread.sleep(600);
		consultruleName.sendKeys("First rule");
		Thread.sleep(600);
		EpisodeDays.clear();
		Thread.sleep(600);
		EpisodeDays.sendKeys("8");
		Thread.sleep(600);
		ServiceCategory.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='First Consultation']")).click();
		Thread.sleep(1000); 
		ServiceName.click();
		Thread.sleep(600);
		ServiceName.sendKeys("First Consultation");
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='First Consultation']")).click();
		Thread.sleep(1000);
		SpecialityADD.click();
		Thread.sleep(600);
		department1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='"+Department+"']")).click();
		Thread.sleep(1000);
		Speciality1.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+Department+"']")).click();
		Thread.sleep(1000);
		Add1.click();
		Thread.sleep(600);
		specialitysave.click();
		Thread.sleep(600);
		addcnsltrule.click();
		Thread.sleep(600);
		Save.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);  


		//ConsultruleMapping

		Thread.sleep(2000); 
		Hamberger.click();
		Thread.sleep(1000);  
		ConsultruleMapping.click();
		Thread.sleep(600);
		SchemeSearch.sendKeys("Default", Keys.ENTER);
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[@title='Default']")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(2000); 
		plan.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='DefaultPlan']")).click();
		Thread.sleep(2000); 	
		Department2.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='"+Department+"']")).click();
		Thread.sleep(2000); 
		Speciality11.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='"+Department+"']")).click();
		Thread.sleep(2000); 
		ProviderName1.click();
		Thread.sleep(600);
		ProviderName1.sendKeys(userId);
		Thread.sleep(600);
		driver.findElement(By.xpath("(//*[contains(text(),'"+userId+"')])[1]")).click();
		Thread.sleep(600);

		Rule.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//li[normalize-space()='First rule']")).click();
		Thread.sleep(2000); 

		Add.click();
		Thread.sleep(600);
		save.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000); 

	}


	public void ScheduleSetting(String FirstName,String allowedSites) throws InterruptedException, AWTException {


		Thread.sleep(2000); 
		Hamberger.click();
		Thread.sleep(1000);   
		Resource.click();
		Thread.sleep(1000);   
		ScheduleSetting.click();
		Thread.sleep(1000);   
		Category.click();
		Thread.sleep(1000);   
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);   
		Name.click();
		Thread.sleep(1000);   
		Name.sendKeys(FirstName);
		Thread.sleep(1000);   
		driver.findElement(By.xpath("(//*[contains(text(),'"+FirstName+"')])[1]")).click();
		Thread.sleep(1000);   
		site1.click();
		Thread.sleep(1000);   
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);   
		Session.click();
		Thread.sleep(1000);   
		driver.findElement(By.xpath("//li[normalize-space()='Whole Day']")).click();
		Thread.sleep(1000);
		SlotDuration.clear();
		Thread.sleep(600);
		SlotDuration.sendKeys("15");
		Thread.sleep(600);


		Robot r=new Robot();
		FromTym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=4; i++) {	

			r.keyPress(KeyEvent.VK_BACK_SPACE);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);

		}


		FromTym.sendKeys("00 00" + Keys.HOME);
		Thread.sleep(1000);   
		ToTym.click();
		Thread.sleep(1000); 
		for (int i = 0; i <=4; i++) {	

			r.keyPress(KeyEvent.VK_BACK_SPACE);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);

		}

		ToTym.sendKeys("23 45"+Keys.HOME);
		Thread.sleep(1000);   
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);  
		ScheduleSetingSave.click();
		Thread.sleep(1000); 
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='schedulesettingsave']")));
		Thread.sleep(3000);


	}

	public void Billing(String FirstName,String provider,String MRNO,String Queue_Name,String userId) throws InterruptedException, AWTException {

		Thread.sleep(3000);
		Hamberger.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(500);

		PAS.click();
		Thread.sleep(600);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(600);
		Registration.click();


		Thread.sleep(1000);
		List<WebElement> dynamicElement01=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement01.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1500);

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(3000);


		///Appointnment with max slots

		Appointment.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
		Thread.sleep(2000);

		Thread.sleep(1000);
		Filter.click();
		Thread.sleep(800);
		SearchResource.click();
		Thread.sleep(800);
		SearchResource.sendKeys( FirstName, Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='resource-name']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='bg-overlay']")).click();
		Thread.sleep(800);


		SearchResoaurce.click();
		Thread.sleep(1000);
		SearchResoaurce.sendKeys(FirstName);
		Thread.sleep(1000);
		System.out.println(FirstName + " = provider");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//td[@class='app-booking-bar ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		
		

		Thread.sleep(1000);
		List<WebElement> dynamicElement03=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement03.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1500);
		
		
		
		
		
		
		
		ReportingStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"droplistkey0\"]/li")).click();
		Thread.sleep(1000);
		Slot.clear();
		Thread.sleep(1000);
		Slot.sendKeys("35");
		Thread.sleep(1000);
		Slot.clear();
		Thread.sleep(1000);
		Slot.sendKeys("1");
		Thread.sleep(1000);
		AppRemarks.click();
		Thread.sleep(1000);
		AppRemarks.sendKeys("Regular checkup");
		Thread.sleep(1000);
		AppSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(3000);  

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@title='Week']")));
		Thread.sleep(2000);


		///Getting day in week view	

		WEEk.click();
		String dateAndDay = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[2]/div[1]/lib-schedule-view[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/label[1]")).getText();
		Thread.sleep(800);

		System.out.println(dateAndDay);


		String[] dayinweek = dateAndDay.split(" ", -2);

		for (String a : dayinweek)

			System.out.println(a + " - a");


		System.out.println(dayinweek[4] + " - Day in week view");

		/// Getting Actual day 

		String DAte= new Date().toString().substring(0, 10); 

		System.out.println(DAte +"todate");


		String[] expextedday = DAte.split(" ", -2);

		for (String a : expextedday)

			System.out.println(a);

		System.out.println(expextedday[0] + "ExpectedDAy");

		///Comparing both days

		//Assert.assertEquals(expextedday[0],dayinweek[4]);
		assertTrue(dayinweek[4].contains(expextedday[0]));

		System.out.println("DAY is Showing");

		////Doctor&Non-md Filter search

		Thread.sleep(1000);
		Filter.click();
		Thread.sleep(800);
		SearchResource.clear();
		Thread.sleep(800);
		SearchResource.sendKeys("%%%" , Keys.ENTER);
		Thread.sleep(2000);
		ResourcetYPE.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Non MD']")).click();
		Thread.sleep(800);
		SearchResource.clear();
		Thread.sleep(800);
		SearchResource.sendKeys("%%%" , Keys.ENTER);
		Thread.sleep(2000);


		///Billing

		Billing.click();
		Thread.sleep(1200);
		clear.click(); 
		Thread.sleep(1000);
		//		printuncheck.click();
		//		Thread.sleep(1000);
		//		providerName.click();
		//		Thread.sleep(1000);
		//		providerName.sendKeys(FirstName);
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("(//*[contains(text(),'"+FirstName+"')])[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Check-In']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", EncounterAdd);
		EncounterAdd.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		List<WebElement> dynamicElement02=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement02.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1500);
		
		EncounterSave.click();
		Thread.sleep(2000);
		
	
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")));
		Thread.sleep(2000);
		SAvesuccess.click();
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);

		//////Queue Display


		Hamburger.click();
		Thread.sleep(700);
		Queue.click();
		Thread.sleep(700);
		QueueDisplay.click();
		Thread.sleep(700);
		QueueType.click();
		Thread.sleep(700);
		EncpunterQueue.click();
		Thread.sleep(700);
		Queuname.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+Queue_Name+userId+"']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);

		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(700);

		///Schedule delete


		//		Hamberger.click();
		//		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//i[@class='ki ki-cog']")).click();
		//		Thread.sleep(1000); 
		//		//JavascriptExecutor js= (JavascriptExecutor) driver;
		//		js.executeScript("arguments[0].scrollIntoView();", Resource);
		//		Resource.click();
		//		Thread.sleep(1000);   
		//		ScheduleSetting.click();
		//		Thread.sleep(1000);   
		//		
		//		scheduleCategory.click();
		//		Thread.sleep(1000);   
		//		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		//		Thread.sleep(1000);   
		//		resource.click();
		//		Thread.sleep(1000);   
		//		resource.sendKeys(FirstName);
		//		Thread.sleep(1000);   
		//		driver.findElement(By.xpath("//ul[@class='dropdown-list ng-star-inserted']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("(//div[@class='result-name ng-star-inserted'])[1]")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//span[@id='common_trash_icon_0']//i[@class='ki ki-trash']")).click();
		//		Thread.sleep(1000);   
		//		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		Thread.sleep(1000);   
		//		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		Thread.sleep(5000);


	}


	public void Token_Calling_EMR(String User , String Password ,String MRNo,String FirstName , String Queue_Name,String userId) throws InterruptedException, AWTException {



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
		userid.sendKeys(User);
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

		
		Thread.sleep(600);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[@class='btn btn-dark-green active']"));

		if(dynamicElement1.size() !=0)
		{
			Thread.sleep(600);
			OldPassword.click();
			OldPassword.sendKeys(Password);
			Thread.sleep(500);
			
			NewPassword.click();
			NewPassword.sendKeys("KAmeda123#");
			Thread.sleep(500);
			ConfirmPassword.click();
			ConfirmPassword.sendKeys("KAmeda123#");
			Thread.sleep(500);
			Save1.click();
		}


		else {
			System.out.println("sri");
		}

		
		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);

		EnterPatientName.sendKeys(MRNo,Keys.ENTER);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(3000);

		TokenCall.click();
		Thread.sleep(1500);

		//////checking token call in previous screen


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_CONTROL);
		t.keyPress(KeyEvent.VK_SHIFT);
		t.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_CONTROL);
		t.keyRelease(KeyEvent.VK_SHIFT);
		t.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(700);

		ArrayList<String> current_tabs = new ArrayList<String>(driver.getWindowHandles());
		int Y =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("window handles no."+ Y);
		int Z= Y-2;
		int X=Y-1;
		Thread.sleep(1000);
		System.out.println("go to window no."+ Z);
		Thread.sleep(2000);
		driver.switchTo().window(current_tabs.get(Z));  
		Thread.sleep(5000);


		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(3000);

		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(700);

		Hamberger.click();
		Thread.sleep(700);
		//driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		//Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='ki ki-cog']")).click();
		Thread.sleep(1000); 
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Resource);
		Resource.click();
		Thread.sleep(1000);   
		ScheduleSetting.click();
		Thread.sleep(1000);   

		scheduleCategory.click();
		Thread.sleep(1000);   
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);   
		resource.click();
		Thread.sleep(1000);   
		resource.sendKeys(FirstName);
		Thread.sleep(1000);   
		driver.findElement(By.xpath("//ul[@class='dropdown-list ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='result-name ng-star-inserted'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='common_trash_icon_0']//i[@class='ki ki-trash']")).click();
		Thread.sleep(1000);   
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);   
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(5000);


		///////////Queue Delete

		Thread.sleep(700);
		Hamburger.click();
		Thread.sleep(700);
		MastersFO.click();
		Thread.sleep(700);
		QueueMaster.click();
		Thread.sleep(700);

		search.click();
		Thread.sleep(700);
		search.sendKeys(Queue_Name+userId, Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='"+Queue_Name+userId+"']")).click();
		Thread.sleep(1000);

		Delete.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);  





	}



}
