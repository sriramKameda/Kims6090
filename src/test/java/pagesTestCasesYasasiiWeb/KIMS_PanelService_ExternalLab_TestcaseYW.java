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
import pagesOfYasasiiWeb.KIMS_PanelService_ExternalLab_Yasasiiweb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_PanelService_ExternalLab_TestcaseYW extends TestBaseYasasiiWeb   {
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	

	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
	Thread.sleep(2000); 
	}

	
	@Test (dataProvider = "getData" , priority=0)
	public void Patreg(String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String ADTprovider,String docid,String docpassword,String User , String Password , String site ) throws InterruptedException, IOException, AWTException {
		
		
		KIMS_PanelService_ExternalLab_Yasasiiweb ST =new KIMS_PanelService_ExternalLab_Yasasiiweb(driver);
		
		ST.patReg(NAME, lastname, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE);
		
		ST.ADT();
		
		
		}
	
	@Test (dataProvider = "getData" , priority=1)
	public void investigation(String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE, String ADTprovider,String docid,String docpassword,String User , String Password , String site ) throws InterruptedException, IOException, AWTException {
		
		
		KIMS_PanelService_ExternalLab_Yasasiiweb ST =new KIMS_PanelService_ExternalLab_Yasasiiweb(driver);
		
		ST.doctoreNote(docid, docpassword, MRNO,SERVICE);
		
		ST.investigtion(User, Password, MRNO);
		
		
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

		Object[][] data =readExcel("Panel");
		return data;
		}
	

}
