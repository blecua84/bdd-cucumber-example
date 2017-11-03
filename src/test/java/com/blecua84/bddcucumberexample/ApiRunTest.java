package com.blecua84.bddcucumberexample;

import com.blecua84.bddcucumberexample.controllers.Api;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * Configuration class for launch all the cucumber test. You can specify in the "classes" array all the classes that you
 * want to test. In the second parameter, we are going to specify a random port as a web environment. With this option,
 * the test framework will run in a real environment in an unspecified port.
 *
 * @author blecua84
 */
@ContextConfiguration
@SpringBootTest(
        classes = { Api.class },
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public abstract class ApiRunTest {
}
