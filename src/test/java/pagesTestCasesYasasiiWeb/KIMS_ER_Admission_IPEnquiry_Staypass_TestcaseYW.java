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
import pagesOfYasasiiWeb.KIMS_ER_Admission_IPEnquiry_Staypass_Yasasiiweb;
import pagesOfYasasiiWeb.KIMS_FO_ADTactivities_Yasasiiweb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_ER_Admission_IPEnquiry_Staypass_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void BirthReg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider, String User , String Password , String Site,String Admin , String AdminPassword,String badname) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_ER_Admission_IPEnquiry_Staypass_Yasasiiweb ADT = new KIMS_ER_Admission_IPEnquiry_Staypass_Yasasiiweb(driver);
		
		
    	ADT.Patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo);
    	
    	 ADT.ER_Admission();
		
		}

@Test(dataProvider="getData"  , priority=1)
public void EMRtransfer(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider, String User , String Password , String Site,String Admin , String AdminPassword,String badname) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_ER_Admission_IPEnquiry_Staypass_Yasasiiweb ADT = new KIMS_ER_Admission_IPEnquiry_Staypass_Yasasiiweb(driver);
		
	
		
		ADT.NurseNote( MRNo);
		
		ADT.TransferToIP(Admin, AdminPassword, MRNo, MobNo, Address, DocID);
		
		ADT.ADT(badname, MRNo);
	
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

	Object[][] data =readExcel("ER_ADT");
	return data;	
}
}
