package activities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity14 {
	
	public static void main(String[] args) {
		//initializing a driver
				WebDriver driver = new FirefoxDriver(); 
								
				//open the desired page
				driver.get(" https://training-support.net/webelements/tables");
				
				//Get the title of the page and print it to the console.
				System.out.println("Page title is: " + driver.getTitle());
				
				//Find the number of rows and columns in the table and print them.
				List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class,'w-full ')]/thead/tr/th"));
				List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'w-full ')]/tbody/tr"));
				System.out.println("No of rows of the table are: " + rows.size());
				System.out.println("No of columns of the table are: " + columns.size());
				
				//Find and print the Book Name in the 5th row.
				WebElement fifthRowBook = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody[1]/tr[5]/td[2]"));
				System.out.println(fifthRowBook.getText());
				
				//Click the header of the Price column to sort it in ascending order.
				driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th[5]")).click();
				
				//Find and print the Book Name in the 5th row again.
			    fifthRowBook = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody[1]/tr[5]/td[2]"));
				System.out.println(fifthRowBook.getText());
				
				//Close the browser.
				
				driver.quit();
	}

}
