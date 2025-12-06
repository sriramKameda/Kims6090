package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
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

public class KIMS_Inventory_yasasiiweb extends PageFactoryInitYasasiiWeb{
	public KIMS_Inventory_yasasiiweb(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar3']")
	public WebElement Hamburger;

	@FindBy(xpath = "//i[@class='ki ki-inventory']")
	public WebElement Inventory;

	@FindBy(xpath = "//input[@id='sublocationid']")
	public WebElement Pharmacylocation;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='General']")
	public WebElement General;

	@FindBy(xpath = "//div[normalize-space()='Supplier']")
	public WebElement supplier;

	@FindBy(xpath = "//input[@id='suppliername']")
	public WebElement suppliername;

	@FindBy(xpath = "//input[@id='referencecode']")
	public WebElement ReferenceCode;

	@FindBy(xpath = "//button[@id='btnsaveSupplier']")
	public WebElement SupplierSave;

	@FindBy(xpath = "//input[@placeholder='Supplier Name']")
	public WebElement SearchSupplier;

	@FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
	public WebElement SupplierEdit;

	@FindBy(xpath = "//input[@id='phoneno']")
	public WebElement SupplierMblNo;

	@FindBy(xpath = "//input[@id='websiteurl']")
	public WebElement Website;

	@FindBy(xpath = "//input[@id='emailaddress']")
	public WebElement Email;

	@FindBy(xpath = "//input[@id='contactpersonsname']")
	public WebElement ContactPerson;

	@FindBy(xpath = "//button[@title='Update']")
	public WebElement SupplierUpdate;

	@FindBy(xpath = "//button[@title='Clear']")
	public WebElement Clear;

	@FindBy(xpath = "//i[@class='ki ki-print']")
	public WebElement Print;

	@FindBy(xpath = "//i[@class='ki ki-refresh']")
	public WebElement Refresh;

	@FindBy(xpath = "//label[normalize-space()='Valid']//span[@class='checkmark']")
	public WebElement valid;

	@FindBy(xpath = "//div[normalize-space()='Sublocation Creation']")
	public WebElement SublocationCreation;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement SublocationName;

	@FindBy(xpath = "//input[@id='referencecode']")
	public WebElement sublocReferenceCode;


	@FindBy(xpath = "//input[@id='reqvaliditydays']")
	public WebElement requestValidity;

	@FindBy(xpath = "//button[@id='btnSublocation']")
	public WebElement LocSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//input[@placeholder='Sublocation']")
	public WebElement searchlocation;

	@FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right text-white']")
	public WebElement SublocationEdit;

	@FindBy(xpath = "//input[@id='itemname']")
	public WebElement ItemName;

	@FindBy(xpath = "//input[@id='minqty']")
	public WebElement MINqty;

	@FindBy(xpath = "//input[@id='maxqty']")
	public WebElement Maxqty;

	@FindBy(xpath = "//input[@id='rol']")
	public WebElement Rol;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//i[@title='Edit']")
	public WebElement Edit;

	@FindBy(xpath = "//i[@class='ki ki-upload']")
	public WebElement Upload;



	@FindBy(xpath = "//i[@title='Delete']")
	public WebElement Delete;

	@FindBy(xpath = "//button[@id='btnPrint']")
	public WebElement print;

	@FindBy(xpath = "//span[normalize-space()='Update']")
	public WebElement Update;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Indent']")
	public WebElement Indent;

	@FindBy(xpath = "//div[normalize-space()='Inventory Indent']")
	public WebElement InventoryIndent;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='phisslocid']")
	public WebElement reqlocation;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save;

	@FindBy(xpath = "//input[@id='statusid']")
	public WebElement indStatus;

	@FindBy(xpath = "//input[@id='searchtxt']")
	public WebElement IndentSearch;

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

	@FindBy(xpath = "//div[normalize-space()='Patient Indent']")
	public WebElement PatientIndent;

	@FindBy(xpath = "//div[@class='form-group filter-search-close ng-star-inserted']//input[@id='mrno']")
	public WebElement MRNO;

	@FindBy(xpath = "//input[@id='indenttypeid']")
	public WebElement IndentType;

	@FindBy(xpath = "//div[normalize-space()='Close Indent']")
	public WebElement closeindent;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement Search;

	@FindBy(xpath = "//button[@id='btnCloseIndent']")
	public WebElement CloseIndent;

	@FindBy(xpath = "//div[normalize-space()='Indent Group']")
	public WebElement IndentGroup;

	@FindBy(xpath = "//input[@id='indgroupname']")
	public WebElement IndentGroupName;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='phreqlocid']")
	public WebElement ReqLOc;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='phisslocid']")
	public WebElement IssuingLoc;

	@FindBy(xpath = "//input[@id='itemtypeid']")
	public WebElement ItemType;

	@FindBy(xpath = "//input[@id='qty']")
	public WebElement QTY;

	@FindBy(xpath = "//i[@class='fa fa-paint-brush']")
	public WebElement Brush;

	@FindBy(xpath = "//input[@placeholder='Indent Group Name']")
	public WebElement IndgrpSearch;

	@FindBy(xpath = "//button[@id='btnIndentGroup']")
	public WebElement IndgrpUpdate;

	@FindBy(xpath = "//input[@placeholder='Item Name']")
	public WebElement IndgrpItemSearch;

	@FindBy(xpath = "//button[normalize-space()='Change']")
	public WebElement Pencil;
	
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Pencil1;
	

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement trash;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Transfer']")
	public WebElement Transfer;


	@FindBy(xpath = "//div[normalize-space()='Stock Transfer']")
	public WebElement StockTransfer;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Stock']")
	public WebElement Stock;
	
	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='GRN']")
	public WebElement GRN1;
	
	

	@FindBy(xpath = "//div[contains(text(),'Goods Received Note')]")
	public WebElement GRN;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement AddStock;

	@FindBy(xpath = "//input[@id='supplierid']")
	public WebElement Supplier;

	@FindBy(xpath = "//input[@id='grn']")
	public WebElement GRNno;


	@FindBy(xpath = "//input[@id='batchno']")
	public WebElement batchNo;

	@FindBy(xpath = "//input[@id='altqty']")
	public WebElement GRNQTY;

	@FindBy(xpath = "//ki-calendar[@id='expirydate']//input[@type='text']")
	public WebElement ExpiryDate;


	@FindBy(xpath = "//input[@id='unitcostprice']")
	public WebElement unitcost;


	@FindBy(xpath = "//input[@id='unitsellingprice']")
	public WebElement UnitSell;

	@FindBy(xpath = "//div[@class='card grn']//button[1]//i[1]")
	public WebElement AddContinue;

	@FindBy(xpath = "//i[@class='fa fa-angle-double-down']")
	public WebElement ADDCollapse;

	@FindBy(xpath = "//input[@placeholder='GRN Number']")
	public WebElement GRNnoSearch;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement OK;

	@FindBy(xpath = "//input[@id='draftOrStockEntry']")
	public WebElement DraftEntry;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement Yes;

	@FindBy(xpath = "//div[normalize-space()='Stock Update']")
	public WebElement StockUpdate;

	@FindBy(xpath = "//input[@id='unitinputtax1percentage']")
	public WebElement Vat;

	@FindBy(xpath = "//label[normalize-space()='Consolidated']")
	public WebElement Consolidated;

	@FindBy(xpath = "//input[@id='displaymode-1']")
	public WebElement Detailed;

	@FindBy(xpath = "//div[normalize-space()='Stock View']")
	public WebElement StockView;

	@FindBy(xpath = "//i[@class='ki ki-reset']")
	public WebElement CLear;

	@FindBy(xpath = "//label[normalize-space()='Detailed']")
	public WebElement Detailedview;

	@FindBy(xpath = "//input[@id='filtermode-1']")
	public WebElement EXpired;

	@FindBy(xpath = "//input[@id='filtermode-2']")
	public WebElement ExpiredIn; 

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stock-view[1]/div[1]/form[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Days;

	@FindBy(xpath = "//div[normalize-space()='Stock Movement']")
	public WebElement StockMovement;

	@FindBy(xpath = "//div[contains(text(),'Inventory Home')]")
	public WebElement InventoryHome;

	@FindBy(xpath = "/html/body/app-root/app-layout/main/app-inventory-landing/app-inentory-home/div/div/div/div/div[3]/div/form/div/div[3]/ki-calender-time-range/div/input")
	public WebElement IndentDateRange;

	@FindBy(xpath = "//span[normalize-space()='Today']")
	public WebElement Today;

	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//div[1]//button[1]")
	public WebElement TransferStatusinfo; 

	@FindBy(xpath = "//div[3]//div[1]//form[1]//div[1]//div[4]//button[1]//i[1]")
	public WebElement IndentRefresh;

	@FindBy(xpath = "//span[normalize-space()='Today']")
	public WebElement TransferStatusRefresh;

	@FindBy(xpath = "//i[@class='ki ki-map-pin-fill']")
	public WebElement LocationIcon;

	@FindBy(xpath = "//ki-calendar[@id='manufacturingdate']//input[@type='text']")
	public WebElement ManfacturingDate;



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


		Pharmacylocation.click();
		Thread.sleep(800);
		//driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(800);

		InventoryHome.click();
		Thread.sleep(800);
		IndentDateRange.click();
		Thread.sleep(800);
		Today.click();
		Thread.sleep(800);
		IndentRefresh.click();
		Thread.sleep(3000);
		

		LocationIcon.click();

		Thread.sleep(800);
		Pharmacylocation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(800);

		LocationIcon.click();

		Thread.sleep(800);
		Pharmacylocation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);

	}

	public void supplier(String Supplier) throws InterruptedException, AWTException {


		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(800);
		General.click();
		Thread.sleep(800);
		supplier.click();
		Thread.sleep(800);
		suppliername.click();
		Thread.sleep(800);
		suppliername.sendKeys(Supplier);
		Thread.sleep(800);
		ReferenceCode.click();
		Thread.sleep(800);
		ReferenceCode.sendKeys("KMC300");
		Thread.sleep(800);
		SupplierSave.click();
		Thread.sleep(2000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


		Thread.sleep(800);
		SearchSupplier.click();
		Thread.sleep(800);
		SearchSupplier.sendKeys(Supplier , Keys.ENTER);
		Thread.sleep(800);
		SupplierEdit.click();
		Thread.sleep(1200);
		SupplierMblNo.clear();
		Thread.sleep(800);
		SupplierMblNo.sendKeys("0987678098");
		Thread.sleep(800);
		Website.clear();
		Thread.sleep(800);
		Website.sendKeys("https://www.tutorialspoint.com/");
		Thread.sleep(800);
		Email.clear();
		Thread.sleep(800);
		Email.sendKeys("KMCMed@gmail.com");
		Thread.sleep(800);
		ContactPerson.clear();
		Thread.sleep(800);
		ContactPerson.sendKeys("KAmeda");
		Thread.sleep(800);
		SupplierUpdate.click();
		Thread.sleep(2000);


		Print.click();
		Thread.sleep(3000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);

		Refresh.click();
		Thread.sleep(2000);
		SupplierEdit.click();
		Thread.sleep(800);
		valid.click();
		Thread.sleep(800);
		valid.click();
		Thread.sleep(800);


		Clear.click();
		Thread.sleep(2000);



	}

	public void sublocation(String Sublocation) throws InterruptedException, AWTException {

		Thread.sleep(800);
		Hamburger.click();
		Thread.sleep(800);
		SublocationCreation.click();
		Thread.sleep(800);
		SublocationName.clear();
		Thread.sleep(800);
		SublocationName.sendKeys(Sublocation);
		Thread.sleep(800);
		sublocReferenceCode.sendKeys("5661");
		Thread.sleep(800);
		requestValidity.click();
		Thread.sleep(800);
		requestValidity.sendKeys("2");
		Thread.sleep(800);
		LocSave.click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);


		clear.click();
		Thread.sleep(800);
		searchlocation.click();
		Thread.sleep(800);
		searchlocation.sendKeys(PharmacyLocation , Keys.ENTER);
		Thread.sleep(800);

		SublocationEdit.click();
		Thread.sleep(800);

		//delete med 1	

		List<WebElement> dynamicElement=driver.findElements(By.xpath("(//i[@title='Delete'])"));
		
	    int size = dynamicElement.size();
		
		if(dynamicElement.size() !=0)
		{
		
	    for (int i = 1; i < size; i++) {
		
		   
		    driver.findElement(By.xpath("(//i[@title='Delete'])[1]")).click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			Thread.sleep(800);
		   
		   
	}
	   
		}
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//tbody/tr[1]/td[1]/label[2]/a[1]/i[1]")).click();
//			Thread.sleep(800);
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//			Thread.sleep(800);
//			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//			Thread.sleep(800);
//		}
//
//		else {
//
//			System.out.println("sri");
//		}
//
//
//
//		//delete med 2
//
//
//		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//tbody/tr[2]/td[1]/label[2]/a[1]/i[1]"));
//
//		if(dynamicElement1.size() !=0)
//		{
//
//			driver.findElement(By.xpath("//tbody/tr[2]/td[1]/label[2]/a[1]/i[1]")).click();
//			Thread.sleep(800);
//			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//			Thread.sleep(800);
//			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//			Thread.sleep(800);
//
//		}
//
//		else {
//
//			System.out.println("sri");
//		}




		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("DOLOPAR 650 TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		MINqty.click();
		Thread.sleep(800);
		MINqty.sendKeys("2");
		Thread.sleep(800);
		Maxqty.click();
		Thread.sleep(800);
		Maxqty.sendKeys("1500");
		Thread.sleep(800);
		Rol.click();
		Thread.sleep(800);
		Rol.sendKeys("2");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);
		Edit.click();
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);
//		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//		Thread.sleep(800);
		
		Delete.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);


		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("WAXONIL O KID EAR DROPS" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		MINqty.click();
		Thread.sleep(800);
		MINqty.sendKeys("2");
		Thread.sleep(800);
		Maxqty.click();
		Thread.sleep(800);
		Maxqty.sendKeys("1500");
		Thread.sleep(800);
		Rol.click();
		Thread.sleep(800);
		Rol.sendKeys("2");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(2500);



		Print.click();
		Thread.sleep(3000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(2000);
		Update.click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-refresh']")).click();





	}

	public void  inventoryIndednt() throws InterruptedException, AWTException {

		Thread.sleep(800);
		Hamburger.click();
		Thread.sleep(800);
		Indent.click();
		Thread.sleep(800);
		InventoryIndent.click();
		Thread.sleep(800);

		reqlocation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();	
		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("WAXONIL O KID EAR DROPS" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("30");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("DOLOPAR 650 TAB" , Keys.ENTER);	
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("30");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("MIRAGO 25MG TAB" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("30");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);

		Save.click();


//		Thread.sleep(2000);
//		String IndNo= driver.findElement(By.xpath("/html/body/app-root/ki-dialog/div[2]/div/div/div/div[2]/div[1]")).getText();
//		System.out.println(IndNo);
//
//		String word[]=IndNo.split("[ :] ");
//		System.out.println("number of words: "+word.length);
//		for(int i=0;i<word.length;i++)
//		{
//			System.out.println("word["+i+"]="+word[i]);
//		}
//		System.out.println(word[1]);
//		System.out.println(word[0]);
//
//		String IndentNO = word[1];

	
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

		//////Submit

		Thread.sleep(800);
		indStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Created']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/main/app-inventory-landing/app-pharmacy-indent/div[1]/lib-pharmacyindentsearch/div/div[3]/form/div[2]/div/ki-calender-time-range/div/input")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@title='Search with Indent No']")).click();
		Thread.sleep(800);
		
		
		String IndentNO= driver.findElement(By.xpath("(//div[@title='Indent No'])[1]")).getText();
		System.out.println(IndentNO);
		
		IndentSearch.clear();
		Thread.sleep(800);
		IndentSearch.sendKeys(IndentNO , Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='check-container zero-label mt0']//span[@class='checkmark']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-pharmacy-indent[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/label[1]/a[1]/i[1]")).click();
		Thread.sleep(800);
		IndentQTY.clear();
		Thread.sleep(800);
		IndentQTY.sendKeys("200");
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(800);
		Submit.click();
		Thread.sleep(800);  
		IndentUpdate.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);

		///Verify   

		Thread.sleep(800);
		indStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Submitted']")).click();
		Thread.sleep(800);
		IndentSearch.clear();
		Thread.sleep(800);
		IndentSearch.sendKeys(IndentNO , Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='check-container zero-label mt0']//span[@class='checkmark']")).click();
		Thread.sleep(800);

		verify.click();
		Thread.sleep(800);

		//		act.moveToElement(verifyByredQty).doubleClick().build().perform();
		//		Thread.sleep(800);
		//		Thread.sleep(3000);
		//		Robot t=new Robot();
		//		t.keyPress(KeyEvent.VK_BACK_SPACE);
		//		t.keyRelease(KeyEvent.VK_BACK_SPACE);
		//		Thread.sleep(400);
		//		t.keyPress(KeyEvent.VK_ESCAPE);
		//		t.keyRelease(KeyEvent.VK_ESCAPE);

		verifyByredQty.clear();
		Thread.sleep(800);
		verifyByredQty.sendKeys("15");
		Thread.sleep(800);

		Update.click();
		Thread.sleep(800); 
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);

		///Approve     

		Thread.sleep(800);
		indStatus.click();
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

		///Completed

		Thread.sleep(800);
		indStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(800);
		Refresh.click();
		Thread.sleep(800);
		IndentSearch.clear();
		Thread.sleep(800);
		IndentSearch.sendKeys(IndentNO , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container zero-label mt0']//span[@class='checkmark']")).click();
		Thread.sleep(800);



		postApproveComments.sendKeys("completed");
		Thread.sleep(800);
		postApproveupdate.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);

		////Clearing 

		Thread.sleep(800);
		indStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Completed']")).click();
		Thread.sleep(800);
		IndentSearch.clear();
		Thread.sleep(800);
		IndentSearch.sendKeys(IndentNO , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container zero-label mt0']//span[@class='checkmark']")).click();
		Thread.sleep(1200);


		Print.click();
		Thread.sleep(3000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


		Thread.sleep(2000);
		Clear.click();
		Thread.sleep(800);

	}


	public void PatientIndent(String MRNo) throws InterruptedException, AWTException, IOException {


		Thread.sleep(800);
		Hamburger.click();
		Thread.sleep(800);
		//	driver.findElement(By.xpath("//div[@class='link-value'][normalize-space()='Indent']")).click();
		Thread.sleep(800);
		PatientIndent.click();
		Thread.sleep(800);
		reqlocation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);

		MRNO.click();
		Thread.sleep(800);
		MRNO.sendKeys( MRNo , Keys.ENTER);
		Thread.sleep(800);
		IndentType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Regular']")).click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("MIRAGO 25MG TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("300");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("DOLOPAR 650 TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("300");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("MORPHINE 50MG TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("300");
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

		String IndentNO = word[1];

		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();


		//close indent

		Thread.sleep(800);
		reqlocation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);

		MRNO.click();
		Thread.sleep(800);
		MRNO.sendKeys( MRNo , Keys.ENTER);
		Thread.sleep(800);
		IndentType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Regular']")).click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("Dolopar 650 Tab" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("300");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("MORPHINE 50MG TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("300");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);	
		
		ItemName.sendKeys("MIRAGO 25MG TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("300");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);

		Save.click();



		Thread.sleep(2000); 
		String closeIndNo= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]" )).getText(); 
		System.out.println(closeIndNo);

		String word1[]=closeIndNo.split("[ :] ");
		System.out.println("number of words: "+word1.length); 
		for(int i=0;i<word.length;i++)
		{
			System.out.println("word["+i+"]="+word1[i]);
		}
		System.out.println(word1[1]);

		String closeIndentNO = word1[1];

		System.out.println("Closed indednt =" + closeIndentNO);

		Thread.sleep(800);


		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(13);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(word1[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);




		//		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\KimsYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\KIMSDataSheet.xls");
		//		FileInputStream fis=new FileInputStream(src);
		//		HSSFWorkbook wb=new HSSFWorkbook(fis); 
		//		HSSFSheet BirthRegistration=wb.getSheetAt(14);
		//		int i=BirthRegistration.getLastRowNum(); 
		//		System.out.println("Number of rows: " + i);
		//		BirthRegistration.getRow(i).createCell(7).setCellValue(closeIndentNO);
		//		FileOutputStream fout=new FileOutputStream(src); wb.write(fout);  
		//		Thread.sleep(2000);  


		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();


		//////Submit

		Thread.sleep(800);
		indStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Created']")).click();
		Thread.sleep(800);
		IndentSearch.clear();
		Thread.sleep(800);
		IndentSearch.sendKeys(IndentNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='check-container zero-label mt0']//span[@class='checkmark']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-patient-indent[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/label[1]/a[1]/i[1]")).click();
		Thread.sleep(800);
		IndentQTY.clear();
		Thread.sleep(800);
		IndentQTY.sendKeys("200");
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(800);
		Submit.click();
		Thread.sleep(800);  
		IndentUpdate.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);

		///Verify   

		Thread.sleep(800);
		indStatus.click();
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
		indStatus.click();
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

		///Completed

		Thread.sleep(800);
		indStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(800);
		Refresh.click();
		Thread.sleep(800);
		IndentSearch.clear();
		Thread.sleep(800);
		IndentSearch.sendKeys(IndentNO , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container zero-label mt0']//span[@class='checkmark']")).click();
		Thread.sleep(800);
		postApproveComments.sendKeys("completed");
		Thread.sleep(800);
		postApproveupdate.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);

		////Clearing 

		Thread.sleep(800);
		indStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Completed']")).click();
		Thread.sleep(800);
		IndentSearch.clear();
		Thread.sleep(800);
		IndentSearch.sendKeys(IndentNO , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container zero-label mt0']//span[@class='checkmark']")).click();
		Thread.sleep(800);

		Print.click();
		Thread.sleep(3000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


		Thread.sleep(800);
		Clear.click();
		Thread.sleep(800);




	}

	public void closeIndent(String closeIndentNO ) throws InterruptedException {


		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(800);	
		//	Indent.click();
		Thread.sleep(800);
		closeindent.click();
		Thread.sleep(800);
		Search.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//span[@class='pr-2'][normalize-space()='"+closeIndentNO+"'])[1]")).click();
		Thread.sleep(800);
		CloseIndent.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
		indStatus.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Closed']")).click();
		Thread.sleep(800);
		Search.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("(//span[@class='pr-2'][normalize-space()='"+closeIndentNO+"'])[1]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-reset']")).click();
		Thread.sleep(800);
		Refresh.click();
		Thread.sleep(2000);


	}


	public void IndentGroup(String IndGroupName) throws InterruptedException, AWTException {


		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(2000);
		IndentGroup.click();
		Thread.sleep(800);
		IndentGroupName.click();
		Thread.sleep(800);
		IndentGroupName.sendKeys(IndGroupName);
		Thread.sleep(800);
		ReqLOc.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);
		IssuingLoc.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+PharmacyLocation+"']")).click();
		Thread.sleep(800);
		ItemType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);

		ItemName.sendKeys("Crocin 650Mg Tab" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		QTY.click();
		Thread.sleep(800);
		QTY.sendKeys("30");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);

		Edit.click();
		Thread.sleep(800);
		Brush.click();
		Thread.sleep(800);
		QTY.click();
		Thread.sleep(800);
		QTY.sendKeys("30");
		Thread.sleep(800);
		SupplierUpdate.click();

		ItemType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(800);
		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("MIRAGO 25MG TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		QTY.click();
		Thread.sleep(800);
		QTY.sendKeys("30");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);

		ItemType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(800);
		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("MORPHINE 50MG TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		QTY.click();
		Thread.sleep(800);
		QTY.sendKeys("30");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(1200);

		Save.click();
		Thread.sleep(2000);

		///edit indednt Grp


		Thread.sleep(800);
		IndgrpSearch.click();
		Thread.sleep(800);
		IndgrpSearch.sendKeys(IndGroupName);
		Thread.sleep(800);
		Search.click();
		Thread.sleep(800);
		SupplierEdit.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-indent-group[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/label[2]/a[1]/i[1]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		IndgrpUpdate.click();
		Thread.sleep(2000);

		IndgrpSearch.clear();
		Thread.sleep(800);
		IndgrpItemSearch.click();
		Thread.sleep(800);	
		IndgrpItemSearch.sendKeys("MIRAGO 25MG TAB");
		Thread.sleep(800);
		Search.click();
		Thread.sleep(2000);
		Pencil1.click();
		Thread.sleep(1500);

		Print.click();
		Thread.sleep(3000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-reset']")).click();
		Thread.sleep(800);
		trash.click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1200);

		IndgrpItemSearch.clear();
		Thread.sleep(1800);
		Refresh.click();
		Thread.sleep(2000);
		
		


	}



	public void StockGRN(String GRNNO , String BatchNo,String DOB) throws InterruptedException, AWTException {




		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(800);
		Thread.sleep(2000);
		GRN1.click();
		Thread.sleep(800);
		GRN.click();
		Thread.sleep(2000);
		AddStock.click();
		Thread.sleep(1800);
		Supplier.click();
		Thread.sleep(1200);
//		GRNno.click();
//		Thread.sleep(1800);
//		Supplier.click();
//		Thread.sleep(800);
//		GRNno.click();
//		Thread.sleep(800);
//		Supplier.click();
//		Thread.sleep(800);
//		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//li[normalize-space()='Mansoor Med pharms']")));

		Thread.sleep(800);
		driver.findElement(By.xpath("//*[@id=\"droplistkey0\"]/li")).click();
		Thread.sleep(800);
		GRNno.click();
		Thread.sleep(800);
		GRNno.sendKeys(GRNNO);
		Thread.sleep(800);

		ItemName.clear();
		Thread.sleep(800);
		ItemName.sendKeys("DOLOPAR 650 TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		batchNo.clear();
		Thread.sleep(800);
		batchNo.sendKeys(BatchNo);
		Thread.sleep(800);
		GRNQTY.clear();
		Thread.sleep(800);
		GRNQTY.sendKeys("99900");
		Thread.sleep(800);

		ManfacturingDate.click();

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);

		ManfacturingDate.sendKeys("01-09-2023");
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

//		ExpiryDate.clear();
//		Thread.sleep(800);
		ExpiryDate.click();
		Thread.sleep(800);

		//Robot t=new Robot();
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(500);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(500);
//
//		ExpiryDate.sendKeys(DOB);
//		Thread.sleep(600);
//		t.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(500);
//		t.keyRelease(KeyEvent.VK_ESCAPE);
//		Thread.sleep(500);
//
//		ExpiryDate.click();
//		Thread.sleep(800);

		for (int i = 0;i<=15; i++) {


			//	Robot t=new Robot();
			t.keyPress(KeyEvent.VK_DOWN);
			t.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(400);

		}
		Thread.sleep(800);
		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(800);
		unitcost.clear();
		Thread.sleep(800);
		unitcost.sendKeys("12");
		Thread.sleep(800);
		UnitSell.clear();
		Thread.sleep(800);
		UnitSell.sendKeys("12");
		Thread.sleep(800);
		AddContinue.click();
		Thread.sleep(800);


		ItemName.clear();
		Thread.sleep(800);
		ItemName.sendKeys("ACCENTRIX 10MG/ML INJ" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		batchNo.clear();
		Thread.sleep(800);
		batchNo.sendKeys(BatchNo);
		Thread.sleep(800);
		GRNQTY.clear();
		Thread.sleep(800);
		GRNQTY.sendKeys("3300");
		Thread.sleep(800);
		ExpiryDate.click();
		Thread.sleep(800);
		for (int i = 0;i<=6; i++) {


			t.keyPress(KeyEvent.VK_DOWN);
			t.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(400);

		}
		Thread.sleep(800);

		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(800);
		unitcost.clear();
		Thread.sleep(800);
		unitcost.sendKeys("12");
		Thread.sleep(800);
		UnitSell.clear();
		Thread.sleep(800);
		UnitSell.sendKeys("12");
		Thread.sleep(800);
		AddContinue.click();
		Thread.sleep(800);


		ItemName.clear();
		Thread.sleep(800);
		ItemName.sendKeys("MORPHINE 50MG TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		batchNo.clear();
		Thread.sleep(800);
		batchNo.sendKeys(BatchNo);
		Thread.sleep(800);
		GRNQTY.clear();
		Thread.sleep(800);
		GRNQTY.sendKeys("3300");
		Thread.sleep(800);
		ExpiryDate.click();
		Thread.sleep(800);
		for (int i = 0;i<=6; i++) {


			t.keyPress(KeyEvent.VK_DOWN);
			t.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(400);

		}
		Thread.sleep(800);

		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(800);
		unitcost.clear();
		Thread.sleep(800);
		unitcost.sendKeys("16");
		Thread.sleep(800);
//		UnitSell.clear();
//		Thread.sleep(800);
//		UnitSell.sendKeys("16");
//		Thread.sleep(800);
		ADDCollapse.click();
		Thread.sleep(1200);

		Save.click();
		Thread.sleep(1200);

		GRNnoSearch.click();
		Thread.sleep(800);
		GRNnoSearch.sendKeys(GRNNO , Keys.ENTER);
		Thread.sleep(800);
		SupplierEdit.click();
		Thread.sleep(800);

		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/label[2]/a[1]/i[1]")).click();
		Thread.sleep(800);
		Yes.click();
		Thread.sleep(2000);
		DraftEntry.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Stock Entry']")).click();
		Thread.sleep(800);

		Print.click();
		Thread.sleep(2000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(1800);
		Upload.click();
		Thread.sleep(3000);

		//OK.click();
		Thread.sleep(800);

		///------------------Duplicate GRN--------------


		Thread.sleep(1500);
		AddStock.click();
		Thread.sleep(800);
		Supplier.click();
		Thread.sleep(800);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[@id=\"droplistkey0\"]/li")).click();
		Thread.sleep(800);
		GRNno.click();
		Thread.sleep(800);
		GRNno.sendKeys(GRNNO);
		Thread.sleep(800);

		ItemName.clear();
		Thread.sleep(800);
		ItemName.sendKeys("MORPHINE 50MG TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		batchNo.clear();
		Thread.sleep(800);
		batchNo.sendKeys("212");
		Thread.sleep(800);
		GRNQTY.clear();
		Thread.sleep(800);
		GRNQTY.sendKeys("3300");
		Thread.sleep(800);
		ExpiryDate.click();
		Thread.sleep(800);
		for (int i = 0;i<=6; i++) {



			t.keyPress(KeyEvent.VK_DOWN);
			t.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(400);

		}
		Thread.sleep(800);

		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(800);
		unitcost.clear();
		Thread.sleep(800);
		unitcost.sendKeys("12");
		Thread.sleep(800);
//		UnitSell.clear();
//		Thread.sleep(800);
//		UnitSell.sendKeys("12");
//		Thread.sleep(800);
		AddContinue.click();
		Thread.sleep(2000);

		Save.click(); 
		Thread.sleep(2000);
		Thread.sleep(500);
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("(//i[@class='ki ki-check'])[1]"));
//
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("(//i[@class='ki ki-check'])[1]")).click();
//			Thread.sleep(800);
//		}
//
//
//		else {
//			System.out.println("sri");
//		}
//		Thread.sleep(1000);
		
		
		
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		

		driver.findElement(By.xpath("//i[@class='ki ki-reset']")).click();
		Thread.sleep(2000);


	}

	public void StockUpdate() throws InterruptedException {


		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(2000);
		Stock.click();
		Thread.sleep(800);
		StockUpdate.click();
		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);	
		
		ItemName.sendKeys("DOLOPAR 650 TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);

		Search.click();
		Thread.sleep(2000);

		Detailed.click();
		Thread.sleep(2000);
		Consolidated.click();
		Thread.sleep(800);	


		Pencil.click();
		Thread.sleep(800);
//		Vat.clear();
//		Thread.sleep(800);
//		Vat.sendKeys("1.5");
//		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(800);
		Thread.sleep(800);

		Upload.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='ki ki-reset']")).click();

		Thread.sleep(2000);



	}

	public void Stockview() throws InterruptedException, AWTException {

		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(800);
		StockView.click();
		Thread.sleep(800);
		Search.click();
		Thread.sleep(3000);
		Detailedview.click();
		Thread.sleep(3000);
		clear.click();
		Thread.sleep(800);
		EXpired.click();
		Thread.sleep(800);
		Search.click();
		Thread.sleep(3000);
		clear.click();
		Thread.sleep(800);
		ExpiredIn.click();
		Days.click();
		Days.sendKeys("90");
		Thread.sleep(800);
		Search.click();
		Thread.sleep(3000);


		Print.click();
		Thread.sleep(3000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(800);
		clear.click();
		Thread.sleep(800);

		ItemType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(800);
		Search.click();
		Thread.sleep(3000);
		clear.click();
		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("DOLOPAR 650 TAB" , Keys.ENTER);
		Thread.sleep(800);
		Search.click();
		Thread.sleep(3000);
		clear.click();
		Thread.sleep(800);


	}

	public void StockMovement() throws AWTException, InterruptedException {

		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(800);
		StockMovement.click();

		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("DOLOPAR 650 TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		Search.click();
		Thread.sleep(3000);

		Print.click();
		Thread.sleep(4000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);


		Detailedview.click();
		Thread.sleep(2000);
		clear.click();
		Thread.sleep(1200);

	}


	public void PatientIndentForClose(String MRNo) throws InterruptedException, AWTException, IOException {


		Thread.sleep(800);
		Hamburger.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='link-value'][normalize-space()='Indent']")).click();
		Thread.sleep(800);
		PatientIndent.click();
		Thread.sleep(800);

		//close indent

		Thread.sleep(800);
		reqlocation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='"+NursingStationLocation+"']")).click();
		Thread.sleep(800);

		MRNO.click();
		Thread.sleep(800);
		MRNO.sendKeys( MRNo , Keys.ENTER);
		Thread.sleep(800);
		IndentType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Regular']")).click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("DOLOPAR 650 TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("300");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("MIRAGO 25MG TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("300");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);


		Thread.sleep(800);
		ItemName.click();
		Thread.sleep(800);
		ItemName.sendKeys("MORPHINE 50MG TAB" , Keys.ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(800);
		IndentQTY.click();
		Thread.sleep(800);
		IndentQTY.sendKeys("300");
		Thread.sleep(800);
		Add.click();
		Thread.sleep(800);

		Save.click();



		Thread.sleep(2000); 
		String closeIndNo= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]" )).getText(); 
		System.out.println(closeIndNo);

		String word1[]=closeIndNo.split("[ :] ");
		System.out.println("number of words: "+word1.length); 
		for(int i=0;i<word1.length;i++)
		{
			System.out.println("word["+i+"]="+word1[i]);
		}
		System.out.println(word1[1]);

		String closeIndentNO = word1[1];

		System.out.println("Closed indednt =" + closeIndentNO);

		Thread.sleep(800);

		File src=new File(Excelfilepath);
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis); 
		HSSFSheet BirthRegistration=wb.getSheetAt(13);
		int i=BirthRegistration.getLastRowNum(); 
		System.out.println("Number of rows: " + i);
		BirthRegistration.getRow(i).createCell(7).setCellValue(closeIndentNO);
		FileOutputStream fout=new FileOutputStream(src); wb.write(fout);  
		Thread.sleep(2000);  


		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();


	}

}
