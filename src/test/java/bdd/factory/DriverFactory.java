package bdd.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    //ThreadLocal Info
    //Each thread will gets it own copy of the driver object
    private static final ThreadLocal
            <WebDriver> driver = new ThreadLocal<>();

    public static WebDriver initializeDriver(String browser) {
        WebDriver driver;
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "/home/shanky/Personal/Online Course/Testing/Driver_File/chromedriver");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "/home/shanky/Personal/Online Course/Testing/Driver_File/geckodriver");
                driver = new FirefoxDriver();
                break;

            default:
                throw new IllegalStateException("INVALID BROWSER" + browser);
        }
        driver.manage().window().maximize();
        DriverFactory.driver.set(driver);
        return driver;
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}
