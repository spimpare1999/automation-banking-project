package org.example.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/features"}
        ,glue = {"org/example/stepDefinitions"}
        ,tags = "@SA"                           // @SB,@SC,@SD,@SE,@SF,@SG,@SH,@SI,@SJ,@SK"
      // ,dryRun = true

)

public class TestRunner {
}
