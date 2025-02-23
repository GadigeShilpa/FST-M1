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

public class LMS_Activity9 {
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

	@Test(priority = 1)
	public void myAcountPageTest() {
		// Find the navigation bar and click on “My Account”
		driver.findElement(By.xpath("//ul[contains(@class,'nav-')]/li[5]/a[1]")).click();

		// get the page title
		String pageTitle = driver.getTitle();

		// Make sure it matches “My Account – Alchemy LMS'' exactly.
		assertEquals(pageTitle, "My Account – Alchemy LMS");
	}

	@Test(priority = 2)
	public void loginTest() {
		// Find the login button and click on “My Account”
		driver.findElement(By.xpath("//a[contains(@class,'login ld-')]")).click();
		// Find login page heading and print to validate you are on right page

		String loginpageHeading = driver.findElement(By.xpath("//div[@class='ld-modal-heading']")).getText();

		// Make sure it matches “My Account – Alchemy LMS'' exactly.
		assertEquals(loginpageHeading, "Login");

		// Find the username field of the login form and enter the username into that
		// field.
		driver.findElement(By.id("user_login")).sendKeys("root");

		// Find the password field of the login form and enter the password into that
		// field.
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");

		// Find the login button and click it.
		driver.findElement(By.id("wp-submit")).click();

		// Verify that you have logged in.
		assertTrue(driver.findElement(By.linkText("Edit profile")).isDisplayed());

	}

	@Test(priority = 3)
	public void allCourcesPageTest() {
		// Find the navigation bar and click on “All courses”
		driver.findElement(By.xpath("//ul[contains(@class,'nav-menu')]/li[2]/a[1]")).click();

		// get the page title
		String pageTitle = driver.getTitle();

		// Make sure it matches “All Courses – Alchemy LMS" exactly.
		assertEquals(pageTitle, "All Courses – Alchemy LMS");

		// Select a course, the first one
		driver.findElement(
				By.xpath("//div[contains(@class,'ld-course-list-items row')]/div[1]/article[1]/div[2]/p[2]/a[1]"))
				.click();

		// find first course content and open it
		driver.findElement(By.xpath("//div[contains(@class,'ld-item-list-items ')]/div[1]/div[1]/a[1]/div[2]")).click();

		// validate the title of the course
		assertEquals(driver.findElement(By.xpath("//div[contains(@class,'ld-focus-content')]/h1[1]")).getText(),
				"Developing Strategy");
		
		//Validate the status of the course as complete
		assertEquals(driver.findElement(By.xpath("//div[contains(@class,'status ld-')]")).getText(),
				"COMPLETE");

	}

	@AfterClass
	public void CloseBrowser() {
		// close browser
		driver.quit();
	}
}
