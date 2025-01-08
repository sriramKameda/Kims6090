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
import pagesOfYasasiiWeb.RegistrationYasasiiWeb;

public class RegistrationTestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", "KIMSHEALTH Nagarcoil");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void BirthReg(String title,String Name,String LastName,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		RegistrationYasasiiWeb reg = new RegistrationYasasiiWeb(driver);
		
		reg.Patreg(title, Name,LastName,Dob, DocID, MobNo, Address, MRNo, Provider, ADTprovider);
		
		}

@AfterClass
public void logout() throws Exception
{ 
	
	this.hm.clickLogout();
	
}

@DataProvider
public Object[][] getData() throws Exception{

	Object[][] data =readExcel("Registration");
	return data;	
}


}