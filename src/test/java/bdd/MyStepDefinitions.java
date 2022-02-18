package bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepDefinitions {

    @Given("I'm on the Store page")
    public void i_m_on_the_store_page() {
        System.setProperty("webdriver.chrome.driver", "/home/shanky/Personal/Online Course/Testing/Driver_File/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/shank24");
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }

    @When("I add a {string} to the Cart")
    public void i_add_a_to_the_cart(String string) {

    }

    @Then("I should see {int} {string} in the cart")
    public void i_should_see_in_the_cart(Integer int1, String string) {

    }

}
