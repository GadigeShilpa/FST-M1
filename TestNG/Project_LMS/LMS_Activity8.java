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

public class LMS_Activity8 {
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
	public void contactPageTest() {
		// Find the navigation bar and click on “Contact”
		driver.findElement(By.xpath("//ul[contains(@class,'nav-menu')]/li[4]/a[1]")).click();

		// get the page title
		String pageTitle = driver.getTitle();

		// Make sure it matches “Contact – Alchemy LMS'' exactly.
		assertEquals(pageTitle, "Contact – Alchemy LMS");		
	}
	
	@Test(priority = 2)
	public void contactFormTest() {
		//Find the Fullname field of the contact form and enter the details
		driver.findElement(By.xpath("//input[contains(@id,'8-field_0')]")).sendKeys("Shilpa");
		//Find the Email field of the contact form and enter the details
		driver.findElement(By.xpath("//input[contains(@id,'8-field_1')]")).sendKeys("test@gmail.com");
		
		//Find the subject field of the contact form and enter the details
		driver.findElement(By.xpath("//input[contains(@id,'8-field_3')]")).sendKeys("Social Media Marketing");
		
		//Find the Message field of the contact form and enter the details
		driver.findElement(By.xpath("//textarea[contains(@id,'8-field_2')]")).sendKeys("This is a test message");
		
		//Find the submit button of the form and click
		driver.findElement(By.xpath("//button[@data-submit-text='Send Message']")).click();
		
		// get the confirmation message
		String confirmationMsg = driver.findElement(By.id("wpforms-confirmation-8")).getText();

		// Make sure it matches “All Courses – Alchemy LMS" exactly.
		System.out.println(confirmationMsg);
	}
	

	@AfterClass
	public void CloseBrowser() {
		// close browser
		driver.quit();
	}
}
