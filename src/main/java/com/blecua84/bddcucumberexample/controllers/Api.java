package com.blecua84.bddcucumberexample.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A very basic API from learning BDD.
 *
 * @author blecua84
 */
@RestController
public class Api {

    private final String VERSION = "v1";

    @GetMapping(value = "/version")
    public ResponseEntity<String> testMethod() {
        ResponseEntity<String> responseEntity = new ResponseEntity<>(this.VERSION, HttpStatus.OK);

        return responseEntity;
    }
}
