package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"tests.stepdefs"}
       )
public class TestRunner extends AbstractTestNGCucumberTests{

}