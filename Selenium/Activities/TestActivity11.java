package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity11 {
	
	public static void main(String[] args) {
		//initializing a driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//open the desired page
		driver.get(" https://training-support.net/webelements/dynamic-controls");
		
		//Get the title of the page and print it to the console.
		System.out.println("Page title is: " + driver.getTitle());
		
		//Find the check box element
		WebElement checkBox = driver.findElement(By.id("checkbox"));
						
		//Check if it is visible on the page.
		System.out.println("Is the checkBox visible? : " +checkBox.isDisplayed());
		
		//Click the button to toggle visibility
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();	
				
		//Wait for the check box to disappear
		wait.until(ExpectedConditions.invisibilityOf(checkBox));
		
		//click the button to toggle visibility
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();	
		
		//Wait for the check box to appear and then click it
		wait.until(ExpectedConditions.visibilityOf(checkBox));
		
		//Close the browser
		driver.quit();
				
	}

}

