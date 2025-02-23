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

public class LMS_Activity5 {
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
	public void myAcountPageTest() {
		// Find the navigation bar and click on “My Account”
		// driver.findElement(By.xpath("//ul[contains(@class,'nav-')]/li[5]/a[1]")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'nav-')]//a[contains(text(),'My Account')]")).click();

		// get the page title
		String pageTitle = driver.getTitle();

		// Make sure it matches “My Account – Alchemy LMS'' exactly.
		assertEquals(pageTitle, "My Account – Alchemy LMS");
	}

	@AfterClass
	public void Close() {
		// close browser
		driver.quit();
	}
}
