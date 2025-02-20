package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps extends BaseClass {
	@Given("User navigates to the google web page")
	public void userIsOnGooglePage() throws Throwable{
		//open the browser
		driver.get("https://www.google.com/");
	}
	
	@When("User  types in Cheese in Search space and hits ENTER")
	public void userTypesInCheeseAndHitsENTER() throws Throwable{
		driver.findElement(By.name("q")).sendKeys("Cheese", Keys.ENTER); 
	}
	
	@Then("Show how many search reasults were generated")
	public void showHowManySearchResultsWereShown() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("hdtb-tls"))).click();
		String resultStats = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats"))).getText();
		System.out.println("Number of results found: " + resultStats);
	}

}
