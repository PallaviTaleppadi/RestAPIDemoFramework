package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class ForgotPasswordTest {

	//@Test(description = "Verify if Forgotp password is working...")

	public void forgotPasswordTest() {		
		
		AuthService authService = new AuthService();
		Response response=authService.forgotPassword("pallavirao@live.com");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.statusCode(), 200);

	}
}
