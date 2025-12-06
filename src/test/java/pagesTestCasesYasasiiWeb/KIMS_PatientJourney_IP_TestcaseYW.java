package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.KIMS_PatientJourney_IP_Yasasiiweb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_PatientJourney_IP_TestcaseYW extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;

	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login = new LoginPageYasasiiWeb(driver);
		this.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
		Thread.sleep(3000);

	}

@Test(dataProvider="getData"  , priority=0)
	public void BirthReg(String title, String Name, String Lastname, String Dob, String DocID, String MobNo,
			String Address, String MRNo, String provider, String ADTprovider, String docid, String docpassword,
			String OrdersetName, String FoUser, String Password, String NurseID, String Pharmacist_Id,
			String Pharmacist_password, String MRDUser, String MRDPassword, String authoriser)
			throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_PatientJourney_IP_Yasasiiweb bill = new KIMS_PatientJourney_IP_Yasasiiweb(driver);

		bill.Patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNo, ADTprovider);

		bill.ADT();

	}

@Test(dataProvider="getData"  , priority=1)
	public void IPMEdication(String title, String Name, String Lastname, String Dob, String DocID, String MobNo,
			String Address, String MRNo, String provider, String ADTprovider, String docid, String docpassword,
			String OrdersetName, String FoUser, String Password, String NurseID, String Pharmacist_Id,
			String Pharmacist_password, String MRDUser, String MRDPassword, String authoriser)
			throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_PatientJourney_IP_Yasasiiweb bill = new KIMS_PatientJourney_IP_Yasasiiweb(driver);

	   bill.doctoreNote(docid, docpassword, MRNo, OrdersetName);

		bill.serviceExecution();
		
		bill.OrderBilling( MRNo);

		bill.IPpanel(Password, MRNo);

		bill.Stockreceive(MRNo);

		bill.IPMedicineAdministration(MRNo);

		bill.BackendBillgeneration(MRNo);

	}
@Test(dataProvider="getData", priority=2)
public void medicine_discontinue(String title, String Name, String Lastname, String Dob, String DocID, String MobNo,
		String Address, String MRNo, String provider, String ADTprovider, String docid, String docpassword,
		String OrdersetName, String FoUser, String Password, String NurseID, String Pharmacist_Id,
		String Pharmacist_password, String MRDUser, String MRDPassword, String authoriser)
		throws InterruptedException, IOException, AWTException {
	Thread.sleep(2000);
	
	
	KIMS_PatientJourney_IP_Yasasiiweb bill = new KIMS_PatientJourney_IP_Yasasiiweb(driver);
	

	bill.doctoreNote_discharge(docid, docpassword, MRNo);

	bill.IPpanel_DischargeMedicine(MRNo);

	bill.patient_stockreturn(MRNo);
	
	
	
	
}

@Test(dataProvider="getData"  , priority=3)
	public void Discharge(String title, String Name, String Lastname, String Dob, String DocID, String MobNo,
			String Address, String MRNo, String provider, String ADTprovider, String docid, String docpassword,
			String OrdersetName, String FoUser, String Password, String NurseID, String Pharmacist_Id,
			String Pharmacist_password, String MRDUser, String MRDPassword, String authoriser)
			throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_PatientJourney_IP_Yasasiiweb bill = new KIMS_PatientJourney_IP_Yasasiiweb(driver);
		

		bill.doctoreNote1(docid, docpassword, MRNo);
	
		bill.clinicalPharmasistclearance(MRNo, NurseID, Pharmacist_password);

		bill.readyForDischarge(MRNo, Pharmacist_Id, Pharmacist_password);

		// swa bill.dischargeApproval(MRNo, NurseID, Password , Pharmacist_Id,Pharmacist_password);

		bill.Discharge_Summary_Clearance(MRDUser, MRDPassword, MRNo, docid, docpassword);

		// swa bill.PharmacyClearance(MRNo);

		bill.ADTAppoval(MRNo);

	}

	@Test(dataProvider = "getData", priority = 4)
	public void finalbilling(String title, String Name, String Lastname, String Dob, String DocID, String MobNo,
			String Address, String MRNo, String provider, String ADTprovider, String docid, String docpassword,
			String OrdersetName, String FoUser, String Password, String NurseID, String Pharmacist_Id,
			String Pharmacist_password, String MRDUser, String MRDPassword, String authoriser)
			throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_PatientJourney_IP_Yasasiiweb bill = new KIMS_PatientJourney_IP_Yasasiiweb(driver);

		bill.FinalBilling(MRNo);

		bill.PhysicalClearance(MRNo, NurseID, Password);

	}

	@AfterClass
	public void logout() throws Exception {
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		this.hm.clickLogout();
	}

	@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("IP_Journey");
		return data;
	}

}
