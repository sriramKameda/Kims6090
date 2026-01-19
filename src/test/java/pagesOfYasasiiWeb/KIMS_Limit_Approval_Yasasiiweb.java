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

public class KIMS_Limit_Approval_Yasasiiweb extends PageFactoryInitYasasiiWeb{

	public KIMS_Limit_Approval_Yasasiiweb(WebDriver driver) {

		super(driver);


	}	



	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Master;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='Service']")
	public WebElement  Service;

	@FindBy(xpath="//div[normalize-space()='Service Master']")
	public WebElement  ServiceMaster;

	@FindBy(xpath="//input[@id='rootinvcatgeoryser']")
	public WebElement  categoryMaster;

	@FindBy(xpath="//input[@id='servicecategoryser']")
	public WebElement  Subcategory;

	@FindBy(xpath="//input[@id='name']")
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


	@FindBy(xpath="//span[normalize-space()='Category Master']")
	public WebElement categorymaster;
	@FindBy(xpath="//input[@id='parentinvcategoryid']")
	public WebElement parentcategory;
	@FindBy(xpath="//li[normalize-space()='Procedure']")
	public WebElement selectprocedure;
	@FindBy(xpath="//input[@id='name']")
	public WebElement entername;
	@FindBy(xpath="//button[@id='categorymastersave']")
	public WebElement subcategorysave;

	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement search;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='RCM-Plan']")
	public WebElement RCM;

	@FindBy(xpath="//div[normalize-space()='Tariff Setting']")
	public WebElement TariffSetting;

	@FindBy(xpath="//input[@placeholder='Search reference name...']")
	public WebElement SchemeSearch;

	@FindBy(xpath="//input[@placeholder='Service Name']")
	public WebElement ServiceSearch;

	@FindBy(xpath="//i[@class='ki ki-pencil']")
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
	
	@FindBy(xpath="//button[@title='Add Scheme Setting']//i[@class='ki ki-plus']")
	public WebElement tariffAdd;

	@FindBy(xpath="//input[@placeholder='Service Name']")
	public WebElement ServiceSearch1;

	@FindBy(xpath="//th[@class='code']")
	public WebElement TableClick;

	@FindBy(xpath="//th[normalize-space()='Final Amt.']")
	public WebElement FinalAmount;

	@FindBy(xpath="//button[normalize-space()='Update']")
	public WebElement Update;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchPAt;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Servicebill;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement Addnew;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement ServiceNAme;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement amount;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement provider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement serviceAdd;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement PrintuNCHECK;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/div[2]/div[1]/div[2]/button[1]")
	public WebElement Save;

	@FindBy(xpath = "//label[normalize-space()='Modules']")
	public WebElement module;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Masters;

	@FindBy(xpath = "//label[@class='table-action-icons']//i[@class='ki ki-trash']")
	public WebElement delete;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tariffBaseCharge;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tariffcontractCharge;

	@FindBy(xpath = "//label[normalize-space()='Auto Consumption']//span[@class='checkmark']")
	public WebElement AutoConsumption;

	@FindBy(xpath = "//span[normalize-space()='Consumable Mapping']")
	public WebElement Consumables_mapping;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='name']")
	public WebElement Consumables;

	@FindBy(xpath = "//input[@id='qty']")
	public WebElement QTY;

	@FindBy(xpath = "//div[@class='col-md-6 ta-r rtl-right mb15']//i[@class='ki ki-plus']")
	public WebElement Add1;

	@FindBy(xpath = "//span[normalize-space()='Charge - Tax']")
	public WebElement Tax;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Basecharge;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ContractCharge;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM-Insurance']")
	public WebElement RCMInsurance;

	@FindBy(xpath = "//div[normalize-space()='Limit Rule Setting']")
	public WebElement Limitrulesetting;

	@FindBy(xpath = "//input[@id='id']")
	public WebElement RuleName;

	@FindBy(xpath = "//input[@id='policytypeid']")
	public WebElement Policytype;

	@FindBy(xpath = "//ki-select-control[@title='Rule Type']//input[@id='undefined']")
	public WebElement RuleType;

	@FindBy(xpath = "//input[@id='limitparameterid']")
	public WebElement limitParameter;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-limit-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Visitmode;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-limit-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement VisitSubmode;

	@FindBy(xpath = "//input[@id='limitonid']")
	public WebElement limit;


	@FindBy(xpath="//input[@id='limitamount']")
	public WebElement limitAmount;

	@FindBy(xpath="//button[@title='Add Scheme Setting']")
	public WebElement AddRule;


	@FindBy(xpath = "//div[normalize-space()='Limit Rule Mapping']")
	public WebElement LimitRulemapping;

	@FindBy(xpath = "//input[@id='limitmasterid']")
	public WebElement limitrule;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providername;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement BillingSave;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement ReferenceCard;

	@FindBy(xpath = "//input[@id='refno']")
	public WebElement RefNo;

	@FindBy(xpath = "//ki-calendar[@formcontrolname='validfrom']//input[@type='text']")
	public WebElement FromDate;

	@FindBy(xpath = "//ki-calendar[@formcontrolname='validto']//input[@type='text']")
	public WebElement Todate;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement disgnosis;

	@FindBy(xpath = "//label[contains(text(),'CPOE Service')]")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeServiceSearch;

	@FindBy(xpath = "//input[@id='cpoeSearchDb']")
	public WebElement CpoeServiceSearch1;

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EmrSave;

	@FindBy(xpath = "//button[@class='icon cpoeadmin']")
	public WebElement CpoeAdministration;

	@FindBy(xpath="//label[normalize-space()='Service Administration']")
	public WebElement ServiceAdministration;

	@FindBy(xpath="(//i[@title='Open Consumption'])[1]")
	public WebElement OpenConsumption;

	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement Save1;

	@FindBy(xpath="//span[@class='btn btn-link ng-star-inserted']")
	public WebElement Consumablesview;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-commonconsumption[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ConsumableQuantity;

	@FindBy(xpath = "//button[@title='Add']")
	public WebElement consumeadd;

	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement ConsumableSave;

	@FindBy(xpath = "//label[@id='addtocard']")
	public WebElement Addenc;

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle pro-pic tab-prof-wrap']")
	public WebElement username;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[contains(@class,'item-name')][normalize-space()='Logout']")
	public WebElement logout1;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement logoutConfirm;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM']")
	public WebElement RCM1;

	@FindBy(xpath="//div[normalize-space()='Insurance Approval']")
	public WebElement Insuranceapproval;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-insurance-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOenter;

	@FindBy(xpath="//button[@title='Search']//i[@class='ki ki-search']")
	public WebElement Search1;

	@FindBy(xpath = "//span[@title='Edit']")
	public WebElement Edit1;

	@FindBy(xpath = "//i[@title='Log']")
	public WebElement Log;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//i[@class='ki ki-chevron-right ng-star-inserted']")
	public WebElement Status;

	@FindBy(xpath = "//ki-checkbox-control[@class='zero-label ng-untouched ng-pristine ng-valid']//span[@class='checkmark']")
	public WebElement Itemcheckbox;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Remarks;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Approvequantity;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Approvalnumber;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Validitydays;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remarks1;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='FO']")
	public WebElement FO1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Orders;

	@FindBy(xpath = "(//span[@class='option-name'])[1]")
	public WebElement OrderNo2;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]")
	public WebElement OrderNo1;

	@FindBy(xpath="//ki-select-control[@title='Status']//input[@id='undefined']")
	public WebElement Status1;

	@FindBy(xpath="//i[@class='ki ki-arrow-right']")
	public WebElement ExpandedView;

	@FindBy(xpath = "//label[3]//div[2]")
	public WebElement Waiting;

	@FindBy(xpath = "//i[@class='ki ki-cash-transfer']")
	public WebElement AvailedServices;

	@FindBy(xpath = "//i[@class='ki ki-search text-white']")
	public WebElement SearchBill;

	@FindBy(xpath = "//i[@class='fa pointer fa-chevron-right ng-star-inserted']")
	public WebElement RightArrow;
	//
	//	@FindBy(xpath = "//button[@class='btn-feedback']")
	//	public WebElement ReferenceCard;
	//
	//	@FindBy(xpath = "//input[@id='refno']")
	//	public WebElement RefNo;
	//
	//	@FindBy(xpath = "//ki-calendar[@formcontrolname='validfrom']//input[@type='text']")
	//	public WebElement FromDate;
	//
	//	@FindBy(xpath = "//ki-calendar[@class='ng-untouched ng-pristine ng-invalid']//input[@type='text']")
	//	public WebElement Todate;
	//
	//	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	//	public WebElement Hamburger;
	//
	//	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	//	public WebElement EMRHomeScreen;
	//
	//	@FindBy(xpath = "//input[@id='searchtext']")
	//	public WebElement EnterPatientName;
	//
	//	@FindBy(xpath = "//label[@class='icon doctornote']")
	//	public WebElement DoctorNote;
	//
	//	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	//	public WebElement reasonForVisit;
	//
	//	@FindBy(xpath = "//input[@id='emrtemplateid']")
	//	public WebElement Template;
	//
	//	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	//	public WebElement TemplateOK;
	//
	//	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	//	public WebElement disgnosis;
	//
	//	@FindBy(xpath = "//label[contains(text(),'CPOE Service')]")
	//	public WebElement CpoeService;
	//
	//	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	//	public WebElement CpoeServiceSearch;
	//
	//	@FindBy(xpath = "//input[@id='cpoeSearchDb']")
	//	public WebElement CpoeServiceSearch1;
	//
	//	@FindBy(xpath = "//label[@class='icon emrsave']")
	//	public WebElement EmrSave;
	//
	//	@FindBy(xpath = "//label[@id='emrdashboardpatient_cpoeadministration']//label[contains(@class,'icon cpoeadmin')]")
	//	public WebElement CpoeAdministration;
	//
	//	@FindBy(xpath="//label[normalize-space()='Service Administration']")
	//	public WebElement ServiceAdministration;




	public void master(String codeType , String code,String ServiceName , String BaseCategory , String SubCategory,String ServiceDescription) throws InterruptedException, AWTException, IOException{


		Thread.sleep(1000);
		Hamberger.click(); 
		Thread.sleep(400);
		Master.click();
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


		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		}

		else {
			System.out.println("sri");

		}
		//	  Thread.sleep(800); 
		categoryMaster.clear();
		Thread.sleep(400);
		categoryMaster.click();
		Thread.sleep(400);
		categoryMaster.sendKeys(BaseCategory);
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='"+BaseCategory+"']")).click();
		Thread.sleep(400);
		Subcategory.clear();
		Thread.sleep(400);
		Subcategory.clear();
		Thread.sleep(400);
		Subcategory.click();
		Thread.sleep(400);
		Subcategory.sendKeys(SubCategory);
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+SubCategory+"')]")).click();
		Thread.sleep(400);
		
		
		
		String append = RandomString.lastName();
		
		String servicename = ServiceName + append ;
		
		System.out.println(servicename + " = serviceName");
		
		serviceName.clear();
		Thread.sleep(400);
		serviceName.click();
		Thread.sleep(400);
		serviceName.sendKeys(servicename);
		Thread.sleep(400);
		codetype.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='"+codeType +"']")).click();
		Thread.sleep(400);
		Code.clear();
		Thread.sleep(400);
		Code.sendKeys(code);
		Thread.sleep(400);
		Add.click();
		Thread.sleep(400);
		AutoConsumption.click();
		Thread.sleep(400);
		js.executeScript("arguments[0].scrollIntoView();",Description );
		Thread.sleep(400);
		Description.click();
		Thread.sleep(400);
		Description.clear();
		Thread.sleep(400);
		Description.sendKeys(ServiceDescription);
		Thread.sleep(400);

		js.executeScript("arguments[0].scrollIntoView();",SiteMap );
		SiteMap.click();
		Thread.sleep(400);
		ServiceCheck.click();
		Thread.sleep(400);
		MoveRight.click();
		Thread.sleep(400);
		Triangle.click();
		Thread.sleep(400);
		//internalLab.click();
		Thread.sleep(400);
		//driver.findElement(By.xpath("//li[normalize-space()='"+InternalLab+"']")).click();
		Thread.sleep(400);
		Executioncategory.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+BaseCategory+"')]")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm ng-star-inserted']")).click();
		Thread.sleep(400);      


		////Consumables marking
	
		js.executeScript("arguments[0].scrollIntoView();",Consumables_mapping );
		Thread.sleep(400);  
		Consumables_mapping.click();
		Thread.sleep(600);  
		Consumables.sendKeys("SURGICAL PACK - MINOR -CAREON");
		Thread.sleep(600);  
		driver.findElement(By.xpath("//li[normalize-space()='SURGICAL PACK - MINOR -CAREON']")).click();
		Thread.sleep(400);
		QTY.sendKeys("1");
		Thread.sleep(400);
		Add1.click();

		Consumables.sendKeys("COTTON ROLL I.P. 500GM");
		Thread.sleep(600);  
		driver.findElement(By.xpath("//li[normalize-space()='COTTON ROLL I.P. 500GM']")).click();
		Thread.sleep(400);
		QTY.sendKeys("3");
		Thread.sleep(400);
		Add1.click();

		Consumables.sendKeys("ACIVIR SKIN 5% CREAM 10GM");
		Thread.sleep(600);  
		driver.findElement(By.xpath("//li[normalize-space()='ACIVIR SKIN 5% CREAM 10GM']")).click();
		Thread.sleep(400);
		QTY.sendKeys("2");
		Thread.sleep(400);
		Add1.click();

		Consumables.sendKeys("STERILE GLOVES  8.5");
		Thread.sleep(600);  
		driver.findElement(By.xpath("//li[contains(text(),'STERILE GLOVES')]")).click();
		Thread.sleep(400);
		QTY.sendKeys("8");
		Thread.sleep(400);
		Add1.click();

		Consumables.sendKeys("MORPHINE 50MG TAB");
		Thread.sleep(600);  
		driver.findElement(By.xpath("//li[normalize-space()='MORPHINE 50MG TAB']")).click();
		Thread.sleep(400);
		QTY.sendKeys("24");
		Thread.sleep(400);
		Add1.click();

		Consumables.sendKeys("CROCIN 650MG TAB");
		Thread.sleep(600);  
		driver.findElement(By.xpath("//li[normalize-space()='CROCIN 650MG TAB']")).click();
		Thread.sleep(400);
		QTY.sendKeys("24");
		Thread.sleep(400);
		Add1.click();


		driver.findElement(By.xpath("//button[@id='servicemastersave']")).click();
		Thread.sleep(2000); 


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);   
		t.keyRelease(KeyEvent.VK_ESCAPE);


		

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(32);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(2).setCellValue(servicename);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);	
		
		

	}
	
	
	
	public void tariff(String ServiceName ,String SubCategory) throws InterruptedException, AWTException {


		Thread.sleep(2000); 
		Hamberger.click();
		Thread.sleep(1000); 
		RCM.click();
		Thread.sleep(1000); 
		TariffSetting.click();
		Thread.sleep(1000); 
		SchemeSearch.click();
		Thread.sleep(1000); 
		SchemeSearch.sendKeys("MSD Ins Corp PVT.LTD" , Keys.ENTER);
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//div[@title='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(1000); 
		Edit.click();



		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(160));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Savebutton']")));
		
		Thread.sleep(3000); 
		//	driver.findElement(By.xpath("//input[@id='plan']")).click();
		//	Thread.sleep(1000); 
		//	driver.findElement(By.xpath("//li[normalize-space()='Government Sponsored']")).click();
		//	Thread.sleep(1000); 
		Services.click();
		Thread.sleep(1000); 
		ServiceType.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Procedure']")).click();
		Thread.sleep(1000); 
		baseCAt.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Procedure']")).click();
		Thread.sleep(1000); 
		ServiceCAt.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='"+SubCategory+"']")).click();
		Thread.sleep(1000); 
		Servicename.click();
		Thread.sleep(1000); 
		Servicename.sendKeys(ServiceName);
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='"+ServiceName+"']")).click();
		Thread.sleep(1000); 
		Coverage.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Need Approval']")).click();
		Thread.sleep(1000); 
		//	PriceByUser.click();
		//	Thread.sleep(1000); 
		chargingParameter.click();
		Thread.sleep(1000); 
//		SubMode.click();
//		Thread.sleep(1000); 
//		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
//		Thread.sleep(1000); 
//		PayMode.click();
//		Thread.sleep(1000); 
//		driver.findElement(By.xpath("//li[normalize-space()='Cash']")).click();
//		Thread.sleep(1000); 
		
		SubMode.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1000); 
		
		PayMode.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Credit']")).click();
		Thread.sleep(1000); 
		
		
		driver.findElement(By.xpath("//label[@title='Add submode and paymode']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000); 
		
		

		chargingParameter.click();
		Thread.sleep(1000);

		Tax.click();
		Thread.sleep(1000);
		Basecharge.sendKeys("1500");
		Thread.sleep(1000);
		ContractCharge.sendKeys("1500");
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",tariffAdd );
		Thread.sleep(400);


		tariffAdd.click();
		Thread.sleep(2500); 
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Update.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 


	}   


	public void Limit_Setting() throws InterruptedException {


		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		RCMInsurance.click();
		Thread.sleep(600);
		Limitrulesetting.click();
		Thread.sleep(600);
		RuleName.click();
		Thread.sleep(600);
		RuleName.sendKeys("Scalp rule");
		Thread.sleep(600);
		Policytype.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000); 
		RuleType.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Per Encounter']")).click();
		Thread.sleep(1000);
		limitParameter.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000);
		Visitmode.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//a[@role='menuitem']")).click();
		Thread.sleep(1000);
		VisitSubmode.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//a[@role='menuitem']")).click();
		Thread.sleep(1000);
		limit.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Gross']")).click();
		Thread.sleep(1000);
		limitAmount.click();
		Thread.sleep(600);
		limitAmount.sendKeys("3100");
		Thread.sleep(600);
		AddRule.click();
		Thread.sleep(600);
		Save1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);

		////Limit Rule Mapping


		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		LimitRulemapping.click();
		Thread.sleep(600);
		SchemeSearch.click();
		Thread.sleep(600);
		SchemeSearch.sendKeys("MSD Ins Corp PVT.LTD" , Keys.ENTER);
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//div[@title='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(1000); 
		Edit.click();

		Thread.sleep(600);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//label[@class='table-action-icons']//i[@class='ki ki-trash']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//label[@class='table-action-icons']//i[@class='ki ki-trash']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(1000); 	

			Save1.click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			Thread.sleep(1000);
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);
		
		

		SchemeSearch.clear();
		Thread.sleep(600);
		SchemeSearch.sendKeys("MSD Ins Corp PVT.LTD" , Keys.ENTER);
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//div[@title='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(1000); 
		Edit.click();
		Thread.sleep(1000); 
		
		limitrule.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Scalp rule']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(600);
		//Add.click();
		Thread.sleep(600);
		Save1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);


	}



/*	public void Billing( String User ,String Password ,  String MRNO , String ServiceName,String Provider) throws InterruptedException {



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
	Hamberger.click();
	Thread.sleep(600);
	FO.click();
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

	Thread.sleep(600);
	List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

	if(dynamicElement.size() !=0)
	{
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	}


	  else {
	System.out.println("sri");
	  }
	Thread.sleep(600);



	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchtext']")));


	Thread.sleep(1500);
	SearchPAt.click();
	Thread.sleep(600);
	SearchPAt.sendKeys(MRNO , Keys.ENTER);
	Thread.sleep(600);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();

	wait.until(ExpectedConditions.elementToBeClickable(Servicebill));
	Thread.sleep(2000);
	Servicebill.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@class='icon-btn btn-dark-red inline ml-1']//i[@class='ki ki-close']")).click();
	Thread.sleep(600);
	Addnew.click();
	Thread.sleep(600);
	ServiceNAme.click();
	Thread.sleep(600);
	ServiceNAme.sendKeys(ServiceName);  
	Thread.sleep(600);
	driver.findElement(By.xpath("//li[normalize-space()='"+ServiceName+"']")).click();
	Thread.sleep(600);
	amount.click();
	Thread.sleep(600);

	for (int i = 0; i <=5; i++) {
		amount.sendKeys( Keys.RIGHT);
	}
	Thread.sleep(1000);

	for (int i = 0; i <=5; i++) {
		amount.sendKeys( Keys.BACK_SPACE);
	}
	Thread.sleep(1000);

	amount.sendKeys("1278.69");
	Thread.sleep(600);
	provider.click();
	Thread.sleep(600);
	provider.sendKeys(Provider);
	Thread.sleep(1200);
	driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
	Thread.sleep(600);
	serviceAdd.click();
	Thread.sleep(600);
	//PrintuNCHECK.click();
	Thread.sleep(600);
	Save.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
	Thread.sleep(2000);
	Hamberger.click();
	Thread.sleep(600);
	module.click();
	Thread.sleep(600);
	Masters.click();
	Thread.sleep(1000);
	js.executeScript("arguments[0].scrollIntoView();", RCM);
	Thread.sleep(1000);
	RCM.click();
	Thread.sleep(1000);
	TariffSetting.click();
	Thread.sleep(1000);
	SchemeSearch.click();
	Thread.sleep(1000);
	SchemeSearch.sendKeys("Default", Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@title='Default']")).click();
	Thread.sleep(2000); 
//	driver.findElement(By.xpath("//input[@id='plan']")).click();
//	Thread.sleep(1000); 
//	driver.findElement(By.xpath("//li[normalize-space()='Government Sponsored']")).click();
//	Thread.sleep(1000); 
	Edit.click();
	Thread.sleep(1000);
	ServiceSearch.click();
	Thread.sleep(1000);
	ServiceSearch.sendKeys(ServiceName);
	Thread.sleep(1000);
	delete.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	Thread.sleep(2000);

	}  */

	public void EncounterBilling( String User ,String Password , String MRNO , String ServiceName) throws InterruptedException, AWTException {



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
		Hamberger.click();
		Thread.sleep(600);
		FO.click();
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

		Thread.sleep(600);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);



		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchtext']")));


		Thread.sleep(1500);
		SearchPAt.click();
		Thread.sleep(600);
		SearchPAt.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(600);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1600);


		driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();
		Thread.sleep(600);
		providername.clear();
		Thread.sleep(600);
		providername.sendKeys(Provider);
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(600);

		Addenc.click();
		Thread.sleep(600);

		Thread.sleep(600);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);

		ReferenceCard.click();
		Thread.sleep(600);
		RefNo.click();
		Thread.sleep(600);
		RefNo.sendKeys("43576457547");
		Thread.sleep(600);
		FromDate.click();
		Thread.sleep(600);



		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(600);

		Todate.click();
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_RIGHT);
		t.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(600);


		driver.findElement(By.xpath("//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(600);
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade blockoutside in show']//label[@class='dialog-title'][normalize-space()='Block']"));

		if(dynamicElement111.size() !=0)
		{
			//Robot t=new Robot();
			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(400);
			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(600);
		}


		else {
			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")).click();
			Thread.sleep(600);

			System.out.println("sri");
		}
		Thread.sleep(600);
		
		Thread.sleep(600);
		BillingSave.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();	
		Thread.sleep(600);

	}


	public void	DoctorNote(String DOCuser ,String DOCpassword , String MRNo,String ServiceName) throws InterruptedException, AWTException, IOException {


		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

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

		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		Hamburger.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		ExpandedView.click();
		Thread.sleep(1000);
		 Waiting.click();
		Thread.sleep(1000);

		//	driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		//	Thread.sleep(1200);
		//	driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		//	Thread.sleep(700);
		EnterPatientName.click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);//div[@class='pat-mrn-g']//span[contains(text(),'G0000200443724')]
		//driver.findElement(By.xpath("//div[@class='pat-card-wrap ng-star-inserted active']//span[contains(text(),'"+MRNo+"')]")).click();
		driver.findElement(By.xpath("//div[@class='pat-mrn-g']//span[contains(text(),'"+MRNo+"')]")).click();
		//driver.findElement(By.xpath("//span[@title='"+MRNo+"']")).click();
		
		//driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		/*	UParrow.click();
		Thread.sleep(500);
		Lock.click();
		Thread.sleep(500); */


		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
		{
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
		Thread.sleep(1000);

		
		wait.until(ExpectedConditions.elementToBeClickable(EmrSave));	
		Thread.sleep(1000);
		disgnosis.click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(2000);


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		driver.findElement(By.xpath("//div[contains(text(),'Mark as Final')]")).click();
		Thread.sleep(1000); 


		///////cpoe Service	

		CpoeService.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='btn-service-search']//i[@class='ki ki-favourite-fill']")).click();
		//Thread.sleep(1000);	
		CpoeServiceSearch.click();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Biopsy-Frozen-Liver" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Biopsy-Frozen-Liver']")).click();
		Thread.sleep(1000);
		Thread.sleep(600);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);
		
		
//		driver.findElement(By.xpath("//button[@id='orderdetails_add']")).click();
//		Thread.sleep(1000);

		CpoeServiceSearch.clear();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys(ServiceName, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='"+ServiceName+"']")).click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);
		
		
		EmrSave.click();
		Thread.sleep(3000);   

		
		wait.until(ExpectedConditions.elementToBeClickable(CpoeAdministration));	
		Thread.sleep(1000);

	}

	public void CPOEAdministration() throws InterruptedException, AWTException {


		Thread.sleep(1000);
		CpoeAdministration.click();
		Thread.sleep(1000);
		ServiceAdministration.click();
		Thread.sleep(1000);
		OpenConsumption.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='phconslocationid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='West Main']")).click();
		Thread.sleep(1000);
		Consumablesview.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[@title='MORPHINE 50MG TAB']")).click();
		Thread.sleep(600);
		ConsumableQuantity.clear();
		Thread.sleep(600);
		ConsumableQuantity.sendKeys("2");
		Thread.sleep(600);
		consumeadd.click();
		Thread.sleep(600);

		driver.findElement(By.xpath("//span[@title='CROCIN 650MG TAB']")).click();
		Thread.sleep(600);
		ConsumableQuantity.clear();
		Thread.sleep(600);
		ConsumableQuantity.sendKeys("9");
		Thread.sleep(600);
		consumeadd.click();
		Thread.sleep(600);

//		driver.findElement(By.xpath("//span[contains(@title,'8.5')]")).click();
//		Thread.sleep(600);
//		ConsumableQuantity.clear();
//		Thread.sleep(600);
//		ConsumableQuantity.sendKeys("8");
//		Thread.sleep(600);
//		consumeadd.click();
//		Thread.sleep(600);

		driver.findElement(By.xpath("//span[@title='COTTON ROLL I.P. 500GM']")).click();
		Thread.sleep(600);
		ConsumableQuantity.clear();
		Thread.sleep(600);
		ConsumableQuantity.sendKeys("3");
		Thread.sleep(600);
		consumeadd.click();
		Thread.sleep(600);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//span[@title='ACIVIR SKIN 5% CREAM 10GM']")) );
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[@title='ACIVIR SKIN 5% CREAM 10GM']")).click();
		Thread.sleep(600);
		ConsumableQuantity.clear();
		Thread.sleep(600);
		ConsumableQuantity.sendKeys("1");
		Thread.sleep(600);
		consumeadd.click();
		Thread.sleep(600);
		ConsumableSave.click();
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='OK']")));


		String str = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();

		String[] arrOfStr = str.split("[)(]");

		for (String a : arrOfStr)
			System.out.println(a);

		System.out.println( arrOfStr[1] + " Procedure Consumption Number"); 

		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 
		
		OpenConsumption.click();
		Thread.sleep(3000);
		
		//span[normalize-space()='Update']
		driver.findElement(By.xpath("//label[normalize-space()='Approve']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Update']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
	}



	public void Ins_approval(String User,String Password,String MRNo,String ApproveNO1, String ApproveNO2) throws InterruptedException {


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
		Hamberger.click();
		Thread.sleep(600);
		FO.click();
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

		RCM1.click();
		Thread.sleep(1000);
		Insuranceapproval.click();
		Thread.sleep(1000);
		MRNOenter.sendKeys(MRNo);
		Thread.sleep(1000);
		Search1.click();
		Thread.sleep(1000);

		//Edit1.click();
		//		Thread.sleep(1000);
		//		Log.click();
		//		Thread.sleep(1000);
		//		Close.click();
		//		Thread.sleep(1000);

		Status1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Open']")).click();
		Thread.sleep(1000);
		Search1.click();
		Thread.sleep(600);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Post']")).click();
		Thread.sleep(1000);
		Itemcheckbox.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Posting");
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 
		//Edit1.click();
		Thread.sleep(1000);

		Status1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Post']")).click();
		Thread.sleep(1000);
		Search1.click();
		Thread.sleep(600);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Awaited']")).click();
		Thread.sleep(1000);
		Itemcheckbox.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Awaiting");
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 
		//Edit1.click();
		Thread.sleep(1000);

		Status1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Awaited']")).click();
		Thread.sleep(1000);
		Search1.click();
		Thread.sleep(600);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Resend']")).click();
		Thread.sleep(1000);
		Itemcheckbox.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Resending");
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 
		//Edit1.click();
		Thread.sleep(1000);

		Status1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Resend']")).click();
		Thread.sleep(1000);
		Search1.click();
		Thread.sleep(600);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Reject']")).click();
		Thread.sleep(1000);
		Itemcheckbox.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Rejecting");
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 
		//Edit1.click();
		Thread.sleep(1000);

		Status1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Reject']")).click();
		Thread.sleep(1000);
		Search1.click();
		Thread.sleep(600);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cancel']")).click();
		Thread.sleep(1000);
		Itemcheckbox.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Canceling reject");
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 
		//Edit1.click();
		Thread.sleep(1000);

		Status1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Open']")).click();
		Thread.sleep(1000);
		Search1.click();
		Thread.sleep(600);


		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Post']")).click();
		Thread.sleep(1000);
		Itemcheckbox.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Posting");
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 
		//Edit1.click();
		Thread.sleep(1000);

		Status1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Post']")).click();
		Thread.sleep(1000);
		Search1.click();
		Thread.sleep(600);



		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Send']")).click();
		Thread.sleep(1000);
		Itemcheckbox.click();
		Thread.sleep(1000);
		//Remarks.sendKeys("Sending");
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 
		//Edit1.click();
		Thread.sleep(1000);

		Status1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Send']")).click();
		Thread.sleep(1000);
		Search1.click();
		Thread.sleep(600);



		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approve']")).click();
		Thread.sleep(1000);
		Itemcheckbox.click();
		Thread.sleep(1000);
		//Remarks.sendKeys("Sending");
		Thread.sleep(1000);

	  	String ApproveNO =	RandomString.DOCID();
	    System.out.println(ApproveNO);
		
		Approvequantity.sendKeys("1");
		Thread.sleep(600);
		Approvalnumber.click();
		Thread.sleep(600);
		Approvalnumber.sendKeys(ApproveNO);
		Thread.sleep(600);
		Validitydays.click();
		Thread.sleep(600);
		Validitydays.sendKeys("1");
		Thread.sleep(600);
		Save1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 
		//Edit1.click();
		Thread.sleep(2000);

	}
		/////////////////


	public void billing_postapprove(String MRNo) throws InterruptedException {
		
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		FO1.click();
		Thread.sleep(600);
		Registration.click();

		Thread.sleep(600);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);
		search.sendKeys(MRNo, Keys.ENTER);

		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1600);


		Servicebill.click();
		Thread.sleep(1000);
		Orders.click();
		Thread.sleep(1000);
		OrderNo2.click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(2000);
		
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);
		

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")));
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(3000);



		//Servive 2

		//		OrderNo1.click();
		//		Thread.sleep(1000);
		//		
		Save.click();
		Thread.sleep(2000);
		List<WebElement> dynamicElement1111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();	
		Thread.sleep(600);
	    Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();	
		Thread.sleep(600);
		FO.click();
		Thread.sleep(600);
		List<WebElement> dynamicElement3=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement3.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);

		RCM1.click();
		Thread.sleep(1000);
		Insuranceapproval.click();
		Thread.sleep(1000);
		MRNOenter.sendKeys(MRNo);
		Thread.sleep(1000);
		Search1.click();
		Thread.sleep(1000);


		Status1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Open']")).click();
		Thread.sleep(1000);
		Search1.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//ki-select-control[@title='Status']//input[@id='undefined']")).click();
		
		//Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approve']")).click();
		Thread.sleep(1000);
		Itemcheckbox.click();
		Thread.sleep(1000);
		//Remarks.sendKeys("Sending");
		Thread.sleep(1000);

		
		
      	String ApproveNO =	RandomString.DOCID();
	    System.out.println(ApproveNO);
	
		Approvequantity.sendKeys("1");
		Thread.sleep(600);
		Approvalnumber.click();
		Thread.sleep(600);
		Approvalnumber.sendKeys(ApproveNO);
		Thread.sleep(600);
		Validitydays.click();
		Thread.sleep(600);
		Validitydays.sendKeys("1");
		Thread.sleep(600);
		Save1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 
		//Edit1.click();
		Thread.sleep(2000);


		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		FO1.click();
		Thread.sleep(600);
		Registration.click();

		Thread.sleep(600);
		List<WebElement> dynamicElement4=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement4.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);
		search.sendKeys(MRNo, Keys.ENTER);

		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(600);

		Servicebill.click();
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(3000);






	}

}