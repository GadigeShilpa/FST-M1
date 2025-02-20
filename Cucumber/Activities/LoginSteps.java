package StepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
	@Given("User is on Training Website Login Page")
	public void userIsOnLoginPage() throws Throwable{
		//open the browser
		driver.get("https://training-support.net/webelements/login-form");
	}
	
	@When("the user enters the credentials")
	public void userEntersCredentials() throws Throwable{
		driver.findElement(By.id("username")).sendKeys("admin"); 
		driver.findElement(By.id("password")).sendKeys("password"); 
	}
	@And("clicks the submit button")
	public void userClicksSubmit() throws Throwable{
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
	}
	@Then("verifies the confirmation message received")
    public void confirmMessage() {
        // Find the confirmation message
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2.mt-5"), "Welcome"));
        String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        // Assert message
        Assertions.assertEquals("Welcome Back, Admin!", message);
    }

}
