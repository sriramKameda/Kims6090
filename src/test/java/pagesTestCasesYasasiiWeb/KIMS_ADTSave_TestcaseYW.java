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
import pagesOfYasasiiWeb.KIMS_ADTSave_Yasasiiweb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_ADTSave_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin","KAmeda123$","KIMSHEALTH Nagarcoil");
		Thread.sleep(3000);

	}

	@Test(dataProvider="getData"  , priority=0)
	public void Reg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNO,String provider,String  ADTprovider,String service1,String service2,String service3,String docid,String docpassword,String Site,String adminid,String adminpassword , String nurseUser , String  NursePassword ,String authoriser  ) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);

		KIMS_ADTSave_Yasasiiweb IPfinal = new KIMS_ADTSave_Yasasiiweb(driver);

		IPfinal.Patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNO, ADTprovider, adminid, adminpassword,Site);

		IPfinal.ADT(ADTprovider);

		IPfinal.Billing(ADTprovider, service1, service2, service3);

//		IPfinal.doctoreNote(docid, docpassword, Site, Name);
//
//	//	IPfinal.PharmacyBilling(Name, ADTprovider, adminid, adminpassword, Site,MobNo);
//
//		IPfinal.dischargeApproval(Name, nurseUser, NursePassword, Site);
//
//		IPfinal.laboratoryClearance(Name, NursePassword, nurseUser, Site, adminid, adminpassword);
//
//		IPfinal.ADTAppoval(Name, Site, adminid, adminpassword);

		//	IPfinal.FinalBilling( adminid, adminpassword, Site, MRNO, authoriser);


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

		Object[][] data =readExcel("Sheet48");

		return data;	
	}


}
