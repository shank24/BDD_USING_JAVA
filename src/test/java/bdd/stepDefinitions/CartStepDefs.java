package bdd.stepDefinitions;

import bdd.constants.EndPoint;
import bdd.context.TestContext;
import bdd.domainobjects.Product;
import bdd.pages.CartPage;
import bdd.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class CartStepDefs {
    private final WebDriver driver;

    public CartStepDefs(TestContext context) {
        driver= context.driver;
    }

    @Then("I should see {int} {product} in the cart")
    public void i_should_see_in_the_cart(int quantity, Product product) {
        CartPage cartPage = new CartPage(driver);
        assertEquals(product.getName(), cartPage.getProductName());
        assertEquals(quantity, cartPage.getProductQuantity());
    }
}
