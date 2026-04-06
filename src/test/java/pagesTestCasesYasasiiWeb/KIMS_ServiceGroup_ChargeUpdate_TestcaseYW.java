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
import pagesOfYasasiiWeb.KIMS_ServiceGroup_ChargeUpdate_Yasassiiweb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_ServiceGroup_ChargeUpdate_TestcaseYW extends TestBaseYasasiiWeb{
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateFOPage() throws InterruptedException {

		KIMS_ServiceGroup_ChargeUpdate_TestcaseYW.login =new LoginPageYasasiiWeb(driver) ;
		KIMS_ServiceGroup_ChargeUpdate_TestcaseYW.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
		Thread.sleep(2000);


	}
	
	@Test(dataProvider="getData",priority=0)

	public void SERVICEMASTER(String SubCategory,String serviceName,String GroupName,String ServiceName2) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_ServiceGroup_ChargeUpdate_Yasassiiweb SM = new KIMS_ServiceGroup_ChargeUpdate_Yasassiiweb(driver) ;

		SM.serviceMaster(SubCategory,serviceName,GroupName,ServiceName2);

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

			Object[][] data =readExcel("ServiceMaster");
			return data;	
		}	

	}
