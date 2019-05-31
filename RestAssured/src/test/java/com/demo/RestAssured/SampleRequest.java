package com.demo.RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

 
public class SampleRequest {
 
	 	@Test
	    public void restAssuredTestBDDFramwork() {
		 System.out.println("Started restAssuredTestBDDFramwork from here");
	       
		  given().auth().basic("n0259443", "Badvel@1").
	            when().
	            	get("https://test1-lmbc-empr-mlc-tds-service.us-east-1.np.paas.lmig.com/services/v1/tds/all").
	            then().
	            	assertThat().
	            	statusCode(200).
	            	and().
	            	body("transDataResources", hasSize(6));/*.
	            	and().
	            	body("cotent-length",equalTo("4551"))*/;
	            	            	
	            	//-----------------------Test
	            	
	            	System.out.println("restAssuredTestBDDFramwork End here");
	            
	    }
	 	
	 	@Test (priority =1)
	    public void SampleDemorestAssuredTest() {
	 		System.out.println("Started restAssuredTestSampleDemo from here");
	 		RestAssured.baseURI = "https://test1-lmbc-empr-mlc-tds-service.us-east-1.np.paas.lmig.com/services/v1/tds";
        	RequestSpecification httpRequest = RestAssured.given().auth().basic("<Userame>", "<password>");
        	Response response = httpRequest.get("/all");
         
        	// Retrieve the body of the Response
        	ResponseBody body = response.getBody();
         
        	// By using the ResponseBody.asString() method, we can convert the  body
        	// into the string representation.
        	System.out.println("Response Body is: " + body.asString());
        	System.out.println("restAssuredTestSampleDemo End here");
	 		
	 	}

		
 
}