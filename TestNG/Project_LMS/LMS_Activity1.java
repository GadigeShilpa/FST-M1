package Project_LMS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class LMS_Activity1 {
	WebDriver driver;
	WebDriverWait wait;
		
 
  @BeforeClass
  public void setUp() {
	// Initialize driver
      driver = new FirefoxDriver();
      // Initialize wait
      wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      //Navigate to the page
      driver.get("https://alchemy.hguy.co/lms/");
  }
  
  @Test
  public void PageTitleTest() {
	  //get the page title 
	   String pageTitle = driver.getTitle();
	   //Make sure it matches “Alchemy LMS – An LMS Application '' exactly.

	   assertEquals(pageTitle, "Alchemy LMS – An LMS Application");
  }

  @AfterClass
  public void Close() {
	//close browser 
	  driver.quit();
  }

}
