// filepath: /C:/Users/18042/NewBDD/test/src/test/java/runner/TestRunner.java
package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"stepDefinitions"},
        plugin = {"pretty"}
)
public class TestRunner {
}
