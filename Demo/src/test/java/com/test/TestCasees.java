package com.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Utility.listnerss.class)
public class TestCasees extends Base{
	
	@Test
	public void TestCase_1() throws IOException, InterruptedException {
		
		testingpages page = new testingpages(ut);
		page.clickingonsignIn();
		Thread.sleep(4000);
		ut.captureScreenShot("TestCase_1");
		Assert.assertTrue(false);
	}

}
