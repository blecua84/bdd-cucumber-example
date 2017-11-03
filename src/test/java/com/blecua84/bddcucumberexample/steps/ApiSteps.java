package com.blecua84.bddcucumberexample.steps;

import cucumber.api.java8.En;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Cucumber steps implementation.
 *
 * @author blecua84
 */
public class ApiSteps implements En {

    private RestTemplate restTemplate;
    private ResponseEntity<String> lastResponse;

    public ApiSteps() {
        this.restTemplate = new RestTemplate();

        When("the client calls version endpoint", () -> {
            this.lastResponse  = executeGet("http://localhost:8080/version");
        });

        Then("^the client receives status code of (\\d+)$", (Integer status) -> {
            int currentStatus = lastResponse.getStatusCodeValue();
            assertThat("Status code is incorrect: " + currentStatus, currentStatus, is(status));
        });

        And("^the version of the API should be (\\w+)$", (String expectedVersion) -> {
            String currentVersion = lastResponse.getBody();
            assertThat("The version of the API is not correct: " + currentVersion, currentVersion,
                    is(expectedVersion));
        });
    }

    private ResponseEntity<String> executeGet(String endpoint) {
        return restTemplate.getForEntity(endpoint, String.class);
    }
}
