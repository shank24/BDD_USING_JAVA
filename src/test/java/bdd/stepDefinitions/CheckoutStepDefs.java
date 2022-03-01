package bdd.stepDefinitions;

import bdd.context.TestContext;
import bdd.domainobjects.BillingDetails;
import bdd.domainobjects.Product;
import bdd.pages.CartPage;
import bdd.pages.CheckoutPage;
import bdd.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class CheckoutStepDefs {
    private final TestContext context;
    private final CheckoutPage checkoutPage;

    public CheckoutStepDefs(TestContext context) {
        this.context = context;
        checkoutPage = PageFactoryManager.getCheckoutPage(context.driver);
    }


    @When("I provide billing details")
    public void iProvideBillingDetails() {
        checkoutPage.setBillingDetails(context.billingDetails);
    }

    @And("I place an order")
    public void iPlaceAnOrder() {
        checkoutPage.placeOrder();
    }

    @Then("The order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() {
        Assert.assertEquals("Thank you. Your order has been received.", checkoutPage.getNotice());
    }

}
