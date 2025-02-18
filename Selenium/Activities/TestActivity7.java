package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity7 {
	public static void main(String[] args) {
		//initializing a driver
				WebDriver driver = new FirefoxDriver();
				
				//open the desired page
				driver.get(" https://training-support.net/webelements/dynamic-controls");
				
				//Get the title of the page and print it to the console.
				System.out.println("Page title is: " + driver.getTitle());
				
				//OnPage Actions
				//Find the Text box input element.
				WebElement textBox = driver.findElement(By.id("textInput"));
				
				//Check if the text field is enabled and print it.
				driver.findElement(By.id("textInputButton")).click();
				
				//Click the "Enable Input" button to enable the input field.
				
				driver.findElement(By.id("textInputButton")).click();					
				
				//Check if the text field is enabled again and print it.
				driver.findElement(By.id("textInputButton")).click();
				
				// Close the browser
		        driver.quit();
	}

}
