package com.fin.jet.testcases;

import com.fin.jet.screens.FundTransferMfsBkashScreen;
import com.fin.jet.screens.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FundTransferMfsBkashTest extends BaseTest{
    FundTransferMfsBkashScreen fundTransferMfsBkashScreen;
    @Test
public void fundTransferMfsBkashSuccessfully(){
    fundTransferMfsBkashScreen=screen.getInstance(LoginScreen.class)
            .fillUserID("test")
            .fillPassword("test")
            .tapLoginBtn()
            .tapTransferBtn()
            .tapMfsBtn()
            .tapSourceAccountMfsBkashBtn()
            .selectSourceAccountMfsBkashDdl()
            .tapDestinationAccountMfsBkashBtn()
            .selectDestinationAccountMfsBkashDdl()
            .enterTransAmountMfsBkash("1000")
            .enterPhoneNoMfsBkash("01723339875")
            .enterDescriptionMfsBkash("fund transfer to bkash")
            .tapFundTransferMfsBkashNextBtn()
            .tapSMSMfsBkashBtn()
            .enterOTPMfsBkash1(1)
            .enterOTPMfsBkash2(2)
            .enterOTPMfsBkash3(3)
            .enterOTPMfsBkash4(4)
            .enterOTPMfsBkash5(5)
            .enterOTPMfsBkash6(6)
            .tapSubmitMfsBkashBtn();
        Assert.assertTrue(fundTransferMfsBkashScreen.hasFundTransferSuccessfullyDoneMsg());

}

}
