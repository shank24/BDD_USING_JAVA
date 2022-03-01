package bdd.stepDefinitions;

import bdd.constants.EndPoint;
import bdd.context.TestContext;
import bdd.domainobjects.Product;
import bdd.pages.PageFactoryManager;
import bdd.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StoreStepDefs {
    private final TestContext context;
    private final StorePage storePage;

    public StoreStepDefs(TestContext context) {
        this.context = context;
        storePage = PageFactoryManager.getStorePage(context.driver);
    }

    @Given("I'm on the Store page")
    public void i_m_on_the_store_page() {
        storePage.load(EndPoint.STORE.url);
    }

    @When("I add a {product} to the Cart")
    public void i_add_a_to_the_cart(Product product) {
        storePage.addToCart(product.getName());
    }

    @And("I have a product in the Cart")
    public void iHaveAProductInTheCart() {
        storePage.addToCart("Blue Shoes");
    }

}
