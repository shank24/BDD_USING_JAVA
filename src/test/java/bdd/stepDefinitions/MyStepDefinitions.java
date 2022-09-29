package bdd.stepDefinitions;

import bdd.context.TestContext;
import org.openqa.selenium.WebDriver;

public class MyStepDefinitions {

    private final WebDriver driver;

    public MyStepDefinitions(TestContext context) {
        driver = context.driver;
    }

}

//Note
/*Pico container will not create the other instance of the
TestContext class, it will be going to inject it already
created instance of it in the MyStepDefinitions class.
*/
