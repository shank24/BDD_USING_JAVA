package bdd.stepDefinitions;

import bdd.constants.EndPoint;
import bdd.context.TestContext;
import bdd.domainobjects.BillingDetails;
import bdd.domainobjects.Product;
import bdd.factory.DriverFactory;
import bdd.pages.CartPage;
import bdd.pages.CheckoutPage;
import bdd.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class MyStepDefinitions {

    private final WebDriver driver;


    // Pico container will not create the other instance of the
    // TestContext class, it will be going to inject it already
    // created instance of it in the MyStepDefinitions class.

    public MyStepDefinitions(TestContext context) {
        driver = context.driver;
    }

}
