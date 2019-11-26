package org.broonix.controller;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;

public class EmployeeRestTest {
//	@BeforeClass
//	public static void init() {
//		RestAssured.baseURI = "http://localhost";
//		RestAssured.port = 8080;
//	}

	@Test
	public void testUserFetchesSuccess() {
		get("/getEmployee/12")
		.then()
		.body("id", equalTo(12))
		.body("firstName", equalTo("Vinod"))
		.body("lastName", equalTo("Kashyap"))
		.body("designation", equalTo("CEO"));
	}
}
