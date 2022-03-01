package bdd.stepDefinitions;

import bdd.context.TestContext;
import bdd.domainobjects.BillingDetails;
import bdd.domainobjects.Product;
import bdd.pages.CartPage;
import bdd.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class CheckoutStepDefs {
    private final WebDriver driver;
    private final TestContext context;

    public CheckoutStepDefs(TestContext context) {
        driver= context.driver;
        this.context=context;
    }

    @And("I'm on the checkout page")
    public void iMOnTheCheckoutPage() {
        new CartPage(driver).checkout();
    }

    @When("I provide billing details")
    public void iProvideBillingDetails() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.setBillingDetails(context.billingDetails);
    }

    @And("I place an order")
    public void iPlaceAnOrder() {
        new CheckoutPage(driver).placeOrder();
    }

    @Then("The order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() {
        Assert.assertEquals("Thank you. Your order has been received.", new CheckoutPage(driver).getNotice());
    }

}
