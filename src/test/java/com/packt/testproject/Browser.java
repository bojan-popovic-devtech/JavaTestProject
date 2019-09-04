package com.packt.testproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;


public class Browser {


    private static WebDriver _webDriver;
    public static Actions Action;


    public WebDriver SetBrowser (String browserName, String _baseUrl)
    {
        if(browserName.equals("Firefox"))
        {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setAcceptInsecureCerts(true);
            _webDriver = new FirefoxDriver(firefoxOptions);
            _webDriver.manage().window().maximize();
        }
        else if (browserName.equals("Chrome")) {

            ClassLoader classLoader = getClass().getClassLoader();
            //String path=  new File(classLoader.getResource("chromedriver").getFile()).getPath();
            System.setProperty("webdriver.chrome.driver", new File(classLoader.getResource("chromedriver").getFile()).getPath().replace("%20", " "));
            //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("chrome.switches", "--disable-extensions", "test-type", "start-maximized");
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("window-size=1200,1100"); // No elements were visible
            chromeOptions.addArguments("--disable-gpu");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-dev-shm-usage"); //Pages crashed with this
            //chromeOptions.setBinary("src\\test\\java\\com\\packt\\testproject\\driver\\chromedriver.exe");

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
