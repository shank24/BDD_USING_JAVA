package bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"bdd"},
        features = "src/test/resources/bdd"
)
public class MyJUnitRunnerTest {
}
