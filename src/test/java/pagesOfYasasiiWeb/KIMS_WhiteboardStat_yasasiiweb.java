package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_WhiteboardStat_yasasiiweb  extends PageFactoryInitYasasiiWeb{

	public KIMS_WhiteboardStat_yasasiiweb(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[3]/div/label[1]/i")
	public WebElement patienthomepageicon;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[3]/div/label[2]/i")
	public WebElement patienthomepagelock;

	@FindBy(xpath = "//button[@class='icon doctornote']")
	public WebElement docnote;

	@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
	public WebElement createnote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement encreate;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement clickOK ;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement category;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;

	@FindBy(xpath = "//div[@id='cpoeservicelist_3']//label[contains(@class,'item-name')]")
	public WebElement service;

	@FindBy(xpath = "//div[@class='order-details']//i[@class='fa fa-ellipsis-v']")
	public WebElement ThreeDot;

	@FindBy(xpath = "//div[normalize-space()='Edit']")
	public WebElement ServEdit;

	@FindBy(xpath = "//label[normalize-space()='STAT']")
	public WebElement Stat;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEphar;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement medicineSearch;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement frequency;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement medicineAdd;

	@FindBy(xpath = "//button[contains(@class,'icon emrsave')]")
	public WebElement EMRsave;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='EMR']")
	public WebElement EMR;

	@FindBy(xpath = "//div[normalize-space()='White Board']")
	public WebElement WhiteBoard;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement NameSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//i[@class='ki ki-others-fill']")
	public WebElement OthersIcon;

	@FindBy(xpath = "//tbody/tr[@class='custom-list-item ng-untouched ng-pristine ng-valid ng-star-inserted']/td[18]/label[1]")
	public WebElement ServiceBlink;

	@FindBy(xpath = "(//label[@class='text-ellipsis blink-bg color-info'])[2]")
	public WebElement MedicineBlink;

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement Reason;

	@FindBy(xpath = "//i[contains(@title,'Filter By Room Status')]")
	public WebElement filter;

	@FindBy(xpath = "//label[normalize-space()='Release']")
	public WebElement release;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[5]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement bed;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement Search;

	@FindBy(xpath = "//button[normalize-space()='Release']")
	public WebElement ActionRelease;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/button[1]/font[1]/font[1]")
	public WebElement ActionHold;

	@FindBy(xpath = "//input[@id='enteredbynameview']")
	public WebElement verifiedBy;


	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement PAssword;

	@FindBy(xpath = "//input[@id='roomstatusid']")
	public WebElement RoomStatus;

	@FindBy(xpath = "//input[@id='-2']")
	public WebElement others;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement Servicesearch;

	@FindBy(xpath = "//label[normalize-space()='STAT']")
	public WebElement Stat1;


	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement Diagnosisandplan;

	@FindBy(xpath = "//button[@class='icon-btn btn-dark-green inline min-clear-btm']//i[@class='ki ki-plus']")
	public WebElement Plus;

	@FindBy(xpath = "//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement serviceadd;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Plan']")
	public WebElement Plan;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement PlanText;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public WebElement SelectPatient;


	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement justification;
	
	
	public void  DoctorReferral(String MRNo) throws InterruptedException, IOException, AWTException {
		Thread.sleep(3000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='My IP']")).click();
		Thread.sleep(1000);
		System.out.println(MRNo);
		EnterPatientName.sendKeys(MRNo);
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

		//*[contains(text(),'"+MRNo+"')[1]]
		
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	//	SelectPatient.click();
	/*	Thread.sleep(5000);
		patienthomepageicon.click();
		Thread.sleep(1000);
		patienthomepagelock.click();*/
		
		
		
		
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

			
		////////////DocNote 
		Thread.sleep(1000);
		docnote.click();
		Thread.sleep(3000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 
		//createnote.click();
		Thread.sleep(1000);
		//////TemplateSelection
		encreate.clear();
		Thread.sleep(1000);
		encreate.click();
		Thread.sleep(1000);
		encreate.sendKeys("Fever");         
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(text(),'Fever')]")).click();
		Thread.sleep(2000);
		template.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		clickOK.click();
		Thread.sleep(1000);

		Diagnosisandplan.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'normal pressure hydrocephalus')]")).click();
		//SelectICD.click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);


		Thread.sleep(1000);  
		cpoeService.click();
		Thread.sleep(1000);
		Servicesearch.clear();
		Thread.sleep(1000);
		Servicesearch.sendKeys("Haemoglobin A1C" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Haemoglobin A1C (HPLC')]")).click();
		Thread.sleep(1000);
		//Stat1.click();
		//	Plus.click();
		//	Thread.sleep(1000);
		//	serviceadd.click();
		Thread.sleep(1000);




		//service.click();
		Thread.sleep(2000);
		//act.moveToElement(ThreeDot).click().build().perform();
		Thread.sleep(1000);
		ThreeDot.click();
		Thread.sleep(1000);
		ServEdit.click();
		Thread.sleep(1000);
		Stat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		Thread.sleep(2000);
		
		///Pharmacy
		
		
		CPOEphar.click();
		Thread.sleep(1000);
		medicineSearch.click();
		Thread.sleep(1000);
		medicineSearch.sendKeys("DOLOPAR 650 TAB", Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
		Thread.sleep(1000);
//		Reason.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
//		Thread.sleep(1000);
//		justification.click();
//		Thread.sleep(1000);
//		justification.sendKeys("ok");
//		Thread.sleep(1000);
		frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='STAT']")).click();

		///////Medicine REconciliation
//			Thread.sleep(1000);
//		driver.findElement(By.xpath("//label[normalize-space()='No Current Medication']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//i[contains(@class,'ki ki-admission-reconciliation')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//i[contains(@class,'ki ki-reconciliation')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click(); 
//		Thread.sleep(1000); 

		//////////////////////
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);

		Thread.sleep(1000);
		medicineAdd.click();
		Thread.sleep(1000);
		EMRsave.click();
		Thread.sleep(1000);


	}

	public void Whiteboard(String MRNo) throws InterruptedException, AWTException {


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
		Thread.sleep(3000);

		//login
		userid.click();
		Thread.sleep(800);
		userid.sendKeys(NurseID);
		password.click();
		Thread.sleep(800);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);


		//driver.navigate().refresh();
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();

		js.executeScript("arguments[0].scrollIntoView();" , OthersIcon);
		Thread.sleep(3000);

		act.moveToElement(ServiceBlink).click().build().perform();
		//ServiceBlink.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(3000);
		act.moveToElement(MedicineBlink).click().build().perform();
		//MedicineBlink.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(3000);
	}	

	public void roomstatus() throws InterruptedException {

		filter.click();
		Thread.sleep(1000);
		release.click();
		Thread.sleep(1000);
		String bedName = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")).getText();
		Thread.sleep(1000);
		System.out.println(bedName);
		bed.click();
		Thread.sleep(1000);
		bed.sendKeys(bedName);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		ActionRelease.click();
		Thread.sleep(1000);
		RoomStatus.click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cleaning Started']")).click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click();
		Thread.sleep(1000);
		PAssword.click();
		Thread.sleep(1000);
		PAssword.sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='verifyuser']")).click();
		Thread.sleep(2000);

		filter.click();
		Thread.sleep(1000);
		others.click();
		Thread.sleep(1000);
		bed.clear();
		bed.click();
		Thread.sleep(1000);
		bed.sendKeys(bedName);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Cleaning Completed']")).click();
		//	ActionHold.click();
		Thread.sleep(1000);
		RoomStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cleaning Completed']")).click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click();
		Thread.sleep(1000);
		PAssword.click();
		Thread.sleep(1000);
		PAssword.sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='verifyuser']")).click();
		Thread.sleep(2000);

		filter.click();
		Thread.sleep(1000);
		others.click();
		Thread.sleep(1000);
		bed.clear();
		bed.click();
		Thread.sleep(1000);
		bed.sendKeys(bedName);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Verification']")).click();
		//	ActionHold.click();
		Thread.sleep(1000);
		RoomStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Verification']")).click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click();
		Thread.sleep(1000);
		PAssword.click();
		Thread.sleep(1000);
		PAssword.sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='verifyuser']")).click();
		Thread.sleep(2000);

		filter.click();
		Thread.sleep(700);
		others.click();
		Thread.sleep(1000);
		bed.clear();
		Thread.sleep(700);
		bed.click();
		Thread.sleep(1000);
		bed.sendKeys(bedName);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Room Check(Ready to Occupy)']")).click();
		//	ActionHold.click();
		Thread.sleep(1000);
		RoomStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Room Check(Ready to Occupy)']")).click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click();
		Thread.sleep(1000);
		PAssword.click();
		Thread.sleep(1000);
		PAssword.sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='verifyuser']")).click();
		Thread.sleep(2000);
		filter.click();
		Thread.sleep(1000);
		others.click();
		Thread.sleep(1000);
		bed.clear();
		bed.click();
		Thread.sleep(1000);
		bed.sendKeys(bedName);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Release']")).click();
		//	ActionHold.click();
		Thread.sleep(1000);
		RoomStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Release']")).click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(NurseID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+NurseID+"')])")).click();
		Thread.sleep(1000);
		PAssword.click();
		Thread.sleep(1000);
		PAssword.sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='verifyuser']")).click();
		Thread.sleep(2000);


		filter.click();
		Thread.sleep(1000);
		release.click();   
		Thread.sleep(1000);
		System.out.println(bedName);
		bed.clear();
		bed.click();
		Thread.sleep(1000);
		bed.sendKeys(bedName);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(4000);


	}


}
