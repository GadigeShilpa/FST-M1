package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity20 {
	public static void main(String[] args) {
		//initializing a driver
		WebDriver driver = new FirefoxDriver();
						
		//open the desired page
		driver.get("https://training-support.net/webelements/alerts");
		
		//Get the title of the page and print it to the console.
		System.out.println("Page title is: " + driver.getTitle());	
								
		//Find the button to open a PROMPT alert and click it.
		driver.findElement(By.id("prompt")).click();
						
		//Switch the focus from the main window to the Alert box and get the text in it and print it.
		Alert promptAlert = driver.switchTo().alert();
		
		//Print alert text
		System.out.println("Prompt Alert Message is: " + promptAlert.getText());
		//Type "Awesome!" into the prompt.
		promptAlert.sendKeys("Awesome!");
       // Thread.sleep(5000);
	
		//	Close the alert by clicking Ok.
		promptAlert.accept();
		
		//Print the message
		System.out.println(" Action Performed was: " + driver.findElement(By.id("result")).getText());
		
		//Close the browser.
		driver.quit();
		
	}

}
