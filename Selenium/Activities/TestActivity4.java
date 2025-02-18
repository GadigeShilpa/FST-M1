package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class TestActivity4 {
	public static void main(String[] args) {
		
		//initializing a driver
				WebDriver driver = new FirefoxDriver();
				
				//open a browser/page
				driver.get("https://training-support.net/webelements/target-practice");
				//Find the 3rd header on the page and print it's text to the console.
				String thirdHeader = driver.findElement(By.xpath("//div[contains(@class,'grid ')]/h3[1]")).getText();
				System.out.println(thirdHeader);
				//Find the 5th header on the page and print it's color.
				Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(),'Heading #5')]")).getCssValue("color"));
				System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
				 System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());
			
				//Find the purple button and print all it's classes.
				 String purpleButtonClass = driver.findElement(By.xpath("//button[contains(text(),'Purple')]")).getDomAttribute("class");
				 System.out.println(purpleButtonClass);
				 
				//Find the slate button and print it's text.
				 String slateButtonText = driver.findElement(By.xpath("//button[contains(text(),'Slate')]")).getText();
			     System.out.println(slateButtonText);
			     
			  // Close the browser
			        driver.quit();
	}

}
