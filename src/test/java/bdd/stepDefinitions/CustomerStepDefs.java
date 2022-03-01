package bdd.stepDefinitions;

import bdd.constants.EndPoint;
import bdd.context.TestContext;
import bdd.domainobjects.BillingDetails;
import bdd.pages.CartPage;
import bdd.pages.CheckoutPage;
import bdd.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CustomerStepDefs {
    private final WebDriver driver;
    private final TestContext context;

    public CustomerStepDefs(TestContext context) {
        driver= context.driver;
        this.context=context;
    }

    @And("My billing details are")
    public void myBillingDetailsAre(BillingDetails billingDetails) {
        context.billingDetails = billingDetails;
    }

    @Given("I'm a guest customer")
    public void iMAGuestCustomer() {
        new StorePage(driver).load(EndPoint.STORE.url);
    }

}
