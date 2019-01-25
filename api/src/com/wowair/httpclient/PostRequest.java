package com.wowair.httpclient;


import static io.restassured.RestAssured.given;
import io.restassured.response.ResponseBodyExtractionOptions;


public class PostRequest{

//	public PostRequest(String userName,String password){
//		RestAssured.authentication = preemptive().basic(userName, password);	
//	}

	private String graphqlAuthorizationToken = System.getenv("GRAPHQL_AUTHORIZATION");
	
	public ResponseBodyExtractionOptions PostRequestWithGraphQL(String url){
		return given()
				.header("Authorization", graphqlAuthorizationToken)
				.header("Content-Type", "application/json")
				.body("{\n" + 
						"  \"query\": \"{\\n  allFlights(lowerDate: \\\"2018-01-01\\\") {\\n    id\\n    flightNumber\\n    destination\\n    flightDate\\n  }\\n}\\n\"\n" + 
						"}")
				.contentType("application/json")
				.expect()
				.statusCode(200)
				.when().post(url).then().extract().body();		
	}
}
