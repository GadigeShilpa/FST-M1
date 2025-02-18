package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class TestngActivity2 {
	//Declare web driver 	
		WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  // Create a new instance of the Fire fox driver
      driver = new FirefoxDriver();

      // Open the browser
      driver.get("https://training-support.net/webelements/target-practice");
  }
  @Test
  public void testCase1() {
	// This test case will pass
      String title = driver.getTitle();
      System.out.println("Title is: " + title);
      Assert.assertEquals(title, "Selenium: Target Practice");
  }
  @Test
  public void testCase2() {
      // This test case will Fail
      WebElement pinkButton = driver.findElement(By.cssSelector("button.black"));
      Assert.assertTrue(pinkButton.isDisplayed());
      Assert.assertEquals(pinkButton.getText(), "pink");
  }

  @Test(enabled = false)
  public void testCase3() {
      // This test will be skipped and not counted
      String subHeading = driver.findElement(By.className("sub")).getText();
      Assert.assertTrue(subHeading.contains("Practice"));
  }

  @Test
  public void testCase4() {
      // This test will be skipped and will be be shown as skipped
      throw new SkipException("Skipping test case");
  }

  @AfterClass
  public void afterClass() {
	// Close the browser
      driver.quit();
  }

}
