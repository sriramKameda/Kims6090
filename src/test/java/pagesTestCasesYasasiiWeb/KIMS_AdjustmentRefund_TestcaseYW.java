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
import pagesOfYasasiiWeb.KIMS_AdjustmentRefund_Yasassiweb;

public class KIMS_AdjustmentRefund_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;           
		this.hm = login.enterloginDetails("admin","KAmeda123$",Site);
		
		
		Thread.sleep(3000);

	}

	@Test(dataProvider="getData"  , priority=0)
	public void Reg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo , String PROVIDER ,String ADJAMOUNT , String CARDAMOUNT , String CARDNO , String APPROVENO , String AUTHPERSON , String REMARK1, String REMARK2,String AUTHUser,String AUTHpassword,String DebitCard , String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_AdjustmentRefund_Yasassiweb Adv = new KIMS_AdjustmentRefund_Yasassiweb(driver);

		Adv.patreg(title, Name,  lastname,Dob, DocID, MobNo, Address, MRNo);

		Adv.combpay(MRNo, PROVIDER, ADJAMOUNT, CARDAMOUNT, CARDNO, APPROVENO, AUTHPERSON, REMARK1, REMARK2, AUTHUser, AUTHpassword, DebitCard, Site);


	}



	@Test(dataProvider="getData"  , priority=1)
	public void AdjustRefund(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo , String PROVIDER ,String ADJAMOUNT , String CARDAMOUNT , String CARDNO , String APPROVENO , String AUTHPERSON , String REMARK1, String REMARK2,String AUTHUser,String AUTHpassword,String DebitCard , String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);


		KIMS_AdjustmentRefund_Yasassiweb Adv = new KIMS_AdjustmentRefund_Yasassiweb(driver);

		Adv.RcmRefund(MRNo, REMARK2,  AUTHUser, AUTHpassword, DebitCard,ADJAMOUNT);

		Adv.cardmaster(MRNo, AUTHUser, AUTHpassword, DebitCard);   

		Adv.MIS( AUTHUser, AUTHpassword, MRNo, ADJAMOUNT);

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

		Object[][] data =readExcel("AdjRefund");
		return data;	
	}





}
