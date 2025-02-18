package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestngActivity3 {
	//Declare web driver 	
			WebDriver driver;

  @BeforeClass
  public void setUp() {
	// Create a new instance of the Fire fox driver
      driver = new FirefoxDriver();

      // Open the browser
      driver.get("https://training-support.net/webelements/login-form/");
	  
  }
  
  @Test(priority = 1)
  public void pageTitleTest() {
	//Assertion
	   assertEquals(driver.getTitle(), "Selenium: Login Form");
	  
  }

  @Test(priority = 2)
  public void loginFormTest() {
	 //Find the username field and type the username
	  driver.findElement(By.id("username")).sendKeys("admin");
	//Find the password field and type the passwrod
	  driver.findElement(By.id("password")).sendKeys("password");
	  // Find the submit button and click
	  driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	  
	  //Verify the login message
	  String message = driver.findElement(By.tagName("h2")).getText();
	  
		//Assertion
	   assertEquals(message, "Welcome Back, Admin!");
	  
  }
  @AfterClass
  public void close() {
	//Close the browser
	  driver.quit();
  }

}
