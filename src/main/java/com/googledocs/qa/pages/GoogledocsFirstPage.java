package com.googledocs.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.googledocs.qa.base.TestBase;

public class GoogledocsFirstPage extends TestBase{
	//**************************************************************************************************************************
	//Page Factory method is used for locating objects (object repository)
	//**************************************************************************************************************************
	
	@FindBy(xpath="//div[@class='devsite-landing-row-item-description-content']/p[1]")
	WebElement EventText;
	@FindBy(id="google-cloud-next-18br-july-24-26-san-francisco-usa")
	WebElement GoogleCloudLink;
	
	 //Initializing the page objects
    public GoogledocsFirstPage() {
    	PageFactory.initElements(driver, this);
    }
    
    //**************************************************************************************************************************
    //Methods or operations for the above objects are written below
    //***********************************************************************************************************************
    
    public void vistFirstGoogledocPage() {
    	driver.get(prop.getProperty("url"));        // navigating to first page
    }
    
    
    public String verifyTextUnderEvents() {
    	
    	return EventText.getText();                 // to retrieve the text from paragraph using getText() method
    }
    
    public GoogleCloudPage clickOnGoogleCloudLink() {
    	
	   GoogleCloudLink.click();                     // clicking on the link
	   
	    return new GoogleCloudPage();                // will return next landing page object
    	
    }
	

}
