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
import pagesOfYasasiiWeb.KIMS_FinalBilling_OP_YasassiWeb;
import pagesOfYasasiiWeb.KIMS_nurseNote_ConsentForm_Yasasiiweb;

public class KIMS_FinalBilling_OP_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails(FinalbillUser,"KAmeda123$",Site);
		Thread.sleep(3000);
		

	}

    @Test(dataProvider="getData"  , priority=0)
	public void Reg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider, String service1,String service2,String service3) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);

		KIMS_FinalBilling_OP_YasassiWeb FBOP = new KIMS_FinalBilling_OP_YasassiWeb(driver);
		
		FBOP.Patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNo, provider);

		FBOP.Billing(provider, service1, service2, service3);

	}

	@Test(dataProvider="getData"  , priority=1)
	public void finalbilling(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider, String service1,String service2,String service3) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);

		KIMS_FinalBilling_OP_YasassiWeb FBOP = new KIMS_FinalBilling_OP_YasassiWeb(driver);

	 	FBOP.PharmacyBilling(MRNo, provider);

		FBOP.encounterClose(MRNo);

		FBOP.FinalBilling(MRNo);

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

		Object[][] data =readExcel("Finalbill_op");

		return data;	
	}


}
