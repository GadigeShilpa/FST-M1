package ExamplesREST;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FirstTest {
	// GET https://petstore.swagger.io/v2/pet/findByStatus?status=alive
	
	@Test
	public void getRequestWithQueryParam() {
		//create a response object
		Response response = //Request Specification
				given().
				   baseUri("https://petstore.swagger.io/v2/pet").
				   header("Content-Type","application/json").
				   queryParam("status", "alive").
				when().//Send request and receive response
			       get("/findByStatus");
		//Print the response body
		
		//System.out.println(response.getBody()); //(this expression doesn't print the response, json body properly 
		//hence you can choose the following tsyswo ways
		//print the status code
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getBody().asPrettyString());	
		
		//Print the response headers
		System.out.println(response.getHeaders().asList());
		
		//Extract the values from the response
		String petStatus = response.then().extract().path("[0].status");
				
		//Print and assert the pet status
		assertEquals(petStatus, "alive");
		
		//REST Assured assertion
		response.then().statusCode(200).body("[0].status", equalTo("alive"));
	}
	
	@Test
	public void getRequestWithPathParam() {
		//Send request, receive response, perform assertions
		given().
		baseUri("https://petstore.swagger.io/v2/pet").
		headers("Content-Type", "applicxation/json").
		pathParam("petId", 77232).
		log().all().
		when().
		get("/{petId}").
		then().
		statusCode(200).
		body("name", equalTo("Hansel")).				
		log().all();
	}
	

}
 