package activitiesREST;

import static org.hamcrest.Matchers.lessThanOrEqualTo;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class activity3 {
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;

	@BeforeClass
	public void setUp() {
		
		//request Specification
		requestSpec = new RequestSpecBuilder().
				setBaseUri("https://petstore.swagger.io/v2/pet").
				addHeader("Content-Type","application/json").
				build();
		//response Specification
		responseSpec = new ResponseSpecBuilder().
				expectStatusCode(200).
				expectResponseTime(lessThanOrEqualTo(3000L)).
				expectContentType("application/json").
				expectBody("status", equalTo("alive")).
				build();
	}
	@DataProvider(name = "petInfo")
	public Object[][] petInfoProvider() {
		// Setting parameters to pass to test case
		Object[][] testData = new Object[][] { 
			{ 77232, "Riley", "alive" }, 
			{ 77233, "Hansel", "alive" } 
		};
		return testData;
	}
	@Test
	public void addPets(int petId, String petName, String petStatus) {
		Map<String, Object> reqBody = new HashMap<>();
		reqBody.put("id", petId);
		reqBody.put("name", petName);
		reqBody.put("status", petStatus);
		
		 given()
				.spec(requestSpec)
				.body(reqBody) // Add request body
				.when().post(). // Send POST request
				then().spec(responseSpec).body("name", equalTo(petName));
				
	}
	
	// Get Pets test using data provider
	@Test( priority=2, dataProvider = "petInfo")
	public void getPets(int petId, String petName, String petStatus) {
		given().spec(requestSpec) // Use requestSpec
			.pathParam("petId", petId) // Add path parameter
			.log().all() // Log for request details
		.when()
			.get("/{petId}") // Send GET request
		.then().spec(responseSpec) // Assertions using responseSpec
		    .body("name", equalTo(petName)) // Additional Assertion
		    .log().all(); // Log for request details
	}
 
	// DElete Test case using a DataProvider
	@Test(priority=3, dataProvider = "petInfo")
	public void deletePets(int petId, String petName, String petStatus) {
		given().spec(requestSpec) // Use requestSpec
			.pathParam("petId", petId) // Add path parameter
		.when()
			.delete("/{petId}") // Send GET request
		.then()
			.body("code", equalTo(200))
			.body("message", equalTo(""+petId)); // Assertions using responseSpec
	}
}
