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
import pagesOfYasasiiWeb.KIMS_StatementSettlement_YasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_StatementSettlement_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin","KAmeda123$",Site);
		Thread.sleep(3000);

	}

   @Test(dataProvider="getData"  , priority=0)
	public void Reg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider, String service1,String service2,String service3) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);

		KIMS_StatementSettlement_YasasiiWeb FBOP = new KIMS_StatementSettlement_YasasiiWeb(driver);
		
		FBOP.Patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNo, provider);

		FBOP.Billing(provider, service1, service2, service3);

	}

	@Test(dataProvider="getData"  , priority=1)
	public void finalbilling(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider, String service1,String service2,String service3) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);

		KIMS_StatementSettlement_YasasiiWeb FBOP = new KIMS_StatementSettlement_YasasiiWeb(driver);

	 	FBOP.PharmacyBilling(MRNo, provider);

		FBOP.encounterClose(MRNo, service1, service2, service3, provider);

		FBOP.finalbilling(MRNo);

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

		Object[][] data =readExcel("Statement");

		return data;	
	}
	

}
