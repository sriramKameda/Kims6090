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
import pagesOfYasasiiWeb.KIMS_EMRBlockandFreeze_YasasiiWeb;
import pagesOfYasasiiWeb.KIMS_WhiteboardStat_yasasiiweb;

public class KIMS_WhiteboardStat_TestCaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("NGL18286","KAmeda123$",Site);
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData" , priority=0)
public void EMRBlock(String MRNo,String nurseUser,String password,String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		KIMS_WhiteboardStat_yasasiiweb Stat = new KIMS_WhiteboardStat_yasasiiweb(driver);
		
		Stat.DoctorReferral(MRNo);
		
		Stat.Whiteboard(MRNo);
		
		Stat.roomstatus();
		
		
		
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

	Object[][] data =readExcel("Stat");
	return data;	

 


}

}
