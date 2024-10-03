package com.fin.jet.testcases;

import com.fin.jet.screens.ForgotPassOptionScreen;
import com.fin.jet.screens.ForgotPasswordScreen;
import com.fin.jet.screens.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPassOptionTest extends BaseTest{
     ForgotPasswordScreen forgotPasswordScreen;
     ForgotPassOptionScreen forgotPassOptionTest;
     LoginScreen loginScreen;
    @Test(priority =1)
    public void fillUserIDInfo(){
        loginScreen=screen.getInstance(ForgotPassOptionScreen.class)
                .fillUserID("samman")
                .fillAccountNumber("123123")
                .fillMobileNumber("0198187987")
                .tapNextBtn();
        //Assert.assertTrue(forgotPassOptionTest.hasUserID());
        Assert.assertTrue(loginScreen.hasForgotPasswordBtn());

        Assert.assertTrue(forgotPassOptionTest.hasUserID());

    }
    @Test(priority = 0)
    public void tapByUserID() {
        forgotPasswordScreen = screen.getInstance(LoginScreen.class)
                .tapForgotPasswordBtn();
        forgotPassOptionTest = screen.getInstance(ForgotPasswordScreen.class)
                .tapByUserId();
        Assert.assertTrue(forgotPassOptionTest.hasUserID());
    }
    @Test(priority = 2)
    public void tapByMobileNumber(){
        forgotPasswordScreen=screen.getInstance(LoginScreen.class)
                .tapForgotPasswordBtn();
        forgotPassOptionTest  =screen.getInstance(ForgotPasswordScreen.class)
                        .tapMobileNumber();

        Assert.assertTrue(forgotPassOptionTest.hasUserID());


    }

    @Test(priority = 3)
    public void fillInformation(){
        loginScreen=screen.getInstance(ForgotPassOptionScreen.class)
                .fillUserID("samman")
                .fillAccountNumber("123123")
                .fillMobileNumber("0198187987")
                .tapNextBtn();
        //Assert.assertTrue(forgotPassOptionTest.hasUserID());
        Assert.assertTrue(loginScreen.hasForgotPasswordBtn());


    }
}
