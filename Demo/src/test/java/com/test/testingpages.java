package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.webutils;

public class testingpages {
	
	webutils ut;
//	public testingpages(webutils ut) {
//		
//	}
	
	
	public testingpages(webutils ut) {
		this.ut = ut;
		PageFactory.initElements(ut.getDriver(), this);
		
	}


	@FindBy(xpath = "//div[@class='header_user_info']")
	WebElement signin;

	
	public void clickingonsignIn() {
		ut.usingclickmethod(signin);
	}
	
}
