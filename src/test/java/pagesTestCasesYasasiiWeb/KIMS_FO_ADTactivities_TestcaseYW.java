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
import pagesOfYasasiiWeb.KIMS_FO_ADTactivities_Yasasiiweb;
import pagesOfYasasiiWeb.KIMS_nursingStationTransfer_YasassiWeb;

public class KIMS_FO_ADTactivities_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
	Thread.sleep(3000);
	
}

//@Test(dataProvider="getData"  , priority=0)
public void BirthReg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider ,String DOCuser ,String DOCpassword,String Site,String nurseUser , String  NursePassword,String Pharmacist_Id , String Pharmacist_password,String MRDUser, String MRDPassword,String FinalbillUser) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_FO_ADTactivities_Yasasiiweb ADT = new KIMS_FO_ADTactivities_Yasasiiweb(driver);
		
		
		ADT.Patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo);
		
		ADT.ADT();
	
		
		}

@Test(dataProvider="getData"  , priority=1)
public void EMRtransfer(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider ,String DOCuser ,String DOCpassword,String Site,String nurseUser , String  NursePassword,String Pharmacist_Id , String Pharmacist_password,String MRDUser, String MRDPassword,String FinalbillUser) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_FO_ADTactivities_Yasasiiweb ADT = new KIMS_FO_ADTactivities_Yasasiiweb(driver);
		
//	 	ADT.DoctorNote(DOCuser, DOCpassword, MRNo, DocID);
//		
//		ADT.dischargeApproval(MRNo, nurseUser, NursePassword,  Pharmacist_password);  
//		
//		ADT.Discharge_Summary_Clearance(MRDUser, MRDPassword, MRNo, DOCuser, DOCpassword); 
		
		ADT.PharmacyClearance(MRNo, Pharmacist_password);
		 
		ADT.ADTAppoval(MRNo);   
		
		ADT.homeleaveCancel();  
		
		ADT.financialClearance(MRNo);
		
		ADT.PhysicalClearance(MRNo, nurseUser, NursePassword);
		
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

	Object[][] data =readExcel("ADT");
	return data;	
}

}
