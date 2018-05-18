# InfluenceHealthExerciseGoogleDocs
GoogleDocsPageQA - InfluenceHealthExerciseGoogleDocs

Project : Googledocs Web application Automation Testing

Approach :

Page Object Model Pattern with Page Factory in Selenium + Data driven + TestNG tests

 
Prerequisites : Eclipse IDE and MAven

                Itegrate Maven with Eclipse IDE
               Eclipse--> Help--> Install New software
               ---> enter work with as  http://download.eclipse.org/technology/m2e/releases 
               --> press Enter ---> select Maven Integration for Eclipse
               ---> Next and Finish
               ---> Installation will take some time and it may be asked for restart the eclipse.
                   After the restart, you can create Maven projects.
                   
Now clone the project

POM.xml   :

contains all dependencies required for the project --> Selenium Webdriver 2.44, TestNG 6.9.9, Apache POI foe EXcel

Running the Test cases:

Select Functional.xml Run as TestNGsuite  (located under 'resources' source folder) 
  Results can be seen test-output --> index.xml 
  
POM (page object model) Approach:

 
 src/main/java
 
     com.googledocs.qa.pages  --Package
     Created Page Objects representing pages of a web application 
     created methods for these Page Objects in methods that represent actions  to perform within the pages that they represent 
     For the current Project two pages have been considered
      GoogledocsFirstPage.java
      GoogleCloudPage.java
      
     com.googledocs.qa.base
       TestBase.java :  Parent class for all classes -- initialize web driver, initialize properties etc
     
     com.googledocs.qa.config
        config.properties :  defined few common properties like Website URL name , any environment variable etc
        
     com.googledocs.qa.testdata 
        testada excel file is stored here for data driven testing. This file can be read using Aache POI
        
     com.googledocs.qa.util
        TestUtil.java : This calss contails all utilities like screenshots, common utilities/ generic functions are defined here
        
  src/test/java
  
     Created tests that perform the actions mentioned in Pages classes in the required order 
     And performed checks that make up the test scenario 
     For the current Project the tests are created in com.googledocs.qa.testcases package
      GoogledocsFirstPageTest.java
      GoogleCloudPageTest.java
      
 resoucers folder:
 
      Test cases to be run are grouped here in xml files
      Functional.xml
      Regression.TestNG.xml
      
 screenshots folder:
 
      Screenshots of TestNG results are attached here
      
documents folder

      Testcases excel file and requirements document are attached here
      
 test-output
      output report folder
      
Built With:

Maven                           - Dependency Management
Selenium Webdriver with Java    - Test scripts writing
Page Factory                    -  Objects repository
TestNG                          - For running testcases and generating reports
      
      
   As of now I have used Selenium with Test NG and POM,   Cumcumber BDD framework can also be used for this project
     
      

  
  
