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
import pagesOfYasasiiWeb.Kims_BlockandFreeze_Yasassiweb;

public class KIMS_BlockandFreeze_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$",Site);
	Thread.sleep(3000);
	
}
 
@Test(dataProvider="getData"  , priority=0)
public void blockFreeze(String User , String Password , String cite , String MRNO,String Provider,String ProviderID,String VIP ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Kims_BlockandFreeze_Yasassiweb block = new Kims_BlockandFreeze_Yasassiweb(driver);
		
		block.Block(User, Password, MRNO);
		
		block.freeze(VIP);
		
		
}


@AfterClass
public void logout() throws Exception
{
	Robot t=new Robot();
	t.keyPress(KeyEvent.VK_ESCAPE);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(600);
	t.keyPress(KeyEvent.VK_ESCAPE);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception{

	Object[][] data =readExcel("BlockAndfreeze");
	return data;	
}

}
