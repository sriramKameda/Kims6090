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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_PanelService_ExternalLab_Yasasiiweb extends  PageFactoryInitYasasiiWeb {
	public KIMS_PanelService_ExternalLab_Yasasiiweb(WebDriver driver) {
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
	
	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	


	////Encounter

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

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

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement cpoePharmacy;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement medicineSearch;

	@FindBy(xpath = "//div[normalize-space()='CPOE Service']")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeServiceSearch;

	@FindBy(xpath = "//input[@id='cpoeSearchDb']")
	public WebElement CpoeServiceSearch1;

	@FindBy(xpath = "//div[@class='btn-pharmacy-search def-search']//i[@class='ki ki-favourite-fill']")
	public WebElement uncheckStar;

	@FindBy(xpath = "//input[@placeholder='Search Medicines']")
	public WebElement medicineSelect;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='duration']")
	public WebElement duration;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement AddMedicine;

	@FindBy(xpath = "//button[contains(@class,'icon emrsave')]")
	public WebElement EMRsave;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Diagnosis and Plan']")
	public WebElement Diagnosis;

	@FindBy(xpath = "//label[contains(text(),'G91.2')]//span[@class='checkmark']")
	public WebElement Diagnosischeckbox;

	@FindBy(xpath = "//label[normalize-space()='No Current Medication']//span[@class='checkmark']")
	public WebElement NoCurrentmed;

	@FindBy(xpath = "//label[@class='check-container no-label']//span[@class='checkmark']")
	public WebElement NoCurrentmedCheck;

	@FindBy(xpath = "//i[@class='ki ki-admission-reconciliation']")
	public WebElement AdmsnReconcile;

	@FindBy(xpath = "//i[@class='ki ki-reconciliation']")
	public WebElement Reconsile;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-duplicate-medicine-confirmation[1]/div[2]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement overrideReason;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;


	@FindBy(xpath="//i[@class='ki ki-beaker']")
	public WebElement Investigation;

	@FindBy(xpath="//input[@id='executionlocid']")
	public WebElement Executionloc;

	@FindBy(xpath="//button[@class='btn btn-primary active sm m0']")
	public WebElement ExecutionlocOK;

	@FindBy(xpath="//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement confirmOK;

	@FindBy(xpath="//input[@id='mrno']")
	public WebElement SearchField;

	@FindBy(xpath="//tbody/tr[1]/td[1]/div[1]/label[2]/span[1]")
	public WebElement caudatecheckbox;

	@FindBy(xpath="//i[@class='ki ki-save']")
	public WebElement ivstgnSave;

	@FindBy(xpath="//button[normalize-space()='Ok']//i[@class='ki ki-check']")
	public WebElement SaveOK1;

	@FindBy(xpath="//input[@id='status']")
	public WebElement ivstgnStatus;

	@FindBy(xpath="//button[@id='ondespatchid']")
	public WebElement despatch;

	@FindBy(xpath="//div[normalize-space()='Sample Processing']")
	public WebElement SampleProcessing;

	@FindBy(xpath="//div[normalize-space()='External Sample Processing']")
	public WebElement ExternalSampleProcessing;

	@FindBy(xpath="//ki-select-control[@formcontrolname='despatchFrom']//input[@id='undefined']")
	public WebElement DespatchFrom;

	@FindBy(xpath="//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group min-clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement DespatchTo;

	@FindBy(xpath="//div[@class='col-6 col-md-2 col-lg-2 pr0 pl0 ta-r mbl-pt15 despatch-to-radio-group-btns']//label[@class='radio-container'][normalize-space()='External Lab']")
	public WebElement GroupLab;

	@FindBy(xpath="//input[@id='relatedmrno']")
	public WebElement ExternalMRNo;

	@FindBy(xpath="//button[@type='button']//i[@class='ki ki-search']")
	public WebElement Search;

	@FindBy(xpath="//div[@class='col-4 col-md-4 col-lg-4 ta-r text-left top-space']//label[@class='radio-container'][normalize-space()='External Lab']")
	public WebElement externalLAB;

	@FindBy(xpath="//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group ki-dropdown']//input[@id='undefined']")
	public WebElement ChangeDespatch;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ext-sampleprocessing[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement PreparedBy;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ext-sampleprocessing[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[3]/ki-calender-time[1]/div[1]/input[1]")
	public WebElement PreparedTYm;

	@FindBy(xpath="//div[@class='form-group min-clear-bottom ng-star-inserted']//textarea[@id='undefined']")
	public WebElement PreparationRemarks;

	@FindBy(xpath="//i[@class='ki ki-save']")
	public WebElement Save;

	@FindBy(xpath = "//label[normalize-space()='Despatch Details']//span[@class='checkmark']")
	public WebElement DespatchDetails;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ext-sampleprocessing[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/ki-calender-time[1]/div[1]/input[1]")
	public WebElement Pickuptime;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ext-sampleprocessing[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement CarrierDetails;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ext-sampleprocessing[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/div[1]/div[3]/ki-calender-time[1]/div[1]/input[1]")
	public WebElement EDOR;

	@FindBy(xpath="//div[@class='form-group ng-star-inserted']//textarea[@id='undefined']")
	public WebElement Despatchemarks;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ext-sampleprocessing[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Temprature;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ext-sampleprocessing[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[2]/div[3]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement DespatchBy;

	@FindBy(xpath="//label[normalize-space()='Select All']//span[@class='checkmark']")
	public WebElement Selectall;

	@FindBy(xpath="//button[normalize-space()='Signature']")
	public WebElement Signature;

	@FindBy(xpath="//div[contains(text(),'Result Authorization')]")
	public WebElement ResultAuthorization;

	@FindBy(xpath="//input[@id='srchauthorisation1']")
	public WebElement Authorization;

	@FindBy(xpath="//button[@id='preview-load']")
	public WebElement Preview;

	@FindBy(xpath="//i[@title='Home Page']")
	public WebElement Homeicon;

	@FindBy(xpath="//i[@title='Document View']")
	public WebElement DocumentView;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement orderCheckbox;

	@FindBy(xpath="//i[@title='Receive']")
	public WebElement Recieve;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/label[5]/i[1]")
	public WebElement Accept;

	@FindBy(xpath="//a[@title='Work Order (To view/print services)']")
	public WebElement Workorder;

	@FindBy(xpath="//button[normalize-space()='Print']")
	public WebElement Print;

	@FindBy(xpath="//div[normalize-space()='External Work Order']")
	public WebElement ExternalWorkOrder;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;







	public void patReg(String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE ) throws InterruptedException, IOException, AWTException {

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
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
	//	driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
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
		 driver.findElement(By.xpath("//input[@id='guarantorphonehome']")).sendKeys("9845123658");
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
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		SAvesuccess.click(); 

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(1000);


		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(43);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(1000);



	}

	public void ADT() throws InterruptedException{


	/////Admit the patient

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
		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
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


	public void doctoreNote(String docid,String docpassword,String MRNO,String SERVICE ) throws InterruptedException {


		Thread.sleep(3000);
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

		JavascriptExecutor js= (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
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
		Thread.sleep(2000);
		Thread.sleep(500);
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


		///Diagnosis	

		Diagnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);



		////cpoe pharmacy

		cpoePharmacy.click();
		Thread.sleep(1000);
		uncheckStar.click();
		Thread.sleep(2000);
		medicineSearch.click();
		Thread.sleep(1000);
		medicineSearch.sendKeys("Crocin 650Mg Tab", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);
		duration.clear();
		Thread.sleep(1000);
		duration.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='durationunitid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END); 
		Thread.sleep(1000);
		Diagnosischeckbox.click();
		Thread.sleep(1000);



		NoCurrentmed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		Thread.sleep(1000);
		NoCurrentmedCheck.click();
		Thread.sleep(1000);
		//DischargeReconcile.click();
		Thread.sleep(1000);
//		AdmsnReconcile.click();
//		Thread.sleep(1000);
//		Reconsile.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		Thread.sleep(1000);  
		AddMedicine.click();
		Thread.sleep(1000);


		Thread.sleep(2000);
		medicineSearch.clear();
		Thread.sleep(1000);
		medicineSearch.sendKeys("Dolopar 650 Tab", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);
		duration.clear();
		Thread.sleep(1000);
		duration.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='durationunitid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END); 
		Thread.sleep(1000);
		Diagnosischeckbox.click();
		Thread.sleep(1000);
		AddMedicine.click();
		Thread.sleep(1000);
		overrideReason.click();
		Thread.sleep(1000);
		overrideReason.sendKeys("ok");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click(); 
		Thread.sleep(1500);


		///CPOE service

		CpoeService.click();
		Thread.sleep(1000);
		CpoeServiceSearch.click();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys(SERVICE , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='"+SERVICE+"']")).click();
		Thread.sleep(2000);
		//		CpoeServiceSearch1.clear();
		//		Thread.sleep(1000);
		//		CpoeServiceSearch1.sendKeys("Basophils");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//label[normalize-space()='Basophils']")).click();
		//		Thread.sleep(2000);

		EMRsave.click();
		Thread.sleep(3000);

	}


	public void investigtion( String User , String Password , String MRNO) throws InterruptedException, AWTException {


		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(2000);
		driver.get(URL);
		Thread.sleep(2000);


		userid.click();
		Thread.sleep(700);
		userid.sendKeys(User);
		Thread.sleep(700);
		password.click();
		Thread.sleep(700);
		password.sendKeys(Password);
		Thread.sleep(700);
		site.click();
		Thread.sleep(700);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );

		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(1000);


		Hamberger.click();
		Thread.sleep(700);
		Investigation.click();
		Thread.sleep(700);
		//Executionloc.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='"+SampleCollectionLocation+"']")).click();
		Thread.sleep(700);
		ExecutionlocOK.click();
		Thread.sleep(700);
		confirmOK.click();
		Thread.sleep(2000);


		ivstgnStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection Pending - Unbilled']")).click();
		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection Pending-Billed']")).click();
		//		Thread.sleep(1000);
		//sample Collection	

		SearchField.click();
		Thread.sleep(700);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Print Barcode')]")).click();
		Thread.sleep(1000);
		ivstgnSave.click();
		Thread.sleep(1000);
		SaveOK1.click();
		Thread.sleep(3000);
		ivstgnStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Sample Collection-Despatch Pending']")).click();
		Thread.sleep(1500);

		/////despatch Pending 

		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		despatch.click();
		Thread.sleep(2000); 

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		Workorder.click();
		Thread.sleep(1000);
		ExternalMRNo.click();
		Thread.sleep(1000);
		ExternalMRNo.sendKeys(MRNO, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']//i[@class='ki ki-search']")).click();
		Thread.sleep(3000);
		Print.click();
		Thread.sleep(7000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


		///Recieve & Accept

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(2000);
		SampleProcessing.click();
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='Sample No']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='MRNo/Name']//i[@class='ki ki-user']")).click();
		Thread.sleep(1000);
		
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		orderCheckbox.click();
		Thread.sleep(2000);
		Recieve.click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Accept));		
		Thread.sleep(4000);

		Accept.click();
		Thread.sleep(2000);


		////External Sample Processing

		Hamberger.click();
		Thread.sleep(700);
		ExternalSampleProcessing.click();
		Thread.sleep(700);
		GroupLab.click();
		Thread.sleep(700);
		DespatchFrom.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Bio-Chemistry']")).click();
		Thread.sleep(1000);
		DespatchTo.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='DDRC Agilus']")).click();
		Thread.sleep(1000);
		ExternalMRNo.clear();
		Thread.sleep(700);
		ExternalMRNo.sendKeys(MRNO);
		Thread.sleep(700);
		Search.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//label[@class='check-container storagesample ext-head']//span[@class='checkmark']")).click();
		Thread.sleep(1000);

		externalLAB.click();
		Thread.sleep(700);
//		ChangeDespatch.click();
//		Thread.sleep(700);
//		driver.findElement(By.xpath("//li[normalize-space()='LABBB']")).click();
//		Thread.sleep(1000);

		PreparedBy.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Devika R']")).click();
		Thread.sleep(1000);

		PreparedTYm.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(1000);
		PreparationRemarks.click();
		Thread.sleep(700);
		PreparationRemarks.sendKeys("PreparationRemarks");
		Thread.sleep(700);
		DespatchDetails.click();
		Thread.sleep(700);
		Pickuptime.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(1000);
		CarrierDetails.click();
		Thread.sleep(700);
		CarrierDetails.sendKeys("OK");
		Thread.sleep(700);
		EDOR.click();
	//	Robot t=new Robot();
		t.keyPress(KeyEvent.VK_RIGHT);
		t.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_RIGHT);
		t.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_RIGHT);
		t.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);

		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(1000);

		Despatchemarks.click();
		Thread.sleep(700);
		Despatchemarks.sendKeys("OK");
		Thread.sleep(700);
		Temprature.click();
		Thread.sleep(700);
		Temprature.sendKeys("24");
		Thread.sleep(700);
		DespatchBy.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Priyanka P']")).click();
		Thread.sleep(1000);
		Signature.click();

		Actions builder = new Actions(driver);
		Action drawAction = builder.moveToElement(driver.findElement(By.cssSelector(".upper-canvas"))) //start points x axis and y axis. 

				.moveByOffset(-100,0)
				.clickAndHold()
				.moveByOffset(-50,0) // 2nd points (x1,y1)
				.moveByOffset(20, 50)// 3rd points (x2,y2)
				.moveByOffset(30,0) // 2nd points (x1,y1)
				.moveByOffset(0,-50)// 3rd points (x2,y
				.moveByOffset(10,10)
				.moveByOffset(12,70)
				.moveByOffset(50,6)
				.release()
				.build();
		drawAction.perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active ng-star-inserted']")).click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click(); 
		Thread.sleep(2000);



		Hamberger.click();
		Thread.sleep(700);
		ExternalWorkOrder.click();
		Thread.sleep(1000);
		ExternalMRNo.click();
		Thread.sleep(1000);
		ExternalMRNo.sendKeys(MRNO, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']//i[@class='ki ki-search']")).click();
		Thread.sleep(3000);		
		Print.click();
		Thread.sleep(7000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(4000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);


		///Result enterering

		Hamberger.click();
		Thread.sleep(700);
		SampleProcessing.click();
		Thread.sleep(700);
		ivstgnStatus.click();
		driver.findElement(By.xpath("//li[normalize-space()='External Sample - Despatched']")).click();
		Thread.sleep(2000);
		SearchField.click();
		Thread.sleep(700);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		Selectall.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("200");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("23");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("50");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("90");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("3");
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")).sendKeys("12");
	//	Thread.sleep(1000);
		ivstgnSave.click();
		Thread.sleep(5500);         


		///////////	ResultAuthorization

		hamberger.click();
		Thread.sleep(700);
		ResultAuthorization.click();
		Thread.sleep(700);
		ivstgnStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Unauthorized']")).click();
		Thread.sleep(700);
		SearchField.click();
		Thread.sleep(700);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		Selectall.click();
		Thread.sleep(700);
		Authorization.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(700);
		ivstgnSave.click();
		Thread.sleep(5000);  

		ivstgnStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
		Thread.sleep(700);
		SearchField.clear();
		Thread.sleep(700);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		Preview.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(700);
		Thread.sleep(1000);
		Homeicon.click();
		Thread.sleep(3000);

		//		for (int i = 1; i < 7; i++) {
		//			
		//	WebElement result=driver.findElement(By.xpath("(//label[@class='slot-area'])["+i+"]"));
		//			
		//					act.moveToElement(result).perform();
		//					Thread.sleep(1000);
		//					result.click();
		//					Thread.sleep(700);	
		//			
		//		}
		driver.findElement(By.xpath("//div[normalize-space()='Charts']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//input[@id='chartlist']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Critical Care Chart']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//input[@id='timeinterval']")).click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='5']")).click();
		Thread.sleep(1700);


		//		DocumentView.click();
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//div[@class='canvasWrapper']//canvas")).click();
		//		Thread.sleep(3000);
		//		((JavascriptExecutor) driver).executeScript("window.scrollTo(5000, document.body.scrollHeight)");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//button[@class='btn btn-danger sm ml10'][normalize-space()='Close']")).click();
		//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='rounded-1 btn btn-sm btn-red clear']//i[@class='ki ki-clear-back']")).click();
		Thread.sleep(1000);




	}










}
