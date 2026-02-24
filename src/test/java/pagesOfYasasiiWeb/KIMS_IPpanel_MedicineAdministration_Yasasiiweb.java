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
import com.w2a.utilities.RandomString;

public class KIMS_IPpanel_MedicineAdministration_Yasasiiweb  extends PageFactoryInitYasasiiWeb{

	public KIMS_IPpanel_MedicineAdministration_Yasasiiweb(WebDriver driver) {

		super(driver);

	}

	///Registration


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
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

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printUnckeck;	

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add1;

	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lastname;

	////	ADT


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



	@FindBy(xpath = "//input[@id='admndischargestatusid']")
	public WebElement DischargeStatus;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement category1;

	@FindBy(xpath = "//div[normalize-space()='EMR HomeScreen']")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

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

	@FindBy(xpath = "//label[normalize-space()='CPOE Orderset']")
	public WebElement CPOEOrderset;

	@FindBy(xpath = "//div[@class='btn-pharmacy-search custom-search']//input[@placeholder='Search With Favorites']")
	public WebElement ordersetSearch;

	@FindBy(xpath = "//button[@id='ordersetAdd']")
	public WebElement serviceAdd;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-duplicate-medicine-confirmation[1]/div[2]/div[1]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement OverrideReason;
	

	@FindBy(xpath = "//button[@class='icon emrsave']")
	public WebElement EMRsave;

	@FindBy(xpath = "//label[normalize-space()='No Current Medication']//span[@class='checkmark']")
	public WebElement NoCurrentmed;

	@FindBy(xpath = "//label[@class='check-container no-label']//span[@class='checkmark']")
	public WebElement NoCurrentmedCheck;

	@FindBy(xpath = "//i[@class='ki ki-admission-reconciliation']")
	public WebElement AdmsnReconcile;

	@FindBy(xpath = "//i[@class='ki ki-reconciliation']")
	public WebElement Reconsile;

	@FindBy(xpath = "(//span[@class='ser-time'])[1]")
	public WebElement Logoutarw;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[contains(@class,'logout list-item')]")
	public WebElement Logoutbutton;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement Logoutconfrm;


	@FindBy(xpath = "//div[normalize-space()='Pharmacy Panel']")
	public WebElement PharmacyPanel;

	@FindBy(xpath = "//div[normalize-space()='IP Panel']")
	public WebElement Ip_panel;

	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement pharmacyLocation;

	@FindBy(xpath = "//button[@id='btnsearch']")
	public WebElement OK1;

	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement Search;

	@FindBy(xpath = "//i[@title='Search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//i[@title='Pharmacist Verification Pending']")
	public WebElement PharmacistVerification;

	@FindBy(xpath = "//div[@class='form-container pt-1 billing-card cb-40-bottom ng-star-inserted']//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//span[2]//i[1]")
	public WebElement ThreeDot;

	@FindBy(xpath = "//div[@class='form-container pt-1 billing-card cb-40-bottom ng-star-inserted']//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//span[2]//div[1]//div[2]")
	public WebElement pharmacistNote;

	@FindBy(xpath = "//textarea[@id='pharmacistnote']")
	public WebElement TextpharmacistNote;

	@FindBy(xpath = "//label[normalize-space()='To Provider']//span[@class='checkmark']")
	public WebElement ToProvider;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement Save1;

	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement SelectAll;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-ip-panel[1]/div[1]/lib-pharmacy-card[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[3]/div[7]/label[2]/i[1]")
	public WebElement batchdelete;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-ip-panel[1]/div[1]/lib-pharmacy-card[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[4]")
	public WebElement Stockinfo;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-brandpriority[1]/form[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	public WebElement BatchSelect;

	@FindBy(xpath = "//i[@title='Prescription Print']")
	public WebElement prescriptionPrint;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-ip-panel[1]/div[1]/lib-pharmacy-card[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[3]")
	public WebElement MedicineInfo;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-ip-panel[1]/div[1]/lib-pharmacy-card[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[4]")
	public WebElement Admininfo;

	@FindBy(xpath = "//label[normalize-space()='Label print']//span[@class='checkmark']")
	public WebElement LabelPrint;

	@FindBy(xpath = "//label[normalize-space()='Transfer']")
	public WebElement Transfer;

	@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
	public WebElement Status;

	@FindBy(xpath = "//i[@class='ki ki-inventory']")
	public WebElement Inventory;

	@FindBy(xpath = "//input[@id='sublocationid']")
	public WebElement Location;	

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Transfer']")
	public WebElement transfer;	

	@FindBy(xpath = "//div[normalize-space()='Stock Transfer']")
	public WebElement Stocktransfer;	

	@FindBy(xpath = "//tab[@id='1']//div[@class='row']//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement transferStatus;

	@FindBy(xpath = "//input[@id='mrno']")
	public WebElement MRNOSearch;

	@FindBy(xpath = "//button[@id='print']")
	public WebElement Print;

	@FindBy(xpath = "//div[normalize-space()='Stock Receive']")
	public WebElement StockRecieve;

	@FindBy(xpath = "//input[@id='phreqlocid']")
	public WebElement ReqLoc;

	@FindBy(xpath = "//label[@class='check-container pl-3']//span[@class='checkmark']")
	public WebElement Recieve;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/input[1]")
	public WebElement RecieveQTY;

	@FindBy(xpath = "//button[@id='btnreceiveStock']")
	public WebElement ReceiveStock;

	@FindBy(xpath = "//div[normalize-space()='Receive Rejected Stock']")
	public WebElement Recieverejected;

	@FindBy(xpath = "//button[@class='icon cpoeadmin']")
	public WebElement CPOEadministration;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[1]")
	public WebElement admin1;

	@FindBy(xpath = "//input[@id='batchnoid']")
	public WebElement Batch;
	
	@FindBy(xpath = "//input[@id='medicinesource']")
	public WebElement MedicineSource;
	
	@FindBy(xpath = "//input[@id='locmedbrnadid']")
	public WebElement MedicineName;
	
	
	
	@FindBy(xpath = "//input[@id='medicinesource1']")
	public WebElement MedicineSource1;
	
	@FindBy(xpath = "//input[@id='batchnoid1']")
	public WebElement batch1;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//input[@id='quantity']")
	public WebElement quantity;

	@FindBy(xpath = "//button[normalize-space()='Consumed Item']")
	public WebElement ConsumedItem;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[2]")    
	public WebElement admin2;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[4]")
	public WebElement admin3;

	@FindBy(xpath = "(//i[@class='ki ki-info-circle admin-info'])[3]")
	public WebElement Admininfo3;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[6]")
	public WebElement admin4;

	@FindBy(xpath = "//input[@id='rejectquantity']")
	public WebElement rejectionQty;

	@FindBy(xpath = "//input[@id='verifiedbyname']")
	public WebElement VerifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement Verifypassword;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[9]")
	public WebElement Admin5;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[11]")
	public WebElement admin6;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[12]")
	public WebElement Admin7;

	@FindBy(xpath = "//i[@class='ki ki-trash']")    
	public WebElement Delete;

	@FindBy(xpath = "//label[@class='check-container m0']//span[@class='checkmark']")
	public WebElement Unusedmedicine;

	@FindBy(xpath = "//button[normalize-space()='Delete Consumption']")
	public WebElement Deletebillposting;


	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM']")
	public WebElement RCM;

	@FindBy(xpath = "//div[normalize-space()='Back End Billing']")
	public WebElement Backendbilling;

	@FindBy(xpath = "//span[normalize-space()='Pharmacy']")
	public WebElement Pharmacy;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-back-end-billing[1]/div[1]/tabset[1]/div[1]/tab[2]/form[1]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOsearch;

	@FindBy(xpath = "//div[@class='col-lg-2 col-6 mbl-pl0 col-md-2 mb10 icon-space']//i[@class='ki ki-search']")
	public WebElement search;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement BillCheck;

	@FindBy(xpath = "(//i[contains(@class,'ki ki-save')])[2]")
	public WebElement Generate;

	@FindBy(xpath = "//div[@class='col-lg-2 col-6 mbl-pl0 col-md-3 mbl-pl0 mb10']//input[@id='status']")
	public WebElement Status1;

//	@FindBy(xpath = "//label[@class='icon doctornote']")
//	public WebElement DoctorNote;
//
//	@FindBy(xpath = "//input[@id='chiefcomplainttext']")    
//	public WebElement cheifComplaint;
//
//	@FindBy(xpath = "//input[@id='emrtemplateid']")
//	public WebElement template;
//
//	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
//	public WebElement tempOk;
//
//	@FindBy(xpath = "//label[normalize-space()='CPOE Orderset']")
//	public WebElement CPOEOrderset;
//
//	@FindBy(xpath = "//div[@class='btn-pharmacy-search custom-search']//input[@placeholder='Search With Favorites']")
//	public WebElement ordersetSearch;
//
//	@FindBy(xpath = "//button[@id='ordersetAdd']")
//	public WebElement serviceAdd;
//
//	@FindBy(xpath = "//label[@class='icon emrsave']")
//	public WebElement EMRsave;



	










	public void Patreg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider) throws InterruptedException, IOException, AWTException {

		/////////Patient registration

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
		Thread.sleep(500);
		String lastName =RandomString.lastName();
		
		System.out.println(lastName + "LastName" );
		lastname.click();
		Thread.sleep(500);
		lastname.sendKeys(lastName);
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

		System.out.println(DocID );
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
		driver.findElement(By.xpath("//input[@id='guarantorphonehome']")).sendKeys("9845123658");
		Thread.sleep(600);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Add1 );
		Add1.click();
		Thread.sleep(600);



		HowDidYouKnow.click();
		Thread.sleep(600);
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		Save.click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(signupload));
		Thread.sleep(1000);
		
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




		///Encounter	

		Thread.sleep(1000);
		clear.click();
		//Thread.sleep(1000);
		//printuncheck.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(2000);
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(SAvesuccess));
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);


		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(52);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);



	}

	public void ADT( ) throws InterruptedException {


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
		{

			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
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


	public void doctoreNote(String docid,String docpassword ,String MRNO,String OrdersetName) throws InterruptedException {


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

		////////login
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(EMRsave));


		///CPOE Orderset

		CPOEOrderset.click();
		Thread.sleep(800);
		ordersetSearch.clear();
		Thread.sleep(800);
		ordersetSearch.sendKeys(OrdersetName , Keys.ENTER);
		Thread.sleep(800);

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
		driver.findElement(By.xpath("//label[normalize-space()='"+OrdersetName+"']")).click();
		Thread.sleep(1000); 
		serviceAdd.click();
		Thread.sleep(800);
		
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-duplicate-medicine-confirmation[1]/div[2]/div[1]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]"));

		if(dynamicElement111.size() !=0)
		{
			OverrideReason.click();
			Thread.sleep(800);
			OverrideReason.sendKeys("ok");
			Thread.sleep(800);
			driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click();
			Thread.sleep(1000); 
		}
		Thread.sleep(800); 

//		OverrideReason.click();
//		Thread.sleep(800);
//		OverrideReason.sendKeys("ok");
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click();
//		Thread.sleep(1000); 
		
		EMRsave.click();
		wait.until(ExpectedConditions.elementToBeClickable(Logoutarw));
		Thread.sleep(3000);
		
	}



	public void IPpanel(String MRNo) throws InterruptedException, AWTException {
		
		Thread.sleep(1000); 
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);


		//login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(FinalbillUser);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

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

		PharmacyPanel.click();
		Thread.sleep(800);
		Ip_panel.click();
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

		pharmacyLocation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(800);
		OK1.click();
		Thread.sleep(800);
		Search.clear();
		Thread.sleep(800);
		Search.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(800);
		SearchIcon.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@title='"+MRNo+"']")).click();
		Thread.sleep(3000);
		
//		
//		PharmacistVerification.click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//		Thread.sleep(800);
				
		//		ThreeDot.click();
		//		Thread.sleep(800);
		//		pharmacistNote.click();
		//		Thread.sleep(800);
		//		TextpharmacistNote.click();
		//		Thread.sleep(800);
		//		ToProvider.click();
		//		Thread.sleep(800);
		//		Save1.click();
		//		Thread.sleep(800);
		
		SelectAll.click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(batchdelete));
		Thread.sleep(3000);		
		
		batchdelete.click();
		Thread.sleep(1000);
		Stockinfo.click();
		Thread.sleep(1200);
		Close.click();
		Thread.sleep(1000);
		//BatchSelect.click();
		//Thread.sleep(1200);
		prescriptionPrint.click();
		Thread.sleep(8000);

		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);


		Thread.sleep(800);
		MedicineInfo.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(800);
		//Admininfo.click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
//		Thread.sleep(800);

		LabelPrint.click();
		Thread.sleep(1800);
		driver.findElement(By.xpath("//label[contains(text(),'Transfer Summary Print')]")).click();
		Thread.sleep(800);
		
		Transfer.click();
		Thread.sleep(4000);
		
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(Hamburger));
		Thread.sleep(10000);		
		
		Status.click();
		Thread.sleep(800);

		driver.findElement(By.xpath("//li[normalize-space()='Stock Transferred']")).click();
		Thread.sleep(800);
		Search.clear();
		Thread.sleep(800);
		Search.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(800);
		SearchIcon.click();
		Thread.sleep(1800);
		driver.findElement(By.xpath("//div[@title='"+MRNo+"']")).click();
		Thread.sleep(800);



	}



	public void Stockreceive(String MRNo) throws InterruptedException, AWTException {


		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(800);	
		Inventory.click();
		Thread.sleep(800);
		Location.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(800);

		transfer.click();
		Thread.sleep(800);
		Stocktransfer.click();
		Thread.sleep(800);
		transferStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(800);

		MRNOSearch.clear();
		Thread.sleep(800);
		MRNOSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//b[normalize-space()='"+MRNo+"']")).click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Print));
		Print.click();
		Thread.sleep(5000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		StockRecieve.click();
		Thread.sleep(800);

		ReqLoc.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);

		MRNOSearch.clear();
		Thread.sleep(800);
		MRNOSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//b[normalize-space()='"+MRNo+"']")).click();
		Thread.sleep(1800);

		Recieve.click();
		Thread.sleep(800);
		RecieveQTY.clear();
		Thread.sleep(800);
		RecieveQTY.sendKeys("2");
		Thread.sleep(800);
		ReceiveStock.click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//input[@id='text']")).sendKeys("Following items have either been unchecked");
		Thread.sleep(1800);
		driver.findElement(By.xpath("//div[@class='col-md-12']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(800);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='OK']")));
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);
		

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		Recieverejected.click();
		Thread.sleep(800);

		MRNOSearch.clear();
		Thread.sleep(800);
		MRNOSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//b[normalize-space()='"+MRNo+"']")).click();
		Thread.sleep(1800);

		Recieve.click();
		Thread.sleep(800);
		ReceiveStock.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);


	}

	public void IPMedicineAdministration(String MRNO) throws InterruptedException {

		Logoutarw.click();
		Thread.sleep(1000);
		Logoutbutton.click();
		Thread.sleep(1000);
		Logoutconfrm.click();
		Thread.sleep(1000);


		//login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(NurseID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

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
		driver.findElement(By.xpath("//li[normalize-space()='My Location(IP)']")).click();
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


		CPOEadministration.click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@id='LocationDropDownid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(1000);
		
		
////////Dextrose		
		
		
     	admin2.click(); 
		Thread.sleep(1000);
		MedicineSource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
		Thread.sleep(1000);
		Batch.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		
		MedicineSource1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
		Thread.sleep(1000);
		batch1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='tail-icon-group icon-sgl ng-star-inserted']//i[@class='ki ki-plus']")).click();
		
		Thread.sleep(500);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);

		Save1.click();
		Thread.sleep(30000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(admin2));
		Thread.sleep(3000);		

		admin2.click();
		Thread.sleep(1000);
		quantity.clear();
		Thread.sleep(1000);
		quantity.sendKeys("250");
		Thread.sleep(1000);
		Add.click();

		Thread.sleep(500);
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);

		Save1.click();
		Thread.sleep(30000);
		
		wait.until(ExpectedConditions.elementToBeClickable(ConsumedItem));
		Thread.sleep(3000);	
		
		ConsumedItem.click();
		Thread.sleep(3000);
		Close.click();
		Thread.sleep(1000);
		
	
		wait.until(ExpectedConditions.elementToBeClickable(admin1));
		Thread.sleep(3000);		
//////////Agotin
		
		Thread.sleep(1000);
		admin1.click();
		Thread.sleep(1000);
		
		
		MedicineSource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
		Thread.sleep(1000);
		
		Batch.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		Add.click();

		Thread.sleep(500);
		List<WebElement> dynamicElement4=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement4.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);

		Save1.click();
		Thread.sleep(30000);
		
		wait.until(ExpectedConditions.elementToBeClickable(admin3));
		Thread.sleep(3000);		
		
	///Ahaglow	
		
		admin3.click();
		Thread.sleep(1000);
		
		MedicineSource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
		Thread.sleep(1000);
		
		Batch.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		Add.click();

		Thread.sleep(500);
		List<WebElement> dynamicElement41=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement41.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);

		Save1.click();
		Thread.sleep(30000);
		
		Admininfo3.click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(admin4));
		Thread.sleep(30000);		
		
	///////////Corex	
		
		admin4.click();
		Thread.sleep(1000);
		
		MedicineSource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
		Thread.sleep(1000);
		
		Batch.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		rejectionQty.click();
		Thread.sleep(1000);
		rejectionQty.sendKeys("0");
		Thread.sleep(1000);
		
		Add.click();
		Thread.sleep(500);
		List<WebElement> dynamicElement5=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement5.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);

		Save1.click();
		Thread.sleep(3000);
		Thread.sleep(500);
		List<WebElement> dynamicElement51=driver.findElements(By.xpath("//input[@id='verifiedbyname']"));

		if(dynamicElement51.size() !=0)
		{
			Thread.sleep(2000);
			VerifiedBy.sendKeys("Anitha R (NGL17697)");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Anitha R (NGL17697)']")).click();
			Thread.sleep(1000);
			Verifypassword.click();
			Thread.sleep(1000);
			Verifypassword.sendKeys(Password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
			Thread.sleep(1000);		}


		else {
			System.out.println("sri");
		}
		
		Thread.sleep(30000);
		wait.until(ExpectedConditions.elementToBeClickable(Admin5));
		Thread.sleep(3000);	
		
		
	/////fiasp	
		
		Admin5.click();
		Thread.sleep(1000);
		
		MedicineSource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
		Thread.sleep(1000);
		
		MedicineName.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		
		
		Batch.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000);
		//Add.click();

		Thread.sleep(500);
		List<WebElement> dynamicElement511=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement511.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);

		Save1.click();
		Thread.sleep(30000);

		List<WebElement> dynamicElement5111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']"));

		if(dynamicElement5111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		}


		else {
			System.out.println("sri");
		}
		

		List<WebElement> dynamicElement6111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement6111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(500);
////pantocid		
	
		Thread.sleep(500);
		List<WebElement> dynamicElement6=driver.findElements(By.xpath("(//i[@class='ki-user-drug ki'])[11]"));

		if(dynamicElement6.size() !=0)
		{
			Thread.sleep(2000);
			admin6.click();
			Thread.sleep(1000);
			
			MedicineSource.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
			Thread.sleep(1000);
			
			Batch.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
			Thread.sleep(1000);
			
			Thread.sleep(1000);
			rejectionQty.click();
			Thread.sleep(1000);
			rejectionQty.sendKeys("0");
			Thread.sleep(1000);
			Add.click();

			Thread.sleep(500);
			List<WebElement> dynamicElement51111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

			if(dynamicElement51111.size() !=0)
			{
				driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			}


			else {
				System.out.println("sri");
			}
			Thread.sleep(2000);

			Save1.click();
			Thread.sleep(30000);
			
			
			Thread.sleep(500);
			List<WebElement> dynamicElement151=driver.findElements(By.xpath("//input[@id='verifiedbyname']"));

			if(dynamicElement151.size() !=0)
			{
				Thread.sleep(2000);
				VerifiedBy.sendKeys("Anitha R (NGL17697)");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[normalize-space()='Anitha R (NGL17697)']")).click();
				Thread.sleep(1000);
				Verifypassword.click();
				Thread.sleep(1000);
				Verifypassword.sendKeys(Password);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
				Thread.sleep(1000);		}


			else {
				System.out.println("sri");
			}
			
			
		}


		else {
			System.out.println("sri");
		}
		
		
/////////////suncross		
		
		

		Thread.sleep(500);
		List<WebElement> dynamicElement61=driver.findElements(By.xpath("(//i[@class='ki-user-drug ki'])[12]"));

		if(dynamicElement61.size() !=0)
		{

			Admin7.click();
			Thread.sleep(1000);
			
			MedicineSource.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Location/Patient Medicine']")).click();
			Thread.sleep(1000);
			
			Batch.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
			Thread.sleep(1000);

			Thread.sleep(1000);
			rejectionQty.click();
			Thread.sleep(1000);
			rejectionQty.sendKeys("0");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//div[@class='tail-icon-group icon-sgl ng-star-inserted']//i[@class='ki ki-plus']")).click();
			//Add.click();

			Thread.sleep(500);
			List<WebElement> dynamicElement51111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

			if(dynamicElement51111.size() !=0)
			{
				driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			}


			else {
				System.out.println("sri");
			}
			Thread.sleep(2000);
			
			Thread.sleep(500);
			List<WebElement> dynamicElement511111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

			if(dynamicElement511111.size() !=0)
			{
				driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			}


			else {
				System.out.println("sri");
			}
			Thread.sleep(2000);
			

			Save1.click(); 
			Thread.sleep(1000);
		
			admin6.click();
			Thread.sleep(1000);
			Delete.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(1000);
			Save1.click();
			Thread.sleep(30000);
			
			ConsumedItem.click();
			Thread.sleep(1000);
			Unusedmedicine.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@class='check-container zero-top']//span[@class='checkmark']")).click();
			Thread.sleep(1000);
			Deletebillposting.click();
			Thread.sleep(2000);
			
			
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);

		
		
		
		

	}

public void BackendBillgeneration(String MRNO ) throws InterruptedException {
	
	Logoutarw.click();
	Thread.sleep(1000);
	Logoutbutton.click();
	Thread.sleep(1000);
	Logoutconfrm.click();
	Thread.sleep(1000);


	//login
	userid.click();
	Thread.sleep(1000);
	userid.sendKeys(FinalbillUser);
	Thread.sleep(1000);
	password.click();
	Thread.sleep(800);
	password.sendKeys(Password); 
	Thread.sleep(1000);
	site.click();
	Thread.sleep(1000);
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
	driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(3000);

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

	RCM.click();
	Thread.sleep(800);
	Backendbilling.click();
	Thread.sleep(800);
	
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
	
	Pharmacy.click();
	Thread.sleep(800);
	MRNOsearch.clear();
	Thread.sleep(800);
	MRNOsearch.sendKeys(MRNO);
	Thread.sleep(800);
	search.click();
	Thread.sleep(800);
	BillCheck.click();
	Thread.sleep(800);
	Generate.click();
	Thread.sleep(800);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='OK']")));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(1800);
	
	
	Status1.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Billed']")).click();
	Thread.sleep(1800);
	Thread.sleep(800);
	MRNOsearch.clear();
	Thread.sleep(800);
	MRNOsearch.sendKeys(MRNO);
	Thread.sleep(800);
	search.click();
	Thread.sleep(800);
	
	

	
	
}




















}