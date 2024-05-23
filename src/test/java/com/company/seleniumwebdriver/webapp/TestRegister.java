package com.company.seleniumwebdriver.webapp;

import com.company.seleniumwebdriver.base.BaseTest;
import com.company.seleniumwebdriver.pages.HomePage;
import org.junit.jupiter.api.Test;
import utils.UserRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRegister extends BaseTest  {
    @Test
    public void setRegister(){
        String sFirstName = "JORDHAN";
        String sLastName = "EVANGE";
        String sAddress = "Av.Hua";
        String sCity = "Huacho";
        String sState= "123";
        String sZip = "34AD";
        String nPhoneNumber = "949014586";
        String sSNN = "123";
        String sUserName = UserRandom.generateRandomUser();
        String sPassword = "123";
        String sConfirmPass = "123";
        String sActualUserRegister = "Your account was created successfully. You are now logged in.";
        HomePage homePage = registerPage.setRegister(sFirstName,sLastName,sAddress,sCity,sState,sZip,nPhoneNumber,sSNN,sUserName,sPassword,sConfirmPass);
        String sUserRegister = homePage.getUserRegister();
        System.out.println(sPassword);

        assertEquals(sUserRegister, sActualUserRegister);
    }

}
