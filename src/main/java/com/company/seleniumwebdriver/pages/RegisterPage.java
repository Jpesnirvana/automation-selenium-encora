package com.company.seleniumwebdriver.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RegisterPage {
    protected WebDriver driver;

    private By linkRegister   = By.linkText("Register");
    private By txtFirstName   = By.id("customer.firstName");
    private By txtLastName    = By.id("customer.lastName");
    private By txtAddress     = By.id("customer.address.street");
    private By txtCity        = By.id("customer.address.city");
    private By txtState       = By.id("customer.address.state");
    private By txtZip         = By.id("customer.address.zipCode");
    private By numPhoneNumber = By.id("customer.phoneNumber");
    private By txtSNN         = By.id("customer.ssn");
    private By txtUserName    = By.id("customer.username");
    private By txtPassword    = By.id("customer.password");
    private By txtConfirmPass = By.id("repeatedPassword");
    private By btnRegister    = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage setRegister(String sFirstName, String sLastName, String sAddress, String sCity, String sState, String sZip, String nPhoneNumber, String sSNN, String sUserName, String sPassword, String sConfirmPass) {
        driver.findElement(linkRegister).click();
        driver.findElement(txtFirstName).sendKeys(sFirstName);
        driver.findElement(txtLastName).sendKeys(sLastName);
        driver.findElement(txtAddress).sendKeys(sAddress);
        driver.findElement(txtCity).sendKeys(sCity);
        driver.findElement(txtState).sendKeys(sState);
        driver.findElement(txtZip).sendKeys(sZip);
        driver.findElement(numPhoneNumber).sendKeys(nPhoneNumber);
        driver.findElement(txtSNN).sendKeys(sSNN);
        driver.findElement(txtUserName).sendKeys(sUserName);
        driver.findElement(txtPassword).sendKeys(sPassword);
        driver.findElement(txtConfirmPass).sendKeys(sConfirmPass);
        driver.findElement(btnRegister).click();
        return new HomePage(driver);
    }
}
