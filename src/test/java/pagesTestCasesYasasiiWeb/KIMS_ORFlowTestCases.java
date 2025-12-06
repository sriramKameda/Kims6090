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
import pagesOfYasasiiWeb.KIMS_ORFlow_Yasasiiweb;

public class KIMS_ORFlowTestCases extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateFOPage() throws InterruptedException {

		KIMS_ORFlowTestCases.login =new LoginPageYasasiiWeb(driver) ;
		KIMS_ORFlowTestCases.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
		Thread.sleep(2000);


	}



	//	@Test(dataProvider="getData",priority=0)
	public void ORMASTER(String ServiceName, String PrefcardName,String ParameterRulename,String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String MajorProcedure ,String ADTprovider,String docid,String docpassword,String User , String Password,String Site,String Medicine,String refProvider,String anesthesiaID , String anesthesiapassword,String ORAdmin, String ORpassword,String Nuruser ,String Nurpassword,String ReferalID, String Referalpassword) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_ORFlow_Yasasiiweb OR = new KIMS_ORFlow_Yasasiiweb(driver) ;

		OR.serviceMasterOR(ServiceName);

		OR.OR_Master(ServiceName, PrefcardName);

		OR.AttendeeSplitup();

		OR.OR_ParameterSetting(ParameterRulename, ServiceName);

	}



	@Test(dataProvider="getData",priority=1)
	public void foReg(String ServiceName, String PrefcardName,String ParameterRulename,String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String MajorProcedure ,String ADTprovider,String docid,String docpassword,String User , String Password,String Site,String Medicine,String refProvider,String anesthesiaID , String anesthesiapassword,String ORAdmin, String ORpassword,String Nuruser ,String Nurpassword,String ReferalID, String Referalpassword) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_ORFlow_Yasasiiweb reb = new KIMS_ORFlow_Yasasiiweb(driver) ;

		reb.patReg(NAME, lastname, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, User);

		reb.ADT();

	}

	@Test(dataProvider="getData",priority=2)
	public void doc(String ServiceName, String PrefcardName,String ParameterRulename,String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String MajorProcedure ,String ADTprovider,String docid,String docpassword,String User , String Password,String Site,String Medicine,String refProvider,String anesthesiaID , String anesthesiapassword,String ORAdmin, String ORpassword,String Nuruser ,String Nurpassword,String ReferalID, String Referalpassword) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);
		KIMS_ORFlow_Yasasiiweb docnote= new KIMS_ORFlow_Yasasiiweb(driver);

		docnote.addingmajorprocedure(MRNO, ServiceName, Medicine, refProvider, docid, docpassword, Nuruser,PrefcardName);

		docnote.anesthesiafitness(MRNO, anesthesiaID, anesthesiapassword);

	}

	@Test(dataProvider="getData",priority=3)
	public void or(String ServiceName, String PrefcardName,String ParameterRulename,String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String MajorProcedure ,String ADTprovider,String docid,String docpassword,String User , String Password,String Site,String Medicine,String refProvider,String anesthesiaID , String anesthesiapassword,String ORAdmin, String ORpassword,String Nuruser ,String Nurpassword,String ReferalID, String Referalpassword) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);
		KIMS_ORFlow_Yasasiiweb orsch= new KIMS_ORFlow_Yasasiiweb(driver);

		orsch.ORSchedule(ORAdmin, ORpassword, MRNO);

		orsch.StockTransfer(User, Password, MRNO);

	}



	@Test(dataProvider="getData",priority=4)
	public void OR_ROOm(String ServiceName, String PrefcardName,String ParameterRulename,String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String MajorProcedure ,String ADTprovider,String docid,String docpassword,String User , String Password,String Site,String Medicine,String refProvider,String anesthesiaID , String anesthesiapassword,String ORAdmin, String ORpassword,String Nuruser ,String Nurpassword,String ReferalID, String Referalpassword) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);
		KIMS_ORFlow_Yasasiiweb orsch= new KIMS_ORFlow_Yasasiiweb(driver);

		orsch.operationroomprocess(MRNO, Nuruser, Nurpassword);
		
		orsch.referalLogin(ReferalID, Referalpassword, MRNO);

		orsch.OR_billing(User, Password, MRNO);


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

		Object[][] data =readExcel("OR");
		return data;	
	}	

}