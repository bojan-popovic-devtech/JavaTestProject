package com.packt.testproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;


public class Browser {


    private static WebDriver _webDriver;
    public static Actions Action;


    public static WebDriver SetBrowser (String browserName, String _baseUrl)
    {
        if(browserName.equals("Firefox"))
        {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setAcceptInsecureCerts(true);
            _webDriver = new FirefoxDriver(firefoxOptions);
            _webDriver.manage().window().maximize();
        }
        else if (browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\com\\packt\\testproject\\driver\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("chrome.switches", "--disable-extensions", "test-type", "start-maximized");
            _webDriver = new ChromeDriver(chromeOptions);
        }

        Action = new Actions(_webDriver);
        Goto(" ", _baseUrl);
        return _webDriver;

    }

    public static String GetUrl(){
        return _webDriver.getCurrentUrl();
    }

    public static String GetTitle()
    {
        return _webDriver.getTitle();
    }

    public static void Goto(String url, String _baseUrl)
    {
        _webDriver.navigate().to(_baseUrl + url);
    }

    public static void Close(){
        _webDriver.close();
        _webDriver.quit();
    }
}
