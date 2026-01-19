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
import pagesOfYasasiiWeb.KIMS_IPpanel_MedicineAdministration_Yasasiiweb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_IPpanel_MedicineAdministration_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin","KAmeda123$", Site);
		Thread.sleep(3000);

	}

	@Test(dataProvider="getData"  , priority=0)
	public void Patreg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String  ADTprovider ,String docid,String docpassword,String Site,String OrdersetName,String FoUser, String Password,String NurseID) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);


		KIMS_IPpanel_MedicineAdministration_Yasasiiweb IPpanel = new KIMS_IPpanel_MedicineAdministration_Yasasiiweb(driver);

		IPpanel.Patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNo, ADTprovider);

		IPpanel.ADT();




	}

	@Test(dataProvider="getData"  , priority=1)
	public void IPpanel(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String  ADTprovider ,String docid,String docpassword,String Site,String OrdersetName,String FoUser, String Password,String NurseID) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);


		KIMS_IPpanel_MedicineAdministration_Yasasiiweb IPpanel = new KIMS_IPpanel_MedicineAdministration_Yasasiiweb(driver);
		
		IPpanel. doctoreNote(docid,docpassword,MRNo,OrdersetName);

		IPpanel.IPpanel(MRNo);

		IPpanel.Stockreceive(MRNo);

		IPpanel.IPMedicineAdministration(MRNo);

		IPpanel.BackendBillgeneration(MRNo);


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

		Object[][] data =readExcel("IP_panel");
		return data;	




	}

}

