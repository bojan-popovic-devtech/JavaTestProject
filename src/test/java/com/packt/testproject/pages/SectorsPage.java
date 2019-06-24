package com.packt.testproject.pages;

import com.packt.testproject.Browser;
import com.packt.testproject.PropertyValues;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class SectorsPage extends Pages{

    public SectorsPage(WebDriver driver)
    {
        super(driver);
    }

    @Step("Get and Verify ISV page title")
    public static boolean IsAtISVPage() {

        return Browser.GetUrl().equals(PropertyValues.ISVUrl);

    }

    @Step("Get and Verify CSP page title")
    public static boolean IsAtCSPPage() {

        return Browser.GetUrl().equals(PropertyValues.CSPUrl);

    }
    @Step("Get and Verify MSP page title")
    public static boolean IsAtMSPPage() {

        return Browser.GetUrl().equals(PropertyValues.MSPUrl);

    }
}
