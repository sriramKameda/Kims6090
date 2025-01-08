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
import pagesOfYasasiiWeb.KIMS_Diagnosis_LogView_YasasiiWeb;

public class KIMS_Diagnosis_LogView_testcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$",Site);
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Reg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider,String DOCuser ,String DOCpassword , String Site  ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		KIMS_Diagnosis_LogView_YasasiiWeb dia = new KIMS_Diagnosis_LogView_YasasiiWeb(driver);
		
		dia.Patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo, ADTprovider);
		
			}

 

@Test(dataProvider="getData"  , priority=1)
public void Hidenote(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider,String DOCuser ,String DOCpassword , String Site  ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
     
		KIMS_Diagnosis_LogView_YasasiiWeb IMA = new KIMS_Diagnosis_LogView_YasasiiWeb(driver);
		
		IMA.DoctorNote(DOCuser, DOCpassword, MRNo, ADTprovider);
		
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

	Object[][] data =readExcel("DiagnosisLog");
	return data;	
}


}
