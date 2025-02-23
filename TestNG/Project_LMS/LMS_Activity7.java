package Project_LMS;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LMS_Activity7 {
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
	public void allCourcesPageTest() {
		// Find the navigation bar and click on “All courses”
		driver.findElement(By.xpath("//ul[contains(@class,'nav-menu')]/li[2]/a[1]")).click();

		// get the page title
		String pageTitle = driver.getTitle();

		// Make sure it matches “All Courses – Alchemy LMS" exactly.
		assertEquals(pageTitle, "All Courses – Alchemy LMS");

		// Find all the courses on the page.
		assertTrue(driver.findElement(By.xpath("//div[@class='ld-course-list-items row']")).isDisplayed());

		// Print the number of courses on the page.
		System.out.println("Total number of courses available are  :"
				+ driver.findElements(By.xpath("//h3[@class='entry-title']")).size());
	}

	@AfterClass
	public void CloseBrowser() {
		// close browser
		driver.quit();
	}
}
