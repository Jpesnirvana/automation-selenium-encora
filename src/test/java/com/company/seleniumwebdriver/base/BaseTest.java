package com.company.seleniumwebdriver.base;

import com.company.seleniumwebdriver.pages.HomePage;
import com.company.seleniumwebdriver.pages.LoginPage;
import com.company.seleniumwebdriver.pages.RegisterPage;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Urls;

public class BaseTest {
    protected static WebDriver driver;
    protected static RegisterPage registerPage;
    protected static LoginPage loginPage;
    @BeforeAll
    public static void setUp() {
        setChromeDriverProperty();
        driver.get(Urls.REDMINE_REGISTER);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
    }
//    @AfterAll
//    public static void close() {
//        driver.quit();
//    }
    private static void setChromeDriverProperty(){
        if(System.getProperty("os.name").toLowerCase().contains("windows")){
            System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        }
        driver = new ChromeDriver();
    }
}
