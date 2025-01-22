package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to your feature files
    glue = {"StepDepfinitaion"}, // Package containing step definitions
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = false
)
public class TestRunner {
}
