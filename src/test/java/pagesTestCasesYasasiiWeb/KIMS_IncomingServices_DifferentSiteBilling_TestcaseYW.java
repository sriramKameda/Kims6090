
package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.KIMS_IncomingServices_DifferentSiteBilling_Yasasiiweb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_IncomingServices_DifferentSiteBilling_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
		Thread.sleep(3000);

	}

	@Test(dataProvider="getData"  , priority=0)
	public void patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String DOCuser ,String DOCpassword, String Site,String Site1,String Site2,String Provider1 ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_IncomingServices_DifferentSiteBilling_Yasasiiweb inc = new KIMS_IncomingServices_DifferentSiteBilling_Yasasiiweb(driver);

		inc.Patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo);


	}

	@Test(dataProvider="getData"  , priority=1)
	public void doctornote(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String DOCuser ,String DOCpassword, String Site,String Site1,String Site2,String Provider1 ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_IncomingServices_DifferentSiteBilling_Yasasiiweb inc = new KIMS_IncomingServices_DifferentSiteBilling_Yasasiiweb(driver);

		inc.BillingMessage(DOCuser, DOCpassword, Site, MRNo);
		
//		inc.DoctorNote(DOCuser, DOCpassword, MRNo,Site);
//
//		inc.Billing_inTVM(Site1, MRNo);
//
//		inc.Billing_inKollam(Site2, MRNo, Provider1,Provider);


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

		Object[][] data =readExcel("incoming");
		return data;	
	}

}
