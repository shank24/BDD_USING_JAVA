package bdd.runners;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;


@CucumberOptions(
        plugin = {"html:target/cucumber/cucumber.html"},
        glue = {"bdd"},
        features = "src/test/resources/bdd",
        snippets = CAMELCASE,
        dryRun = false,
        monochrome = true,
        tags = "@scenario1 or @scenario2"
)
public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests{

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}