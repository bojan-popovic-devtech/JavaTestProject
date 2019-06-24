package com.packt.testproject.pages;

import com.packt.testproject.Browser;
import com.packt.testproject.PropertyValues;
import org.openqa.selenium.WebDriver;

public class ContactPage extends Pages{

    public ContactPage(WebDriver driver)
    {
        super(driver);
    }


    public static boolean IsAt() {
        return Browser.GetTitle().equals(PropertyValues.ContactTitle);
    }
}
