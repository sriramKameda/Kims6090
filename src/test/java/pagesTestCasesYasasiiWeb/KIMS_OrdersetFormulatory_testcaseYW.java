package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.KIMS_OrdersetFormulatory_YasassiWeb;

public class KIMS_OrdersetFormulatory_testcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$",Site);
	Thread.sleep(2000); 
	}

	@Test (dataProvider = "getData")
	public void Patreg(String title, String Name, String lastname, String Dob, String DocID, String MobNo,String Address, String MRNO, String Provider,String ORDERNAME, String User ,String Password,String sitename , String medicine1,String medicine2,String service1,String service2) throws InterruptedException, IOException, AWTException {
		
		
		KIMS_OrdersetFormulatory_YasassiWeb os = new KIMS_OrdersetFormulatory_YasassiWeb(driver);
		
		os.Patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNO);
		
		}
	

	@Test (dataProvider = "getData")
	public void orderset(String title, String Name, String lastname, String Dob, String DocID, String MobNo,String Address, String MRNO, String Provider,String ORDERNAME, String User ,String Password,String sitename , String medicine1,String medicine2,String service1,String service2) throws InterruptedException, IOException, AWTException {
		
		
		KIMS_OrdersetFormulatory_YasassiWeb os = new KIMS_OrdersetFormulatory_YasassiWeb(driver);
		
		os.orderset(ORDERNAME, sitename, MRNO, medicine1, medicine2, service1, service2);
		
		
		}
	
		
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		this.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Orderset");
		return data;
		}
	
	
}


