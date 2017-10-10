package Example;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;	


public class NewTest {	
	    
	    	
		@Test				
		public void testEasy() {		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\logic\\MySelenium\\WebdriverTest\\Driver\\geckodriver.exe");
			/*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			//driver = new MarionetteDriver(capabilities); 
			WebDriver driver=new FirefoxDriver(capabilities);*/
			WebDriver driver=new FirefoxDriver();
			driver.get("http://demo.guru99.com/selenium/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		/*@BeforeTest
		public void beforeTest() {	
		    driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		*/
}		