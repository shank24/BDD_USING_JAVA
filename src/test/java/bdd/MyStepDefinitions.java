package bdd;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

import static java.lang.Thread.*;
import static org.junit.Assert.*;

public class MyStepDefinitions {

    private WebDriver driver;
    @Given("I'm on the Store page")
    public void i_m_on_the_store_page() {
        System.setProperty("webdriver.chrome.driver", "/home/shanky/Personal/Online Course/Testing/Driver_File/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com");
        System.out.println(driver.getCurrentUrl());

    }

    @When("I add a {string} to the Cart")
    public void i_add_a_to_the_cart(String productName) throws InterruptedException {
        By addingToCart = By.cssSelector("a[aria-label='Add “" + productName + "” to your cart']");
        driver.findElement(addingToCart).click();
        By viewCart = By.cssSelector("a[title='View cart']");
        sleep(4000);
        driver.findElement(viewCart).click();

    }

    @Then("I should see {int} {string} in the cart")
    public void i_should_see_in_the_cart(int quantity, String productName) {
        By productNameFld = By.xpath(".//a[text()='Blue Shoes']");
        String actualProductName = driver.findElement(productNameFld).getText();
        By productQuantityFld = By.cssSelector("input[type=\"number\"]");
        String actualProductQuantity = driver.findElement(productQuantityFld).getAttribute("value");
        assertEquals(productName, actualProductName);
        assertEquals(quantity, Integer.parseInt(actualProductQuantity));
        driver.close();
    }

    @Given("I'm a guest customer")
    public void iMAGuestCustomer() {
    }

    @And("I have a product in the Cart")
    public void iHaveAProductInTheCart() throws InterruptedException {
        driver.get("https://askomdch.com");
        By addingToCart = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
        driver.findElement(addingToCart).click();
        By viewCart = By.cssSelector("a[title='View cart']");
        sleep(4000);
        driver.findElement(viewCart).click();

    }

    @And("I'm on the checkout page")
    public void iMOnTheCheckoutPage() {
        By proceedToCheckoutBtn = By.cssSelector(".checkout-button");
        driver.findElement(proceedToCheckoutBtn).click();
    }

    @When("I provide billing details")
    public void iProvideBillingDetails(List<Map<String, String>> billingDetails) {

        By firstNameId = By.id("billing_first_name");
        By lastNameId = By.id("billing_last_name_field");
        By addressId = By.id("billing_address_1");
        By cityId = By.id("billing_city");
        By stateId = By.id("select2-billing_state-container")
        By zipId = By.id("billing_postcode");
        By emailId = By.id("billing_email");

        driver.findElement(firstNameId).clear();
        driver.findElement(firstNameId).sendKeys(billingDetails.get(0).get("firstname"));
        driver.findElement(lastNameId).clear();
        driver.findElement(lastNameId).sendKeys(billingDetails.get(0).get("lastname"));
        driver.findElement(addressId).clear();
        driver.findElement(addressId).sendKeys(billingDetails.get(0).get("address"));
        driver.findElement(cityId).clear();
        driver.findElement(cityId).sendKeys(billingDetails.get(0).get("city"));
        driver.findElement(stateId).clear();
        driver.findElement(stateId).sendKeys(billingDetails.get(0).get("state"));
        driver.findElement(zipId).clear();
        driver.findElement(zipId).sendKeys(billingDetails.get(0).get("zip"));
        driver.findElement(emailId).clear();
        driver.findElement(emailId).sendKeys(billingDetails.get(0).get("email"));

    }

    @And("I place an order")
    public void iPlaceAnOrder() {
    }

    @Then("The order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() {
    }
}
