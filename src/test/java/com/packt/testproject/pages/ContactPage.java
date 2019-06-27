package com.packt.testproject.pages;

import com.packt.testproject.Browser;
import com.packt.testproject.PropertyValues;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ContactPage extends Pages{

    public ContactPage(WebDriver driver)
    {
        super(driver);
    }

    @Step("Get and Verify Contact page title")
    public static boolean IsAt() {
        return Browser.GetTitle().equals(PropertyValues.ContactTitle);
    }
}
