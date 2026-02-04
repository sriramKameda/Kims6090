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
import pagesOfYasasiiWeb.KIMS_Limit_Approval_Yasasiiweb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_Limit_Approval_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$",Site);
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void ServiceMaster(String codeType , String code,String ServiceName , String BaseCategory , String SubCategory, String User ,String Password , String Site , String MRNO,String Provider ,String ServiceDescription,String DOCuser ,String DOCpassword,String ApproveNO1, String ApproveNO2) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		KIMS_Limit_Approval_Yasasiiweb price = new KIMS_Limit_Approval_Yasasiiweb(driver);
		
		price.master(codeType, code, ServiceName, BaseCategory, SubCategory, ServiceDescription);
			
	
}
@Test(dataProvider="getData"  , priority=1)
public void Limitsetting(String codeType , String code,String ServiceName , String BaseCategory , String SubCategory, String User ,String Password , String Site , String MRNO,String Provider ,String ServiceDescription,String DOCuser ,String DOCpassword,String ApproveNO1, String ApproveNO2) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		KIMS_Limit_Approval_Yasasiiweb price = new KIMS_Limit_Approval_Yasasiiweb(driver);
		
		
	    price.tariff(ServiceName, SubCategory);
		 
    	price.Limit_Setting();
		 		
}
@Test(dataProvider="getData"  , priority=2)
public void LIMITBilling(String codeType , String code,String ServiceName , String BaseCategory , String SubCategory, String User ,String Password , String Site , String MRNO,String Provider ,String ServiceDescription,String DOCuser ,String DOCpassword,String ApproveNO1, String ApproveNO2) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		KIMS_Limit_Approval_Yasasiiweb price = new KIMS_Limit_Approval_Yasasiiweb(driver);
		
		price.EncounterBilling(User, Password, MRNO, ServiceName);
		
		price.DoctorNote(DOCuser, DOCpassword, MRNO, ServiceName);
		
		price.CPOEAdministration();
		
		price.Ins_approval(User, Password, MRNO ,ApproveNO1, ApproveNO2);
		
		price.billing_postapprove(MRNO);
		
		 	price.OverlimitApproval(MRNO);	
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

	Object[][] data =readExcel("Limit_Approval");
	return data;	

 


}

}
