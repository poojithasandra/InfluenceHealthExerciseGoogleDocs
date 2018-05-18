# InfluenceHealthExerciseGoogleDocs
GoogleDocsPageQA - InfluenceHealthExerciseGoogleDocs

Project : Googledocs Web application Automation Testing

Approach :

Page Object Model Pattern with Page Factory +Selenium webdriver with Java + Data driven + TestNG tests

 
Prerequisites : Eclipse IDE and Maven

                Itegrate Maven with Eclipse IDE
               Eclipse--> Help--> Install New software
               ---> enter work with as  http://download.eclipse.org/technology/m2e/releases 
               --> press Enter ---> select Maven Integration for Eclipse
               ---> Next and Finish
               ---> Installation will take some time and it may be asked for restart the eclipse.
                   After the restart, you can create Maven projects.
                   
Now clone the project from this repository

POM.xml   :

contains all dependencies required for the project --> Selenium Webdriver 2.44, TestNG 6.9.9, Apache POI for EXcel

Running/Executing the Test cases:

Select Functional.xml Run as TestNGsuite  (located under 'resources' source folder) 
  Results can be seen in test-output --> index.xml 
  
POM (page object model) Approach:

 
 src/main/java
 
     com.googledocs.qa.pages  --Package
     Created Page Objects representing pages of a web application 
     created methods for these Page Objects in methods that represent actions  to perform within the pages that they represent 
     For the current Project two pages have been considered according to my choice. 
      GoogledocsFirstPage.java  ---> for first page
      GoogleCloudPage.java      ----> devsite page
      
     com.googledocs.qa.base
       TestBase.java :  Parent class for all classes -- initialize web driver, initialize properties etc
     
     com.googledocs.qa.config
        config.properties :  defined few common properties like Website URL name , any environment variable etc
        
     com.googledocs.qa.testdata 
        testada excel file is stored here for data driven testing. This file can be read using Aache POI
        
     com.googledocs.qa.util
        TestUtil.java : This class contains all utilities like screenshots, common utilities/ generic functions are defined here
        
  src/test/java
  
     Created tests that perform the actions mentioned in Pages classes in the required order 
     And performed checks that make up the test scenario 
     For the current Project the tests are created in com.googledocs.qa.testcases package
     
     com.googledocs.qa.testcases  :
      GoogledocsFirstPageTest.java
      GoogleCloudPageTest.java
      
 resoucers folder: Any resources can be added in this folder
 
      Test cases to be run are grouped here in xml files
      Functional.xml        --- for all Requirements
      Regression.TestNG.xml -- To execute selected testcases
      
 screenshots folder: Any screenshots related to project can be added here
 
      Screenshots of TestNG results are attached here
      
documents folder   : Any documents related to project can be added here

      Testcases excel file and requirements document are attached here
      
 test-output
      output report folder
      
Built With:

Maven                           - Dependency Management,
Selenium Webdriver with Java    - Test scripts writing,
Page Factory                    -  Objects repository,
TestNG                          - For running testcases and generating reports,
      
      
   Note : In this project I have used Selenium with Test NG and POM.
           Cumcumber BDD framework with Gherkin language can also be used for this project
     
      

  
  
