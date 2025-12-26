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
import pagesOfYasasiiWeb.KIMS_DialysisNote_YasasiiWeb;

public class KIMS_DialysisNote_TestcaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$",Site);
	Thread.sleep(3000); 
	}
	
	
	
	@Test (dataProvider = "getData", priority=0)
	public void PAtreg(String title, String Name, String lastname, String Dob, String DocID, String MobNo,String Address, String MRNo, String Provider,String User,String Password,String site,String Service) throws InterruptedException, IOException, AWTException {
		
		Thread.sleep(3000); 
		
		KIMS_DialysisNote_YasasiiWeb   dia= new KIMS_DialysisNote_YasasiiWeb (driver);
	  
		dia.PatReg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo);
	
		
	
	}
	
	@Test (dataProvider = "getData",priority=1)
	public void DialysisNote(String title, String Name, String lastname, String Dob, String DocID, String MobNo,String Address, String MRNo, String Provider,String User,String Password,String site,String Service) throws InterruptedException, IOException {
		
		Thread.sleep(3000); 
		KIMS_DialysisNote_YasasiiWeb   dia= new KIMS_DialysisNote_YasasiiWeb (driver);
		
		dia.DialysisNote( MRNo, Service);
		
		
		}
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
	
		this.hm.clickLogout();
	
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("dialysis");
		return data;	
	}
	
	
	 

	}
