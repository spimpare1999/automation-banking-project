package org.example.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/features"}
        ,glue = {"org/example/stepDefinitions"}
        ,tags = "@CS"
      // ,dryRun = true

)

public class TestRunner {
}
