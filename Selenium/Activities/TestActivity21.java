package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity21 {
	public static void main(String[] args) {
		//initializing a driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));				
		//open the desired page
		driver.get("https://training-support.net/webelements/tabs");
		
		//Get the title of the page and print it to the console.
		System.out.println("Page title is: " + driver.getTitle());
		
		//Print the current page handle
		System.out.println("Page handle is: " + driver.getWindowHandle());
		
		//find the button to open new tab
		driver.findElement(By.xpath("//button[contains(text(),'Open A New Tab')]")).click();
				
		//Wait for a new tab
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//Print the window handles
		System.out.println(" Current windows open : " + driver.getWindowHandles());
		
		//Switch to new tab
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		
		//Print the new page title
	    System.out.println("Page title is: " + driver.getTitle());
	    
	    //Print the current page handle
		System.out.println("Page handle is: " + driver.getWindowHandle());
		
		//Print the message on the page
		System.out.println("Page message is: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());
		
		//Close the browser
		
		driver.quit();
				
		
	}

}
