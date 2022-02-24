package bdd;

import bdd.factory.DriverFactory;
import bdd.pages.CartPage;
import bdd.pages.CheckoutPage;
import bdd.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

import static java.lang.Thread.*;
import static org.junit.Assert.*;

public class MyStepDefinitions {

    private WebDriver driver;
    private String billingFirstName;
    private String billingLastName;
    private String billingAddressOne;
    private String billingCity;
    private String billingStateName;
    private String billingZip;
    private String billingEmail;

    @Given("I'm on the Store page")
    public void i_m_on_the_store_page() {
        driver= DriverFactory.getDriver();
        new StorePage(driver).load("https://askomdch.com");
    }

    @When("I add a {string} to the Cart")
    public void i_add_a_to_the_cart(String productName){
        new StorePage(driver).addToCart(productName);
    }

    @Then("I should see {int} {string} in the cart")
    public void i_should_see_in_the_cart(int quantity, String productName) {
        CartPage cartPage = new CartPage(driver);
        assertEquals(productName, cartPage.getProductName());
        assertEquals(quantity, cartPage.getProductQuantity());
    }

    @Given("I'm a guest customer")
    public void iMAGuestCustomer() {
        driver= DriverFactory.getDriver();
        new StorePage(driver).load("https://askomdch.com");
    }

    @And("My billing details are")
    public void myBillingDetailsAre(List<Map<String, String>> billingDetails) {
                billingFirstName =  billingDetails.get(0).get("firstname");
                billingLastName = billingDetails.get(0).get("lastname");
                billingAddressOne =  billingDetails.get(0).get("address");
                billingCity = billingDetails.get(0).get("city");
                billingStateName = billingDetails.get(0).get("state");
                billingZip = billingDetails.get(0).get("zip");
                billingEmail = billingDetails.get(0).get("email");
    }

    @And("I have a product in the Cart")
    public void iHaveAProductInTheCart() {
        new StorePage(driver).addToCart("Blue Shoes");
    }

    @And("I'm on the checkout page")
    public void iMOnTheCheckoutPage() {
        new CartPage(driver).checkout();
    }

    @When("I provide billing details")
    public void iProvideBillingDetails() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.setBillingDetails(billingFirstName,
                billingLastName,
                billingAddressOne,
                billingCity,
                billingStateName,
                billingZip,
                billingEmail);
    }

    @And("I place an order")
    public void iPlaceAnOrder() {
        new CheckoutPage(driver).placeOrder();
    }

    @Then("The order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() {
        Assert.assertEquals("Thank you. Your order has been received.",
                new CheckoutPage(driver).getNotice());
    }


}
