package com.baseYasasiiWeb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.*;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.w2a.utilities.ScreenshotTaker;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;


public class TestBaseYasasiiWeb {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static org.apache.logging.log4j.Logger log=org.apache.logging.log4j.LogManager.getLogger(TestBaseYasasiiWeb.class);
	protected static String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\excelYasasiiWeb\\SP55-KIMSDataSheet.xls";
	public static WebDriverWait wait;
	public static ExtentReports rep; 
	public static ExtentTest test; 
	public static Fillo fillo=new Fillo();
	public String browserType;
	public String chromeversion =" 104.0.5112.102";
	public static String screenshotPath;
	public String ProviderID ="NGL18286";
	public String FinalbillUser ="NGL17801";

	///Site
	 
	public String Site ="KIMSHEALTH Nagercoil";
	
	public static String testname;


	@BeforeTest
	public static void startTest()
	{
		rep=new ExtentReports(System.getProperty("user.dir")+"\\target\\target\\extent-reports\\extentReport.html", true);
		
		System.out.println(System.getProperty("user.dir"));

		
		
		rep=new ExtentReports("C:\\Users\\sriram\\eclipse-workspace\\KimsYasasiiWeb-Sprint55.4\\target\\extent-reports\\extentReport.html", true);
		 
		rep=new ExtentReports("C:\\Users\\sriram\\Documents\\extentReport.html", true);
		 

		
	}

	@Parameters("browser")
	@BeforeSuite

	public void setup() {

		PropertyConfigurator.configure(  TestBaseYasasiiWeb.class.getClassLoader().getResource("propertiesYasasiiWeb/log4j.properties"));
		    log.info("Log4j initialized successfully");
		
		
		if(driver==null) {


			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertiesYasasiiWeb\\configYasasiiWeb.properties");
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			try {
				config.load(fis);
				log.debug("Config file loaded...");
			} catch (IOException e) {

				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertiesYasasiiWeb\\ORYasasiiWeb.properties");
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			try {
				OR.load(fis);
				log.debug("OR file loaded...");
			} catch (IOException e) {

				e.printStackTrace();
			}

			if(config.getProperty("browser").equals("firefox")) {
				FirefoxOptions fireop = new FirefoxOptions();
		        String opt[] = new String[] { "-test-type", "test-type=browser", "-disable-default-apps",
		                "-enable-precise-memory-info", "-js-flags=-expose-gc", "-disable-infobars", "-start-maximized",
		                "-ignore-certificate-errors", "-disable-popup-blocking", "-allow-running-insecure-content",
		                "-disable-notifications", "-disable-save-password", "-disable-translate", "-always-authorize-plugins" };
		        fireop.addArguments(opt);
				// System.setProperty("webdriver.gecko.driver","gecko.exe"); 
				this.driver=new FirefoxDriver(fireop);


			}
			else if (config.getProperty("browser").equals("chrome")) {
				WebDriverManager.chromedriver().driverVersion(chromeversion).setup();
				ChromeOptions chrop = new ChromeOptions();
				
		        String opt[] = new String[] { "-test-type", "test-type=browser", "-disable-default-apps",
		                "-enable-precise-memory-info", "-js-flags=-expose-gc", "-disable-infobars", "-start-maximized",
		                "-ignore-certificate-errors", "-disable-popup-blocking", "-allow-running-insecure-content",
		                "-disable-notifications", "-disable-save-password", "-disable-translate", "-always-authorize-plugins",
		             /*   "--headless", "--window-size=1920,1200", "--start-maximize " */ };
		        chrop.addArguments(opt);
 
		       // chrop.addArguments("headless");
		        
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executablesYasasiiWeb\\chromedriver.exe");
				
				this.driver= new ChromeDriver(chrop);
				log.debug("Chrome launched..");
				
				//System.out.println("Current pagr Title:" + driver.getTitle());
				
				
			}


			driver.get(config.getProperty("testsiteurl"));
			log.debug("Navigated to:"+ config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
			wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		

		}	

	}
	public boolean isElementPresent(By by) {
		try 
		{ 
			driver.findElement(by);
			return   true; 
		}
		catch(NoSuchElementException e){

			return false;
		}
	}
	public String[][] readExcel (String sheetName) throws Exception
	{

		String[][] data=null;
		try {	
			FileInputStream fs=new FileInputStream(filepath);
			jxl.Workbook wb=jxl.Workbook.getWorkbook(fs);
			Sheet excel=wb.getSheet(sheetName);
			int rows = excel.getRows();
			int cols = excel.getColumns();
			data=new String[rows-1][cols];
			for (int rowNum = 1; rowNum < rows; rowNum++) { 
				for (int colNum = 0; colNum < cols; colNum++) {
					data[rowNum - 1][colNum] = excel.getCell(colNum, rowNum).getContents();
				}


			}
		}
		catch(Exception e) {

			e.printStackTrace();
			log.debug("Error is running excel sheet:"+e);
		}
		return data;
	}


	@BeforeMethod
	public void getTestMethodProperties(Method method) {
		this.testname=method.getName();
		test=rep.startTest(testname);
		
	}



	@AfterMethod 
	public void getResult(ITestResult res) throws IOException { 
		if(res.getStatus()==ITestResult.SUCCESS) {
			//String methodName = res.getTestName();
			//Markup m = MarkupHelper.createLabel(text,ExtentColor.Green);
			test.log(LogStatus.PASS,"Pass test is"+res.getTestName());
		}
		if(res.getStatus()==ITestResult.FAILURE) { 
			test.log(LogStatus.FAIL,"Failed test is"+res.getTestName()); 
			String screenshotPath=ScreenshotTaker.captureScreenshot(this.driver, this.testname);
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath) +"Test Failed"); 
			} 
		if(res.getStatus()==ITestResult.SKIP) {
			test.log(LogStatus.SKIP,"Skip test is"+res.getTestName());
		}
		
		rep.endTest(test);
	
		
		}
	
	

	@AfterSuite(alwaysRun = true)
	public void extentReportEnd() {
//	rep.endTest(test);
//		rep.flush(); 
//		rep.close();1
		rep.flush();
		 if (rep != null) {
		        rep.close();  
		 }// close once
	}



	//@AfterSuite(alwaysRun = true)

	public void teardown() {

	if(driver!=null)
	{
			driver.quit();
		}

	
	
		log.debug("Test execution completed");
		
	}

	
}
