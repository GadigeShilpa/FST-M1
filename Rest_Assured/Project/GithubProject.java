package Project;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import org.testng.annotations.BeforeClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class GithubProject {
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	String SSHKey = "";
	int keyId = 0;
	@BeforeClass
    public void setUp() {
		
		//request Specification
		requestSpec = new RequestSpecBuilder().
				setBaseUri("https://docs.github.com/en/rest/users/keys").
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
	
	

}
