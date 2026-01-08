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
import pagesOfYasasiiWeb.KIMS_SecondOpinion_Yasasiiweb;

    public class KIMS_SecondOpinion_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
    public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", Site); 
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNO,String Provider ,String Provider1, String User , String Password , String site, String NURSEUser,String User1,String AdminID) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_SecondOpinion_Yasasiiweb MDT = new KIMS_SecondOpinion_Yasasiiweb(driver);
		
		MDT.patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNO);
		
		MDT.encounter(Provider1);
		
		
		}

@Test(dataProvider="getData"  , priority=1)
public void SecondOpinion(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNO,String Provider ,String Provider1, String User , String Password , String site, String NURSEUser,String User1, String AdminID) throws InterruptedException, IOException, AWTException {
	
	
	    Thread.sleep(2000);
		
		KIMS_SecondOpinion_Yasasiiweb MDT = new KIMS_SecondOpinion_Yasasiiweb(driver);
		
	    MDT.docnote(User, Password, MRNO, User1, Provider1);
		
		MDT.secondopinion( User1, Password, MRNO);
		
		MDT.fileReadRequest(User, Password, MRNO);
		
		MDT.secondopinion1(User1, Password, MRNO);
		
		MDT.secondopinion_Comments_View(User, Password, MRNO);
	
		MDT.ReferalEncounter(AdminID, Password, MRNO);
		
		MDT.ReferalDoctor(User1, Password, MRNO);
		
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

	Object[][] data =readExcel("SecondOpion");
	return data;	
}

}
