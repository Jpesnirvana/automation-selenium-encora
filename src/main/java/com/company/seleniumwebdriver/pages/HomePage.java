package com.company.seleniumwebdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends LoginPage {
    private By lblRegisterOk  = By.xpath("//*[@id=\"rightPanel\"]/p");
    private By lblUserLogged = By.xpath ("//*[@id=\"leftPanel\"]/p");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getUserLogged() {
        return driver.findElement(lblUserLogged).getText();
    }

    public String getUserRegister() {
        return driver.findElement(lblRegisterOk).getText();
    }
}
