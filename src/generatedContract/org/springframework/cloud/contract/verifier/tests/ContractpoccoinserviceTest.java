package org.springframework.cloud.contract.verifier.tests;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import io.restassured.response.ResponseOptions;
import org.junit.Test;
import xschmitthappenzx.contractpoccoinservice.ContractpoccoinserviceBase;

import static com.toomuchcoding.jsonassert.JsonAssertion.assertThatJson;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static org.springframework.cloud.contract.verifier.assertion.SpringCloudContractAssertions.assertThat;

public class ContractpoccoinserviceTest extends ContractpoccoinserviceBase {

	@Test
	public void validate_shouldReturnAllCoins() throws Exception {
		// given:
			MockMvcRequestSpecification request = given();

		// when:
			ResponseOptions response = given().spec(request)
					.get("/coin");

		// then:
			assertThat(response.statusCode()).isEqualTo(201);
		// and:
			DocumentContext parsedJson = JsonPath.parse(response.getBody().asString());
			assertThatJson(parsedJson).arrayField().contains("BTC").value();
			assertThatJson(parsedJson).arrayField().contains("ETH").value();
	}

}
