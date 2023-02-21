package io.rest;
// import org.testng.annotations.Test;
import org.junit.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_01 {
	@Test
	public void test_01() throws InterruptedException {
		Response response = RestAssured.get("https://reqres.in/api/users?page=1");
		System.out.println("Status Code " + response.getStatusCode());
	}
	@Test
	public void test_02() throws InterruptedException {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Status Code " + response.getStatusCode());
	}
	@Test
	public void test_03() throws InterruptedException {
		Response response = RestAssured.get("https://reqres.in/api/users?page=3");
		System.out.println("Status Code " + response.getStatusCode());
	}
	@Test
	public void test_04() throws InterruptedException {
		Response response = RestAssured.get("https://reqres.in/api/users?page=4");
		System.out.println("Status Code " + response.getStatusCode());
	}
	@Test
	public void test_05() throws InterruptedException{
		given().when().get("https://reqres.in/api/users?page=5").then().log().status();
   }
}
	
