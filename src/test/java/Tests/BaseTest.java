package Tests;

import InitDriver.Init;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class BaseTest {
    protected WebDriver driver;
    protected String baseUrl;
    protected String alertUrl;

    @Before
    public void initDriver() {
        Init initDriver = new Init();
        driver = initDriver.getDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        baseUrl = "https://demoqa.com/text-box";
        alertUrl = "https://demoqa.com/alerts";
    }

    @After
    public void quitDriver() {
        driver.close();
        driver.quit();
    }
}