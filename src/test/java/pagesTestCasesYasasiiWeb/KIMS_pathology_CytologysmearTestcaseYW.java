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
import pagesOfYasasiiWeb.KIMS_pathology_Cytologysmear_YasasiiWeb;


public class KIMS_pathology_CytologysmearTestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	KIMS_pathology_CytologysmearTestcaseYW.login =new LoginPageYasasiiWeb(driver) ;
	KIMS_pathology_CytologysmearTestcaseYW.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData" ,priority=0)
	public void Pathology(String NAME ,String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String User , String Password , String site,String Labdoctor, String technichian) throws InterruptedException, IOException, AWTException {
		
		
		KIMS_pathology_Cytologysmear_YasasiiWeb cs22 =new KIMS_pathology_Cytologysmear_YasasiiWeb(driver);
		
		cs22.patReg(NAME, lastname, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE, PROVIDER);
	
		}
	
	@Test (dataProvider = "getData",priority=1)
	public void inestigation(String NAME ,String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String User , String Password , String site, String Labdoctor, String technichian) throws InterruptedException, IOException {
		
		
		KIMS_pathology_Cytologysmear_YasasiiWeb cs22 =new KIMS_pathology_Cytologysmear_YasasiiWeb(driver);
		
		cs22.investigtion(User, Password, MRNO );
		
		cs22.resultEnter(MRNO, User, Password, site);
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		KIMS_pathology_CytologysmearTestcaseYW.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Cytologysmear");
		return data;
		}
	
	
}

	


