package bdd.runners;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        plugin = {"html:target/cucumber/cucumber.html"},
        glue = {"bdd"},
        features = "src/test/resources/bdd"
)
public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests{

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}