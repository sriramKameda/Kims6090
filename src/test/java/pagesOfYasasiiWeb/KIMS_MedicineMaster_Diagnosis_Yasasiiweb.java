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
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_MedicineMaster_Diagnosis_Yasasiiweb extends PageFactoryInitYasasiiWeb{
	public KIMS_MedicineMaster_Diagnosis_Yasasiiweb(WebDriver driver) {
		super(driver);

	}



	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement MastersModule;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Pharmacy']")
	public WebElement Pharmacy;

	@FindBy(xpath = "//div[normalize-space()='Generic Master']")
	public WebElement GenericMaster;

	@FindBy(xpath = "//input[@id='genericname']")
	public WebElement GenericName;

	@FindBy(xpath = "//label[normalize-space()='Antibiotic']//span[@class='checkmark']")
	public WebElement Antibiotic;

	@FindBy(xpath = "//label[normalize-space()='Psychotropic']//span[@class='checkmark']")
	public WebElement Phychotropic;

	@FindBy(xpath = "//input[@id='genericcode']")
	public WebElement GenericCode;

	@FindBy(xpath = "//input[@id='drugclassadd']")
	public WebElement DrugClass;

	@FindBy(xpath = "//button[@id='updateGenMaster']")
	public WebElement GenericSave;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement Search;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;

	@FindBy(xpath = "//label[normalize-space()='High Risk']//span[@class='checkmark']")
	public WebElement HighRisk;

	@FindBy(xpath = "//button[@id='updateGenMaster']")
	public WebElement UpdateGneric;

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement Delete;

	@FindBy(xpath = "//div[normalize-space()='Medicine Master']")
	public WebElement MedicineMaster;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='servicecategory']")
	public WebElement SubCategory;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='materialtypeid']")
	public WebElement ItemType;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement ItemName;

	@FindBy(xpath = "//div[@class='col-md-4 col-sm-6']//input[@id='quantity']")
	public WebElement TotalQuantity;

	@FindBy(xpath = "//input[@id='perdosequantity']")
	public WebElement PerDose;

	@FindBy(xpath = "//div[@class='col-md-4']//input[@id='quantityunitid']")
	public WebElement unit;

	@FindBy(xpath = "//input[@id='buomid']")
	public WebElement BOUM;

	@FindBy(xpath = "//input[@id='dose']")
	public WebElement Dose;

	@FindBy(xpath = "//input[@id='doseunitid']")
	public WebElement Doseunit;

	@FindBy(xpath = "//input[@id='formaddid']")
	public WebElement Form;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save;

	@FindBy(xpath = "//input[@id='routeaddid']")
	public WebElement Route;

	@FindBy(xpath = "//input[@formcontrolname='remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//i[@class='ki ki-upload']")
	public WebElement Upload;

	@FindBy(xpath = "//div[@class='btn-module-back']")
	public WebElement Module;

	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EMR;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement disgnosis;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEpharm;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement MedicineSearch;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//div[contains(text(),'Formulary Master')]")
	public WebElement FormularyMaster;

	@FindBy(xpath = "//input[@id='subcategoryid']")
	public WebElement Subcategory;

	@FindBy(xpath = "//label[@title=' ']//span[@class='checkmark']")
	public WebElement Checkbox;

	@FindBy(xpath = "//i[contains(@class,'ki ki-info-circle-fill fill-color')]")
	public WebElement MedicineInformation;

	@FindBy(xpath = "//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")
	public WebElement Close;

	@FindBy(xpath = "//tr[contains(@class,'ng-star-inserted')]//i[contains(@class,'ki ki-file')]")
	public WebElement ViewSite;

	@FindBy(xpath = "//i[@class='ki ki-info-circle-fill']")
	public WebElement MedicineInformation2;

	@FindBy(xpath = "//div[contains(@class,'presc-actions m0')]//i[contains(@title,'Medicine Information')]")
	public WebElement MedicineInformation1;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-duplicate-medicine-confirmation[1]/div[2]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement OverRidereason;

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement OrderingReason;	

	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement justification;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[11]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement diagnosischevckbox;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement medicineAdd;	

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EmrSave;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Plan']")
	public WebElement Plan;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement PlanText;

	@FindBy(xpath = "//button[@class='icon cpoeadmin']")
	public WebElement CpoeAdministration;

	@FindBy(xpath = "//label[normalize-space()='Medicine Administration']")
	public WebElement MedicineAdministration;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeServiceSearch;

	@FindBy(xpath = "//label[normalize-space()='LASA']//span[contains(@class,'checkmark')]")
	public WebElement LASA;

	@FindBy(xpath = "//input[@id='codetype']")
	public WebElement COdetype;

	@FindBy(xpath = "//input[@id='tempcode']")
	public WebElement COde;

	@FindBy(xpath = "//input[@id='fav']")
	public WebElement DiagnosisSearch;


	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement AccessibilityNoteReason ;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement AccessibilityNoteRemarks ;






	public void MastersPharmacy(String Genericname,String Itemname,String Code,String ERPcode) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(1000);
		MastersModule.click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1000);
		Pharmacy.click();
		Thread.sleep(1000);
		GenericMaster.click();
		Thread.sleep(1000);
		GenericName.click();
		Thread.sleep(1000);
		GenericName.sendKeys(Genericname);
		Thread.sleep(1000);
		Antibiotic.click();
		Thread.sleep(1000);
		Phychotropic.click();
		Thread.sleep(1000);
		GenericCode.click();
		Thread.sleep(1000);
		GenericCode.sendKeys(Code);
		Thread.sleep(1000);
		DrugClass.click();
		Thread.sleep(1000);
		DrugClass.sendKeys("Antiviral Boosters");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Antiviral Boosters']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-md-3 col-4 ta-r rtl-right pl0']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='ng-star-inserted']//span[@class='checkmark']")).click();
		Thread.sleep(1000);

		GenericSave.click();
		Thread.sleep(2000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


		Search.sendKeys(Genericname , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='"+Genericname+"']")).click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		HighRisk.click();
		Thread.sleep(1000);
		UpdateGneric.click();
		Thread.sleep(2000);



		////////Medicinr Master	


		Hamburger.click();
		Thread.sleep(1000);
		MedicineMaster.click();
		Thread.sleep(1000);
		SubCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Capsule/Tablets']")).click();
		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);
		ItemName.sendKeys(Itemname);
		Thread.sleep(1000);
		ItemType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(1000);
		GenericName.click();
		Thread.sleep(1000);
		GenericName.sendKeys(Genericname , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		TotalQuantity.click();
		Thread.sleep(1000);
		TotalQuantity.sendKeys("1");
		Thread.sleep(1000);
		PerDose.click();
		Thread.sleep(1000);
		PerDose.sendKeys("1");
		Thread.sleep(1000);
		unit.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cap(s)']")).click();
		Thread.sleep(1000);
		BOUM.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cap(s)']")).click();
		Thread.sleep(1000);

		COdetype.click();
		driver.findElement(By.xpath("//li[normalize-space()='ERP Code']")).click();
		Thread.sleep(1000);
		COde.sendKeys(ERPcode);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='code-table-wrapper']//i[@class='ki ki-plus']")).click();
		Thread.sleep(700);



		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Dose);
		Dose.click();
		Thread.sleep(1000);
		Dose.sendKeys("500");
		Thread.sleep(1000);
		Doseunit.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Mg']")).click();
		Thread.sleep(1000);
		Route.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Oral']")).click();
		Thread.sleep(1000);
		Form.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Capsule']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-md-2 col-3 ta-r rtl-right']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='check-container']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		LASA.click();
		Thread.sleep(1000);	
		Save.click();
		Thread.sleep(2000);
		//	Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


		///medicine edit

		Search.click();
		Thread.sleep(1000);
		Search.sendKeys(Itemname ,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[1]/lib-searchbarlist[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Remarks);
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Before Food");
		Thread.sleep(1000);
		Upload.click();
		Thread.sleep(2000);


		///Formulatory master


		Hamburger.click();
		Thread.sleep(1000);
		FormularyMaster.click();
		Thread.sleep(600);
		Subcategory.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Capsule/Tablets']")).click();
		Thread.sleep(600);
		EnterPatientName.sendKeys(Itemname , Keys.ENTER);
		Thread.sleep(600);
		Checkbox.click();
		Thread.sleep(600);
		MedicineInformation.click();
		Thread.sleep(1000);
		Close.click();
		Thread.sleep(600);
		ViewSite.click();
		Thread.sleep(600);

		//
		//		WebElement SiteCheck = driver.findElement(By.xpath("//table[@class='table table-fixed fromulary-list switch-rtl ng-star-inserted']//thead//th//span[@class='checkmark']"));
		//	
		//		boolean selected = SiteCheck.isSelected();
		//		
		//		System.out.println(selected + "= Boolean");
		//	
		//		if(selected==true) {
		//			
		//			System.out.println("SiteChecked");
		//		}
		//		else {
		//			
		//			SiteCheck.click();
		//			Thread.sleep(1000);
		//			
		//		}


		driver.findElement(By.xpath("//table[@class='table table-fixed fromulary-list switch-rtl ng-star-inserted']//thead//th//span[@class='checkmark']")).click();
		Thread.sleep(600);

		Save.click();
		Thread.sleep(600);
		Close.click();
		Thread.sleep(600);


		/*		

			////Delete

			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-medicine-general[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(1000);
			Delete.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(2000);

	        /////// generic Delete

            Hamburger.click();
        	Thread.sleep(1000);
			GenericMaster.click();
			Thread.sleep(1000);
			//-------------
			Search.click();
			Thread.sleep(1000);
			Search.sendKeys(Genericname ,Keys.ENTER);
			Thread.sleep(1000);

			driver.findElement(By.xpath("//div[@title='"+Genericname+"']")).click();
			Thread.sleep(1000);
			Delete.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(2000);
			//-------------

		 */
	}

	public void EMRDiagnosis(String MRNo , String Itemname) throws InterruptedException, AWTException {

		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(1000);
	//	Module.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();


		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='maincategory']")).click();
			Thread.sleep(1200);
			driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
			Thread.sleep(1200);
			driver.findElement(By.xpath("//input[@id='subcategory']")).click();
			Thread.sleep(1200);
			driver.findElement(By.xpath("//li[normalize-space()='All IP']")).click();
			Thread.sleep(1200);

			EnterPatientName.sendKeys(MRNo);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
			Thread.sleep(1000);

//			AccessibilityNoteReason.click();
//			driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
//			Thread.sleep(1200);
//			AccessibilityNoteRemarks.sendKeys("Need Approve");
//			Thread.sleep(1000);
//			Save.click();
//			Thread.sleep(1000);






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
			
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='icon refresh']")));
		    Thread.sleep(2000);
			
			

			disgnosis.click();
			Thread.sleep(1000);
			//		DiagnosisSearch.sendKeys("(Idiopathic) normal pressure hydrocephalus");
			//		Thread.sleep(1000);
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")));
			//		Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
			Thread.sleep(2000);

			Robot t=new Robot();
			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(400);
			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);


			///cpoe service

			CpoeService.click();
			Thread.sleep(1000);
			CpoeServiceSearch.click(); 
			Thread.sleep(1000);
			CpoeServiceSearch.sendKeys("Urine R/E (Semiquantitive)", Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[normalize-space()='Urine R/E (Semiquantitive)']")).click();
			Thread.sleep(1000);
			//	driver.findElement(By.xpath("//div[contains(@class,'dailog-btn')]//button[contains(@type,'button')][normalize-space()='OK']")).click();
			Thread.sleep(2000);




			/////////Cpoe Pharmacy

			CPOEpharm.click();
			Thread.sleep(1000);
			MedicineSearch.clear();
			Thread.sleep(1000);
			MedicineSearch.sendKeys(Itemname , Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
			Thread.sleep(1000);
			//			prescriptionType.click();
			Thread.sleep(1000);
			//			driver.findElement(By.xpath("//li[normalize-space()='Discharge']")).click();
			OrderingReason.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
			Thread.sleep(1000);
			justification.click();
			Thread.sleep(1000);
			justification.sendKeys("ok");
			Thread.sleep(1000); 
			Frequency.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
			Thread.sleep(1000);
			MedicineInformation1.click();
			Thread.sleep(2000);
			Close.click();
			Thread.sleep(1000);

			//		JavascriptExecutor js= (JavascriptExecutor) driver;
			//		js.executeScript("arguments[0].scrollIntoView();",diagnosischevckbox);
			//		Thread.sleep(1000);
			//		diagnosischevckbox.click();
			//		Thread.sleep(1000);
			medicineAdd.click();
			Thread.sleep(1000);

			EmrSave.click();
			Thread.sleep(2000);

			//   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='icon cpoeadmin']")));
			Thread.sleep(2000);

			CpoeAdministration.click();
			Thread.sleep(1000);
			MedicineAdministration.click();
			Thread.sleep(1000);
			MedicineInformation2.click(); 
			Thread.sleep(2000);
			Close.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='icon refresh']")).click();
			Thread.sleep(3000);






		}




	}
