package com.packt.testproject.tests;

import com.packt.testproject.pages.ContactPage;
import com.packt.testproject.pages.HomePage;
import com.packt.testproject.pages.NewsPage;
import com.packt.testproject.pages.SectorsPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class HomePageTests extends BaseTest {

    HomePage homePage;
    ContactPage contactPage;
    NewsPage newsPage;
    SectorsPage sectorsPage;

    @BeforeTest
    public void setup()
    {
       homePage= new HomePage(getDriver());
       contactPage= new ContactPage(getDriver());
       newsPage= new NewsPage(getDriver());
       sectorsPage= new SectorsPage(getDriver());
    }

    @Test
    @Story("Test verify base page title")
    @Description("Verify home page title")
    public void CanGoToHomePage(){
        Assert.assertTrue(homePage.IsAt());
    }

    @Test
    @Story("Test verify Go to news page")
    @Description("Go to NEWS page")
    public void CanGoToNewsPage(){
        homePage.GoToNewsPage();
        Assert.assertTrue(newsPage.IsAt());
    }

    @Test
    @Story("Test verify Go to Contact page")
    @Description("Go to CONTACT page")
    public void CanGoToContactPage(){
        homePage.GoToContactPage();
        Assert.assertTrue(ContactPage.IsAt());
    }

    @Test
    @Story("Test verify Sectors Items")
    @Description("Go to ISV page")
    public void CanGoToISVPage(){
        homePage.GoToISVPage();
        Assert.assertTrue(SectorsPage.IsAtISVPage());
    }

    @Test
    @Story("Test verify Sectors Items")
    @Description("Go to CSP page")
    public void CanGoToCSPPage(){
        homePage.GoToCSPPage();
        Assert.assertTrue(true);
    }

    @Test
    @Story("Test verify Sectors Items")
    @Description("Go to MSP page")
    public void CanGoToMSPPage(){
        homePage.GoToMSPPAge();
        Assert.assertTrue(true);
    }
}
