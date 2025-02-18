package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestActivity17 {
	public static void main(String[] args) {
		//initializing a driver
		WebDriver driver = new FirefoxDriver();
						
		//open the desired page
		driver.get("https://training-support.net/webelements/selects");
		
		//Get the title of the page and print it to the console.
		System.out.println("Page title is: " + driver.getTitle());
		
		//Find the multi select element
		WebElement select2 = driver.findElement(By.xpath("//select[contains(@class,'shadow-lg focus:')]"));
		Select multiSelect = new Select(select2);
		
		//Select the "HTML" option using the visible text.
		multiSelect.selectByContainsVisibleText("HTML");
		
		//Select the 4th, 5th and 6th options using the index.
		for (int i = 3; i <=5; i++) {
			multiSelect.selectByIndex(i);
		}
		
		//Select the "Node" option using the value.		
	    multiSelect.selectByValue("nodejs");
	    //Deselect the 5th option using index.
	    multiSelect.deselectByIndex(4);
	    
	    System.out.println("Selected options are: ");
	    
	    List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
	    for(WebElement selectedOption : selectedOptions) {
	    	System.out.println(selectedOption.getText());
	    }
	    
	  //Close the browser.
		
		driver.quit();
		
	}

}
