package com.baseYasasiiWeb;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryInitYasasiiWeb {
	public static Actions act;
	protected static WebDriver driver;
	
	public String URL ="http://192.168.1.111:30150/";
	public String Site ="KIMSHEALTH Trivandrum";
	public String Provider ="Radhakrishnan Marimuthu";
	public String ADTprovider ="Radhakrishnan Marimuthu(NGL18286)";
	public String ProviderID ="NGL18286";
	public String ERProvider ="Prethesh Raaj T";
	public String SeniorDoctorID ="NGL18286";
	public String JuniorDoctorID ="vijay";
	public String SecondOpinionProviderID ="NGL18086";
	public String SecondOpinionProvider ="Dr Prethesh Raaj T(NGL18086)";
	public String NurseID ="NGL17696";
	public String MRDID ="NGL18178";
	public String Pharmacist_Id ="NGL17801";
	public String Anesthetist ="NGL18349";
//	public String authoriser ="Administrator(admin)";
	public String authoriser ="Jayalakshmi P(NGL17801)";
	public String FinalbillUser ="NGL17801";
	public String Password ="KAmeda123$";
	public String PharmacyLocation ="Base_Nagercoil_Central";
	public String NursingStationLocation ="North Central pharmacy";
	public String SampleCollectionLocation ="LEVEL 2 SAMPLE COLLECTION";
	public String DischargeFollowupService ="Discharge Follow Up";
	public String BiopsyDoctor ="Aaliya";
	public String BiopsyDoctorID ="TVM2023";
	public String BiopsyTechnician ="Greeshma M Nair";
	public String Samplepreparedby ="Sumayya";
	public String Sampledespatchby ="Chithra";
	
	

	

	
	
	public static String Excelfilepath=System.getProperty("user.dir")+"\\src\\test\\resources\\excelYasasiiWeb\\SP55-KIMSDataSheet.xls";




	public PageFactoryInitYasasiiWeb(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
