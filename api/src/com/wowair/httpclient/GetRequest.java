package com.wowair.httpclient;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;

public class GetRequest{

	public GetRequest(){
		// Here we will write the code for Authorization token generation
	}
	
	private String restAuthorizationToken = System.getenv("REST_AUTHORIZATION");
	private String graphqlAuthorizationToken = System.getenv("GRAPHQL_AUTHORIZATION");

	public ResponseBodyExtractionOptions GetRequestWithOauth(String url){
		return given()
				.header("Authorization", restAuthorizationToken)
				.header("Content-Type", "application/json")
				.header("customeripaddress","127.0.0.1")
				.contentType("application/json")
				.expect()
				.statusCode(200)
				.when().get(url).then().extract().body();		
	}
	
	public ResponseBodyExtractionOptions GetRequestWithGraphQL(String url){
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

	public String makeGetRequestAndGetBody(String url){
		System.out.println("URL is : "+url);
		return given().get(url).body().asString();
	}

	public Response makeGetRequestAndGetResponse(String url){
		return given().get(url);
	}

	public int makeGetRequestAndGetStatusCode(String url){
		return given().get(url).getStatusCode();
	}

	public String makeGetRequestAndGetContentType(String url){
		return given().get(url).getContentType();
	}

	public String makeGetRequestAndGetHeaders(String url,String headerName){
		return given().get(url).getHeader(headerName);
	}
}
