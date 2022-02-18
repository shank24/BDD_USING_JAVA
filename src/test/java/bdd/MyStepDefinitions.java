package bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

}
