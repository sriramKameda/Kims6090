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
import pagesOfYasasiiWeb.KIMS_StockReservation_Yasasiiweb;

public class KIMS_StockTransfer_TestcaseYW extends TestBaseYasasiiWeb  { 
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigate() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin","KAmeda123$",Site);
		Thread.sleep(3000);

	}


	@Test(dataProvider="getData"  , priority=0)
	public void inventoryStockReservation(String MRNo) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);


		KIMS_StockReservation_Yasasiiweb SRI = new KIMS_StockReservation_Yasasiiweb(driver);

	
		SRI.InventoryHome();
		
		SRI.PatientIndent(MRNo);
		
		SRI.StockReservation(MRNo);
		
		SRI.stockConsumption(MRNo);
	
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
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("StockTransfer");
		return data;	


	
	}

}
