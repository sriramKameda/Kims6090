package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_NutritionManagement_Yasasiiweb extends  PageFactoryInitYasasiiWeb {
	public KIMS_NutritionManagement_Yasasiiweb(WebDriver driver) {
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
	public WebElement Add1;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;

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

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//button[contains(@class,'icon emrsave')]")
	public WebElement EMRsave;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Diagnosis and Plan']")
	public WebElement Diagnosis;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement cpoeSearch;

	@FindBy(xpath = "//button[@class='icon-btn btn-dark-green inline min-clear-btm']//i[@class='ki ki-plus']")
	public WebElement Plus;

	@FindBy(xpath = "//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement Add;

	@FindBy(xpath = "//label[normalize-space()='Tube Feed Preparation']")
	public WebElement TubefeedPreparation;

	@FindBy(xpath = "//button[normalize-space()='View Nutrition']")
	public WebElement ViewNutritions;

	@FindBy(xpath = "//button[@class='icon cpoeadmin']")
	public WebElement CPOEAdministration;

	@FindBy(xpath = "//button[@class='btn btn-danger sm clear']")
	public WebElement Close;

	@FindBy(xpath = "//button[normalize-space()='Add Feeds']")
	public WebElement ADDfeed;

	@FindBy(xpath = "//input[@id='feedCountDiet0']")
	public WebElement NoOFfeeds;

	@FindBy(xpath = "//tbody/tr[1]/td[5]/ki-checkbox-control[1]/label[1]/label[1][1]/span[1]")
	public WebElement start1;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save;

	@FindBy(xpath="//label[normalize-space()='Diet Administration']")
	public WebElement DietAdmin;

	@FindBy(xpath = "//ki-checkbox-control[@class='ng-untouched ng-dirty ng-valid']//span[@class='checkmark']")
	public WebElement END;

	@FindBy(xpath = "//textarea[@id='dietAdminremarks0']")
	public WebElement Remarks;

	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
	public WebElement ThreeDot;

	@FindBy(xpath = "//label[normalize-space()='Add']")
	public WebElement Addfeed;

	@FindBy(xpath = "//input[@id='dietAdminStatus0']")
	public WebElement AdminStatus;

	@FindBy(xpath = "//input[@id='dietAdminQty0']")
	public WebElement AdminQTY;

	@FindBy(xpath = "//input[@id='dietAdminStatus']")
	public WebElement AdmindietStatus;

	@FindBy(xpath = "//i[@class='ki ki-chevron-down']")
	public WebElement DownArrow;

	@FindBy(xpath = "//ki-checkbox-control[@class='ng-untouched ng-pristine ng-valid']//label[contains(@class,'check-container')][normalize-space()='Start']//span[@class='checkmark']")
	public WebElement Start2;

	@FindBy(xpath = "//th[normalize-space()='Total Admin Qty']")
	public WebElement Admin1Info;

	@FindBy(xpath = "//ki-checkbox-control[@class='ng-untouched ng-dirty ng-valid']//span[@class='checkmark']")
	public WebElement End2;

	@FindBy(xpath = "//i[@class='ki ki-upload']")
	public WebElement Update;


	@FindBy(xpath = "//div[@class='adm-xl-container']//div[1]//div[1]//div[1]//label[4]//i[1]")
	public WebElement ThreeDot2;

	@FindBy(xpath = "//div[@class='adm-xl-container']//div[1]//div[1]//div[1]//label[4]//div[1]//div[1]")
	public WebElement Add2;

	@FindBy(xpath = "//button[@class='nutrition-btn']")
	public WebElement Nutrition;

	@FindBy(xpath = "//div[@class='adm-xl-container']//div[1]//div[1]//div[1]//label[3]//i[1]")
	public WebElement Log2;

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

	@FindBy(xpath = "//span[normalize-space()='Emergency / Guardian / Other Contacts']")
	public WebElement emergencyContact;

	@FindBy(xpath = "//input[@id='type']")
	public WebElement Type;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement Add4;



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
		js.executeScript("arguments[0].scrollIntoView();",Add4 );
		Add4.click();
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
			Thread.sleep(3000);

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
		Add1.click();
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
		HSSFSheet FOFullRegTest=wb.getSheetAt(49);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(1000);


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


	public void doctoreNote(String docid,String docpassword,String MRNO,String SERVICE ) throws InterruptedException, AWTException {


		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(2000);

		//Clearing browser cache

		driver.get("chrome://settings/clearBrowserData");
		Thread.sleep(2000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);


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
//		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
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

		Thread.sleep(700);
		cpoeService.click();
		Thread.sleep(700);
		cpoeSearch.clear();
		Thread.sleep(700);
		cpoeSearch.sendKeys(SERVICE, Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//label[normalize-space()='"+SERVICE+"']")).click();
		Thread.sleep(700);

		EMRsave.click();
		Thread.sleep(3000);

	}


	public void Diet_administration() throws InterruptedException {

		Thread.sleep(700);
		CPOEAdministration.click();
		Thread.sleep(700);
		TubefeedPreparation.click();
		Thread.sleep(700);
		ViewNutritions.click();
		Thread.sleep(700);
		Close.click();
		Thread.sleep(700);
		ADDfeed.click();	
		Thread.sleep(700);
		NoOFfeeds.click();
		Thread.sleep(700);
		NoOFfeeds.sendKeys("2");
		Thread.sleep(700);
		Add1.click();
		Thread.sleep(700);
		start1.click();
		Thread.sleep(700);
		END.click();
		Thread.sleep(700);
		Save.click();
		Thread.sleep(1500);



		DietAdmin.click();
		Thread.sleep(700);
		Remarks.sendKeys("Feed 1 Administered");
		Thread.sleep(700);
		Save.click();
		Thread.sleep(60000);

		ThreeDot.click();
		Thread.sleep(700);
		Addfeed.click();
		Thread.sleep(700);
		AdminStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Continue']")).click();
		Thread.sleep(1000);
		Thread.sleep(700);
		AdminQTY.clear();
		Thread.sleep(700);
		AdminQTY.sendKeys("0.5");
		Thread.sleep(700);
		Save.click();
		Thread.sleep(1000);

		AdmindietStatus.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Continue']")).click();
		Thread.sleep(2000);

		TubefeedPreparation.click();
		Thread.sleep(700);
		DownArrow.click();
		Thread.sleep(700);
		Start2.click();
		Thread.sleep(700);
		End2.click();
		Thread.sleep(700);
		Admin1Info.click();
		Thread.sleep(700);
		//	Close.click();
		Thread.sleep(700);
		Update.click();
		Thread.sleep(2700);
		DownArrow.click();
		Thread.sleep(60000);

		DietAdmin.click();
		Thread.sleep(700);
		Remarks.sendKeys("Feed 2 Administered");
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(1700);


		ThreeDot2.click();
		Thread.sleep(700);
		Add2.click();
		Thread.sleep(700);
		AdminStatus.click();
		Thread.sleep(700);
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Continue']")).click();
		Thread.sleep(2000);


		AdminQTY.clear();
		Thread.sleep(700);
		AdminQTY.sendKeys("0.5");
		Thread.sleep(700);
		Save.click();
		Thread.sleep(2000);

		Nutrition.click();
		Thread.sleep(700);
		Close.click();
		Thread.sleep(700);
		Log2.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[@class='btn mr0 btn-danger sm clear']")).click();
		Thread.sleep(1000);

		TubefeedPreparation.click();
		Thread.sleep(700);
		DownArrow.click();
		Thread.sleep(700);
		Admin1Info.click();
		Thread.sleep(2000);

	}


}
