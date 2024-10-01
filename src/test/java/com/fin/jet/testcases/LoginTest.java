package com.fin.jet.testcases;

import com.fin.jet.screens.HomeScreen;
import com.fin.jet.screens.LoginScreen;
import com.fin.jet.screens.MasterScreen;
import com.fin.jet.screens.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    MasterScreen masterScreen;
    @Test(priority = 0)
    public void loginSuccess() {
        masterScreen=screen.getInstance(LoginScreen.class)
                .fillUserID("test")
                .fillPassword("test")
                .tapLoginBtn();
        Assert.assertTrue(masterScreen.hasTransferBtn());

    }




}
