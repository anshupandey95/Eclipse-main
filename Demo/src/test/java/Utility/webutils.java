package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class webutils {
	private WebDriver driver;
	private Properties prop;
	public ExtentTest test;
	
	
	public ExtentReports report;
	public ExtentSparkReporter htmlreporter ;
	

	public WebDriver getDriver() {
		return driver;
	}

	public void maximaize() {

		driver.manage().window().maximize();
	}

	public void launchBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}

	}
	

	public void getProperties() {
		prop = new Properties();
		InputStream in = null;
		try {
			in = new FileInputStream("./configurations/config.properties");
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getConfiValue(String keyName) {
		if (prop == null) {
			getProperties();

		}
		return prop.getProperty(keyName);

	}
	
	

	public void usingclickmethod(WebElement we) {
		we.click();

	}

	public void usingsendkeys(WebElement we, String elementName, String value) {
		we.sendKeys(value);

	}
	
	
	public void openURL(String url) {
		driver.get(url);
	}
	
	
	
	
	
	public void captureScreenShot(String testName) throws IOException
	{
		//step1: convert webdriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//step2: call getScreenshotAs method to create image file
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");
		//File dest = new File(  "./screening/"  + ".png");
	
		//step3: copy image file to destination
		FileUtils.copyFile(src, dest);
	}
	
//	public void reporting() {
//		String timeStamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format( new Date());
//		String reportname = "Mydemoreport" +timeStamp + ".html";
//		htmlreporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//ReportingData" + reportname);
//		report = new ExtentReports();
//		report.attachReporter(htmlreporter);
//		htmlreporter.config().setTheme(Theme.DARK);
//		 
//		
//		
//	}
//	
	
	

	
	
	
	

}
