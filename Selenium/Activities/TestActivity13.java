package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity13 {
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
		
		//Find and print all the cell values in the third row of the table.
		WebElement thirdRow = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody[1]/tr[3]"));
		System.out.println("Third row content is: " + thirdRow.getText());
		
		//Find and print the cell value at the second row second column.
		WebElement row2Cell2 = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody[1]/tr[2]/td[2]"));
		System.out.println("Second row, second cell content is: " + row2Cell2.getText());
		
		//close browser
		driver.quit();
	}

}
