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
import pagesOfYasasiiWeb.KIMS_interimIncoice_IP_yasasiiweb;

public class KIMS_interimIncoice_IP_TestcaseYW   extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException { 

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin","KAmeda123$", Site);
		Thread.sleep(3000);

	}
 
   @Test(dataProvider="getData"  , priority=0)
	public void Reg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider, String service1,String service2,String service3,String  ADTprovider,String docid,String docpassword,String Site,String adminid,String adminpassword ,String Authoriser ) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);

		KIMS_interimIncoice_IP_yasasiiweb interim = new KIMS_interimIncoice_IP_yasasiiweb(driver);

		interim.Patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNo, ADTprovider);
		
		interim.ADT();
		
		interim.Billing( service1, service2, service3);	
	}

	@Test(dataProvider="getData"  , priority=1)
	public void finalbilling(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider, String service1,String service2,String service3,String  ADTprovider,String docid,String docpassword,String Site,String adminid,String adminpassword ,String Authoriser ) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);

		KIMS_interimIncoice_IP_yasasiiweb IpInterim = new KIMS_interimIncoice_IP_yasasiiweb(driver);	
		
		IpInterim.doctoreNote(docid, docpassword, MRNo);
		
		IpInterim.PharmacyBilling(MRNo, ADTprovider, adminid, adminpassword);
		
		IpInterim.FinalBilling(MRNo, Authoriser);
	

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

		Object[][] data =readExcel("interim");

		return data;	
	}

}
