package specifications;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specification {

	public void installSpec() {
		RestAssured.requestSpecification = requestSpec();
		RestAssured.responseSpecification = responseSpec();
	}

	public RequestSpecification requestSpec() {

		return new RequestSpecBuilder()
				.setContentType("application/json")
				.addFilter(new AllureRestAssured())
				.setBaseUri("http://users.bugred.ru/tasks/")
				.build();
	}

	public ResponseSpecification responseSpec() {
		return new ResponseSpecBuilder()
				.expectStatusCode(200)
				.build();
	}

}
