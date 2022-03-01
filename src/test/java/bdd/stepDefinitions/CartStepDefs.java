package bdd.stepDefinitions;

import bdd.context.TestContext;
import bdd.domainobjects.Product;
import bdd.pages.CartPage;
import bdd.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class CartStepDefs {
    private final CartPage cartPage;

    public CartStepDefs(TestContext context) {
        cartPage = PageFactoryManager.getCartPage(context.driver);
    }

    @Then("I should see {int} {product} in the cart")
    public void i_should_see_in_the_cart(int quantity, Product product) {
        assertEquals(product.getName(), cartPage.getProductName());
        assertEquals(quantity, cartPage.getProductQuantity());
    }


}
