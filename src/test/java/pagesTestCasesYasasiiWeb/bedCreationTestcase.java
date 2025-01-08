package pagesTestCasesYasasiiWeb;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.bedCreation;

public class bedCreationTestcase extends TestBaseYasasiiWeb {
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateMasterServicePage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
	Thread.sleep(3000);
		
	}
	
	
	
	
	@Test//(dataProvider="getData")
	public void bedCreation()throws InterruptedException, IOException {
		
		
		 bedCreation BC =new  bedCreation(driver);
		 BC.bed();
		 
	//	BC.ultradeluxe();
		 
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


//	@DataProvider
//	public Object[][] getData() throws Exception{
//
//		Object[][] data =readExcel("ServiceMaster");
//		return data;	
//	}
	
	

}
