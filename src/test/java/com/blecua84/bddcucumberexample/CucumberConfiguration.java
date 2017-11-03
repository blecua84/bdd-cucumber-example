package com.blecua84.bddcucumberexample;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Mainly runner. You need to specify where are located your steps(glue), and where is your feature file. The last
 * parameter will redirect the output by console log and to a html report in a pretty format.
 *
 * Note: Classpath will point to /src/test/resources.
 *
 * @author blecua
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.blecua84.bddcucumberexample.steps"},
        features= {"classpath:bdd"},
        plugin = {"pretty", "html:target/cucumber"}
)
public class CucumberConfiguration {
}
