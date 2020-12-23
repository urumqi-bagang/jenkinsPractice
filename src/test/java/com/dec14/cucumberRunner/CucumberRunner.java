package com.dec14.cucumberRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "rerun:target/rerun.text"

        },
        features = "src/test/resources/features",
        glue = "com/dec14/stepDefinitions",
        tags = "@smoke",
        dryRun = false
)
public class CucumberRunner {


}
