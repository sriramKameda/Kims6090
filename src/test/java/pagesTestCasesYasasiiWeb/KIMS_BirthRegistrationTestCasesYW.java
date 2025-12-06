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
import pagesOfYasasiiWeb.KIMS_BirthRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_BirthRegistrationTestCasesYW extends TestBaseYasasiiWeb {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;

	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login = new LoginPageYasasiiWeb(driver);
		this.hm = login.enterloginDetails("admin", "KAmeda123$", Site);
		Thread.sleep(3000);

	}

	@Test(dataProvider = "getData", priority = 0)
	public void BirthReg(String title, String NAME, String lastName, String DOB, String MBLNO, String ADDRESS,
			String DOCno, String MRNO, String Provider, String MRNo1, String ADTprovider, String nurseUser,
			String password, String AdminUser, String AdminPassword, String DOCuser, String DOCpassword, String Site,
			String MRDUser, String MRDPassword, String FinalbillUser)
			throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_BirthRegistrationYasasiiWeb Schedule1 = new KIMS_BirthRegistrationYasasiiWeb(driver);

		Schedule1.patreg(title, NAME, lastName, DOB, MBLNO, ADDRESS, DOCno, MRNo1);

	}

	@Test(dataProvider = "getData", priority = 1)
	public void Doctornote(String title, String NAME, String lastName, String DOB, String MBLNO, String ADDRESS,
			String DOCno, String MRNo, String Provider, String MRNo1, String ADTprovider, String nurseUser,
			String password, String AdminUser, String AdminPassword, String DOCuser, String DOCpassword, String Site,
			String MRDUser, String MRDPassword, String FinalbillUser)
			throws InterruptedException, IOException, AWTException {
		Thread.sleep(5000);

		KIMS_BirthRegistrationYasasiiWeb Schedule1 = new KIMS_BirthRegistrationYasasiiWeb(driver);

		Schedule1.pregnantNOTE(NAME, MRNo, Provider, DOCuser, DOCpassword);

		Schedule1.DeliveryNOTE();

		Schedule1.Birthreg(MRNo, Provider, ADTprovider, MRNo1, AdminUser, AdminPassword);
	}

	@Test(dataProvider = "getData", priority = 2)
	public void babynote(String title, String NAME, String lastName, String DOB, String MBLNO, String ADDRESS,
			String DOCno, String MRNO, String Provider, String MRNo1, String ADTprovider, String nurseUser,
			String password, String AdminUser, String AdminPassword, String DOCuser, String DOCpassword, String Site,
			String MRDUser, String MRDPassword, String FinalbillUser) throws InterruptedException, IOException {
		Thread.sleep(5000);

		KIMS_BirthRegistrationYasasiiWeb Schedule1 = new KIMS_BirthRegistrationYasasiiWeb(driver);

		Schedule1.babyNote(MRNo1, DOCuser, DOCpassword);

		Schedule1.immunizationchart();

	}

	@Test(dataProvider = "getData", priority = 3)
	public void Babydischarge(String title, String NAME, String lastName, String DOB, String MBLNO, String ADDRESS,
			String DOCno, String MRNo, String Provider, String MRNo1, String ADTprovider, String nurseUser,
			String password, String AdminUser, String AdminPassword, String DOCuser, String DOCpassword, String Site,
			String MRDUser, String MRDPassword, String FinalbillUser)
			throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_BirthRegistrationYasasiiWeb Schedule1 = new KIMS_BirthRegistrationYasasiiWeb(driver);

		Schedule1.dischargeRecommendationBaby(MRNo1, nurseUser, DOCuser, DOCpassword);

		Schedule1.dischargeApprovalBaby(MRNo1, nurseUser, AdminUser, AdminPassword);

		Schedule1.clinicalPharmasistclearance(MRNo1, nurseUser, AdminUser, AdminPassword);

		Schedule1.readyForDischarge(MRNo1, nurseUser, AdminUser, AdminPassword);

		Schedule1.Discharge_Summary_Clearance(MRDUser, MRDPassword, MRNo1, DOCuser, DOCpassword, nurseUser,MRDPassword);

		Schedule1.ADTapproval(MRNo1, FinalbillUser, AdminUser, AdminPassword);

		Schedule1.financialClearance(MRNo1, FinalbillUser);

		Schedule1.physicalDischarge(MRNo1, nurseUser, AdminUser, AdminPassword, DOCuser, DOCpassword);
		
	}

	@Test(dataProvider = "getData", priority = 4)
	public void MOMdischarge(String title, String NAME, String lastName, String DOB, String MBLNO, String ADDRESS,
			String DOCno, String MRNo, String Provider, String MRNo1, String ADTprovider, String nurseUser,
			String password, String AdminUser, String AdminPassword, String DOCuser, String DOCpassword, String Site,
			String MRDUser, String MRDPassword, String FinalbillUser)
			throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_BirthRegistrationYasasiiWeb Schedule = new KIMS_BirthRegistrationYasasiiWeb(driver);

		Schedule.dischargeRecommendationMOM(MRNo, nurseUser, DOCuser, DOCpassword, AdminUser, AdminPassword);

		Schedule.dischargeApprovalMOM(MRNo, nurseUser, MRDPassword, AdminUser, AdminPassword);

		Schedule.clinicalPharmasistclearanceMOM(MRNo, nurseUser, AdminUser, AdminPassword);

		Schedule.readyForDischargeMOM(MRNo, nurseUser, AdminUser, AdminPassword);

		Schedule.Discharge_Summary_Clearance_MOM(MRDUser, MRDPassword, MRNo, DOCuser, DOCpassword, nurseUser);

		Schedule.ADTapprovalMOM(MRNo, nurseUser, AdminUser, AdminPassword);

		Schedule.financialClearanceMOM(MRNo, AdminUser, AdminPassword);

		Schedule.physicalDischargeMOM(MRNo, nurseUser);

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

		Object[][] data = readExcel("BirthRegistration");
		return data;
	}

}