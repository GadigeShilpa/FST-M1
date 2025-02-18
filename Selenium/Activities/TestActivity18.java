package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity18 {
	public static void main(String[] args) {
		//initializing a driver
				WebDriver driver = new FirefoxDriver();
								
				//open the desired page
				driver.get("https://training-support.net/webelements/alerts");
				
				//Get the title of the page and print it to the console.
				System.out.println("Page title is: " + driver.getTitle());				
						
				//Find the button to open a SIMPLE alert and click it.
				driver.findElement(By.id("simple")).click();
								
				//Switch the focus from the main window to the Alert box and get the text in it and print it.
				Alert simpleAlert = driver.switchTo().alert();
				//Print alert text
				System.out.println("Simple Alert Message is: " + simpleAlert.getText());
			
				//Close the alert once with OK.
				simpleAlert.accept();
				
				//Print the message
				System.out.println(" Action Performed was: " + driver.findElement(By.id("result")).getText());
				
				//Close the browser.
				driver.quit();
				
				
				
	}

}
