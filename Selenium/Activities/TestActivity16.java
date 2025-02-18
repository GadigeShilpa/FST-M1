package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestActivity16 {
	public static void main(String[] args) {
		//initializing a driver
				WebDriver driver = new FirefoxDriver();
								
				//open the desired page
				driver.get("https://training-support.net/webelements/selects");
				
				//Get the title of the page and print it to the console.
				System.out.println("Page title is: " + driver.getTitle());
				
				//Find the dropdown element
				WebElement Select1 = driver.findElement(By.xpath("//select[contains(@class,'border-black ')]"));
				Select dropdown = new Select(Select1);
				
				//Select the second option using the visible text.
				dropdown.selectByVisibleText("Two");
				System.out.println("Selected option for Action1: " + dropdown.getFirstSelectedOption().getText());
				
				//Select the third option using the index.
				dropdown.selectByIndex(3);
				System.out.println("Selected option for Action2: " + dropdown.getFirstSelectedOption().getText());
				
				//Select the fourth option using the value.
				dropdown.selectByValue("four");
				System.out.println("Selected option for Action3: " + dropdown.getFirstSelectedOption().getText());
				
				//Get all the options and print them to the console.
			    for(WebElement option : dropdown.getOptions()) {
			    	System.out.println(option.getText());
			    }
				
				//Close the browser.
				
				driver.quit();
				
	}

}
