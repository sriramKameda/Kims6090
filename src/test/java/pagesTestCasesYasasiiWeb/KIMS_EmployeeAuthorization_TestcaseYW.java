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
import pagesOfYasasiiWeb.KIMS_EmployeeAuthorization_YasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_EmployeeAuthorization_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
    public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", Site); 
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNO,String Provider , String seniorDR , String Password , String site,String JRdoctor, String Service,String ADTprovider) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_EmployeeAuthorization_YasasiiWeb MDT = new KIMS_EmployeeAuthorization_YasasiiWeb(driver);
		
		MDT.patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNO);
		
		MDT.encounter();
		
		MDT.ADT();
		}

@Test(dataProvider="getData"  , priority=1)
public void SecondOpinion(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNO,String Provider , String seniorDR , String Password , String site,String JRdoctor,String Service,String ADTprovider) throws InterruptedException, IOException, AWTException {
	
	
	    Thread.sleep(2000);
		
	    KIMS_EmployeeAuthorization_YasasiiWeb MDT = new KIMS_EmployeeAuthorization_YasasiiWeb(driver);
	    
       MDT.employeeAuthorization( MRNO, Service);
		
	   MDT.juniordocnote( MRNO, Service);
	   
	   MDT.seniorDoctor(  MRNO, Service);
	
		
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

	Object[][] data =readExcel("employee authorization");
	return data;	
}

}
