package com.fin.jet.testcases;

import com.fin.jet.screens.HomeScreen;
import com.fin.jet.screens.LoginScreen;
import com.fin.jet.screens.MasterScreen;
import com.fin.jet.screens.SinUpScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinUpTest extends BaseTest{

SinUpScreen sinUpScreen;
    @Test
    public void sinUpShouldSuccess(){
        try {
            Date dateOfBirth = new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-01");
            sinUpScreen =screen.getInstance(HomeScreen.class)
                    .tapSinUpLink()
                    .tapGetStartBtn()
                    .fillUserId("xzcxzv")
                    .fillAccountNo("cxvcv")
                    .fillAccountName("xcvxcv")
                    .fillMobileNo("ihjkkkj")
                    //.fillDateOfBirth(dateOfBirth)
                    .fillNidNo("xcvv")
                    .clickAgreeBtn();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        //signUpScreen.fillDateOfBirth(dateOfBirth);



    }


}
