package com.googledocs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.googledocs.qa.base.TestBase;

public class GoogleCloudPage extends TestBase {
	//**************************************************************************************************************************
	//Page Factory method is used for locating objects (object repository)
	//**************************************************************************************************************************
	
	//@FindBy(xpath="//div[contains(@class,'title typography')]/h3")
	//WebElement FirstHeader3;
	//@FindBy(xpath="//main[@id='main']/descendant::div[contains(@class,'title typography')]/h3")
	//WebElement FirstHeader3;
	// The above two ways can also be used, I preferred below way of locating element
	@FindBy(xpath="//main[@id='main']/descendant::div[contains(@class,'grid-col md12 lg4')]/descendant::h3")
	WebElement FirstHeader3;
	@FindBy(xpath="//div[@class='hero-cta-btn hero-cta-btn-register']/parent::div/button")
	WebElement Getupdatesbutton;
	@FindBy(id="firstName")
	WebElement firstName;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="jobTitle")
	WebElement jobTitle;
	@FindBy(id="company")
	WebElement company;
	@FindBy(id="industry")
	WebElement industry;
	@FindBy(id="country")
	WebElement country;
	
	//Initializing the page objects
    public GoogleCloudPage() {
    	PageFactory.initElements(driver, this);
    }
    
  //**************************************************************************************************************************
  //Methods or operations for the above objects are written below
  //**************************************************************************************************************************
    
   
    	public String verifyHeader3Text() {
    
    	
    	return FirstHeader3.getText();                               // getting text fron paragraph
    }
    
    public  void clickOnGetUpdatesButton() {
    	//Getupdatesbutton.isDisplayed();
    	Getupdatesbutton.click();                                    // clicking on updates button
    
    	
 	   
     }
    public void enterUserDetails(String fn, String ln, String em, String jobt, String comp, String ind, String coun) {
		
    	firstName.sendKeys(fn);                                        // enter data to firstname text field
    	lastName.sendKeys(ln);
    	email.sendKeys(em);
    	jobTitle.sendKeys(jobt);
    	company.sendKeys(comp);
		
		Select industrydropdown = new Select(industry);                 // dropdown selection of industry
		industrydropdown.selectByVisibleText(ind);
		Select countrydropdown = new Select(country);                   // dropdown slection of country
		countrydropdown.selectByVisibleText(coun);
		
    }
}
