package com.w2a.utilities;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class executetestng {
	
	public static void main(String[] args) {
		
		
		XmlSuite suite = new XmlSuite();
		suite.setName("Suite");
		 
		XmlTest test = new XmlTest(suite);
		test.setName("Test");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("pagesTestCasesYasasiiWeb.SP5_InventoryTestCase"));
		test.setXmlClasses(classes) ;
		
	//	And then you can pass this XmlSuite to TestNG:
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();

	}

}
