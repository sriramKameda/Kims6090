package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.KIMS_Inventory_yasasiiweb;

public class KIMS_Inventory_TestcaseYW extends TestBaseYasasiiWeb  { 
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin","KAmeda123$",Site);
		Thread.sleep(3000);

	}


	@Test(dataProvider="getData"  , priority=0)
	public void inventory(String Supplier,String Sublocation , String MRNo,String IndGroupName,String GRNNO,String BatchNo, String DOB,String closeIndentNO) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);


		KIMS_Inventory_yasasiiweb INV = new KIMS_Inventory_yasasiiweb(driver);

		INV.InventoryHome();

		INV.supplier(Supplier);

		INV.sublocation(Sublocation);

		INV.inventoryIndednt();
		
		INV.PatientIndent(MRNo);  

		


	}


	@Test(dataProvider="getData"  , priority=1)
	public void closedIndent(String Supplier,String Sublocation , String MRNo,String IndGroupName,String GRNNO,String BatchNo, String DOB,String closeIndentNO) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);


		KIMS_Inventory_yasasiiweb INV = new KIMS_Inventory_yasasiiweb(driver);

		INV.closeIndent(closeIndentNO); 

		INV.IndentGroup(IndGroupName);

	}
	
	
	@AfterClass
	public void logout() throws Exception
	{

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		this.hm.clickLogout();
		 
	}

	@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data =readExcel("Inventory");
		return data;	


	}

}
