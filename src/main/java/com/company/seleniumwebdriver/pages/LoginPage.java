package com.company.seleniumwebdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;

    private By txtUser  = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    private By txtPass  = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    private By btnLogin = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login(String sUserNameL, String sPasswordL) {
        driver.findElement(txtUser).sendKeys(sUserNameL);
        driver.findElement(txtPass).sendKeys(sPasswordL);
        driver.findElement(btnLogin).click();
        return new HomePage(driver);
    }
}
