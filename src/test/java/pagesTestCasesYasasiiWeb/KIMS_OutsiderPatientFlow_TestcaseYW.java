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
import pagesOfYasasiiWeb.KIMS_MergedMRNO_yasasiiWeb;
import pagesOfYasasiiWeb.KIMS_OutsiderPatientFlow_YasasiiWeb;

public class KIMS_OutsiderPatientFlow_TestcaseYW extends TestBaseYasasiiWeb  {
public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$",Site);
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Reg(String Title,String NAME,String lastName,String DOB,String MBLNO,String Provider,String MRNO,String DOCno,String service) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		KIMS_OutsiderPatientFlow_YasasiiWeb OS = new KIMS_OutsiderPatientFlow_YasasiiWeb(driver);
		
	  OS.Patreg(service, NAME, DOB, MBLNO);
	  
	
	  
	  
	  		
}
@Test(dataProvider="getData"  , priority=1)
public void OUtsideReg(String Title,String NAME,String lastName,String DOB,String MBLNO,String Provider,String MRNO,String DOCno,String service) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		KIMS_OutsiderPatientFlow_YasasiiWeb OS = new KIMS_OutsiderPatientFlow_YasasiiWeb(driver);
	  
	    OS.Appointment(NAME, lastName, MRNO, DOCno, service);
	  
		
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

	Object[][] data =readExcel("Outsider");
	return data;	

 


}

}
