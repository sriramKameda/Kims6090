package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
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

public class KIMS_StockReservation_Yasasiiweb extends PageFactoryInitYasasiiWeb{
	public KIMS_StockReservation_Yasasiiweb(WebDriver driver) {
		super(driver);

	} 

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar3']")
	public WebElement Hamburger;

	@FindBy(xpath = "//i[@class='ki ki-inventory']")
	public WebElement Inventory;

	@FindBy(xpath = "//input[@id='sublocationid']")
	public WebElement pharmacyLocation;

	@FindBy(xpath = "//div[normalize-space()='Patient Indent']")
	public WebElement PatientIndent;

	@FindBy(xpath = "//input[@id='mrno']")
	public WebElement MRNO;

	@FindBy(xpath = "//div[@class='form-group filter-search-close ng-star-inserted']//input[@id='mrno']")
	public WebElement MRNO1;

	@FindBy(xpath = "//input[@id='indenttypeid']")
	public WebElement IndentType;

	@FindBy(xpath = "//input[@id='itemname']")
	public WebElement ItemName;

	@FindBy(xpath = "//input[@id='indqty']")
	public WebElement IndentQTY;

	@FindBy(xpath = "//label[contains(text(),'Submit')]")
	public WebElement Submit;

	@FindBy(xpath = "//span[@class='ng-star-inserted']")
	public WebElement IndentUpdate;


	@FindBy(xpath = "//span[@class='checkmark ng-star-inserted']")
	public WebElement verify;

	@FindBy(xpath = "//span[@class='checkmark ng-star-inserted']")
	public WebElement Approve;

	@FindBy(xpath = "//button[@id='btnpostApproved']")
	public WebElement postApproveupdate;

	@FindBy(xpath = "//input[@id='closecomments']")
	public WebElement postApproveComments;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-pharmacy-indent[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/input[1]")
	public WebElement verifyByredQty;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-patient-indent[1]/div[2]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/input[1]")
	public WebElement verifyByredQty1;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='phisslocid']")
	public WebElement isslocation;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Transfer']")
	public WebElement Transfer;

	@FindBy(xpath = "//div[normalize-space()='Stock Transfer']")
	public WebElement StockTransfer;

	@FindBy(xpath = "//input[@id='statusid']")
	public WebElement Status;

	@FindBy(xpath = "//input[@id='searchtxt']")
	public WebElement IndentSearch;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save;
	
	@FindBy(xpath = "//input[@id='text']")
	public WebElement RejectRemarks;
	

	@FindBy(xpath = "//span[normalize-space()='Update']")
	public WebElement Update;

	@FindBy(xpath = "//span[normalize-space()='Indent']")
	public WebElement Indent;

	@FindBy(xpath = "//input[@id='isgeneralindent']")
	public WebElement IndentType1;

	@FindBy(xpath = "//div[@class='plt-prt-5 plt']//input[@id='phreqlocid']")
	public WebElement FromLoc;

	@FindBy(xpath = "//div[@class='col-md-5 plt-prt-5']//input[@id='phisslocid']")
	public WebElement TOLOC;

	@FindBy(xpath = "//div[@class='col-md-12 plt-prt-5']//input[@id='searchtxt']")
	public WebElement indentsEARCH;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='phreqlocid']")
	public WebElement reqLocation;

	@FindBy(xpath = "//div[@class='form-group zero-bottom ki-dropdown']//input[@id='phreqlocid']")
	public WebElement reqLocationsearch;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-inventory-landing/app-transfer/div[2]/div[1]/div/div[2]/div/div/div/tabset/div/tab/table/tbody/tr[1]/td[3]/label/input")
	public WebElement item1;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-inventory-landing/app-transfer/div[2]/div[1]/div/div[2]/div/div/div/tabset/div/tab/table/tbody/tr[2]/td[3]/label/input")
	public WebElement item2;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-inventory-landing/app-transfer/div[2]/div[1]/div/div[2]/div/div/div/tabset/div/tab/table/tbody/tr[3]/td[3]/label/input")
	public WebElement item3;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement sAVE;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement Ok;

	@FindBy(xpath = "//div[@class='col-sm-6 plt-prt-5']//input[@id='searchtxt']")
	public WebElement SearchText;

	@FindBy(xpath = "//span[normalize-space()='Transfer']")
	public WebElement transfer;

	@FindBy(xpath = "//span[@title='Search']//i[@class='ki ki-search']")
	public WebElement SearchICon;

	@FindBy(xpath = "//label[normalize-space()='Submit']//span[@class='checkmark']")
	public WebElement Submittransfer;

	@FindBy(xpath = "//i[@class='ki ki-upload']")
	public WebElement Update1;

	@FindBy(xpath = "//input[@id='statusid']")
	public WebElement transferStatus;

	@FindBy(xpath = "//label[normalize-space()='Submit']//span[@class='checkmark']")
	public WebElement transferSubmit;

	@FindBy(xpath = "//div[contains(text(),'Stock Receive')]")
	public WebElement StockRecieve;

	@FindBy(xpath = "//input[@id='phreqlocid']")
	public WebElement ReqLoc;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement search;

	@FindBy(xpath = "//label[@class='check-container pl-3']//span[@class='checkmark']")
	public WebElement Recieve;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stockreceive[1]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/input[1]")
	public WebElement rejQuantity;

	@FindBy(xpath = "//div[normalize-space()='Receive Rejected Stock']")
	public WebElement recieveRejstock;

	@FindBy(xpath = "//i[@class='ki ki-print']")
	public WebElement Print;

	@FindBy(xpath = "(//i[@title='Verifier Comments'])[1]")
	public WebElement verifierComments;

	@FindBy(xpath = "//textarea[@id='txtverifycomments']")
	public WebElement txtverifycomments;

	@FindBy(xpath = "(//i[@title='Approver Comments'])[1]")
	public WebElement AppComments;

	@FindBy(xpath = "//textarea[@id='txtapprovecomments']")
	public WebElement txtapprovecomments;

	@FindBy(xpath = "(//i[@title='Receive Comments'])[1]")
	public WebElement RXComments;

	@FindBy(xpath = "//textarea[@id='txtacceptrejectcomments']")
	public WebElement acceptrejectcomments;

	@FindBy(xpath = "//tbody/tr[1]/td[11]/label[4]/a[1]/i[1]")
	public WebElement Comments1;

	@FindBy(xpath = "//tbody/tr[2]/td[11]/label[4]/a[1]/i[1]")
	public WebElement Comments2;

	@FindBy(xpath = "//tbody/tr[3]/td[11]/label[4]/a[1]/i[1]")
	public WebElement Comments3;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//tab[@id='1']//i[@class='ki ki-refresh']")
	public WebElement Refresh;

	@FindBy(xpath = "//div[contains(text(),'Stock Consumption')]")
	public WebElement StockConsumption;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stockconsumption[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[2]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ConsumptionQTY;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='General']")
	public WebElement General;
	
	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Consumption']")
	public WebElement Consumption;
	

	@FindBy(xpath = "//input[@placeholder='MRNo']")
	public WebElement MRNoSearch;

	@FindBy(xpath = "//i[@title='Verifier Comments']")
	public WebElement consumptionVerifierComments;

	@FindBy(xpath = "//i[@title='Approver Comments']")
	public WebElement consumptionApproverComments;

	@FindBy(xpath = "//span[@class='checkmark ng-star-inserted']")
	public WebElement Consumptioncancel;

	@FindBy(xpath = "//button[@title='Clear']")
	public WebElement Clear;

	@FindBy(xpath = "//i[@class='ki ki-refresh']")
	public WebElement Refresh1;



    String IndentNO;
	public void InventoryHome() throws AWTException, InterruptedException {

		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(800);
		Inventory.click();
		Thread.sleep(800);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
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
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(800);

	}
	public void PatientIndent(String MRNo) throws InterruptedException, AWTException, IOException {


		Thread.sleep(800);
		//	Hamburger.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='link-value'][normalize-space()='Indent']")).click();
		Thread.sleep(800);
		PatientIndent.click();

		
		Thread.sleep(800);
		MRNO1.click();
		Thread.sleep(800);
		MRNO1.sendKeys( MRNo , Keys.ENTER);
		Thread.sleep(800);
		
		Thread.sleep(800);
		reqLocation.click();//div[@class='form-group ki-dropdown']//input[@id='phreqlocid']
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);


		isslocation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		IndentType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Regular']")).click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.clear();
		Thread.sleep(800);
		ItemName.sendKeys("ZOVIRAX SUSPENSION 100ML" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();	
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("50");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.clear();
		Thread.sleep(800);
		ItemName.sendKeys("ALTHROCIN 250MG TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("30.5");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.clear();	
		Thread.sleep(800);
		ItemName.sendKeys("PANTOCID 40MG INJ" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("30");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);

		Save.click();


		Thread.sleep(2000);
		String IndNo= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();
		System.out.println(IndNo);

		String word[]=IndNo.split("[ :] ");
		System.out.println("number of words: "+word.length);
		for(int i=0;i<word.length;i++)
		{
			System.out.println("word["+i+"]="+word[i]);
		}
		System.out.println(word[1]);

		 IndentNO = word[1];

		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();




		//////Submit

		Thread.sleep(2000);
		Status.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Created']")).click();
		Thread.sleep(800);

		reqLocationsearch.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);


		IndentSearch.clear();
		Thread.sleep(800);
		IndentSearch.sendKeys(IndentNO , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container zero-label mt0']//span[@class='checkmark']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-patient-indent[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/label[1]/a[1]/i[1]")).click();
		Thread.sleep(800);
		IndentQTY.clear();
		Thread.sleep(800);
		IndentQTY.sendKeys("200");
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1200);
		Submit.click();
		Thread.sleep(800);  



		IndentUpdate.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);


		///Verify   

		Thread.sleep(800);
		Status.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Submitted']")).click();
		Thread.sleep(800);
		IndentSearch.clear();
		Thread.sleep(800);
		IndentSearch.sendKeys(IndentNO , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container zero-label mt0']//span[@class='checkmark']")).click();
		Thread.sleep(800);
		verify.click();
		Thread.sleep(2000);
		verifyByredQty1.clear();
		Thread.sleep(800);
		verifyByredQty1.sendKeys("15");
		Thread.sleep(800);

		Update.click();
		Thread.sleep(800); 
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);

		///Approve     

		Thread.sleep(800);
		Status.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Verified']")).click();
		Thread.sleep(800);
		IndentSearch.clear();
		Thread.sleep(800);
		IndentSearch.sendKeys(IndentNO , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container zero-label mt0']//span[@class='checkmark']")).click();
		Thread.sleep(800);
		Approve.click();
		Thread.sleep(800);
		Update.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);  

	}

	public void StockReservation(String MRNo) throws InterruptedException, AWTException {


		Thread.sleep(800);
		Hamburger.click();
		Thread.sleep(800);
		Transfer.click();
		Thread.sleep(800);
		StockTransfer.click();
		Thread.sleep(800);
		Indent.click();
		Thread.sleep(800);
		IndentType1.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Patient Indent']")).click();
		Thread.sleep(800);



//		FromLoc.click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
//		Thread.sleep(800);
		TOLOC.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();


		driver.findElement(By.xpath("//input[@id='indenttypeid']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Regular']")).click();
		Thread.sleep(800);
		
		
		Thread.sleep(800);
		indentsEARCH.click();
		Thread.sleep(800);
		System.out.println(IndentNO);
		indentsEARCH.sendKeys(IndentNO);
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@title='Search with Indent No']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[normalize-space()='"+IndentNO+"']")).click();
		Thread.sleep(1200);

		item1.click();
		Thread.sleep(800);

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(Add));
		Thread.sleep(5000);
		Add.click();
		Thread.sleep(800);


		item2.click();
		Thread.sleep(800);
		wait.until(ExpectedConditions.elementToBeClickable(Add));
		Thread.sleep(5000);
		Add.click();
		Thread.sleep(800);

		item3.click();
		Thread.sleep(800);
		wait.until(ExpectedConditions.elementToBeClickable(Add));
		Thread.sleep(5000);
		Add.click();
		Thread.sleep(800);

		sAVE.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		

		Thread.sleep(2000);
		String StockTransferNo= driver.findElement(By.xpath("/html/body/app-root/ki-dialog/div[2]/div/div/div/div[2]/div[1]")).getText();
		System.out.println(StockTransferNo + "=Stock  transfer no");

		String word[]=StockTransferNo.split("[ -] ");
		System.out.println("number of words: "+ word.length);
		for(int i=0;i<word.length;i++)
		{
			System.out.println("word["+i+"]="+word[i]);
		}

		System.out.println(word[1]);

		//String StockTransferno = word[1];

		Thread.sleep(800);

		Ok.click();
		Thread.sleep(1800);
		transfer.click();
		Thread.sleep(800);
//		SearchText.clear();
//		Thread.sleep(800);
//		SearchText.sendKeys(word[1]);
//		Thread.sleep(800);
//		SearchICon.click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//div[contains(text(),'"+word[1]+"')]")).click();
//		Thread.sleep(800);
//		Submittransfer.click();
//		Thread.sleep(800);
//		Update1.click();
//		Thread.sleep(800);
//		Ok.click();
//		Thread.sleep(800);
//		Refresh.click();
//		Thread.sleep(800);

		//verify
		Thread.sleep(800);
		transferStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Submitted']")).click();
		Thread.sleep(800);
		SearchText.clear();
		Thread.sleep(800);
		SearchText.sendKeys(word[1]);
		Thread.sleep(800);
		SearchICon.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[normalize-space()='"+word[1]+"']")).click();
		Thread.sleep(800);
		verify.click();
		Thread.sleep(800);
		Print.click();
		Thread.sleep(3000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(2000);
		verifierComments.click();
		Thread.sleep(800);
		txtverifycomments.click();
		Thread.sleep(800);
		txtverifycomments.sendKeys("verified by user");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm ng-star-inserted']")).click();


		Update1.click();
		Thread.sleep(800);
		Ok.click();
		Thread.sleep(800);

		/////approve	

		Thread.sleep(800);
		transferStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Verified']")).click();
		Thread.sleep(800);
		SearchText.clear();
		Thread.sleep(800);
		SearchText.sendKeys(word[1]);
		Thread.sleep(800);
		SearchICon.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[normalize-space()='"+word[1]+"']")).click();
		Thread.sleep(800);
		Approve.click();
		Thread.sleep(800);

		AppComments.click();
		Thread.sleep(800);
		txtapprovecomments.click();
		Thread.sleep(800);
		txtapprovecomments.sendKeys("Approved whole qnty");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm ng-star-inserted']")).click();


		Update1.click();
		Thread.sleep(800);
		Ok.click();
		Thread.sleep(800);

		////Stock Recieve

		Thread.sleep(800);
		Hamburger.click();
		Thread.sleep(800);
		StockRecieve.click();
		Thread.sleep(800);
		ReqLoc.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);
		search.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[normalize-space()='"+word[1]+"']")).click();
		Thread.sleep(800);
		Recieve.click();
		Thread.sleep(800);
		rejQuantity.clear();
		Thread.sleep(800);
		rejQuantity.sendKeys("10.5");
		Thread.sleep(800);

		RXComments.click();
		Thread.sleep(800);
		acceptrejectcomments.click();
		Thread.sleep(800);
		acceptrejectcomments.sendKeys("rejected as per the user request");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted'][normalize-space()='OK']")).click();
		Thread.sleep(800);
		Save.click();
		Thread.sleep(800);
	
		Thread.sleep(800);
		RejectRemarks.sendKeys("rejected as per the user request");
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='col-md-12']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1500);
		Ok.click();
		Thread.sleep(800);


		///RejRecieve	

		Thread.sleep(800);
		Hamburger.click();
		Thread.sleep(800);

		recieveRejstock.click();
		Thread.sleep(800);

		//Refresh.clear();
		Thread.sleep(800);
		IndentSearch.clear();
		Thread.sleep(800);
		IndentSearch.sendKeys(word[1]);
		Thread.sleep(800);
		search.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[normalize-space()='"+word[1]+"']")).click();
		Thread.sleep(1000);
		Recieve.click();
		Thread.sleep(800);
		Comments1.click();
		Thread.sleep(800);
		Close.click();
		Thread.sleep(800);
		Comments2.click();
		Thread.sleep(800);
		Close.click();
		Thread.sleep(800);
		Comments3.click();
		Thread.sleep(800);
		Close.click();		
		Thread.sleep(800);
		Save.click();
		Thread.sleep(800);
		Ok.click();
		Thread.sleep(2000);

		////Viewing Recieved

		Thread.sleep(800);
		Hamburger.click();
		Thread.sleep(800);
		StockTransfer.click();
		Thread.sleep(800);

		Thread.sleep(2000);
		transferStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Received']")).click();
		Thread.sleep(800);
		Thread.sleep(800);
		SearchText.clear();
		Thread.sleep(800);
		SearchText.sendKeys(word[1]);
		Thread.sleep(800);
		SearchICon.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[normalize-space()='"+word[1]+"']")).click();
		Thread.sleep(2000);


	}



	public void stockConsumption(String MRNo) throws InterruptedException, AWTException {

		Thread.sleep(800);
		Hamburger.click();
		Thread.sleep(800);
		Consumption.click();
		Thread.sleep(800);
		StockConsumption.click();
		Thread.sleep(800);
	
		pharmacyLocation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(800);
		
		//input[@id='sublocationid']
//		driver.findElement(By.xpath("//div[@class='form-group ki-dropdown']//input[@id='phconslocationid']")).click();
//		Thread.sleep(800);
//		driver.findElement(By.xpath("//li[normalize-space()='North Central pharmacy']")).click();
//		Thread.sleep(800);

		driver.findElement(By.xpath("//label[normalize-space()='Patientwise']")).click();
		Thread.sleep(800);
		
		MRNO.click();
		Thread.sleep(800);
		MRNO.sendKeys(MRNo, Keys.ENTER);

		
		driver.findElement(By.xpath("//div[@class='form-group ki-dropdown']//input[@id='phconslocationid']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);
		
		//item 1	

		Thread.sleep(800);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/label[1]/input[1]")).click();
		Thread.sleep(800);
		String Qty=	driver.findElement(By.xpath("/html/body/app-root/app-layout/main/app-inventory-landing/app-stockconsumption/div[2]/div[1]/div[3]/accordion/accordion-group/div/div[2]/div/div/div/table/tbody/tr[1]/td[6]")).getText();
		Thread.sleep(800);
		System.out.println(Qty);

		//		Thread.sleep(800);
		//		ItemName.click();
		//		Thread.sleep(800);
		//		ItemName.sendKeys("DOLOPAR 650 TAB" , Keys.ENTER);
		//		Thread.sleep(800);
		//		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		//		Thread.sleep(800);
		ConsumptionQTY.clear();
		Thread.sleep(800);
		ConsumptionQTY.sendKeys(Qty);
		Thread.sleep(800);


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",  Add);
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);

		//item 2	
		Thread.sleep(800);
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/label[1]/input[1]")).click();
		Thread.sleep(800);
		String Qty1=	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stockconsumption[1]/div[2]/div[1]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]")).getText();
		Thread.sleep(800);
		System.out.println(Qty1);

		ConsumptionQTY.clear();
		Thread.sleep(800);
		ConsumptionQTY.sendKeys(Qty1);
		Thread.sleep(800);

		js.executeScript("arguments[0].scrollIntoView();",  Add);
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);

		//item 3	

		Thread.sleep(800);
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/label[1]/input[1]")).click();
		Thread.sleep(800);
		String Qty2=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stockconsumption[1]/div[2]/div[1]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[6]")).getText();
		Thread.sleep(800);
		System.out.println(Qty2);

		ConsumptionQTY.clear();
		Thread.sleep(800);
		ConsumptionQTY.sendKeys(Qty2);
		Thread.sleep(800);
		
		js.executeScript("arguments[0].scrollIntoView();",  Add);
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);
		Submittransfer.click();
		Thread.sleep(800);
		Save.click();


		String IndNo= driver.findElement(By.xpath("(//div[@class='dailog-msg'])[2]")).getText();
		System.out.println(IndNo);


		//	
		//		String word[]=IndNo.split("[ ( ] ");
		//		System.out.println("number of words: "+word.length);
		//		for(int i=0;i<word.length;i++)
		//		{
		//			System.out.println("word["+i+"]="+word[i]);
		//		}
		//		System.out.println(word[1]);
		//
		//		String IndentNO = word[1];
		//
		//		
		//		String word1[]=IndentNO.split("[ )] ");
		//		System.out.println("number of words: "+word1.length);
		//		for(int i=0;i<word1.length;i++)
		//		{
		//			System.out.println("word["+i+"]="+word[i]);
		//		}
		//		System.out.println(word1[0]);
		//
		//		String COnsumpNo = word[0];
		//
		//		System.out.println("COnsumpNo"+ COnsumpNo);

		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		Ok.click();
		Thread.sleep(800);
		
	
		Status.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Created']")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//div[@class='form-group zero-bottom ki-dropdown']//input[@id='phconslocationid']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);
		
		MRNoSearch.clear();
		Thread.sleep(800);
		MRNoSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stockconsumption[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//label[normalize-space()='Submit']//span[@class='checkmark']")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//span[@class='ng-star-inserted']")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);
		
		

		Status.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Submitted']")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//div[@class='form-group zero-bottom ki-dropdown']//input[@id='phconslocationid']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);
	

		MRNoSearch.clear();
		Thread.sleep(800);
		MRNoSearch.sendKeys(MRNo, Keys.ENTER);
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stockconsumption[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(800);
		verify.click();
		Thread.sleep(800);
		consumptionVerifierComments.click();
		Thread.sleep(800);
		txtverifycomments.click();
		Thread.sleep(800);
		txtverifycomments.sendKeys("Verified");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted'][normalize-space()='OK']")).click();
		Thread.sleep(800);
		Print.click();
		Robot t=new Robot();
		Thread.sleep(800);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);
		Update1.click();
		Thread.sleep(800);
		Ok.click();
		Thread.sleep(800);
		////////////approver

		Thread.sleep(800);
		Status.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Verified']")).click();
		Thread.sleep(800);

		MRNoSearch.clear();
		Thread.sleep(800);
		MRNoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1200);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stockconsumption[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(800);

		Approve.click();
		Thread.sleep(800);
		consumptionApproverComments.click();
		Thread.sleep(800);
		txtverifycomments.click();
		Thread.sleep(800);
		txtverifycomments.sendKeys("Verifier");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted'][normalize-space()='OK']")).click();
		Thread.sleep(800);
		Update1.click();
		Thread.sleep(800);
		Ok.click();
		Thread.sleep(800);

		///cancel

		Thread.sleep(800);
		Status.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(800);

		MRNoSearch.clear();
		Thread.sleep(800);
		MRNoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1200);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stockconsumption[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(800);
		Consumptioncancel.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//tbody/tr[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//tbody/tr[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
		Thread.sleep(800);
		
		
		Print.click();
		Thread.sleep(2000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(2000);
		Update1.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		Ok.click();
		Thread.sleep(800);


		////viewing cancelled	

		Thread.sleep(800);
		Status.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Cancelled']")).click();
		Thread.sleep(800);
		MRNoSearch.clear();
		Thread.sleep(800);
		MRNoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stockconsumption[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(800);

		Clear.click();
		Thread.sleep(800);
		Refresh1.click();
		Thread.sleep(2000);

	}


}
