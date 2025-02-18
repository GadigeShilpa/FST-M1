package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity3 {
	public static void main(String[] args) {
		//initializing a driver
		WebDriver driver = new FirefoxDriver();
		
		//open a browser/page
		driver.get("https://training-support.net/webelements/login-form/");
		
	    // using xpaths for TestActivity2 elements
		// Find the username field and enter the username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
				
		// Find the password field and enter the password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");		
		// Find the login button and click it
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		// Print the confirmation message
        String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println(message);
     // Close the browser
        driver.quit();
	}

}
