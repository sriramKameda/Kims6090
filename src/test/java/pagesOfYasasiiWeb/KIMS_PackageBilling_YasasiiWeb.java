package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_PackageBilling_YasasiiWeb extends PageFactoryInitYasasiiWeb{

	public KIMS_PackageBilling_YasasiiWeb(WebDriver driver) {

		super(driver);


	}	 


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Masters;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM-Packages']")
	public WebElement RCM_Packages;

	@FindBy(xpath = "//div[normalize-space()='Package Group']")
	public WebElement PackageGroup;

	@FindBy(xpath = "//input[@id='packagegroupname']")
	public WebElement packagegroupname;

	@FindBy(xpath = "//input[@id='packagegroupamountlimit']")
	public WebElement GroupLimit;

	@FindBy(xpath = "//input[@id='amountlimitmodeid']")
	public WebElement LimitMode;

	@FindBy(xpath = "//span[normalize-space()='Services']")
	public WebElement Services;

	@FindBy(xpath = "//ki-select-control[@title='Service Type']//input[@id='undefined']")
	public WebElement servicetype;

	@FindBy(xpath = "//input[@id='basecategoryid']")
	public WebElement BaseCategory;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement ServiceName;

	@FindBy(xpath = "//input[@id='servicecountlimit']")
	public WebElement ServiceCountLimit;

	@FindBy(xpath = "//input[@id='limitsettingmodeid']")
	public WebElement LimitSettingMode;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement save;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//li[@class='sidebar-item ng-star-inserted']//li[1]//a[1]")
	public WebElement ServiceMaster;

	@FindBy(xpath = "//input[@id='rootinvcatgeoryser']")
	public WebElement baseCategory;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement Servicename;

	@FindBy(xpath = "//span[normalize-space()='Site Mapping']")
	public WebElement SiteMapping;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement ServiceCheck;

	@FindBy(xpath = "//i[@class='ki ki-chevron-right']")
	public WebElement moveToright;

	@FindBy(xpath = "//div[normalize-space()='Package Definition']")
	public WebElement PackageDefinition;

	@FindBy(xpath = "//input[@id='id']")
	public WebElement Package_Name;

	@FindBy(xpath = "//input[@id='packagetypeid']")
	public WebElement PackageType;

	@FindBy(xpath = "//input[@id='packageduration']")
	public WebElement Packageduration;

	@FindBy(xpath = "//input[@id='packageamountlimit']")
	public WebElement PackageLimit;

	@FindBy(xpath = "//input[@id='defaultcoveragestatusid']")
	public WebElement DefaultCoverage;

	@FindBy(xpath = "//button[@class='dropdown-toggle form-control multiselect-list']")
	public WebElement AllowedSite;

	@FindBy(xpath = "//input[@id='amountlimitmodeid']")
	public WebElement limitMode;

	@FindBy(xpath = "//input[@id='groupid']")
	public WebElement GroupName;

	@FindBy(xpath = "//input[@id='undefined']")
	public WebElement Coverage;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM-Plan']")
	public WebElement RCM_Plan;

	@FindBy(xpath = "//div[normalize-space()='Tariff Setting']")
	public WebElement TariffSetting;

	@FindBy(xpath = "//input[@placeholder='Search reference name...']")
	public WebElement searchScheme;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='servicetypeid']//input[@id='undefined']")
	public WebElement ServiceType;

	@FindBy(xpath = "//span[normalize-space()='Charge Parameter']")
	public WebElement ChargingParameter;
	
	@FindBy(xpath="//input[@id='encountersubmodeid']")
	public WebElement Submode;

	@FindBy(xpath="//input[@id='paymodeid']")
	public WebElement Paymode;
	
	@FindBy(xpath = "//span[normalize-space()='Charge - Tax']")
	public WebElement ChargeTax;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ADJpercent;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement SponsorAmount;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement withoutvat;

	@FindBy(xpath = "//span[normalize-space()='Charge - Tax']")
	public WebElement ChargeTAx;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tariffBaseCharge;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tariffcontractCharge;

	@FindBy(xpath="//button[@id='AddButton']//i[@class='ki ki-plus']")
	public WebElement tariffAdd;

	@FindBy(xpath="//button[normalize-space()='Update']")
	public WebElement Update;

	@FindBy(xpath = "//div[normalize-space()='Package Tariff Mapping']")
	public WebElement PackageTariffMapping;

	@FindBy(xpath = "//div[4]//ki-select-control[1]//div[1]//input[1]")
	public WebElement planName;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement SearchPackage;

	@FindBy(xpath = "//div[normalize-space()='Package to Site Mapping']")
	public WebElement PackageToSitemapping;

	@FindBy(xpath = "//input[@id='packageid']")
	public WebElement Packagename;

	@FindBy(xpath = "//button[@class='dropdown-toggle form-control multiselect-list']")
	public WebElement submode;

	@FindBy(xpath = "//label[normalize-space()='Modules']")
	public WebElement Modules;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Search;

	@FindBy(xpath = "//span[normalize-space()='Package']")
	public WebElement Package;
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;


	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement Addnew;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement ServiceName1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ki-calender-time[1]/div[1]/input[1]")
	public WebElement StartName;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='packagemastpatientid']//input[@id='undefined']")
	public WebElement Packageselection;

	@FindBy(xpath = "//i[@title='Package Details']")
	public WebElement PackageDetails;

	@FindBy(xpath = "//th[@class='max groupcoveragestatus']")
	public WebElement coverage;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement close;

	@FindBy(xpath = "//i[@title='Package Utilization']")
	public WebElement PackageUtilization;

	@FindBy(xpath = "//button[@title='Search']//i[@class='ki ki-search']")
	public WebElement SearchUtilization;

	@FindBy(xpath = "//label[@title='Add']")
	public WebElement ServiceAdd;

	@FindBy(xpath = "//div[normalize-space()='Pharmacy Panel']")
	public WebElement PharmacyPanel;

	@FindBy(xpath = "//div[normalize-space()='OP Panel']")
	public WebElement OPPanel;

	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement Pharmacylocation;

	@FindBy(xpath = "//button[@id='btnsearch']")
	public WebElement OK;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement Yes;

	@FindBy(xpath = "//i[@title='Walk-In']")
	public WebElement Walk_in;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='packageid']//input[@id='undefined']")
	public WebElement AvailablePackage;

	@FindBy(xpath = "//th[@class='billamount']")
	public WebElement BillAmount;

	@FindBy(xpath = "//input[@id='medicinename']")
	public WebElement ItemName;

	@FindBy(xpath = "//input[@id='qtynew']")
	public WebElement QTY;

	@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
	public WebElement Status;

	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement counterSearch;

	@FindBy(xpath = "//div[@class='plt-prt-5 col-md-8']//i[@class='ki ki-search']")
	public WebElement counterSearchicon;
	
	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement medicineCheck;
	
	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement stockSave;

	@FindBy(xpath = "//li[normalize-space()='Stock Reservation']")
	public WebElement StockReservation;

	@FindBy(xpath = "//button[@class='icon-btn btn-dark-green inline']")
	public WebElement ServiceAdd1;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='servicecoveragestatus']//input[@id='undefined']")
	public WebElement TariffCoverage;

	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement StockReservationsave;

	@FindBy(xpath = "//label[@title='Remove package']//i[@class='ki ki-close-circle']")
	public WebElement Remove_Package;

	@FindBy(xpath = "//i[@class='ki ki-cash-transfer-fill']")
	public WebElement availedServices;

	@FindBy(xpath = "//i[@class='ki ki-search text-white']")
	public WebElement AvailedSearch;

	@FindBy(xpath = "//span[normalize-space()='Package View']")
	public WebElement PackageView;

	@FindBy(xpath = "//button[@title='Search']")
	public WebElement Packagesearch;

	@FindBy(xpath = "//div[@class='col-md-4 ta-r']//li[@class='pagination-prev page-item disabled ng-star-inserted']")
	public WebElement prev;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ClosureRemarks;
	
	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement AddService;

	@FindBy(xpath = "//input[@placeholder='Package Name']")
	public WebElement SearchPackage1;
	
	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement referenceLetter;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement referenceLetter1;

	@FindBy(xpath = "//input[@id='refno']")
	public WebElement referencenumber;

	@FindBy(xpath = "//ki-calendar[@formcontrolname='validfrom']//input[@type='text']")
	public WebElement FrmDate;

	@FindBy(xpath = "//ki-calendar[@formcontrolname='validto']//input[@type='text']")
	public WebElement ToDate;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement ADD;
	
//	@FindBy(xpath = "//input[@id='searchText']")
//	public WebElement counterSearch;
//
//	@FindBy(xpath = "//div[@class='plt-prt-5 col-md-8']//i[@class='ki ki-search']")
//	public WebElement counterSearchicon;
//	
//	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
//	public WebElement medicineCheck;
//	
//	@FindBy(xpath = "//button[@id='billholdsave']")
//	public WebElement stockSave;
//
//	@FindBy(xpath = "//li[normalize-space()='Stock Reservation']")
//	public WebElement StockReservation;
//
//	@FindBy(xpath = "//button[@class='icon-btn btn-dark-green inline']")
//	public WebElement ServiceAdd1;
//
//	@FindBy(xpath = "//ki-select-control[@formcontrolname='servicecoveragestatus']//input[@id='undefined']")
//	public WebElement TariffCoverage;
//
//	@FindBy(xpath = "//button[@id='billholdsave']")
//	public WebElement StockReservationsave;
//
//	@FindBy(xpath = "//label[@title='Remove package']//i[@class='ki ki-close-circle']")
//	public WebElement Remove_Package;


	





	public void PackageCreation(String PackageName,String Service1,String  Service2,String Service3,String Service4,String Service5,String Service6) throws InterruptedException, AWTException{

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		Masters.click();
		Thread.sleep(1000);
//		RCM_Packages.click();
//		Thread.sleep(1000);
//		PackageGroup.click();
//		Thread.sleep(1000);
//		packagegroupname.sendKeys(PackageName);
//		Thread.sleep(1000);
//		GroupLimit.sendKeys("25000");
//		Thread.sleep(1000);
//		LimitMode.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Net']")).click();
//		Thread.sleep(1000);
//		Services.click();
//		Thread.sleep(1000);
//
//		///Service1
//
//		Thread.sleep(700);
//		servicetype.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		BaseCategory.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		ServiceName.click();
//		Thread.sleep(700);
//		ServiceName.sendKeys(Service1);
//		Thread.sleep(700);
//		for (int i = 0; i < 5; i++) {
//			
//			ServiceName.sendKeys(Keys.BACK_SPACE);
//			Thread.sleep(700);
//		}
//		
//		driver.findElement(By.xpath("//li[normalize-space()='"+Service1+"']")).click();
//		Thread.sleep(1200);
//		driver.findElement(By.xpath("//span[normalize-space()='Limits']")).click();
//		Thread.sleep(1000);
//		
//		
//		ServiceCountLimit.click();
//		Thread.sleep(700);
//		ServiceCountLimit.sendKeys("2");
//		Thread.sleep(700);
//		LimitSettingMode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Service wise']")).click();
//		Thread.sleep(700);
//		ServiceAdd1.click();
//		Thread.sleep(700);
//		
//
//		///Service2
//
//		Thread.sleep(700);
//		servicetype.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		BaseCategory.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		ServiceName.click();
//		Thread.sleep(700);
//		ServiceName.sendKeys(Service2);
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='"+Service2+"']")).click();
//		Thread.sleep(700);
//		ServiceCountLimit.click();
//		Thread.sleep(700);
//		ServiceCountLimit.sendKeys("2");
//		Thread.sleep(700);
//		LimitSettingMode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Service wise']")).click();
//		Thread.sleep(700);
//		ServiceAdd1.click();
//		Thread.sleep(700);
//		
//
//		///Service3
//
//		Thread.sleep(700);
//		servicetype.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		BaseCategory.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		ServiceName.click();
//		Thread.sleep(700);
//		ServiceName.sendKeys(Service3);
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='"+Service3+"']")).click();
//		Thread.sleep(700);
//		ServiceCountLimit.click();
//		Thread.sleep(700);
//		ServiceCountLimit.sendKeys("2");
//		Thread.sleep(700);
//		LimitSettingMode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Service wise']")).click();
//		Thread.sleep(700);
//		ServiceAdd1.click();
//		Thread.sleep(700);
//
//		///Service4
//
//		Thread.sleep(700);
//		servicetype.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		BaseCategory.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		ServiceName.click();
//		Thread.sleep(700);
//		ServiceName.sendKeys(Service4);
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='"+Service4+"']")).click();
//		Thread.sleep(700);
//		ServiceCountLimit.click();
//		Thread.sleep(700);
//		ServiceCountLimit.sendKeys("2");
//		Thread.sleep(700);
//		LimitSettingMode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Service wise']")).click();
//		Thread.sleep(700);
//		ServiceAdd1.click();
//		Thread.sleep(700);
//
//
//		///Service5
//
//		Thread.sleep(700);
//		servicetype.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		BaseCategory.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		ServiceName.click();
//		Thread.sleep(700);
//		ServiceName.sendKeys(Service5);
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='"+Service5+"']")).click();
//		Thread.sleep(700);
//		ServiceCountLimit.click();
//		Thread.sleep(700);
//		ServiceCountLimit.sendKeys("2");
//		Thread.sleep(700);
//		LimitSettingMode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Service wise']")).click();
//		Thread.sleep(700);
//		ServiceAdd1.click();
//		Thread.sleep(700);
//
//		///Service6
//
//		Thread.sleep(700);
//		servicetype.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		BaseCategory.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
//		Thread.sleep(700);
//		ServiceName.click();
//		Thread.sleep(700);
//		ServiceName.sendKeys(Service6);
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='"+Service6+"']")).click();
//		Thread.sleep(700);
//		ServiceCountLimit.click();
//		Thread.sleep(700);
//		ServiceCountLimit.sendKeys("2");
//		Thread.sleep(700);
//		LimitSettingMode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Service wise']")).click();
//		Thread.sleep(700);
//		ServiceAdd1.click();
//		Thread.sleep(700);
//
//		///Service7
//
//		Thread.sleep(700);
//		servicetype.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Pharmacy']")).click();
//		Thread.sleep(700);
//		BaseCategory.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Pharmacy']")).click();
//		Thread.sleep(700);
//		ServiceName.click();
//		Thread.sleep(700);
//		ServiceName.sendKeys("DOLOPAR 650 TAB");
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='DOLOPAR 650 TAB']")).click();
//		Thread.sleep(700);
//		ServiceCountLimit.click();
//		Thread.sleep(700);
//		ServiceCountLimit.sendKeys("500");
//		Thread.sleep(700);
//		LimitSettingMode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Service wise']")).click();
//		Thread.sleep(700);
//		ServiceAdd1.click();
//		Thread.sleep(700);
//
//
//		///Service8
//
//		Thread.sleep(700);
//		servicetype.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Pharmacy']")).click();
//		Thread.sleep(700);
//		BaseCategory.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Pharmacy']")).click();
//		Thread.sleep(700);
//		ServiceName.click();
//		Thread.sleep(700);
//		ServiceName.sendKeys("CROCIN 650MG TAB");
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='CROCIN 650MG TAB']")).click();
//		Thread.sleep(700);
//		ServiceCountLimit.click();
//		Thread.sleep(700);
//		ServiceCountLimit.sendKeys("500");
//		Thread.sleep(700);
//		LimitSettingMode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Service wise']")).click();
//		Thread.sleep(700);
//		ServiceAdd1.click();
//		Thread.sleep(700);
//
//
//		///Service9
//
//		Thread.sleep(700);
//		servicetype.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Pharmacy']")).click();
//		Thread.sleep(700);
//		BaseCategory.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Pharmacy']")).click();
//		Thread.sleep(700);
//		ServiceName.click();
//		Thread.sleep(700);
//		ServiceName.sendKeys("ALTHROCIN 250MG TAB");
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='ALTHROCIN 250MG TAB']")).click();
//		Thread.sleep(700);
//		ServiceCountLimit.click();
//		Thread.sleep(700);
//		ServiceCountLimit.sendKeys("500");
//		Thread.sleep(700);
//		LimitSettingMode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Service wise']")).click();
//		Thread.sleep(700);
//		ServiceAdd1.click();
//		Thread.sleep(700);
//
//
//		///Service9
//
//		Thread.sleep(700);
//		servicetype.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Pharmacy']")).click();
//		Thread.sleep(700);
//		BaseCategory.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Pharmacy']")).click();
//		Thread.sleep(700);
//		ServiceName.click();
//		Thread.sleep(700);
//		ServiceName.sendKeys("ZOVIRAX SUSPENSION 100ML");
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='ZOVIRAX SUSPENSION 100ML']")).click();
//		Thread.sleep(700);
//		ServiceCountLimit.click();
//		Thread.sleep(700);
//		ServiceCountLimit.sendKeys("500");
//		Thread.sleep(700);
//		LimitSettingMode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Service wise']")).click();
//		Thread.sleep(700);
//		ServiceAdd1.click();
//		Thread.sleep(700);
//		save.click();
//		Thread.sleep(1200);
//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//		Thread.sleep(1000); 
//////Service Master		
//	
//		Thread.sleep(2000);
//		Hamberger.click();
//		Thread.sleep(1000);
//		Service.click();
//		Thread.sleep(1000);
//		ServiceMaster.click();
//		Thread.sleep(1000);
//		baseCategory.click();
//		Thread.sleep(1000);
//		baseCategory.sendKeys("Package");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Package']")).click();
//		Thread.sleep(700);
//
//		Servicename.click();
//		Thread.sleep(1000);
//		Servicename.sendKeys(PackageName);
//		Thread.sleep(1000);
//		
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", SiteMapping);
//		
//		SiteMapping.click();
//		Thread.sleep(1000);
//		js.executeScript("arguments[0].scrollIntoView();", ServiceCheck);
//		
//		ServiceCheck.click();
//		Thread.sleep(1000);
//		moveToright.click();
//		Thread.sleep(1000);
//		save.click();
//		Thread.sleep(1000);
////		Thread.sleep(1000);
//		Robot t=new Robot();
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(400);   
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		
//	/////package Definition
//		
//		Thread.sleep(1000);
//		Hamberger.click();
//		Thread.sleep(1000);
//		RCM_Packages.click();
//		Thread.sleep(1000);
//		PackageDefinition.click();
//		Thread.sleep(1000);
//		Package_Name.click();
//		Thread.sleep(1000);
//		Package_Name.sendKeys(PackageName);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='"+PackageName+"']")).click();
//		Thread.sleep(700);
//		PackageType.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Multi Day']")).click();
//		Thread.sleep(700);
//		Packageduration.sendKeys("30");
//		Thread.sleep(1000);
//		PackageLimit.click();
//		Thread.sleep(1000);
//		PackageLimit.sendKeys("25000");
//		Thread.sleep(1000);
//		DefaultCoverage.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Inclusion']")).click();
//		Thread.sleep(700);
//		submode.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@title='OP']")).click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//span[@title='IP']")).click();
//		Thread.sleep(700);
//
//		limitMode.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Net']")).click();
//		Thread.sleep(700);
//		GroupName.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='"+PackageName+"']")).click();
//		Thread.sleep(700);
//
//		Coverage.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Inclusion']")).click();
//		Thread.sleep(700);
//		Add.click();
//		Thread.sleep(1000);
//		save.click();
//		Thread.sleep(3000);
//		
//		Thread.sleep(1000);
//    	List<WebElement> dynamicElement1=driver.findElements(By.xpath("(//button[@class='btn btn-primary sm'])[1]"));
//		
//		if(dynamicElement1.size() !=0)
//		{
//			driver.findElement(By.xpath("(//button[@class='btn btn-primary sm'])[1]")).click();
//		}
//		 
//
//		  else {
//		System.out.println("sri");
//		  }
//		Thread.sleep(1000);
//		
////		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
////		Thread.sleep(700);
//		
//		
//		///RCM_plan 
//
//		Thread.sleep(2000);
//		Hamberger.click();
//		Thread.sleep(1000);
//		RCM_Plan.click();
//		Thread.sleep(1000);
//		TariffSetting.click();
//		Thread.sleep(1000);
//		searchScheme.clear();
//		Thread.sleep(1000);
//		searchScheme.sendKeys("MSD Ins Corp PVT.LTD" , Keys.ENTER);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='result-name']")).click();
//		Thread.sleep(700);
//		Edit.click();
//		Thread.sleep(1000);
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(160));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[1]/label[1]/a[1]/i[1]")));
//		Thread.sleep(2000);		
//		
//		
//		Services.click();
//		Thread.sleep(1000);
//		ServiceType.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Package']")).click();
//		Thread.sleep(700);
//		BaseCategory.click();
//		driver.findElement(By.xpath("//li[normalize-space()='Package']")).click();
//		Thread.sleep(700);
//		ServiceName.click();
//		Thread.sleep(1000);
//		ServiceName.sendKeys(PackageName);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='"+PackageName+"']")).click();
//		Thread.sleep(1000);
//		
//		TariffCoverage.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='Inclusion']")).click();
//		Thread.sleep(700);
//		
//		
//		ChargingParameter.click();
//		Thread.sleep(1000);
//		Submode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
//		Thread.sleep(700);
//		Paymode.click();
//		driver.findElement(By.xpath("//li[normalize-space()='Cash']")).click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//label[@title='Add submode and paymode']//i[@class='ki ki-plus']")).click();
//		Thread.sleep(700);
//		Submode.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
//		Thread.sleep(700);
//		Paymode.click();
//		driver.findElement(By.xpath("//li[normalize-space()='Credit']")).click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//label[@title='Add submode and paymode']//i[@class='ki ki-plus']")).click();
//		Thread.sleep(700);
//		ChargingParameter.click();
//		Thread.sleep(1000);
//		
//		
//		ChargeTAx.click();
//		Thread.sleep(1000); 
//		//JavascriptExecutor js= (JavascriptExecutor) driver;
//		//js.executeScript("arguments[0].scrollIntoView();", tariffcontractCharge);
//		Thread.sleep(1000); 
//		tariffBaseCharge.click();
//		Thread.sleep(1000); 
//		tariffBaseCharge.sendKeys("25000");
//		Thread.sleep(1000); 
//		tariffcontractCharge.click();
//		Thread.sleep(1000); 
//		tariffcontractCharge.sendKeys("25000");
//		Thread.sleep(1000); 
//		//		ADJpercent.click();
//		//		Thread.sleep(1000); 
//		//		ADJpercent.sendKeys("0");
//		//		Thread.sleep(1000); 
//		//		SponsorAmount.click();
//		//		Thread.sleep(1000); 
//		//		SponsorAmount.sendKeys("219.28");
//		//		Thread.sleep(1000); 
//		//		withoutvat.click();
//		//		Thread.sleep(1000); 
//		//		withoutvat.sendKeys("219.28");
//		//		Thread.sleep(1000); 
//
//
//			JavascriptExecutor js1= (JavascriptExecutor) driver;
//		js1.executeScript("arguments[0].scrollIntoView();", tariffAdd);
//		Thread.sleep(1000); 
//		ChargeTAx.click();
//		Thread.sleep(1000); 
//		tariffAdd.click();
//		Thread.sleep(1500); 
//		List<WebElement> dynamicElement11=driver.findElements(By.xpath("/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]"));
//
//		if(dynamicElement11.size() !=0)
//		{
//			Robot t1=new Robot();
//			t1.keyPress(KeyEvent.VK_ESCAPE);
//			t1.keyRelease(KeyEvent.VK_ESCAPE);
//			Thread.sleep(400);
//			t1.keyPress(KeyEvent.VK_ESCAPE);
//			t1.keyRelease(KeyEvent.VK_ESCAPE);
//
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		Thread.sleep(1000);
//
//		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait1.until(ExpectedConditions.elementToBeClickable(Update));
//		Thread.sleep(10000);
//		
//		Update.click();
//		Thread.sleep(3000); 
//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//		Thread.sleep(1000); 
//
//		///Package Tariff mapping	
//
//		Thread.sleep(2000);
//		Hamberger.click();
		Thread.sleep(1000);
		RCM_Packages.click();
		Thread.sleep(1000);
		PackageTariffMapping.click();
		Thread.sleep(1000);
		planName.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='MSD Full cover']")).click();
		Thread.sleep(1000); 

		SearchPackage1.click();
		Thread.sleep(1000);
		SearchPackage1.sendKeys(PackageName, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='result-name']")).click();
		Thread.sleep(700);
		Edit.click();
		Thread.sleep(5000);
		Update.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(700);


		///package to Sitemapping	


		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);

		PackageToSitemapping.click();
		Thread.sleep(1000);
		SearchPackage.sendKeys("MSD Full cover" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='result-name']")).click();
		Thread.sleep(700);
		Edit.click();
		Thread.sleep(1000);
		Packagename.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PackageName+"']")).click();
		Thread.sleep(700);

		AllowedSite.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@role='menuitem']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@role='menuitem']")).click();
		Thread.sleep(700);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='"+Site+"']")).click();
		Thread.sleep(700);
		Add.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(700);



	}


	public void package_Billing(String MRNO,String PackageName,String Service1,String  Service2,String Service3,String Service4,String Service5,String Service6) throws InterruptedException, AWTException {

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		Modules.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-reception-fill']")).click();
		Thread.sleep(700);
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
		Thread.sleep(1000);
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		
		Search.sendKeys(MRNO, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[normalize-space()='Service']")).click();
//		Thread.sleep(1700);
//		clear.click();
//		Thread.sleep(1000);
//		
//		Addnew.click();
//		Thread.sleep(1000);
////		ServiceName1.click();
////		Thread.sleep(1000);
////		ServiceName1.sendKeys("Admission charges");
////		Thread.sleep(1000);
////		driver.findElement(By.xpath("//li[normalize-space()='Admission charges']")).click();
////		Thread.sleep(1000);
////		AddService.click();
////		Thread.sleep(1000);
////		
////		Thread.sleep(1000);
////		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
////
////		if(dynamicElement11.size() !=0)
////		{
////			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
////		}
////
////
////		else {
////			System.out.println("sri");
////		}
////		Thread.sleep(1000);
////
////		save.click();
////		Thread.sleep(1000);
////		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
////		Thread.sleep(2000);
//	
//		
//		
//		ServiceName1.click();
//		Thread.sleep(1000);
//		ServiceName1.sendKeys(PackageName);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='"+PackageName+"']")).click();
//		Thread.sleep(700);
//		StartName.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
//		Thread.sleep(700);
//		Add.click();
//		Thread.sleep(1000);
//    	List<WebElement> dynamicElement111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));
//		
//		if(dynamicElement111.size() !=0)
//		{
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		}
//		 
//
//		  else {
//		System.out.println("sri");
//		  }
//		Thread.sleep(1000);
//	
//		save.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
//		Thread.sleep(2700);


		Package.click();
		Thread.sleep(1000);
		
		clear.click();
		Thread.sleep(1000);
		//	billprint.click();
		//	Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		
		Packageselection.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+PackageName+"')])[1]")).click();
		Thread.sleep(2000);
		PackageDetails.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", coverage);

		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
		PackageUtilization.click();
		Thread.sleep(1000);
		SearchUtilization.click();
		Thread.sleep(5000);
		close.click();
		Thread.sleep(1000);
		Addnew.click();
		Thread.sleep(1000);
		ServiceName.clear();
		Thread.sleep(1000);
		ServiceName.sendKeys(Service1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Service1+"']")).click();
		Thread.sleep(700);
		ServiceAdd.click();
		Thread.sleep(1000);
		ServiceName.clear();
		Thread.sleep(1000);
		ServiceName.sendKeys(Service2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Service2+"']")).click();
		Thread.sleep(700);
		ServiceAdd.click();
		Thread.sleep(1000);
		ServiceName.clear();
		Thread.sleep(1000);
		ServiceName.sendKeys(Service3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Service3+"']")).click();
		Thread.sleep(700);
		ServiceAdd.click();
		Thread.sleep(1000);
		ServiceName.clear();
		Thread.sleep(1000);
		ServiceName.sendKeys(Service4);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Service4+"']")).click();
		Thread.sleep(700);
		ServiceAdd.click();
		Thread.sleep(1000);
		ServiceName.clear();
		Thread.sleep(1000);
		ServiceName.sendKeys(Service5);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Service5+"']")).click();
		Thread.sleep(700);
		ServiceAdd.click();
		Thread.sleep(1000);
		ServiceName.clear();
		Thread.sleep(1000);
		ServiceName.sendKeys(Service6);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Service6+"']")).click();
		Thread.sleep(1000);
		ServiceAdd.click();
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		referenceLetter.click();
		Thread.sleep(1000);
		referencenumber.click();
		Thread.sleep(1000);
		referencenumber.sendKeys("524356346");
		Thread.sleep(1000);

		FrmDate.click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		ToDate.click();
		Thread.sleep(1000);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);

		ADD.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		
		
		
		save.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(700);
		
		
		
	}	
		
		public void PharmacyPackagebill(String MRNO,String PackageName) throws InterruptedException, AWTException {
			
			
	
		

		////PharmacyPanel

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		PharmacyPanel.click();
		Thread.sleep(1000);
		OPPanel.click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		
		
		Pharmacylocation.click();
		Thread.sleep(2000);
		//PharmacyLocation.click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(1000);
		Thread.sleep(700);
		OK.click();
		Thread.sleep(1000);
		//Yes.click();
		Thread.sleep(1000);
		Walk_in.click();
		Thread.sleep(1000);
		Search.sendKeys(MRNO, Keys.ENTER);
		Thread.sleep(1000);
		Search.sendKeys( Keys.ENTER);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		AvailablePackage.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[contains(text(),'"+PackageName+"')])[1]")).click();
		Thread.sleep(2000);

		PackageUtilization.click();
		Thread.sleep(1000);
		SearchUtilization.click();
		Thread.sleep(700);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", BillAmount);
		
		Thread.sleep(1000);
		close.click();

		//item 1
		Thread.sleep(2000);
		ItemName.clear();
		Thread.sleep(1000);
		ItemName.sendKeys("DOLOPAR 650 TAB");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='DOLOPAR 650 TAB']")).click();
		Thread.sleep(700);
		Thread.sleep(1000);
		QTY.sendKeys("2");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(3000);
		
		//item 2
		Thread.sleep(1000);
		ItemName.clear();
		Thread.sleep(1000);
		ItemName.sendKeys("ALTHROCIN 250MG TAB");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='ALTHROCIN 250MG TAB']")).click();
		Thread.sleep(700);

		QTY.sendKeys("1");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(3000);
		
		///Item 3	
		Thread.sleep(1000);
		ItemName.clear();
		Thread.sleep(1000);

		ItemName.sendKeys("ZOVIRAX SUSPENSION 100ML");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='ZOVIRAX SUSPENSION 100ML']")).click();
		Thread.sleep(700);

		QTY.sendKeys("1");
		Thread.sleep(1000);
		Add.click();

		//Item 4
		Thread.sleep(3000);
		ItemName.clear();
		Thread.sleep(1000);
		ItemName.sendKeys("CROCIN 650MG TAB");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='CROCIN 650MG TAB']")).click();
		Thread.sleep(700);

		QTY.sendKeys("1");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(save));
		Thread.sleep(9000);		
		save.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
	///Stock Reservation
		
		wait.until(ExpectedConditions.elementToBeClickable(Status));
		Thread.sleep(3000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed']")).click();
		Thread.sleep(1000);
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(2000);
		AvailablePackage.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+PackageName+"')])[1]")).click();
		Thread.sleep(2000);

		medicineCheck.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(stockSave));
		Thread.sleep(3000);
		
		stockSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
//bill
		
		Status.click();
		Thread.sleep(1000);
		StockReservation.click();
		Thread.sleep(1000);
		
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Print']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//i[@title='Cancel Stock Reservation']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		///Stock Reservation
		
				wait.until(ExpectedConditions.elementToBeClickable(Status));
				Thread.sleep(3000);
				Status.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='Confirmed']")).click();
				Thread.sleep(1000);
				counterSearch.clear();
				Thread.sleep(1000);
				counterSearch.sendKeys(MRNO);
				Thread.sleep(1000);
				//counterSearchicon.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
				Thread.sleep(2000);
				AvailablePackage.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//*[contains(text(),'"+PackageName+"')])[1]")).click();
				Thread.sleep(2000);

				medicineCheck.click();
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(stockSave));
				Thread.sleep(3000);
				
				stockSave.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
				Thread.sleep(1000);
		
		
				//bill
				
				Status.click();
				Thread.sleep(1000);
				StockReservation.click();
				Thread.sleep(1000);
				
				counterSearch.clear();
				Thread.sleep(1000);
				counterSearch.sendKeys(MRNO);
				Thread.sleep(1000);
				//counterSearchicon.click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//label[normalize-space()='Print']//span[@class='checkmark']")).click();
				Thread.sleep(1000);
				
		
		
//		wait.until(ExpectedConditions.elementToBeClickable(Remove_Package));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		
		
		}
		
		public void packageClosure(String MRNO) throws InterruptedException, AWTException {
			
			
			Thread.sleep(2000);
			Hamberger.click();
			Thread.sleep(1000);
			Modules.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class='ki ki-reception-fill']")).click();
			Thread.sleep(1000);
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
			Thread.sleep(1000);
			Thread.sleep(1000);
			List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

			if(dynamicElement1.size() !=0)
			{
				driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			}


			else {
				System.out.println("sri");
			}
			Thread.sleep(1000);
			
			
			Search.sendKeys(MRNO, Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
			Thread.sleep(2000);
			availedServices.click();
			Thread.sleep(700);
			AvailedSearch.click();
			Thread.sleep(1700);
			PackageView.click();
			Thread.sleep(700);
			AvailedSearch.click();
			Thread.sleep(700);
			List<WebElement> packageutilize=driver.findElements(By.xpath("//i[@title='Package Utilization']"));
			
			int i =  packageutilize.size();
			
		
	       List<WebElement> packageClosure=driver.findElements(By.xpath("//i[@title='Package Closure']"));
			
			int j =  packageClosure.size();						
									
			
		driver.findElement(By.xpath("(//i[@title='Package Utilization'])["+i+"]")).click();
		Thread.sleep(700);
		Packagesearch.click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", prev);
		Thread.sleep(2700);
		
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@title='Package Closure'])["+j+"]")).click();
		Thread.sleep(1000);
		ClosureRemarks.click();
		Thread.sleep(1000);
		ClosureRemarks.sendKeys("OK");
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(700);
		
			
			
		}
		
		
		
		

}

