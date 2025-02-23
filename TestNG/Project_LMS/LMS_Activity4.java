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

public class LMS_Activity4 {
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
	public void courseTwoTtlTest() {
		// Find the second most popular course and get the title
		String courseTwoTitle = driver
				.findElement(
						By.xpath(".//div[contains(@class,'ld-course-list-items ')]/div[2]/article[1]/div[2]/h3[1]"))
				.getText();

		// Make sure it matches “Email Marketing Strategies”” exactly.
		assertEquals(courseTwoTitle, "Email Marketing Strategies");
	}

	@AfterClass
	public void close() {
		// close browser
		driver.quit();
	}
}
