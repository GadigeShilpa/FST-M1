package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {
	//Declare Appium driver
	AppiumDriver driver;
	WebDriverWait wait;
	
				
	@BeforeClass
	public void setUp()throws MalformedURLException, URISyntaxException{
		//Desired capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
		options.noReset();
		//ServerURL
		URL serverURL = new URI("http://localhost:4723").toURL();
		// Driver initialization
		driver = new AndroidDriver(serverURL, options);
	    wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	   		 
		// Open Selenium page
		driver.get("https://training-support.net");
	}	
	
	@Test
    public void chromeTest() {
		 // Find heading on the page
        String page1Heading = driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"Training Support\"]")).getText();
        //print Heading of page 1
        System.out.println("Heading: " + page1Heading);
        //click on About Us
        driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"About Us\"]")).click();
        //get heading of page 2
        String page2Heading = driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"About Us\"]")).getText();
        
        System.out.println("Heading: " + page2Heading);
	}
	
	
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }

}
