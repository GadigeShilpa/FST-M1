package activities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
	//Declare Appium driver
		AppiumDriver driver;
		
		@BeforeClass
		public void setUp()throws MalformedURLException, URISyntaxException{
			//Desired capabilities
			UiAutomator2Options options = new UiAutomator2Options();
			options.setPlatformName("android");
			options.setAutomationName("UiAutomator2");
			options.setAppPackage("com.android.calculator2");
			options.setAppActivity(".Calculator");
			options.noReset();
			
			//ServerURL
			URL serverURL = new URI("http://localhost:4723").toURL();
			
			//Initialize the driver
			driver = new AndroidDriver(serverURL, options);
			
		}
		
		//Test addition 
		@Test
		public void multiplyTest() {
			//Setup function
			driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_5")).click();//or
			driver.findElement(AppiumBy.accessibilityId("×")).click();
			driver.findElement(AppiumBy.id("digit_8")).click();
			driver.findElement(AppiumBy.accessibilityId("equals")).click();
			
			//Assertions
			String result = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
			assertEquals(result, "40");
		}
		
		@AfterClass
		 public void tearDown() {
			driver.quit();
		}
		

}
