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
import pagesOfYasasiiWeb.KIMS_PackageCreation_Yasassiweb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_PackageCreation_TestcaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;

 
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", Site); 
		Thread.sleep(3000); 
	} 
	@Test (dataProvider = "getData")
	public void packageCreation (String Packagename, String Name1, String Group1, String Group2, String Group3,
			String Group4, String Group5, String Group6, String Group7, String title, String Name, String lastname,
			String Dob, String DocID, String MobNo,String Address, String MRNo, String Provider, String ADTprovider, String DOCuser, String DOCpassword, String Site,String Name2,String lastname2,String DocID2,String MRNo2) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		
		KIMS_PackageCreation_Yasassiweb packageCreation = new KIMS_PackageCreation_Yasassiweb(driver);
		
		//packageCreation.packageCreationNew(Packagename,Name2);
		
		//packageCreation.groupCreationNew(Group1,Group2,Group3,Group4,Group5,Group6,Group7);
		
		//packageCreation.packageDefination(Packagename,Group1,Group2,Group3,Group4,Group5,Group6,Group7);
		
		//packageCreation.tariffSetting(Packagename);
		
		packageCreation.packageTariffMapping(Packagename);
		
		packageCreation.packageToSiteMapping(Packagename);
		
	}
	 
	@AfterClass
	public void logout() throws Exception
	{
		Thread.sleep(2000); 
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(2000); 
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		this.hm.clickLogout();

	}
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("PackageCreation");
		return data;	
	}

}
