package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Listeners(com.api.listeners.TestListener.class)
public class InitialAPITest {

	@Test(description = "Verify Initial API Login")

	public void loginAPI() {

		/*
		 * RestAssured.baseURI="https://dog.ceo/api/breeds/list/all";
		 * RequestSpecification spec = RestAssured.given(); Response response
		 * =spec.get(); System.out.println(response.asPrettyString());
		 */

		/*
		 * Response response =RestAssured.given()
		 * .baseUri("https://dog.ceo/api/breeds/list/all").get();
		 * System.out.println(response.asPrettyString());
		 * 
		 * Assert.assertEquals(response.statusCode(), 200);
		 */

		/*
		 * RestAssured.baseURI="http://64.227.160.186:8080"; RequestSpecification spec=
		 * RestAssured.given(); RequestSpecification y =
		 * spec.header("Content-type","application/json"); RequestSpecification z=
		 * y.body("{\"username\": \"uday1234\", \"password\": \"uday12345\"}"); Response
		 * response=z.post("/api/auth/login");
		 * System.out.print(response.asPrettyString());
		 */

		/*
		 * RestAssured.baseURI="http://64.227.160.186:8080"; Response response=
		 * RestAssured.given().header("Content-type","application/json")
		 * .body("{\"username\": \"uday1234\", \"password\": \"uday12345\"}")
		 * .post("/api/auth/login"); System.out.print(response.asPrettyString());
		 * 
		 * Assert.assertEquals(response.statusCode(), 200);	 */
		
		  //Response response=authService.login("{\"username\": \"uday1234\", \"password\": \"uday12345\"}");

			
			LoginRequest loginRequest = new LoginRequest("uday1234", "uday12345");
			AuthService authService = new AuthService();
			Response response = authService.login(loginRequest);
			System.out.println(response.asPrettyString());		 
		  
		  
			LoginResponse loginResponse = response.as(LoginResponse.class);

			System.out.println(response.asPrettyString());
			System.out.println(loginResponse.getToken());
			System.out.println(loginResponse.getEmail());
			System.out.println(loginResponse.getUsername());
			
			Assert.assertEquals(loginResponse.getUsername(), "uday1234");
			Assert.assertTrue(loginResponse.getToken()!=null);
		 

	}

}
