package com.packt.testproject.tests;

import com.packt.testproject.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class BaseTest {
    private WebDriver driver;

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{{"Chrome"}, {"Firefox"}};
    }

    //@Parameters({ "browserType", "appURL" })
    @BeforeTest
    public void initialize() {

        driver = new Browser().SetBrowser("Chrome", "https://www.devtechgroup.com");
    }

    @AfterClass
    public void close()
    {
        Browser.Close();
    }

    public WebDriver getDriver()
    {
        return driver;
    }

}
