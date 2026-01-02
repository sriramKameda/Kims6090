package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
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

public class KIMS_Pharmacybill_Availedservice_Yasasiiweb  extends PageFactoryInitYasasiiWeb{
	public KIMS_Pharmacybill_Availedservice_Yasasiiweb(WebDriver driver) {
		super(driver);
	} 

	@FindBy(xpath = "//input[@id='medicinename']")
	public WebElement ItemName;

	@FindBy(xpath = "//input[@id='qtynew']")
	public WebElement Qty;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement itemadd;

	@FindBy(xpath = "(//i[@title='Medicine Information'])[2]")
	public WebElement medicineInformation1;


	@FindBy(xpath = "(//i[@title='Medicine Information'])[3]")
	public WebElement medicineInformation2;

	@FindBy(xpath = "(//i[@title='Stock Information'])[2]")
	public WebElement Stockinformation;

	@FindBy(xpath = "//button[@id='confirmsave']")
	public WebElement Confirm;

	@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
	public WebElement Status;

	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement medicineCheck;

	@FindBy(xpath = "(//i[@class='fa fa-ellipsis-v'])[1]")
	public WebElement threeDot;

	@FindBy(xpath = "(//div[contains(text(),'Pharmacist Remark')])[1]")
	public WebElement PharmistRemarks;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement labelremark;

	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement stockSave;

	@FindBy(xpath = "//li[normalize-space()='Stock Reservation']")
	public WebElement StockReservation;

	@FindBy(xpath = "//div[normalize-space()='Dispensing']")
	public WebElement Dispensing;

	@FindBy(xpath = "//label[@class='check-wrapper ng-star-inserted']//span[@class='checkmark']")
	public WebElement DispenseCheck;

	@FindBy(xpath = "//i[@class='fa pointer fa-chevron-right ng-star-inserted']")
	public WebElement RightArrow;

	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement Dispensed;

	@FindBy(xpath = "//button[@type='button']//i[@class='ki ki-reset']")
	public WebElement Clear;

	@FindBy(xpath = "//div[@class='billing-card ng-star-inserted']//i[@title='Order Information']")
	public WebElement orderInformation;

	@FindBy(xpath = "//span[normalize-space()='Admin View']")
	public WebElement AdminView;


	@FindBy(xpath = "//div[@class='billing-card ng-star-inserted']//i[@title='Stock Information']")
	public WebElement StockInformation;

	@FindBy(xpath = "//div[normalize-space()='Pharmacist Remark']")
	public WebElement PharmasistRemark;

	@FindBy(xpath = "//textarea[@id='note']")
	public WebElement InterventionRemark;

	@FindBy(xpath = "//i[@title='Prescription Print']")
	public WebElement print;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EMRsave1;


	@FindBy(xpath = "//i[@title='Walk-In']")
	public WebElement walkin;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement walkinSearch;

	@FindBy(xpath = "//div[normalize-space()='OP Orders']")
	public WebElement OPOrder;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement OPprovider;

	@FindBy(xpath = "//ki-checkbox-control[@class='ng-untouched ng-dirty ng-valid']//span[@class='checkmark']")
	public WebElement AdditiveUncheck;

	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement counterSearch;

	@FindBy(xpath = "//div[@class='plt-prt-5 col-md-8']//i[@class='ki ki-search']")
	public WebElement counterSearchicon;


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement toggle;

	@FindBy(xpath = "//div[contains(text(),'Pharmacy Panel')]")
	public WebElement Pharmacypanel;

	@FindBy(xpath = "//div[normalize-space()='OP Panel']")
	public WebElement opPanel;

	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement pharloc;


	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")
	public WebElement pharlocOK;


	@FindBy(xpath = "//input[@id='inputcontrol_awb3NnyGtWL']")
	public WebElement medicineqnty;

	@FindBy(xpath = "//i[@title='Documents']")
	public WebElement Document;

	@FindBy(xpath = "//i[@title='Availed Services']")
	public WebElement availedService;

	@FindBy(xpath = "//td[@class='icon-info ng-star-inserted']//span[@class='table-action-icons']//label[@title='Request for Cancellation']//span//i[@class='ki ki-file-cancel bydefault']")
	public WebElement cancelRequest;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[2]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Authoriser;


	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks;


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM']")
	public WebElement RCM;

	@FindBy(xpath = "//div[normalize-space()='Approve Request']")
	public WebElement ApproveRequest;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement CHECK;

	@FindBy(xpath = "//span[normalize-space()='Advance Approval']")
	public WebElement AdvanceApproval;

	@FindBy(xpath = "//div[@class='row advance-approve ng-star-inserted']//th[@class='amount'][normalize-space()='Net Amount']")
	public WebElement Element;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement AmountEdit;

	@FindBy(xpath = "//input[@id='approvalamount0']")
	public WebElement Amount1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement remark1;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement APPROVE;

	@FindBy(xpath = "//td[@class='icon-info']//i[@title='Request Approved']")
	public WebElement reqAPPROVE;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement reqSave;

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath="//div[text()='Cancellation/Refund']")
	public WebElement cancelrefund;

	@FindBy(xpath="//i[@class='ki ki-medical-kit']")
	public WebElement encounter;

	@FindBy(xpath="//ki-select-control[@formcontrolname='serviceid']//input[@id='undefined']")
	public WebElement ServiceNAme;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterMRNo;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchButton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement patientSearch;

	@FindBy(xpath = "//input[@id='status']")
	public WebElement Status1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MrnoSearch;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[9]/label[1]/button[1]")
	public WebElement SearchIcon1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/i[1]")
	public WebElement CancelReq;



	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement firstcheckbox;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement SaVe;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement  yes;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/span[1]/i[1]")
	public WebElement RemarksIcon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement  checkbox;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement RemarksIcon1;


	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks1;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement  checkbox1;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement RemarksIcon2;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement excloc;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-availed-services[1]/div[2]/form[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement billno;

	@FindBy(xpath = "//div[@class='form-container modal-view p0 ng-star-inserted']//i[@class='ki ki-search text-white']")
	public WebElement search;


	@FindBy(xpath = "//span[normalize-space()='Document Viewer']")
	public WebElement Docview;

	@FindBy(xpath = "//span[normalize-space()='Scanning/Attachment']")
	public WebElement ScanandAttach;

	@FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
	public WebElement Eye;

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement Delete;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement Fo;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchPAt;

	@FindBy(xpath = "//i[@class='ki ki-cash-transfer-fill']")
	public WebElement AvailedService;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Checkbox;

	@FindBy(xpath = "//i[@title='Request for Advance Refund']")
	public WebElement request;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement auth;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark;

	@FindBy(xpath = "//i[@class='ki ki-file-cancel ng-star-inserted']")
	public WebElement cancel;

	@FindBy(xpath = "//div[@class='form-group min-clear-bottom billing ki-dropdown']//input[@id='undefined']")
	public WebElement droplist;

	@FindBy(xpath = "(//i[@class='ki ki-ellipsis-v'])[1]")
	public WebElement bar;

	@FindBy(xpath = "(//div[@class='v-action-bar'])[1]")
	public WebElement barspace;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/ki-document-viewer[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ngx-extended-pdf-viewer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/pdf-toolbar[1]/div[1]/div[1]/div[1]/pdf-zoom-toolbar[1]/div[1]/pdf-zoom-in[1]/button[1]/*[name()='svg'][1]")
	public WebElement zoomin;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/ki-document-viewer[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ngx-extended-pdf-viewer[1]/div[1]/div[1]/div[1]/div[1]/div[2]/pdf-toolbar[1]/div[1]/div[1]/div[1]/pdf-zoom-toolbar[1]/div[1]/pdf-zoom-out[1]/button[1]/*[name()='svg'][1]")
	public WebElement zoomout;

	@FindBy(xpath = "//button[@id='next']//*[name()='svg']")
	public WebElement nextpage;

	@FindBy(xpath = "//i[@class='fa fa-ellipsis-v text-white']")
	public WebElement threedot;

	@FindBy(xpath = "//button[@id='primaryPageRotateCw']//*[name()='svg']")
	public WebElement rotateRight;



	public void walkin(String PROVIDER, String MRNO , String filepath) throws InterruptedException, AWTException {

		toggle.click();
		Thread.sleep(1000);
		Fo.click();
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

		Pharmacypanel.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		opPanel.click();
		Thread.sleep(500);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(500);
		pharloc.click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(1000);
		//	callerID.click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//li[normalize-space()='2nd Level Pharmacy-Caller 1']")).click();
		pharlocOK.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);


		Thread.sleep(1000);
		OPOrder.click();
		Thread.sleep(2000);
		walkin.click();
		Thread.sleep(1000);
		walkinSearch.click();
		Thread.sleep(1000);
		walkinSearch.sendKeys(MRNO, Keys.ENTER);
		Thread.sleep(2000);
		walkinSearch.sendKeys( Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[4]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(1000);
		OPprovider.clear();
		Thread.sleep(1000);
		OPprovider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();  
		Thread.sleep(1000);

		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);
		ItemName.sendKeys("DOLOPAR 650 TAB");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='DOLOPAR 650 TAB']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("5");
		Thread.sleep(1000);
		itemadd.click();
		Thread.sleep(1000);
		ItemName.clear();
		Thread.sleep(1000);
		ItemName.sendKeys("MORPHINE 50MG TAB");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='MORPHINE 50MG TAB']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("5");
		Thread.sleep(1000);
		itemadd.click();
		Thread.sleep(1000);



		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", medicineInformation1);
		Thread.sleep(1000);

		medicineInformation1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		medicineInformation2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		Stockinformation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")).click();
		Thread.sleep(2000);
		Confirm.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		////
//		act.moveToElement(barspace).build().perform();
//		Thread.sleep(1000);
//		js.executeScript("arguments[0].scrollIntoView();", bar);
//		Thread.sleep(1000);
//
//		bar.click();
		Thread.sleep(1000);
		////	
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
		//driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(1000);
		medicineCheck.click();
		Thread.sleep(1000);
		act.moveToElement(threeDot).build().perform();
		Thread.sleep(1000);
		PharmistRemarks.click();
		Thread.sleep(1000);
		labelremark.click();
		Thread.sleep(1000);
		labelremark.sendKeys("pharmacy2");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(3000);
		stockSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

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
		//		medicineqnty.clear();
		//		medicineqnty.sendKeys(Keys.DELETE);
		//		
		//		medicineqnty.sendKeys("3");
		//		
		driver.findElement(By.xpath("//label[normalize-space()='Print']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='billingsave']")).click();
		Thread.sleep(2000);



		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		}

		else {
			System.out.println("sri");

		}
		Thread.sleep(1000);

		Dispensing.click();
		Thread.sleep(1000);
		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(1000);



		////Document upload


		Document.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='filesubcategoryid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctors Order']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Attach']")).click();
		Thread.sleep(1000);
		//File upload by Robot Class


		// copying File path to Clipboard
		String filePath = System.getProperty("user.dir")
                + "\\src\\test\\resources\\uploads\\userCreation_passed140.PNG";
		StringSelection str = new StringSelection(filePath);
		//StringSelection str = new StringSelection("C:\\Users\\sriram\\Pictures\\Screenshots\\prescription.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2500);
		// press Contol+V for pasting
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(500);
		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}

		else {
			System.out.println("sri");

		}
		Thread.sleep(1000);




		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Save']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);
		Docview.click();
		Thread.sleep(2000);
		ScanandAttach.click();
		Thread.sleep(1000);
		Eye.click();
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Close']")));
		Thread.sleep(2000);
		//	rotateRight.click();
		Thread.sleep(1000);
		//	zoomin.click();
		Thread.sleep(1000);
		//	zoomout.click();
		Thread.sleep(1000);

		/* swa for (int i = 0; i <2; i++) {

			nextpage.click();
			Thread.sleep(800);

		}swa*/

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm ml10'][normalize-space()='Close']")).click();
		Thread.sleep(1000);
		threedot.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Thumbnail']")).click();
		Thread.sleep(1000);

		Delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);

		/////AvailedService

		Thread.sleep(1000);
		availedService.click();
		Thread.sleep(1000);
		billno.click();
		Thread.sleep(1000);
		billno.sendKeys("02PHOP");
		Thread.sleep(1000);
		search.click();
		Thread.sleep(2000);



	}


	public void Availed(String User , String Password ,String MRNO) throws InterruptedException {



		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);





		toggle.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
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
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
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
		Thread.sleep(1000);

		Thread.sleep(1000);
		AvailedService.click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement2=driver.findElements(By.xpath("//label[@title='Request for Cancellation']"));

		int k =	dynamicElement2.size();
		System.out.println("size of k="+k);

		int i = k-1;
		System.out.println(i);
		Thread.sleep(3000);




		//WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]/label[2]/i[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"1\"]/div/div/div/div/table/tbody/tr[1]/td[1]/label[3]/ki-checkbox-control/label/label/span")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@title='Request for Cancellation'])[1]")).click();
		// request.click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		Thread.sleep(1000);
		auth.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='"+authoriser+"']")).click();
		Thread.sleep(1000);
		remark.click();
		Thread.sleep(1000);
		remark.sendKeys("Requested");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		droplist.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
		Thread.sleep(2000);

		cancel.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);
		//AdvanceView.click();
		Thread.sleep(2000);
		droplist.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Valid']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//i[@class='ki ki-user-referral']")).click();

		AvailedService.click();
		Thread.sleep(3000);

		//	driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(600);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]/label[2]/i[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"1\"]/div/div/div/div/table/tbody/tr[1]/td[1]/label[3]/ki-checkbox-control/label/label/span")).click();
		// Checkbox.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[@title='Request for Cancellation'])[1]")).click();
		// request.click();
		Thread.sleep(2000);
		auth.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='"+authoriser+"']")).click();
		Thread.sleep(1000);
		remark.click();
		Thread.sleep(1000);
		remark.sendKeys("Requested");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);

	}

	public void AuthorisingRequest(String User , String Password ,String MRNO ) throws InterruptedException, AWTException {


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
		userid.sendKeys(FinalbillUser);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Hamberger.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		RCM.click();
		Thread.sleep(1000);
		ApproveRequest.click();
		Thread.sleep(1000); 

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






		List<WebElement> dynamicElement=driver.findElements(By.xpath("//td[@class='max mr-num']"));

		int z =	dynamicElement.size();
		int a= z/4;

		System.out.println("size="+a);
		Thread.sleep(1000);
		patientSearch.clear();
		Thread.sleep(1000);
		patientSearch.sendKeys(MRNO ,Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();	
		//CHECK.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")).click();	

		Thread.sleep(1000);
		remark1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='undefined']")).sendKeys("approved");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		APPROVE.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();	
		Thread.sleep(1000);

		///////Approve Cancel

		Thread.sleep(1000);
		Status1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon1.click();
		Thread.sleep(1000);
		checkbox1.click();
		Thread.sleep(1000);
		CancelReq.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);




		Thread.sleep(3000);
		Status1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		checkbox1.click();
		Thread.sleep(1000);
		RemarksIcon2.click();
		Thread.sleep(800);
		Remarks1.click();//textarea[@id='undefined']
		Thread.sleep(1000);
		Remarks1.sendKeys("ok");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")).click();
		Thread.sleep(800);
		SaVe.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);

		/////////////////////////////

		Hamberger.click();
		Thread.sleep(1000);
		//FO.click();
		Thread.sleep(1000);
		//RCM.click();
		Thread.sleep(1000);
		cancelrefund.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//span[@class='checkmark']"));
		Thread.sleep(1000);
		int y =	dynamicElement1.size();
		System.out.println("Y="+y);
		int b= y/4;
		System.out.println("b="+ b);
		Thread.sleep(1000);



		Thread.sleep(1000);
		patientSearch.clear();
		Thread.sleep(1000);
		patientSearch.sendKeys(MRNO ,Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		String amount =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")).getText();
		Thread.sleep(1000);

		//converting string into double

		double A = new Double(amount);


		//converting double into int

		int Rupee = (int)Math.round (A) ;
		//int intValue = (int) i;

		//converting int into String

		String Returnamount = String.valueOf(Rupee);



		System.out.println(Returnamount + "=Returnamount");
		Thread.sleep(1000);

		System.out.println("returnAmount"+Returnamount);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='cash']")).sendKeys( Keys.BACK_SPACE);
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='wallet']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='wallet']")).sendKeys( Keys.BACK_SPACE);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='wallet']")).sendKeys(Returnamount);
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='cash']")).sendKeys(Returnamount);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@class='check-container zero-label']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		reqSave.click(); 
		Thread.sleep(1000);
		
		
		excloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Base_Nagercoil_Central']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-footer']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(3000);
//		Robot t =new Robot();
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(500);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(1000);
		
		Thread.sleep(500);
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade blockoutside in show']//label[@class='dialog-title'][normalize-space()='Success']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		

//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//		Thread.sleep(1000);

		/*		Thread.sleep(1000);
		int n =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("CURRENT NO.OF WINDOWS"+ n);
		int m= n-3;
		Thread.sleep(1000);
		System.out.println("go to window no."+ m);
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(m));
		Thread.sleep(3000);



		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		RightArrow.click();
		Thread.sleep(1000);
		Clear.click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		Dispensed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();  */
		Thread.sleep(1000);

	}

}
