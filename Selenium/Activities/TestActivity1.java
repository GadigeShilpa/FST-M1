package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity1 {
	public static void main(String[] args) {
		//initializing a driver
				WebDriver driver = new FirefoxDriver();
				
				//open a browser/page
				driver.get("https://training-support.net/");
				
			    //interactions 
				// print the title of the page, first action to make sure we are in proper page
				System.out.println("Page title is: " + driver.getTitle());
				
				//Find the about Us link and click it
				//WebElement aboutLink = driver.findElement(By.linkText("About Us"));
				//aboutLink.click()
				driver.findElement(By.linkText("About Us")).click(); //instead of two previous lines we link the actions like this
				
				//Print the title of new page
				System.out.println("New Page  Title Is : " + driver.getTitle());
				
				// Close the browser
		        driver.quit();
		
	}

}
