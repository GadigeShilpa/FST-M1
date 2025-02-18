package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity12 {
	
	public static void main(String[] args) {
		//initializing a driver
				WebDriver driver = new FirefoxDriver();
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				
				//open the desired page
				driver.get("https://training-support.net/webelements/dynamic-content");
				
				//Get the title of the page and print it to the console.
				System.out.println("Page title is: " + driver.getTitle());
				
				//Find the click button and click it.
				driver.findElement(By.id("genButton")).click();
				
				//Wait till release appears on the page
				wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));
				
				//Then Get the text and print it to console.
				
				System.out.println(driver.findElement(By.id("word")).getText());
				
				//Close the browser
				driver.quit();
	}

}
