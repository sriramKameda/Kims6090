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
import pagesOfYasasiiWeb.KIMS_PatientFullReg_YasasiiWeb;

public class KIMS_PatientFullReg_TestCaseYW   extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login; 
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$",Site);
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Reg(String title,String Name,String Dob, String DocID, String MobNo,String MRNo,String AltMblNO,String familyName,String Organisation,String mail,String myhomeadd1,String myhomeadd2,String relatedMR,String provider,String Careteam,String resource) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		KIMS_PatientFullReg_YasasiiWeb Pat = new KIMS_PatientFullReg_YasasiiWeb(driver);
		
//		Pat.careTeam(Careteam, resource);
		
		Pat.patreg(title, Name, Dob, DocID, MobNo, MRNo, AltMblNO, familyName, Organisation, mail, myhomeadd1, myhomeadd2, relatedMR, Careteam, resource);
		
		Pat.PatientInfo(provider);
		
		
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

	Object[][] data =readExcel("FullPatientReg");
	return data;	
	
	
}
 

}
