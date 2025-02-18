package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity5 {
	public static void main(String[] args) {
		//initializing a driver
		WebDriver driver = new FirefoxDriver();
		
		//open the desired page
		driver.get(" https://training-support.net/webelements/dynamic-controls");
		
		//Get the title of the page and print it to the console.
		System.out.println("Page title is: " + driver.getTitle());
		
		//OnPage Actions
		//Find the check box input element.
		WebElement checkBox = driver.findElement(By.id("checkbox"));
		
		//Check if it is visible on the page.
		System.out.println("Is the checkBox visible? : " +checkBox.isDisplayed());
		
		//Click the "Remove Check box" button.(Find the button and click)
		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();	
		
		
		//Check if it is visible again and print the result.
		System.out.println("Is the checkBox visible? : " +checkBox.isDisplayed());
		
		// Close the browser
        driver.quit();
	}

}
