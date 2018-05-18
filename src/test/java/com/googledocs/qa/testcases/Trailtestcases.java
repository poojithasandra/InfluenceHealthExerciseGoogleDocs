package com.googledocs.qa.testcases;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	//import org.openqa.selenium.firefox.FirefoxDriver;
		import org.testng.annotations.Test;

		public class Trailtestcases {
			
			//*******************************************************************************************************************
			// Trail testing
			//************************************************************************************************************************
			@Test
			public void verifyTitle() throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sandr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//1=========================
				 driver.get("https://developers.google.com/");
				 
				 
				 //2========================
				// String title= driver.findElement(By.xpath("//div[@id='gc-wrapper']/div[2]/article/article/section[1]/div/div[1]/div/div[1]/p[1]")).getText();
				  String title1 = driver.findElement(By.xpath("//div[@class='devsite-landing-row-item-description-content']/p[1]")).getText();
				 
				// String title2 = driver.findElement(By.xpath("//div[@class='devsite-landing-row-item-description-content']/p[contains(text(),'Hone your skills'])")).getText();
				 
						 System.out.println(title1);
				 //3=========================
				 driver.findElement(By.id("google-cloud-next-18br-july-24-26-san-francisco-usa")).click();
				 
					//4=======================
				 Thread.sleep(3000);
					String text1 = driver.findElement(By.xpath("//div[contains(@class,'title typography')]/h3[1]")).getText();
					String tex2 = driver.findElement(By.xpath("//main[@id='main']/descendant::div[contains(@class,'title typography')]/h3")).getText();
					String tex3 = driver.findElement(By.xpath("//main[@id='main']/descendant::div[contains(@class,'grid-col md12 lg4')]/descendant::h3")).getText();
				//	String tex4 = driver.findElement(By.xpath("//main[@id='main']/descendant::div[contains(@class,'grid-col md12 lg4')]/following-sibling::div/descendant::h3")).getText();  //learn
					
					System.out.println(text1);
					System.out.println(tex2);
					System.out.println(tex3);
					
				
			      //5,6==============================
				 Thread.sleep(3000);
				 
				 driver.findElement(By.xpath("//div[@class='hero-cta-btn hero-cta-btn-register']/parent::div/button")).click();
				 
				 driver.findElement(By.id("firstName")).sendKeys("myname");
				driver.findElement(By.id("lastName")).sendKeys("mylastname");
				driver.findElement(By.id("email")).sendKeys("XYZA@gmail.com");
				 driver.findElement(By.id("jobTitle")).sendKeys("QA");
				 driver.findElement(By.id("company")).sendKeys("mycompany");
		           driver.findElement(By.id("industry")).sendKeys("IT");
				 
				WebElement drop =  driver.findElement(By.id("industry"));
				Select osel = new Select(drop);
				//osel.selectByIndex(1);
				osel.selectByVisibleText("Education");
				Thread.sleep(5000);
				WebElement drop1 =  driver.findElement(By.id("country"));
				Select osel1 = new Select(drop1);
				//osel1.selectByIndex(2);
				osel1.selectByVisibleText("United States");
				Thread.sleep(3000);
				
			
				
			}

}
