package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_ServiceGroup_ChargeUpdate_Yasassiiweb extends PageFactoryInitYasasiiWeb{

	public KIMS_ServiceGroup_ChargeUpdate_Yasassiiweb(WebDriver driver) {
		super(driver);

	}


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-insurance-service-group[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ServiceGroupSearch;
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement hamberger;
	
	@FindBy(xpath="//i[@class='ki ki-cog']") 
	public WebElement masters;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='General']") 
	public WebElement general ;

	@FindBy(xpath="//div[normalize-space()='Category Master']") 
	public WebElement categoryMaster;

	@FindBy(xpath="//input[@id='parentinvcategoryid']") 
	public WebElement parentCategory ;

	@FindBy(xpath="//li[normalize-space()='Procedure']")
	public WebElement procedure;

	@FindBy(xpath="//input[@id='name']")
	public WebElement name;

	@FindBy(xpath="//label[normalize-space()='Display In EMR']//span[@class='checkmark']")
	public WebElement displayInEMR;

	@FindBy(xpath="//i[@class='ki ki-save']")
	public WebElement saveButton ;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath="//div[normalize-space()='Service Master']")
	public WebElement  ServiceMaster;

	@FindBy(xpath="//input[@id='rootinvcatgeoryser']")
	public WebElement  baseCategory;

	@FindBy(xpath="//input[@id='servicecategoryser']")
	public WebElement  Subcategory;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]")
	public WebElement  serviceName1;

	@FindBy(xpath="//span[@class='btn btn-link ng-star-inserted'][normalize-space()='Site Mapping']")
	public WebElement SiteMap;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement ServiceCheck;

	@FindBy(xpath="//i[@class='ki ki-chevron-double-right']")
	public WebElement MoveRight;

	@FindBy(xpath="//i[@class='fa fa-exclamation-triangle red']")
	public WebElement Triangle;

	@FindBy(xpath="//input[@id='executioncategoryid']")
	public WebElement Executioncategory;

	@FindBy(xpath="//li[normalize-space()='Others']") 
	public WebElement others ;

	@FindBy(xpath="//button[@class='btn btn-primary sm ng-star-inserted']") 
	public WebElement ok ;

	@FindBy(xpath="//input[@id='searchtext']") 
	public WebElement searchservice ;

	@FindBy(xpath="//i[@class='ki ki-search']")
	public WebElement searchIcon ;

	@FindBy(xpath="//i[@class='ki ki-pencil']") 
	public WebElement edit;

	@FindBy(xpath="//i[@title='ServiceMast.TaxCharge']") 
	public WebElement taxCharge;

	@FindBy(xpath="//div[@class='form-group ki-dropdown']//input[@id='undefined']") 
	public WebElement coverage ;

	@FindBy(xpath="//li[normalize-space()='Inclusion']") 
	public WebElement inclusion;

	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/taxmaster-update-popup[1]/form[1]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]") 
	public WebElement baseCharge;


	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/taxmaster-update-popup[1]/form[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]") 
	public WebElement contractCharge ;

	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/taxmaster-update-popup[1]/form[1]/div[1]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]") 
	public WebElement CGST ;

	@FindBy(xpath="/html[1]/body[1]/modal-container[1]/div[1]/div[1]/taxmaster-update-popup[1]/form[1]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement SGST;

	@FindBy(xpath="//button[@aria-label='Save']//i[@class='ki ki-check']")
	public WebElement OK;

	@FindBy(xpath="//button[normalize-space()='Confirm']") 
	public WebElement confirm;

	@FindBy(xpath="//i[@class='ki ki-upload']") 
	public WebElement update;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='RCM-Plan']")
	public WebElement RCM_plan;

	@FindBy(xpath="//div[normalize-space()='Tariff Setting(Old)']")
	public WebElement tariffsettingOld;

	@FindBy(xpath = "//input[@placeholder='Search reference name...']")
	public WebElement refsearch;

	@FindBy(xpath="//input[@placeholder='Service Name']") 
	public WebElement searchService;

	@FindBy(xpath="//div[normalize-space()='Service Group']") 
	public WebElement ServiceGroup;

	@FindBy(xpath="//ki-select-control[@formcontrolname='servicetypeid']//input[@id='undefined']")
	public WebElement ServiceType;

	@FindBy(xpath="//ki-select-control[@formcontrolname='rootcategoryid']//input[@id='undefined']")
	public WebElement basecategory;

	@FindBy(xpath="//ki-select-control[@formcontrolname='invcategoryid']//input[@id='undefined']") 
	public WebElement serviceCategory;

	@FindBy(xpath="//label[@class='check-container m0']//span[@class='checkmark']") 
	public WebElement categoryCheckbox;

	@FindBy(xpath="//i[@class='ki ki-plus']") 
	public WebElement addToGrid;

	@FindBy(xpath="//label[normalize-space()='Add Service Group']//span[@class='checkmark']") 
	public WebElement AddServiceGroup;

	@FindBy(xpath="//accordion-group[@heading='Service Group']//div[@role='button']") 
	public WebElement ServiceGroup1;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/app-service-group[1]/form[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]") 
	public WebElement selectGroup;

	@FindBy(xpath="//input[@placeholder='Search...']") 
	public WebElement search;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement coverageStatus;

	@FindBy(xpath = "//div[@class='col-md-12 p0']//div[@role='button']")
	public WebElement chargeParameters;

	@FindBy(xpath = "//input[@id='encountersubmodeid']")
	public WebElement submode;

	@FindBy(xpath = "//li[normalize-space()='OP']")
	public WebElement op;

	@FindBy(xpath = "//input[@id='paymodeid']")
	public WebElement paymode;

	@FindBy(xpath = "//li[@class='uparrow-yellow']")
	public WebElement credit;

	@FindBy(xpath = "//label[@title='Add submode and paymode']//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement ip;

	@FindBy(xpath = "//button[@id='AddButton']//i[@class='ki ki-plus']")
	public WebElement add2;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement successfullyOK;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-insurance-service-group[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement search1;

	@FindBy(xpath = "//label[@title='Delete']//i[@class='ki ki-trash']")
	public WebElement delete;

	@FindBy(xpath = "//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement confirmation;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement validation;

	@FindBy(xpath = "//span[normalize-space()='Group']")
	public WebElement Group;

	@FindBy(xpath = "//button[@class='btn btn-primary sm active']")
	public WebElement ok1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-insurance-service-group[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement serviceGroupName;
	//@FindBy(xpath="") public WebElement ;
	//@FindBy(xpath="") public WebElement ;
	//@FindBy(xpath="") public WebElement ;
	//@FindBy(xpath="") public WebElement ;



	public void serviceMaster(String SubCategory,String serviceName,String GroupName,String ServiceName2) throws InterruptedException, AWTException {

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		general.click();
		Thread.sleep(1000);
		categoryMaster.click();
		Thread.sleep(1000);
		parentCategory.click();
		Thread.sleep(1000);
		parentCategory.sendKeys("Procedure");
		Thread.sleep(1000);
		procedure.click();
		Thread.sleep(1000);
		name.sendKeys(SubCategory);
		Thread.sleep(1000);
		displayInEMR.click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		Service.click();
		Thread.sleep(1000);
		ServiceMaster.click();
		Thread.sleep(1000);
		baseCategory.sendKeys("Procedure");
		Thread.sleep(1000);
		procedure.click();
		Thread.sleep(1000);
		Subcategory.sendKeys(SubCategory);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+SubCategory+"']")).click();
		Thread.sleep(1000);
		serviceName1.sendKeys(serviceName);
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",SiteMap );
		Thread.sleep(1000);
		SiteMap.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",SiteMap );
		Thread.sleep(400);
		ServiceCheck.click();
		Thread.sleep(1000);
		MoveRight.click();
		Thread.sleep(1000);
		Triangle.click();
		Thread.sleep(1000);
		Executioncategory.click();
		Thread.sleep(1000);
		others.click();
		Thread.sleep(1000);
		ok.click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(3000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);

		searchservice.sendKeys(serviceName);
		Thread.sleep(1000);
		searchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='"+serviceName+"']")).click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		taxCharge.click();
		Thread.sleep(1000);
		coverage.click();
		Thread.sleep(1000);
		inclusion.click();
		Thread.sleep(1000);
		baseCharge.clear();
		baseCharge.sendKeys("500");
		Thread.sleep(1000);
		contractCharge.clear();
		contractCharge.sendKeys("500");
		Thread.sleep(1000);
		CGST.clear();
		CGST.sendKeys("0");
		Thread.sleep(1000);
		SGST.clear();
		SGST.sendKeys("0");
		Thread.sleep(1000);
		ok1.click();
		Thread.sleep(1000);
		confirm.click();
		Thread.sleep(1000);
		update.click();
		Thread.sleep(2000);

		/// Verifying service charge in Tariff


		hamberger.click();
		Thread.sleep(1000);
		RCM_plan.click();
		Thread.sleep(1000);
		tariffsettingOld.click();
		Thread.sleep(1000);
		refsearch.click();
		Thread.sleep(1000);
		refsearch.sendKeys("Default" , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='Default']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(3000);

		Thread.sleep(700);
		driver.findElement(By.xpath("//input[@id='plan']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='DefaultTVM']")).click();
		Thread.sleep(3000);
		searchService.sendKeys(serviceName);
		Thread.sleep(3000);


		List<WebElement> Trash=driver.findElements(By.xpath("//td[@class='icon-action first-col ng-star-inserted']//i[@class='ki ki-trash']"));

		int A =	Trash.size();
		System.out.println(A  + " = Delete Icon");

		if(Trash.size() !=0)
		{
			System.out.println(serviceName + " is there in the Tariff");
		}


		else {
			System.out.println(serviceName + " is not there in the Tariff");
		}
		Thread.sleep(2000);
		//		WebElement Trash = driver.findElement(By.xpath("//td[@class='icon-action first-col ng-star-inserted']//i[@class='ki ki-trash']"));
		//		Thread.sleep(3000);

		hamberger.click();
		Thread.sleep(1000);
		ServiceGroup.click();


		Thread.sleep(2000);
		serviceGroupName.sendKeys(GroupName);
		Thread.sleep(1000);
		ServiceType.click();
		Thread.sleep(1000);
		ServiceType.sendKeys("procedure");
		Thread.sleep(1000);
		procedure.click();
		Thread.sleep(1000);
		basecategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='uparrow-yellow']")).click();
		Thread.sleep(1000);
		serviceCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+SubCategory+"']")).click();
		Thread.sleep(1000);
		categoryCheckbox.click();
		Thread.sleep(1000);
		addToGrid.click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(3000);


		List<WebElement> Info=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade blockoutside in show']//div[@class='dialog-header']"));


		if(Info.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade blockoutside in show']//div[@class='dialog-header']")).click();
			Thread.sleep(1000);
			//	Robot t=new Robot();
			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(400);
			t.keyPress(KeyEvent.VK_ESCAPE);
			t.keyRelease(KeyEvent.VK_ESCAPE);

		}


		else {

		}
		Thread.sleep(2000);

		ServiceGroupSearch.clear();
		Thread.sleep(400);
		ServiceGroupSearch.sendKeys(GroupName,Keys.ENTER);
		Thread.sleep(400);
		driver.findElement(By.xpath("//div[@title='"+GroupName+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(1000);


		hamberger.click();
		Thread.sleep(1000);
	//	RCM_plan.click();
	//	Thread.sleep(1000);
		tariffsettingOld.click();
		Thread.sleep(1000);
		refsearch.click();
		Thread.sleep(1000);
		refsearch.sendKeys("MSD Ins Corp PVT.LTD" , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(3000);
		AddServiceGroup.click();
		Thread.sleep(1000);
		ServiceGroup1.click();
		Thread.sleep(1000);
		selectGroup.click();
		Thread.sleep(1000);
		search.sendKeys(GroupName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='"+GroupName+"']")).click();
		Thread.sleep(1000);
		coverageStatus.click();
		Thread.sleep(1000);
		inclusion.click();
		Thread.sleep(1000);
		chargeParameters.click();
		Thread.sleep(1000);
		submode.click();
		Thread.sleep(1000);
		op.click();
		Thread.sleep(1000);
		paymode.click();
		Thread.sleep(1000);
		credit.click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		submode.click();
		Thread.sleep(1000);	
		ip.click();
		Thread.sleep(1000);
		paymode.click();
		Thread.sleep(1000);
		credit.click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",add2 );
		add2.click();
		Thread.sleep(1000);
		update.click();
		Thread.sleep(3000);
		successfullyOK.click();
		driver.findElement(By.xpath("//div[@title='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(3000);
		searchService.sendKeys(serviceName);
		Thread.sleep(3000);
		////////////////////////////////////
		hamberger.click();
		Thread.sleep(1000);
		Service.click();
		Thread.sleep(1000);
		ServiceMaster.click();
		Thread.sleep(1000);
		baseCategory.sendKeys("Procedure");
		Thread.sleep(1000);
		procedure.click();
		Thread.sleep(1000);
		Subcategory.sendKeys(SubCategory);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+SubCategory+"']")).click();
		Thread.sleep(1000);
		serviceName1.sendKeys(ServiceName2);
		Thread.sleep(1000);
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",SiteMap );
		Thread.sleep(1000);
		SiteMap.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",SiteMap );
		Thread.sleep(400);
		ServiceCheck.click();
		Thread.sleep(1000);
		MoveRight.click();
		Thread.sleep(1000);
		Triangle.click();
		Thread.sleep(1000);
		Executioncategory.click();
		Thread.sleep(1000);
		others.click();
		Thread.sleep(1000);
		ok.click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		searchservice.sendKeys(ServiceName2);
		Thread.sleep(1000);
		searchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='"+ServiceName2+"']")).click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		taxCharge.click();
		Thread.sleep(1000);
		coverage.click();
		Thread.sleep(1000);
		inclusion.click();
		Thread.sleep(1000);
		baseCharge.clear();
		baseCharge.sendKeys("500");
		Thread.sleep(1000);
		contractCharge.clear();
		contractCharge.sendKeys("500");
		Thread.sleep(1000);
		CGST.clear();
		CGST.sendKeys("0");
		Thread.sleep(1000);
		SGST.clear();
		SGST.sendKeys("0");
		Thread.sleep(1000);
		ok1.click();
		Thread.sleep(1000);
		confirm.click();
		Thread.sleep(1000);
		update.click();
		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		RCM_plan.click();
		Thread.sleep(1000);
		tariffsettingOld.click();
		Thread.sleep(1000);
		refsearch.click();
		Thread.sleep(1000);
		refsearch.sendKeys("Default" , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='Default']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(3000);

		Thread.sleep(700);
		driver.findElement(By.xpath("//input[@id='plan']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='DefaultTVM']")).click();
		Thread.sleep(3000);
		searchService.sendKeys(serviceName);
		Thread.sleep(1000);
		refsearch.clear();
		Thread.sleep(1000);
		refsearch.click();
		Thread.sleep(1000);
		refsearch.sendKeys("MSD Ins Corp PVT.LTD" , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(3000);
		searchService.sendKeys(serviceName);
		Thread.sleep(1000);



		hamberger.click();
		Thread.sleep(1000);
		ServiceGroup.click();
		Thread.sleep(1000);
		search.sendKeys(GroupName,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='"+GroupName+"']")).click();
		Thread.sleep(1000);


		delete.click();
		Thread.sleep(1000);
		confirmation.click();  
		Thread.sleep(1000);
		validation.click();
		Thread.sleep(2000);

		hamberger.click();
		Thread.sleep(1000);

		tariffsettingOld.click();
		Thread.sleep(1000);
		refsearch.click();
		Thread.sleep(1000);
		refsearch.sendKeys("MSD Ins Corp PVT.LTD" , Keys.ENTER);
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(2000);
		Group.click();
		Thread.sleep(1000);


		List<WebElement> ServiceGroupTrash=driver.findElements(By.xpath("//i[@class='ki ki-trash']"));

		int X =	ServiceGroupTrash.size();

		int Y= X-3;


		System.out.println(Y  + " = Delete Icon No.");
		
		
	//	JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//i[@class='ki ki-trash'])["+X+"]")) );
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//i[@class='ki ki-trash'])["+X+"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		//
		//		WebElement lastElement = driver.findElement(By.xpath("(//tbody/tr[last()]/td[1]/label[1]/a[1]/i[1])[2]"));
		//
		//		lastElement.click();
		//		confirmation.click();
		//		Thread.sleep(1000);
		//		//driver.findElement(By.xpath("//tbody/tr[26]/td[1]/label[1]/a[1]/i[1]")).click();
		update.click();
		Thread.sleep(1000);
		successfullyOK.click();

		hamberger.click();
		Thread.sleep(1000);
		ServiceGroup.click();
		Thread.sleep(1000);
		search.sendKeys(GroupName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='"+GroupName+"']")).click();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		confirmation.click();
		Thread.sleep(1000);


	}

}
