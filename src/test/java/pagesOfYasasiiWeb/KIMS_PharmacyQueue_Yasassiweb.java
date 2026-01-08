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
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
import com.w2a.utilities.RandomString;

import net.bytebuddy.asm.Advice.Enter;

public class KIMS_PharmacyQueue_Yasassiweb extends PageFactoryInitYasasiiWeb {

	public KIMS_PharmacyQueue_Yasassiweb(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement menuToggle;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastersModule;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='FO']")
	public WebElement foTab;
	@FindBy(xpath = "//div[normalize-space()='Queue Master']")
	public WebElement queueMaster;
	@FindBy(xpath = "//input[@id='queuename']")
	public WebElement queueName;
	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='queuetypeid']")
	public WebElement queueType;
	@FindBy(xpath = "//li[normalize-space()='Pharmacy Queue']")
	public WebElement pharmacyQueue;
	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='siteid']")
	public WebElement site;
	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement location;
	@FindBy(xpath = "//input[@id='servicetypeid']")
	public WebElement serviceType;
	@FindBy(xpath = "//li[@class='uparrow-yellow']")
	public WebElement pharmacy;
	@FindBy(xpath = "//input[@id='callername']")
	public WebElement callerName;
	@FindBy(xpath = "//input[@id='QueueSubTypeId']")
	public WebElement serviceCounter;
	@FindBy(xpath = "//input[@id='CounterNo']")
	public WebElement counterNo;
	@FindBy(xpath = "//button[@class='icon-btn btn-dark-green inline']//i[@class='ki ki-plus']")
	public WebElement add;
	@FindBy(xpath = "//li[normalize-space()='Pharmacy Billing']")
	public WebElement pharmacyBilling;
	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement saveButton;
	@FindBy(xpath = "//li[normalize-space()='Pharmacy Dispense']")
	public WebElement pharmacyDispense;
	@FindBy(xpath = "//li[normalize-space()='Pharmacy WalkIn']")
	public WebElement pharmacyWalkIn;
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement okButton;
	@FindBy(xpath = "//button[@type='button']//i[@class='ki ki-plus']")
	public WebElement add1;
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement menu;
	@FindBy(xpath = "//i[@class='ki ki-chevron-down']")
	public WebElement modules;
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement foModule;
	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Queue']")
	public WebElement queue;
	@FindBy(xpath = "//div[normalize-space()='Queue Display']")
	public WebElement queueDisplay;
	@FindBy(xpath = "//input[@id='queuetypeid']")
	public WebElement queueType1;
	@FindBy(xpath = "//li[normalize-space()='Pharmacy Queue']")
	public WebElement PharmacyQueue;
	@FindBy(xpath = "//input[@id='queueid']")
	public WebElement queueName1;
	@FindBy(xpath = "//button[@class='btn btn-primary sm active']")
	public WebElement okButton1;
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site1;

	@FindBy(xpath = "//div[normalize-space()='Pharmacy Panel']")
	public WebElement pharmacyPanel;
	@FindBy(xpath = "//div[normalize-space()='OP Panel']")
	public WebElement opPanel;
	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement locationId;
	@FindBy(xpath = "//input[@id='callerid']")
	public WebElement callerId;
	@FindBy(xpath = "//button[@id='btnsearch']")
	public WebElement ok;
	@FindBy(xpath = "//i[@title='Outsider']")
	public WebElement outsider;
	@FindBy(xpath = "//div[@class='closed-ads ng-star-inserted']")
	public WebElement close;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement name;
	@FindBy(xpath = "//input[@id='genderid']")
	public WebElement genderid;
	@FindBy(xpath = "//li[normalize-space()='Male']")
	public WebElement male;
	@FindBy(xpath = "//input[@id='genderage']")
	public WebElement age;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement phoneNumber;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tokenNumber;
	@FindBy(xpath = "//input[@id='medicinename']")
	public WebElement medicinename;// ALTHROCIN 250MG TAB

	@FindBy(xpath = "//input[@id='qtynew']")
	public WebElement quantity;
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement medicineAdd;// save
	@FindBy(xpath = "//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")
	public WebElement succesfullyOk;
	@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
	public WebElement status;
	@FindBy(xpath = "//li[normalize-space()='Confirmed']")
	public WebElement confirmedStatus;
	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement search;
	@FindBy(xpath = "//label[@title='Call Token']//i[@class='ki ki-token-call']")
	public WebElement sendToken;
	@FindBy(xpath = "//div[@class='pat-name']")
	public WebElement select;
	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement stockReservation;
	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement checkmark;
	@FindBy(xpath = "//li[normalize-space()='Stock Reservation']")
	public WebElement stockReservationStatus;
	@FindBy(xpath = "//label[normalize-space()='Print']//span[@class='checkmark']")
	public WebElement printuncheck;
	@FindBy(xpath = "//button[@id='billholdsave']//i[@class='ki ki-save']")
	public WebElement billHold;
	@FindBy(xpath = "//li[normalize-space()='Bill Hold']")
	public WebElement billHoldStatus;
	@FindBy(xpath = "//div[@title='Dispensing']")
	public WebElement Dispensing;
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement toggle;
	@FindBy(xpath = "//i[@class='fa ng-star-inserted fa-angle-down']")
	public WebElement down;
	@FindBy(xpath = "//div[normalize-space()='Kiosk Reporting(Pharmacy)']")
	public WebElement kioskReporting;
	@FindBy(xpath = "//input[@id='executionlocid']")
	public WebElement executionlocid;
	@FindBy(xpath = "//label[normalize-space()='Generate Token']")
	public WebElement GenerateToken;
	@FindBy(xpath = "//button[@id='billingsave']//i[@class='ki ki-save']")
	public WebElement save;
	@FindBy(xpath = "//i[@class='ki ki-token-call']")
	public WebElement token;
	@FindBy(xpath = "//input[@id='servicetypeid']")
	public WebElement servicetypeid;
	@FindBy(xpath = "//li[normalize-space()='Pharmacy']")
	public WebElement Pharmacy;
	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement locationid;
	@FindBy(xpath = "//li[normalize-space()='West Main']")
	public WebElement West;
	@FindBy(xpath = "//input[@id='callername']")
	public WebElement callername;
	@FindBy(xpath = "//li[@class='uparrow-yellow']")
	public WebElement walkin;
	@FindBy(xpath = "//input[@id='serviceCounterId']")
	public WebElement serviceCounterId;// walkin
	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")
	public WebElement okbutton;
	@FindBy(xpath = "//label[@title='Call Next Token']//i[@class='ki ki-token-call']") // modal-container[@role='dialog']
	public WebElement callNextToken;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;
	@FindBy(xpath = "//div[@class='form-group zero-bottom ki-dropdown']//input[@id='queuetypeid']")
	public WebElement queuetypeid;// pharmacyQueue

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement Search;

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement delete;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement confirmation;

	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;

	public void queueCreationNew(String QueueName) throws InterruptedException, AWTException {

		Thread.sleep(2000);
		menuToggle.click();
		Thread.sleep(1000);
		mastersModule.click();
		Thread.sleep(1000);
		foTab.click();
		Thread.sleep(1000);
		queueMaster.click();
		Thread.sleep(1000);
		queueName.sendKeys(QueueName);
		Thread.sleep(1000);
		queueType.click();
		Thread.sleep(1000);
		pharmacyQueue.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"))
				.click();
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH Nagercoil']")).click();
		Thread.sleep(1000);
		location.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + PharmacyLocation + "']")).click();
		Thread.sleep(1000);
		serviceType.click();
		Thread.sleep(1000);
		pharmacy.click();
		Thread.sleep(1000);
		callerName.sendKeys("OPD Pharmacy");
		Thread.sleep(1000);
		serviceCounter.click();
		Thread.sleep(1000);
		pharmacyBilling.click();
		Thread.sleep(1000);
		counterNo.sendKeys("OPD Pharmacy");
		Thread.sleep(1000);
		add.click();
		callerName.clear();
		Thread.sleep(1000);
		callerName.sendKeys("OPD Dispense");
		Thread.sleep(1000);
		serviceCounter.click();
		Thread.sleep(1000);
		pharmacyDispense.click();
		Thread.sleep(1000);
		counterNo.sendKeys("OPD Dispense");
		Thread.sleep(1000);
		add.click();
		callerName.clear();
		Thread.sleep(1000);
		callerName.sendKeys("Pharmacy WalkIn");
		Thread.sleep(1000);
		serviceCounter.click();
		Thread.sleep(1000);
		pharmacyWalkIn.click();
		Thread.sleep(1000);
		counterNo.sendKeys("Pharmacy WalkIn");
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", add1);

		add1.click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
	}

	public void queue(String QueueName) throws InterruptedException, AWTException {

		menu.click();
		Thread.sleep(1000);
		modules.click();
		Thread.sleep(1000);
		foModule.click();
		Thread.sleep(1000);
		queue.click();
		Thread.sleep(1000);
		queueDisplay.click();
		Thread.sleep(1000);
		queueType1.click();
		Thread.sleep(1000);
		pharmacyQueue.click();
		Thread.sleep(1000);
		queueName1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + QueueName + "']")).click();
		Thread.sleep(1000);
		okButton1.click();
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(700);

	}

	public void tokenSend(String Name, String mobile, String Token, String MRNo)
			throws InterruptedException, AWTException, IOException {

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
		Thread.sleep(1000);
		userid.sendKeys("admin");
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site1.click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();

		Thread.sleep(3000);
		menuToggle.click();
		Thread.sleep(1000);
		pharmacyPanel.click();
		Thread.sleep(1000);
		opPanel.click();
		Thread.sleep(1000);
		locationId.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + PharmacyLocation + "']")).click();
		Thread.sleep(1000);
		callerId.click();
		Thread.sleep(1000);
		pharmacy.click();
		Thread.sleep(1000);
		ok.click();
		Thread.sleep(1000);
		outsider.click();
		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
		String lastName = RandomString.lastName();

		System.out.println(lastName + "LastName");

		Thread.sleep(600);
		name.sendKeys(Name + " " + lastName);
		Thread.sleep(1000);
		genderid.click();
		Thread.sleep(1000);
		male.click();
		Thread.sleep(1000);
		age.sendKeys("35");
		Thread.sleep(1000);
		phoneNumber.sendKeys(mobile);
		Thread.sleep(1000);
		tokenNumber.sendKeys(Token + lastName);
		Thread.sleep(1000);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", medicinename);
		medicinename.sendKeys("ALTHROCIN 250MG TAB");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='ALTHROCIN 250MG TAB']")).click();
		Thread.sleep(1000);
		quantity.sendKeys("3");
		Thread.sleep(1000);
		medicineAdd.click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='pat-mrno']")));
		Thread.sleep(3000);

		String mrno = driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		Thread.sleep(3000);
		succesfullyOk.click();
		Thread.sleep(1000);
		status.click();
		Thread.sleep(1000);
		confirmedStatus.click();
		Thread.sleep(1000);
		search.sendKeys(Name + " " + lastName, Keys.ENTER);
		Thread.sleep(1000);
		sendToken.click();
		Thread.sleep(1000);
		select.click();
		Thread.sleep(1000);
		checkmark.click();
		Thread.sleep(1000);
		stockReservation.click();
		Thread.sleep(1000);
		succesfullyOk.click();
		Thread.sleep(1000);
		status.click();
		Thread.sleep(1000);
		stockReservationStatus.click();
		Thread.sleep(1000);
		search.clear();
		Thread.sleep(1000);
		search.sendKeys(Name + " " + lastName, Keys.ENTER);
		Thread.sleep(1000);
		sendToken.click();
		Thread.sleep(1000);
		select.click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
		billHold.click();
		Thread.sleep(1000);
		succesfullyOk.click();
		Thread.sleep(1000);
		status.click();
		Thread.sleep(1000);
		billHoldStatus.click();
		Thread.sleep(1000);
		search.clear();
		Thread.sleep(1000);
		search.sendKeys(Name + " " + lastName, Keys.ENTER);
		Thread.sleep(1000);
		sendToken.click();
		Thread.sleep(1000);
		select.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);
		succesfullyOk.click();
		Thread.sleep(1000);
		Dispensing.click();
		Thread.sleep(1000);
		search.clear();
		Thread.sleep(1000);
		search.sendKeys(Name + " " + lastName, Keys.ENTER);
		Thread.sleep(1000);
		sendToken.click();
		Thread.sleep(1000);
		select.click();
		Thread.sleep(1000);

	}

	public void Pharmacy_Kiosk(String QueueName) throws InterruptedException, AWTException {

		Thread.sleep(1000);
		toggle.click();
		Thread.sleep(1000);
//		  down.click();
//		  Thread.sleep(1000);
		kioskReporting.click();
		Thread.sleep(1000);
		executionlocid.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + PharmacyLocation + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active mb-1']")).click();
		Thread.sleep(1000);
		GenerateToken.click();
		Thread.sleep(1000);

		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);

		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(700);
		
		try {
	        Runtime.getRuntime().exec("C:\\AutoIT\\ClosePrintDialog.exe");
	    } catch (Exception e) {
	        e.printStackTrace();
	        
	        System.out.println(e);
	    }
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(3000);
		/////////////////////////

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

		userid.click();
		Thread.sleep(1000);
		userid.sendKeys("admin");
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site1.click();
		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//li[normalize-space()='" + Site + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();

//			Thread.sleep(1000);
//			Hamberger.click();
//			Thread.sleep(600);
//			FO.click();
//			Thread.sleep(600);
//			List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//			if(dynamicElement1.size() !=0)
//			{
//				driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//			}
//
//
//			else {
//				System.out.println("sri");
//			}
//			Thread.sleep(600);
//
//			Registration.click();
//
//			Thread.sleep(1000);
//			List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
//
//			if(dynamicElement.size() !=0)
//			{
//				driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//			}
//
//
//			else {
//				System.out.println("sri");
//			}
//
		Thread.sleep(1500);

//		
//		
//		Point location =	driver.findElement(By.xpath("//div[@class='brand-logo-center']//img")).getLocation();
//		Thread.sleep(1000);
//
//
//
//int x = location.getX();
//int y = location.getY();
//
//System.out.println("X: " + x + ", Y: " + y);
//		
//act.moveByOffset(x, y).click().perform();
//
//act.moveByOffset(x, y).contextClick().perform();

		Thread.sleep(3000);
		token.click();
		Thread.sleep(1000);
		servicetypeid.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Pharmacy']")).click();
		Thread.sleep(1000);
		locationid.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + PharmacyLocation + "']")).click();
		Thread.sleep(1000);
		callername.click();
		Thread.sleep(1000);
		walkin.click();
		Thread.sleep(1000);
		serviceCounterId.click();
		Thread.sleep(1000);
		walkin.click();
		Thread.sleep(1000);
		okbutton.click();
		Thread.sleep(1000);
//		callNextToken.click();
		Thread.sleep(1000);
		/////////////////////////
//		//Robot t = new Robot();
//		t.keyPress(KeyEvent.VK_CONTROL);
//		t.keyPress(KeyEvent.VK_SHIFT);
//		t.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(500);
//		t.keyRelease(KeyEvent.VK_CONTROL);
//		t.keyRelease(KeyEvent.VK_SHIFT);
//		t.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(700);

		ArrayList<String> current_tabs = new ArrayList<String>(driver.getWindowHandles());
		int Y = driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("window handles no." + Y);
		int Z = Y - 3;
		int X = Y - 1;
		Thread.sleep(1000);
		System.out.println("go to window no." + Z);
		Thread.sleep(2000);
		driver.switchTo().window(current_tabs.get(Z));
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(3000);

	//	Robot t = new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		menuToggle.click();
		Thread.sleep(1000);
		mastersModule.click();
		Thread.sleep(1000);
		foTab.click();
		Thread.sleep(1000);
		queueMaster.click();
		Thread.sleep(1000);
		queuetypeid.click();
		Thread.sleep(1000);
		pharmacyQueue.click();
		Thread.sleep(1000);
		Search.sendKeys(QueueName, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='"+QueueName+"']")).click();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		confirmation.click();
		Thread.sleep(1000);

	}

}