package com.company.seleniumwebdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Urls;
import utils.UserRandom;

public class LoginPage {
    protected WebDriver driver;

    private By txtUser  = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    private By txtPass  = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    private By btnLogin = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login() {
        driver.findElement(txtUser).sendKeys(UserRandom.USERNAME);
        driver.findElement(txtPass).sendKeys(UserRandom.PASSWORD);
        driver.findElement(btnLogin).click();
        return new HomePage(driver);
    }
}
