package com.RoughYasasiiWeb;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesYasasiiWeb {
	
public static void main(String[] args) throws IOException {
		
		//System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertiesYasasiiWeb\\configYasasiiWeb.properties");
		config.load(fis);
		System.out.println(config.getProperty("browser"));
				
		Properties OR = new Properties();
		 fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertiesYasasiiWeb\\ORYasasiiWeb.properties");
		OR.load(fis);
		System.out.println(OR.getProperty("bmlBtn"));
	}

}
