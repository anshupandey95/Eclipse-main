package com.test;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

import Utility.webutils;
public class Base {
	Properties prop;
	
	 protected webutils ut;
	public WebDriver driver;
	
   @BeforeClass
	public void test() throws IOException {
		ut= new webutils();
		ut.launchBrowser(ut.getConfiValue("driver"));
		ut.maximaize();
		ut.openURL(ut.getConfiValue("url"));
		
		
		
		
		
		
	}
   
   public void grtproperties() {
	    prop = new Properties();
	   FileInputStream fi = null;
	try {
		fi = new  FileInputStream("./config/con.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   try {
		prop.load(fi);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
   public String getconfigvalue(String Keyname) {
	   if(prop==null) {
		   grtproperties();
		   
	   }
	   return prop.getProperty(Keyname);
   }
   
   
   
   
	
		
	//WebDriverManager.chromedriver().setup();
	 
	 

}
