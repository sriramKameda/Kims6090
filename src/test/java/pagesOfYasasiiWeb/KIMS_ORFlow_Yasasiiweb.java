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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class KIMS_ORFlow_Yasasiiweb extends PageFactoryInitYasasiiWeb{

	public KIMS_ORFlow_Yasasiiweb(WebDriver driver) {
		super(driver);

	}



	////Registration


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement hamberger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement billprint;

	@FindBy(xpath="//i[@title='Addendum']")
	public WebElement Addendum;

	@FindBy(xpath="//textarea[@id='addendum']")
	public WebElement AddendumTestarea;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;

	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement address;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement DocID;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement aadharNo;

	@FindBy(xpath = "//button[@id='adddoc']//label")
	public WebElement docAdd;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other information']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Ins/Corp')]//input[@id='undefined']")
	public WebElement Inscorp;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Plan name')]//input[@id='undefined']")
	public WebElement PlanName;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;

	@FindBy(xpath = "//button[contains(@class,'btn-feedback')]")
	public WebElement howDidYouKnow;

	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
	public WebElement OKhowDidYouKnow;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;

	////Encounter

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add2;

	@FindBy(xpath = "//button[@title='Add Scheme Setting']")
	public WebElement SchemeAdd;


	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;


	///ADT

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

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAve;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[normalize-space()='EMR HomeScreen']")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")    
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement Diagnosis;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement CPOEService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement enternameofProcedure;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEMedicine;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement entermedicine;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Referral']")
	public WebElement referral;

	@FindBy(xpath = "//div[@class='col-md-6 md-height-dropdown-list']//input[@id='rhtonamewithid']")
	public WebElement referralprovider;

	@FindBy(xpath = "//input[@id='timeframeid']")
	public WebElement timeframe;

	@FindBy(xpath = "//li[normalize-space()='Urgent']")
	public WebElement selecttimeframe;

	@FindBy(xpath = "//textarea[@id='reason']")
	public WebElement remarksadd;

	@FindBy(xpath = "//div[@class='col-md-12 ta-r rtl-right pr-0']//button[@type='button'][normalize-space()='Add']")
	public WebElement referraladd;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement maincategory;

	@FindBy(xpath = "//li[normalize-space()='Pending Orders']")
	public WebElement pendingorder;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ot-landing[1]/div[2]/app-otview[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]")
	public WebElement selectslot;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[3]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/label[2]/i[1]")
	public WebElement anestheEdit;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='attendeegradeid']//input[@id='undefined']")
	public WebElement grade;

	@FindBy(xpath = "//li[normalize-space()='Senior']")
	public WebElement selectgrade;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group ki-dropdown']//input[@id='undefined']")
	public WebElement anesthesiaclick;

	@FindBy(xpath = "//li[normalize-space()='Block Anesthesia']")
	public WebElement selectanesthesia;

	@FindBy(xpath = "//button[@id='subresourceaddid']")
	public WebElement add;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/label[2]/i[1]")
	public WebElement surgeonedit;

	@FindBy(xpath = "//li[normalize-space()='Senior Surgeon']")
	public WebElement selectsugrade;

	@FindBy(xpath = "//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement reportingstatus;

	@FindBy(xpath = "//li[normalize-space()='Day Case']")
	public WebElement Daycase;

	@FindBy(xpath = "//button[@id='appointmentsaveid']")
	public WebElement saveschedule;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement saveok;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement togglebar;

	@FindBy(xpath = "//div[normalize-space()='OR Authorization']")
	public WebElement orAuthorization;

	@FindBy(xpath = "//input[@id='searchmrno']")
	public WebElement searchMRNo;

	@FindBy(xpath = "//ki-checkbox-control[@class='ng-untouched ng-pristine ng-valid']//label[@class='check-container min-top']//span[@class='checkmark']")
	public WebElement authorizedcheckbox;

	@FindBy(xpath = "//div[normalize-space()='OR Tracking Board']")
	public WebElement ORTrackingboard;

	@FindBy(xpath = "//th[normalize-space()='Status']")
	public WebElement status;

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle pro-pic tab-prof-wrap']")
	public WebElement username;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[contains(@class,'item-name')][normalize-space()='Logout']")
	public WebElement logout1;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement logoutConfirm;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement eterMRNo;

	@FindBy(xpath = "//button[@class='icon cpoeadmin']")
	public WebElement CPOEAdministration;

	@FindBy(xpath = "//label[normalize-space()='Operation Room']")
	public WebElement OperatioRoom;

	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement checkboxselect;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement VerifiedBy;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement Save;

	@FindBy(xpath = "//input[@id='globalpasswordpassword']")
	public WebElement Passwordfield;

	@FindBy(xpath = "//input[@id='rejectquantity']")
	public WebElement rejectedQua;

	@FindBy(xpath = "//input[@id='verifiedbyname']")
	public WebElement Nurseverifiesby;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement verifiedPass;

	@FindBy(xpath = "//span[normalize-space()='Today']")
	public WebElement today;

	@FindBy(xpath = "//input[@placeholder='Search Resource..']")
	public WebElement searchOR;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Resource;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement resourceType;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[1]/div[3]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement Department;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[1]/div[4]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement Name;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='anesthesiatype']//input[@id='undefined']")
	public WebElement AnesthesiaType;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[2]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Grade;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//input[@id='reportingStatusId']")
	public WebElement reportingStatus;

	@FindBy(xpath = "//div[@class='count ng-star-inserted']")
	public WebElement Task;

	@FindBy(xpath = "//label[@title='IP Referral']")
	public WebElement IPReferaral;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath = "//input[@id='guarantorphonehome']")
	public WebElement ERmob;

	@FindBy(xpath = "//label[normalize-space()='Modules']")
	public WebElement Modules;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Masters;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='OR']")
	public WebElement OR;

	@FindBy(xpath = "//div[normalize-space()='Preference Card']")
	public WebElement PrefrenceCard;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='OR']")
	public WebElement OR1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-orpreferencecardmaster[1]/lib-or-preferencecard[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]")
	public WebElement PrefrenceCardName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-orpreferencecardmaster[1]/lib-or-preferencecard[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Item;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='serviceitemtypeid']//input[@id='undefined']")
	public WebElement itemType;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-orpreferencecardmaster[1]/lib-or-preferencecard[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement name;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-orpreferencecardmaster[1]/lib-or-preferencecard[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement medcinename;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-orpreferencecardmaster[1]/lib-or-preferencecard[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement QTY;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-orpreferencecardmaster[1]/lib-or-preferencecard[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Qtyunit;

	@FindBy(xpath = "//div[normalize-space()='Attendee Splitup']")
	public WebElement AttendeeSplitup;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement ORSave;

	@FindBy(xpath = "//input[@id='attendeeSplitup']")
	public WebElement Splitup;

	@FindBy(xpath = "//input[@id='totalCount']")
	public WebElement totalCount;

	@FindBy(xpath = "//input[@id='grade']")
	public WebElement Grade1;

	@FindBy(xpath = "//input[@id='gradeCount']")
	public WebElement Count;

	@FindBy(xpath = "//button[@id='attendeesplitupsave']")
	public WebElement attendeesplitupsave;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement Name1;

	@FindBy(xpath = "//button[@id='surgerytypesave']")
	public WebElement Surgerytypesave;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement serviceName1;

	@FindBy(xpath = "//input[@id='attendeeCategory']")
	public WebElement Category;

	@FindBy(xpath = "//div[normalize-space()='Surgery Type']")
	public WebElement Surgerytype;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM-OR']")
	public WebElement RCM_OR;

	@FindBy(xpath = "//div[normalize-space()='Parameter Setting']")
	public WebElement parameter_setting;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ot-parameter-setting[1]/div[2]/app-ot-parameter-settings-edit[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Rulename;

	@FindBy(xpath = "//ki-select-control[contains(@formcontrolname,'surgerytypeid')]//input[@id='undefined']")
	public WebElement ProcedureType;

	@FindBy(xpath = "//ki-select-control[contains(@formcontrolname,'procedurepriorityid')]//input[@id='undefined']")
	public WebElement ProcedurePriority;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='parameterid']//input[@id='undefined']")
	public WebElement ParameterName;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='linkparameterid']//input[@id='undefined']")
	public WebElement LinkParameter;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ot-parameter-setting[1]/div[2]/app-ot-parameter-settings-edit[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]")
	public WebElement LinkPercentage;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='additionalparametertypeid']//input[@id='undefined']")
	public WebElement AdtlParameterType;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='additionalparameterid']//input[@id='undefined']")
	public WebElement AdtlParameterName;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='splitupconditionid']//input[@id='undefined']")
	public WebElement SplitupCondition;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement ParameterSave;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement Search1;

	@FindBy(xpath = "//button[@id='Savebutton']")
	public WebElement Update;

	@FindBy(xpath = "//div[normalize-space()='Attendee Income Splitup']")
	public WebElement AttendeeIncomeSplitup;

	@FindBy(xpath = "//input[@id='undefined']")
	public WebElement AttendeeSplitName;

	@FindBy(xpath = "//label[@class='table-action-icons']//i[@class='ki ki-pencil']")
	public WebElement Edit;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ot-attendee-income-splitup[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement percentage;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement Update1;

	@FindBy(xpath = "//div[contains(text(),'Parameter Rule Mapping')]")
	public WebElement ParameterRuleMapping;

	@FindBy(xpath = "//input[@placeholder='Search reference name...']")
	public WebElement refsearch;



	////Service master

	@FindBy(xpath="//div[normalize-space()='Service Master']")
	public WebElement  ServiceMaster;

	@FindBy(xpath="//input[@id='rootinvcatgeoryser']")
	public WebElement  categoryMaster;

	@FindBy(xpath="//input[@id='servicecategoryser']")
	public WebElement  Subcategory;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-orpreferencecardmaster[1]/lib-or-preferencecard[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement  serviceName;

	@FindBy(xpath="//span[@class='btn btn-link ng-star-inserted'][normalize-space()='Site Mapping']")
	public WebElement SiteMap;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement ServiceCheck;

	@FindBy(xpath="//i[@class='ki ki-chevron-double-right']")
	public WebElement MoveRight;

	@FindBy(xpath="//i[@class='fa fa-exclamation-triangle red']")
	public WebElement Triangle;

	@FindBy(xpath="//input[@id='internallabid']")
	public WebElement internalLab;

	@FindBy(xpath="//input[@id='executioncategoryid']")
	public WebElement Executioncategory;

	@FindBy(xpath="//label[normalize-space()='Modules']")
	public WebElement modules;

	@FindBy(xpath="//input[@id='codetype']")
	public WebElement codetype;

	@FindBy(xpath="//input[@id='tempcode']")
	public WebElement Code;

	@FindBy(xpath="//div[@class='code-table-wrapper']//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath="//textarea[@id='description']")
	public WebElement Description;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement AllowedSite;

	@FindBy(xpath="//input[@id='mappingsearchkey']")
	public WebElement Basedon;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement SearchType;

	@FindBy(xpath="//span[@id='searchservice']//i[@class='ki ki-search']")
	public WebElement Search;

	@FindBy(xpath="//i[@class='ki ki-chevron-double-right']")
	public WebElement doubleright;

	@FindBy(xpath="//a[normalize-space()='Map Details']")
	public WebElement mapall;

	@FindBy(xpath="//input[@id='executioncategoryid']")
	public WebElement ExecutionCategory;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='RCM-Plan']")
	public WebElement RCM_plan;

	@FindBy(xpath="//div[normalize-space()='Tariff Setting']")
	public WebElement tariffsetting;

	@FindBy(xpath="//span[@class='btn btn-link ng-star-inserted'][normalize-space()='Services']")
	public WebElement Service1;

	@FindBy(xpath="//ki-select-control[@formcontrolname='servicetypeid']//input[@id='undefined']")
	public WebElement ServiceType;

	@FindBy(xpath="//input[@id='basecategoryid']")
	public WebElement BaseCategory;

	@FindBy(xpath="//input[@id='serviceidBilling']")
	public WebElement ServiceName1;

	@FindBy(xpath="//span[normalize-space()='Charge Parameter']")
	public WebElement Charge_Parameter;

	@FindBy(xpath="//input[@id='encountersubmodeid']")
	public WebElement Submode;

	@FindBy(xpath="//input[@id='paymodeid']")
	public WebElement Paymode;



	@FindBy(xpath="//span[normalize-space()='Charge - Tax']")
	public WebElement Charge_tax;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement BAseCharge;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ContractCharge;

	@FindBy(xpath = "//input[@id='serviceid']")
	public WebElement Surgerytype1;

	@FindBy(xpath = "//input[@id='otrulemasterid']")
	public WebElement ORRULE;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-cpoe-service-orderdetails[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/tabset[1]/ul[1]/li[3]/a[1]/span[1]")
	public WebElement PrefcardUsage;

	@FindBy(xpath = "//input[@id='serviceitemtypeid']")
	public WebElement RESCategory;

	@FindBy(xpath = "//input[@id='item']")
	public WebElement ResourceName;

	@FindBy(xpath = "//span[@title='Add']//i[@class='ki ki-plus']")
	public WebElement ResAdd;

	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Reason;

	@FindBy(xpath = "//li[normalize-space()='Others']")
	public WebElement Others;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[6]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[2]/i[1]")
	public WebElement AnesthetistEdit;

	@FindBy(xpath = "//i[@class='ki ki-inventory']")
	public WebElement inventory;

	@FindBy(xpath = "//input[@id='sublocationid']")
	public WebElement location;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Indent']")
	public WebElement indent;

	@FindBy(xpath = "//div[normalize-space()='Patient Indent']")
	public WebElement Patient_Indent;

	@FindBy(xpath = "//input[@id='statusid']")
	public WebElement Status;

	@FindBy(xpath = "//div[@class='form-group min-clear-bottom ng-star-inserted']//input[@id='mrno']")
	public WebElement MRNOSearch;

	@FindBy(xpath = "//span[@title='Search']//i[@title='Search']")
	public WebElement indentSearch;

	@FindBy(xpath = "(//span[@class='checkmark'])[1]")
	public WebElement indent1;

	@FindBy(xpath = "//span[@class='checkmark ng-star-inserted']")
	public WebElement StatusCheck;

	@FindBy(xpath = "//span[normalize-space()='Update']")
	public WebElement UpdateINV;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Transfer']")
	public WebElement Transfer;

	@FindBy(xpath = "//div[normalize-space()='Stock Transfer']")
	public WebElement StockTransfer;

	@FindBy(xpath = "//span[normalize-space()='Indent']")
	public WebElement Indent;

	@FindBy(xpath = "//input[@id='isgeneralindent']")
	public WebElement Indenttype;

	@FindBy(xpath = "//input[@id='indenttypeid']")
	public WebElement Indenttype1;

	@FindBy(xpath = "//div[@class='plt-prt-5 plt']//input[@id='phreqlocid']")
	public WebElement fromLOC;

	@FindBy(xpath = "//div[@class='col-md-5 plt-prt-5']//input[@id='phisslocid']")
	public WebElement ToLoc;

	@FindBy(xpath = "//div[@class='col-md-12 plt-prt-5']//input[@id='searchtxt']")
	public WebElement indentSearch1;

	@FindBy(xpath = "//i[@title='Search with Indent No/ MRNO/ Patient Name']")
	public WebElement Search2;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-inventory-landing/app-transfer/div[2]/div[1]/div/div[2]/div/div/div/tabset/div/tab/table/tbody/tr[1]/td[3]/label/input")
	public WebElement Item1;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-inventory-landing/app-transfer/div[2]/div[1]/div/div[2]/div/div/div/tabset/div/tab/table/tbody/tr[2]/td[3]/label/input")
	public WebElement Item2;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-inventory-landing/app-transfer/div[2]/div[1]/div/div[2]/div/div/div/tabset/div/tab/table/tbody/tr[3]/td[3]/label/input")
	public WebElement Item3;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-inventory-landing/app-transfer/div[2]/div[1]/div/div[2]/div/div/div/tabset/div/tab/table/tbody/tr[4]/td[3]/label/input")
	public WebElement item4;

	@FindBy(xpath = "//span[normalize-space()='Transfer']")
	public WebElement Transfer1;

	@FindBy(xpath = "(//input[@id='statusid'])[2]")
	public WebElement status2;

	@FindBy(xpath = "//div[@class='plt-prt-5 plt']//input[@id='phisslocid']")
	public WebElement fromLOCtransfer;

	@FindBy(xpath = "//div[contains(@class,'col-md-5 plt-prt-5')]//input[@id='phreqlocid']")
	public WebElement ToLocTransfer;

	@FindBy(xpath = "//input[@id='mrno']")
	public WebElement searchMRNO;

	@FindBy(xpath = "//label[normalize-space()='Submit']//span[contains(@class,'checkmark')]")
	public WebElement Submit;

	@FindBy(xpath = "//tab[@id='1']//div[@class='row']//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement TransferDetails;

	@FindBy(xpath = "//span[contains(@class,'checkmark ng-star-inserted')]")
	public WebElement Verify;

	@FindBy(xpath = "//div[contains(text(),'Stock Receive')]")
	public WebElement Stock_receive;

	@FindBy(xpath = "(//span[contains(@class,'checkmark')])[1]")
	public WebElement Receiveindent1;

	@FindBy(xpath = "//label[contains(@class,'check-container pl-3')]//span[contains(@class,'checkmark')]")
	public WebElement recieveCheck;

	@FindBy(xpath = "//button[@id='btnreceiveStock']")
	public WebElement receiveStockSave;

	@FindBy(xpath = "//label[normalize-space()='Preference Card Usage']")
	public WebElement PrefcardUsage1;

	@FindBy(xpath = "(//span[@class='checkmark'])[3]")
	public WebElement Verifyitem;

	@FindBy(xpath = "//span[@class='ng-star-inserted']//i[@class='ki ki-save']")
	public WebElement SavePrefUsage;

	@FindBy(xpath = "//input[@id='searchitem']")
	public WebElement SearchItem;

	@FindBy(xpath = "//label[normalize-space()='Authorize']//span[@class='checkmark']")
	public WebElement Authorize;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Orders;

	@FindBy(xpath = "//input[@id='primaryamount']")
	public WebElement OTPrimaryAmount;

	@FindBy(xpath = "//button[@id='calculatesurgerycharges']")
	public WebElement Applycharge;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement OTBillSave;

	@FindBy(xpath = "//i[@class='ki ki-cash-transfer-fill']")
	public WebElement AvailedServices;

	@FindBy(xpath = "//i[@class='ki ki-search text-white']")
	public WebElement SearchBill;

	@FindBy(xpath = "//i[@class='fa pointer fa-chevron-right ng-star-inserted']")
	public WebElement RightArrow;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM']")
	public WebElement RCM;

	@FindBy(xpath = "//div[contains(text(),'Back End Billing')]")
	public WebElement Backendbilling;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-back-end-billing/div/tabset/div/tab[1]/form/div[1]/div/div[3]/ki-input-control/div/input")
	public WebElement MRNOSearch1;

	@FindBy(xpath = "//div[@class='col-lg-2 col-6 col-md-2 mbl-pl0 mb10 icon-space']//i[@class='ki ki-search']")
	public WebElement Searchbill;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-back-end-billing[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[5]/label[1]/button[1]/i[1]")
	public WebElement Searchbill1;

	@FindBy(xpath = "//form[contains(@class,'ng-untouched ng-valid ng-dirty')]//button[@type='button'][normalize-space()='Generate']")
	public WebElement Generate;

	@FindBy(xpath="	//span[normalize-space()='Pharmacy']")
	public WebElement Pharmacy;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-back-end-billing[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOSearch2;

	@FindBy(xpath="//i[contains(@class,'ki ki-bill')]")
	public WebElement Finalbilling;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-interim-bill[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNO;

	@FindBy(xpath="//span[2]//ki-checkbox-control[1]//label[1]//label[1]//span[1]")
	public WebElement Statement;

	@FindBy(xpath="//i[@class='ki ki-print']")
	public WebElement Print;



	public void serviceMasterOR(String ServiceName) throws InterruptedException, AWTException {


		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		Masters.click();
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

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Service );
		Thread.sleep(400);
		Service.click();
		Thread.sleep(400);
		ServiceMaster.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();

		categoryMaster.clear();
		Thread.sleep(400);
		categoryMaster.click();
		Thread.sleep(400);
		categoryMaster.sendKeys("Major Procedure");
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='Major Procedure']")).click();
		Thread.sleep(400);
		serviceName1.clear();
		Thread.sleep(400);
		serviceName1.sendKeys(ServiceName);
		Thread.sleep(400);
		codetype.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='CDT Code']")).click();
		Thread.sleep(400);
		Code.clear();
		Thread.sleep(400);
		Code.sendKeys("NUR-001");
		Thread.sleep(400);
		Add2.click();
		Thread.sleep(400);

		js.executeScript("arguments[0].scrollIntoView();",SiteMap );
		Thread.sleep(400);
		SiteMap.click();
		Thread.sleep(400);

		js.executeScript("arguments[0].scrollIntoView();",SiteMap );
		Thread.sleep(400);
		ServiceCheck.click();
		Thread.sleep(400);
		MoveRight.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[@id='servicemastersave']")).click();
		Thread.sleep(2000); 

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade blockoutside in show']//label[@class='dialog-title'][normalize-space()='Information']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("(//*[contains(text(),'OK')])[1]")).click();
			Thread.sleep(2000);
		}


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);   
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);


		/////Tariff

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(700);
		RCM_plan.click();
		Thread.sleep(700);
		tariffsetting.click();
		Thread.sleep(700);
		refsearch.click();
		Thread.sleep(700);
		refsearch.sendKeys("Default" , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='Default']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[1]/label[1]/a[1]/i[1]")));
		Thread.sleep(2000);		

		Service1.click();
		Thread.sleep(700);
		ServiceType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Surgery']")).click();
		Thread.sleep(700);
		BaseCategory.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(700);
		ServiceName1.sendKeys("Baria");
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+ServiceName+"']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Inclusion']")).click();
		Thread.sleep(700);

		Charge_Parameter.click();
		Thread.sleep(700);


		Submode.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(700);
		Paymode.click();
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//label[@title='Add submode and paymode']//i[@class='ki ki-plus']")).click();
		Thread.sleep(700);



		Charge_Parameter.click();
		Thread.sleep(700);
		Charge_tax.click();
		Thread.sleep(700);
		BAseCharge.click();
		Thread.sleep(700);
		BAseCharge.sendKeys("15000");
		Thread.sleep(700);
		ContractCharge.sendKeys("15000");
		Thread.sleep(700);
		js.executeScript("arguments[0].scrollIntoView();",Add2 );
		Thread.sleep(400);
		SchemeAdd.click();
		Thread.sleep(700);

		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		Update1.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(700);




	}

	public void OR_Master(String ServiceName, String PrefcardName) throws InterruptedException, AWTException {



		hamberger.click();
		Thread.sleep(700);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",OR1 );
		Thread.sleep(400);

		OR1.click();
		Thread.sleep(700);
		PrefrenceCard.click();
		Thread.sleep(700);
		serviceName.sendKeys(ServiceName);
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+ServiceName+"']")).click();
		Thread.sleep(2000); 
		PrefrenceCardName.sendKeys(PrefcardName);
		Thread.sleep(700);

		////Human resource


		//		Item.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='Human Resource']")).click();
		//		Thread.sleep(1000); 
		//		itemType.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='Anesthetist']")).click();
		//		Thread.sleep(1000); 
		//		name.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='Sam(sam)']")).click();
		//		Thread.sleep(1000); 
		//		Add2.click();
		//		Thread.sleep(700);



		Item.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Human Resource']")).click();
		Thread.sleep(1000); 
		itemType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Circulating Nurse']")).click();
		Thread.sleep(1000); 
		name.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Sujitha MS(NGL17744)']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(700);


		//		Item.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='Human Resource']")).click();
		//		Thread.sleep(1000);  
		//		itemType.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='Floor Nurse']")).click();
		//		Thread.sleep(1000); 
		//		name.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='Jency J(NGL17742)']")).click();
		//		Thread.sleep(1000); 
		//		Add2.click();
		//		Thread.sleep(700);

		Item.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Human Resource']")).click();
		Thread.sleep(1000); 
		itemType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000); 
		name.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+ADTprovider+"']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(700);

		Item.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Human Resource']")).click();
		Thread.sleep(1000); 
		itemType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Scrub Nurse']")).click();
		Thread.sleep(1000); 
		name.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Beni S(NGL17734)']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(700);


		//		Item.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='Human Resource']")).click();
		//		Thread.sleep(1000); 
		//		itemType.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='Surgeon']")).click();
		//		Thread.sleep(1000); 
		//		name.click();
		//		driver.findElement(By.xpath("//li[normalize-space()='Sam S(SamS123)']")).click();
		//		Thread.sleep(1000); 
		//		Add2.click();
		//		Thread.sleep(700);

		////consumables

		Item.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Consumable']")).click();
		Thread.sleep(1000); 
		medcinename.sendKeys("Abdominal Binder Large");
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='ABDOMINAL BINDER LARGE -TYNOR']")).click();
		Thread.sleep(1000); 
		QTY.sendKeys("5");
		Thread.sleep(700);
		Qtyunit.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(700);

		Item.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Consumable']")).click();
		Thread.sleep(1000); 
		medcinename.sendKeys("COTTON ROLL I.P. 500GM");
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='COTTON ROLL I.P. 500GM']")).click();
		Thread.sleep(1000); 
		QTY.sendKeys("5");
		Thread.sleep(700);
		Qtyunit.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(700);	

		Item.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Consumable']")).click();
		Thread.sleep(1000); 
		medcinename.sendKeys("NEBULIZER MASK PAEDIATRIC ROMSON");	
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='NEBULIZER MASK PAEDIATRIC ROMSON']")).click();
		Thread.sleep(1000); 
		QTY.sendKeys("3");
		Thread.sleep(700);
		Qtyunit.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(700);

		Item.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Consumable']")).click();
		Thread.sleep(1000); 
		medcinename.sendKeys("STERILE GLOVES 7.5");
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='STERILE GLOVES 7.5']")).click();
		Thread.sleep(1000); 
		QTY.sendKeys("12");
		Thread.sleep(700);
		Qtyunit.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(700);

		///////Medicines


		Item.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(1000); 
		medcinename.sendKeys("ZOVIRAX SUSPENSION 100ML");	
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='ZOVIRAX SUSPENSION 100ML']")).click();
		Thread.sleep(1000); 
		QTY.sendKeys("3");
		Thread.sleep(700);
		Qtyunit.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(700);


		Item.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(1000); 
		medcinename.sendKeys("MORPHINE 50MG TAB");	
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='MORPHINE 50MG TAB']")).click();
		Thread.sleep(1000); 
		QTY.sendKeys("2");
		Thread.sleep(700);
		Qtyunit.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(700);


		Item.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(1000); 
		medcinename.sendKeys("ALTHROCIN 250MG TAB");	
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='ALTHROCIN 250MG TAB']")).click();
		Thread.sleep(1000); 
		QTY.sendKeys("25");
		Thread.sleep(700);
		Qtyunit.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(700);

		Item.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(1000); 
		medcinename.sendKeys("MIRAGO S 50MG TAB");	
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='MIRAGO S 50MG TAB']")).click();
		Thread.sleep(1000); 
		QTY.sendKeys("25");
		Thread.sleep(700);
		Qtyunit.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(700);
		Save.click();
		Thread.sleep(1700);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);




	}


	public void AttendeeSplitup() throws InterruptedException, AWTException {

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		AttendeeSplitup.click();
		Thread.sleep(700);
		Category.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Surgeon']")).click();
		Thread.sleep(1000); 
		Splitup.sendKeys("SurgeonSplitup");
		Thread.sleep(700);
		totalCount.sendKeys("2");
		Thread.sleep(700);
		Grade1.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Senior Surgeon']")).click();
		Thread.sleep(1000); 
		Count.sendKeys("2");
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[@class='icon-btn btn-dark-green inline']")).click();
		Thread.sleep(1000); 
		attendeesplitupsave.click();
		Thread.sleep(1500);


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		/////Surgery Type

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(700);
		Surgerytype.click();
		Thread.sleep(700);


		Name1.sendKeys("Scheduled ");
		Thread.sleep(700);
		Surgerytypesave.click();
		Thread.sleep(1500);

		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


	}

	public void OR_ParameterSetting(String ParameterRulename,String ServiceName) throws InterruptedException {

		//		Thread.sleep(1000);
		//		hamberger.click();
		//		Thread.sleep(1000);
		//		Masters.click();
		//		Thread.sleep(600);
		//		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		//
		//		if(dynamicElement1.size() !=0)
		//		{
		//			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		}
		//
		//
		//		else {
		//			System.out.println("sri");
		//		}
		//		Thread.sleep(600);
		//
		//		Thread.sleep(1000);
		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		RCM_OR.click();
		Thread.sleep(700);
		parameter_setting.click();
		Thread.sleep(700);

		Rulename.sendKeys(ParameterRulename);
		Thread.sleep(700);
		ProcedureType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
		Thread.sleep(1000); 
		ProcedurePriority.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Primary']")).click();
		Thread.sleep(1000); 
		ParameterName.click();
		driver.findElement(By.xpath("//app-list-item[@id='droplistkey4']//li[contains(@class,'uparrow-yellow')][normalize-space()='Anaesthesia Fee']")).click();
		Thread.sleep(1000); 
		LinkParameter.click();
		driver.findElement(By.xpath("//li[normalize-space()='Primary Billing Parameter']")).click();
		Thread.sleep(1000); 
		LinkPercentage.sendKeys("60");
		Thread.sleep(700);
		AdtlParameterType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		AdtlParameterName.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='General']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(1700);


		//Rulename.sendKeys(ParameterRulename);
		//Thread.sleep(700);
		ProcedureType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
		Thread.sleep(1000); 
		ProcedurePriority.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Primary']")).click();
		Thread.sleep(1000); 
		ParameterName.click();
		driver.findElement(By.xpath("//li[normalize-space()='Anaesthesia Fee']")).click();
		Thread.sleep(1000); 
		LinkParameter.click();
		driver.findElement(By.xpath("//li[normalize-space()='Primary Billing Parameter']")).click();
		Thread.sleep(1000); 
		LinkPercentage.sendKeys("20");
		Thread.sleep(700);
		//		SplitupCondition.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("//li[normalize-space()='Senior Alone(Anesthetist)']")).click();
		//		Thread.sleep(1000);
		AdtlParameterType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		AdtlParameterName.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Local']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(1700);


		//	Rulename.sendKeys(ParameterRulename);
		//	Thread.sleep(700);
		ProcedureType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
		Thread.sleep(1000); 
		ProcedurePriority.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Primary']")).click();
		Thread.sleep(1000); 
		ParameterName.click();
		driver.findElement(By.xpath("//li[normalize-space()='Anaesthetist Fee']")).click();
		Thread.sleep(1000); 
		LinkParameter.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Theater Fee']")).click();
		Thread.sleep(1000); 
		LinkPercentage.sendKeys("50");
		Thread.sleep(700);
		SplitupCondition.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Senior Alone(Anesthetist)']")).click();
		Thread.sleep(1000);
		AdtlParameterType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		AdtlParameterName.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='General']")).click();
		Thread.sleep(1000); 
		Add2.click();
		Thread.sleep(1700);

		//	Rulename.sendKeys(ParameterRulename);
		//	Thread.sleep(700);
		ProcedureType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
		Thread.sleep(1000); 
		ProcedurePriority.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Primary']")).click();
		Thread.sleep(1000); 
		ParameterName.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Post OP Care Fee']")).click();
		Thread.sleep(1000); 
		LinkParameter.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Theater Fee']")).click();
		Thread.sleep(1000); 
		LinkPercentage.sendKeys("40");
		Thread.sleep(700);
		Add2.click();
		Thread.sleep(1700);

		//	Rulename.sendKeys(ParameterRulename);
		//	Thread.sleep(700);
		ProcedureType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
		Thread.sleep(1000); 
		ProcedurePriority.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Primary']")).click();
		Thread.sleep(1000); 
		ParameterName.click();
		driver.findElement(By.xpath("//li[normalize-space()='Surgeon Fee']")).click();
		Thread.sleep(1000); 
		LinkParameter.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Primary Billing Parameter']")).click();
		Thread.sleep(1000); 
		LinkPercentage.sendKeys("50");
		Thread.sleep(700);
		SplitupCondition.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Senior Alone(Surgeon)']")).click();
		Thread.sleep(1000);
		Add2.click();
		Thread.sleep(1700);

		//	Rulename.sendKeys(ParameterRulename);
		//	Thread.sleep(700);
		ProcedureType.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
		Thread.sleep(1000); 
		ProcedurePriority.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Primary']")).click();
		Thread.sleep(1000); 
		ParameterName.click();
		driver.findElement(By.xpath("//li[normalize-space()='Theater Fee']")).click();
		Thread.sleep(1000); 
		LinkParameter.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Primary Billing Parameter']")).click();
		Thread.sleep(1000); 
		LinkPercentage.sendKeys("50");
		Thread.sleep(700);
		Add2.click();
		Thread.sleep(1700);


		ParameterSave.click();
		Thread.sleep(1700);
		//driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("(//*[contains(text(),'OK')])[1]"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("(//*[contains(text(),'OK')])[1]")).click();
			Thread.sleep(2000);
		}

		else
		{

		}

		//		driver.findElement(By.xpath("(//*[contains(text(),'OK')])[1]")).click();
		//		Thread.sleep(2000);

		Search1.sendKeys(ParameterRulename, Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='"+ParameterRulename+"']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[@id='common_edit_icon_0']//i[@class='ki ki-pencil']")).click();
		Thread.sleep(1700);
		Update.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(700);

		///Attendee Income Splitup


		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		AttendeeIncomeSplitup.click();
		Thread.sleep(700);
		Search1.clear();
		Thread.sleep(700);
		Search1.sendKeys(ParameterRulename, Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='"+ParameterRulename+"']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(700);
		AttendeeSplitName.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Senior Alone(Anesthetist)']")).click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(700);
		percentage.clear();
		Thread.sleep(700);
		percentage.sendKeys("100");
		Thread.sleep(700);
		Add2.click();
		Thread.sleep(700);
		Update1.click();
		Thread.sleep(1500);
		saveok.click();
		Thread.sleep(700);


		Thread.sleep(700);
		Search1.clear();
		Thread.sleep(700);
		Search1.sendKeys(ParameterRulename, Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='"+ParameterRulename+"']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(700);
		AttendeeSplitName.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Senior Alone(Anesthetist)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='ki ki-pencil'])[2]")).click();
		Thread.sleep(1000);
		Thread.sleep(700);
		percentage.clear();
		Thread.sleep(700);
		percentage.sendKeys("100");
		Thread.sleep(700);
		Add2.click();
		//		Thread.sleep(700);
		//		driver.findElement(By.xpath("(//i[@class='ki ki-pencil'])[3]")).click();
		//		Thread.sleep(1000);
		//		Thread.sleep(700);
		//		percentage.clear();
		//		Thread.sleep(700);
		//		percentage.sendKeys("50");
		//		Thread.sleep(700);
		//		Add2.click();
		Thread.sleep(700);
		Update1.click();
		Thread.sleep(1500);
		saveok.click();
		Thread.sleep(700);



		Thread.sleep(700);
		Search1.clear();
		Thread.sleep(700);
		Search1.sendKeys(ParameterRulename, Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='"+ParameterRulename+"']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(700);
		AttendeeSplitName.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Senior Alone(Surgeon)']")).click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(700);
		percentage.clear();
		Thread.sleep(700);
		percentage.sendKeys("100");
		Thread.sleep(700);
		Add2.click();
		Thread.sleep(700);
		Update1.click();
		Thread.sleep(1500);
		saveok.click();
		Thread.sleep(700);



		/////Parameter Rule mapping

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(700);
		ParameterRuleMapping.click();
		Thread.sleep(700);
		refsearch.click();
		Thread.sleep(700);
		refsearch.sendKeys("Default" , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='Default']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(2700);
		Surgerytype1.click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//li[normalize-space()='"+ServiceName+"']")).click();
		Thread.sleep(1000);
		ORRULE.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+ParameterRulename+"']")).click();
		Thread.sleep(1000);
		Thread.sleep(700);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);

	}




	//////////////Register a patient with mandatory field entering


	public void patReg(String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE ) throws InterruptedException, IOException, AWTException {

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		Thread.sleep(1000);

		List<WebElement> dynamicElement0=driver.findElements(By.xpath("//i[@class='ki ki-reception-fill']"));

		if(dynamicElement0.size() ==0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
			Thread.sleep(1000);
			FO.click();
			Thread.sleep(1000);
		}

		else
		{
			FO.click();
			Thread.sleep(1000);
		}

		
		driver.findElement(By.xpath("//div[normalize-space()='Registration']")).click();


		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}



		Thread.sleep(1000);
		Title.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys(NAME);
		Thread.sleep(1000);
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastname);
		Thread.sleep(500);
		age.click();
		Thread.sleep(1000);
		age.sendKeys(AGE);
		Thread.sleep(1000);
		mobileNo.click();
		Thread.sleep(1000);
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			aadharNo.sendKeys( Keys.BACK_SPACE);
		}
		//aadharNo.click();
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);

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

		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='TV']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
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



		//////Encounter

		clear.click();
		Thread.sleep(1000);
		//	billprint.click();
		//	Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();

		Thread.sleep(1000);
		Add2.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		SAvesuccess.click(); 
		Thread.sleep(1000);

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(1000);


		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(44);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(10).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(1000);



	}

	public void ADT() throws InterruptedException{



		ADT.click();
		Thread.sleep(1000);
		Thread.sleep(500);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);

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
		driver.findElement(By.xpath("(//*[contains(text(),'Transfer nursing station')])[1]")).click();
		//SelectBed.click();
		Thread.sleep(500);
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



	//////////Adding Major procedure in doctor note

	public void addingmajorprocedure(String MRNO,String ServiceName,String Medicine,String refProvider,String docid,String docpassword,String Nuruser,String PrefcardName) throws InterruptedException, AWTException {

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(2000);

		////////login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ProviderID);    
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(500);


		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		/////doctornote
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);

		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(2000);

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

		/*	UParrow.click();
			Thread.sleep(1000);
			act.doubleClick(UParrow).perform();
			Thread.sleep(1000);
			lock.click();
			Thread.sleep(1000); */
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 


		cheifComplaint.clear();
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(800);
		tempOk.click();
		Thread.sleep(1000);

		Diagnosis.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);



		//////////Adding procedure

		driver.findElement(By.xpath("//label[normalize-space()='CPOE Service']")).click();
		Thread.sleep(2000);
		enternameofProcedure.sendKeys(ServiceName, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'" + ServiceName + "')]")).click();
		Thread.sleep(2000);
		//	driver.findElement(By.xpath("//label[normalize-space()='Gynecological Surgery']")).click();
		//	Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='woundclassid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Class I']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='isbloodtrans-1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='ispostopicubed-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='implantotherdevice']")).sendKeys("No");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='isinfectiousdesease-1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//textarea[@id='equipinstramentremark']")).sendKeys("Yes");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='isansethetistinformed-0']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[normalize-space()='General']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//textarea[@id='clinicalindication']")).sendKeys("Clinical indication added");
		Thread.sleep(500);


		//PrefcardUsage.click();

		driver.findElement(By.xpath("//span[normalize-space()='"+PrefcardName+"']")).click();
		Thread.sleep(500);

		Thread.sleep(500);
		RESCategory.click();
		Thread.sleep(500);
		RESCategory.sendKeys("nurse");
		Thread.sleep(500);
		//driver.findElement(By.xpath("(//font[contains(text(),'Nurse')])[3]")).click();
		Thread.sleep(500);
		ResourceName.sendKeys(NurseID);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[contains(text(),'" + NurseID + "')]")).click();
		Thread.sleep(2000);
		ResAdd.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='orderdetails_add']")).click();
		Thread.sleep(500);

		//////////Adding OR Medicine

		Thread.sleep(500);
		CPOEMedicine.click();
		Thread.sleep(500);
		//		driver.findElement(By.xpath("//label[normalize-space()='No Current Medication']//span[@class='checkmark']")).click();
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//i[@class='ki ki-admission-reconciliation']")).click();
		//		Thread.sleep(500);
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//i[@class='ki ki-reconciliation']")).click();
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		Thread.sleep(1000);
		entermedicine.click();
		Thread.sleep(500);
		entermedicine.sendKeys(Medicine,Keys.ENTER);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Medicine+"')])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='prescriptiontypeid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='OR Order']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='antibioticorderingreasonid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='antibioticorderingremarks']")).sendKeys("OK");
		Thread.sleep(500);
		Frequency.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='BD']")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//input[@name='remarks']")).sendKeys("Remarks added here");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='col-md-11']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='updatePharmacy']//i[@class='ki ki-plus icon-plus']")).click();
		Thread.sleep(500);



		///////////Adding Referal
		referral.click();
		Thread.sleep(500);
		referralprovider.sendKeys(refProvider);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+refProvider+"')])[1]")).click();
		Thread.sleep(500);
		timeframe.click();
		Thread.sleep(500);
		selecttimeframe.click();
		Thread.sleep(500);
		remarksadd.sendKeys("remarks added");
		Thread.sleep(500);
		referraladd.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='icon emrsave']")).click();
		Thread.sleep(3000);


		///////////////Zoom out/Zoom in in document viewer
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//label[@class='icon cpoedocuments']")).click();
		//		Thread.sleep(1500);
		//		driver.findElement(By.xpath("//button[normalize-space()='Capture']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Take A Snapshot']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//i[@class='fa fa-eye']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//i[@class='ki ki-zoom-in']")).click();
		//		driver.findElement(By.xpath("//i[@class='ki ki-zoom-in']")).click();
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//i[@class='ki ki-zoom-out']")).click();
		//		Thread.sleep(800);
		//		driver.findElement(By.xpath("//span[@aria-hidden='true']//i[@class='ki ki-refresh']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		//		Thread.sleep(2000);

	}



	////////////Give Anesthesia fitness	
	public void anesthesiafitness(String MRNO,String anesthesiaID , String anesthesiapassword ) throws InterruptedException {


		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(2000);

		////////login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(Anesthetist);    
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Hamberger.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//i[@class='ki ki-sthethescope']")).click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='All IP']")).click();
		Thread.sleep(500);


		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(2000);

		///Accebility note

		Thread.sleep(500);
		Reason.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(500);
		Remarks.sendKeys("Anesthesia note");
		Thread.sleep(500);
		Save.click();
		Thread.sleep(500);


		DoctorNote.click();

		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 



		cheifComplaint.clear();
		Thread.sleep(800);
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(800);
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),' Pre Anesthesia ')])")).click();
		Thread.sleep(800);
		tempOk.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-request[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[normalize-space()='Fit For Surgery']//span[@class='checkmark']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[contains(text(),'Anesthesia Plan')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mainhead_form_5\"]/div[4]/div[2]/label/span[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='element-container removespace auto']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[2]/div[4]/div/div/div[1]/div/div/app-custum-template/div/form/div[8]/div[2]/div[3]/ki-textarea-control/div/textarea")).sendKeys("ok");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='icon emrsave']")).click();
		Thread.sleep(1500);


	}


	public void ORSchedule(String ORAdmin, String ORpassword,String MRNo) throws InterruptedException, AWTException
	{



		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(2000);

		////////login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ORAdmin);    
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(ORpassword);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);



		Thread.sleep(2000);
		maincategory.click();
		Thread.sleep(800);
		pendingorder.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		selectslot.click();
		Thread.sleep(800);
		searchOR.clear();
		Thread.sleep(800);
		searchOR.sendKeys("OR Sri");
		Thread.sleep(800);
		selectslot.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//td[@class='app-booking-bar ng-star-inserted']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1800);



		Resource.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Human Resource']")).click();
		Thread.sleep(800);

		///Adding anesthetist	

		resourceType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Anesthetist']")).click();
		Thread.sleep(800);
		//		Department.click();
		//		Thread.sleep(800);
		//		Department.sendKeys("Anesthesia");
		//		Thread.sleep(800);
		//		driver.findElement(By.xpath("//li[normalize-space()='Anesthesia']")).click();
		//		Thread.sleep(800);
		Name.click();
		Thread.sleep(800);
		Name.sendKeys(Anesthetist);
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[contains(text(),'"+Anesthetist+"')]")).click();
		Thread.sleep(800);
		AnesthesiaType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='General']")).click();
		Thread.sleep(800);
		Grade.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Senior']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@id='subresourceaddid']")).click();
		Thread.sleep(800);


		////Adding Surgeon	

		resourceType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Surgeon']")).click();
		Thread.sleep(800);
		Department.click();
		Thread.sleep(800);
		//		Department.sendKeys("Anesthesia");
		//		Thread.sleep(800);
		//driver.findElement(By.xpath("//span[@class='close-select ng-star-inserted']//i[@class='fa fa-close']")).click();
		Thread.sleep(800);
		Name.click();
		Thread.sleep(800);
		Name.sendKeys(Provider);
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(800);
		Grade.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Senior Surgeon']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@id='subresourceaddid']")).click();
		Thread.sleep(800);


		driver.findElement(By.xpath("//modal-container[@class='modal fade show']//div[@class='appt-form-group']//input[@id='undefined']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Emergency']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1800);




		togglebar.click();
		Thread.sleep(800);
		orAuthorization.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@title='Search']//i[@class='ki ki-search']")).click();
		Thread.sleep(800);
		searchMRNo.sendKeys(MRNo);
		Thread.sleep(800);
		authorizedcheckbox.click();
		Thread.sleep(800);

		driver.findElement(By.xpath("//span[@title='Preanesthesia Details']//i[@class='ki ki-info-circle-fill']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@id='otauthdata']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@id='global_modal_close_button']")).click();
		Thread.sleep(1500);
		togglebar.click();
		Thread.sleep(800);


		ORTrackingboard.click();
		Thread.sleep(1000);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView();" , status);
		Thread.sleep(2000);

	}


	public void StockTransfer(String User , String Password,String MRNo ) throws InterruptedException {


		Thread.sleep(2000);
		username.click();
		Thread.sleep(1000);
		logout1.click();
		Thread.sleep(1000);
		logoutConfirm.click();

		//login
		userid.click();
		Thread.sleep(500); 
		userid.sendKeys(User);
		Thread.sleep(500);
		password.click();
		Thread.sleep(500);
		password.sendKeys(Password);
		Thread.sleep(500);;
		site.click();
		Thread.sleep(500);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		Hamberger.click();
		Thread.sleep(1000);
		inventory.click();
		Thread.sleep(1000);
		location.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Base_Nagercoil_Central']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(3000);

		//indent	


		indent.click();
		Thread.sleep(1000);
		Patient_Indent.click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Submitted']")).click();
		Thread.sleep(1000);
		MRNOSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		indentSearch.click();
		Thread.sleep(2000);


		/////verify	

		indent1.click();
		Thread.sleep(1000);
		StatusCheck.click();
		Thread.sleep(1000);
		UpdateINV.click();
		Thread.sleep(2000);
		saveok.click();
		Thread.sleep(2000);



		indent1.click();
		Thread.sleep(1000);
		StatusCheck.click();
		Thread.sleep(1000);
		UpdateINV.click();
		Thread.sleep(2000);
		saveok.click();
		Thread.sleep(2000);


		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Verified']")).click();
		Thread.sleep(1000);
		MRNOSearch.clear();
		Thread.sleep(1000);
		MRNOSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		indentSearch.click();
		Thread.sleep(2000);


		/////Approve	

		indent1.click();
		Thread.sleep(1000);
		StatusCheck.click();
		Thread.sleep(1000);
		UpdateINV.click();
		Thread.sleep(2000);
		saveok.click();
		Thread.sleep(2000);

		indent1.click();
		Thread.sleep(1000);
		StatusCheck.click();
		Thread.sleep(1000);
		UpdateINV.click();
		Thread.sleep(2000);
		saveok.click();
		Thread.sleep(2000);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		MRNOSearch.clear();
		Thread.sleep(1000);
		MRNOSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		indentSearch.click();
		Thread.sleep(2000);


		/////// Stock Transfer

		Hamberger.click();
		Thread.sleep(1000);
		Transfer.click();
		Thread.sleep(1000);
		StockTransfer.click();
		Thread.sleep(1000);
		Indent.click();
		Thread.sleep(1000);
		Indenttype.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Patient Indent']")).click();
		Thread.sleep(1000);
		Indenttype1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Emergency']")).click();
		Thread.sleep(1000);
		fromLOC.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Base_Nagercoil_Central']")).click();
		Thread.sleep(1000);

		ToLoc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='North Central pharmacy']")).click();
		Thread.sleep(1000);

		indentSearch1.clear();
		Thread.sleep(500);
		indentSearch1.sendKeys(MRNo);
		Thread.sleep(1000);
		Search2.click();
		Thread.sleep(2000);

		///indent 1		

		indent1.click();
		Thread.sleep(2000);
		Item1.click();
		Thread.sleep(2000);
		Add2.click();
		Thread.sleep(2000);


		Item2.click();
		Thread.sleep(2000);
		Add2.click();
		Thread.sleep(2000);

		Item3.click();
		Thread.sleep(2000);
		Add2.click();
		Thread.sleep(2000);

		item4.click();
		Thread.sleep(2000);
		Add2.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1500);
		saveok.click();
		Thread.sleep(1000);

		///indent 2		

		indent1.click();
		Thread.sleep(2000);
		Item1.click();
		Thread.sleep(2000);
		Add2.click();
		Thread.sleep(2000);


		Item2.click();
		Thread.sleep(2000);
		Add2.click();
		Thread.sleep(2000);

		Item3.click();
		Thread.sleep(2000);
		Add2.click();
		Thread.sleep(2000);

		item4.click();
		Thread.sleep(2000);
		Add2.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1500);
		saveok.click();
		Thread.sleep(1000);	


		////Transfer

		Transfer1.click();
		Thread.sleep(800);
		status2.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[contains(text(),'Inventory')]")).click();
		Thread.sleep(800);

		fromLOCtransfer.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='North Central pharmacy']")).click();
		Thread.sleep(800);
		ToLocTransfer.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Base_Nagercoil_Central']")).click();
		Thread.sleep(800);

		searchMRNO.clear();
		Thread.sleep(800);
		searchMRNO.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(800);
		indent1.click();
		Thread.sleep(1800);
		Submit.click();
		Thread.sleep(800);
		UpdateINV.click();
		Thread.sleep(1500);
		saveok.click();
		Thread.sleep(800);

		Thread.sleep(800);
		indent1.click();
		Thread.sleep(1800);
		Submit.click();
		Thread.sleep(800);
		UpdateINV.click();
		Thread.sleep(1500);
		saveok.click();
		Thread.sleep(800);


		////Verify

		Thread.sleep(800);
		TransferDetails.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Submitted']")).click();
		Thread.sleep(800);

		searchMRNO.clear();
		Thread.sleep(800);
		searchMRNO.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(800);

		indent1.click();
		Thread.sleep(1800);
		Verify.click();
		Thread.sleep(800);
		UpdateINV.click();
		Thread.sleep(1500);
		saveok.click();
		Thread.sleep(800);

		Thread.sleep(800);
		indent1.click();
		Thread.sleep(1800);
		Verify.click();
		Thread.sleep(800);
		UpdateINV.click();
		Thread.sleep(1500);
		saveok.click();
		Thread.sleep(800);


		////Approve		


		Thread.sleep(800);
		TransferDetails.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Verified']")).click();
		Thread.sleep(800);

		searchMRNO.clear();
		Thread.sleep(800);
		searchMRNO.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(800);

		indent1.click();
		Thread.sleep(1800);
		StatusCheck.click();
		Thread.sleep(800);
		UpdateINV.click();
		Thread.sleep(1500);
		saveok.click();
		Thread.sleep(800);

		Thread.sleep(800);
		indent1.click();
		Thread.sleep(1800);
		StatusCheck.click();
		Thread.sleep(800);
		UpdateINV.click();
		Thread.sleep(1500);
		saveok.click();
		Thread.sleep(800);


		Thread.sleep(800);
		TransferDetails.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(800);

		searchMRNO.clear();
		Thread.sleep(800);
		searchMRNO.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(800);

		////Stock recieve

		Thread.sleep(800);
		Hamberger.click();
		Thread.sleep(1000);
		Stock_receive.click();
		Thread.sleep(1000);

		///////////item1		

		MRNOSearch.clear();
		Thread.sleep(800);
		MRNOSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(1000);
		Receiveindent1.click();
		Thread.sleep(1000);
		recieveCheck.click();
		Thread.sleep(1000);
		receiveStockSave.click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//label[@class='dialog-title'][normalize-space()='Confirmation']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		Thread.sleep(800); 
		saveok.click();
		Thread.sleep(1000);

		//////Item2		

		Thread.sleep(1000);
		MRNOSearch.clear();
		Thread.sleep(800);
		MRNOSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(1000);
		Receiveindent1.click();
		Thread.sleep(1000);
		recieveCheck.click();
		Thread.sleep(1000);
		receiveStockSave.click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//label[@class='dialog-title'][normalize-space()='Confirmation']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		Thread.sleep(800);

		saveok.click();
		Thread.sleep(1000);


	}






	public void operationroomprocess(String MRNo ,String Nuruser ,String Nurpassword) throws InterruptedException, AWTException {


		///////////login as nurse

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(2000);

		userid.click();
		Thread.sleep(800);
		userid.sendKeys(NurseID);
		Thread.sleep(800);
		password.click();
		Thread.sleep(800);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+Site+"\")]")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(1500);

		////////////////////Process in Operation Room

		Thread.sleep(1000);
		maincategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='My Location(IP)']")).click();
		Thread.sleep(1500);


		Thread.sleep(1000);
		eterMRNo.sendKeys(MRNo); 
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1500);

		CPOEAdministration.click();
		Thread.sleep(600);
		OperatioRoom.click();
		Thread.sleep(1000);
		checkboxselect.click();
		Thread.sleep(600);

		/////////////Checklist ward nurse

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/label[1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[2]/div[1]/label[1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/div[2]/div[1]/label[3]")).click();
		Thread.sleep(700);
		VerifiedBy.clear();
		Thread.sleep(700);

		VerifiedBy.sendKeys(Nuruser , Keys.ENTER);
		Thread.sleep(600);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Nuruser+"')])")).click();
		Thread.sleep(1000);
		ORSave.click();
		Thread.sleep(600);
		Passwordfield.sendKeys(Nurpassword);
		Thread.sleep(1600);
		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']")).click(); 
		Thread.sleep(1500);

		//////////////Checklist Preop nurse			


		driver.findElement(By.xpath("//label[normalize-space()='Checklist Pre-OP Nurse']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[3]/div[1]/label[1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/div[3]/div[1]/label[1]")).click();			
		Thread.sleep(1000);
		VerifiedBy.clear();
		Thread.sleep(600);
		VerifiedBy.sendKeys(Nuruser);
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tfoot[1]/div[3]/typeahead-container[1]/button[1]/span[1]")).click();		
		Thread.sleep(1000);
		ORSave.click();
		Thread.sleep(1000);
		Passwordfield.sendKeys(Nurpassword);
		Thread.sleep(1600);
		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']")).click();
		Thread.sleep(1500);



		/////////////////////Transfer Bypass to OR			
		driver.findElement(By.xpath("//label[normalize-space()='Transfer Bypass To OR']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-calender-time[1]/div[1]/input[1]")).click();	
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-timer[1]/owl-date-time-timer-box[2]/button[2]/span[1]/*[name()='svg'][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(600);

		driver.findElement(By.xpath("//input[@id='dynamic_selectHTF175']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Not obtained']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='dynamic_selectHTF177']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Given']")).click();
		Thread.sleep(600);
		ORSave.click();
		Thread.sleep(2500);
		///////////////Sign In			
		driver.findElement(By.xpath("//label[normalize-space()='Sign In']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='form-group ng-star-inserted']//input[@type='text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(600);
		ORSave.click();
		Thread.sleep(1500);
		//		//////////////////OR Medicine Admin			
		//		driver.findElement(By.xpath("//label[normalize-space()='OR Medicine Admin']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//i[@title='Encounter']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("(//label[text()='All '])[2]")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//i[@class='ki-user-drug ki']")).click();
		//		Thread.sleep(1000);
		//		//		rejectedQua.sendKeys("0");
		//		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		//		Thread.sleep(1000);
		//
		//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
		//
		//		if(dynamicElement.size() !=0)
		//		{
		//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//		}
		//		Thread.sleep(800); 
		//
		//		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-save']")).click();
		//		Thread.sleep(2500);
		//		//		Nurseverifiesby.sendKeys(Nuruser);
		//		//		Thread.sleep(1000);
		//		//		driver.findElement(By.xpath("(//*[contains(text(),'"+Nuruser+"')])")).click();
		//		//		Thread.sleep(1000);
		//		//		verifiedPass.sendKeys("KAmeda123$");
		//		//		Thread.sleep(600);
		//		//		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
		//		//		Thread.sleep(1500); 

		////////////////////Time out			
		driver.findElement(By.xpath("//button[@title='Time Out']//div[@class='btn-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@title='Confirm all team members have Introduced themselfs by name and role']//span[@class='checkmark']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/label[1]/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/label[1]/span[2]")).click();
		Thread.sleep(600);
		Thread.sleep(1000);
		ORSave.click();
		Thread.sleep(1500);

		/////////////Intra Operative notes/Vitals
		driver.findElement(By.xpath("//label[normalize-space()='Intra-Operative Notes / Vitals']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@title='Add']")).click();  
		ORSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Intra-Operative Procedure']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@title='Add']")).click();
		Thread.sleep(600);
		ORSave.click();
		Thread.sleep(1500);   

		/////////////After Procedure
		driver.findElement(By.xpath("//label[normalize-space()='After Procedure']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/label[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/label[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/label[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[4]/td[3]/label[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[5]/td[3]/label[1]")).click();
		Thread.sleep(1000);



		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[32]/td[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[34]/td[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[34]/td[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[39]/td[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("3");
		Thread.sleep(2000);


		ORSave.click();
		Thread.sleep(1500);  


		/////////////Coming back to Intra Operative notes/Vitals to enter end date
		//////Adding end date in intra operative procedure

		driver.findElement(By.xpath("//label[normalize-space()='After Procedure']")).click();  ///////Just clicking on After Procedure
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Intra-Operative Notes / Vitals']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[normalize-space()='Intra-Operative Procedure']")).click();
		Thread.sleep(1500);


		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-surgerydetails[1]/form[1]/div[2]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/label[1]/a[1]/i[1]")).click();
		Thread.sleep(1500);
		Thread.sleep(60000);


		//start time

		driver.findElement(By.xpath("//ki-calender-time[@class='validation-message ng-untouched ng-pristine ng-valid']//input[@type='text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Minus a minute']//span[@class='owl-dt-control-button-content']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(1000);

		//end time 

		driver.findElement(By.xpath("//ki-calender-time[@class='ng-untouched ng-valid ng-dirty']//input[@type='text']")).click();
		Thread.sleep(1500);
		//		Robot r = new Robot();
		//		r.keyPress(KeyEvent.VK_ENTER);
		//		r.keyRelease(KeyEvent.VK_ENTER);

		//		Boolean Enable = driver.findElement(By.xpath("//span[normalize-space()='Today']")).isEnabled();
		//		System.out.println(" today is enabled  :"+Enable);
		//		Thread.sleep(1000);


		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Set']")));
		Thread.sleep(2000);


		///today

		driver.findElement(By.xpath("(//span[@class='owl-dt-control-button-content'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		//	driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[4]")).click();
		//	act.moveToElement(today).click().build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Add']")).click();
		Thread.sleep(1000);
		ORSave.click();
		Thread.sleep(1500);
		////////Adding end date in anesthesia notes
		driver.findElement(By.xpath("//span[@class='rep-head-daily']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-surgerydetails[1]/form[1]/div[2]/div[1]/div[2]/div[2]/ki-calender-time[1]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@title='Add']")).click();  
		Thread.sleep(1000);

		Thread.sleep(500);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);


		ORSave.click();
		Thread.sleep(10000);  

		////Preference card usage

		PrefcardUsage1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='After Procedure']")).click();  ///////Just clicking on After Procedure
		Thread.sleep(2000);
		PrefcardUsage1.click();
		Thread.sleep(1000);
		Verifyitem.click();
		Thread.sleep(1000);
		SavePrefUsage.click();
		Thread.sleep(1000);
		SearchItem.clear();
		Thread.sleep(1000);
		SearchItem.sendKeys("Tab");
		Thread.sleep(1000);
		SearchItem.clear();
		Thread.sleep(1000);
		Authorize.click();
		Thread.sleep(1000);
		UpdateINV.click();
		Thread.sleep(3000);



		//////////////Resource Allocation			
		driver.findElement(By.xpath("//label[normalize-space()='Resource Allocation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='form-group close-active ki-dropdown']//input[@id='typeId']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[@class='col-md-4 mob-p0']//input[@id='reportingStatusId']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Primary']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='ortype-1']")).click();
		Thread.sleep(600);

		driver.findElement(By.xpath("//tbody/tr[5]/td[1]/label[1]/i[1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='attendeeSplitId']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Senior Alone(Surgeon)']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@id='ordlsaddid']//i[@class='ki ki-plus']")).click();
		Thread.sleep(600);


		driver.findElement(By.xpath("//tbody/tr[6]/td[1]/label[1]/i[1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='attendeeSplitId']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Senior Alone(Anesthetist)']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@id='ordlsaddid']//i[@class='ki ki-plus']")).click();
		Thread.sleep(600);

		//		reportingStatus.click();
		//		Thread.sleep(600);
		//		driver.findElement(By.xpath("//li[normalize-space()='Day Case']")).click();
		//		Thread.sleep(600);

		driver.findElement(By.xpath("//div[@class='form-group ki-dropdown']//input[@id='typeId']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Dietitian']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='resourcemasterorid']")).sendKeys("Nawara Beevi A(NGL18110)");
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Nawara Beevi A(NGL18110)']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@id='ordlsaddid']//i[@class='ki ki-plus']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//textarea[@id='remarksId']")).sendKeys("Remarks added");
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@id='ormasteraddid']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1600);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1500);


		////////////Sign Out		

		driver.findElement(By.xpath("//label[normalize-space()='Sign Out']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-calender-time[1]/div[1]/input[1]")).click();
		Thread.sleep(600);
		//	driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-star-inserted ng-touched ng-valid']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();		
		Thread.sleep(600);
		driver.findElement(By.xpath("//label[normalize-space()='The name of procedure recorded']//span[@class='checkmark']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[4]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[4]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(600);
		ORSave.click();
		Thread.sleep(1500);

		////////////TimeLine
		driver.findElement(By.xpath("//label[normalize-space()='Time Line']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[3]//div[1]//ki-textarea-control[1]//div[1]//textarea[1]")).sendKeys("Remarks added");
		Thread.sleep(600);
		ORSave.click();
		Thread.sleep(1500);
	}


	public void referalLogin(String ReferalID, String Referalpassword,String MRNo ) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(2000);
		driver.get(URL);
		Thread.sleep(1000);

		////////login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ReferalID);    
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Referalpassword);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Task.click();
		Thread.sleep(800); 
		IPReferaral.click();
		Thread.sleep(800); 
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1500);

		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 


		cheifComplaint.clear();
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP ED']")).click();
		Thread.sleep(800);
		tempOk.click();
		Thread.sleep(3000);

		Diagnosis.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[contains(text(),'Mark as Final')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='icon emrsave']")).click();
		Thread.sleep(3000);

	}

	public void OR_billing(String User, String Password,String MRNo) throws InterruptedException

	{

		Thread.sleep(2000);
		username.click();
		Thread.sleep(1000);
		logout1.click();
		Thread.sleep(1000);
		logoutConfirm.click();

		//login
		userid.click();
		Thread.sleep(500); 
		userid.sendKeys(User);
		Thread.sleep(500);
		password.click();
		Thread.sleep(500);
		password.sendKeys(Password);
		Thread.sleep(500);;
		site.click();
		Thread.sleep(500);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);


		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Registration']")).click();
		Thread.sleep(1000);
		Searchfield.clear();
		Thread.sleep(500);
		Searchfield.sendKeys(MRNo,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[normalize-space()='OR']")).click();
		Thread.sleep(1500);

		Orders.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]")).click();
		Thread.sleep(1500);
		OTPrimaryAmount.click();
		Thread.sleep(1000);

		for (int i = 0; i < 4; i++) {

			OTPrimaryAmount.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(1000);


		}

		OTPrimaryAmount.sendKeys("50000");
		Thread.sleep(1000);
		Applycharge.click();
		Thread.sleep(1000);
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//div[contains(text(),'All Orders')]")) );
		Thread.sleep(2000);

		OTBillSave.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(3000);


		AvailedServices.click();
		Thread.sleep(1000);
		SearchBill.click();
		Thread.sleep(1000);
		RightArrow.click();
		Thread.sleep(1000);


		///RCM - Backend bill

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		RCM.click();
		Thread.sleep(1000);
		Backendbilling.click();
		Thread.sleep(1000);
		MRNOSearch1.sendKeys(MRNo,Keys.ENTER);
		Thread.sleep(1000);
		Searchbill.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("(//span[@class='checkmark'])"));

		int A=dynamicElement1.size();
		System.out.println(A +"=Service Bill entry");


		for (int i = 1; i <= A; i++) {

			driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
			Thread.sleep(500);
		}

		Thread.sleep(1000);
		Generate.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(3000);
		Thread.sleep(1000);
		Pharmacy.click();
		Thread.sleep(2000);
		MRNOSearch2.click();
		MRNOSearch2.clear();

		MRNOSearch2.sendKeys(MRNo,Keys.ENTER);
		Thread.sleep(1000);
		Searchbill1.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("(//span[@class='checkmark'])"));

		int B=dynamicElement11.size();
		System.out.println(B);


		for (int i = 1; i <= B; i++) {

			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-back-end-billing[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[2]/div[1]/table[1]/tbody[1]/tr["+i+"]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
			Thread.sleep(500);
		}

		Thread.sleep(2000);
		Generate.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(3000);


		/////Finalbill

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(3000);

		Finalbilling.click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//div[normalize-space()='IP']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Interim Bill']")).click();
		Thread.sleep(3000);


		MRNO.click();
		Thread.sleep(800);
		MRNO.sendKeys(MRNo,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Search']//i[@class='ki ki-search']")).click();
		Thread.sleep(800);

		Statement.click();
		Thread.sleep(800);
		Print.click();
		Thread.sleep(7000);

















	}

}