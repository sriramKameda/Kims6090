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
import pagesOfYasasiiWeb.KIMS_pathology_biopsy_YasassiWeb;

public class KIMS_pathology_biopsy_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData" , priority=0)
	public void Pathology(String NAME , String lastname,String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String User , String Password , String site,String SERVICE1,String technichian, String Labdoctor) throws InterruptedException, IOException {
		
		
		KIMS_pathology_biopsy_YasassiWeb b22 =new KIMS_pathology_biopsy_YasassiWeb(driver);
		
		b22.patReg(NAME, lastname, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE);
		
		
		}
	
	@Test (dataProvider = "getData" ,priority=1)
	public void investigation(String NAME , String lastname,String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String User , String Password , String site,String SERVICE1,String technichian, String Labdoctor) throws InterruptedException, IOException, AWTException {
		
		
		KIMS_pathology_biopsy_YasassiWeb b22 =new KIMS_pathology_biopsy_YasassiWeb(driver);
		
		b22.investigtion( User, Password, MRNO);
		
		b22.resultEnter(MRNO, User, Password, site);
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		 
		Thread.sleep(2000);
		this.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("biopsy");
		return data;
		}
	
	
}

	


