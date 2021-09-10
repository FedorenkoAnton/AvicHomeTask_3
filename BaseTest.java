package AvicTests;

import avicPages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return PageFactory.initElements(getDriver(), HomePage.class);
    }

    public SmartphonesAndPhonesPage getSmartphonesAndPhonesPage() {
        return PageFactory.initElements(getDriver(), SmartphonesAndPhonesPage.class);
    }

    public SmartphonesPage getSmartphonesPage() {
        return PageFactory.initElements(getDriver(), SmartphonesPage.class);
    }

    public Iphone12miniPage getIphone12miniPage() {
        return PageFactory.initElements(getDriver(), Iphone12miniPage.class);
    }

    public CartPage getCartPage() {
        return PageFactory.initElements(getDriver(), CartPage.class);
    }

    public IphoneSearchResultPage getIphoneSearchResultPage() {
        return PageFactory.initElements(getDriver(), IphoneSearchResultPage.class);
    }

    public SamsungSearchPage getSamsungSearchPage() {
        return PageFactory.initElements(getDriver(), SamsungSearchPage.class);
    }
}
