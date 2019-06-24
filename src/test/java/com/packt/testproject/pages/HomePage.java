package com.packt.testproject.pages;

import com.packt.testproject.Browser;
import com.packt.testproject.PropertyValues;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Pages{


    public HomePage(WebDriver driver)
    {
       super(driver);
    }

    @FindBy(linkText= "CONTACT")
    private static WebElement contactLink;

    @FindBy(linkText= "NEWS")
    private static WebElement newsLink;

    @FindBy(linkText= "ABOUT")
    private static WebElement aboutLink;

    @FindBy(id= "menu-item-102")
    private static WebElement sectorsItems;

    @FindBy(id= "menu-item-91")
    private static WebElement isvLink;

    @FindBy(id= "menu-item-90")
    private static WebElement cspLink;

    @FindBy(id= "menu-item-89")
    private static WebElement mspLink;

    public static boolean IsAt()
    {
        return Browser.GetTitle().equals(PropertyValues.HomePageTitle);
    }

    public static void GoToContactPage()
    {

        contactLink.click();
       // return new ContactPage(driver);
    }

    public static void GoToNewsPage() {
        Browser.Action.moveToElement(aboutLink);
        newsLink.click();
        // return new NewsPage();
    }
    @Step ("Click on ISV menu item")
    public static void GoToISVPage() {
       Browser.Action.moveToElement(sectorsItems).perform();
       Browser.Action.moveToElement(isvLink).perform();
        isvLink.click();
       //isvLink.click();
    }

    @Step ("Click on CSP menu item")
    public static void GoToCSPPage() {
       // Browser.Action.moveToElement(sectorsItems);
        //Browser.Action.moveToElement(cspLink).click();
        //cspLink.click();
        // return new NewsPage();
    }
    @Step ("Click on ISV menu item")
    public static void GoToMSPPAge() {
       /* Browser.Action.moveToElement(sectorsItems);
       /* mspLink.click();
       @Step ("Click on ISV menu item")
        */
        // return new NewsPage();*/
    }

}
