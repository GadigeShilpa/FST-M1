package ExamplesREST;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static org.hamcrest.Matchers.lessThanOrEqualTo;;


public class SpecificationTest {
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	int petId = 0;
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
				build();
				
				
				
	}
	@Test
	public void addPet() {
		Map<String, Object> reqBody = new HashMap<>();
		reqBody.put("id", 77232);
		reqBody.put("name", "Riley");
		reqBody.put("status", "alive");
		
		Response response = given()
				.spec(requestSpec)
				.body(reqBody) // Add request body
				.when().post(); // Send POST request
		
		//Extract Petid
		petId = response.then().extract().path("id");
		 
		// Assertion
				response.then().spec(responseSpec).body("status", equalTo("alive"));
				
	}
	
	@Test(priority = 2)
	public void getPetInfo() {
		     given()
			.spec(requestSpec).pathParam("petId", petId)
			.when().get("/{petId}").
			then().spec(responseSpec).body("status", equalTo("alive")); 
 
		
	}
	@Test(priority = 3)
	public void deletePet() {
		    given()
			.spec(requestSpec).pathParam("petId", petId)
			.when().delete("/{petId}").
			then().spec(responseSpec).body("message", equalTo(""+petId));
		
	}
 
	

}
