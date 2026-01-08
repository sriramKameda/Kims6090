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


public class KIMS_BirthRegistrationYasasiiWeb extends PageFactoryInitYasasiiWeb {

	public KIMS_BirthRegistrationYasasiiWeb(WebDriver driver) {

		super(driver);

	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;

	@FindBy(xpath = "//div[@class='module-icon-wrap active ng-star-inserted']//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

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

	@FindBy(xpath = "//label[normalize-space()='Emergency']//span[@class='checkmark']")
	public WebElement checkbox;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
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
	public WebElement SAve;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement OP;

	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement SelectIP;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[2]")
	public WebElement SelectPatient;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement UpArrow;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate;

	@FindBy(xpath = "//li[normalize-space()='Antenatal - TEM67']")
	public WebElement SelectTemplate;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement ClickOk;

	@FindBy(xpath = "//label[normalize-space()='Pregnant']//span[@class='checkmark']")
	public WebElement Pregnant;

	@FindBy(xpath = "//input[@id='obstetricscore']")
	public WebElement EnterObstreticScore;

	@FindBy(xpath = "//label[normalize-space()='Marital History']//span[@class='checkmark']")
	public WebElement MaritalStatus;

	@FindBy(xpath = "//input[@id='noofyears']")
	public WebElement EnterNoYears;

	@FindBy(xpath = "//label[normalize-space()='Conception']//span[@class='checkmark']")
	public WebElement Conseption;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEPharmacy;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
	public WebElement SelectMedicine;

	@FindBy(xpath = "//input[@id='prescriptiontypeid']")
	public WebElement Ongoing;

	@FindBy(xpath = "//li[normalize-space()='Ongoing']")
	public WebElement SelectOngoing;

	@FindBy(xpath = "//input[@id='prescriptionsubtypeid']")
	public WebElement Ownmedication;

	@FindBy(xpath = "//li[normalize-space()='Patient own medication']")
	public WebElement SelectOwnMedication;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement Cladd;

	@FindBy(xpath = "//*[@id=\"component_cpoe\"]/app-cpoe-container/div/div/div[1]/div[2]/div/div/div[1]/app-cpoe-pharmacy-list/form/div/div[3]/div[2]/div/div[1]")
	public WebElement Medicine2;

	@FindBy(xpath = "//input[@id='prescriptiontypeid']")
	public WebElement Past;

	@FindBy(xpath = "//li[contains(text(),'Past')]")
	public WebElement SelectPast;

	@FindBy(xpath = "//input[@id='prescriptionsubtypeid']")
	public WebElement OwnMedication;

	@FindBy(xpath = "//li[contains(text(),'Patient own medication')]")
	public WebElement SelectOnMedication;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement Cladd2;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement arrw;

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement sAVe;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement arw;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement doctrnote;

	@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
	public WebElement Selectcreate;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Enteremplate;

	@FindBy(xpath = "//li[contains(text(),'Delivery Note')]")
	public WebElement Selectemplate;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement Clickk;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Birth Notes']")
	public WebElement SelectBirthNote;

	@FindBy(xpath = "//input[@id='gestationperiodweeks']")
	public WebElement EnterGestationalAgeInWeeks;

	@FindBy(xpath = "//input[@id='genderid']")
	public WebElement Gender;

	@FindBy(xpath = "//li[contains(text(),'Female')]")
	public WebElement SelectGender;

	@FindBy(xpath = "//input[@id='birthweight']")
	public WebElement EnterWeight;

	@FindBy(xpath = "//input[@id='presentation']")
	public WebElement Presentation;

	@FindBy(xpath = "//li[contains(text(),'Breech')]")
	public WebElement SelectPresentation;

	@FindBy(xpath = "//input[@id='typeofdeliveryid']")
	public WebElement TypeOfDelivery;

	@FindBy(xpath = "//li[contains(text(),'Normal')]")
	public WebElement SelectNormal;

	@FindBy(xpath = "//i[@class='ki ki-note ng-star-inserted']")
	public WebElement APGARScore;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-scoretemplate-modal[1]/div[2]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement RespiratoryEffort;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-scoretemplate-modal[1]/div[2]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement SelectRespiratoryEffort;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/lib-scoretemplate-modal[1]/div[3]/button[1]")
	public WebElement CLickOk;

	@FindBy(xpath = "//input[@id='neonatalstatus']")
	public WebElement NeonatalStatus;

	@FindBy(xpath = "//li[contains(text(),'Alive')]")
	public WebElement SelectNeonatal;

	@FindBy(xpath = "//button[@id='childdetails_add_id']")
	public WebElement ADD;

	@FindBy(xpath = "//button[contains(@class,'icon emrsave')]")
	public WebElement SelectSave;

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement mentogle;

	@FindBy(xpath = "//div[@class='btn-module-back']")
	public WebElement modles;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement fomod;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement registration;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement SelectBirthRegisration;

	@FindBy(xpath = "//div[normalize-space()='Birth Registration']")
	public WebElement BirthRegitration;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement Selectpatient;

	@FindBy(xpath = "//label[contains(text(),'Select')]")
	public WebElement Selectselect;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Mobnum;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement clickSave;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement ClIckOK;

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
	public WebElement BEd;// input[@id='bedclass']

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectBEd;

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BEDno;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBEDno;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAVE;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar3']")
	public WebElement Menu;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MODules;

	@FindBy(xpath = "//label[normalize-space()='LMP']//span[@class='checkmark']")
	public WebElement LMP;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen1;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement Dropdown;

	@FindBy(xpath = "//input[@id='subcategory']")
	public WebElement NextDropdown;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement MyDeptIP;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[2]/i[1]")
	public WebElement SelectBaby;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement UpArrow1;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote1;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint1;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate1;

	@FindBy(xpath = "//li[contains(text(),'SOAP')]")
	public WebElement SelectTemplate1;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement ClickOk1;

	@FindBy(xpath = "//input[@id='ageInMonths']")
	public WebElement ageInMonths;

	@FindBy(xpath = "//div[contains(text(),'Child Development Chart')]")
	public WebElement ChildDevelopmentChart;

	@FindBy(xpath = "//div[contains(text(),'Social smile')]")
	public WebElement SocialSmile;

	@FindBy(xpath = "//textarea[@id='resultremarks']")
	public WebElement RemarksBaby;

	@FindBy(xpath = "/html/body/modal-container/div/div/div[2]/div/div/form/div/div/div/ki-input-control/div/input")
	public WebElement Remarks;

	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk2;

	@FindBy(xpath = "//div[contains(text(),'Eyes follow pen/pencil')]")
	public WebElement EyesFollow;

	@FindBy(xpath = "//div[contains(text(),'Child Language Evaluation Chart')]")
	public WebElement ChildLangEval;

	@FindBy(xpath = "//div[contains(text(),'Responds to bell/rattle/clap')]")
	public WebElement RespondsToBell;

	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk5;

	@FindBy(xpath = "//div[contains(text(),'Responds by smiling')]")
	public WebElement RespondsToSmile;

	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk6;

	@FindBy(xpath = "//div[contains(text(),'Listens when spoken to')]")
	public WebElement ListensWhenSpoken;

	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk7;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement SelectSave1;

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement mentogle1;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement modles1;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement fomod1;

	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement registran1;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement FoMenu1;

	@FindBy(xpath = "//li[contains(text(),'IP')]")
	public WebElement FoDropdown;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Search2;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[2]/i[1]")
	public WebElement SelectBaby1;

	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement Dischargestat;

	@FindBy(xpath = "//li[normalize-space()='Patient Requested']")
	public WebElement SelectDischargestat;

	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Disposition;

	@FindBy(xpath = "//li[normalize-space()='Discharged Home']")
	public WebElement SelectDisposition;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement DischargeSave;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement Selectpatient2;

	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement Dischargestat1;

	@FindBy(xpath = "//li[normalize-space()='Patient Requested']")
	public WebElement SelectDischargestat1;

	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Disposition1;

	@FindBy(xpath = "//li[normalize-space()='Discharged Home']")
	public WebElement SelectDisposition1;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement DischargeSave1;

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle pro-pic tab-prof-wrap']")
	public WebElement Logoutarw;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[contains(@class,'logout list-item')]")
	public WebElement Logoutbutton;

	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement Logoutconfrm;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement medicineSearch;

	@FindBy(xpath = "//app-cpoe-pharmacy-list//div[contains(@class,'card-header pb0')]//img[1]")
	public WebElement Star;

	@FindBy(xpath = "//i[contains(@class,'dashboard-lock ki ki-lock')]")
	public WebElement lock;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='genderid']")
	public WebElement gender;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/ki-calender-time[1]/div[1]/input[1]")
	public WebElement DOB;

	@FindBy(xpath = "//span[normalize-space()='Set']")
	public WebElement Set;

	@FindBy(xpath = "//input[@id='gestperiodmonths']")
	public WebElement Week;

	@FindBy(xpath = "//input[@id='gestperioddays']")
	public WebElement Days;

	@FindBy(xpath = "//input[@id='Term']")
	public WebElement Term;

	@FindBy(xpath = "//input[@id='Present']")
	public WebElement Prsntatn;

	@FindBy(xpath = "//input[@id='delv']")
	public WebElement TypeofDel;

	@FindBy(xpath = "//input[@id='neostatus']")
	public WebElement neoStatus;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement BabyREGSave;

	@FindBy(xpath = "//input[@id='numbaby']")
	public WebElement nObaby;

	@FindBy(xpath = "//input[@id='score0']")
	public WebElement Score;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT1;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "(//i[@class='ki ki-trash p0'])[1]")
	public WebElement deleteconsult;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement IP;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect1;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosis;

	@FindBy(xpath = "//span[normalize-space()='Discharge Recommendation']")
	public WebElement DisRecom;

	@FindBy(xpath = "//label[normalize-space()='Patient for Discharge']//span[contains(@class,'checkmark')]")
	public WebElement Dischargecheckbox;

	@FindBy(xpath = "//button[contains(@class,'icon emrsave')]")
	public WebElement EmrSave;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='EMR']")
	public WebElement EMR;

	@FindBy(xpath = "//div[normalize-space()='White Board']")
	public WebElement WhiteBoard;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[8]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement NameSearch;
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//i[@class='ki ki-info-circle']")
	public WebElement element;

	@FindBy(xpath = "//button[normalize-space()='Ready for discharge']")
	public WebElement REadyForDischarge;

	@FindBy(xpath = "//input[@id='enteredbynameview']")
	public WebElement verifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement verifyPassword;

	@FindBy(xpath = "//button[@id='verifyuser']")
	public WebElement verifySave;

	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EmrIcon;

	@FindBy(xpath = "//button[normalize-space()='Department Clearance']") // Clearance']
	public WebElement Depclearance;

	@FindBy(xpath = "//td[@class='ta-c']//span[@class='checkmark']")
	public WebElement PharmacyCheckbox;

	@FindBy(xpath = "//td[@class='ta-c']//span[@class='checkmark']")
	public WebElement pharmacycheckbox;

	@FindBy(xpath = "//tbody/tr[3]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement medicalclrnceCheckbox;

	@FindBy(xpath = "//button[normalize-space()='Pharmacy Clearance']")
	public WebElement pharmacyClearance;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOSearchField;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOPatientSelect;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement dischargeStatus;

	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement disposition;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSave;

	@FindBy(xpath = "//button[normalize-space()='Financial Clearance']")
	public WebElement FinancialClearance;

	@FindBy(xpath = "//button[normalize-space()='Physical Discharge']")
	public WebElement pysicalDischarge;

	@FindBy(xpath = "//button[@class='icon cpoeadmin']")
	public WebElement cpoeAdmin;

	@FindBy(xpath = "//label[normalize-space()='Immunization']")
	public WebElement Immunization;

	@FindBy(xpath = "(//i[@title='Add due date'])[1]")
	public WebElement BCG;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-immunization[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/label[1]/span[1]")
	public WebElement outsidehosp;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement remarks;

	@FindBy(xpath = "(//i[@title='Add due date'])[1]")
	public WebElement OPV0;

	@FindBy(xpath = "//i[@title='Add due date']")
	public WebElement hepatitis;

	@FindBy(xpath = "//div[3]//div[7]//span[1]//i[1]")
	public WebElement delete;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Saveimmunization;

	@FindBy(xpath = "//div[@class='table-row ng-star-inserted']//div[1]//div[7]//label[1]//span[1]//i[1]")
	public WebElement log;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;

	@FindBy(xpath = "//label[@title='Discharge Summary Clearance']")
	public WebElement DSClearance;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//label[@title='Add Registration']//i[@class='ki ki-doctor-fill']")
	public WebElement AddRegisteration;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//input[@id='admndischargestatusid']")
	public WebElement DischargeStatus;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement disgnosis;

	@FindBy(xpath = "//tbody/tr[2]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement radiology_imaging;

	@FindBy(xpath = "//tbody/tr[3]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement MedicalRecords;

	@FindBy(xpath = "//button[normalize-space()='Discharge Summary Clearance']")
	public WebElement Discharge_summary_Clearance;

	@FindBy(xpath = "//button[normalize-space()='Clinical Pharmacist Clearance']")
	public WebElement Clinical_Pharmacist_Clearance;

	@FindBy(xpath = "//div[@class='count ng-star-inserted']")
	public WebElement Task;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement fosave;

	@FindBy(xpath = "//div[@class='dl-body']//div[2]")
	public WebElement Visit;

	@FindBy(xpath = "//span[normalize-space()='Today']")
	public WebElement Today;

	@FindBy(xpath = "//div[@class='form-group zero-bottom ng-star-inserted']//input[@type='text']")
	public WebElement DOD;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement Report;

	@FindBy(xpath = "//ki-checkbox-control[@id='isdiagnosischk']//span[@class='checkmark']")
	public WebElement Disgnosis;

	@FindBy(xpath = "//label[normalize-space()='DS Initiated']//span[@class='checkmark']")
	public WebElement DSInitiated;

	@FindBy(xpath = "//label[normalize-space()='Draft Completed']//span[@class='checkmark']")
	public WebElement DraftCompleted;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement save;

	@FindBy(xpath = "//i[@class='ki ki-file-log']")
	public WebElement LOG1;

	@FindBy(xpath = "//label[@title='Draft Completed']")
	public WebElement DraftCompletedtask;

	@FindBy(xpath = "//label[normalize-space()='Verified']//span[@class='checkmark']")
	public WebElement verified;// label[normalize-space()='Verified']//span[@class='checkmark']

	@FindBy(xpath = "//label[normalize-space()='Authorize']//span[@class='checkmark']")
	public WebElement Authorize;

	@FindBy(xpath = "//button[normalize-space()='Print']")
	public WebElement print;

	@FindBy(xpath = "//i[@class='ki ki-bill']")
	public WebElement Finalbill;

	@FindBy(xpath = "//div[contains(text(),'Invoice Generation')]")
	public WebElement InvoiceGeneration;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ki-calendar[1]/div[1]/input[1]")
	public WebElement fromdate;

	@FindBy(xpath = "//button[normalize-space()='Draft Generate']")
	public WebElement DraftGenerate;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-alternate-invoice-generation[1]/div[1]/tabset[1]/div[1]/tab[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOsearch;

	@FindBy(xpath = "//div[@class='col-1 pl-0 col-md-1 ta-r']//button[@title='Search']")
	public WebElement finalBillSearch;

	@FindBy(xpath = "//span[normalize-space()='Invoice View']")
	public WebElement InvoiceView;

	@FindBy(xpath = "//div[@class='col-12 col-md-3 ta-r']//i[@class='ki ki-search']")
	public WebElement invoiceSearch;

	@FindBy(xpath = "//button[normalize-space()='Financial Clearance']")
	public WebElement Financial_Clearance;

	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	public WebElement options;

	@FindBy(xpath = "//label[normalize-space()='Draft Finalization']")
	public WebElement DraftFinalization;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='invoicemode']//input[@id='undefined']")
	public WebElement Invoicemode;

	@FindBy(xpath = "//li[normalize-space()='Draft Finalized']")
	public WebElement Draftfinalized;

	@FindBy(xpath = "//label[normalize-space()='Generate Invoice']")
	public WebElement GenerateInvoice;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;

	@FindBy(xpath = "//input[@id='babyskintoskincontactwithmotheratfirst5minutesofthedelivery']")
	public WebElement Skintoskin5minutes;

	@FindBy(xpath = "//input[@id='didskintoskinlastonehourormore']")
	public WebElement Skintoskin1Hour;

	@FindBy(xpath = "//input[@id='wasbabybreastfedduringthefirsthoursofdelivery']")
	public WebElement breastfeed;

	@FindBy(xpath = "//div[normalize-space()='Pharmacy Panel']")
	public WebElement Pharmacypanel;

	@FindBy(xpath = "//div[normalize-space()='IP Panel']")
	public WebElement IPpanel;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//i[contains(@class,'ki ki-bell')]") // i[@class='ki ki-bell ']
	public WebElement taskIcon;

	@FindBy(xpath = "//label[@title='Clinical Pharmacist Clearance']")
	public WebElement ClinicalPharmacistClearance;

	@FindBy(xpath = "//button[normalize-space()='Ready for discharge']")
	public WebElement readyForDischarge;

	@FindBy(xpath = "//label[@title='Ready for billing']")
	public WebElement readyForBilling;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement saveButton;
	
	 @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[11]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")
	 public WebElement WhentoObtain;
	
	 @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[12]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")
	 public WebElement HowtoObtain;
	
	

	public void patreg(String title, String NAME, String lastName, String DOB, String MBLNO, String ADDRESS,
			String DOCno, String MRNO) throws InterruptedException, IOException, AWTException {

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
		EnterFirstNME.sendKeys(NAME);
		Thread.sleep(500);
		String lastName1 =RandomString.lastName();
		
		System.out.println(lastName1 + "LastName" );
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastName1);
		Thread.sleep(500);

		EnterAge.click();
		Thread.sleep(500);

		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		EnterAge.sendKeys(DOB);
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		Thread.sleep(600);
		EnterMob.sendKeys(MBLNO);
		Thread.sleep(500);
		maritialStatus.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Single']")).click();
		Thread.sleep(500);

		ContactInformation.click();
		Thread.sleep(1000);
		EnterAddress.sendKeys(ADDRESS);
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Add1);
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
		fosave.click();
		Thread.sleep(3000);

		List<WebElement> dynamicElement11 = driver
				.findElements(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']"));

		System.out.println(dynamicElement11.size());
		if (dynamicElement11.size() != 0) {

			driver.findElement(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[@id='consentsave']//i[@class='ki ki-save']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
			Thread.sleep(1600);

		}

//		Thread.sleep(1600);
//	//	driver.findElement(By.xpath("//i[@class='ki ki-patient-bed-fill']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='item-icon']//i[@class='ki ki-reception-fill']")).click();
//		Thread.sleep(2000);

		////// Encounter
		Thread.sleep(3000);
		clear.click();
		Thread.sleep(1000);
		// printuncheck.click();
		// Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'" + Provider + "')]")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(3000);
		SAvesuccess.click();
		Thread.sleep(2000);

		String mrno = driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src = new File(Excelfilepath);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration = wb.getSheetAt(34);
		int i = BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		Thread.sleep(2000);

		///// Admit the patient

		ADT.click();
		Thread.sleep(1000);
		Thread.sleep(500);
		List<WebElement> dynamicElement111 = driver.findElements(By.xpath(
				"//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']"));

		if (dynamicElement111.size() != 0) {
			driver.findElement(By.xpath(
					"//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'" + ADTprovider + "')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);
		{

			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));
			// JavascriptExecutor js=(JavascriptExecutor)driver;
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
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
		Thread.sleep(500);
		SAve.click();
		Thread.sleep(2000);

		List<WebElement> dynamicElement1111 = driver
				.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if (dynamicElement1111.size() != 0) {
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

	}

	public void pregnantNOTE(String Name, String MRNo, String Provider, String DOCuser, String DOCpassword)
			throws InterruptedException, AWTException {

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		driver.get(URL);
		Thread.sleep(3000);

		userid.click();
		userid.sendKeys(ProviderID);
		password.click();
		password.sendKeys(Password);

		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		// MOdules.click();
		// EMR.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);
		OP.click();
		Thread.sleep(600);
		SelectIP.click();
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo + "')])[1]")).click();
		Thread.sleep(500);
		// UpArrow.click();
		Thread.sleep(500);
		// lock.click();

		/////// Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
		// List<WebElement>
		// dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create
		// New Note']"));
		//
		// if(dynamicElement.size() !=0)
		// {
		// driver.findElement(By.xpath("//button[normalize-space()='Create New
		// Note']")).click();
		// }

		Thread.sleep(1000);
		EnterChiefComplaint.clear();
		Thread.sleep(1000);
		EnterChiefComplaint.sendKeys("Pregnant");
		Thread.sleep(600);
		EnterTemplate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Antenatal Assessment']")).click();
		Thread.sleep(500);
		ClickOk.click();
		Thread.sleep(1500);
		// driver.findElement(By.xpath("//div[contains(text(),'Antenatal
		// Assessment')]")).click();

		LMP.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='owl-dt-control-button-arrow']")).click();
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);

		for (int i = 0; i < 9; i++) {

			t.keyPress(KeyEvent.VK_LEFT);
			t.keyRelease(KeyEvent.VK_LEFT);
			Thread.sleep(300);

		}

		Thread.sleep(400);

		for (int i = 0; i < 3; i++) {

			t.keyPress(KeyEvent.VK_ENTER);
			t.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(300);

		}
		Pregnant.click();
		Thread.sleep(500);
		EnterObstreticScore.sendKeys("2");
		Thread.sleep(500);
		MaritalStatus.click();
		Thread.sleep(500);
		EnterNoYears.sendKeys("3");
		Thread.sleep(500);
		Conseption.click();
		Thread.sleep(500);
		CPOEPharmacy.click();
		Thread.sleep(500);
		// Star.click();
		Thread.sleep(500);
		medicineSearch.click();
		Thread.sleep(500);
		medicineSearch.sendKeys("dolopar 650", Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
		Thread.sleep(500);

		Ongoing.click();
		Thread.sleep(1000);
		SelectOngoing.click();
		Thread.sleep(1000);
		OwnMedication.click();
		Thread.sleep(1000);
		SelectOwnMedication.click();
		Thread.sleep(1000);
		Cladd.click();
		Thread.sleep(1000);
		
//		  Medicine2.click(); Thread.sleep(500); Past.click(); SelectPast.click();
//		  OwnMedication.click(); SelectOnMedication.click(); Thread.sleep(500);
//		  Cladd2.click();
//		 /

		Thread.sleep(1000);
		// arrw.click();
		UpArrow.click();
		Thread.sleep(600);
		sAVe.click();
		Thread.sleep(10000);
		// arw.click();
		Thread.sleep(600);

	}
	///////// Select the delivery note template and add the details

	public void DeliveryNOTE() throws InterruptedException {
		
		
		Thread.sleep(10000);
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1 = driver
				.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if (dynamicElement1.size() != 0) {
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(1000);

		Thread.sleep(900);
		Enteremplate.click();
		Thread.sleep(900);
		driver.findElement(By.xpath("//li[normalize-space()='Delivery Note']")).click();
		Thread.sleep(900);
		ClickOk.click();
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(EmrSave));
		Thread.sleep(2000);
		
		SelectBirthNote.click();
		Thread.sleep(1000);
		//EnterGestationalAgeInWeeks.sendKeys("32");
		Thread.sleep(600);
		Gender.click();
		Thread.sleep(600);
		SelectGender.click();
		Thread.sleep(600);
		EnterWeight.sendKeys("3");
		Thread.sleep(600);
		Presentation.click();
		Thread.sleep(600);
		SelectPresentation.click();
		Thread.sleep(500);
		TypeOfDelivery.click();
		Thread.sleep(500);
		SelectNormal.click();
		Thread.sleep(500);
		APGARScore.click();
		Thread.sleep(500);
		Score.click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//input[@id='score1']")).click();
		Thread.sleep(1000);

		Thread.sleep(500);

		// RespiratoryEffort.click();//img[@src='../../../assets/img/icons/AddNewIcon.png']
		// Thread.sleep(2000);
		SelectRespiratoryEffort.click();
		// Thread.sleep(1000);
		CLickOk.click();
		Thread.sleep(1000);
		Thread.sleep(500);
		NeonatalStatus.click();
		Thread.sleep(500);
		SelectNeonatal.click();
		Thread.sleep(500);

		Skintoskin5minutes.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[4]//ul[1]//app-list-item[2]//li[1]")).click();
		Thread.sleep(500);
		Skintoskin1Hour.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Yes']")).click();
		breastfeed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Yes']")).click();
		Thread.sleep(500);

		ADD.click();
		// UpArrow.click();
		Thread.sleep(1000);
		SelectSave.click();
		Thread.sleep(3000);

	}

	public void Birthreg(String MRNo, String Provider, String ADTprovider, String Mrno1, String AdminUser,
			String AdminPassword) throws InterruptedException, IOException {

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
		userid.sendKeys(AdminUser);
		password.click();
		password.sendKeys(AdminPassword);
		Thread.sleep(1000);
		site.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));

		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		//////////// Take Fo and select Birth registration and register the baby
		// Hamburger.click();
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		// modles.click();
		Thread.sleep(1000);
		// fomod.click();

		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//div[@class='link-value'][normalize-space()='RCM']")).click();
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//div[normalize-space()='Approve
		// Request']")).click();
		// Thread.sleep(1000);

		Hamburger.click();
		Thread.sleep(1000);

		// driver.findElement(By.xpath("//div[@class='link-value'][normalize-space()='FO']")).click();
		// Thread.sleep(1000);

		BirthRegitration.click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement2 = driver.findElements(
				By.xpath("//ki-dialog-common//button[contains(@aria-label,'Ok')][normalize-space()='Yes']"));

		if (dynamicElement2.size() != 0) {
			driver.findElement(
					By.xpath("//ki-dialog-common//button[contains(@aria-label,'Ok')][normalize-space()='Yes']"))
					.click();
		}

		Thread.sleep(1000);

//		SelectBirthRegisration.click();
//		Thread.sleep(1000);
//		BirthRegitration.click();
//		Thread.sleep(800);

		EnterName.sendKeys(MRNo);
		Thread.sleep(1000);
		EnterName.sendKeys(Keys.ENTER);
		Thread.sleep(600);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo + "')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Select']")).click();

        String lastName =RandomString.lastName();
		
		System.out.println(lastName + "LastName" );
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastName);
		Thread.sleep(500);
		Thread.sleep(600);

		EnterMob.clear();
		Thread.sleep(1000);
		EnterMob.sendKeys("4512451236");
		// driver.findElement(By.xpath("//li[normalize-space()='Female']")).click();
		// Thread.sleep(1000);

		Thread.sleep(3000);
		BabyREGSave.click();
		Thread.sleep(3000);

		List<WebElement> dynamicElement11 = driver
				.findElements(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']"));

		System.out.println(dynamicElement11.size());
		if (dynamicElement11.size() != 0) {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']")));

			driver.findElement(By.xpath("//label[@class='check-container mr0']//span[@class='checkmark']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[@id='consentsave']//i[@class='ki ki-save']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
			Thread.sleep(1600);

		}

		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/label[1]/i[1]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]"))
				.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(clear));
		Thread.sleep(2000);
		clear.click();
		Thread.sleep(1000);// i[@class='ki ki-reception-fill']

		AddRegisteration.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);

		String mrno = driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src = new File(Excelfilepath);
		FileInputStream fis = new FileInputStream(src);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration = wb.getSheetAt(34);
		int i = BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);
		BirthRegistration.getRow(i).createCell(9).setCellValue(mrno);
		FileOutputStream fout = new FileOutputStream(src);

		wb.write(fout);

		////////// Admit the baby
		ADT.click();
		Thread.sleep(1000);
		Thread.sleep(500);
		List<WebElement> dynamicElement111 = driver.findElements(By.xpath(
				"//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']"));

		if (dynamicElement111.size() != 0) {
			driver.findElement(By.xpath(
					"//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'" + ADTprovider + "')])[1]")).click();
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
		driver.findElement(By.xpath("(//*[contains(text(),'Ultra-Deluxe')]) ")).click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[2]")).click();
		Thread.sleep(500);
		SAve.click();
		Thread.sleep(1000);

		Thread.sleep(2000);

		List<WebElement> dynamicElement1111 = driver
				.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"));

		if (dynamicElement1111.size() != 0) {
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-close-circle']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
	}

	public void babyNote(String MRNo1, String DOCuser, String DOCpassword) throws InterruptedException {

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
		userid.sendKeys(ProviderID);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));

		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		/////// Create doctor note for the baby
		Menu.click();
		Thread.sleep(5000);
		// MODules.click();
		Thread.sleep(1000);
		// EMR1.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1000);
		Dropdown.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);
		// NextDropdown.click();
		Thread.sleep(1000);
		// MyDeptIP.click();
		Thread.sleep(1000);
		EnterPatientName1.sendKeys(MRNo1, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo1 + "')])[1]")).click();
		Thread.sleep(1000);

		// SelectBaby.click();
		Thread.sleep(1000);
		// UpArrow.click();
		Thread.sleep(1000);
		// lock.click();

		Thread.sleep(3000);
		DoctorNote1.click();
		Thread.sleep(2000);
		List<WebElement> dynamicElement1 = driver
				.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if (dynamicElement1.size() != 0) {
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(1000);

		Thread.sleep(900);
		EnterChiefComplaint1.sendKeys("New Born Yellow");
		Thread.sleep(600);
		EnterTemplate1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		ClickOk.click();
		Thread.sleep(2500);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(sAVe));

		////////// Enter data in child development chart
		ChildDevelopmentChart.click();
		Thread.sleep(3000);
		SocialSmile.click();
		Thread.sleep(600);
		RemarksBaby.sendKeys("Baby is smiling while seeing face");
		Thread.sleep(600);
		ageInMonths.clear();
		Thread.sleep(600);
		ageInMonths.sendKeys("0");
		Thread.sleep(1000);
		ClickOk2.click();
		Thread.sleep(600);

		EyesFollow.click();
		Thread.sleep(500);
		ageInMonths.clear();
		Thread.sleep(600);
		ageInMonths.sendKeys("0");
		Thread.sleep(1000);
		ClickOk2.click();
		Thread.sleep(500);
		/*
		 * TransferObj.click(); Thread.sleep(1000); ClickOk4.click();
		 * Thread.sleep(1000);
		 */

		ChildLangEval.click();
		Thread.sleep(500);
		RespondsToBell.click();
		Thread.sleep(500);
		RemarksBaby.sendKeys("getting fine response");
		Thread.sleep(500);
		ClickOk2.click();
		Thread.sleep(500);
		RespondsToSmile.click();
		Thread.sleep(1000);
		RemarksBaby.sendKeys("Recognizing face and smiling back");
		Thread.sleep(500);
		ClickOk2.click();
		Thread.sleep(1000);
		sAVe.click();
		Thread.sleep(2000);

	}

	public void immunizationchart() throws InterruptedException {
		Thread.sleep(1000);
		cpoeAdmin.click();
		Thread.sleep(1000);
		Immunization.click();
		Thread.sleep(1000);
		BCG.click();
		Thread.sleep(1000);
		outsidehosp.click();
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//div[@class='immunization-table switch-rtl']//div[1]//div[2]//div[1]//div[5]//span[1]//i[1]"))
				.click();

		// RemarksBaby.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='remarks']")).sendKeys("baby from another hospital");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(1000);
		OPV0.click();
		Thread.sleep(1000);
		hepatitis.click();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"))
				.click();
		Thread.sleep(1000);
		Saveimmunization.click();
		Thread.sleep(2000);
		act.moveToElement(log).build().perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@class='icon refresh']")).click();
		Thread.sleep(1000);

	}

	public void dischargeRecommendationBaby(String MRNo1, String nurseUser, String DOCuser, String DOCpassword)
			throws InterruptedException, AWTException {

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
		userid.sendKeys(ProviderID);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));

		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		Thread.sleep(3000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		mainCategory.click();
		IP.click();
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo1);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo1 + "')])[1]")).click();
		Thread.sleep(1000);

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

		/*
		 * Thread.sleep(5000); UpArrow.click(); Thread.sleep(500); Lock1.click();
		 */
		/////// Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1 = driver
				.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if (dynamicElement1.size() != 0) {
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
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(EmrSave));
		Thread.sleep(2000);

		disgnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Mark as Final')]")).click();
		Thread.sleep(1000);

		DisRecom.click();
		Thread.sleep(1000);
		Dischargecheckbox.click();
		Thread.sleep(1000);
		DischargeStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000);

		// openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize1 = driver.getWindowHandles().size();
		int windowopen1 = Windowsize1 - 1;

		driver.switchTo().window(tabs1.get(windowopen1));
		driver.switchTo().window(tabs1.get(windowopen1));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		// login
		userid.click();
		userid.sendKeys(NurseID);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		// JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

	}

	public void dischargeApprovalBaby(String MRNo1, String nurseUser, String AdminUser, String AdminPassword)
			throws InterruptedException {

		/////////////// dischargeApproval

		// openNewTab

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

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		/// driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(2000);

		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView();", Clinical_Pharmacist_Clearance);
		Thread.sleep(2000);
		act.moveToElement(Clinical_Pharmacist_Clearance).click().build().perform();
		Thread.sleep(2000);
	}

	public void clinicalPharmasistclearance(String MRNo1, String nurseUser, String adminUser, String adminPassword)
			throws InterruptedException {
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

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(Pharmacist_Id);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		//// Clinical Pharmacist Clearance

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		 Pharmacypanel.click();
		
		IPpanel.click();

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

		 Close.click();
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(taskIcon));
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView();",taskIcon);
		Thread.sleep(1000);
		 taskIcon.click();
		Thread.sleep(1000);
		ClinicalPharmacistClearance.click();
		Thread.sleep(1000);

		Searchfield.sendKeys(MRNo1, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[5]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"))
				.click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//label[normalize-space()='New
		// Order']")).click();
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//label[@class='check-container
		// cust-label-chk']//span[@class='checkmark']")).click();
		// Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"))
				.click();
		Thread.sleep(1000);
	}

	//// ready for discharge // nurse
	public void readyForDischarge(String mRNo1, String nurseUser, String adminUser, String adminPassword)
			throws InterruptedException {

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

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		/// driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(2000);

		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(mRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView();", readyForDischarge);
		Thread.sleep(2000);
		act.moveToElement(readyForDischarge).click().build().perform();
		Thread.sleep(2000);

		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + NurseID + "')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		// Depclearance.click();
		Thread.sleep(1000);

		PharmacyCheckbox.click();
		Thread.sleep(1000);

		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + NurseID + "')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);

	}

	

	public void Discharge_Summary_Clearance(String MRDUser, String MRDPassword, String MRNo1, String DOCuser,
			String DOCpassword, String nurseUser, String Password) throws InterruptedException, AWTException {

		// openNewTab

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

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(MRDID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(MRDPassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		Menu.click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1000);

		Task.click();
		Thread.sleep(1000);
		DSClearance.click();
		Thread.sleep(1000);
		EnterPatientName1.sendKeys(MRNo1, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo1 + "')])[1]")).click();
		Thread.sleep(2000);

		List<WebElement> dynamicElement = driver.findElements(By.xpath("//div[@class='dl-body']//div[2]"));

		if (dynamicElement.size() == 0) {
			driver.findElement(By.xpath("//button[@class='icon discharesum']")).click();
			Thread.sleep(2000);
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		Visit.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(DOD));
		Thread.sleep(3000);		
		DOD.click();
		Thread.sleep(1000);
		Today.click();
		Thread.sleep(1000);
		Report.click();
		Thread.sleep(1000);
		Report.sendKeys(
				"ChatGPT is a chatbot developed by OpenAI and launched on November 30, 2022. Based on large language models, it enables users to refine and steer a conversation towards a desired length, format, style,");
		Thread.sleep(1000);
	
		
		Disgnosis.click();
		Thread.sleep(1000);
		WhentoObtain.click();
		Thread.sleep(1000);
		WhentoObtain.sendKeys("WhentoObtain");
		Thread.sleep(1000);
		HowtoObtain.click();
		Thread.sleep(1000);
		HowtoObtain.sendKeys("HowtoObtainHowtoObtain");
		Thread.sleep(1000);
		DSInitiated.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(3000);

		Visit.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(DraftCompleted));
		Thread.sleep(1000);		
		DraftCompleted.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(2000);

		Visit.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Preview']")));
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
		Thread.sleep(3000);
		LOG1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']//i[@class='ki ki-close-circle']"))
				.click();
		Thread.sleep(3000);

		//// Doctor verification

		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		// JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		Menu.click();
		Thread.sleep(2000);
		EMRHomeScreen.click();
		Thread.sleep(1000);

		Task.click();
		Thread.sleep(1000);
		DraftCompletedtask.click();
		Thread.sleep(1000);
		EnterPatientName1.sendKeys(MRNo1, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo1 + "')])[1]")).click();
		Thread.sleep(1000);

//
//		List<WebElement> dynamicElement1=driver.findElements(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/button[1]/button[5]/button[1]"));
//
//		if(dynamicElement1.size() !=0)
//		{
//			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/button[1]/button[5]/button[1]")).click();
//			Thread.sleep(2000);	
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
		Thread.sleep(1000);
		Visit.click();
		Thread.sleep(2500);
		
		
		Thread.sleep(1000);		
		verified.click();
		Thread.sleep(1000);
		Authorize.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(2000);
		Visit.click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
		// Thread.sleep(3000);
		/*
		 * print.click(); Thread.sleep(1000); driver.findElement(By.
		 * xpath("//span[@class='btn btn-primary sm active ng-star-inserted']")).click()
		 * ; Thread.sleep(1000);
		 * 
		 * Thread.sleep(3000); Robot t = new Robot(); t.keyPress(KeyEvent.VK_ESCAPE);
		 * t.keyRelease(KeyEvent.VK_ESCAPE); Thread.sleep(400);
		 * t.keyPress(KeyEvent.VK_ESCAPE); t.keyRelease(KeyEvent.VK_ESCAPE);
		 */

		/// Pharmacy Clearance
		Thread.sleep(1000);
		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
//			JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		/// driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(2000);

	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));

		Thread.sleep(2000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", readyForBilling);
		Thread.sleep(2000);
//		act.moveToElement(Depclearance).click().build().perform();
//		//Depclearance.click();
//		Thread.sleep(1000);
//
//		PharmacyCheckbox.click();
//		Thread.sleep(1000);
//
//
//		verifiedBy.click();
//		Thread.sleep(1000);
//		verifiedBy.sendKeys(NurseID);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click();
//		Thread.sleep(1000);
//		verifyPassword.click();
//		verifyPassword.sendKeys(Password);
//		Thread.sleep(1000);
//		verifySave.click();
//		Thread.sleep(2000);   

	}

	public void ADTapproval(String MRNo1, String FinalbillUser, String AdminUser, String AdminPassword)
			throws InterruptedException {

		// openNewTab
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

		// login
		userid.click();
		userid.sendKeys(FinalbillUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		/////////////////////////////// ADT aPProval
		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(800);
		FO.click();
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

		FOSearchField.click();
		Thread.sleep(1000);
		FOSearchField.sendKeys(MRNo1);
		Thread.sleep(1000);
		FOSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo1 + "')])[1]")).click();
		Thread.sleep(1000);

		Thread.sleep(500);
		List<WebElement> dynamicElement1 = driver
				.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement1.size() != 0) {
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		ADT.click();
		Thread.sleep(1000);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);

		Thread.sleep(2000);
		dischargeStatus.click();// input[@id='dischargestatus']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);
		disposition.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='To Home']")).click();
		Thread.sleep(2000);
		ADTSave.click();
		Thread.sleep(1000);
		
		Thread.sleep(500);
		List<WebElement> dynamicElement11 = driver
				.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//label[@class='dialog-title'][normalize-space()='Confirmation']"));

		if (dynamicElement11.size() != 0) {
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(3000);

	}

	public void financialClearance(String MRNo1, String FinalbillUser) throws InterruptedException {

		// openNewTab
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

		// login
		userid.click();
		userid.sendKeys(FinalbillUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Hamburger.click();
		Thread.sleep(1000);
		Finalbill.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='IP']")).click();
		Thread.sleep(2000);

		InvoiceGeneration.click();
		Thread.sleep(1000);
		fromdate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='owl-dt-calendar-cell-content'][normalize-space()='1']")).click();
		Thread.sleep(2000);
		MRNOsearch.sendKeys(MRNo1, Keys.ENTER);
		Thread.sleep(1000);
		finalBillSearch.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@title='Generate Invoice']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='check-container zero-label']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		DraftGenerate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);

		//// InvoiceView

		InvoiceView.click();
		Thread.sleep(1000);

		Invoicemode.click();
		Thread.sleep(1000);
		Draftfinalized.click();
		Thread.sleep(1000);

		Invoicemode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Draft']")).click();
		Thread.sleep(2000);
		invoiceSearch.click();
		Thread.sleep(1000);
		options.click();
		Thread.sleep(1000);
		DraftFinalization.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"))
				.click();
		Thread.sleep(2000);
		remarks.sendKeys("APPROVED");
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//div[@class='form-container invoice-view mb0']//div[@class='row justify-content-between']")).click();
//		Thread.sleep(2000);

		Invoicemode.click();
		Thread.sleep(1000);
		Draftfinalized.click();
		Thread.sleep(1000);
		invoiceSearch.click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		Financial_Clearance.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']"))
				.click();
		Thread.sleep(2000);

	}

	public void physicalDischarge(String MRNo1, String nurseUser, String AdminUser, String AdminPassword,
			String DOCuser, String DOCpassword) throws InterruptedException

	{

		////////////////////////// physical Discharge

		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		/// driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(2000);

		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));

		// driver.navigate().refresh(); */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(NameSearch));
		Thread.sleep(1000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='Incharge Provider']")).click();

		// driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pysicalDischarge);
		Thread.sleep(3000);
		act.moveToElement(pysicalDischarge).click().build().perform();

		Thread.sleep(1000);

		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + NurseID + "')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();

	}

	///////////////////////////// discharge mom

	public void dischargeRecommendationMOM(String MRNo, String nurseUser, String DOCuser, String DOCpassword,
			String AdminUser, String AdminPassword) throws InterruptedException, AWTException {

		// openNewTab
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
		// login
		userid.click();
		userid.sendKeys(ProviderID);
		password.click();
		password.sendKeys(Password);

		Thread.sleep(1000);
		site.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		Thread.sleep(3000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		mainCategory.click();
		IP.click();
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo + "')])[1]")).click();
		Thread.sleep(1000);

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

		/*
		 * Thread.sleep(5000); UpArrow.click(); Thread.sleep(500); Lock1.click();
		 */
		/////// Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1 = driver
				.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if (dynamicElement1.size() != 0) {
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
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(2000);

		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(EmrSave));
		Thread.sleep(1000);
				
		
		disgnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(2000);

		
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		driver.findElement(By.xpath("//div[contains(text(),'Mark as Final')]")).click();
		Thread.sleep(1000);

		DisRecom.click();
		Thread.sleep(1000);
		Dischargecheckbox.click();
		Thread.sleep(1000);
		DischargeStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000);

	}

	public void dischargeApprovalMOM(String MRNo, String nurseUser, String NursePassword, String AdminUser,
			String AdminPassword) throws InterruptedException {

		/////////////// dischargeApproval

		// openNewTab

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

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(NursePassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		/// driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
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

		js.executeScript("arguments[0].scrollIntoView();", Clinical_Pharmacist_Clearance);
		Thread.sleep(2000);
		act.moveToElement(Clinical_Pharmacist_Clearance).click().build().perform();
		Thread.sleep(2000);
	}

	public void clinicalPharmasistclearanceMOM(String mRNo, String nurseUser, String adminUser, String adminPassword)
			throws InterruptedException {
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

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(Pharmacist_Id);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		//// Clinical Pharmacist Clearance

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
	    Pharmacypanel.click();
		//Close.click();
		Thread.sleep(1000);
		IPpanel.click();

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

		 Close.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(taskIcon));
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView();",taskIcon);
		 taskIcon.click();
		Thread.sleep(1000);
		ClinicalPharmacistClearance.click();
		Thread.sleep(1000);

		Searchfield.sendKeys(mRNo, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[5]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"))
				.click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//label[normalize-space()='New
		// Order']")).click();
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//label[@class='check-container
		// cust-label-chk']//span[@class='checkmark']")).click();
		// Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"))
				.click();
		Thread.sleep(1000);
	}

	//// ready for discharge // nurse
	public void readyForDischargeMOM(String MRNo, String nurseUser, String AdminUser, String AdminPassword)
			throws InterruptedException {

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

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		/// driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
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

		js.executeScript("arguments[0].scrollIntoView();", readyForDischarge);
		Thread.sleep(2000);
		act.moveToElement(readyForDischarge).click().build().perform();
		Thread.sleep(2000);

		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + NurseID + "')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		// Depclearance.click();
		Thread.sleep(1000);

		PharmacyCheckbox.click();
		Thread.sleep(1000);

		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + NurseID + "')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);

	}

	/*
	 * verifiedBy.click(); Thread.sleep(1000); verifiedBy.sendKeys(NurseID);
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click()
	 * ; Thread.sleep(1000); verifyPassword.click();
	 * verifyPassword.sendKeys(Password); Thread.sleep(1000); verifySave.click();
	 * Thread.sleep(2000);
	 * 
	 * 
	 * 
	 * 
	 * ////Ready for Discharge
	 * 
	 * 
	 * NameSearch.clear(); Thread.sleep(1000); NameSearch.sendKeys(MRNo1);
	 * Thread.sleep(1000); SearchIcon.click(); Thread.sleep(1000);
	 * driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	 * Thread.sleep(2000);
	 * 
	 * js.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
	 * Thread.sleep(2000);
	 * act.moveToElement(REadyForDischarge).click().build().perform();
	 * Thread.sleep(2000);
	 * 
	 * verifiedBy.click(); Thread.sleep(1000); verifiedBy.sendKeys(NurseID);
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click()
	 * ; Thread.sleep(1000); verifyPassword.click();
	 * verifyPassword.sendKeys(Password); Thread.sleep(1000); verifySave.click();
	 * Thread.sleep(2000);
	 * 
	 * List<WebElement> dynamicElement=driver.findElements(By.
	 * xpath("//div[@class='modal ki-dialog fade in show']//label[@class='dialog-title'][normalize-space()='Confirmation']"
	 * ));
	 * 
	 * if(dynamicElement.size() !=0) { driver.findElement(By.
	 * xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"
	 * )).click(); Thread.sleep(2000); }
	 * 
	 * 
	 * else { System.out.println("sri"); } Thread.sleep(1000);
	 */

	/*
	 * verifiedBy.click(); Thread.sleep(1000); verifiedBy.sendKeys(NurseID);
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click()
	 * ; Thread.sleep(1000); verifyPassword.click();
	 * verifyPassword.sendKeys(NursePassword); Thread.sleep(1000);
	 * verifySave.click(); Thread.sleep(2000);
	 * 
	 * 
	 * 
	 * 
	 * ////Ready for Discharge
	 * 
	 * 
	 * NameSearch.clear(); Thread.sleep(1000); NameSearch.sendKeys(MRNo);
	 * Thread.sleep(1000); SearchIcon.click(); Thread.sleep(1000);
	 * driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	 * Thread.sleep(2000);
	 * 
	 * js.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
	 * Thread.sleep(2000);
	 * act.moveToElement(REadyForDischarge).click().build().perform();
	 * Thread.sleep(2000);
	 * 
	 * verifiedBy.click(); Thread.sleep(1000); verifiedBy.sendKeys(NurseID);
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click()
	 * ; Thread.sleep(1000); verifyPassword.click();
	 * verifyPassword.sendKeys(NursePassword); Thread.sleep(1000);
	 * verifySave.click(); Thread.sleep(2000); List<WebElement>
	 * dynamicElement=driver.findElements(By.
	 * xpath("//div[@class='modal ki-dialog fade in show']//label[@class='dialog-title'][normalize-space()='Confirmation']"
	 * ));
	 * 
	 * if(dynamicElement.size() !=0) { driver.findElement(By.
	 * xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"
	 * )).click(); Thread.sleep(2000); }
	 * 
	 * 
	 * else { System.out.println("sri"); } Thread.sleep(1000);
	 */

	public void Discharge_Summary_Clearance_MOM(String MRDUser, String MRDPassword, String MRNo, String DOCuser,
			String DOCpassword, String nurseUser) throws InterruptedException, AWTException {

		// openNewTab

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

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(MRDID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		Menu.click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1000);

		Task.click();
		Thread.sleep(1000);
		DSClearance.click();
		Thread.sleep(1000);
		EnterPatientName1.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo + "')])[1]")).click();
		Thread.sleep(2000);

		List<WebElement> dynamicElement = driver.findElements(By.xpath("//div[@class='dl-body']//div[2]"));

		if (dynamicElement.size() == 0) {
			driver.findElement(By.xpath("//button[@class='icon discharesum']")).click();
			Thread.sleep(2000);
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		Visit.click();
		Thread.sleep(1000);

		Thread.sleep(500);
		List<WebElement> dynamicElement1 = driver
				.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement1.size() != 0) {
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		DOD.click();
		Thread.sleep(1000);
		Today.click();
		Thread.sleep(1000);
		Report.click();
		Thread.sleep(1000);
		Report.sendKeys(
				"ChatGPT is a chatbot developed by OpenAI and launched on November 30, 2022. Based on large language models, it enables users to refine and steer a conversation towards a desired length, format, style,");
		Thread.sleep(1000);
		Disgnosis.click();
		Thread.sleep(1000);
		WhentoObtain.click();
		Thread.sleep(1000);
		WhentoObtain.sendKeys("WhentoObtain");
		Thread.sleep(1000);
		HowtoObtain.click();
		Thread.sleep(1000);
		HowtoObtain.sendKeys("HowtoObtainHowtoObtain");
		Thread.sleep(1000);
		DSInitiated.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(2000);

		Visit.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(DraftCompleted));
		Thread.sleep(1000);		
		DraftCompleted.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(2000);

		Visit.click();
		Thread.sleep(2500);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Preview']")));
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
		Thread.sleep(3000);
		LOG1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']//i[@class='ki ki-close-circle']"))
				.click();
		Thread.sleep(3000);

		//// Doctor verification

		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
//				JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		Menu.click();
		Thread.sleep(2000);
		EMRHomeScreen.click();
		Thread.sleep(1000);

		Task.click();
		Thread.sleep(1000);
		DraftCompletedtask.click();
		Thread.sleep(1000);
		EnterPatientName1.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo + "')])[1]")).click();
		Thread.sleep(2000);
		Visit.click();
		Thread.sleep(1000);
		Thread.sleep(500);
		List<WebElement> dynamicElement11 = driver
				.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement11.size() != 0) {
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(verified));
		Thread.sleep(1000);
		verified.click();
		Thread.sleep(1000);
		Authorize.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(3000);
		Visit.click();
		Thread.sleep(1000);

		Thread.sleep(500);
		List<WebElement> dynamicElement111 = driver
				.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement111.size() != 0) {
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		// Thread.sleep(500);
		// List<WebElement>
		// dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Preview']"));
		//
		// if(dynamicElement.size() !=0)
		// {
		// driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
		// Thread.sleep(3000);
		// }
		//
		//
		// else {
		// System.out.println("no preview avilable");
		// }
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
		// Thread.sleep(3000);

//		print.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']")).click();
//		Thread.sleep(1000);	
//		Robot t=new Robot();
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(400);
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		t.keyRelease(KeyEvent.VK_ESCAPE);

		/// Pharmacy Clearance

		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		// JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		/// driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(2000);

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));

		Thread.sleep(2000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
//		Thread.sleep(3000);
//		act.moveToElement(Depclearance).click().build().perform();
//		//Depclearance.click();
//		Thread.sleep(1000);
//
//		PharmacyCheckbox.click();
//		Thread.sleep(1000);
//
//
//		verifiedBy.click();
//		Thread.sleep(1000);
//		verifiedBy.sendKeys(NurseID);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click();
//		Thread.sleep(1000);
//		verifyPassword.click();
//		verifyPassword.sendKeys(Password);
//		Thread.sleep(1000);
//		verifySave.click();
//		Thread.sleep(2000);   

	}

	public void ADTapprovalMOM(String MRNo, String nurseUser, String AdminUser, String AdminPassword)
			throws InterruptedException {

		// openNewTab

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

		// login
		userid.click();
		userid.sendKeys(AdminUser);
		password.click();
		password.sendKeys(AdminPassword);
		Thread.sleep(1000);
		site.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(800);
		FO.click();
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

		FOSearchField.click();
		Thread.sleep(1000);
		FOSearchField.sendKeys(MRNo);
		Thread.sleep(1000);
		FOSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + MRNo + "')])[1]")).click();
		Thread.sleep(1000);

		Thread.sleep(500);
		List<WebElement> dynamicElement1 = driver
				.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if (dynamicElement1.size() != 0) {
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"))
					.click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		ADT.click();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);

		Thread.sleep(2000);
		dischargeStatus.click();// input[@id='dischargestatus']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);
		disposition.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='To Home']")).click();
		Thread.sleep(1000);
		ADTSave.click();
		Thread.sleep(1000);
		
		Thread.sleep(500);
		List<WebElement> dynamicElement11 = driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//label[@class='dialog-title'][normalize-space()='Confirmation']"));

		if (dynamicElement11.size() != 0) {driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}

		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);

	}

	public void financialClearanceMOM(String MRNo, String AdminUser, String AdminPassword) throws InterruptedException {

		// openNewTab
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

		// login
		userid.click();
		userid.sendKeys(FinalbillUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Hamburger.click();
		Thread.sleep(1000);
		Finalbill.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='IP']")).click();
		Thread.sleep(2000);

		InvoiceGeneration.click();
		Thread.sleep(1000);
		fromdate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='owl-dt-calendar-cell-content'][normalize-space()='1']")).click();
		Thread.sleep(2000);
		MRNOsearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(1000);
		finalBillSearch.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@title='Generate Invoice']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='check-container zero-label']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		DraftGenerate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);

		//// InvoiceView

		InvoiceView.click();
		Thread.sleep(1000);

		Invoicemode.click();
		Thread.sleep(1000);
		Draftfinalized.click();
		Thread.sleep(1000);

		Invoicemode.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Draft']")).click();
		Thread.sleep(2000);
		invoiceSearch.click();
		Thread.sleep(1000);
		options.click();
		Thread.sleep(1000);
		DraftFinalization.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"))
				.click();
		Thread.sleep(2000);
		remarks.sendKeys("APPROVED");
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//div[@class='form-container invoice-view mb0']//div[@class='row justify-content-between']")).click();
//		Thread.sleep(2000);

		Invoicemode.click();
		Thread.sleep(1000);
		Draftfinalized.click();
		Thread.sleep(1000);
		invoiceSearch.click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		Financial_Clearance.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']"))
				.click();
		Thread.sleep(2000);

	}

	public void physicalDischargeMOM(String MRNo, String nurseUser) throws InterruptedException {

		//// physical Discharge

		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);

		// login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")));
		driver.findElement(By.xpath("//*[contains(text(),'" + Site + "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

		/// driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(2000);

		// driver.navigate().refresh(); */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(NameSearch));
		Thread.sleep(1000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='Incharge Provider']")).click();

		// driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pysicalDischarge);
		Thread.sleep(3000);
		act.moveToElement(pysicalDischarge).click().build().perform();

		Thread.sleep(1000);

		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'" + NurseID + "')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		Thread.sleep(1000);
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);
		SearchIcon.click();
		Thread.sleep(2000);
	}

}
