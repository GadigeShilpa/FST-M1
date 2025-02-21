package Project;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {
	
	//Set the Headers
	Map<String, String> headers = new HashMap<>();
	
	//Create the contract (Pact)
	@Pact(consumer = "UserConsumer", provider = "UserProvider")
	public RequestResponsePact createPact(PactDslWithProvider builder) {//Set the headers
		headers.put("Content-Type","application/json");
		
		//The request and response body
		DslPart reqResBody = new PactDslJsonBody().
				numberType("id", 123).//Giving an example value to all as we are giving assertion for name at the end
				stringType("firstName", "Saahil").
				stringType("lastName", "Sahrma").
				stringType("email", "Saahil@example.com");
		
		//Create the pact
		return builder.given("POST Request")
				.uponReceiving("A request to create user")
				.method("POST")
				.path("/api/users")
				.headers(headers)
				.body(reqResBody)
			.willRespondWith()
			    .status(201)
			    .body(reqResBody)
			 .toPact();
	 	
	}
	
	//consumer test with mock provider
	@Test
	@PactTestFor(providerName = "UserProvider", port = "8282")
	public void postRequestTest() {
		//create a request body
		Map<String, Object> reqBody = new HashMap<>();
		reqBody.put("id", 123);
		reqBody.put("firstName", "Saahil");
		reqBody.put("lastName", "Sharma");
		reqBody.put("email", "Saahil@example.com");
		
		//Send request , get response. add assertions
		given().baseUri("http://localhost:8282/api/users").headers(headers).body(reqBody).log().all()
		.when().post()
		.then().statusCode(201).body("firstName", equalTo("Saahil")).log().all();
		//the name assertion fails if  we didn't provide the example values for mock provider, DlsPart reqResBody
	}
			

}
