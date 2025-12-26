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
import pagesOfYasasiiWeb.KIMS_CommisionMaster_Yasassiweb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_CommisionMaster_TestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;

 
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", Site); 
		Thread.sleep(3000); 
	}  
	
	@Test (dataProvider = "getData")
	public void CommissionRuleMaster (String RuleName,String Department) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000);  

		KIMS_CommisionMaster_Yasassiweb Commission = new KIMS_CommisionMaster_Yasassiweb(driver);
		
		Commission.CreateRule(RuleName,Department);
		
		Commission.reverseDeleteRule(RuleName);
		
	
	}
	
	@AfterClass
	public void logout() throws Exception
	{
		Thread.sleep(2000); 
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(2000); 
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		this.hm.clickLogout();

	}
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Commission");
		return data;	
	}

}


