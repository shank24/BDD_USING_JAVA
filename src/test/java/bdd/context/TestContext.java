package bdd.context;

import bdd.domainobjects.BillingDetails;
import bdd.domainobjects.Cookies;
import org.openqa.selenium.WebDriver;

public class TestContext {
    public WebDriver driver;
    public BillingDetails billingDetails;
    public Cookies cookies;

    public TestContext() {
        cookies = new Cookies();
        //Creating empty cookie object
        cookies.setCookies(new io.restassured.http.Cookies());
    }
}
