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
import pagesOfYasasiiWeb.KIMS_pathology_FrozenYasasiiWeb;


public class KIMS_pathology_FrozenTestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	KIMS_pathology_FrozenTestcaseYW.login =new LoginPageYasasiiWeb(driver) ;
	KIMS_pathology_FrozenTestcaseYW.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData" ,priority=1)
	public void Pathology(String NAME , String Lastname,String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String User , String Password , String site,String User1,String Password1, String technichian,String Labdoctor) throws InterruptedException, IOException, AWTException {
		
		
		KIMS_pathology_FrozenYasasiiWeb fro =new KIMS_pathology_FrozenYasasiiWeb(driver);
		
		
		fro.patReg(NAME, Lastname, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE, PROVIDER);
	
		
		}
	
	@Test (dataProvider = "getData",priority=2)
	public void investigation(String NAME , String Lastname,String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String User , String Password , String site,String User1,String Password1,String technichian, String Labdoctor) throws InterruptedException, IOException {
		
		
		KIMS_pathology_FrozenYasasiiWeb fro2 =new KIMS_pathology_FrozenYasasiiWeb(driver);
		
		fro2.investigtion(User, MRNO, User1, Password1);
		
		fro2.resultEnter(MRNO, User, Password);
		
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		KIMS_pathology_FrozenTestcaseYW.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Frozen");
		return data;
		}
	
	
}

	


