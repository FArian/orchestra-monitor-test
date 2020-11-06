package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/ORC4260OTP517.feature",
glue= {"featuresTests"},
monochrome=true,plugin = {"json:target/cucumber.json"},
tags ="@OTE-21")
public class TestRunner {

}
