package com.googledocs.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.googledocs.qa.base.TestBase;
import com.googledocs.qa.pages.GoogleCloudPage;
import com.googledocs.qa.pages.GoogledocsFirstPage;
import com.googledocs.qa.util.TestUtil;

public class GoogledocsFirstPageTest extends TestBase {
	
	GoogledocsFirstPage googledocsfirstpage;
	GoogleCloudPage googlecloudpage;
	TestUtil testutil;
	
	public GoogledocsFirstPageTest() {
		super(); // to call base class constructor
	}
	//**************************************************************************************************************************
	//Testcases for first page
	// Before every test case browser will be launched with first page https://developers.google.com/
	//**************************************************************************************************************************
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		googledocsfirstpage = new GoogledocsFirstPage();
		googlecloudpage = new GoogleCloudPage();
		testutil = new TestUtil();
		
	//1========== Navigated to https://developers.google.com/
		googledocsfirstpage.vistFirstGoogledocPage();
	  
		Thread.sleep(5000);
	}
	//**************************************************************************************************************************
	//2=============To verify Under events, confirm that the text is equal to "Hone your skills on the latest cloud technologies
	//**************************************************************************************************************************
	@Test (priority=1)
	public void verifyTextUnderEventsTest() throws IOException  {
		String actualtext = prop.getProperty("Eventtext");
			
	    try{
				String text = googledocsfirstpage.verifyTextUnderEvents();
		Assert.assertEquals(text,actualtext ,"Text not matched");
		} catch(Exception e) {
			e.printStackTrace();
		
				testutil.takeScreenshotAtEndOfTest();
			
			}
			
		}
	//**************************************************************************************************************************
	//3 ==================Click the Google Cloud Next '18 July 24-26 | San Francisco, USA
	//**************************************************************************************************************************
	@Test (priority=2)
	public void verifyclickOnGoogleCloudLinkTest() throws InterruptedException {
		googlecloudpage= googledocsfirstpage.clickOnGoogleCloudLink();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(driver.getTitle(), "Google Cloud Next ’18 | July 24–26 San Francisco","link not clicked");
			
	}
    
	//**************************************************************************************************************************
	//close the browser after each method or testcase
	//**************************************************************************************************************************
    @AfterMethod
    public void closeBrowser() {
	driver.close();
	
}

}
