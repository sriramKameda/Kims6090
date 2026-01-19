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
import pagesOfYasasiiWeb.KIMS_PatientJourney_OP_Yasasiiweb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_PatientJourney_OP_TestcasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
	Thread.sleep(3000);
	
}


@Test(dataProvider="getData"  , priority=0)
public void BirthReg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String DOCuser ,String DOCpassword,String OrdersetName, String adminuser,String adminpassword, String service1,String service2,String service3) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		KIMS_PatientJourney_OP_Yasasiiweb bill = new KIMS_PatientJourney_OP_Yasasiiweb(driver);
		
       bill.patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo);
		
		bill.encounter();
		
		
			
		}

@Test(dataProvider="getData"  , priority=1)
public void EMRORDRING(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String DOCuser ,String DOCpassword,String OrdersetName, String adminuser,String adminpassword, String service1,String service2,String service3 ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_PatientJourney_OP_Yasasiiweb bill = new KIMS_PatientJourney_OP_Yasasiiweb(driver);

	
	
	bill.DoctorNote(DOCuser, DOCpassword, MRNo, OrdersetName);
	
	bill.serviceExecution(DOCuser, DOCpassword, MRNo);
	
	bill.OrderBilling(adminuser, adminpassword, MRNo);
	
	
			
		}

@Test(dataProvider="getData"  , priority=2)
public void Billing(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String DOCuser ,String DOCpassword,String OrdersetName, String adminuser,String adminpassword, String service1,String service2,String service3 ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_PatientJourney_OP_Yasasiiweb bill = new KIMS_PatientJourney_OP_Yasasiiweb(driver);
	
	bill.PharmacyBilling(MRNo, Provider);
	
	bill.encounterClose(MRNo, service1, service2, service3, Provider);
	
	bill.finalbilling(MRNo);
			
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

	Object[][] data =readExcel("OP_jouney");
	return data;	
}
	
	
}



	
	
	

