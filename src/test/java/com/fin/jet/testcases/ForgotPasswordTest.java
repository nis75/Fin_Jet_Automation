package com.fin.jet.testcases;

import com.fin.jet.screens.ForgotPassOptionScreen;
import com.fin.jet.screens.ForgotPasswordScreen;
import com.fin.jet.screens.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest{
    ForgotPasswordScreen forgotPassword;
    ForgotPassOptionScreen forgotPassOptionScreen;
    @Test
    public void tapForgotPass(){

        forgotPassword =screen.getInstance(LoginScreen.class).
        tapForgotPasswordBtn();
              //  .tapBackBtn()   ;
        Assert.assertTrue(forgotPassword.hasByMobileNumber());
        Assert.assertTrue(forgotPassword.hasByUserID());

    }


}
