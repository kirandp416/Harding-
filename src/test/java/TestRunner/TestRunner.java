package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefs"},
        plugin = {"pretty", "html:Reports/Report"}
)
public class TestRunner {


}
