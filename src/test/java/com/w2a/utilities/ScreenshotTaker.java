package com.w2a.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotTaker {
	
	public static String screenshotName;
public static String captureScreenshot(WebDriver driver, String name) throws IOException {
		
		String newFilePath = null;
		try{
			 File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				screenshotName =name + new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				newFilePath= System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\" + screenshotName +".png";
				FileUtils.copyFile(scrFile, new File(newFilePath));
						    }
		    catch(Exception e){
		        //if it fails to take screenshot then this block will execute
		        System.out.println("Failure to take screenshot "+e);
		    }
		    return newFilePath;
		}


}
