package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActivity8 {
	public static void main(String[] args) {
		//initializing a driver
				WebDriver driver = new FirefoxDriver();
				Actions builder = new Actions(driver);
				
				//open the desired page
				driver.get("https://training-support.net/webelements/mouse-events");
				
				//Get the title of the page and print it to the console.
				System.out.println("Page title is: " + driver.getTitle());
				
				//Find all the buttons for doing actions
				WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
				WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
				WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
		        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
		       		        
				//Left click on the Cargo.lock button,				
				//move the cursor to the Cargo.toml button and then click it.
		        builder.click(cargoLock).pause(2000L).moveToElement(cargoToml).pause(2000L).click().build().perform();
		        
				//Print the confirmation text at the end of the sequence.
		        System.out.println(driver.findElement(By.id("result")).getText());
		        
		        //Double click on the src button. 
		        builder.doubleClick(srcButton).pause(5000L).moveToElement(targetButton).pause(5000L).build().perform();
		        //Then right click on the target button and select open.
		        //builder.click(driver.findElement(By.xpath("//div[@id='menu']//ul/li[1]"))).pause(5000L).build().perform();
		        
		        driver.findElement(By.xpath("//div[@id='menu']//ul/li[1]")).click();
		        //Print the confirmation text at the end of the sequence.
		        System.out.println(driver.findElement(By.id("result")).getText());
		        
		        // Close the browser
		        driver.quit();			
	}

}
