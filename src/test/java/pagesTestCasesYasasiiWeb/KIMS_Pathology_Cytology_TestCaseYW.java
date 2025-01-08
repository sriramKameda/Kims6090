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
import pagesOfYasasiiWeb.KIMS_pathology_Cytology_YasasiiWeb;

public class KIMS_Pathology_Cytology_TestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	KIMS_Pathology_Cytology_TestCaseYW.login =new LoginPageYasasiiWeb(driver) ;
	KIMS_Pathology_Cytology_TestCaseYW.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
	Thread.sleep(2000); 
	}

	
	@Test (dataProvider = "getData",priority=0)
	public void Pathology(String NAME ,String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String User , String Password , String site ,String User1 , String Password1 , String ADTprovider,String technichian,String Labdoctor) throws InterruptedException, IOException, AWTException {
		
		
		KIMS_pathology_Cytology_YasasiiWeb c22 =new KIMS_pathology_Cytology_YasasiiWeb(driver);
		
		c22.patReg(NAME, lastname,AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE);

		}
	
	@Test (dataProvider = "getData",priority=1)
	public void inestigation(String NAME ,String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String User , String Password , String site,String User1 , String Password1, String ADTprovider,String technichian,String Labdoctor) throws InterruptedException, IOException, AWTException {
		
		
		KIMS_pathology_Cytology_YasasiiWeb c22 =new KIMS_pathology_Cytology_YasasiiWeb(driver);
		
		c22.investigtion(User, Password, MRNO);
		
		c22.resultEnter(MRNO,  User, Password);
		
		c22.cancerRegistryView( User1, Password1, MRNO);
		
		
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		KIMS_Pathology_Cytology_TestCaseYW.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Cytology");
		return data;
		}
	
	
}

	


