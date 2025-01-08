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
import pagesOfYasasiiWeb.KIMS_InstructionOrder_Yasasiiweb;
import pagesOfYasasiiWeb.KIMS_PackageBilling_YasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_PackageBilling_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$",Site);
	Thread.sleep(3000); 
	
}

@Test(dataProvider="getData"  , priority=0)
public void PackageCreation(String MRNO,String PackageName,String Service1,String  Service2,String Service3,String Service4,String Service5,String Service6) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_PackageBilling_YasasiiWeb pac = new KIMS_PackageBilling_YasasiiWeb(driver);
		
	//	pac.PackageCreation(PackageName, Service1, Service2, Service3, Service4, Service5, Service6);	
//		
//		pac.package_Billing(MRNO, PackageName, Service1, Service2, Service3, Service4, Service5, Service6);
		
		pac.PharmacyPackagebill(MRNO, PackageName);
		
		pac.packageClosure(MRNO);
		    
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

	Object[][] data =readExcel("Package");
	return data;	
}


}
