package Project_LMS;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LMS_Activity2 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		// Initialize driver
		driver = new FirefoxDriver();
		// Initialize wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Navigate to the page
		driver.get("https://alchemy.hguy.co/lms/");
	}

	@Test
	public void PageHeadingTest() {
		// get the page heading
		String pageHeading = driver.findElement(By.xpath("//h1[contains(@class,'title')]")).getText();

		// Make sure it matches “Learn from Industry Experts” exactly.
		assertEquals(pageHeading, "Learn from Industry Experts");
	}

	@AfterClass
	public void Close() {
		// close browser
		driver.quit();
	}

}
