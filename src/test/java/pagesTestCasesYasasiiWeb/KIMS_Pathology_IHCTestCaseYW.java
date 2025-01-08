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
import pagesOfYasasiiWeb.KIMS_Pathology_IHCYasasiiWeb;

public class KIMS_Pathology_IHCTestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
	Thread.sleep(2000); 
	}

	

    @Test (dataProvider = "getData")
	public void Pathology(String NAME , String lastname,String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String User , String Password , String site,String SERVICE1,String technichian, String Labdoctor) throws InterruptedException, IOException {
		
		
		KIMS_Pathology_IHCYasasiiWeb ihc22 =new KIMS_Pathology_IHCYasasiiWeb(driver);
		
		ihc22.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE1);
		
		
		
		}
	
	@Test (dataProvider = "getData")
	public void inestigation(String NAME , String lastname,String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String User , String Password , String site,String SERVICE1,String technichian, String Labdoctor) throws InterruptedException, IOException, AWTException {
		
		
		KIMS_Pathology_IHCYasasiiWeb ihc22 =new KIMS_Pathology_IHCYasasiiWeb(driver);
	
		ihc22.investigtion( User, Password, MRNO);
		
		ihc22.resultEnter(MRNO, User, Password);
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
		
		
		Thread.sleep(2000);
		this.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("biopsy");
		return data;
		
		
		}
	
	
}

	


