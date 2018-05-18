package com.googledocs.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.googledocs.qa.base.TestBase;
import com.googledocs.qa.pages.GoogleCloudPage;
import com.googledocs.qa.pages.GoogledocsFirstPage;
import com.googledocs.qa.util.TestUtil;

public class GoogleCloudPageTest extends TestBase{
	
	GoogleCloudPage googlecloudpage;
	GoogledocsFirstPage googledocsfirstpage;
	TestUtil testutil;
	String sheetName = "updatesinput";
	
	public GoogleCloudPageTest() {
		super(); // to call base class constructor
	}
	
	//**************************************************************************************************************************
		//Testcases for first page
		// Before every test case browser will be launched with first page https://developers.google.com/ 
	    // and click on the Click the Google Cloud Next link to navigate to devsite page
		//**************************************************************************************************************************
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		googledocsfirstpage = new GoogledocsFirstPage();
		googlecloudpage = new GoogleCloudPage();
		testutil = new TestUtil();	
		
		googledocsfirstpage.vistFirstGoogledocPage();
		Thread.sleep(6000);
	    googledocsfirstpage.clickOnGoogleCloudLink();
		Thread.sleep(6000);
	}
	
	//**************************************************************************************************************************
	//4============Confirm that the first H3 on the page is "Imagine"
	//**************************************************************************************************************************
	@Test (priority=1)
	public void verifyHear3TextTest() throws InterruptedException {
	   
		Assert.assertEquals(googlecloudpage.verifyHeader3Text(),"Imagine","Text not matched"); 
		 	
	}
	
	//**************************************************************************************************************************
	//4============Click Updates button
	//**************************************************************************************************************************
	@Test (priority=2)
		public void verifyclickOnGetUpdatesButton() {
		
			googlecloudpage.clickOnGetUpdatesButton();
			
			
				
		}
	
	//**************************************************************************************************************************
		// read data from com.googledocs.qa.testdata---excel file
	//**************************************************************************************************************************
		@DataProvider
		public Object[][] getgoogledocsUsertestData() {
			
			Object data[][] = TestUtil.getTestData(sheetName);              //googledocs.testdata.xlsx available in testdata package
			return data;
			
		}
		
		//**************************************************************************************************************************
	         //5,6===========send keys to First Name, Last Name, Email, Job Title, Company.
		     //==Finally Select Education from the Industry Drop Down and United States for Country
		//**************************************************************************************************************************
		
	  @Test (priority=3, dataProvider="getgoogledocsUsertestData")
	     public void getUpdatesforUserTest(String fn, String ln, String em, String jobt, String com, String ind, String coun) throws InterruptedException  {
		
		//googlecloudpage.clickOnGetUpdatesButton(); // if above method is not written , Updates button can be clicked here
		//Thread.sleep(3000);
		//contact.createNewContact ("myname","lmns","myname@gmail.com","QA","XYZ","Education","United States");
		
	
		   googlecloudpage.enterUserDetails(fn,ln, em, jobt,com, ind, coun);
		
	   }
	    //**************************************************************************************************************************
		//close the browser after each methos or testcase
		//**************************************************************************************************************************
	     @AfterMethod
	    public void closeBrowser() {
		driver.close();
		
	}
}
