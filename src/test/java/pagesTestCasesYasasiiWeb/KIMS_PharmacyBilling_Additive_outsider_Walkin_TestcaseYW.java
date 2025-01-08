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
import pagesOfYasasiiWeb.KIMS_PharmacyBilling_Additive_outsider_Walkin_Yasasiiweb;

public class KIMS_PharmacyBilling_Additive_outsider_Walkin_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$",Site);
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void patreg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String outsiderName1,String PROVIDER, String MRNO1,String User , String Password , String site,String authoriser,String DocUserID , String DocPassword) throws InterruptedException, IOException, AWTException {
			
		
	KIMS_PharmacyBilling_Additive_outsider_Walkin_Yasasiiweb avail = new KIMS_PharmacyBilling_Additive_outsider_Walkin_Yasasiiweb(driver);
		
	
	avail.patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNo);
	
	
	
}
@Test(dataProvider="getData"  , priority=1)
public void additive(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String outsiderName1,String PROVIDER, String MRNO1,String User , String Password , String site,String authoriser,String DocUserID , String DocPassword) throws InterruptedException, IOException, AWTException {
			
		
	KIMS_PharmacyBilling_Additive_outsider_Walkin_Yasasiiweb avail = new KIMS_PharmacyBilling_Additive_outsider_Walkin_Yasasiiweb(driver);
		
	avail.doctorNote(MRNo, site, User);
	

}

@Test(dataProvider="getData"  , priority=2)
public void walkin(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String outsiderName1,String PROVIDER, String MRNO1,String User , String Password , String site,String authoriser,String DocUserID , String DocPassword) throws InterruptedException, IOException, AWTException {
			
		
	KIMS_PharmacyBilling_Additive_outsider_Walkin_Yasasiiweb avail = new KIMS_PharmacyBilling_Additive_outsider_Walkin_Yasasiiweb(driver);
		

	avail.Outsider(outsiderName1);
	
	avail.walkin(PROVIDER, MRNo);

	avail.Availed(User, Password, site, MRNo);
	
	avail.AuthorisingRequest( User, Password, site, MRNo);
	
	
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

	Object[][] data =readExcel("Pharmacy_additive");
	return data;	
	
}

}
