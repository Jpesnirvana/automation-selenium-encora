package com.company.seleniumwebdriver.webapp;

import com.company.seleniumwebdriver.base.BaseTest;
import com.company.seleniumwebdriver.pages.HomePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLogin extends BaseTest {
    @Test
    public void login(){
        String sUserActual = "Welcome JORDHAN EVANGE";
        HomePage homePage =  loginPage.login();
        String sUserExpected = homePage.getUserLogged();
        assertEquals(sUserExpected,sUserActual);
    }
}
