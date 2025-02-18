package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity2 {
	public static void main(String[] args) {
		//initializing a driver
		WebDriver driver = new FirefoxDriver();
		
		//open a browser/page
		driver.get("https://training-support.net/webelements/login-form/");
		
	    //interactions 
		// Find the username field and enter the username
		driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		
		// Find the password field and enter the password
		driver.findElement(By.name("password")).sendKeys("password");
		
		// Find the login button and click it
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//driver.findElement(By.className("svelte-1pdjkmx")).click();//this won't work as all three feild have same class name
		//driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		
		// Print the confirmation message
        String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println(message);
		
		// Close the browser
        driver.quit();
	}

}
