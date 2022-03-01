package bdd.stepDefinitions;

import bdd.constants.EndPoint;
import bdd.context.TestContext;
import bdd.domainobjects.Product;
import bdd.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StoreStepDefs {
    private final WebDriver driver;

    public StoreStepDefs(TestContext context) {
        driver= context.driver;
    }

    @Given("I'm on the Store page")
    public void i_m_on_the_store_page() {
        new StorePage(driver).load(EndPoint.STORE.url);
    }

    @When("I add a {product} to the Cart")
    public void i_add_a_to_the_cart(Product product) {
        new StorePage(driver).addToCart(product.getName());
    }

    @And("I have a product in the Cart")
    public void iHaveAProductInTheCart() {
        new StorePage(driver).addToCart("Blue Shoes");
    }

}
