package pagesOfYasasiiWeb;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;



import io.netty.handler.timeout.TimeoutException;

public class KIMS_PackageCreation_Yasassiweb extends PageFactoryInitYasasiiWeb {

	public KIMS_PackageCreation_Yasassiweb(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement menuToggle;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastersModule;
	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Service']")
	public WebElement serviceTab;
	@FindBy(xpath = "//div[normalize-space()='Service Master']")
	public WebElement serviceMasterTab;
	@FindBy(xpath = "//input[@id='rootinvcatgeoryser']")
	public WebElement baseCategory;
	@FindBy(xpath = "//li[normalize-space()='Package']")
	public WebElement selectPackage;
	@FindBy(xpath = "//input[@id='name']")
	public WebElement serviceName;
	@FindBy(xpath = "//label[normalize-space()='Display in EMR']//span[@class='checkmark']")
	public WebElement disableEMRcheckbox;
	@FindBy(xpath = "//button[@id='servicemastersave']")
	public WebElement saveButton;
	@FindBy(xpath = "//accordion-group[@class='null ng-star-inserted']//div[@role='button']")
	public WebElement siteMappingTab;
	@FindBy(xpath = "//label[contains(text(),' Package(EHP)')]//span[@class='checkmark']")
	public WebElement selectCheckbox;
	@FindBy(xpath = "//i[@class='ki ki-chevron-right']")
	public WebElement moveArrow;
	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM-Packages']")
	public WebElement rcmPackage;
	@FindBy(xpath = "//li[@class='sidebar-item ng-star-inserted']//li[1]//a[1]")
	public WebElement packageGroup;
	@FindBy(xpath = "//input[@id='packagegroupname']")
	public WebElement packageGroupName;
	@FindBy(xpath = "//input[@id='packagegroupamountlimit']")
	public WebElement groupLimit;
	@FindBy(xpath = "//input[@id='amountlimitmodeid']")
	public WebElement limitMode;
	@FindBy(xpath = "//li[normalize-space()='Gross']")
	public WebElement gross;
	@FindBy(xpath = "//accordion-group[@heading='Services']//div[@role='button']")
	public WebElement services;
	@FindBy(xpath = "//ki-select-control[@title='Service Type']//input[@id='undefined']")
	public WebElement serviceType;
	@FindBy(xpath = "//li[normalize-space()='Laboratory']")
	public WebElement serviceTypeLaboratory;
	@FindBy(xpath = "//input[@id='basecategoryid']")
	public WebElement baseCategory2;
	@FindBy(xpath = "//li[@class='uparrow-yellow']")
	public WebElement baseCategoryLaboratory;
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement serviceName2;
	@FindBy(xpath = "//li[normalize-space()='Biopsy-Bone Marrow Trephine']")
	public WebElement selectBiopsy;
	@FindBy(xpath = "//li[normalize-space()='Sodium (ISE Indirect)']")
	public WebElement selectSodium;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement addToGrid;
	@FindBy(xpath = "//li[normalize-space()='Potassium (ISE Indirect)']")
	public WebElement selectPotassium;
	@FindBy(xpath = "//button[@id='Savebutton']")
	public WebElement saveButtonGroup;
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement savedSuccessfullyOK;
	@FindBy(xpath = "//div[normalize-space()='Package Definition']")
	public WebElement packageDefinition;
	@FindBy(xpath = "//input[@id='id']")
	public WebElement PackageName;
	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement searchIcon;
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement packageEditIcon;
	@FindBy(xpath = "//input[@id='packagetypeid']")
	public WebElement packageType;
	@FindBy(xpath = "//li[normalize-space()='Multi Day']")
	public WebElement multipleday;
	@FindBy(xpath = "//input[@id='packageduration']")
	public WebElement packageDuration;
	@FindBy(xpath = "//input[@id='packageamountlimit']")
	public WebElement packageLimit;
	@FindBy(xpath = "//input[@id='defaultcoveragestatusid']")
	public WebElement defaultCovergaeStatus;
	@FindBy(xpath = "//li[normalize-space()='Inclusion']")
	public WebElement inclusionStatus;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-packages[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement submode;
	@FindBy(xpath = "//a[@role='menuitem']")
	public WebElement selectAll;
	@FindBy(xpath = "//input[@id='amountlimitmodeid']")
	public WebElement amoundlimitMode;
	@FindBy(xpath = "//li[normalize-space()='Gross']")
	public WebElement grossMode;
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement editIcon;
	@FindBy(xpath = "//i[@class='fa fa-square-o ng-star-inserted']")
	public WebElement selectAllSubmode;
	@FindBy(xpath = "//div[@class='result-name']")
	public WebElement moveToResult;
	@FindBy(xpath = "//accordion-group[@class='panel']//div[@role='button']")
	public WebElement groupTab;
	@FindBy(xpath = "//input[@id='groupid']")
	public WebElement groupname;
	@FindBy(xpath = "//li[normalize-space()='autogroupSod1']")
	public WebElement selectgroup1;
	@FindBy(xpath = "//input[@id='undefined']")
	public WebElement coverage;
	@FindBy(xpath = "//li[normalize-space()='Inclusion']")
	public WebElement inclusionCoverage;
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;
	@FindBy(xpath = "//li[normalize-space()='autogroupPot1']")
	public WebElement selectgroup2;
	@FindBy(xpath = "//li[normalize-space()='Inclusion']")
	public WebElement inclusionCoverageStorage;
	@FindBy(xpath = "//button[@id='Savebutton']")
	public WebElement updateButton;
	@FindBy(xpath = "//li[normalize-space()='Lipid Panel']")
	public WebElement lipidpanel;
	@FindBy(xpath = "//li[normalize-space()='Absolute Basophil Count']")
	public WebElement absolueBasophilCount;
	@FindBy(xpath = "//li[normalize-space()='Pharmacy']")
	public WebElement serviceTypePharmacy;
	@FindBy(xpath = "//li[@class='uparrow-yellow']")
	public WebElement baseCategoryPharmacy;
	@FindBy(xpath = "//li[normalize-space()='DOLO 650MG TAB']")
	public WebElement dolo;
	@FindBy(xpath = "//li[normalize-space()='6-MP 50 MG TAB']")
	public WebElement sixMpTablet;
	@FindBy(xpath = "//li[normalize-space()='ABCIXIREL 10MG 5ML INJ']")
	public WebElement abcixirelTablet;
	@FindBy(xpath = "//li[normalize-space()='SALISIA TV LOTION 50ML']")
	public WebElement salisiaTVlotion;
	@FindBy(xpath = "//li[normalize-space()='Radiology']")
	public WebElement serviceTypeRadiology;
	@FindBy(xpath = "//li[normalize-space()='Radiology']")
	public WebElement baseTypeRadiology;
	@FindBy(xpath = "//li[normalize-space()='CBCT-A']")
	public WebElement anyRadiologyService;
	@FindBy(xpath = "//li[normalize-space()='CT Abdomen + Pelvis Plain']")
	public WebElement abdomenRadiology;
	@FindBy(xpath = "//li[normalize-space()='CT Knee Joint']")
	public WebElement ctKneeRadiology;
	@FindBy(xpath = "//li[normalize-space()='Procedure']")
	public WebElement serviceTypeProcedure;
	@FindBy(xpath = "//li[@class='uparrow-yellow']")
	public WebElement baseTypeProcedure;
	@FindBy(xpath = "//li[normalize-space()='Bone Marrow']")
	public WebElement boneMarrow;
	@FindBy(xpath = "//li[normalize-space()='ABDOMINAL TAPPING']")
	public WebElement abdominalTapping;
	@FindBy(xpath = "//li[normalize-space()='Balloon Bronchoplasty']")
	public WebElement balloonBronchoplasty;
	@FindBy(xpath = "//li[normalize-space()='Other Service']")
	public WebElement serviceTypeOtherServices;
	@FindBy(xpath = "//li[normalize-space()='Other Service']")
	public WebElement baseTypeOtherServices;
	@FindBy(xpath = "//li[normalize-space()='Ayurveda']")
	public WebElement baseTypeAyurvedha;
	@FindBy(xpath = "//li[normalize-space()='AYR4 Head & Neck Massage']")
	public WebElement ayr4Service;
	@FindBy(xpath = "//li[normalize-space()='G13 Henna']")
	public WebElement g13Service;
	@FindBy(xpath = "//li[normalize-space()='Cardiology']")
	public WebElement cardiologyService;
	@FindBy(xpath = "//li[normalize-space()='ECHO Cardiogram']")
	public WebElement echoCardiogramService;
	@FindBy(xpath = "//li[normalize-space()='Ambulatory BP Monitoring ( ABPM)']")
	public WebElement ambulatoryBPservice;
	@FindBy(xpath = "//li[normalize-space()='IVF']")
	public WebElement IVFbaseService;
	@FindBy(xpath = "//li[normalize-space()='Embryo Freezing (6 Months)']")
	public WebElement embryofreezingService;
	@FindBy(xpath = "//li[normalize-space()='Frozen Embryo Transfer']")
	public WebElement frozenEmbryoTrasferService;
	@FindBy(xpath = "//li[normalize-space()='Nuclear Medicine']")
	public WebElement baseNuclearMedicine;
	@FindBy(xpath = "//li[normalize-space()='131 Iodine MIBG Administration charge']")
	public WebElement iodineService;
	@FindBy(xpath = "//li[normalize-space()='Isotope -Thyroid Scan']")
	public WebElement isotopeService;
	@FindBy(xpath = "//li[normalize-space()='ADT']")
	public WebElement serviceTypeADT;
	@FindBy(xpath = "//li[@class='uparrow-yellow']")
	public WebElement baseTypeADT;
	@FindBy(xpath = "//li[normalize-space()='KAMEDA roomrent']")
	public WebElement KamedaService;
	@FindBy(xpath = "//li[normalize-space()='Deluxe AC']")
	public WebElement deluxAcService;
	@FindBy(xpath = "//li[normalize-space()='Room rent for Ultra-deluxe']")
	public WebElement ultraDeluxService;
	@FindBy(xpath = "//li[normalize-space()='Nursing Service']")
	public WebElement serviceTypeNursingService;
	@FindBy(xpath = "//li[@class='uparrow-yellow']")
	public WebElement baseNursingService;
	@FindBy(xpath = "//li[normalize-space()='kameda room nursingfee']")
	public WebElement kamedaRoomFee;
	@FindBy(xpath = "//li[normalize-space()='UltraDelux Nursing Service']")
	public WebElement ultraDeluxNursingService;
	@FindBy(xpath = "//li[normalize-space()='Room rent for Ultra-deluxe']")
	public WebElement ultraDeluxADT;
	@FindBy(xpath = "//li[normalize-space()='Exclusion']")
	public WebElement exclusionCoverageStorage;
	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM-Plan']")
	public WebElement rcmPlanTab;
	@FindBy(xpath = "//div[normalize-space()='Tariff Setting']")
	public WebElement tariffSettingTab;
	@FindBy(xpath = "//input[@placeholder='Search reference name...']")
	public WebElement enterReference;// searchicon
	@FindBy(xpath = "//div[@title='Default']")
	public WebElement defaultService;// editicon
	@FindBy(xpath = "//input[@id='plan']")
	public WebElement selectplan;

	@FindBy(xpath = "//li[normalize-space()='DefaultTvm']")
	public WebElement selectDefaultTvm;
	@FindBy(xpath = "//body/app-root/app-layout/main[@class='page-body']/app-tariff-setting[@class='ng-star-inserted']/div[@class='page-container']/form[@class='ng-untouched ng-invalid ng-dirty']/div[@class='form-container']/div[@class='row']/div[@class='col-md-12']/div[@class='card']/div[@class='card-body tariff-main-body pb-0']/div[@class='row']/div[1]/accordion[1]/accordion-group[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement serviceTabTariffScreen;
	@FindBy(xpath = "//ki-select-control[@formcontrolname='servicetypeid']//input[@id='undefined']")
	public WebElement selectServiceType;
	@FindBy(xpath = "//li[normalize-space()='Package']")
	public WebElement selectPackage2;
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement enterServiceNameField;
	@FindBy(xpath = "//li[normalize-space()='Executive Health Package(EHP)']")
	public WebElement selectServiceName;
	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement selectCoverageStatus;

	@FindBy(xpath = "//li[normalize-space()='Inclusion']")
	public WebElement selectInclusion;
	@FindBy(xpath = "//div[@class='col-md-12 p0']//div[@role='button']")
	public WebElement chargeParameterTab;
	@FindBy(xpath = "//input[@id='encountersubmodeid']")
	public WebElement visitSubmodeDropdown;
	@FindBy(xpath = "//li[normalize-space()='OP']")
	public WebElement selectOP;
	@FindBy(xpath = "//input[@id='paymodeid']")
	public WebElement paymodeDropdown;
	@FindBy(xpath = "//li[normalize-space()='Cash']")
	public WebElement selectCash;

	@FindBy(xpath = "//label[@title='Add submode and paymode']//i[@class='ki ki-plus']")
	public WebElement addGrid;
	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement selectIP;
	@FindBy(xpath = "//li[normalize-space()='Credit']")
	public WebElement selectCredit;// li[normalize-space()='Cash']
	@FindBy(xpath = "//accordion-group[@class='panel']//div[@role='button']")
	public WebElement chargeTaxTab;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement BaseCharge;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ContractCharge;
	@FindBy(xpath = "//button[@id='AddButton']")
	public WebElement addButton;// savebutton
	@FindBy(xpath = "//div[normalize-space()='Package Tariff Mapping']")
	public WebElement packageTariffMapping;
	@FindBy(xpath = "//div[4]//ki-select-control[1]//div[1]//input[1]")
	public WebElement enterDefaultPlan;
	@FindBy(xpath = "//li[normalize-space()='DefaultPlan']")
	public WebElement selectDefaultTvm2;
	@FindBy(xpath = "//input[@placeholder='Package Name']")
	public WebElement enterPackageName; // searchicon
	@FindBy(xpath = "//div[@title='Executive Health Package(EHP)']")
	public WebElement clickPackage; // editicon
	@FindBy(xpath = "//div[contains(text(),'Package to Site Mapping')]")
	public WebElement packageTOsiteMappingTab;
	@FindBy(xpath = "//div[@class='searchbar-criteria two-level ng-star-inserted']//div[2]//ki-select-control[1]//div[1]//input[1]")
	public WebElement cooperateDropdown;
	@FindBy(xpath = "//div[@title='DefaultTvm']")
	public WebElement defaultTvm;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-package-to-site-mapping[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement editIconForDefaultTvm;
	@FindBy(xpath = "//input[@id='packageid']")
	public WebElement packageNameDropdown;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-package-to-site-mapping[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement allowedSiteDropdowm;
	@FindBy(xpath = "//i[@class='fa fa-square-o ng-star-inserted']")
	public WebElement selectALL;
	@FindBy(xpath = "//li[normalize-space()='Default']")
	public WebElement selectDefault;

	public void packageCreationNew(String Packagename, String Name2) throws InterruptedException, AWTException {
		//// first package
		Thread.sleep(2000);
		menuToggle.click();
		Thread.sleep(1000);
		mastersModule.click();
		Thread.sleep(1000);
		serviceTab.click();
		Thread.sleep(1000);
		serviceMasterTab.click();
		Thread.sleep(1000);
		baseCategory.sendKeys("Package");
		Thread.sleep(1000);
		selectPackage.click();
		Thread.sleep(1000);
		serviceName.sendKeys(Packagename);
		Thread.sleep(1000);
		disableEMRcheckbox.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",siteMappingTab );
	//	PageUtility.scrollToElement(siteMappingTab, driver);
		siteMappingTab.click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView();",selectCheckbox );
//		PageUtility.scrollToElement(selectCheckbox, driver);

		Thread.sleep(1000);
		selectCheckbox.click();
		Thread.sleep(1000);
		moveArrow.click();
		Thread.sleep(1000);
		saveButton.click();

		Thread.sleep(1000);
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//div[@class='modal ki-dialog fade blockoutside in show']//label[@class='dialog-title'][normalize-space()='Information']"));

		if (dynamicElement.size() != 0) {
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		}

		else {
			System.out.println("sri");
		}




	}

	public void groupCreationNew(String Group1, String Group2, String Group3, String Group4, String Group5,
			String Group6, String Group7) throws InterruptedException, AWTException {
		/// FIRST GROUP for LABORATORY SERVICES
		Thread.sleep(2000);
		menuToggle.click();
		Thread.sleep(1000);
		mastersModule.click(); // del for full run
		Thread.sleep(1000); // delfor full run
		rcmPackage.click();
		Thread.sleep(1000);
		packageGroup.click();
		Thread.sleep(1000);
		packageGroupName.sendKeys(Group1);
		Thread.sleep(1000);
		groupLimit.sendKeys("5000");
		Thread.sleep(1000);
		limitMode.click();
		Thread.sleep(1000);
		gross.click();
		Thread.sleep(1000);
		services.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeLaboratory.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseCategoryLaboratory.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Sodium (ISE Indirect)");
		Thread.sleep(1000);
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_BACK_SPACE);
		t.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		serviceName2.sendKeys(")");
		Thread.sleep(1000);
		selectSodium.click();

		// driver.findElement(By.xpath("//li[normalize-space()='Anti HBs']"));
		Thread.sleep(2500);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeLaboratory.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseCategoryLaboratory.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Potassium (ISE Indirect)");
		Thread.sleep(1000);
		selectPotassium.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeLaboratory.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseCategoryLaboratory.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Lipid Panel");
		Thread.sleep(1000);
		lipidpanel.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeLaboratory.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseCategoryLaboratory.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Absolute Basophil Count");
		Thread.sleep(1000);
		absolueBasophilCount.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		saveButtonGroup.click();
		Thread.sleep(3000);
		handleDuplicateAndClear();
//		Thread.sleep(1000);

		/*
		 * Thread.sleep(1000); List<WebElement>
		 * dynamicElement=driver.findElements(By.xpath(
		 * "//button[normalize-space()='OK']"));
		 * 
		 * if(dynamicElement.size() !=0) {
		 * driver.findElement(By.xpath("//button[normalize-space()='OK']")).click(); }
		 * 
		 * 
		 * else { System.out.println("sri"); }
		 */

		// savedSuccessfullyOK.click();

		Thread.sleep(3000);

		//// SECOND GROUP for pharamacy

		packageGroupName.sendKeys(Group2);
		Thread.sleep(1000);
		groupLimit.sendKeys("30000");
		Thread.sleep(1000);
		limitMode.click();
		Thread.sleep(1000);
		gross.click();
		Thread.sleep(2000);
		 //services.click(); //remove in full run
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypePharmacy.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseCategoryPharmacy.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("SALISIA TV LOTION 50ML");
		Thread.sleep(2000);
		// Robot t=new Robot();
		t.keyPress(KeyEvent.VK_BACK_SPACE);
		t.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		serviceName2.sendKeys("L");
		Thread.sleep(1000);
		salisiaTVlotion.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypePharmacy.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseCategoryPharmacy.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("DOLO 650MG TAB");
		Thread.sleep(1000);
		dolo.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypePharmacy.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseCategoryPharmacy.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("6-MP 50 MG TAB");
		Thread.sleep(1000);
		sixMpTablet.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypePharmacy.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseCategoryPharmacy.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("ABCIXIREL 10MG 5ML INJ");
		Thread.sleep(1000);
		abcixirelTablet.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		saveButtonGroup.click();
		Thread.sleep(1000);
		handleDuplicateAndClear();
		Thread.sleep(1000);
		// savedSuccessfullyOK.click();
		Thread.sleep(1000);

		//// third GROUP for radiology

		packageGroupName.sendKeys(Group3);
		Thread.sleep(1000);
		groupLimit.sendKeys("5000");
		Thread.sleep(1000);
		limitMode.click();
		Thread.sleep(1000);
		gross.click();
		Thread.sleep(2000);
		// services.click(); //remove in full run
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeRadiology.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseTypeRadiology.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("%%%");
		Thread.sleep(1000);
		// Robot t=new Robot();
		t.keyPress(KeyEvent.VK_BACK_SPACE);
		t.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		serviceName2.sendKeys("%");
		Thread.sleep(1000);
		anyRadiologyService.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeRadiology.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseTypeRadiology.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("CT Abdomen + Pelvis Plain");
		Thread.sleep(1000);
		abdomenRadiology.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeRadiology.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseTypeRadiology.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("CT Knee Joint");
		Thread.sleep(1000);
		ctKneeRadiology.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);

		saveButtonGroup.click();
		Thread.sleep(1000);
		handleDuplicateAndClear();
		Thread.sleep(1000);
//		savedSuccessfullyOK.click();
//		Thread.sleep(1000);
		//// fourth GROUP for PROCEDURE

		packageGroupName.sendKeys(Group4);
		Thread.sleep(1000);
		groupLimit.sendKeys("5000");
		Thread.sleep(1000);
		limitMode.click();
		Thread.sleep(1000);
		gross.click();
		Thread.sleep(2000);
		// services.click(); //remove in full run
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeProcedure.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseTypeProcedure.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Bone Marrow");
		Thread.sleep(2000);
		// Robot t=new Robot();
		t.keyPress(KeyEvent.VK_BACK_SPACE);
		t.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		serviceName2.sendKeys("w");
		Thread.sleep(1000);
		boneMarrow.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeProcedure.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseTypeProcedure.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("ABDOMINAL TAPPING");
		Thread.sleep(1000);
		abdominalTapping.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeProcedure.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseTypeProcedure.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Balloon Bronchoplasty");
		Thread.sleep(1000);
		balloonBronchoplasty.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);

		saveButtonGroup.click();
		Thread.sleep(1000);
		handleDuplicateAndClear();
		Thread.sleep(1000);
//		savedSuccessfullyOK.click();
//		Thread.sleep(1000);
		//// fifth GROUP for OTHER SERVICES

		packageGroupName.sendKeys(Group5);
		Thread.sleep(1000);
		groupLimit.sendKeys("5000");
		Thread.sleep(1000);
		limitMode.click();
		Thread.sleep(1000);
		gross.click();
		Thread.sleep(2000);
		// services.click(); //remove in full run
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeOtherServices.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseTypeAyurvedha.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("AYR4 Head & Neck Massage");
		Thread.sleep(2000);
		// Robot t=new Robot();
		t.keyPress(KeyEvent.VK_BACK_SPACE);
		t.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		serviceName2.sendKeys("e");
		Thread.sleep(1000);
		ayr4Service.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeOtherServices.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseTypeAyurvedha.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("G13 Henna");
		Thread.sleep(1000);
		g13Service.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeOtherServices.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		cardiologyService.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("ECHO Cardiogram");
		Thread.sleep(1000);
		echoCardiogramService.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeOtherServices.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		cardiologyService.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Ambulatory BP Monitoring ( ABPM)");
		Thread.sleep(1000);
		ambulatoryBPservice.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeOtherServices.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		IVFbaseService.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Embryo Freezing (6 Months)");
		Thread.sleep(1000);
		embryofreezingService.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeOtherServices.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		IVFbaseService.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Frozen Embryo Transfer");
		Thread.sleep(1000);
		frozenEmbryoTrasferService.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeOtherServices.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseNuclearMedicine.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("131 Iodine MIBG Administration charge");
		Thread.sleep(1000);
		iodineService.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeOtherServices.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseNuclearMedicine.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Isotope -Thyroid Scan");
		Thread.sleep(1000);
		isotopeService.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);

		saveButtonGroup.click();
		Thread.sleep(1000);
		handleDuplicateAndClear();
		Thread.sleep(1000);
//		savedSuccessfullyOK.click();
//		Thread.sleep(1000);

		//// sixth GROUP for ADT

		packageGroupName.sendKeys(Group6);
		Thread.sleep(1000);
		groupLimit.sendKeys("5000");
		Thread.sleep(1000);
		limitMode.click();
		Thread.sleep(1000);
		gross.click();
		Thread.sleep(2000);
		// services.click(); //remove in full run
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeADT.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseTypeADT.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Deluxe Non AC");
		Thread.sleep(2000);
		// Robot t=new Robot();
		t.keyPress(KeyEvent.VK_BACK_SPACE);
		t.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		serviceName2.sendKeys("C");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[normalize-space()='Deluxe Non AC']")).click();
		//KamedaService.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeADT.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseTypeADT.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Deluxe AC");
		Thread.sleep(1000);
		deluxAcService.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeADT.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseTypeADT.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Rent for Ultra-Deluxe");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Rent for Ultra-Deluxe']")).click();
		
		//ultraDeluxADT.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);

		saveButtonGroup.click();
		Thread.sleep(1000);
		handleDuplicateAndClear();
		Thread.sleep(1000);
//		savedSuccessfullyOK.click();
//		Thread.sleep(1000);
		//// seventh GROUP for nursing service

		packageGroupName.sendKeys(Group7);
		Thread.sleep(1000);
		groupLimit.sendKeys("5000");
		Thread.sleep(1000);
		limitMode.click();
		Thread.sleep(1000);
		gross.click();
		Thread.sleep(2000);
		// services.click(); //remove in full run
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		serviceTypeNursingService.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseNursingService.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Nursing fee for Ultra-Deluxe");
		Thread.sleep(2000);
		// Robot t=new Robot();
		t.keyPress(KeyEvent.VK_BACK_SPACE);
		t.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		serviceName2.sendKeys("e");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Nursing fee for Ultra-Deluxe']")).click();
		
		//kamedaRoomFee.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		serviceType.click(); 
		Thread.sleep(1000);
		serviceTypeNursingService.click();
		Thread.sleep(1000);
		baseCategory2.click();
		Thread.sleep(1000);
		baseNursingService.click();
		Thread.sleep(1000);
		serviceName2.sendKeys("Nursing Service- Deluxe AC");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Nursing Service- Deluxe AC']")).click();
		
		//ultraDeluxNursingService.click();
		Thread.sleep(1000);
		addToGrid.click();

		saveButtonGroup.click();
		Thread.sleep(1000);
		handleDuplicateAndClear();
		Thread.sleep(1000);
//		savedSuccessfullyOK.click();
//		Thread.sleep(1000);

	}

	public void handleDuplicateAndClear() {
		try {
			// Wait a short time to see if the OK button appears
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			WebElement okButton = wait
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[normalize-space()='OK']")));

			// If OK button is found, click it
			okButton.click();
			System.out.println("Duplicate detected. Clicked the OK button.");

			// Then click the Clear button
			WebElement clearButton = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Clear']")));
			clearButton.click();
			System.out.println("Clicked the Clear button after OK.");

		} catch (TimeoutException e) {
			// OK button didn't appear — no duplication case
			System.out.println("No duplication popup. Continuing normally.");
		} catch (Exception e) {
			// Any unexpected issue (optional)
			System.out.println("Unexpected issue while handling OK/Clear: " + e.getMessage());
		}
	}

	public void packageDefination(String Packagename, String Group1, String Group2, String Group3, String Group4,
			String Group5, String Group6, String Group7) throws InterruptedException {

		menuToggle.click();
		Thread.sleep(1000);
		mastersModule.click(); // del
		Thread.sleep(1000); // del
		rcmPackage.click();
		Thread.sleep(1000);
		packageDefinition.click();
		Thread.sleep(2000);
		PackageName.sendKeys(Packagename);
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//li[normalize-space()='"+Packagename+"']")).click();
		Thread.sleep(1000);
	
		Thread.sleep(2000);
		packageType.click();
		Thread.sleep(1000);
		multipleday.click();
		Thread.sleep(1000);
		packageDuration.sendKeys("10");
		Thread.sleep(1000);
		packageLimit.sendKeys("60000");
		Thread.sleep(1000);
		defaultCovergaeStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Exclusion']")).click();
		Thread.sleep(1000);
	
		Thread.sleep(1000);
		
		
	//	WaitUtility.waitForElementToBeClickable(driver, submode, 30);
		submode.click();
		Thread.sleep(1000);
		selectAllSubmode.click();
		Thread.sleep(1000);
		limitMode.click();
		Thread.sleep(1000);
		grossMode.click();
		Thread.sleep(1000);
		// groupTab.click();
		// Thread.sleep(1000);
		groupname.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//li[normalize-space()='" + Group1 + "']")).click();
		Thread.sleep(1000);
		coverage.click();
		Thread.sleep(1000);
		inclusionCoverage.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(2000);
		groupname.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//li[normalize-space()='" + Group2 + "']")).click();
		Thread.sleep(1000);
		coverage.click();
		Thread.sleep(1000);
		inclusionCoverageStorage.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		groupname.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//li[normalize-space()='" + Group3 + "']")).click();
		Thread.sleep(1000);
		coverage.click();
		Thread.sleep(1000);
		inclusionCoverageStorage.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		groupname.click();
		Thread.sleep(1000);


		driver.findElement(By.xpath("//li[normalize-space()='" + Group4 + "']")).click();
		Thread.sleep(1000);
		coverage.click();
		Thread.sleep(1000);
		inclusionCoverageStorage.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		groupname.click();
		Thread.sleep(1000);


		driver.findElement(By.xpath("//li[normalize-space()='" + Group5 + "']")).click();
		Thread.sleep(1000);
		coverage.click();
		Thread.sleep(1000);
		exclusionCoverageStorage.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		groupname.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//li[normalize-space()='" + Group6 + "']")).click();
		Thread.sleep(1000);
		coverage.click();
		Thread.sleep(1000);
		inclusionCoverageStorage.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		groupname.click();
		Thread.sleep(1000);



		driver.findElement(By.xpath("//li[normalize-space()='" + Group7 + "']")).click();

		Thread.sleep(1000);
		coverage.click();
		Thread.sleep(1000);
		inclusionCoverageStorage.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		updateButton.click();
		Thread.sleep(1000);
		savedSuccessfullyOK.click();
		Thread.sleep(2000);

	}

	public void tariffSetting(String Packagename) throws InterruptedException, AWTException {

		menuToggle.click();
		Thread.sleep(1000);
		//mastersModule.click();// del for fullrun
		Thread.sleep(1000); 
		rcmPlanTab.click();
		Thread.sleep(1000);
		tariffSettingTab.click();
		Thread.sleep(1000);
		enterReference.sendKeys("Default");
		Thread.sleep(1000);
		searchIcon.click();
		Thread.sleep(1000);
		defaultService.click();
		Thread.sleep(1000);
		editIcon.click();
		Thread.sleep(1000);
//		selectplan.click();
//		Thread.sleep(1000);
//
//		selectDefaultTvm.click();
		Thread.sleep(1000);
		serviceTabTariffScreen.click();
		Thread.sleep(1000);
		selectServiceType.click();
		Thread.sleep(1000);
		selectPackage.click();
		Thread.sleep(1000);
		enterServiceNameField.sendKeys("exe");
		Thread.sleep(2000); 
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_BACK_SPACE);
		t.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		Thread.sleep(2000); 
		t.keyPress(KeyEvent.VK_BACK_SPACE);
		t.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		
		//enterServiceNameField.sendKeys(Packagename);
		
		System.out.println(Packagename);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Packagename+"']")).click();
		Thread.sleep(1000);
		selectCoverageStatus.click();
		Thread.sleep(1000);
		selectInclusion.click();
		Thread.sleep(1000);
		chargeParameterTab.click();
		Thread.sleep(1000);
		visitSubmodeDropdown.click();
		Thread.sleep(1000);
		selectOP.click();
		Thread.sleep(1000);
		paymodeDropdown.click();
		Thread.sleep(1000);
		selectCash.click();
		Thread.sleep(1000);
		addGrid.click();
		Thread.sleep(1000);
		visitSubmodeDropdown.click();
		Thread.sleep(1000);
		selectIP.click();
		Thread.sleep(1000);
		paymodeDropdown.click();
		Thread.sleep(1000);
		selectCash.click();
		Thread.sleep(1000);
		addGrid.click();
		Thread.sleep(1000);
		visitSubmodeDropdown.click();
		Thread.sleep(1000);
		selectIP.click();
		Thread.sleep(1000);
		paymodeDropdown.click();
		Thread.sleep(1000);
		selectCredit.click();
		Thread.sleep(1000);
		addGrid.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",chargeTaxTab );
		chargeTaxTab.click();
		Thread.sleep(2500);
		BaseCharge.sendKeys("60000");
		Thread.sleep(2000);
		ContractCharge.sendKeys("60000");
		Thread.sleep(1000);
		addButton.click();
		Thread.sleep(1000);
		
		Thread.sleep(700);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade blockoutside in show']//label[@class='dialog-title'][normalize-space()='Block']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			
		}
		
		else {
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//button[@id='Savebutton']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(savedSuccessfullyOK));
		Thread.sleep(2000);
		savedSuccessfullyOK.click();
		Thread.sleep(2000);
		
		}

	}

	public void packageTariffMapping(String Packagename) throws InterruptedException {

		menuToggle.click();
		Thread.sleep(1000);
		mastersModule.click(); //del for full run
		Thread.sleep(1000); 
		rcmPackage.click();
		Thread.sleep(1000);
		packageTariffMapping.click();
		Thread.sleep(1000);
		enterDefaultPlan.click();
		Thread.sleep(1000);
		enterDefaultPlan.sendKeys("DefaultPlan");
		Thread.sleep(1000);
		selectDefaultTvm2.click();
		Thread.sleep(1000);
		enterPackageName.sendKeys(Packagename);
		Thread.sleep(1000);
		searchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='"+Packagename+"']")).click();
		Thread.sleep(1000);		
		//clickPackage.click();
		Thread.sleep(1000);
		editIcon.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Savebutton']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='ki ki-upload']")));
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-package-tariff[1]/div[2]/form[1]/div[2]/form[1]/div[1]/div[3]/button[1]")).click();
		
		Thread.sleep(1000);
		savedSuccessfullyOK.click();
		Thread.sleep(5000);

	}

	public void packageToSiteMapping(String Packagename) throws InterruptedException {

		menuToggle.click();
		Thread.sleep(4000);
		// mastersModule.click(); // del for full run
		//Thread.sleep(1000); // del for full run
		// rcmPackage.click();//
		 Thread.sleep(1000);
		packageTOsiteMappingTab.click();
		Thread.sleep(2000);
		cooperateDropdown.click();
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(selectDefault));
		Thread.sleep(3000);		
//		WaitUtility.waitForElementToBeClickable(driver, selectDefault, 30);
		selectDefault.click();
		Thread.sleep(1000);
		//defaultTvm.click();
		driver.findElement(By.xpath("//div[@title='DefaultPlan']"));
		
		Thread.sleep(1000);
	
		wait.until(ExpectedConditions.elementToBeClickable(editIconForDefaultTvm));
		Thread.sleep(3000);		

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",editIconForDefaultTvm );
		Thread.sleep(1000);
		
//		PageUtility.clickJavaScripExcecutor(editIconForDefaultTvm, driver);
		editIconForDefaultTvm.click();
		Thread.sleep(1000);
		packageNameDropdown.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + Packagename + "']"));
		Thread.sleep(1000);
		allowedSiteDropdowm.click();
		Thread.sleep(1000);
		selectAll.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		updateButton.click();
		Thread.sleep(1000);
		savedSuccessfullyOK.click();
		Thread.sleep(5000);
	}
}
