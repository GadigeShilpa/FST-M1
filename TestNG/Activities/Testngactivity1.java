package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Testngactivity1 {
	//Declare web driver 	
	WebDriver driver;
	
   @BeforeClass
  public void setUp() {
	  //Initialize web driver
	  driver = new FirefoxDriver();
	  //open the page
	  driver.get("https://training-support.net");
	  
  }
   @Test(priority = 1)
   public void pageTitleTest() {
	   //get the page title 
	   String pageTitle = driver.getTitle();
	   //Assertion
	   assertEquals(pageTitle, "Training Support");
   }
   
   @Test(priority = 2)
   public void aboutUsLinkTest() {
	   //Find and click AboutUS lik
	   driver.findElement(By.linkText("About Us")).click();
	   //Assertion
	   assertEquals(driver.getTitle(), "About Training Support");
   }

  @AfterClass
  public void tearDown() {
	  //Close the browser
	  driver.quit();
  }

}
