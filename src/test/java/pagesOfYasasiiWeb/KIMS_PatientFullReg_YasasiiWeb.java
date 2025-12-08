package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
import com.w2a.utilities.RandomString;

public class KIMS_PatientFullReg_YasasiiWeb  extends PageFactoryInitYasasiiWeb {

	public KIMS_PatientFullReg_YasasiiWeb(WebDriver driver) {
		super(driver);
	} 



	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

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

	@FindBy(xpath="//div[5]//div[1]//ki-auto-complete-pagination[1]//div[1]//input[1]")
	public WebElement nationality;

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middleName;	

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement LastName;	

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='alternatephone']")
	public WebElement AlternateMblNO;
	
	@FindBy(xpath = "//input[@id='familyname']")
	public WebElement familyname;

	@FindBy(xpath = "//input[@id='mothermaidenname']")
	public WebElement mothermaidenname;

	@FindBy(xpath = "//input[@id='bloodgroup']")
	public WebElement bloodgroup;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[4]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement preferedlanguageid;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement organisation;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/label[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement vip;

	@FindBy(xpath = "//label[normalize-space()='Physically Challenged']//span[@class='checkmark']")
	public WebElement physicallychallenge;

	@FindBy(xpath = "//input[@id='bloodgroup']")
	public WebElement BloodGroup;

	@FindBy(xpath = "//label[contains(@class,'btn-feedback')]")
	public WebElement Addinformation;

	@FindBy(xpath = "//input[@id='careadvocateid']")
	public WebElement keyWorker;	

	@FindBy(xpath = "//input[@id='careteamid']")
	public WebElement CareTeam;	

	@FindBy(xpath = "//input[@id='legalstatusid']")
	public WebElement LegalStatus;	

	@FindBy(xpath = "//input[@id='clinicalleadid']")
	public WebElement ClinicalLead;	

	@FindBy(xpath = "//input[@id='ethinicityid']")
	public WebElement Ethnicity;


	@FindBy(xpath = "//input[@id='militaryserviceid']")
	public WebElement Military;

	@FindBy(xpath = "//input[@id='residenttypeid']")
	public WebElement Resident;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement HousingStatus;

	@FindBy(xpath = "//input[@id='highestlevelofeducationid']")
	public WebElement HigherEducation;


	@FindBy(xpath = "//input[@id='personalemail']")
	public WebElement personalemail;

	@FindBy(xpath = "//input[@id='businessemail']")
	public WebElement Altmail;


	@FindBy(xpath = "//input[@id='preferedcommunicationid']")
	public WebElement preferedcommunicationid;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement homeadd1;

	@FindBy(xpath = "//input[@id='homeaddress2']")
	public WebElement homeadd2;

	@FindBy(xpath = "//input[@id='homeCountry']")
	public WebElement homeCountry;

	@FindBy(xpath = "//input[@id='homeState']")
	public WebElement homeState;

	@FindBy(xpath = "//input[@id='homeCity']")
	public WebElement homeCity;

	@FindBy(xpath = "//input[@id='homezip']")
	public WebElement homezip;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement docIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement docnumber;

	@FindBy(xpath = "//input[@id='issuedPlace']")
	public WebElement issuedPlace;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[3]/div[1]/ki-calendar[1]/div[1]/input[1]")
	public WebElement IssuedDate;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[3]/div[2]/ki-calendar[1]/div[1]/input[1]")
	public WebElement validfrom;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[1]/ki-calendar[1]/div[1]/input[1]")
	public WebElement validto;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-fo-landing/div[2]/app-frontoffice-patientregistration/div[1]/form/div/div[2]/accordion/accordion-group[2]/div/div[2]/div/div[1]/div[3]/lib-hismultiselect/div/div/button/span")
	public WebElement CommunicationType;

	@FindBy(xpath = "//input[@id='homezip']")
	public WebElement pincode;

	@FindBy(xpath = "//span[normalize-space()='Alternative']")
	public WebElement AlternateAddress;

	@FindBy(xpath = "//tab[@class='tab-pane active']//input[@id='businessaddress1']")
	public WebElement Alternateadd1;

	@FindBy(xpath = "//tab[@class='tab-pane active']//input[@id='businessaddress2']")
	public WebElement AlternateAdd2;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[1]/div[1]/div[1]")
	public WebElement foRelatedMrnotab;

	@FindBy(xpath = "//input[@id='relatedmrno']")
	public WebElement relatedmrno;

	@FindBy(xpath = "//input[@id='relation']")
	public WebElement relation;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/div[1]/div[1]/div[3]/div[2]/button[1]/label[1]")
	public WebElement add;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/label[1]/i[1]")
	public WebElement emcontact;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/ki-dialog-confirm[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement emcontactConfirmation;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[6]/div[1]/div[1]/div[1]/div[1]")
	public WebElement emergencycontact;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement EmergencyContact;

	@FindBy(xpath = "//div[contains(text(),'Emergency / Guardian / Other Contacts')]")
	public WebElement EmergencyContactinfo;


	@FindBy(xpath = "//label[normalize-space()='Guardian']//span[@class='checkmark']")
	public WebElement Guardian;

	@FindBy(xpath = "//label[normalize-space()='Same as Patient Address']//span[@class='checkmark']")
	public WebElement SameasPatientAddress;

	@FindBy(xpath = "//span[normalize-space()='Remarks']")
	public WebElement remarks;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement remarksarea;


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


	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[contains(text(),'Address Information')]")
	public WebElement AddressInformation;


	@FindBy(xpath = "//div[contains(text(),'Identifying Documents')]")
	public WebElement IDinfo;


	@FindBy(xpath = "//div[contains(text(),'Insurance and Other Information')]")
	public WebElement Insurance;

	@FindBy(xpath = "//div[contains(text(),'Family Members')]")
	public WebElement FamilyMemberInfo;


	@FindBy(xpath = "//div[@class='pat-info-group']//div[@class='pat-info-sub-title']")
	public WebElement Emergencyinfo;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Patient Info']")
	public WebElement PatientInfo;

	@FindBy(xpath = "//i[@class='ki ki-documents-fill']")
	public WebElement DocumentInfo;

	@FindBy(xpath = "//span[normalize-space()='Documents']")
	public WebElement Document;

	@FindBy(xpath = "//input[@id='filecategoryid']")
	public WebElement fILECATEGORY;

	@FindBy(xpath = "//input[@id='filesubcategoryid']")
	public WebElement SubCATEGORY;

	@FindBy(xpath = "//button[normalize-space()='Attach']")
	public WebElement Attach;

	@FindBy(xpath = "//i[@class='fa fa-eye']")
	public WebElement Eye;

	@FindBy(xpath = "//span[normalize-space()='Documents']")
	public WebElement documentstab;

	@FindBy(xpath = "//label[@title=' General Consent ']")
	public WebElement GeneralConsent;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Masters;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Resource']")
	public WebElement Resoursce;

	@FindBy(xpath = "//div[normalize-space()='Resource Master']")
	public WebElement ResoursceMaster;

	@FindBy(xpath = "//input[@id='resourcecategoryid']")
	public WebElement categoty;

	@FindBy(xpath = "//div[normalize-space()='Resource Mapping']")
	public WebElement resourceMapping;

	@FindBy(xpath = "//div[@class='col-md-4']//input[@id='resourcecategoryid']")
	public WebElement maincategory;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement save;

	@FindBy(xpath = "//input[@id='name1']")
	public WebElement ResoursceName;

	@FindBy(xpath = "//input[@id='resourcemasterlist']")
	public WebElement Resourscelist;

	@FindBy(xpath = "//div[@class='col-md-7']//input[@id='resourcecategoryid']")
	public WebElement SubCat;

	@FindBy(xpath = "//input[@placeholder='Search from List...']")
	public WebElement searchlist;

	@FindBy(xpath = "//ki-calendar[@id='todate']//input[@type='text']")
	public WebElement todate;

	@FindBy(xpath = "//input[@id='fromtime']")
	public WebElement FromTym;

	@FindBy(xpath = "//input[@id='totime']")
	public WebElement Totym;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//label[normalize-space()='Modules']")
	public WebElement Modules;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//div[@class='col-md-3 rtl-wth-20 mbl-pr0']//input[@id='relatedmrno']")
	public WebElement MRNO;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']//i[@class='ki ki-plus']")
	public WebElement emergencyAdd;

	@FindBy(xpath = "//label[normalize-space()='Set as Default Guardian']//span[@class='checkmark']")
	public WebElement Defaultguardian;

	@FindBy(xpath = "//tbody/tr[3]/td[1]/label[1]/i[1]")
	public WebElement Editguardian;


	@FindBy(xpath = "//input[@id='occupation']")
	public WebElement Occupation;

	@FindBy(xpath = "//input[@id='employmentstatus']")
	public WebElement EmployeeStatus;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	@FindBy(xpath = "//input[@id='highestlevelofeducationid']")
	public WebElement highestedu;

	@FindBy(xpath = "//input[@id='paidemptime']")
	public WebElement paidEmployment;


//	public void careTeam(String Careteam , String resource) throws InterruptedException, AWTException {
//
//
//		Thread.sleep(1000);
//		Hamburger.click();
//		Thread.sleep(800);
//		Masters.click();
//		Thread.sleep(500);
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		Thread.sleep(1000);
//
//		Resoursce.click();
//		Thread.sleep(800);
//		ResoursceMaster.click();
//		Thread.sleep(800);
//		categoty.click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//li[normalize-space()='Care Team']")).click();
//		Thread.sleep(800);
//		ResoursceName.click();
//		Thread.sleep(800);
//		ResoursceName.sendKeys(Careteam);
//		Thread.sleep(800);
//		save.click();
//		Thread.sleep(2000);
//
//		Robot t=new Robot();
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(400);
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//
//
//		Thread.sleep(3000);
//		Hamburger.click();
//		Thread.sleep(800);
//
//		resourceMapping.click();
//		Thread.sleep(800);
//		maincategory.click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//li[normalize-space()='Care Team']")).click();
//		Thread.sleep(800);
//		Resourscelist.click();
//		Thread.sleep(800);
//		Resourscelist.sendKeys(Careteam);
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//li[normalize-space()='"+Careteam+"']")).click();
//		Thread.sleep(800);
//		SubCat.click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
//		Thread.sleep(800);
//		searchlist.sendKeys(resource);
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//label[normalize-space()='"+resource+"']//span[@class='checkmark']")).click();
//		Thread.sleep(800);
//		todate.click();
//		Thread.sleep(800);
//
//		for (int i = 0; i < 6; i++) {
//
//			//Robot t=new Robot();
//			t.keyPress(KeyEvent.VK_DOWN);
//			t.keyRelease(KeyEvent.VK_DOWN);
//			Thread.sleep(400);
//
//		}
//
//		Thread.sleep(400);
//		//Robot t=new Robot();
//		t.keyPress(KeyEvent.VK_ENTER);
//		t.keyRelease(KeyEvent.VK_ENTER);
//
//		FromTym.click();
//		Thread.sleep(1000);
//		for (int i = 0; i <=5; i++) {
//			FromTym.sendKeys( Keys.BACK_SPACE);
//		} 
//		Thread.sleep(1000);
//		FromTym.sendKeys("00 00");
//		Thread.sleep(1000);
//
//		Totym.click();
//		Thread.sleep(1000);
//		for (int i = 0; i <=5; i++) {
//			Totym.sendKeys( Keys.BACK_SPACE);
//		}
//		Thread.sleep(1000);
//		Totym.sendKeys("23 45");
//		Thread.sleep(1000);
//
//		Add.click();
//		Thread.sleep(800);
//		save.click();
//
//		Thread.sleep(2000);
//
//
//		//	Robot t=new Robot();
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(400);
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//
//
//
//
//
//		Hamburger.click();
//		Thread.sleep(800);
//		Modules.click();
//		Thread.sleep(1000);
//
//	}
//








	public void patreg(String title,String Name,String Dob, String DocID, String MobNo,String MRNo,String AltMblNO,String familyName,String Organisation,String mail,String myhomeadd1,String myhomeadd2,String relatedMR,String Careteam , String resource) throws InterruptedException, AWTException, IOException {

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


		Title.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+title+"']")).click();
		Thread.sleep(500);
		EnterFirstNME.sendKeys(Name);
		Thread.sleep(500);
		middleName.click();
		Thread.sleep(800);
		middleName.sendKeys("k");
		Thread.sleep(800);
		String lastName1 =RandomString.lastName();
		
		System.out.println(lastName1 + "LastName" );
		LastName.click();
		Thread.sleep(500);
		LastName.sendKeys(lastName1);;
		Thread.sleep(800);


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

		AlternateMblNO.click();
		Thread.sleep(800);
		AlternateMblNO.sendKeys(AltMblNO);
		Thread.sleep(800);
		nationality.clear();
		Thread.sleep(800);
		nationality.sendKeys("Indian");
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Indian']")).click();
		Thread.sleep(600);
		EnterMob.sendKeys(MobNo);
		Thread.sleep(500);


		familyname.sendKeys(familyName);
		Thread.sleep(600);
		mothermaidenname.sendKeys("Kipa Fernadas");
		Thread.sleep(500);
		bloodgroup.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(text(),'B+')]")).click();
		Thread.sleep(600);
		nationality.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[contains(text(),'Indian')]")).click();
		Thread.sleep(600);
		preferedlanguageid.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//a[1]//span[1]//span[1]//span[1]//i[1]")).click();
		Thread.sleep(600);
		organisation.click();
		Thread.sleep(600);
		organisation.sendKeys(Organisation);
		Thread.sleep(600);
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		//vip.click();
		Thread.sleep(600);
		physicallychallenge.click();
		Thread.sleep(800);
		maritialStatus.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Single']")).click();
		Thread.sleep(500);
		BloodGroup.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='AB-']")).click();
		Thread.sleep(800);

		Occupation.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Other']")).click();
		Thread.sleep(500);
		
		//////////////Enter contact information

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ContactInformation);
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		personalemail.sendKeys(mail);
		Thread.sleep(600);
		Altmail.click();
		Thread.sleep(800);
		Altmail.sendKeys("Sfrvgirl@gmail.com");
		Thread.sleep(800);
		CommunicationType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[@title='Email']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[@title='Phone']")).click();
		Thread.sleep(800);
		preferedcommunicationid.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Email']")).click();
		Thread.sleep(600);
		homeadd1.sendKeys(myhomeadd1);
		Thread.sleep(600);
		homeadd2.sendKeys(myhomeadd2);
		pincode.click();
		Thread.sleep(800);
		pincode.sendKeys("234123");
		Thread.sleep(800);
		AlternateAddress.click();
		Thread.sleep(800);
		Alternateadd1.click();
		Thread.sleep(800);
		Alternateadd1.sendKeys("Dhoha garden");
		Thread.sleep(800);
		AlternateAdd2.click();
		Thread.sleep(800);
		AlternateAdd2.sendKeys("bahadhur street");
		Thread.sleep(800);


		//////////////Enter Document information

		js.executeScript("arguments[0].scrollIntoView();", DocumentIdentification);
		Thread.sleep(600);
		DocumentIdentification.click();
		Thread.sleep(1000);

		for (int i = 0; i <=15; i++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);


      String DOCID = RandomString.DOCID();
		
		EnterAadhar.sendKeys(DOCID );
		Thread.sleep(600);
		issuedPlace.sendKeys("Chennai");
		Thread.sleep(600); 
		IssuedDate.click();

		for (int i = 0; i <=7; i++) {	

			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_UP);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_UP);

		}
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER);


		validfrom.click();
		for (int i = 0; i <=3; i++) {	


			r.keyPress(KeyEvent.VK_UP);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_UP);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(600);


		validto.click();
		for (int i = 0; i <=3; i++) {	

			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(600);

		}



		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER);

		Clickadd.click();
		Thread.sleep(800);

		////Family Member

		js.executeScript("arguments[0].scrollIntoView();", foRelatedMrnotab);
		Thread.sleep(800);
		foRelatedMrnotab.click();
		Thread.sleep(600);
		relatedmrno.sendKeys(relatedMR);
		Thread.sleep(600);
		relatedmrno.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		relation.click(); 
		Thread.sleep(2000);
		//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//li[normalize-space()='Others']")));
		//Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Mother']")).click();
		Thread.sleep(600);
		add.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/label[1]/i[1]")).click();
		//emcontact.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(600);
		
		relatedmrno.sendKeys("G0000200526424");
		Thread.sleep(600);
		relatedmrno.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		relation.click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Father']")).click();
		Thread.sleep(600);
		add.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@title='Set As Emergency Contact']")).click();
		//emcontact.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(600);
		
		
		
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", EmergencyContact);


		///Emergeny contact
		Thread.sleep(600);
		EmergencyContact.click();
		Thread.sleep(600);
		Type.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Guardian']")).click();
		Thread.sleep(1000);
		MRNO.sendKeys("G0000200624924" , Keys.ENTER);
		Thread.sleep(2000);
		Defaultguardian.click();
		Thread.sleep(600);
		emergencyAdd.click();
		Thread.sleep(600);

		//Documents	


		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", documentstab);
		Thread.sleep(800);

		Document.click();
		Thread.sleep(1000);
		fILECATEGORY.click();
		driver.findElement(By.xpath("//li[normalize-space()='General']")).click();
		Thread.sleep(1000);
		SubCATEGORY.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Other']")).click();
		Thread.sleep(600);
		Attach.click();
		Thread.sleep(600);


		// copying File path to Clipboard
		StringSelection str = new StringSelection("C:\\Users\\sriram\\Pictures\\Screenshots\\prescription");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(1000);
		// press Contol+V for pasting
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(500);
		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);


		Eye.click();
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		rb.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);       


		///Remarks

		js.executeScript("arguments[0].scrollIntoView();", remarks);
		Thread.sleep(600);
		remarks.click();
		Thread.sleep(600);
		remarksarea.sendKeys("Patient is suffering from high fever");
		Thread.sleep(600);

		HowDidYouKnow.click();
		Thread.sleep(600);
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		Save.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(3000);
		
		

		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
		
		System.out.println(dynamicElement11.size());
		if(dynamicElement11.size() ==0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}
		
		

		////////	
		js.executeScript("arguments[0].scrollIntoView();", EmergencyContact);
		Thread.sleep(800);
		EmergencyContact.click();
		Thread.sleep(600);

		js.executeScript("arguments[0].scrollIntoView();", Editguardian);
		Thread.sleep(600);
		Editguardian.click();
		Thread.sleep(600);
		Defaultguardian.click();
		Thread.sleep(600);
		emergencyAdd.click();
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



	}



	public void PatientInfo(String provider) throws InterruptedException, AWTException {

		////Billing 

		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		//printuncheck.click();
		//Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);

		///Patient Info

		PatientInfo.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", AddressInformation);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", Insurance);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", IDinfo);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", FamilyMemberInfo);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", EmergencyContactinfo);
		Thread.sleep(2000);



		Thread.sleep(2000);
		DocumentInfo.click();
		Thread.sleep(1000);
		Eye.click();
		Thread.sleep(4000); 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);  





	}














}
