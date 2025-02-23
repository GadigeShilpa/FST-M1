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

public class LMS_Activity3 {
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
	public void firstinfoTtlTest() {
		// Find the first information box and get the title
		String FirstInfoTitle = driver.findElement(By.xpath(
				"//div[@id='uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810']/div[1]/div[1]/div[1]/div[2]/h3[1]"))
				.getText();

		// Make sure it matches “Actionable Training” exactly.
		assertEquals(FirstInfoTitle, "Actionable Training");
	}

	@AfterClass
	public void Close() {
		// close browser
		driver.quit();
	}
}
